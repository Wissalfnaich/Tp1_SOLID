package com.directi.training.ocp.exercise;

import java.util.ArrayList;
import java.util.List;

public class TimeSlotResource implements Resource {
    private static final List<Integer> freeTimeSlots = new ArrayList<>();
    private static final List<Integer> busyTimeSlots = new ArrayList<>();

    static {
        // Simulation d'une base de données des créneaux disponibles
        for (int i = 1; i <= 10; i++) {
            freeTimeSlots.add(i);
        }
    }

    @Override
    public int allocate() {
        if (freeTimeSlots.isEmpty()) {
            throw new IllegalStateException("No free time slots available.");
        }
        int resourceId = freeTimeSlots.remove(0); // get the first free slot
        busyTimeSlots.add(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        if (busyTimeSlots.remove(Integer.valueOf(resourceId))) {
            freeTimeSlots.add(resourceId);
        } else {
            throw new IllegalArgumentException("Trying to free a slot that is not marked as busy.");
        }
    }

    private int findFreeTimeSlot() {
        return freeTimeSlots.isEmpty() ? 0 : freeTimeSlots.get(0);
    }

    private void markTimeSlotBusy(int resourceId) {
        busyTimeSlots.add(resourceId);
    }

    private void markTimeSlotFree(int resourceId) {
        busyTimeSlots.remove(Integer.valueOf(resourceId));
        freeTimeSlots.add(resourceId);
    }
}

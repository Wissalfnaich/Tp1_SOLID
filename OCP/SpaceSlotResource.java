package com.directi.training.ocp.exercise;
import java.util.ArrayList;
import java.util.List;
public class SpaceSlotResource implements Resource {
    private static final List<Integer> freeSpaceSlots = new ArrayList<>();
    private static final List<Integer> busySpaceSlots = new ArrayList<>();

    static {
        // Simulation d'une base de données des emplacements disponibles
        for (int i = 1; i <= 10; i++) {
            freeSpaceSlots.add(i);
        }
    }

    @Override
    public int allocate() {
        if (freeSpaceSlots.isEmpty()) {
            throw new IllegalStateException("No free space slots available.");
        }
        int resourceId = freeSpaceSlots.remove(0); // get the first free slot
        busySpaceSlots.add(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        if (busySpaceSlots.remove(Integer.valueOf(resourceId))) {
            freeSpaceSlots.add(resourceId);
        } else {
            throw new IllegalArgumentException("Trying to free a slot that is not marked as busy.");
        }
    }

    private int findFreeSpaceSlot() {
        return freeSpaceSlots.isEmpty() ? 0 : freeSpaceSlots.get(0);
    }

    private void markSpaceSlotBusy(int resourceId) {
        busySpaceSlots.add(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) {
        busySpaceSlots.remove(Integer.valueOf(resourceId));
        freeSpaceSlots.add(resourceId);
    }
}

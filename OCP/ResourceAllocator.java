package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    public int allocate(Resource resource) {
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId) {
        resource.free(resourceId);
    }
}

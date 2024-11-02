public class Main
{
	public static void main(String[] args)
	{
    	ResourceAllocator allocator = new ResourceAllocator();

    	// Allocating a time slot resource
    	Resource timeSlotResource = new TimeSlotResource();
    	int timeSlotId = allocator.allocate(timeSlotResource);
    	allocator.free(timeSlotResource, timeSlotId);

    	// Allocating a space slot resource
    	Resource spaceSlotResource = new SpaceSlotResource();
    	int spaceSlotId = allocator.allocate(spaceSlotResource);
    	allocator.free(spaceSlotResource, spaceSlotId);
	}
}

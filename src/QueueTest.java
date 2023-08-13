public class QueueTest {
    public static void main(String[] args) {
//        run0();
//        run1();
        run2();
    }
    public static void run0() {
        System.out.println("run0");
        int capacity = 10;
        Queue queue = new Queue(capacity);

        queue.push("One");
        System.out.println("Popped value: " + queue.pop());

        queue.push("One");
        System.out.println("Size: " + queue.size());
        queue.showElements();

        queue.push("two");
        queue.showElements();
        System.out.println("Size: " + queue.size());
        System.out.println("Popped value: " + queue.pop());
        System.out.println("Size: " + queue.size());
        queue.showElements();
    }

    public static void run1() {
        System.out.println("run1");
        int size = 10;
        Queue queue = new Queue(size);

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());

        System.out.println();

        for (int i = 0; i <= size; i++) {
            System.out.println(queue.push("" + i));
        }

        System.out.println();

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());
        queue.showElements();

        queue.clear();

        System.out.println();

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());
        queue.showElements();

    }

    public static void run2() {
        int capacity = 10;
        Queue queue = new Queue(capacity);
        for (int i = 0; i <= capacity; i++) {
            System.out.println(queue.push("" + i));
        }

        System.out.println();

        for (int i = 0; i <= capacity; i++) {
            System.out.println("Popped value: " + queue.pop());
        }

        System.out.println();

        String poppedValue;
        while((poppedValue = queue.pop()) != null)
            System.out.println("Popped value: " + poppedValue);
    }
}

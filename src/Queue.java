import java.util.Arrays;

public class Queue {
    private final int capacity;
    boolean full = false;
    boolean empty = true;

    String[] array;
    int head = 0;
    int tail = 0;

    public Queue(int capacity) {
        this.capacity = capacity;
        array = new String[capacity];
    }

    public boolean push(String newElement){
        if(!full){
            array[tail] = newElement;
            tail++;
            if (empty)
                empty = false;
            if (tail == capacity)
                full = true;
            return true;
        }
        else
            return false;
    }
    public String pop(){
        String upItem = null;
        if(!empty){
            upItem = array[head];
            array[head] = null;
            head++;
            if(head == tail){
                empty = true;
                //full = false;
            }
            if(head == 0)
                //empty = true;
                full = false;
        }
        return upItem;
    }
    public void clear() {
        Arrays.fill(array, null);
        head = 0;
        tail = 0;
        empty = true;
        full = false;
    }
    // Stack status operations
    // Is stack empty?
    public boolean isEmpty() {
        return empty;
    }

    // Is stack full?
    public boolean isFull() {
        return full;
    }
    // How many elements in stack?****************************************
    public int size() {
        if(empty){
            return 0;
        }
        else if (full) {
            return capacity;
        }
        else{
            return tail - head;
        }
    }

    // Capacity of stack?
    public int getCapacity() {
        return capacity;
    }

    public void showElements() {
        System.out.println("\n*** Elements in the Queue ***");
        if (!empty)
            for (String s : array) {
                if (s != null)
                    System.out.println(s);
            }
        else
            System.out.println("Nothing in the Queue!");
        System.out.println();
    }
}

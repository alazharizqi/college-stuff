package practicum2;

public class QueuePassengers {

    public int max, size, front, rear;
    public Passengers [] Q;

    public QueuePassengers(int n) {
        max = n;
        create();
    }

    public void create() {
        Q = new Passengers[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("The first element : " + Q[front].name + " " + Q[front].cityOrigin + " " + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Last element: " + Q[rear].name + " " + Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("The first element : " + Q[front].name + " " + Q[front].cityOrigin + " " + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
                i = (i+1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void Enqueue(Passengers data) {
        if (isFull()) {
            System.out.println("Queue is already full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public Passengers Dequeue() {
        Passengers data = new Passengers("", "", "", 0, 0);
        if (isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = Q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    
}

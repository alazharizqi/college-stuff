package practicum1;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue queue = new Queue(5);

        queue.Enqueue(1);
        queue.print();

    //     System.out.print("Insert maximum queue : ");
    //     int n = sc.nextInt();
    //     Queue Q = new Queue(n);

    //     int choose;
    //     do {
    //         menu();
    //         choose = sc.nextInt();
    //         switch (choose) {
    //             case 1:
    //                 System.out.print("Insert new data : ");
    //                 int newData = sc.nextInt();
    //                 Q.Enqueue(newData);
    //                 break;
    //             case 2:
    //                 int removeData = Q.Dequeue();
    //                 if (removeData != 0) {
    //                     System.out.print("Data removed : " + removeData);
    //                     break;
    //                 }
    //             case 3:
    //                 Q.print();
    //                 break;
    //             case 4:
    //                 Q.peek();
    //                 break;
    //             case 5:
    //                 Q.clear();
    //                 break;
    //             default:
    //                 break;
    //         }
    //     } while (choose <= 5 && choose >= 1);

    //     sc.close();
    }

    public static void menu() {
        System.out.println("Choose Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("====================");
    }
}

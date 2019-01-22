import LinkedList.*;

public class RunLinkedList {
    public static void main(String arg[]) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.prepend(9);
        System.out.println(list);
        //list.deleteWithValue(20);
        //list.deleteWithValue(9);
        list.insertAtIndex(0, 8);
        System.out.println("8 at 0th " + list);
        list.insertAtIndex(3, 11);
        System.out.println("11 at 3rd " + list);
        list.insertAtIndex(7, 45);
        System.out.println("45 at 7th " + list);
        list.insertAtIndex(9, 55);
        System.out.println("55 at 9th " + list);
        list.deleteAtIndex(0);
        System.out.println("8 at 0th " + list);
        list.deleteAtIndex(3);
        System.out.println("11 at 3rd " + list);
        list.deleteAtIndex(7);
        System.out.println("45 at 7th " + list);
        list.deleteAtIndex(9);
        System.out.println("55 at 9th " + list);

    }
}
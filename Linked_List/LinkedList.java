import java.util.Scanner;

public class LinkedList {

  // Make one scanner for all user input throughout
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    class Node {
      Node next = null;
      int value;

      public Node(int val) {
        value = val;
      }

      void append(int val) {
        // Create a new tail node
        Node tail = new Node(val);
        Node node = this;
        // Loop to the end
        while (node.next != null) {
          node = node.next;
        }
        // At the last node, add the tail
        node.next = tail;
      }
    }

    System.out.println("Hello");
    Node list = new Node(10);
    list.next = new Node(20);
    list.next.next = new Node(30);
    Node node = list;

    int input = scanner.nextInt();

    while (input >= 0) {
      list.append(input);
      input = input - 1;
    }
    while (node.next != null) {
      System.out.println("Node value: " + node.value);
      node = node.next;
    }

  }

}

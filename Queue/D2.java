import java.util.*;
public class Day2 {
public static void main(String[] args) {
    Queue<Integer> pq = new LinkedList<>();
    pq.add(3);
    pq.add(456);
    pq.add(26);
    System.out.println(pq);
    System.out.println("poll :" + pq.poll());
    System.out.println("peek: " + pq.peek());
    System.out.println(pq);


    Queue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());

    pr.add(60);
    pr.add(10);
    pr.add(26);
    pr.add(44);
    System.out.println(pr);
    Iterator<Integer> it = pr.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
    }
    System.out.println();
    System.out.println("poll :" + pr.poll());
    System.out.println(pr);




    Deque<Integer> dq = new ArrayDeque<>();

    dq.add(9);
    dq.add(6);
    dq.add(1);
    dq.add(26);
    dq.add(11);
    System.out.println(dq);
dq.addFirst(700);
dq.addLast(800);
    System.out.println(dq);

    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());
    System.out.println(dq);
}

}

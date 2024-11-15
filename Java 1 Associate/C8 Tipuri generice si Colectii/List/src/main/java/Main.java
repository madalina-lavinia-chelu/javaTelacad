import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> myList = List.of(1, 7 , 9, 3);

        LinkedList<Integer> myLinkedList = new LinkedList<>(myList);

        //add new values
        myLinkedList.add(100);
        myLinkedList.addLast(500);
        myLinkedList.addFirst(-500);
        System.out.println("adugare la inceput si final " + myLinkedList);

        //remove
        myLinkedList.removeFirst();
        myLinkedList.removeLast();  // similar cu remove()
        System.out.println("stergere primul si ultimul termen " + myLinkedList);

        //get
        System.out.println("primul termen " + myLinkedList.getFirst());
        System.out.println("ultimul termen " + myLinkedList.getLast());
        System.out.println("termenul de pe prima pozitie " + myLinkedList.get(0));

        //peek -> preia valoarea
        System.out.println("primul termen " + myLinkedList.peek());
        System.out.println("primul termen " + myLinkedList.peekFirst());
        System.out.println("ultimul termen " + myLinkedList.peekLast());

        /*
            poll -> preia valoarea si il elimina
            poll() este metoda standard utilizată în cadrul interfeței Queue, deoarece se conformează regulilor
            unei cozi (queue), unde se obține și se elimină doar elementul din frunte

        */
        System.out.println("preia si sterge primul termen (poll)" + myLinkedList.poll());
        //System.out.println("preia si sterge primul termen " + myLinkedList.pollFirst()); // poll si pollFirst sunt similare
        System.out.println("preia si elimina ultimul termen  " + myLinkedList.pollLast());
        System.out.println("lista actualizata " + myLinkedList);

        System.out.println("elimina primul termen si il afiseaza (pop) " + myLinkedList.pop());
        System.out.println("lista actualizata " + myLinkedList);



    }
}

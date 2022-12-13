public class App {
    public static void main (String [] args){
        Deque<String> deque = new Deque<String>();
        try{
            deque.addFirst("Zezin");
            deque.addFirst("Jubscreusa");
            deque.addFirst("Joaquina");
            deque.addLast("Joelson");
            deque.addLast("Kibiano");

            System.out.println("Antes da exclusão!");
            deque.printDeque();
            System.out.println("=========================");

            deque.removeFirst();
            deque.removeLast();
            deque.printDeque();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

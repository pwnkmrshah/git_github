
package List;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new  LinkedList();
        list.insert(515);
        list.insert(150);
        list.insert(105);
        list.insertAtStart(25);
        list.insertAt(0, 32);
        list.deleteAt(2);

        
        list.show();
    }

   
}

package linkedLists;

public class LLmain {
    
    public static void main(String[] args) {

        SLLExample();
        
        return;
    }

    public static void SLLExample(){
        
        SLL lxd = new SLL();
        lxd.insertAtFirst(7);
        lxd.insertAtFirst(6);
        lxd.insertAtFirst(5);
        lxd.insertAtFirst(4);
        lxd.insertAtFirst(3); //index 2
        lxd.insertAtFirst(2); //index 1
        lxd.insertAtFirst(1); //index 0

        lxd.displayList();
        //lxd.insertNodeAtIndex(5, 4);
        System.out.println(lxd.deleteLast()); 
        lxd.displayList();
        return;
    }

}

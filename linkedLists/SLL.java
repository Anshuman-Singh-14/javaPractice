package linkedLists;

public class SLL {
    

    // attributes of ll
    private int size;
    private Node head;
    private Node tail;

    // constructor for ll
    public SLL(){
        this.size = 0;
    }


    // defining Node class
    private class Node {

        private int value;
        private Node next;

        //constructors for Node class
        public Node(){

        }

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        

    }



    //function to insert node at first position and set it to head
    public void insertAtFirst(int val){

        Node node = new Node(val);
        //making current node point to the head node as of now
        node.next = head;
        //making the current node the head node
        head = node;


        if (tail == null) {
            //if tail node is null -> first node was just created and hence set tail also to current node
            tail = head;
        }

        //increase size of LL object by 1;
        size++;
        return;
    }



    //function to insert node at tail and update the tail to new node;
    public void insertAtLast(int val){

        //first check if LL is empty 
        //if it is, then call the insertFirst() function;
        if (tail == null) {
            insertAtFirst(val);
            //return to end usage here otherwise it will also run the below written code;
            //this can also be done by putting below code in an else block, but this makes it neater;
            return;
        }


        Node node = new Node(val);
        //making current tail point to new node and then update tail to current node;
        tail.next = node;
        tail = node;
        size++;
        return;
    }





    //function to insert new node at an arbitrary index
    public void insertNodeAtIndex(int val, int index){

        if (index >=0 && index <= size ){

            if (index == 0) {
                insertAtFirst(val);
                return;

            } else if (index == size) {
                insertAtLast(val);
                return;

            } else{
                Node temp = new Node(val);
                Node node = new Node();
                node = head;
                //take care to put an index-- to make sure that the node is inserted at the correct index
                //if i want it at the 3rd position, then i need to do a node.next 2 times
                //this is because the index which the user has given (3), corresponds to the index 2 of the LL as it  starts from 0;
                for (int i = 0; i < index-1; i++){
                    node = node.next;
                }
                temp.next = node.next;
                node.next = temp;
                return;
            }
            
            // */


        } else {
            System.out.println("Enter valid index!!");
            return;
        }
    }



    //function to print the values of the linked list;
    public void displayList(){
        
        //instantiate a temp node structure to iterate over ll and make it point to head;
        Node temp;
        temp = head;

        //loop runs upto the last node and then temp becomes the null obj;
        while (temp != null) {

            System.out.print(temp.value);
            System.out.print("  ->  ");
            temp = temp.next;
        
        } //while loop ends when temp BECOMES null itself so we can print it;
        System.out.println(temp);
        //System.out.println("End-of-LL");
    }


    

}

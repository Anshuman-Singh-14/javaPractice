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
        //checks if index is between 0 and the size of list;
        if (index >=0 && index <= size ){

            if (index == 0) {
                insertAtFirst(val);
                return;

            } else if (index == size) {
                insertAtLast(val);
                return;

            } else{

                Node node = head;
                //take care to put an index-- to make sure that the node is inserted at the correct index
                //if i want it at the 3rd position, then i need to do a node.next 2 times
                //this is because the index which the user has given (3), corresponds to the index 2 of the LL as it  starts from 0;
                index--;
                for (int i = 0; i < index; i++){
                    node = node.next;
                    //stops at one node before insertion
                }
                //create new temporary node with required input value and make it point to the current nodes next address;
                Node temp = new Node(val, node.next);

                //setting the current node's next pointer to the newly created temporary node;
                node.next = temp;
                
                size++;
                return;
            }
            
            // */


        } else {
            System.out.println("Enter valid index!!");
            return;
        }
    }



    //function to delete the first node of the LL
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }


    //function to delete the tail node
    public int deleteLast(){
        
        if (size <= 1){
            return deleteFirst();
        }


        Node secondLast = getIndex(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        
        return val;
    }

    //function to get a node pointer to the required node at the input index
    public Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
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

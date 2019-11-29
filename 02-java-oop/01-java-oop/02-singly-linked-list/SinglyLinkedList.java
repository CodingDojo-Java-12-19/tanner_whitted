public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    private boolean IsEmpty() {
        return this.head == null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public Integer remove() {
        Node runner = head;
        int valToReturn;

        // if we have 0 nodes return null
        if(IsEmpty())
            return null;

        // if we have just one node, remove head
        if(head.next == null) {
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }

        // otherwise, loop til we are right before the last node
        while(runner.next.next != null) {
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
        
    }
    public void printValues() {
        if(IsEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node runner = this.head;
        while(runner.next != null) {
            System.out.println("$$$$$$$$$$$$$$$$");
            String s = String.format("Node Value: %s :: Nexint Value: %s", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$$$$$$$$$$$$");
        String s = String.format("Node Value: %s :: Nexint Value: null", runner.value);
        System.out.println(s);
    }
}
public class LL {
    Node head;
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //insertig element at first pos
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode ;
    }
    //insertion at end
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data);
            currNode=currNode.next;
        }


    }
    //deletion at first
    public void delFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
    }
    //deletion at lasst
    public void delLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public void reversingList(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("name ");
        list.addFirst("my ");

        list.addLast("is ");
        list.addLast("sarthak");
        list.printList();
        list.reversingList();
        list.printList();
        //list.delLast();
        //list.delFirst();
        //list.printList();
    }
}



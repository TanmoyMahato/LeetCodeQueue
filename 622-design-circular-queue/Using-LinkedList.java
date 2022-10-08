//Implementation using LinkedList
class MyCircularQueue {
    
    class ListNode{
        int val;
        ListNode next;
        
        public ListNode(int data){
            val = data;
            next = null;           
        }

    }
    
    ListNode head;
    ListNode tail;
    int llsize;
    int qsize;
    
    public MyCircularQueue(int k) {
        qsize = k;
        head = tail = null;
        llsize = 0;
    }
    
    public boolean enQueue(int value) {
        //if(queue is full)
        if(isFull()){
            return false;
        }
        
        ListNode node = new ListNode(value);
        //if(1st element)
        if(isEmpty()){
            head = tail = node;
            llsize++;
            return true;
        }
        
        //add element in last
        else{
            tail.next = node;
            tail = tail.next;
            llsize++;
            return true;
        }
        
    }
    
    public boolean deQueue() {
        //if(queue is empty)
        if(isEmpty()){
            return false;
        }
        
        //else if(only one element)
        else if(head == tail){
            head = tail = null;
            llsize--;
            return true;
        }
        
        //else delete element
        else{
            head = head.next;
            llsize--;
            return true;
        }
    }
    
    public int Front() {
        //if(queue is empty)
        if(isEmpty()){
            return -1;
        }
        
        //else return 1st element
        else{
            return head.val;
        }
    }
    
    public int Rear() {
        //if(queue is empty)
        if(isEmpty()){
            return -1;
        }
        
        //else return 1st element
        else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        return llsize==0; 
    }
    
    public boolean isFull() {
        return llsize==qsize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
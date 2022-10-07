//Implementation using Array
class MyCircularQueue {
    
    int q[];
    int size, front, rear;

    public MyCircularQueue(int k) {
        q = new int[k];
        size = k;
        front = rear = -1;
    }
    
    public boolean enQueue(int value) {
        //if(queue is empty)
        if(isEmpty()){
            front = rear = 0;
            q[rear] = value;
            return true;
        }
        
        //else if(queue is full)
        else if(isFull()){
            return false;
        }
        
        //else add element
        else{
            rear = (rear+1)%size;
            q[rear] = value;
            return true;
        }
    }
    
    public boolean deQueue() {
        //if(queue is empty)
        if(isEmpty()){
            return false;
        }
        
        //else if(only one element)
        else if(front == rear){
            front = rear = -1;
            return true;
        }
        
        //else delete element
        else{
            front = (front+1)%size;
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
            return q[front];
        }
    }
    
    public int Rear() {
        //if(queue is empty)
        if(isEmpty()){
            return -1;
        }
        
        //else return 1st element
        else{
            return q[rear];
        }
    }
    
    public boolean isEmpty() {
        return front==-1; 
    }
    
    public boolean isFull() {
        return ((rear+1)%size == front);
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
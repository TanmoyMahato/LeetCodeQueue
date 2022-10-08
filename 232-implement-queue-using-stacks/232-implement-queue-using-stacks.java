//Push O(n) && Pop O(1)
class MyQueue {
    
    Stack<Integer> stk1;
    Stack<Integer> stk2;

    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    
    
    public void push(int x) { //operation in O(n)
        //if(queue is empty)
        if(empty()){
            stk1.push(x);
        }
        
        //add element
        else{
            while(!empty()) //move elements from 1st stack to 2nd
                stk2.push(stk1.pop()); 
            
            stk1.push(x); //push x in queue
            
            while(!stk2.isEmpty()) //move elements from 2nd stack to 1st
                stk1.push(stk2.pop());
        }
    }
    
    
    
    public int pop() { //operation in O(1)
        return stk1.pop();
    }
    
    
    
    public int peek() {
        return stk1.peek();
    }
    
    
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
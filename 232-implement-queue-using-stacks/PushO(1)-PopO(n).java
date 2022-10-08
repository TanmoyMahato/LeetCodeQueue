//Push O(1) && Pop O(n)
class MyQueue {
    
    Stack<Integer> stk1;
    Stack<Integer> stk2;

    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    
    
    public void push(int x) { //operation in O(1)
        stk1.push(x);
    }
    
    
    
    public int pop() { //operation in O(n)
        
        while(!empty()) //move elements from 1st stack to 2nd
            stk2.push(stk1.pop()); 
        
        int pop = stk2.pop(); //delete x in queue
        
        while(!stk2.isEmpty()) //move elements from 2nd stack to 1st
            stk1.push(stk2.pop());
        
        return pop;
    }
    
    
    
    public int peek() {
        while(!empty()) //move elements from 1st stack to 2nd
            stk2.push(stk1.pop());
        
        int peek = stk2.peek();   
        
        while(!stk2.isEmpty()) //move elements from 2nd stack to 1st
            stk1.push(stk2.pop());
        
        return peek;
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
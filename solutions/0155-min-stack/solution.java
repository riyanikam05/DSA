class MinStack {
    private Deque <Integer> stack;
    private Deque <Integer> minStack;
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty()) {
            minStack.push(value);    //the min value i.e. null in minStack
        }
        else {
            minStack.push(Math.min(value, minStack.peek()));   //min of stack value & top of minStack in minStack
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();    //top of stack contains the top/last value of input
    }
    
    public int getMin() {
        return minStack.peek();   //top of minStack contains the minimum value
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

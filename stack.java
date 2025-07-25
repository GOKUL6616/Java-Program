class MyStack {
    int top;
    int[] arr;
    int size;
    MyStack(int n) {
        size = n;
        arr = new int[size];
        top = -1;
    }
    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = val;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        return arr[top];
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        MyStack s = new MyStack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40); // Overflow
        System.out.println(s.pop()); // 30
        System.out.println(s.pop()); // 20
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop()); // 10
        System.out.println(s.pop()); // Underflow
    }
}
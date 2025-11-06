// package DAY - 4;
class MinStack {
    int[] stack;
    int[] stmin;
    int tops;
    int topm;

    public MinStack() {
        stack = new int[100];
        stmin = new int[100];
        tops = -1;
        topm = -1;
    }

    public void push(int val) {
        stack[++tops] = val;
        if (topm == -1) {
            stmin[++topm] = val;
        } else {
            stmin[++topm] = Math.min(val, stmin[topm - 1]);
        }
    }

    public void pop() {
        tops--;
        topm--;
    }

    public int top() {
        return stack[tops];
    }

    public int getMin() {
        return stmin[topm];
    }
}

public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}

class CustomStack {

    int[] stack;
    int[] inc;
    int index;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        inc = new int[maxSize];
        index = -1;
    }

    public void push(int x) {
        if(index == maxSize - 1) {
            return;
        }

        index++;
        stack[index] = x;
    }

    public int pop() {
        if(index == -1) {
            return -1;
        }

        int value = stack[index] + inc[index];

        if(index > 0) {
            inc[index - 1] += inc[index];
        }

        inc[index] = 0;
        index--;

        return value;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, index + 1);

        if(limit > 0) {
            inc[limit - 1] += val;
        }
    }
}
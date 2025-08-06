class CustomStack {
    int arr[];
    int i=0;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(i<arr.length)
        arr[i++]=x;
    }
    
    public int pop() {
        if(i>0){
            return arr[--i];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int j=0;j<k && j<arr.length;j++){
            arr[j]=arr[j]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
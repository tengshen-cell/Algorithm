public class Array {
    public int[] data;
    private final int n;
    private int count;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    // 根据索引，找到数据中的元素并返回
    public int find(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        return data[index];
    }

    public void insert(int index, int value) {
        if (count == n) {
            System.out.println("没有可插入的位置");
            return;
        }

        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return;
        }

        System.arraycopy(data, index, data, index + 1, count - index);
        data[index] = value;
        ++count;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        }

        for (int i = index + 1; i < count; ++i) {
            data[i - 1] = data[i];
        }

        --count;
        return true;
    }
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        array.printAll();
    }
}

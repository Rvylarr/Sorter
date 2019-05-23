class ArraySorter {
    private long[] a;
    private int elems;

    public ArraySorter(int max) {
        a = new long[max];
        elems = 0;
    }

    public void into(long value) {
        a[elems] = value;
        elems++;
    }

    public void printer() {
        for (int i = 0; i < elems; i++) {
            System.out.print(a[i] + " ");
            System.out.print("");
        }
    }

    private void toSwap(int first, int second) {
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }

    public void bubbleSorter() {
        for (int out = elems - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if(a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArraySorter array = new ArraySorter(10);
        array.into(2);
        array.into(4);
        array.into(6);
        array.into(1);
        array.into(3);
        array.into(2);
        array.into(5);
        array.into(7);
        array.into(9);
        array.into(0);

        array.printer();
        System.out.println("Окончание вывода массива без сортировки...");
        array.bubbleSorter();
        array.printer();
        System.out.println("Окончание вывода отсортированного массива...");
    }
}

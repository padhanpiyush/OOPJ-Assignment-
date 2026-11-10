class A6a {
    public static void main(String args[]) {

        int a[] = {100, 20, 30, 10, 50};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Using Bubble Sort");
        System.out.println("Output: [");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

            if (i < a.length - 1) {
                System.out.println(",");
            }
        }

        System.out.println("]");
    }
} 
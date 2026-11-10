class A6b {
    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double avg = (double) sum / a.length;

        System.out.println("Output: The average of array element is = " + avg);
    }
}
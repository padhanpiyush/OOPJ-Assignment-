class A6e {
    public static void main(String args[]) {

        String a[] = {"Python", "Java", "C++", "SQL"};
        String b[] = {"MySQL", "SQL", "Oracle", "Java"};

        String c[] = new String[a.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    c[k] = a[i];
                    k++;
                }
            }
        }

        System.out.println("Output:");
        System.out.println("Common element:[");

        for (int i = 0; i < k; i++) {
            System.out.println(c[i]);

            if (i < k - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}
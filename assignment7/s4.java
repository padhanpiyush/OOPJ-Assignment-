class Interest {


    void SI(double principal, int time) {
        double rate = 5;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    
    void SI(int rate, int time) {
        double principal = 10000;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String args[]) {

        Interest obj = new Interest();

        obj.SI(60000.0,3);
        obj.SI(10,4);
    }
}
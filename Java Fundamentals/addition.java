class Main {

    // simple java program
    public int addNumbers(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {

        int a = 25;
        int b = 15;
        Main obj = new Main();
        int result = obj.addNumbers(a, b);
        System.out.println("Sum is: " + result);
    }
}
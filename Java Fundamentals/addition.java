class Main {

    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {

        int a = 25;
        int b = 15;

        // create an object of Main
        Main obj = new Main();
        // calling method
        int result = obj.addNumbers(a, b);
        System.out.println("Sum is: " + result);
    }
}
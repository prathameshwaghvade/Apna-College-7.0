public class AccesModifiers {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.username = "Prathamesh"; // public accessible
        obj.setPassword("ghgds");

        System.out.println(obj.username);
        
    }
}

    class BankAccount{
       public String username;
        private String password;

        public void setPassword(String pass){
            pass = password;

        }

}
    


public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String e:validEmail
             ) {
            boolean isValid = emailExample.validate(e);
            System.out.println("Email "+e+" is valid? "+ isValid);
        }
        for (String e:invalidEmail
             ) {
            boolean isValid = emailExample.validate(e);
            System.out.println("Email "+e+" is valid? "+ isValid);
        }
    }

}

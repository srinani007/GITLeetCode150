public class EmailParser {
    public static void main(String[] args){
        String email = "Kvsprasanth007@com.gmail.com";

        //Extract Username
        String username = email.substring(0, email.indexOf("@"));

        //Extract Domain name 
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        domain = domain.contains(".") ? domain.substring(domain.lastIndexOf(".") + 1) : domain;

        //Extract Top-Level Domain (TLD)
        String tld = email.substring(email.lastIndexOf(".") + 1);

        // Output results
        System.out.println("Full Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Domain Name: " + domain);
        System.out.println("Top-Level Domain (TLD): " + tld);
    }
}

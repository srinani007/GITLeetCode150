public class UELParser {
    public static void main(String[] args){
        String url = "https://www.example.com/products/shoes?size=10&color=red";

        String protocol = url.substring(0, url.indexOf(":"));

        String domain = url.substring(url.indexOf("//") + 2, url.indexOf("/", url.indexOf("//") + 2));

        String path = url.substring(url.indexOf("/", url.indexOf("//") + 2), url.contains("?") ? url.indexOf("?") : url.length());

        // Extract Query Parameters
        String queryParams = url.contains("?") ? url.substring(url.indexOf("?") + 1) : "No Query Params";

         // Output results
         System.out.println("Full URL: " + url);
         System.out.println("Protocol: " + protocol);
         System.out.println("Domain Name: " + domain);
         System.out.println("Path: " + path);
         System.out.println("Query Parameters: " + queryParams);

    }
}

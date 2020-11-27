public class Act13a {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
       
        JavascriptExecutor js = (JavascriptExecutor)driver;

       
        driver.get("https://www.training-support.net");

        String DomainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site: " + DomainName);

        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site: " + url);

        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page: " + TitleName);

        driver.close();
    }
}
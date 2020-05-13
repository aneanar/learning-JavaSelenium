package Day7;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
//        EMI_Driver e = new EMI_Driver();
//        e.launchSite("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
//        System.out.println("EMI is : "+ e.emiCalculation("1000","7","8"));
//        e.tearDown();

        Bing_driver b = new Bing_driver();
        b.launchSite("https://www.bing.com/");
        b.selectValue("Corona");

        b.tearDown();
        System.exit(0);

    }
}

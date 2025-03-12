package flipkart.config;

public class BrowserStackConfig {
    public static final String USERNAME = "your_browserstack_username";
    public static final String ACCESS_KEY = "your_browserstack_access_key";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final String AUTOMATE_KEY = "your_automate_key";
    public static final boolean LOCAL_TESTING = false; // Set true if testing local application
}

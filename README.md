    mvn compile exec:java -D exec.mainClass="org.example.App"

### Set headless
    playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
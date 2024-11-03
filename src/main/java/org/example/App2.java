package org.example;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(createLaunchOptions());
            Page page = browser.newPage();
            page.navigate("https://playwright.dev/");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
        }
    }

    private static BrowserType.LaunchOptions createLaunchOptions() {
        return new BrowserType.LaunchOptions()
                .setHeadless(true)
                .setSlowMo(50)
                .setArgs(Arrays.asList(new String[]{"--disable-gpu", "--no-sandbox"})); // Additional arguments
    }
}

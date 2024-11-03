package org.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

public class FirstPlayWrightTest {
    @Test
    public void firstTest() {
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

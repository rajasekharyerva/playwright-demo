package org.example;

import com.microsoft.playwright.*;
import org.junit.Test;

import java.util.Arrays;

public class SampleTest {
    @Test
    public void sampleTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(createLaunchOptions());
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
    }

    private static BrowserType.LaunchOptions createLaunchOptions() {
        return new BrowserType.LaunchOptions()
                .setHeadless(true)
                .setSlowMo(50)
                .setArgs(Arrays.asList(new String[]{"--disable-gpu", "--no-sandbox"})); // Additional arguments
    }
}
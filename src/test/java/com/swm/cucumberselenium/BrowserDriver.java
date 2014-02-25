package com.swm.cucumberselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserDriver {

    private static WebDriver driver;

    public synchronized static WebDriver getCurrentDriver() {
        if (driver == null) {
            try {
                driver = new FirefoxDriver(new FirefoxProfile());
            } finally {
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return driver;
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }

        public static void close() {
            try {
                getCurrentDriver().quit();
                driver = null;
            } catch (UnreachableBrowserException e) {
                throw new RuntimeException("cannot close browser", e);
            }
        }
    }

    public static void loadPage(String url) {
        System.out.println("navigating browser to: " + url);
        getCurrentDriver().get(url);
    }

}

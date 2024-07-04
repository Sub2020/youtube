package com.youtube;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AppTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the Microsoft WebDriver (EdgeDriver) executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\youtube\\src\\driver\\edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testYouTubeTitle() {
        driver.get("https://www.youtube.com/");
        String title = driver.getTitle();
        System.out.println(title);
        // You can also add assertions to validate the title
        assertTrue("Title should contain 'YouTube'", title.contains("YouTube"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

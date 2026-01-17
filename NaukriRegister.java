package day4;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegister {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/registration/createAccount");
        Thread.sleep(2000);

        // Click on Experienced
        driver.findElement(By.xpath("//div[@data-val='exp']")).click();
        Thread.sleep(2000);

        // Click Upload Resume button
        WebElement uploadBtn = driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]"));
        uploadBtn.click();

        Thread.sleep(2000); // wait for file dialog to open

        // -------- ROBOT CLASS --------
        Robot rb = new Robot();

        // Copy file path to clipboard
        String filePath = "C:\\Users\\AK SARKAR\\Downloads\\Koyel Sarkar_Resume QA Engineer.pdf";
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(1000);

        // ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}

package Tests;

import Pages.HomePage;
import Pages.ProductsPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static Pages.ProductsPages.formalShoes_firstshoe_verify;

public class SeleniumTest {

    public static WebDriver driver;
static ExtentReports report;

 public static ExtentTest test;

    static ExtentReports extent = new ExtentReports();


    @BeforeSuite
    public static void SetUp() throws InterruptedException{


        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

        HomePage.click_hamburger_menu();
        HomePage.click_orderProducts_link();
    }


    @Test
    void validateTitle_OnlineProducts() throws InterruptedException{

        test= extent.createTest("Validate Shoe Title on Products Page", "This test validates the different Shoetypes are correct on Online Products Page ");
        ProductsPages.formalShoes_verifyTitle();
        ProductsPages.sportsShoes_verifyTitle();
        ProductsPages.sneakersShoes_verifyTitle();
        extent.flush();
    }

    @Test
    void validateFirstFormalShoes(){
        test= extent.createTest("Validate First Formal Shoename",
                "This test validates first formal shoes on Products Page ");
        ProductsPages.formalShoes_firstshoe_verify();
    }

    @Test
    void validateFirstSportShoe(){

        test= extent.createTest("Validate First Sport Shoename",
                "This test validates first sport shoes on Products Page ");
        ProductsPages.sportsShoes_firstshoe_verify();
    }
    @AfterSuite
    public static void cleanup(){

        extent.flush();
    }
}

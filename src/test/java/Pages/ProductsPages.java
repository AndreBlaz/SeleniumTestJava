        package Pages;

        import com.aventstack.extentreports.Status;
        import org.openqa.selenium.By;
        import org.testng.Assert;

        import java.io.IOException;

        import static org.testng.Assert.assertEquals;
       import static Tests.SeleniumTest.*;
        import static Tests.SeleniumTest.driver;

        public class ProductsPages {

        public static String formalShoes_xpath="/html/body/div[2]/center/h2";

        public static String sportShoes_xpath="/html/body/div[3]/center/h2";

        public static String sneakers_xpath="/html/body/div[4]/center/h2";


        public static String formalShoesdrpdown_xpath="/html/body/div[2]/center/div/i[1]";

        public  static String sportsShoesdrpdown_xpath="/html/body/div[3]/center/div/i[1]";

        public  static String sneakersdrpdown_xpath="/html/body/div[4]/center/div/i[1]";


        public static String formalShoes_firstshoename="/html/body/div[2]/table/tbody/tr[1]/td[1]";

         public static String sportsShoes_firstshoename="/html/body/div[3]/table/tbody/tr[1]/td[1]";


        public static void formalShoes_verifyTitle ()  {
            String expectedTitleFS = "Formal Shoes";
            String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
            Assert.assertEquals(expectedTitleFS, actualTitleFS);
            if (expectedTitleFS.equals(actualTitleFS)) {
                test.log(Status.PASS, "Test passed for title verification of FormalShoes");
            } else {

                test.log(Status.FAIL, "Test fail for title verification of FormalShoes");

            }

        }


            public static void sportsShoes_verifyTitle () {
                String expectedTitleSS = "Sports Shoes";
                String actualTitleSS = driver.findElement(By.xpath(sportShoes_xpath)).getText();
                Assert.assertEquals(expectedTitleSS, actualTitleSS);
                if (expectedTitleSS.equals(actualTitleSS)) {
                    test.log(Status.PASS, "Test passed for title verification of SportShoes");
                }
            }

            public static void sneakersShoes_verifyTitle () {
                String expectedTitleSn = "Sneakers";
                String actualTitleSn = driver.findElement(By.xpath(sneakers_xpath)).getText();
                Assert.assertEquals(expectedTitleSn, actualTitleSn);
                if (expectedTitleSn.equals(actualTitleSn)) {
                    test.log(Status.PASS, "Test passed for title verification of Sneakers");
                }
            }


            public static void formalShoes_firstshoe_verify(){
            String expectedFirstFormalShoe= "   Classic Cheltenham";
             driver.findElement(By.xpath(formalShoesdrpdown_xpath)).click();
             String actualFirstFormalShoe= driver.findElement(By.xpath(formalShoes_firstshoename)).getText();
             Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe, "Page title does not match");

                if(expectedFirstFormalShoe.equals(actualFirstFormalShoe)) {
                    test.log(Status.PASS, "Test passed for first shoe name verification");
                }
            }
            public static void sportsShoes_firstshoe_verify(){
            String expectedFirstSportShoe= "   Ultimate";
            driver.findElement(By.xpath(sportsShoesdrpdown_xpath)).click();
           String actualFirstSportShoe= driver.findElement(By.xpath(sportsShoes_firstshoename)).getText();
           Assert.assertEquals(expectedFirstSportShoe, actualFirstSportShoe);

                if(expectedFirstSportShoe.equals(actualFirstSportShoe)) {
                    test.log(Status.PASS, "Test passed for first sportshoe  verification");
                }
            }
            public static void sneakers_firstshoe_verify(){

            }




            }

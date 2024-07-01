import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class socity_register1 extends base {
    @DataProvider(name = "testdata")
    public Object[][] getdata() throws IOException {
        excelreader exl = new excelreader();
        return exl.getexceldata();
    }
    @Test(priority = 1, dataProvider = "testdata")
    public void signup_with_validdata(String register_num, String nameofsocity, String comerical, String phone, String email, String Address, String shortaddress, String buildnum, String Street, String subnum, String district_name, String Postalcode, String ceoname, String ceoid, String ceophone, String ceomail, String AccountNumber, String ibanNumber, String bankname) throws InterruptedException {
        register_element1 register = new register_element1(driver);
        register.verify(register_num);
        String actual = driver.findElement(By.cssSelector("h4[class=\"text-2xl font-bold text-main mb-2\"]")).getText();
        String expected = "اختر نوع الجهة";
        Assert.assertEquals(actual, expected);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        register.page_1(nameofsocity, comerical);
        By previous = By.xpath("//div[@id=\"cdk-step-content-0-1\"]//button[@class=\"mat-stepper-previous before:bg-[#2f2e3e] bg-corner-dark-6 btn btn-secondary hover:text-white md:mb-0 md:w-auto w-full md:mini-width-corner\"]");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        boolean second_page = driver.findElement(previous).isDisplayed();
        Assert.assertTrue(second_page);
        Assert.assertEquals(second_page, true);
        register.page_2(phone, email);
        register.page_3(Address, shortaddress, buildnum, Street, subnum, district_name, Postalcode);
        register.page_4(ceoname, ceoid, ceophone, ceomail);
        register.page_5(AccountNumber, ibanNumber, bankname);
        register.page_6();
        register.page_7();
        register.verify_using_otp();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String expected_result_message = "تم ارسال طلبك الي الادارة المعنية بالطلبات ، سيتم النظر في طلبك في اقرب وقت والتواصل معك عن طريق البريد الالكتروني";
        String actual_result_message = driver.findElement(By.cssSelector("P[class=\"w-2/3 text-center\"]")).getText();
        Assert.assertTrue(actual_result_message.contains(expected_result_message));
    }
}


import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class register_element1 {
    public WebDriver driver;

    public register_element1(WebDriver driver) {

        this.driver = driver;
    }

    private By entity = By.xpath("//mat-radio-button[@id=\"mat-radio-3\"]//span[@class=\"mat-radio-label-content\"]");
    private By submit_2 = By.xpath("//li[@class=\"flex items-center\"]//span[@class=\"ml-1 mr-1 z-10\"]");
    private By verify_button = By.cssSelector("button[class=\"btn btn-green-5 w-full mb-6 bg-corner-white\"]");
    private By register_id = By.id("registerNo");

    public void verify(String register_num) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(submit_2).click();
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(entity).click();
        Thread.sleep(2000);
        driver.findElement(register_id).sendKeys(String.valueOf(register_num));
        // register_element1.scroll(200);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(verify_button).click();
    }

    private By name = By.id("name");
    private By transparency = By.id("transparency");
    private By date = By.xpath("//div[@class=\"mat-form-field-infix ng-tns-c128574513-3\"]//button[@type=\"button\"]");
    private By sdate = By.cssSelector("td[data-mat-row=\"1\"][data-mat-col=\"2\"]");
    private By calender2 = By.xpath("//div[@class=\"mat-form-field-infix ng-tns-c128574513-4\"]//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"]");
    private By edate = By.cssSelector("td[data-mat-row=\"4\"][data-mat-col=\"0\"]");
    private By goverance = By.id("governance");
    private By gender = By.id("gender");
    private By qualitative = By.id("qualitative");
    private By firstSubclass = By.id("firstSubclass");
    private By secondSubclass = By.id("secondSubclass");
    private By comerical = By.id("commercialNumber");
    private By next_button = By.xpath("//button[@type=\"submit\"] //span[@class=\"ng-star-inserted\"]");
    private By phone = By.cssSelector("input[formcontrolname=\"phoneNo\"]");
    private By email = By.cssSelector("input[formcontrolname=\"email\"]");
    private By next_button_page2 = By.xpath("//div[@id=\"cdk-step-content-0-1\"] //span[@class=\"ng-star-inserted\"]");

    public void page_1(String nameofsocity, String Comerical) throws InterruptedException {
        String current_name = driver.findElement(name).getText();
        if (current_name != null) {
            driver.findElement(name).clear();
            driver.findElement(name).sendKeys(nameofsocity);
        } else if (current_name == null) {
            driver.findElement(name).sendKeys(nameofsocity);
        }
        driver.findElement(transparency).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        Select li_transparency = new Select(driver.findElement(transparency));
        li_transparency.selectByIndex(2);
        //scroll(200);
        driver.findElement(date).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(sdate).click();
        driver.findElement(calender2).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button[aria-label=\"Next month\"]")).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(edate).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(goverance).click();
        Select governance = new Select(driver.findElement(goverance));
        governance.selectByIndex(1);
        driver.findElement(gender).click();
        Select gender_type = new Select(driver.findElement(gender));
        gender_type.selectByIndex(1);
//        gender_type.selectByVisibleText("ذكر");
//        driver.findElement(qualitative).click();
//        Select qualitative_socity = new Select(driver.findElement(qualitative));
//        qualitative_socity.selectByVisibleText("لا يوجد");
//        driver.findElement(firstSubclass).click();
//        Select firstSubclass_socity = new Select(driver.findElement(firstSubclass));
//        firstSubclass_socity.selectByVisibleText("لا يوجد");
//        driver.findElement(firstSubclass).click();
//        Select secondSubclass_socity = new Select(driver.findElement(secondSubclass));
//        secondSubclass_socity.selectByVisibleText("لا يوجد");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(comerical).clear();
        driver.findElement(comerical).sendKeys(Comerical);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(next_button).click();
        Thread.sleep(3000);
    }

    public void page_2(String Phone, String Email) throws InterruptedException {
        String phone_number = driver.findElement(phone).getText();
        if (phone_number != null) {
            driver.findElement(phone).clear();
            driver.findElement(phone).sendKeys(Phone);
        } else if (phone_number == null) {

            driver.findElement(phone).sendKeys(Phone);
        }
        String email_page2 = driver.findElement(email).getText();
        if (email_page2 != null) {
            driver.findElement(email).clear();
            driver.findElement(email).sendKeys(Email);
        } else if (email_page2 == null) {

            driver.findElement(email).sendKeys(Email);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        driver.findElement(next_button_page2).click();
        Thread.sleep(1000);
    }

    private By region = By.id("region");
    private By cityAddress = By.id("cityAddress");
    private By address = By.id("address");
    private By shortaddress = By.id("shortAddress");
    private By building_num = By.id("buildingNo");
    private By street = By.id("street");
    private By subNo = By.id("subNo");
    private By district = By.id("district");
    private By postalCode = By.id("postalCode");
    private By nationalCity = By.id("nationalCity");
    private By submit = By.xpath("//div[@id=\"cdk-step-content-0-2\"]//button[@type=\"submit\"]");

    public void page_3(String Address, String Shortaddress, String Buildnum, String Street, String subnum, String district_name, String Postalcode) throws InterruptedException {
        driver.findElement(region).click();
        Select region_s = new Select(driver.findElement(region));
        region_s.selectByIndex(2);
        //region_s.selectByVisibleText("منطقة الجوف");
        driver.findElement(cityAddress).click();
        Select cityAddress_s = new Select(driver.findElement(cityAddress));
        cityAddress_s.selectByIndex(1);
        //cityAddress_s.selectByVisibleText("مدينة سكاكا");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String address_text = driver.findElement(address).getText();
        if (address_text != null) {
            driver.findElement(address).clear();
            driver.findElement(address).sendKeys(Address);
        } else if (address_text == null) {

            driver.findElement(address).sendKeys(Address);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        //scroll(200);
        String short_address = driver.findElement(shortaddress).getText();
        if (short_address != null) {
            driver.findElement(shortaddress).clear();
            driver.findElement(shortaddress).sendKeys(Shortaddress);
        } else if (short_address == null) {

            driver.findElement(shortaddress).sendKeys(Shortaddress);
        }
        String build_num = driver.findElement(building_num).getText();

        if (build_num != null) {
            driver.findElement(building_num).clear();
            driver.findElement(building_num).sendKeys(Buildnum);
        } else if (build_num == null) {

            driver.findElement(building_num).sendKeys(Buildnum);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String street_name = driver.findElement(street).getText();
        if (street_name != null) {
            driver.findElement(street).clear();
            driver.findElement(street).sendKeys(Street);
        } else if (street_name == null) {

            driver.findElement(street).sendKeys(Street);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String subno = driver.findElement(subNo).getText();
        if (subno != null) {
            driver.findElement(subNo).clear();
            driver.findElement(subNo).sendKeys(subnum);
        } else if (subno == null) {

            driver.findElement(subNo).sendKeys(subnum);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String district_socity = driver.findElement(district).getText();
        if (district_socity != null) {
            driver.findElement(district).clear();
            driver.findElement(district).sendKeys(district_name);
        } else if (district_socity == null) {
            driver.findElement(district).sendKeys(district_name);
        }
        String code = driver.findElement(postalCode).getText();
        if (code != null) {
            driver.findElement(postalCode).clear();
            driver.findElement(postalCode).sendKeys(Postalcode);
        } else if (code == null) {

            driver.findElement(postalCode).sendKeys(Postalcode);
        }
        Select nationalcity = new Select(driver.findElement(nationalCity));
        nationalcity.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        driver.findElement(submit).click();
        Thread.sleep(1000);

    }

    private By date_organize = By.id("datecreatedOrganize");
    private By cal = By.cssSelector("button[class=\"mat-calendar-body-cell mat-calendar-body-active\"]");
    private By date_organize_enddate = By.xpath("//td[@data-mat-row=\"4\"][@data-mat-col=\"4\"]");
    private By date_end = By.id("dateendedOrganize");
    private By nameofceo = By.id("nameceoorganize");
    private By idofceo = By.id("idceoorganize");
    private By mobile_ceo = By.id("mobileceoorganize");
    private By email_ceo = By.id("emailceoorganize");
    private By delegate_name = By.id("RegisterdelegateName");
    private By delegate_id = By.id("RegisterdelegateId");
    private By delegate_phone = By.id("RegisterdelegatePhone");
    private By delegate_email = By.id("RegisterdelegateEmail");

    private By add_delegate = By.xpath("//div[@class=\"grid lg:grid-cols-5 md:grid-cols-5 gap-5\"]//button[@type=\"button\"]");

    public void page_4(String ceoname, String ceoid, String ceophone, String ceomail) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        driver.findElement(date_organize).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

        driver.findElement(cal).click();
        driver.findElement(date_end).click();
        driver.findElement(date_organize_enddate).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String nameceo = driver.findElement(nameofceo).getText();
        if (nameceo != null) {
            driver.findElement(nameofceo).clear();
            driver.findElement(nameofceo).sendKeys(ceoname);
        } else if (nameceo == null) {

            driver.findElement(nameofceo).sendKeys(ceoname);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String idceo = driver.findElement(idofceo).getText();
        if (idceo != null) {
            driver.findElement(idofceo).clear();
            driver.findElement(idofceo).sendKeys(ceoid);
        } else if (idceo == null) {
            driver.findElement(idofceo).sendKeys(ceoid);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
//mobileceoorganize
        String mob_ceo = driver.findElement(mobile_ceo).getText();
        if (mob_ceo != null) {
            driver.findElement(mobile_ceo).clear();
            driver.findElement(mobile_ceo).sendKeys(ceophone);
        } else if (mob_ceo == null) {

            driver.findElement(mobile_ceo).sendKeys(ceophone);
        }
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        String email = driver.findElement(email_ceo).getText();
        if (email != null) {
            driver.findElement(email_ceo).clear();
            driver.findElement(email_ceo).sendKeys(ceomail);
        } else if (email == null) {

            driver.findElement(email_ceo).sendKeys(ceomail);
        }
      //  if (driver.findElement(By.xpath("//div[@id=\"directory-account\"]//table[@class=\"mat-table cdk-table table-dark mat-elevation-z8 mb-3 table-data w-full shadow-none block md:inline-table overflow-x-auto whitespace-nowrap\"]")) == null) {
        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
        System.out.println(tableRows.size());
        if(tableRows.size()<=2){
            driver.findElement(delegate_name).sendKeys("nesma");
            driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
            driver.findElement(delegate_id).sendKeys("1593571230");
            driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
            driver.findElement(delegate_phone).sendKeys("596325785");
            driver.findElement(delegate_email).sendKeys("nesma@gmail.com");
            driver.findElement(add_delegate).click();
            driver.findElement(By.xpath("//div[@class=\"flex flex-col md:flex-row\"]//button[@type=\"submit\"]")).click();
        } else {
            driver.findElement(By.xpath("//div[@class=\"flex flex-col md:flex-row\"]//button[@type=\"submit\"]")).click();
            Thread.sleep(3000);

        }

    }

    private By bankid = By.id("bank");
    private By bankaccount = By.id("bankAccountNumber");
    private By IBANbankaccount = By.id("ibanAccountNumber");
    private By BANKNAME = By.id("beneficiaryName");
    private By addacount = By.cssSelector("div[class=\"mb-3 pt-0 form-group add-btn\"]");
    private By nextt = By.xpath("//*[@id=\"financial-account\"]/div[2]/div/div[2]/button");

    public void page_5(String AccountNumber, String ibanNumber, String bankname) throws InterruptedException {
      Thread.sleep(2000);
    //  if (driver.findElement(By.xpath("//div[@class=\"mt-12 mb-3\"]//table[@class=\"mat-table cdk-table table-dark mat-elevation-z8 mb-3 table-data w-full shadow-none block md:inline-table overflow-x-auto whitespace-nowrap\"]")) == null) {
        List<WebElement> num_tableRows = driver.findElements(By.tagName("tr"));
        System.out.println(num_tableRows.size());
        if(num_tableRows.size()<=3){
            Select Bank = new Select(driver.findElement(bankid));
            Bank.selectByIndex(1);
            driver.findElement(bankaccount).sendKeys(AccountNumber);
            driver.findElement(IBANbankaccount).sendKeys(ibanNumber);
            driver.findElement(BANKNAME).sendKeys(bankname);
            driver.findElement(addacount).click();
            Thread.sleep(100);
            driver.findElement(nextt).click();
        Thread.sleep(100);
        } else {
            driver.findElement(nextt).click();
        }
    }
    private By NEXTTOLASTPAGE = By.xpath("//*[@id=\"financial-account\"]/form/div[3]/div[2]/button/span");

    public void page_6() throws InterruptedException {
        Thread.sleep(100);
        driver.findElement(NEXTTOLASTPAGE).click();
        Thread.sleep(100);
    }
    private By uploadfile_1=By.cssSelector("input[id=\"delegatorID\"]");
    private By uploadfile_2=By.cssSelector("input[id=\"delegationLetter\"]");
    private By uploadfile_3=By.cssSelector("input[id=\"banksCertificate\"]");
    private By uploadfile_4=By.cssSelector("input[id=\"waqfiLicense\"]");
    private By uploadfile_5=By.cssSelector("input[id=\"logo\"]");
    private By last_submit_button =By.xpath("//form[@id=\"uploadForm\"]//button[@class=\"btn btn-secondry mx-0 md:mx-3 mb-3 md:mb-0 w-full md:w-auto md:mini-width-corner\"]");
    public void page_7() throws InterruptedException {
        Thread.sleep(100);
        String path="C:\\Users\\nabdelnasser\\Desktop\\200_200.png";
        driver.findElement(uploadfile_1).sendKeys(path);
        Thread.sleep(1000);
        driver.findElement(uploadfile_2).sendKeys(path);
        driver.findElement(uploadfile_3).sendKeys(path);
        driver.findElement(uploadfile_4).sendKeys(path);
        driver.findElement(uploadfile_5).sendKeys(path);
        Thread.sleep(1000);
        driver.findElement(last_submit_button).click();
    }
    private By otp_1=By.id("ngx-otp-input-0");
    private By otp_2=By.id("ngx-otp-input-1");
    private By otp_3=By.id("ngx-otp-input-2");
    private By otp_4=By.id("ngx-otp-input-3");
    private By verify_Button=By.cssSelector("button[class=\"btn btn-secondary mini-width-corner bg-corner-dark-6 full mb-4 mt-6\"]");
    public void verify_using_otp() throws InterruptedException {
        Thread.sleep(100);
        String path="C:\\Users\\nabdelnasser\\Desktop\\200_200.png";
        driver.findElement(otp_1).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(otp_2).sendKeys("2");
        driver.findElement(otp_3).sendKeys("3");
        driver.findElement(otp_4).sendKeys("4");
        Thread.sleep(1000);
        driver.findElement(verify_Button).click();
        Thread.sleep(3000);

    }
}






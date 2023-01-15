import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class appiumKurulum {

    @Test

    public void test() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


     /*    desiredCapabilities.setCapability("automationNmae","UiAutomotor");
         desiredCapabilities.setCapability("platformName","Android");

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomotor2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\hasan\\IdeaProjects\\Appium\\src\\Apps\\Calculator Vault_1.3.4_Apkpure.apk"); */


         desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName","PIXEL");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\hasan\\IdeaProjects\\Appium\\src\\Apps\\Calculator Vault_1.3.4_Apkpure.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

          Thread.sleep(5000);


    }
}

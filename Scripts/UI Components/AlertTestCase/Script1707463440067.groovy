import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://demo.seleniumeasy.com/javascript-alert-box-demo.html')

WebUI.click(findTestObject('AlertObjects1/Page_Selenium Easy Demo - Automate All Scenarios/Alert_button'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('AlertObjects1/Page_Selenium Easy Demo - Automate All Scenarios/Confirm_button'))

WebUI.delay(3)

WebUI.dismissAlert()

WebUI.click(findTestObject('AlertObjects1/Page_Selenium Easy Demo - Automate All Scenarios/Prompt_Button'))

WebDriver driver= DriverFactory.getWebDriver();
driver.switchTo().alert().sendKeys("Agree")

WebUI.delay(3)

WebUI.setAlertText('Agree')

WebUI.acceptAlert()


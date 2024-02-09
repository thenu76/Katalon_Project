import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demo.seleniumeasy.com/basic-select-dropdown-demo.html')

WebUI.selectOptionByIndex(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 2)

WebUI.verifyOptionSelectedByIndex(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 
    2, 30)

WebUI.selectOptionByLabel(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 'Saturday', 
    false)

WebUI.verifyOptionPresentByLabel(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 
    'Saturday', false, 0)

WebUI.selectOptionByValue(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 'Wednesday', 
    false)

WebUI.verifyOptionSelectedByValue(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Days_Dropdown'), 
    'Wednesday', false, 0)

WebUI.selectAllOption(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Multi_Select'))

WebUI.deselectAllOption(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Multi_Select'))

WebUI.selectOptionByIndex(findTestObject('Drop_Down/Page_Selenium Easy Demo - Automate All Scenarios/Multi_Select'), '2-4')


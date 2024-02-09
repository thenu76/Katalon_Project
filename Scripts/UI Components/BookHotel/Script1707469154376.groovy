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

WebUI.openBrowser('https://adactinhotelapp.com/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('BookHotel/LoginPage/TxtUserName'), 'AdminTest7')

WebUI.sendKeys(findTestObject('BookHotel/LoginPage/TxtPassword'), '1234567')

WebUI.click(findTestObject('BookHotel/LoginPage/LoginBtn'))

WebUI.getAttribute(findTestObject('BookHotel/SearchHotel/SucessMSG'), 'HelloAdminTest7!')

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/LocationDD'), 'London', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/HotelsDD'), 'Hotel Sunshine', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/RoomTypeDD'), 'Double', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/NoofRoomDD'), '1 - One', false)

WebUI.clearText(findTestObject('BookHotel/SearchHotel/CheckInDate'))

WebUI.sendKeys(findTestObject('BookHotel/SearchHotel/CheckInDate'), '12/02/2024')

WebUI.clearText(findTestObject('BookHotel/SearchHotel/CheckOutDate'))

WebUI.sendKeys(findTestObject('BookHotel/SearchHotel/CheckOutDate'), '13/02/2024')

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/AdultPerRoom'), '3 - Three', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/SearchHotel/ChildPerRoom'), '1 - One', false)

WebUI.click(findTestObject('BookHotel/SearchHotel/SearchBtn'))

WebUI.getAttribute(findTestObject('BookHotel/SelectHotel/SucessMsg'), ' Select Hotel')

WebUI.click(findTestObject('BookHotel/SelectHotel/RadioBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BookHotel/SelectHotel/ContinueBtn'))

WebUI.sendKeys(findTestObject('BookHotel/BookAHotel/FirstName'), 'Then')

WebUI.sendKeys(findTestObject('BookHotel/BookAHotel/LastName'), 'Mozhi')

WebUI.sendKeys(findTestObject('BookHotel/BookAHotel/BillingAddress'), 'Chennai')

WebUI.sendKeys(findTestObject('BookHotel/BookAHotel/CCNum'), '1234567892345678')

WebUI.selectOptionByLabel(findTestObject('BookHotel/BookAHotel/CCType'), 'VISA', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/BookAHotel/ExpMonth'), 'June', false)

WebUI.selectOptionByLabel(findTestObject('BookHotel/BookAHotel/Exp_Year'), '2025', false)

WebUI.sendKeys(findTestObject('BookHotel/BookAHotel/CVVNum'), '333')

WebUI.click(findTestObject('BookHotel/BookAHotel/BookNow'))

WebUI.delay(5)

attribute = WebUI.getAttribute(findTestObject('BookHotel/BookConfirm/OrderNo'), 'value')

println(attribute)



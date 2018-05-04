import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://newtours.demoaut.com/')

WebUI.waitForElementPresent(findTestObject('Page_Welcome Mercury Tours/input_userName'), 30)

WebUI.setText(findTestObject('Page_Welcome Mercury Tours/input_userName'), username)

WebUiBuiltInKeywords.setText(findTestObject('Page_Welcome Mercury Tours/input_password'), password)

WebUI.click(findTestObject('Page_Welcome Mercury Tours/input_login'))

WebUI.waitForElementPresent(findTestObject('Page_Find a Flight Mercury Tours/rdog_tripType'), 60)

WebUI.selectOptionByLabel(findTestObject('Page_Find a Flight Mercury Tours/select_departDay'), '20', false)

CustomKeywords.'com.mercurytour.customkeyword.selectType'('One Way')

WebUI.selectOptionByLabel(findTestObject('Page_Find a Flight Mercury Tours/select_passengerNum'), passengerNum, false)

WebUI.selectOptionByValue(findTestObject('Page_Find a Flight Mercury Tours/select_departFrom'), 'Frankfurt', false)

WebUI.selectOptionByLabel(findTestObject('Page_Find a Flight Mercury Tours/select_departMonth'), 'May', false)

WebUI.selectOptionByLabel(findTestObject('Page_Find a Flight Mercury Tours/select_returnMonth'), 'May', false)

WebUI.selectOptionByLabel(findTestObject('Page_Find a Flight Mercury Tours/select_returnDay'), '21', false)

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/btn_continue'))
mydate = new Date()
formattedDate = mydate.format("yyyyMMddhhmmss")

WebUI.takeScreenshot('C:\\IBM\\WorkSpace\\Katalon Studio\\MercuryTour\\Reports\\screenshot\\screenshot_' + formattedDate + '.png')

WebDriver driver = DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath('/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]'))

//if (table != null) {
//    List<WebElement> tb = table.findElements(By.xpath('//tr'))
//
//    int rowCount = tb.size()
//
//    WebUI.verifyEqual(rowCount, 10,FailureHandling.CONTINUE_ON_FAILURE)
//}

def actual = ['1','3']

def expect = ['1','3']

WebUI.verifyEqual(actual, expect, FailureHandling.CONTINUE_ON_FAILURE)

def actual1 = ['1','2']

def expect1 = ['1','2']

WebUI.verifyEqual(actual1, expect1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()


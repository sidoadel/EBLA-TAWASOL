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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_/add outgoing Icon'))

WebUI.click(findTestObject('Page_/simple add'))

WebUI.scrollToElement(findTestObject('Page_/input__upload-file-content'), 5)

WebUI.uploadFile(findTestObject('Page_/input__upload-file-content'), upload)

WebUI.waitForElementVisible(findTestObject('Page_/ (1)'), 2)

WebUI.setText(findTestObject('Page_/ (1)'), 'أختبار صادر')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_/secret'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_/periory'))

WebUI.click(findTestObject('Page_/Major'))

WebUI.scrollToElement(findTestObject('Page_/dep1'), 5)

WebUI.click(findTestObject('Page_/dep1'))

WebUI.click(findTestObject('Page_/gov1'))

WebUI.click(findTestObject('Page_/dep2'))

WebUI.click(findTestObject('Page_/gov2'))

WebUI.click(findTestObject('Page_/dep3'))

WebUI.click(findTestObject('Page_/span_amira sub -'))

WebUI.click(findTestObject('Page_/Save doc'))


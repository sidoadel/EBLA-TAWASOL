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

WebUI.click(findTestObject('outgoing/add outgoing Icon'))

WebUI.click(findTestObject('outgoing/simple add'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('outgoing/ (1)'), 'Autmoation Add Outgoing')

WebUI.waitForElementVisible(findTestObject('outgoing/secret'), 5)

WebUI.click(findTestObject('outgoing/secret'))

WebUI.click(findTestObject('outgoing/div_'))

WebUI.click(findTestObject('outgoing/periory'))

WebUI.click(findTestObject('outgoing/Major'))

WebUI.scrollToElement(findTestObject('outgoing/dep1'), 3)

WebUI.click(findTestObject('outgoing/dep1'))

WebUI.click(findTestObject('outgoing/gov1'))

WebUI.click(findTestObject('outgoing/dep2'))

WebUI.click(findTestObject('outgoing/gov2'))

WebUI.click(findTestObject('outgoing/dep3'))

WebUI.click(findTestObject('outgoing/span_amira sub -'))

WebUI.uploadFile(findTestObject('outgoing/input__upload-file-content'), upload)


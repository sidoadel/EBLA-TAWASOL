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

WebUI.callTestCase(findTestCase('Outgoing Cycle/Add Simple outgoing'), [('upload') : 'C:\\\\Users\\\\andalosya\\\\Desktop\\\\double sign test.docx'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('send outgoing/Page_/Ok'))

WebUI.switchToFrame(findTestObject('send outgoing/Page_/Page_/popubp'), 3)

WebUI.waitForElementVisible(findTestObject('Page_/md-icon'), 5)

WebUI.click(findTestObject('send outgoing/Page_/md-icon'))

WebUI.setText(findTestObject('send outgoing/Page_/input__arabic_name'), 'سجود')

WebUI.click(findTestObject('send outgoing/Page_/secrh for user'))


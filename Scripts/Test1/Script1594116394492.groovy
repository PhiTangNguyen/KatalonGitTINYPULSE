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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.tinyserver.info/signin')

WebUI.setText(findTestObject('Object Repository/Page_TINYpulse Login/input_Your work email or username_sessionemail'), 'kem@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_TINYpulse Login/input_Password_sessionpassword'), 'AfTDi95BVl/pc+DqUUWg7A==')

WebUI.click(findTestObject('Object Repository/Page_TINYpulse Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_TINYpulse  Engage/i_Reports_icon-people-setting'))

WebUI.click(findTestObject('Object Repository/Page_TINYpulse  Settings/a_sendAdd People'))

WebUI.click(findTestObject('Object Repository/Page_TINYpulse  Settings/span_clear'))

WebUI.click(findTestObject('Object Repository/Page_TINYpulse  Settings/span_clear'))

WebUI.setText(findTestObject('Object Repository/Page_TINYpulse  Settings/input_clear_Input__input___1hjYb'), 'kem')

WebUI.setText(findTestObject('Object Repository/Page_TINYpulse  Settings/input_clear_Input__input___1hjYb_1'), '10')

WebUI.setText(findTestObject('Object Repository/Page_TINYpulse  Settings/input_clear_Input__input___1hjYb_1_2'), 'kem10@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_TINYpulse  Settings/div_Add People'))


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')


WebUI.setText(findTestObject('Object Repository/temp/Page_Amazon.com  DA VINCI CODE/input_Search Amazon_field-keywords'),
	'pillow')

WebUI.click(findTestObject('Object Repository/temp/Page_Amazon.com  DA VINCI CODE/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/temp/Page_Amazon.com  pillow/img_Ships to India_s-image'))

WebUI.click(findTestObject('Object Repository/temp/Page_Amazon.com Tempur-Pedic Memory Foam Sy_0cc0b2/input_Shipping cost, delivery date, and ord_223673'))

WebUI.click(findTestObject('Object Repository/temp/Page_Amazon.com Shopping Cart/a_Go to Cart'))

WebUI.closeBrowser()
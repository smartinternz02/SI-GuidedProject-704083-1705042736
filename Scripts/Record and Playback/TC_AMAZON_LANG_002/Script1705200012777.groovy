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

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/a_EN'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Change Language  Currency Settings/label_espaol -        ES                   _44edb8'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Change Language  Currency Settings/input_Cancelar_a-button-input'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Gasta menos. Sonre ms/a_ES'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Cambiar configuracin de idioma y moneda/label_portugus -        PT                 _69c65f'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Cambiar configuracin de idioma y moneda/input_Cancelar_a-button-input'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/span_English - EN'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    'chetankumarpulipati4@gmail.com')

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/span_EN'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Change Language  Currency Settings/label_Deutsch -        DE                  _ff571f'))

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Change Language  Currency Settings/input_Cancelar_a-button-input'))

WebUI.setText(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/input_Suche Amazon_field-keywords'), 
    'kar')

WebUI.click(findTestObject('Object Repository/TC_AMAZON_LANG_002/Page_Amazon.com. Spend less. Smile more/input_Suche Amazon_nav-search-submit-button'))

WebUI.closeBrowser()


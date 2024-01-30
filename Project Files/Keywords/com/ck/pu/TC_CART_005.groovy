package com.ck.pu

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TC_CART_005 {
	
@Keyword
def cart() {
	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://www.amazon.com/')

	WebUI.setText(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
	'SALT FOR ICE AND SNOW')

	WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

	WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com  SALT FOR ICE AND SNOW/div_Price and other details may vary based _5f162a'))

	WebUI.click(findTestObject('Object Repository/TC_CART_005/Page_Amazon.com Steve Spangler Science-8555_418843/input_Shipping cost, delivery date, and ord_223673'))

	WebUI.closeBrowser()
}
}
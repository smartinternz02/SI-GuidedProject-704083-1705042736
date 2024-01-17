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

public class TC_AMAZON_SEARCH_001 {

	@Keyword
	def TestCase_001() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.amazon.com/')

		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'),
				'search-alias=stripbooks-intl-ship', true)

		WebUI.setText(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
				'da vinci code')

		WebUI.click(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'),
				'search-alias=electronics-intl-ship', true)

		WebUI.setText(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
				'mobile phones')

		WebUI.click(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'),
				'search-alias=kitchen-intl-ship', true)

		WebUI.setText(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
				'washing machine')

		WebUI.click(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'),
				'search-alias=automotive-intl-ship', true)

		WebUI.click(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'))

		WebUI.setText(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'),
				'suv')

		WebUI.click(findTestObject('Object Repository/TC_AMAZON_SEARCH_001/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

		WebUI.closeBrowser()
	}
}

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TC_QUANTITY_004 {
	@BeforeTestCase
	def sampleBeforeTestCase() {
	
		WebUI.setText(findTestObject('Object Repository/TC_QUANTITY_004/Page_Amazon.com. Spend less. Smile more/input_field-keywords'),
			'PENDRIVE')
	}

	
	@AfterTestCase
	def sampleAfterTestCase() {
		
		WebUI.click(findTestObject('Object Repository/TC_QUANTITY_004/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))
		
		WebUI.click(findTestObject('Object Repository/TC_QUANTITY_004/Page_Amazon.com  PENDRIVE/span_Type-C USB Flash Drive, 256GB, Transfe_3f34d6'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_QUANTITY_004/Page_Amazon.com SAMSUNG Type-C USB Flash Dr_c95e17/select_QTY'),
			'2', true)
	}
}
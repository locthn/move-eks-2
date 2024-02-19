import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink view product > navigate to Page product details'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_view_product'))

'Step 3: At Page product details, click on input quantity'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/input_quantity'))

'Step 4: At Page product details, input on input quantity'

WebUI.setText(findTestObject('AI-Generated/Page_product_details/input_quantity'), input_quantity)

'Step 5: At Page product details, click on button add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_add_to_cart'))

'Step 6: At Page product details, click on button continue shopping'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_continue_shopping'))

'Step 7: Add visual checkpoint at Page product details'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Adding Product to Cart and Continuing Shopping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}

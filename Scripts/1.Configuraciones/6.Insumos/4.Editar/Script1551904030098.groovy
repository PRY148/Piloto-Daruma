import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*WebUI.callTestCase(findTestCase('Login_AccesoModulo'), [('URL_BASE') : 'http://54.203.130.100:8106/app_mysql.php/', ('USER') : 'Tester4'
 , ('PASSWORD') : 'c4m1n0'])*/
WebUI.delay(2)

/*WebUI.executeJavaScript(GlobalVariable.spanAbrirConfiguracionn, [])
WebUI.delay(2)
WebUI.executeJavaScript(GlobalVariable.clickBtn1, [])
WebUI.delay(2)*/
WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/supply_base?related_module=event')

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.inputItem, [])

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnEditarGeneralPrueba, [])

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('1.Configuracion/6.Insumos/2.Editar/selectTipoInsumo'), '7', true)

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/inputNombre'), 'Edicion del Registro ')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/textareaNotas'), 'Editando un registro tardo unos minutos...')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/inputSustancias'), 'Pruebilla')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/inputMarca'), 'Selenium, Appium etc...')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/inputLote'), '0002')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/6.Insumos/2.Editar/inputRegistroInvima'), 'INVIMA002')

WebUI.delay(2)

WebUI.executeJavaScript('$("#s2id_autogen1").click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$("ul.select2-all-none li:nth-child(1)").click();', [])

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnGuardarGeneralPrueba, [])

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnRegresarCrear, [])

WebUI.delay(3)


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

WebUI.callTestCase(findTestCase('Login_AccesoModulo'), [('URL_BASE') : 'http://54.203.130.100:8106/app_mysql.php/', ('USER') : 'Tester4'
        , ('PASSWORD') : 'c4m1n0'])

WebUI.delay(2)

//El click se lo esta asignando a la variable que tiene el objeto...
WebUI.executeJavaScript(GlobalVariable.spanAbrirConfiguracionn, [])

WebUI.delay(2)

//Esta ejecutando el String que tiene el Script de ejecucion...
WebUI.executeJavaScript(GlobalVariable.clickBtn3, [])

WebUI.delay(2)

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event_diagnosis?related_module=event')

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnCrearGeneralPrueba, [])

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/inputCodigo'), 'PP0001')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/inputNombre'), 'Cancer de Pancreas')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/inputGenero'), 'M')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/inputLimiteSuperior'), '100')

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/inputLimiteInferior'), '10')

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.checkCondicionPrincipalDiagnosticos, [])

WebUI.delay(2)

WebUI.setText(findTestObject('1.Configuracion/3.Diagnosticos/1.Crear/textareaObservaciones'), 'Texto para esto...')

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnGuardarGeneralPrueba, [])

WebUI.delay(2)

WebUI.executeJavaScript(GlobalVariable.btnRegresarEditar, [])

WebUI.delay(3)


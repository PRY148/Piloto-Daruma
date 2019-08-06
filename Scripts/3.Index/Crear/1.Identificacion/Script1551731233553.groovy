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

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(GlobalVariable.btnCrearGeneralPrueba)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/textareaDescEvento'), 'Prueba de calidad de software hecha desde cali, valle del cauca.')

//Validar que los campos de 'Fecha Ocurrencia' correspondan a los actuales...
//En pantalla deberia aparecer la fecha del dia de su creacion...
WebUI.click(GlobalVariable.btnAnadirAdjuntoCrear)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputHisClinicaEventos'), '123456789')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputHojaAtencionEventos'), 'HJ123456')

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectTipoIdentiEventos'), '1', 
    true)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputNumIdentifiEventos'), '6526695')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputNombreEventos'), 'Juan Andres ')

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectAnioFechaNacEventos'), 
    '1996', true)

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectMesFechaNacEventos'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectDiaFechaNacEventos'), '28', 
    true)

WebUI.click(GlobalVariable.inputClickGeneroEventos)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputPesoEventos'), '70 KG')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputTallaEventos'), '1.75')

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectGrupoEtnicoEventos'), 'Ninguno', 
    true)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputUrlAsistencialEventos'), 'www.asistencia.com')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputUrlAdministrativoEventos'), 'www.administrativo.com')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/textareaDiagnosticoAntesSucesoEventos', [
            ('variable') : '']), 'Paciente en causa de prueba y de mejora.')

//Para seleccionar un registro de un Select con Input consta de tres pasos...
//Paso #1: Seleccionar el select2, es decir desplegar las opciones
WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCIE10InicialEventos'))

//Paso #2: Generar una espera para que el elemento sea visible...
WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCIE10InicialEventos'), 
    5)

/*Paso #3: Una vez desplegada la lista accedemos al elemento a seleccionar, creando un objeto
		   mediante un selector css que contenga una funcion especifica para escoger el hijo de ese
		   elemento, en este caso el select2. Y asi seleccionar el elemento. */
WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionCIE10InicialEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCIE10PosteriorEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCIE10PosteriorEventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionCIE10PosteriorEventos'))

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/textareaDiagnosticoPosteriorSucesoEventos'), 
    'Esto esta de la ostia, deberian implementarlo.')

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCargoEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectCargoEventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionCargoEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectProcesoEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectProcesoEventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionProcesoEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectAreaEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectAreaEventos'), 5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionAreaEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectUnidadEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectUnidadEventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionUnidadEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectServicioEventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectServicioEventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionServicioEventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectProceso2Eventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectProceso2Eventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionProceso2Eventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectArea2Eventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectArea2Eventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionArea2Eventos'))

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectUnidad2Eventos'))

WebUI.waitForElementClickable(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/btnSelectUnidad2Eventos'), 
    5)

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectOptionUnidad2Eventos'))

WebUI.selectOptionByValue(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/selectServicioEventos'), '1', 
    true)

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputNumCamaEventos'), '15')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputNumHabitacionEventos'), '04')

WebUI.setText(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/inputUbicacionEventos'), 'Clinica de pruebas')

WebUI.click(findTestObject('3.Index/Crear/1.Identificacion/crearIndexEventos/button_Guardar'))


package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object clickBtn1
     
    /**
     * <p></p>
     */
    public static Object clickBtn2
     
    /**
     * <p></p>
     */
    public static Object clickBtn3
     
    /**
     * <p>Profile default : Esta variable se puede cambiar, solo se debe de especificar que Item va a seleccionar</p>
     */
    public static Object inputItem
     
    /**
     * <p></p>
     */
    public static Object spanAbrirConfiguracionn
     
    /**
     * <p></p>
     */
    public static Object btnEditarGeneralPrueba
     
    /**
     * <p></p>
     */
    public static Object btnGuardarGeneralPrueba
     
    /**
     * <p></p>
     */
    public static Object btnCrearGeneralPrueba
     
    /**
     * <p></p>
     */
    public static Object btnEliminarGeneralPrueba
     
    /**
     * <p></p>
     */
    public static Object btnMostrarGeneralPrueba
     
    /**
     * <p></p>
     */
    public static Object btnRegresarEditar
     
    /**
     * <p></p>
     */
    public static Object btnInhabilitarGeneral
     
    /**
     * <p></p>
     */
    public static Object btnDesabilitarGeneral
     
    /**
     * <p></p>
     */
    public static Object checkActivarGeneral
     
    /**
     * <p></p>
     */
    public static Object checkActivar2
     
    /**
     * <p></p>
     */
    public static Object checkCondicionPrincipalDiagnosticos
     
    /**
     * <p></p>
     */
    public static Object checkActivar3
     
    /**
     * <p></p>
     */
    public static Object clickBtn4
     
    /**
     * <p></p>
     */
    public static Object checkRequiredAction
     
    /**
     * <p></p>
     */
    public static Object clickBtn5
     
    /**
     * <p></p>
     */
    public static Object btnRegresarCrear
     
    /**
     * <p></p>
     */
    public static Object checkActivarTypeInsumo
     
    /**
     * <p></p>
     */
    public static Object clickBtn6
     
    /**
     * <p></p>
     */
    public static Object checkActivarInsumos
     
    /**
     * <p></p>
     */
    public static Object clickBtn7
     
    /**
     * <p></p>
     */
    public static Object btnAnadirAdjuntoCrear
     
    /**
     * <p>Profile default : Para escoger Masculino, solo es cambiar la F por la M en la funcion Javascript </p>
     */
    public static Object inputClickGeneroEventos
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['clickBtn1' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li.last > a").click();', 'clickBtn2' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(18) > a").click();', 'clickBtn3' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(17) > a").click();', 'inputItem' : '$("#items_21").click();', 'spanAbrirConfiguracionn' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last > a > span.pull-right-container").click();', 'btnEditarGeneralPrueba' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > a:nth-child(3)").click();', 'btnGuardarGeneralPrueba' : '$("#sf_admin_content > div > form > ul > li:nth-child(3) > input").click();', 'btnCrearGeneralPrueba' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > a.btn.btn-primary.btn-circle.btn-sm.tq_self_none").click();', 'btnEliminarGeneralPrueba' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > a.btn.btn-primary.btn-circle.btn-sm.tq_various_confirm_standar").click();', 'btnMostrarGeneralPrueba' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > a:nth-child(2)").click();', 'btnRegresarEditar' : '$("#sf_admin_content > div > form > ul > li:nth-child(2) > a").click();', 'btnInhabilitarGeneral' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > div > a").click();', 'btnDesabilitarGeneral' : '$("body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > div > ul > li > a").click();', 'checkActivarGeneral' : '$("#event_injury_level_state").click();', 'checkActivar2' : '$("#event_injury_state").click();', 'checkCondicionPrincipalDiagnosticos' : '$("#event_diagnosis_main_condition").click();', 'checkActivar3' : '$("#event_diagnosis_state").click();', 'clickBtn4' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(16) > a").click();', 'checkRequiredAction' : '$("#event_conductive_priority_require_action").click();', 'clickBtn5' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(15) > a").click();', 'btnRegresarCrear' : '$("#sf_admin_content > div > form > ul > li.sf_admin_action_none > a").click();', 'checkActivarTypeInsumo' : '$("#supply_type_state").click();', 'clickBtn6' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(14) > a").click();', 'checkActivarInsumos' : '$("#supply_base_state").click();', 'clickBtn7' : '$("body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li.last.active > ul > li:nth-child(13) > a").click();', 'btnAnadirAdjuntoCrear' : '$("#add_document_file").click();', 'inputClickGeneroEventos' : '$("#event_base_patient_gender_F").click();'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        clickBtn1 = selectedVariables["clickBtn1"]
        clickBtn2 = selectedVariables["clickBtn2"]
        clickBtn3 = selectedVariables["clickBtn3"]
        inputItem = selectedVariables["inputItem"]
        spanAbrirConfiguracionn = selectedVariables["spanAbrirConfiguracionn"]
        btnEditarGeneralPrueba = selectedVariables["btnEditarGeneralPrueba"]
        btnGuardarGeneralPrueba = selectedVariables["btnGuardarGeneralPrueba"]
        btnCrearGeneralPrueba = selectedVariables["btnCrearGeneralPrueba"]
        btnEliminarGeneralPrueba = selectedVariables["btnEliminarGeneralPrueba"]
        btnMostrarGeneralPrueba = selectedVariables["btnMostrarGeneralPrueba"]
        btnRegresarEditar = selectedVariables["btnRegresarEditar"]
        btnInhabilitarGeneral = selectedVariables["btnInhabilitarGeneral"]
        btnDesabilitarGeneral = selectedVariables["btnDesabilitarGeneral"]
        checkActivarGeneral = selectedVariables["checkActivarGeneral"]
        checkActivar2 = selectedVariables["checkActivar2"]
        checkCondicionPrincipalDiagnosticos = selectedVariables["checkCondicionPrincipalDiagnosticos"]
        checkActivar3 = selectedVariables["checkActivar3"]
        clickBtn4 = selectedVariables["clickBtn4"]
        checkRequiredAction = selectedVariables["checkRequiredAction"]
        clickBtn5 = selectedVariables["clickBtn5"]
        btnRegresarCrear = selectedVariables["btnRegresarCrear"]
        checkActivarTypeInsumo = selectedVariables["checkActivarTypeInsumo"]
        clickBtn6 = selectedVariables["clickBtn6"]
        checkActivarInsumos = selectedVariables["checkActivarInsumos"]
        clickBtn7 = selectedVariables["clickBtn7"]
        btnAnadirAdjuntoCrear = selectedVariables["btnAnadirAdjuntoCrear"]
        inputClickGeneroEventos = selectedVariables["inputClickGeneroEventos"]
        
    }
}

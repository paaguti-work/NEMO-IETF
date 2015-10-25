/**
 */
package com.telefonica.ietf.nemo.nemoDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLFactory
 * @model kind="package"
 * @generated
 */
public interface NemoDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nemoDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.telefonica.com/ietf/nemo/NemoDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "nemoDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NemoDSLPackage eINSTANCE = com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.NemoFileImpl <em>Nemo File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoFileImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getNemoFile()
   * @generated
   */
  int NEMO_FILE = 0;

  /**
   * The feature id for the '<em><b>Specss</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEMO_FILE__SPECSS = 0;

  /**
   * The number of structural features of the '<em>Nemo File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEMO_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.SpecImpl <em>Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.SpecImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getSpec()
   * @generated
   */
  int SPEC = 1;

  /**
   * The number of structural features of the '<em>Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.ModelDefinitionImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getModelDefinition()
   * @generated
   */
  int MODEL_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION_FEATURE_COUNT = SPEC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl <em>Node Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getNodeModel()
   * @generated
   */
  int NODE_MODEL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_MODEL__NAME = MODEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_MODEL__PROPERTY_DEFINITIONS = MODEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_MODEL_FEATURE_COUNT = MODEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl <em>Define Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getDefineProperty()
   * @generated
   */
  int DEFINE_PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Property Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_PROPERTY__PROPERTY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_PROPERTY__NAME = 1;

  /**
   * The number of structural features of the '<em>Define Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.TypeImpl
   * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 5;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.NemoFile <em>Nemo File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nemo File</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoFile
   * @generated
   */
  EClass getNemoFile();

  /**
   * Returns the meta object for the containment reference list '{@link com.telefonica.ietf.nemo.nemoDSL.NemoFile#getSpecss <em>Specss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specss</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoFile#getSpecss()
   * @see #getNemoFile()
   * @generated
   */
  EReference getNemoFile_Specss();

  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.Spec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spec</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.Spec
   * @generated
   */
  EClass getSpec();

  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.ModelDefinition <em>Model Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Definition</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.ModelDefinition
   * @generated
   */
  EClass getModelDefinition();

  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.NodeModel <em>Node Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Model</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.NodeModel
   * @generated
   */
  EClass getNodeModel();

  /**
   * Returns the meta object for the attribute '{@link com.telefonica.ietf.nemo.nemoDSL.NodeModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.NodeModel#getName()
   * @see #getNodeModel()
   * @generated
   */
  EAttribute getNodeModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.telefonica.ietf.nemo.nemoDSL.NodeModel#getPropertyDefinitions <em>Property Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Definitions</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.NodeModel#getPropertyDefinitions()
   * @see #getNodeModel()
   * @generated
   */
  EReference getNodeModel_PropertyDefinitions();

  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty <em>Define Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define Property</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.DefineProperty
   * @generated
   */
  EClass getDefineProperty();

  /**
   * Returns the meta object for the containment reference '{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getPropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Type</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getPropertyType()
   * @see #getDefineProperty()
   * @generated
   */
  EReference getDefineProperty_PropertyType();

  /**
   * Returns the meta object for the attribute '{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getName()
   * @see #getDefineProperty()
   * @generated
   */
  EAttribute getDefineProperty_Name();

  /**
   * Returns the meta object for class '{@link com.telefonica.ietf.nemo.nemoDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.telefonica.ietf.nemo.nemoDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NemoDSLFactory getNemoDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.NemoFileImpl <em>Nemo File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoFileImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getNemoFile()
     * @generated
     */
    EClass NEMO_FILE = eINSTANCE.getNemoFile();

    /**
     * The meta object literal for the '<em><b>Specss</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEMO_FILE__SPECSS = eINSTANCE.getNemoFile_Specss();

    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.SpecImpl <em>Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.SpecImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getSpec()
     * @generated
     */
    EClass SPEC = eINSTANCE.getSpec();

    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.ModelDefinitionImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getModelDefinition()
     * @generated
     */
    EClass MODEL_DEFINITION = eINSTANCE.getModelDefinition();

    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl <em>Node Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getNodeModel()
     * @generated
     */
    EClass NODE_MODEL = eINSTANCE.getNodeModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_MODEL__NAME = eINSTANCE.getNodeModel_Name();

    /**
     * The meta object literal for the '<em><b>Property Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_MODEL__PROPERTY_DEFINITIONS = eINSTANCE.getNodeModel_PropertyDefinitions();

    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl <em>Define Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getDefineProperty()
     * @generated
     */
    EClass DEFINE_PROPERTY = eINSTANCE.getDefineProperty();

    /**
     * The meta object literal for the '<em><b>Property Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE_PROPERTY__PROPERTY_TYPE = eINSTANCE.getDefineProperty_PropertyType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_PROPERTY__NAME = eINSTANCE.getDefineProperty_Name();

    /**
     * The meta object literal for the '{@link com.telefonica.ietf.nemo.nemoDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.TypeImpl
     * @see com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

  }

} //NemoDSLPackage

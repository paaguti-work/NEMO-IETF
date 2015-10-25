/**
 */
package com.telefonica.ietf.nemo.nemoDSL.impl;

import com.telefonica.ietf.nemo.nemoDSL.DefineProperty;
import com.telefonica.ietf.nemo.nemoDSL.ModelDefinition;
import com.telefonica.ietf.nemo.nemoDSL.NemoDSLFactory;
import com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage;
import com.telefonica.ietf.nemo.nemoDSL.NemoFile;
import com.telefonica.ietf.nemo.nemoDSL.NodeModel;
import com.telefonica.ietf.nemo.nemoDSL.Spec;
import com.telefonica.ietf.nemo.nemoDSL.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NemoDSLPackageImpl extends EPackageImpl implements NemoDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nemoFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NemoDSLPackageImpl()
  {
    super(eNS_URI, NemoDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link NemoDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NemoDSLPackage init()
  {
    if (isInited) return (NemoDSLPackage)EPackage.Registry.INSTANCE.getEPackage(NemoDSLPackage.eNS_URI);

    // Obtain or create and register package
    NemoDSLPackageImpl theNemoDSLPackage = (NemoDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NemoDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NemoDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNemoDSLPackage.createPackageContents();

    // Initialize created meta-data
    theNemoDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNemoDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NemoDSLPackage.eNS_URI, theNemoDSLPackage);
    return theNemoDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNemoFile()
  {
    return nemoFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNemoFile_Specss()
  {
    return (EReference)nemoFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpec()
  {
    return specEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDefinition()
  {
    return modelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeModel()
  {
    return nodeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeModel_Name()
  {
    return (EAttribute)nodeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeModel_PropertyDefinitions()
  {
    return (EReference)nodeModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefineProperty()
  {
    return definePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefineProperty_PropertyType()
  {
    return (EReference)definePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefineProperty_Name()
  {
    return (EAttribute)definePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NemoDSLFactory getNemoDSLFactory()
  {
    return (NemoDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    nemoFileEClass = createEClass(NEMO_FILE);
    createEReference(nemoFileEClass, NEMO_FILE__SPECSS);

    specEClass = createEClass(SPEC);

    modelDefinitionEClass = createEClass(MODEL_DEFINITION);

    nodeModelEClass = createEClass(NODE_MODEL);
    createEAttribute(nodeModelEClass, NODE_MODEL__NAME);
    createEReference(nodeModelEClass, NODE_MODEL__PROPERTY_DEFINITIONS);

    definePropertyEClass = createEClass(DEFINE_PROPERTY);
    createEReference(definePropertyEClass, DEFINE_PROPERTY__PROPERTY_TYPE);
    createEAttribute(definePropertyEClass, DEFINE_PROPERTY__NAME);

    typeEClass = createEClass(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modelDefinitionEClass.getESuperTypes().add(this.getSpec());
    nodeModelEClass.getESuperTypes().add(this.getModelDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(nemoFileEClass, NemoFile.class, "NemoFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNemoFile_Specss(), this.getSpec(), null, "specss", null, 0, -1, NemoFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specEClass, Spec.class, "Spec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modelDefinitionEClass, ModelDefinition.class, "ModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeModelEClass, NodeModel.class, "NodeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeModel_PropertyDefinitions(), this.getDefineProperty(), null, "propertyDefinitions", null, 0, -1, NodeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definePropertyEClass, DefineProperty.class, "DefineProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefineProperty_PropertyType(), this.getType(), null, "propertyType", null, 0, 1, DefineProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefineProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefineProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //NemoDSLPackageImpl

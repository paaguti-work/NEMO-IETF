/**
 */
package com.telefonica.ietf.nemo.nemoDSL.impl;

import com.telefonica.ietf.nemo.nemoDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NemoDSLFactoryImpl extends EFactoryImpl implements NemoDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NemoDSLFactory init()
  {
    try
    {
      NemoDSLFactory theNemoDSLFactory = (NemoDSLFactory)EPackage.Registry.INSTANCE.getEFactory(NemoDSLPackage.eNS_URI);
      if (theNemoDSLFactory != null)
      {
        return theNemoDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NemoDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NemoDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NemoDSLPackage.NEMO_FILE: return createNemoFile();
      case NemoDSLPackage.SPEC: return createSpec();
      case NemoDSLPackage.MODEL_DEFINITION: return createModelDefinition();
      case NemoDSLPackage.NODE_MODEL: return createNodeModel();
      case NemoDSLPackage.DEFINE_PROPERTY: return createDefineProperty();
      case NemoDSLPackage.TYPE: return createType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NemoFile createNemoFile()
  {
    NemoFileImpl nemoFile = new NemoFileImpl();
    return nemoFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spec createSpec()
  {
    SpecImpl spec = new SpecImpl();
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDefinition createModelDefinition()
  {
    ModelDefinitionImpl modelDefinition = new ModelDefinitionImpl();
    return modelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeModel createNodeModel()
  {
    NodeModelImpl nodeModel = new NodeModelImpl();
    return nodeModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefineProperty createDefineProperty()
  {
    DefinePropertyImpl defineProperty = new DefinePropertyImpl();
    return defineProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NemoDSLPackage getNemoDSLPackage()
  {
    return (NemoDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NemoDSLPackage getPackage()
  {
    return NemoDSLPackage.eINSTANCE;
  }

} //NemoDSLFactoryImpl

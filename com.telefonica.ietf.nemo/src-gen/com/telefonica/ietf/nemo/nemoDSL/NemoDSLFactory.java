/**
 */
package com.telefonica.ietf.nemo.nemoDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage
 * @generated
 */
public interface NemoDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NemoDSLFactory eINSTANCE = com.telefonica.ietf.nemo.nemoDSL.impl.NemoDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Nemo File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nemo File</em>'.
   * @generated
   */
  NemoFile createNemoFile();

  /**
   * Returns a new object of class '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec</em>'.
   * @generated
   */
  Spec createSpec();

  /**
   * Returns a new object of class '<em>Model Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Definition</em>'.
   * @generated
   */
  ModelDefinition createModelDefinition();

  /**
   * Returns a new object of class '<em>Node Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Model</em>'.
   * @generated
   */
  NodeModel createNodeModel();

  /**
   * Returns a new object of class '<em>Define Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define Property</em>'.
   * @generated
   */
  DefineProperty createDefineProperty();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NemoDSLPackage getNemoDSLPackage();

} //NemoDSLFactory

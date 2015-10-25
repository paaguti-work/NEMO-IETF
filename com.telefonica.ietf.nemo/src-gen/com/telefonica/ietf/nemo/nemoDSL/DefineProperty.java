/**
 */
package com.telefonica.ietf.nemo.nemoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#getDefineProperty()
 * @model
 * @generated
 */
public interface DefineProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' containment reference.
   * @see #setPropertyType(Type)
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#getDefineProperty_PropertyType()
   * @model containment="true"
   * @generated
   */
  Type getPropertyType();

  /**
   * Sets the value of the '{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getPropertyType <em>Property Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' containment reference.
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#getDefineProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.telefonica.ietf.nemo.nemoDSL.DefineProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DefineProperty

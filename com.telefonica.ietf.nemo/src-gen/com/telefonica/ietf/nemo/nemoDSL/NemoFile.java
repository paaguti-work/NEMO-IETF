/**
 */
package com.telefonica.ietf.nemo.nemoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nemo File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.NemoFile#getSpecss <em>Specss</em>}</li>
 * </ul>
 *
 * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#getNemoFile()
 * @model
 * @generated
 */
public interface NemoFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Specss</b></em>' containment reference list.
   * The list contents are of type {@link com.telefonica.ietf.nemo.nemoDSL.Spec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specss</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specss</em>' containment reference list.
   * @see com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage#getNemoFile_Specss()
   * @model containment="true"
   * @generated
   */
  EList<Spec> getSpecss();

} // NemoFile

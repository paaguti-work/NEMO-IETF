/**
 */
package com.telefonica.ietf.nemo.nemoDSL.impl;

import com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage;
import com.telefonica.ietf.nemo.nemoDSL.NemoFile;
import com.telefonica.ietf.nemo.nemoDSL.Spec;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nemo File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.impl.NemoFileImpl#getSpecss <em>Specss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NemoFileImpl extends MinimalEObjectImpl.Container implements NemoFile
{
  /**
   * The cached value of the '{@link #getSpecss() <em>Specss</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecss()
   * @generated
   * @ordered
   */
  protected EList<Spec> specss;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NemoFileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NemoDSLPackage.Literals.NEMO_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Spec> getSpecss()
  {
    if (specss == null)
    {
      specss = new EObjectContainmentEList<Spec>(Spec.class, this, NemoDSLPackage.NEMO_FILE__SPECSS);
    }
    return specss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NemoDSLPackage.NEMO_FILE__SPECSS:
        return ((InternalEList<?>)getSpecss()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NemoDSLPackage.NEMO_FILE__SPECSS:
        return getSpecss();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NemoDSLPackage.NEMO_FILE__SPECSS:
        getSpecss().clear();
        getSpecss().addAll((Collection<? extends Spec>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NemoDSLPackage.NEMO_FILE__SPECSS:
        getSpecss().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NemoDSLPackage.NEMO_FILE__SPECSS:
        return specss != null && !specss.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NemoFileImpl

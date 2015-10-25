/**
 */
package com.telefonica.ietf.nemo.nemoDSL.impl;

import com.telefonica.ietf.nemo.nemoDSL.DefineProperty;
import com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage;
import com.telefonica.ietf.nemo.nemoDSL.NodeModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.impl.NodeModelImpl#getPropertyDefinitions <em>Property Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeModelImpl extends ModelDefinitionImpl implements NodeModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropertyDefinitions() <em>Property Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyDefinitions()
   * @generated
   * @ordered
   */
  protected EList<DefineProperty> propertyDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeModelImpl()
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
    return NemoDSLPackage.Literals.NODE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NemoDSLPackage.NODE_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefineProperty> getPropertyDefinitions()
  {
    if (propertyDefinitions == null)
    {
      propertyDefinitions = new EObjectContainmentEList<DefineProperty>(DefineProperty.class, this, NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS);
    }
    return propertyDefinitions;
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
      case NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS:
        return ((InternalEList<?>)getPropertyDefinitions()).basicRemove(otherEnd, msgs);
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
      case NemoDSLPackage.NODE_MODEL__NAME:
        return getName();
      case NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS:
        return getPropertyDefinitions();
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
      case NemoDSLPackage.NODE_MODEL__NAME:
        setName((String)newValue);
        return;
      case NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS:
        getPropertyDefinitions().clear();
        getPropertyDefinitions().addAll((Collection<? extends DefineProperty>)newValue);
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
      case NemoDSLPackage.NODE_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS:
        getPropertyDefinitions().clear();
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
      case NemoDSLPackage.NODE_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NemoDSLPackage.NODE_MODEL__PROPERTY_DEFINITIONS:
        return propertyDefinitions != null && !propertyDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NodeModelImpl

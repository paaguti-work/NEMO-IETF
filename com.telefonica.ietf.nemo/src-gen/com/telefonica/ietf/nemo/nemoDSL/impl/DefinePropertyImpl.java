/**
 */
package com.telefonica.ietf.nemo.nemoDSL.impl;

import com.telefonica.ietf.nemo.nemoDSL.DefineProperty;
import com.telefonica.ietf.nemo.nemoDSL.NemoDSLPackage;
import com.telefonica.ietf.nemo.nemoDSL.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link com.telefonica.ietf.nemo.nemoDSL.impl.DefinePropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinePropertyImpl extends MinimalEObjectImpl.Container implements DefineProperty
{
  /**
   * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyType()
   * @generated
   * @ordered
   */
  protected Type propertyType;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinePropertyImpl()
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
    return NemoDSLPackage.Literals.DEFINE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getPropertyType()
  {
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyType(Type newPropertyType, NotificationChain msgs)
  {
    Type oldPropertyType = propertyType;
    propertyType = newPropertyType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE, oldPropertyType, newPropertyType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyType(Type newPropertyType)
  {
    if (newPropertyType != propertyType)
    {
      NotificationChain msgs = null;
      if (propertyType != null)
        msgs = ((InternalEObject)propertyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE, null, msgs);
      if (newPropertyType != null)
        msgs = ((InternalEObject)newPropertyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE, null, msgs);
      msgs = basicSetPropertyType(newPropertyType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE, newPropertyType, newPropertyType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, NemoDSLPackage.DEFINE_PROPERTY__NAME, oldName, name));
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
      case NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE:
        return basicSetPropertyType(null, msgs);
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
      case NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE:
        return getPropertyType();
      case NemoDSLPackage.DEFINE_PROPERTY__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE:
        setPropertyType((Type)newValue);
        return;
      case NemoDSLPackage.DEFINE_PROPERTY__NAME:
        setName((String)newValue);
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
      case NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE:
        setPropertyType((Type)null);
        return;
      case NemoDSLPackage.DEFINE_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
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
      case NemoDSLPackage.DEFINE_PROPERTY__PROPERTY_TYPE:
        return propertyType != null;
      case NemoDSLPackage.DEFINE_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //DefinePropertyImpl

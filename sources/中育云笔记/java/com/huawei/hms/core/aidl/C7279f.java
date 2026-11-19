package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p161g5.InterfaceC9271a;

/* renamed from: com.huawei.hms.core.aidl.f */
/* loaded from: classes5.dex */
public class C7279f {
    /* renamed from: a */
    public final Bundle m8522a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        m8531j(str, obj, bundle2);
        bundle.putBundle("_next_item_", bundle2);
        return bundle2;
    }

    /* renamed from: b */
    public final Object m8523b(Field field, Bundle bundle) {
        String name = field.getName();
        Object obj = bundle.get(name);
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i10 = bundle2.getInt("_val_type_", -1);
                if (i10 == 1) {
                    return mo8529h(field.getGenericType(), bundle2);
                }
                if (i10 == 0) {
                    return m8527f((Bundle) obj, (InterfaceC7278e) field.getType().newInstance());
                }
            } catch (Exception unused) {
                Log.e("MessageCodec", "decode, read value of the field exception, field name: " + name);
                return null;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final void m8524c(InterfaceC7278e interfaceC7278e, Field field, Bundle bundle) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Object objM8523b = m8523b(field, bundle);
        if (objM8523b != null) {
            boolean zIsAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(interfaceC7278e, objM8523b);
            field.setAccessible(zIsAccessible);
        }
    }

    /* renamed from: d */
    public final boolean m8525d(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        return true;
    }

    /* renamed from: e */
    public final void m8526e(InterfaceC7278e interfaceC7278e, Field field, Bundle bundle) throws SecurityException {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        m8531j(field.getName(), field.get(interfaceC7278e), bundle);
        field.setAccessible(zIsAccessible);
    }

    /* renamed from: f */
    public InterfaceC7278e m8527f(Bundle bundle, InterfaceC7278e interfaceC7278e) {
        if (bundle == null) {
            return interfaceC7278e;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> superclass = interfaceC7278e.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(InterfaceC9271a.class)) {
                    try {
                        m8524c(interfaceC7278e, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        Log.e("MessageCodec", "decode, set value of the field exception, field name:" + field.getName());
                    }
                }
            }
        }
        return interfaceC7278e;
    }

    /* renamed from: g */
    public Bundle m8528g(InterfaceC7278e interfaceC7278e, Bundle bundle) {
        if (interfaceC7278e != null) {
            for (Class<?> superclass = interfaceC7278e.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    if (field.isAnnotationPresent(InterfaceC9271a.class)) {
                        try {
                            m8526e(interfaceC7278e, field, bundle);
                        } catch (IllegalAccessException | IllegalArgumentException unused) {
                            Log.e("MessageCodec", "encode, get value of the field exception, field name: " + field.getName());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: h */
    public List mo8529h(Type type, Bundle bundle) throws InstantiationException {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle2 = bundle.getBundle("_next_item_"); bundle2 != null; bundle2 = bundle2.getBundle("_next_item_")) {
            Object obj = bundle2.get("_value_");
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle3 = (Bundle) obj;
                int i10 = bundle3.getInt("_val_type_", -1);
                if (i10 == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                }
                if (i10 != 0) {
                    throw new InstantiationException("Unknown type can not be supported");
                }
                arrayList.add(m8527f(bundle3, (InterfaceC7278e) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else {
                continue;
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo8530i(String str, List list, Bundle bundle) {
        Bundle bundleM8522a = null;
        for (Object obj : list) {
            if (bundleM8522a == null) {
                bundleM8522a = new Bundle();
                bundle.putBundle(str, bundleM8522a);
                bundleM8522a.putInt("_val_type_", 1);
            }
            bundleM8522a = m8522a("_value_", bundleM8522a, obj);
        }
    }

    /* renamed from: j */
    public void m8531j(String str, Object obj, Bundle bundle) {
        if (obj == null || m8525d(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
            return;
        }
        if (obj instanceof List) {
            mo8530i(str, (List) obj, bundle);
            return;
        }
        if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
            return;
        }
        if (obj instanceof InterfaceC7278e) {
            Bundle bundleM8528g = m8528g((InterfaceC7278e) obj, new Bundle());
            bundleM8528g.putInt("_val_type_", 0);
            bundle.putBundle(str, bundleM8528g);
        } else {
            Log.e("MessageCodec", "cannot support type, " + str);
        }
    }
}

package com.tendcloud.tenddata;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.tendcloud.tenddata.ci */
/* loaded from: classes5.dex */
public class C7904ci {
    /* renamed from: a */
    public static boolean m11559a(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = null;
        try {
            objInvoke = obj.getClass().getMethod("getParentFragment", null).invoke(obj, null);
        } catch (Exception unused) {
        }
        try {
            if (objInvoke == null) {
                if (!m11561c(obj) && m11560b(obj) && m11563e(obj)) {
                    return true;
                }
            } else if (!m11561c(obj) && m11560b(obj) && m11563e(obj) && !m11561c(objInvoke) && m11560b(objInvoke) && m11563e(objInvoke)) {
                return true;
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m11560b(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("getUserVisibleHint", null).invoke(obj, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m11561c(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isHidden", null).invoke(obj, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m11562d(Object obj) throws ClassNotFoundException {
        Class<?> cls;
        Class<Fragment> cls2;
        Class<Fragment> cls3 = Fragment.class;
        if (obj == null) {
            return false;
        }
        try {
            cls = Class.forName("android.app.Fragment");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            int i10 = Fragment.f1475c;
            cls2 = cls3;
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            int i11 = Fragment.f1475c;
        } catch (Exception unused3) {
            cls3 = null;
        }
        if (cls2 == null && cls3 == null && cls == null) {
            return false;
        }
        if (cls2 != null) {
            try {
                if (cls2.isInstance(obj)) {
                    return true;
                }
            } catch (Exception unused4) {
            }
        }
        if (cls3 != null && cls3.isInstance(obj)) {
            return true;
        }
        if (cls != null) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m11563e(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isResumed", null).invoke(obj, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}

package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4636b {

    /* renamed from: a */
    public static List f2038a;

    /* renamed from: com.blankj.utilcode.util.b$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws SecurityException {
            AbstractC4636b.m2134g();
        }
    }

    /* renamed from: b */
    public static void m2129b(Resources resources, float f6) throws SecurityException {
        resources.getDisplayMetrics().xdpi = f6;
        AbstractC4657l0.m2250a().getResources().getDisplayMetrics().xdpi = f6;
        m2131d(resources, f6);
    }

    /* renamed from: c */
    public static void m2130c(Resources resources, float f6) {
        Iterator it = f2038a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) ((Field) it.next()).get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f6;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m2131d(Resources resources, float f6) throws SecurityException {
        if (f2038a != null) {
            m2130c(resources, f6);
            return;
        }
        f2038a = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics displayMetricsM2132e = m2132e(resources, field);
                    if (displayMetricsM2132e != null) {
                        f2038a.add(field);
                        displayMetricsM2132e.xdpi = f6;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            } else {
                declaredFields = superclass.getDeclaredFields();
            }
        }
    }

    /* renamed from: e */
    public static DisplayMetrics m2132e(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Runnable m2133f() {
        return new a();
    }

    /* renamed from: g */
    public static void m2134g() throws SecurityException {
        m2129b(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }
}

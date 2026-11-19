package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5353b {

    /* renamed from: a */
    public static List f2689a;

    /* renamed from: com.blankj.utilcode.util.b$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws SecurityException {
            AbstractC5353b.m2430g();
        }
    }

    /* renamed from: b */
    public static void m2425b(Resources resources, float f10) throws SecurityException {
        resources.getDisplayMetrics().xdpi = f10;
        AbstractC5366h0.m2478a().getResources().getDisplayMetrics().xdpi = f10;
        m2427d(resources, f10);
    }

    /* renamed from: c */
    public static void m2426c(Resources resources, float f10) {
        Iterator it = f2689a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) ((Field) it.next()).get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f10;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m2427d(Resources resources, float f10) throws SecurityException {
        if (f2689a != null) {
            m2426c(resources, f10);
            return;
        }
        f2689a = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics displayMetricsM2428e = m2428e(resources, field);
                    if (displayMetricsM2428e != null) {
                        f2689a.add(field);
                        displayMetricsM2428e.xdpi = f10;
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
    public static DisplayMetrics m2428e(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Runnable m2429f() {
        return new a();
    }

    /* renamed from: g */
    public static void m2430g() throws SecurityException {
        m2425b(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }
}

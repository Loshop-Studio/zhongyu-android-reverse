package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class AdaptScreenUtils {
    private static List<Field> sMetricsFields;

    private AdaptScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i9) {
        return adaptHeight(resources, i9, false);
    }

    @NonNull
    public static Resources adaptWidth(@NonNull Resources resources, int i9) throws SecurityException {
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i9);
        return resources;
    }

    private static void applyDisplayMetrics(@NonNull Resources resources, float f10) throws SecurityException {
        resources.getDisplayMetrics().xdpi = f10;
        Utils.getApp().getResources().getDisplayMetrics().xdpi = f10;
        applyOtherDisplayMetrics(resources, f10);
    }

    private static void applyMetricsFields(Resources resources, float f10) {
        Iterator<Field> it = sMetricsFields.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f10;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private static void applyOtherDisplayMetrics(Resources resources, float f10) throws SecurityException {
        if (sMetricsFields != null) {
            applyMetricsFields(resources, f10);
            return;
        }
        sMetricsFields = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                    if (metricsFromField != null) {
                        sMetricsFields.add(field);
                        metricsFromField.xdpi = f10;
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

    @NonNull
    public static Resources closeAdapt(@NonNull Resources resources) throws SecurityException {
        applyDisplayMetrics(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics getMetricsFromField(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getNavBarHeight(@NonNull Resources resources) {
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Runnable getPreLoadRunnable() {
        return new Runnable() { // from class: com.blankj.utilcode.util.AdaptScreenUtils.1
            @Override // java.lang.Runnable
            public void run() throws SecurityException {
                AdaptScreenUtils.preLoad();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoad() throws SecurityException {
        applyDisplayMetrics(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int pt2Px(float f10) {
        return (int) (((f10 * Utils.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
    }

    public static int px2Pt(float f10) {
        return (int) (((f10 * 72.0f) / Utils.getApp().getResources().getDisplayMetrics().xdpi) + 0.5d);
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i9, boolean z9) throws SecurityException {
        applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z9 ? getNavBarHeight(resources) : 0)) * 72.0f) / i9);
        return resources;
    }
}

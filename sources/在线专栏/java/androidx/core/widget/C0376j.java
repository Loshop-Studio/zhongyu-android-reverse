package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C0376j {

    /* renamed from: a */
    private static Method f2823a;

    /* renamed from: b */
    private static boolean f2824b;

    /* renamed from: c */
    private static Field f2825c;

    /* renamed from: d */
    private static boolean f2826d;

    /* renamed from: a */
    public static void m2184a(PopupWindow popupWindow, boolean z3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z3);
            return;
        }
        if (!f2826d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2825c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e4);
            }
            f2826d = true;
        }
        Field field = f2825c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z3));
            } catch (IllegalAccessException e5) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e5);
            }
        }
    }

    /* renamed from: b */
    public static void m2185b(PopupWindow popupWindow, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i4);
            return;
        }
        if (!f2824b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2823a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2824b = true;
        }
        Method method = f2823a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i4));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m2186c(PopupWindow popupWindow, View view, int i4, int i5, int i6) {
        popupWindow.showAsDropDown(view, i4, i5, i6);
    }
}

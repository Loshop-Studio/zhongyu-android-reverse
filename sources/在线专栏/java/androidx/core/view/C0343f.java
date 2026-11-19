package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.f */
/* loaded from: classes.dex */
public class C0343f {

    /* renamed from: a */
    private static boolean f2734a = false;

    /* renamed from: b */
    private static Method f2735b = null;

    /* renamed from: c */
    private static boolean f2736c = false;

    /* renamed from: d */
    private static Field f2737d;

    /* renamed from: androidx.core.view.f$a */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m1929a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2734a) {
            try {
                f2735b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2734a = true;
        }
        Method method = f2735b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m1930b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m1929a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0358u.m2032h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m1931c(Dialog dialog, KeyEvent keyEvent) throws NoSuchFieldException {
        DialogInterface.OnKeyListener onKeyListenerM1934f = m1934f(dialog);
        if (onKeyListenerM1934f != null && onKeyListenerM1934f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0358u.m2032h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m1932d(View view, KeyEvent keyEvent) {
        return C0358u.m2034i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m1933e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? m1930b((Activity) callback, keyEvent) : callback instanceof Dialog ? m1931c((Dialog) callback, keyEvent) : (view != null && C0358u.m2032h(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m1934f(Dialog dialog) throws NoSuchFieldException {
        if (!f2736c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2737d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2736c = true;
        }
        Field field = f2737d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}

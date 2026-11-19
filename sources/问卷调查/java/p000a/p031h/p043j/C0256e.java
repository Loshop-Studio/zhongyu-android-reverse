package p000a.p031h.p043j;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;

/* renamed from: a.h.j.e */
/* loaded from: classes.dex */
public class C0256e {

    /* renamed from: a */
    public static boolean f1602a = false;

    /* renamed from: b */
    public static Method f1603b = null;

    /* renamed from: c */
    public static boolean f1604c = false;

    /* renamed from: d */
    public static Field f1605d;

    /* renamed from: a.h.j.e$a */
    public interface a {
        /* renamed from: i */
        boolean mo100i(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m840a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = C0266o.d.f1624d;
            C0266o.d dVar = (C0266o.d) view.getTag(C1088R.id.tag_unhandled_key_event_manager);
            if (dVar == null) {
                dVar = new C0266o.d();
                view.setTag(C1088R.id.tag_unhandled_key_event_manager, dVar);
            }
            WeakReference<KeyEvent> weakReference = dVar.f1627c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                dVar.f1627c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReferenceValueAt = null;
                if (dVar.f1626b == null) {
                    dVar.f1626b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = dVar.f1626b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    dVar.m882b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m841b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) throws NoSuchFieldException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo100i(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f1602a) {
                        try {
                            f1603b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f1602a = true;
                    }
                    Method method = f1603b;
                    if (method != null) {
                        try {
                            zBooleanValue = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0266o.m864c(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && C0266o.m864c(view, keyEvent)) || aVar.mo100i(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f1604c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1605d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f1604c = true;
        }
        Field field = f1605d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (C0266o.m864c(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}

package com.blankj.utilcode.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: com.blankj.utilcode.util.q */
/* loaded from: classes3.dex */
public abstract class AbstractC4666q {
    /* renamed from: a */
    public static void m2349a(Activity activity) {
        m2350b(activity.getWindow());
    }

    /* renamed from: b */
    public static void m2350b(Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC4657l0.m2250a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i6 = 0; i6 < 4; i6++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i6]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m2351c() {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC4657l0.m2250a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }
}

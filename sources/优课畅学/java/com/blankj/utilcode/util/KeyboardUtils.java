package com.blankj.utilcode.util;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public abstract class KeyboardUtils {
    /* renamed from: a */
    public static void m2342a(Activity activity) {
        m2343b(activity.getWindow());
    }

    /* renamed from: b */
    public static void m2343b(Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC5366h0.m2478a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i10]);
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
    public static void m2344c(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC5366h0.m2478a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: d */
    public static void m2345d(View view) {
        m2346e(view, 0);
    }

    /* renamed from: e */
    public static void m2346e(View view, int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC5366h0.m2478a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, i10, new ResultReceiver(new Handler()) { // from class: com.blankj.utilcode.util.KeyboardUtils.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i11, Bundle bundle) {
                if (i11 == 1 || i11 == 3) {
                    KeyboardUtils.m2347f();
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }

    /* renamed from: f */
    public static void m2347f() {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC5366h0.m2478a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }
}

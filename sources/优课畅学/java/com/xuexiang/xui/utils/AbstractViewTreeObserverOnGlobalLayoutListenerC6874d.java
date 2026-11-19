package com.xuexiang.xui.utils;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.blankj.utilcode.util.AbstractC5379p;
import java.util.HashMap;
import p150k1.AbstractC9051b;

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewTreeObserverOnGlobalLayoutListenerC6874d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static HashMap f7088a = new HashMap();

    /* renamed from: com.xuexiang.xui.utils.d$a */
    public interface a {
    }

    /* renamed from: a */
    public static void m6432a(MotionEvent motionEvent, Dialog dialog) {
        m6433b(motionEvent, dialog.getWindow());
    }

    /* renamed from: b */
    public static void m6433b(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !m6438g(window, motionEvent)) {
            return;
        }
        m6436e(window.getCurrentFocus());
    }

    /* renamed from: c */
    public static View m6434c(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null && childAt.isShown() && m6442k(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return m6434c((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m6435d(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: e */
    public static void m6436e(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (view instanceof EditText) {
            view.clearFocus();
        }
    }

    /* renamed from: f */
    public static boolean m6437f(View view, MotionEvent motionEvent) {
        if (!(view instanceof EditText) || motionEvent == null) {
            return false;
        }
        return !m6442k(view, motionEvent);
    }

    /* renamed from: g */
    public static boolean m6438g(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !m6441j(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && m6434c((ViewGroup) decorView, motionEvent) == null;
    }

    /* renamed from: h */
    public static boolean m6439h(Activity activity) {
        return activity != null && m6441j(activity.getWindow());
    }

    /* renamed from: i */
    public static boolean m6440i(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - AbstractC6872b.m6426b(viewGroup.getContext()) > 0;
    }

    /* renamed from: j */
    public static boolean m6441j(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return m6440i((ViewGroup) window.getDecorView());
    }

    /* renamed from: k */
    public static boolean m6442k(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            int measuredWidth = view.getMeasuredWidth() + i10;
            int measuredHeight = view.getMeasuredHeight() + i11;
            if (motionEvent.getY() >= i11 && motionEvent.getY() <= measuredHeight && motionEvent.getX() >= i10 && motionEvent.getX() <= measuredWidth) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static void m6443l(a aVar) {
        if (f7088a.containsKey(aVar)) {
            AbstractC5379p.m2596a(f7088a.get(aVar));
            f7088a.remove(aVar);
        }
    }

    /* renamed from: m */
    public static void m6444m() {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC9051b.m15847b().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }
}

package com.xuexiang.xui.utils;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.HashMap;
import p087k.AbstractC6619r;

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes3.dex */
public abstract class AbstractViewTreeObserverOnGlobalLayoutListenerC5856d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static HashMap f4490a = new HashMap();

    /* renamed from: com.xuexiang.xui.utils.d$a */
    public interface a {
    }

    /* renamed from: a */
    public static void m4350a(MotionEvent motionEvent, Dialog dialog) {
        m4351b(motionEvent, dialog.getWindow());
    }

    /* renamed from: b */
    public static void m4351b(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !m4355f(window, motionEvent)) {
            return;
        }
        m4354e(window.getCurrentFocus());
    }

    /* renamed from: c */
    public static View m4352c(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (childAt != null && childAt.isShown() && m4358i(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return m4352c((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m4353d(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: e */
    public static void m4354e(View view) {
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
    public static boolean m4355f(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !m4357h(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && m4352c((ViewGroup) decorView, motionEvent) == null;
    }

    /* renamed from: g */
    public static boolean m4356g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - AbstractC5854b.m4347b(viewGroup.getContext()) > 0;
    }

    /* renamed from: h */
    public static boolean m4357h(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return m4356g((ViewGroup) window.getDecorView());
    }

    /* renamed from: i */
    public static boolean m4358i(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            int measuredWidth = view.getMeasuredWidth() + i6;
            int measuredHeight = view.getMeasuredHeight() + i7;
            if (motionEvent.getY() >= i7 && motionEvent.getY() <= measuredHeight && motionEvent.getX() >= i6 && motionEvent.getX() <= measuredWidth) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static void m4359j(a aVar) {
        if (f4490a.containsKey(aVar)) {
            AbstractC6619r.m7572a(f4490a.get(aVar));
            f4490a.remove(aVar);
        }
    }
}

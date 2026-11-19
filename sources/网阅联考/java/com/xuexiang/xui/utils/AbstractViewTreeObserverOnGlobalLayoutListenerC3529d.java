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

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes2.dex */
public abstract class AbstractViewTreeObserverOnGlobalLayoutListenerC3529d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static HashMap f3110a = new HashMap();

    /* renamed from: a */
    public static void m4052a(MotionEvent motionEvent, Dialog dialog) {
        m4053b(motionEvent, dialog.getWindow());
    }

    /* renamed from: b */
    public static void m4053b(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !m4056e(window, motionEvent)) {
            return;
        }
        m4055d(window.getCurrentFocus());
    }

    /* renamed from: c */
    public static View m4054c(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null && childAt.isShown() && m4059h(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return m4054c((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m4055d(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (view instanceof EditText) {
            view.clearFocus();
        }
    }

    /* renamed from: e */
    public static boolean m4056e(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !m4058g(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && m4054c((ViewGroup) decorView, motionEvent) == null;
    }

    /* renamed from: f */
    public static boolean m4057f(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - AbstractC3527b.m4049c(viewGroup.getContext()) > 0;
    }

    /* renamed from: g */
    public static boolean m4058g(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return m4057f((ViewGroup) window.getDecorView());
    }

    /* renamed from: h */
    public static boolean m4059h(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return motionEvent.getY() >= ((float) i5) && motionEvent.getY() <= ((float) (view.getMeasuredHeight() + i5)) && motionEvent.getX() >= ((float) i4) && motionEvent.getX() <= ((float) (view.getMeasuredWidth() + i4));
    }
}

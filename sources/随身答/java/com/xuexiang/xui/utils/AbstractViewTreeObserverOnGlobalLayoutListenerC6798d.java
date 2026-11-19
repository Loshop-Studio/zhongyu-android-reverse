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
import p217q.AbstractC9343a;

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewTreeObserverOnGlobalLayoutListenerC6798d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static HashMap f7024a = new HashMap();

    /* renamed from: com.xuexiang.xui.utils.d$a */
    public interface a {
    }

    /* renamed from: a */
    public static void m6446a(MotionEvent motionEvent, Dialog dialog) {
        m6447b(motionEvent, dialog.getWindow());
    }

    /* renamed from: b */
    public static void m6447b(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !m6451f(window, motionEvent)) {
            return;
        }
        m6450e(window.getCurrentFocus());
    }

    /* renamed from: c */
    public static View m6448c(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt != null && childAt.isShown() && m6454i(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return m6448c((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m6449d(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: e */
    public static void m6450e(View view) {
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
    public static boolean m6451f(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !m6453h(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && m6448c((ViewGroup) decorView, motionEvent) == null;
    }

    /* renamed from: g */
    public static boolean m6452g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - AbstractC6796b.m6443c(viewGroup.getContext()) > 0;
    }

    /* renamed from: h */
    public static boolean m6453h(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return m6452g((ViewGroup) window.getDecorView());
    }

    /* renamed from: i */
    public static boolean m6454i(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            int measuredWidth = view.getMeasuredWidth() + i9;
            int measuredHeight = view.getMeasuredHeight() + i10;
            if (motionEvent.getY() >= i10 && motionEvent.getY() <= measuredHeight && motionEvent.getX() >= i9 && motionEvent.getX() <= measuredWidth) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static void m6455j(a aVar) {
        if (f7024a.containsKey(aVar)) {
            AbstractC9343a.m15285a(f7024a.get(aVar));
            f7024a.remove(aVar);
        }
    }
}

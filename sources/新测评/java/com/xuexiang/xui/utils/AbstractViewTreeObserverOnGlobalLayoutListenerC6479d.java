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
import p137k.AbstractC7846r;

/* renamed from: com.xuexiang.xui.utils.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewTreeObserverOnGlobalLayoutListenerC6479d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static HashMap f5769a = new HashMap();

    /* renamed from: com.xuexiang.xui.utils.d$a */
    public interface a {
    }

    /* renamed from: a */
    public static void m5345a(MotionEvent motionEvent, Dialog dialog) {
        m5346b(motionEvent, dialog.getWindow());
    }

    /* renamed from: b */
    public static void m5346b(MotionEvent motionEvent, Window window) {
        if (motionEvent == null || window == null || motionEvent.getAction() != 0 || !m5350f(window, motionEvent)) {
            return;
        }
        m5349e(window.getCurrentFocus());
    }

    /* renamed from: c */
    public static View m5347c(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null && childAt.isShown() && m5353i(childAt, motionEvent)) {
                if (childAt instanceof EditText) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return m5347c((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m5348d(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: e */
    public static void m5349e(View view) {
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
    public static boolean m5350f(Window window, MotionEvent motionEvent) {
        if (window == null || motionEvent == null || !m5352h(window) || !(window.getCurrentFocus() instanceof EditText)) {
            return false;
        }
        View decorView = window.getDecorView();
        return (decorView instanceof ViewGroup) && m5347c((ViewGroup) decorView, motionEvent) == null;
    }

    /* renamed from: g */
    public static boolean m5351g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int height = viewGroup.getHeight();
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - AbstractC6477b.m5342b(viewGroup.getContext()) > 0;
    }

    /* renamed from: h */
    public static boolean m5352h(Window window) {
        if (window == null || !(window.getDecorView() instanceof ViewGroup)) {
            return false;
        }
        return m5351g((ViewGroup) window.getDecorView());
    }

    /* renamed from: i */
    public static boolean m5353i(View view, MotionEvent motionEvent) {
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

    /* renamed from: j */
    public static void m5354j(a aVar) {
        if (f5769a.containsKey(aVar)) {
            AbstractC7846r.m13306a(f5769a.get(aVar));
            f5769a.remove(aVar);
        }
    }
}

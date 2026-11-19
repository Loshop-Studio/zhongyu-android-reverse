package com.xuexiang.xui.utils;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.HashMap;
import p420y7.AbstractC11916b;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes5.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC8039e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    public static HashMap f15297g = new HashMap();

    /* renamed from: c */
    public a f15298c;

    /* renamed from: d */
    public View f15299d;

    /* renamed from: e */
    public Boolean f15300e = null;

    /* renamed from: f */
    public float f15301f;

    /* renamed from: com.xuexiang.xui.utils.e$a */
    public interface a {
        /* renamed from: a */
        void mo12199a(boolean z10);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC8039e(ViewGroup viewGroup, a aVar) {
        this.f15301f = 1.0f;
        this.f15298c = aVar;
        this.f15299d = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f15301f = viewGroup.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static void m12193a(ViewGroup viewGroup, a aVar) {
        m12197e(aVar);
        f15297g.put(aVar, new ViewTreeObserverOnGlobalLayoutListenerC8039e(viewGroup, aVar));
    }

    /* renamed from: b */
    public static void m12194b(MotionEvent motionEvent, Dialog dialog) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = dialog.getCurrentFocus();
            if (m12196d(currentFocus, motionEvent)) {
                m12195c(currentFocus);
            }
        }
    }

    /* renamed from: c */
    public static void m12195c(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC11916b.m26458b().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: d */
    public static boolean m12196d(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return motionEvent.getX() <= ((float) i10) || motionEvent.getX() >= ((float) (view.getWidth() + i10)) || motionEvent.getY() <= ((float) i11) || motionEvent.getY() >= ((float) (view.getHeight() + i11));
    }

    /* renamed from: e */
    public static void m12197e(a aVar) {
        if (f15297g.containsKey(aVar)) {
            ViewTreeObserverOnGlobalLayoutListenerC8039e viewTreeObserverOnGlobalLayoutListenerC8039e = (ViewTreeObserverOnGlobalLayoutListenerC8039e) f15297g.get(aVar);
            if (viewTreeObserverOnGlobalLayoutListenerC8039e != null) {
                viewTreeObserverOnGlobalLayoutListenerC8039e.m12198f();
            }
            f15297g.remove(aVar);
        }
    }

    /* renamed from: f */
    public final void m12198f() {
        this.f15298c = null;
        this.f15299d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f15299d.getWindowVisibleDisplayFrame(rect);
        boolean z10 = ((float) (this.f15299d.getRootView().getHeight() - (rect.bottom - rect.top))) / this.f15301f > 200.0f;
        if (this.f15298c != null) {
            Boolean bool = this.f15300e;
            if (bool == null || z10 != bool.booleanValue()) {
                this.f15300e = Boolean.valueOf(z10);
                this.f15298c.mo12199a(z10);
            }
        }
    }
}

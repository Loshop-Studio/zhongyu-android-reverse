package com.xuexiang.xui.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.xuexiang.xui.widget.XUIKeyboardScrollView;
import java.util.HashMap;
import p181v1.RunnableC6665a;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4152b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    public static final HashMap f3929e = new HashMap();

    /* renamed from: a */
    public XUIKeyboardScrollView f3930a;

    /* renamed from: b */
    public XUIKeyboardScrollView f3931b;

    /* renamed from: c */
    public Boolean f3932c;

    /* renamed from: d */
    public float f3933d;

    /* renamed from: a */
    public static void m3430a(XUIKeyboardScrollView xUIKeyboardScrollView) {
        HashMap map = f3929e;
        if (map.containsKey(xUIKeyboardScrollView)) {
            ViewTreeObserverOnGlobalLayoutListenerC4152b viewTreeObserverOnGlobalLayoutListenerC4152b = (ViewTreeObserverOnGlobalLayoutListenerC4152b) map.get(xUIKeyboardScrollView);
            if (viewTreeObserverOnGlobalLayoutListenerC4152b != null) {
                viewTreeObserverOnGlobalLayoutListenerC4152b.f3930a = null;
                viewTreeObserverOnGlobalLayoutListenerC4152b.f3931b.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4152b);
            }
            map.remove(xUIKeyboardScrollView);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        XUIKeyboardScrollView xUIKeyboardScrollView = this.f3931b;
        xUIKeyboardScrollView.getWindowVisibleDisplayFrame(rect);
        boolean z8 = ((float) (xUIKeyboardScrollView.getRootView().getHeight() - (rect.bottom - rect.top))) / this.f3933d > 200.0f;
        if (this.f3930a != null) {
            Boolean bool = this.f3932c;
            if (bool == null || z8 != bool.booleanValue()) {
                this.f3932c = Boolean.valueOf(z8);
                XUIKeyboardScrollView xUIKeyboardScrollView2 = this.f3930a;
                xUIKeyboardScrollView2.getClass();
                if (z8) {
                    xUIKeyboardScrollView2.postDelayed(new RunnableC6665a(xUIKeyboardScrollView2, 0), xUIKeyboardScrollView2.f3978c);
                } else {
                    xUIKeyboardScrollView2.postDelayed(new RunnableC6665a(xUIKeyboardScrollView2, 1), xUIKeyboardScrollView2.f3978c);
                }
            }
        }
    }
}

package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.ViewTreeObserverOnGlobalLayoutListenerC4152b;
import java.util.HashMap;
import p073h4.AbstractC5625a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class XUIKeyboardScrollView extends ScrollView {

    /* renamed from: a */
    public boolean f3976a;

    /* renamed from: b */
    public int f3977b;

    /* renamed from: c */
    public int f3978c;

    /* renamed from: d */
    public boolean f3979d;

    public XUIKeyboardScrollView(Context context) {
        super(context);
        this.f3979d = true;
    }

    /* renamed from: a */
    public final void m3440a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIKeyboardScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f3976a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XUIKeyboardScrollView_ksv_auto_scroll, false);
            this.f3977b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIKeyboardScrollView_ksv_scroll_height, AbstractC5625a.m4948h(getContext(), 40.0f));
            this.f3978c = typedArrayObtainStyledAttributes.getInt(R$styleable.XUIKeyboardScrollView_ksv_scroll_delay, 100);
            this.f3979d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XUIKeyboardScrollView_ksv_scroll_hide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f3976a) {
            ViewTreeObserverOnGlobalLayoutListenerC4152b.m3430a(this);
            HashMap map = ViewTreeObserverOnGlobalLayoutListenerC4152b.f3929e;
            ViewTreeObserverOnGlobalLayoutListenerC4152b viewTreeObserverOnGlobalLayoutListenerC4152b = new ViewTreeObserverOnGlobalLayoutListenerC4152b();
            viewTreeObserverOnGlobalLayoutListenerC4152b.f3932c = null;
            viewTreeObserverOnGlobalLayoutListenerC4152b.f3933d = 1.0f;
            viewTreeObserverOnGlobalLayoutListenerC4152b.f3930a = this;
            viewTreeObserverOnGlobalLayoutListenerC4152b.f3931b = this;
            getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4152b);
            viewTreeObserverOnGlobalLayoutListenerC4152b.f3933d = getResources().getDisplayMetrics().density;
            map.put(this, viewTreeObserverOnGlobalLayoutListenerC4152b);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.f3976a) {
            ViewTreeObserverOnGlobalLayoutListenerC4152b.m3430a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
        if (this.f3979d) {
            HashMap map = ViewTreeObserverOnGlobalLayoutListenerC4152b.f3929e;
            AbstractC6582a.m6217a();
            throw null;
        }
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3440a(context, attributeSet);
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3440a(context, attributeSet);
    }
}

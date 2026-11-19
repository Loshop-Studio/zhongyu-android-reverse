package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.ViewTreeObserverOnGlobalLayoutListenerC8039e;

/* loaded from: classes5.dex */
public class XUIKeyboardScrollView extends ScrollView implements ViewTreeObserverOnGlobalLayoutListenerC8039e.a {

    /* renamed from: c */
    public boolean f15317c;

    /* renamed from: d */
    public int f15318d;

    /* renamed from: e */
    public int f15319e;

    /* renamed from: f */
    public boolean f15320f;

    /* renamed from: com.xuexiang.xui.widget.XUIKeyboardScrollView$a */
    public class RunnableC8046a implements Runnable {
        public RunnableC8046a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XUIKeyboardScrollView xUIKeyboardScrollView = XUIKeyboardScrollView.this;
            xUIKeyboardScrollView.smoothScrollTo(0, xUIKeyboardScrollView.getScrollY() + XUIKeyboardScrollView.this.f15318d);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.XUIKeyboardScrollView$b */
    public class RunnableC8047b implements Runnable {
        public RunnableC8047b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XUIKeyboardScrollView.this.smoothScrollTo(0, 0);
        }
    }

    public XUIKeyboardScrollView(Context context) {
        super(context);
        this.f15320f = true;
    }

    @Override // com.xuexiang.xui.utils.ViewTreeObserverOnGlobalLayoutListenerC8039e.a
    /* renamed from: a */
    public void mo12199a(boolean z10) {
        if (z10) {
            postDelayed(new RunnableC8046a(), this.f15319e);
        } else {
            postDelayed(new RunnableC8047b(), this.f15319e);
        }
    }

    /* renamed from: c */
    public final void m12261c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIKeyboardScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f15317c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XUIKeyboardScrollView_ksv_auto_scroll, false);
            this.f15318d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.XUIKeyboardScrollView_ksv_scroll_height, AbstractC8037c.m12188b(getContext(), 40.0f));
            this.f15319e = typedArrayObtainStyledAttributes.getInt(R$styleable.XUIKeyboardScrollView_ksv_scroll_delay, 100);
            this.f15320f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.XUIKeyboardScrollView_ksv_scroll_hide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f15317c) {
            ViewTreeObserverOnGlobalLayoutListenerC8039e.m12193a(this, this);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f15317c) {
            ViewTreeObserverOnGlobalLayoutListenerC8039e.m12197e(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f15320f) {
            ViewTreeObserverOnGlobalLayoutListenerC8039e.m12195c(this);
        }
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12261c(context, attributeSet);
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12261c(context, attributeSet);
    }
}

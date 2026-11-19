package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$styleable;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class AutoFitLayout extends FrameLayout {

    /* renamed from: c */
    public boolean f17278c;

    /* renamed from: d */
    public float f17279d;

    /* renamed from: e */
    public float f17280e;

    /* renamed from: f */
    public WeakHashMap f17281f;

    public AutoFitLayout(Context context) {
        super(context);
        this.f17281f = new WeakHashMap();
        m13524a(context, null, 0);
    }

    /* renamed from: a */
    public final void m13524a(Context context, AttributeSet attributeSet, int i10) {
        boolean z10 = true;
        int dimensionPixelSize = -1;
        float f10 = -1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoFitTextView, i10, 0);
            z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoFitTextView_aftv_enable, true);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AutoFitTextView_aftv_minTextSize, -1);
            f10 = typedArrayObtainStyledAttributes.getFloat(R$styleable.AutoFitTextView_aftv_precision, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f17278c = z10;
        this.f17279d = dimensionPixelSize;
        this.f17280e = f10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            C8298a c8298aM13540n = C8298a.m13529e(textView).m13540n(this.f17278c);
            float f10 = this.f17280e;
            if (f10 > 0.0f) {
                c8298aM13540n.m13545s(f10);
            }
            float f11 = this.f17279d;
            if (f11 > 0.0f) {
                c8298aM13540n.m13544r(0, f11);
            }
            this.f17281f.put(textView, c8298aM13540n);
        }
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17281f = new WeakHashMap();
        m13524a(context, attributeSet, 0);
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17281f = new WeakHashMap();
        m13524a(context, attributeSet, i10);
    }
}

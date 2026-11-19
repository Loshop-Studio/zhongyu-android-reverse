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
import p157s3.C6556c;

/* loaded from: classes3.dex */
public class AutoFitLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f5020a;

    /* renamed from: b */
    public float f5021b;

    /* renamed from: c */
    public float f5022c;

    /* renamed from: d */
    public final WeakHashMap f5023d;

    public AutoFitLayout(Context context) {
        super(context);
        this.f5023d = new WeakHashMap();
        m3614a(context, null, 0);
    }

    /* renamed from: a */
    public final void m3614a(Context context, AttributeSet attributeSet, int i) {
        boolean z8 = true;
        int dimensionPixelSize = -1;
        float f = -1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoFitTextView, i, 0);
            z8 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoFitTextView_aftv_enable, true);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AutoFitTextView_aftv_minTextSize, -1);
            f = typedArrayObtainStyledAttributes.getFloat(R$styleable.AutoFitTextView_aftv_precision, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5020a = z8;
        this.f5021b = dimensionPixelSize;
        this.f5022c = f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            C6556c c6556cM6195b = C6556c.m6195b(textView, null, 0);
            c6556cM6195b.m6198d(this.f5020a);
            float f = this.f5022c;
            if (f > 0.0f && c6556cM6195b.f10952g != f) {
                c6556cM6195b.f10952g = f;
                c6556cM6195b.m6197a();
            }
            float f7 = this.f5021b;
            if (f7 > 0.0f) {
                c6556cM6195b.m6199e(f7, 0);
            }
            this.f5023d.put(textView, c6556cM6195b);
        }
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5023d = new WeakHashMap();
        m3614a(context, attributeSet, 0);
    }

    public AutoFitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5023d = new WeakHashMap();
        m3614a(context, attributeSet, i);
    }
}

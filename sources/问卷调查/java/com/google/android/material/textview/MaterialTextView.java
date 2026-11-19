package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p014h.C0113w;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;

/* loaded from: classes.dex */
public class MaterialTextView extends C0113w {
    public MaterialTextView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(C0563a.m2100a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (C0562a.m2095p(context2, C1088R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C0564b.f3522q;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iM2713f = m2713f(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM2713f != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m2714e(theme, resourceId);
            }
        }
    }

    /* renamed from: f */
    public static int m2713f(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    /* renamed from: e */
    public final void m2714e(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, C0564b.f3521p);
        int iM2713f = m2713f(getContext(), typedArrayObtainStyledAttributes, 0, 1);
        typedArrayObtainStyledAttributes.recycle();
        if (iM2713f >= 0) {
            setLineHeight(iM2713f);
        }
    }

    @Override // p000a.p005b.p014h.C0113w, android.widget.TextView
    public void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (C0562a.m2095p(context, C1088R.attr.textAppearanceLineHeightEnabled, true)) {
            m2714e(context.getTheme(), i);
        }
    }
}

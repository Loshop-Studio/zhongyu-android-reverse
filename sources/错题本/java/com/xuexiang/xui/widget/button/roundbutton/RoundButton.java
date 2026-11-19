package com.xuexiang.xui.widget.button.roundbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.R$styleable;
import p050e2.AbstractC5454a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class RoundButton extends AppCompatButton {
    public RoundButton(Context context) {
        super(context);
        m3469a(context, null);
        throw null;
    }

    /* renamed from: a */
    public static void m3469a(Context context, AttributeSet attributeSet) {
        int i = AbstractC5454a.f8423a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundButton);
        typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundButton_rb_backgroundColor);
        typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundButton_rb_borderColor);
        AbstractC6582a.m6217a();
        throw null;
    }

    public RoundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3469a(context, attributeSet);
        throw null;
    }

    public RoundButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3469a(context, attributeSet);
        throw null;
    }
}

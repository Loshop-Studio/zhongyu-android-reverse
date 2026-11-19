package com.xuexiang.xui.widget.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.SpanUtils;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: d */
    public GradientDrawable f15537d;

    /* renamed from: e */
    public int f15538e;

    /* renamed from: f */
    public int f15539f;

    public ButtonView(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void m12423c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonView);
        this.f15538e = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSolidColor, 0);
        this.f15539f = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSelectedSolidColor, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textStrokeColor, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRadius, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textLeftTopRadius, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textLeftBottomRadius, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRightTopRadius, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRightBottomRadius, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textStrokeWidth, 0);
        Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.ButtonView_textDrawable);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textNormalTextColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSelectedTextColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f15537d = gradientDrawable;
        gradientDrawable.setStroke(dimensionPixelSize6, color);
        this.f15537d.setColor(this.f15538e);
        if (dimensionPixelSize > 0) {
            this.f15537d.setCornerRadius(dimensionPixelSize);
        } else if (dimensionPixelSize2 > 0 || dimensionPixelSize3 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            float f10 = dimensionPixelSize2;
            float f11 = dimensionPixelSize4;
            float f12 = dimensionPixelSize5;
            float f13 = dimensionPixelSize3;
            this.f15537d.setCornerRadii(new float[]{f10, f10, f11, f11, f12, f12, f13, f13});
        }
        setBackgroundDrawable(this.f15537d);
        if (drawableM12206g != null) {
            m12424d(drawableM12206g, 20);
        }
        if (color2 != 0 && color3 != 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 1);
            iArr[0] = new int[]{R.attr.state_selected};
            iArr[1] = new int[]{R.attr.state_pressed};
            iArr[2] = new int[0];
            setTextColor(new ColorStateList(iArr, new int[]{color3, color3, color2}));
        }
        if (color3 == 0 && this.f15539f == 0) {
            setClickable(false);
        } else {
            setClickable(true);
        }
    }

    /* renamed from: d */
    public ButtonView m12424d(Drawable drawable, int i10) {
        setText(new SpanUtils().m12167b(drawable, 1).m12168c(i10, 0).m12166a(getText()).m12172g(0).m12171f());
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f15539f != 0 && isEnabled()) {
                this.f15537d.setColor(this.f15539f);
                setBackgroundDrawable(this.f15537d);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f15539f != 0) {
            this.f15537d.setColor(this.f15538e);
            setBackgroundDrawable(this.f15537d);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ButtonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12423c(context, attributeSet);
    }

    public ButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12423c(context, attributeSet);
    }
}

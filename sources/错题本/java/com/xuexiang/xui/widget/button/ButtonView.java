package com.xuexiang.xui.widget.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.C4159i;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class ButtonView extends AppCompatTextView {

    /* renamed from: b */
    public GradientDrawable f4071b;

    /* renamed from: c */
    public int f4072c;

    /* renamed from: d */
    public int f4073d;

    public ButtonView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void m3462b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonView);
        this.f4072c = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSolidColor, 0);
        this.f4073d = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSelectedSolidColor, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textStrokeColor, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRadius, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textLeftTopRadius, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textLeftBottomRadius, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRightTopRadius, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textRightBottomRadius, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ButtonView_textStrokeWidth, 0);
        getContext();
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ButtonView_textDrawable);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textNormalTextColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.ButtonView_textSelectedTextColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f4071b = gradientDrawable;
        gradientDrawable.setStroke(dimensionPixelSize6, color);
        this.f4071b.setColor(this.f4072c);
        if (dimensionPixelSize > 0) {
            this.f4071b.setCornerRadius(dimensionPixelSize);
        } else if (dimensionPixelSize2 > 0 || dimensionPixelSize3 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            float f = dimensionPixelSize2;
            float f7 = dimensionPixelSize4;
            float f8 = dimensionPixelSize5;
            float f9 = dimensionPixelSize3;
            this.f4071b.setCornerRadii(new float[]{f, f, f7, f7, f8, f8, f9, f9});
        }
        setBackgroundDrawable(this.f4071b);
        if (drawable != null) {
            C4159i c4159i = new C4159i();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            c4159i.f3963t = spannableStringBuilder;
            c4159i.f3944a = "";
            c4159i.m3433b();
            c4159i.m3432a();
            c4159i.f3964u = 1;
            c4159i.f3959p = drawable;
            c4159i.f3961r = 1;
            c4159i.m3432a();
            c4159i.f3964u = 2;
            c4159i.f3962s = 20;
            CharSequence text = getText();
            c4159i.m3432a();
            c4159i.f3964u = 0;
            c4159i.f3944a = text;
            c4159i.f3947d = 0;
            c4159i.m3432a();
            setText(spannableStringBuilder);
        }
        if (color2 != 0 && color3 != 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 1);
            iArr[0] = new int[]{R.attr.state_selected};
            iArr[1] = new int[]{R.attr.state_pressed};
            iArr[2] = new int[0];
            setTextColor(new ColorStateList(iArr, new int[]{color3, color3, color2}));
        }
        if (color3 == 0 && this.f4073d == 0) {
            setClickable(false);
        } else {
            setClickable(true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f4073d != 0 && isEnabled()) {
                this.f4071b.setColor(this.f4073d);
                setBackgroundDrawable(this.f4071b);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f4073d != 0) {
            this.f4071b.setColor(this.f4072c);
            setBackgroundDrawable(this.f4071b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3462b(context, attributeSet);
    }

    public ButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3462b(context, attributeSet);
    }
}

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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.SpanUtils;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class ButtonView extends AppCompatTextView {
    private GradientDrawable gradientDrawable;
    private int mNormalSolidColor;
    private int mSelectedSolidColor;

    public ButtonView(Context context) {
        super(context);
    }

    private void setAttributeSet(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ButtonView);
        this.mNormalSolidColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ButtonView_textSolidColor, 0);
        this.mSelectedSolidColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ButtonView_textSelectedSolidColor, 0);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ButtonView_textStrokeColor, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textRadius, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textLeftTopRadius, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textLeftBottomRadius, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textRightTopRadius, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textRightBottomRadius, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ButtonView_textStrokeWidth, 0);
        Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.ButtonView_textDrawable);
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ButtonView_textNormalTextColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ButtonView_textSelectedTextColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        gradientDrawable.setStroke(dimensionPixelSize6, color);
        this.gradientDrawable.setColor(this.mNormalSolidColor);
        if (dimensionPixelSize > 0) {
            this.gradientDrawable.setCornerRadius(dimensionPixelSize);
        } else if (dimensionPixelSize2 > 0 || dimensionPixelSize3 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            float f4 = dimensionPixelSize2;
            float f5 = dimensionPixelSize4;
            float f6 = dimensionPixelSize5;
            float f7 = dimensionPixelSize3;
            this.gradientDrawable.setCornerRadii(new float[]{f4, f4, f5, f5, f6, f6, f7, f7});
        }
        setBackgroundDrawable(this.gradientDrawable);
        if (drawableAttrRes != null) {
            setTextDrawable(drawableAttrRes, 20);
        }
        if (color2 != 0 && color3 != 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 3, 1);
            iArr[0] = new int[]{R.attr.state_selected};
            iArr[1] = new int[]{R.attr.state_pressed};
            iArr[2] = new int[0];
            setTextColor(new ColorStateList(iArr, new int[]{color3, color3, color2}));
        }
        if (color3 == 0 && this.mSelectedSolidColor == 0) {
            setClickable(false);
        } else {
            setClickable(true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.mSelectedSolidColor != 0 && isEnabled()) {
                this.gradientDrawable.setColor(this.mSelectedSolidColor);
                setBackgroundDrawable(this.gradientDrawable);
                postInvalidate();
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.mSelectedSolidColor != 0) {
            this.gradientDrawable.setColor(this.mNormalSolidColor);
            setBackgroundDrawable(this.gradientDrawable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ButtonView setRadius(int i4, int i5, int i6, int i7) {
        float f4 = i4;
        float f5 = i6;
        float f6 = i7;
        float f7 = i5;
        this.gradientDrawable.setCornerRadii(new float[]{f4, f4, f5, f5, f6, f6, f7, f7});
        setBackgroundDrawable(this.gradientDrawable);
        return this;
    }

    public ButtonView setSelectedSolidColor(int i4) {
        if (i4 != 0) {
            setClickable(true);
            this.mSelectedSolidColor = i4;
        } else {
            setClickable(false);
        }
        return this;
    }

    public ButtonView setSelectedTextColor(int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            setClickable(false);
        } else {
            setClickable(true);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 3, 1);
            iArr[0] = new int[]{R.attr.state_selected};
            iArr[1] = new int[]{R.attr.state_pressed};
            iArr[2] = new int[0];
            setTextColor(new ColorStateList(iArr, new int[]{i5, i5, i4}));
        }
        return this;
    }

    public ButtonView setSolidColor(int i4) {
        this.gradientDrawable.setColor(i4);
        setBackgroundDrawable(this.gradientDrawable);
        return this;
    }

    public ButtonView setStrokeColorAndWidth(int i4, int i5) {
        this.gradientDrawable.setStroke(i4, i5);
        return this;
    }

    public ButtonView setTextDrawable(int i4, int i5) {
        if (i4 != 0) {
            setTextDrawable(getResources().getDrawable(i4), i5);
        }
        return this;
    }

    public ButtonView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setAttributeSet(context, attributeSet);
    }

    public ButtonView setTextDrawable(Drawable drawable, int i4) {
        setText(new SpanUtils().appendImage(drawable, 1).appendSpace(i4, 0).append(getText()).setBackgroundColor(0).create());
        return this;
    }

    public ButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAttributeSet(context, attributeSet);
    }
}

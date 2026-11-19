package com.xuexiang.xui.widget.button.roundbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class RoundDrawable extends GradientDrawable {
    private ColorStateList mFillColors;
    private ColorStateList mStrokeColors;
    private boolean mRadiusAdjustBounds = true;
    private int mStrokeWidth = 0;

    public static RoundDrawable fromAttributeSet(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RoundButton);
        ColorStateList colorStateListAttrRes = ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.RoundButton_rb_backgroundColor);
        ColorStateList colorStateListAttrRes2 = ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.RoundButton_rb_borderColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_borderWidth, ResUtils.getDimensionPixelSize(C2042R.dimen.default_rb_border_width));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RoundButton_rb_isRadiusAdjustBounds, false);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_radius, ResUtils.getDimensionPixelSize(C2042R.dimen.default_rb_radius));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_radiusTopLeft, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_radiusTopRight, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_radiusBottomLeft, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RoundButton_rb_radiusBottomRight, 0);
        typedArrayObtainStyledAttributes.recycle();
        RoundDrawable roundDrawable = new RoundDrawable();
        roundDrawable.setBgData(colorStateListAttrRes);
        roundDrawable.setStrokeData(dimensionPixelSize, colorStateListAttrRes2);
        roundDrawable.setIsRadiusAdjustBounds(z3);
        if (dimensionPixelSize3 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0 || dimensionPixelSize6 > 0) {
            float f4 = dimensionPixelSize3;
            float f5 = dimensionPixelSize4;
            float f6 = dimensionPixelSize6;
            float f7 = dimensionPixelSize5;
            roundDrawable.setCornerRadii(new float[]{f4, f4, f5, f5, f6, f6, f7, f7});
        } else {
            roundDrawable.setCornerRadius(dimensionPixelSize2);
        }
        return roundDrawable;
    }

    private boolean hasNativeStateListAPI() {
        return true;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.mFillColors;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.mStrokeColors) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.mRadiusAdjustBounds) {
            setCornerRadius(Math.min(rect.width(), rect.height()) / 2.0f);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.mFillColors;
        if (colorStateList != null) {
            setColor(colorStateList.getColorForState(iArr, 0));
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.mStrokeColors;
        if (colorStateList2 == null) {
            return zOnStateChange;
        }
        setStroke(this.mStrokeWidth, colorStateList2.getColorForState(iArr, 0));
        return true;
    }

    public void setBgData(ColorStateList colorStateList) {
        if (hasNativeStateListAPI()) {
            super.setColor(colorStateList);
        } else {
            this.mFillColors = colorStateList;
            setColor(colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
        }
    }

    public void setIsRadiusAdjustBounds(boolean z3) {
        this.mRadiusAdjustBounds = z3;
    }

    public void setStrokeData(int i4, ColorStateList colorStateList) {
        if (hasNativeStateListAPI()) {
            super.setStroke(i4, colorStateList);
            return;
        }
        this.mStrokeWidth = i4;
        this.mStrokeColors = colorStateList;
        setStroke(i4, colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
    }
}

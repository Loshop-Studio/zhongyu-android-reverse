package p176h8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* renamed from: h8.a */
/* loaded from: classes5.dex */
public class C9500a extends GradientDrawable {

    /* renamed from: b */
    public ColorStateList f21976b;

    /* renamed from: d */
    public ColorStateList f21978d;

    /* renamed from: a */
    public boolean f21975a = true;

    /* renamed from: c */
    public int f21977c = 0;

    /* renamed from: a */
    public static C9500a m18717a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundButton);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundButton_rb_backgroundColor);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RoundButton_rb_borderColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_borderWidth, AbstractC8040f.m12204e(R$dimen.default_rb_border_width));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundButton_rb_isRadiusAdjustBounds, false);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radius, AbstractC8040f.m12204e(R$dimen.default_rb_radius));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusTopLeft, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusTopRight, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusBottomLeft, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusBottomRight, 0);
        typedArrayObtainStyledAttributes.recycle();
        C9500a c9500a = new C9500a();
        c9500a.m18719c(colorStateList);
        c9500a.m18721e(dimensionPixelSize, colorStateList2);
        c9500a.m18720d(z10);
        if (dimensionPixelSize3 <= 0 && dimensionPixelSize4 <= 0 && dimensionPixelSize5 <= 0 && dimensionPixelSize6 <= 0) {
            c9500a.setCornerRadius(dimensionPixelSize2);
            return c9500a;
        }
        float f10 = dimensionPixelSize3;
        float f11 = dimensionPixelSize4;
        float f12 = dimensionPixelSize6;
        float f13 = dimensionPixelSize5;
        c9500a.setCornerRadii(new float[]{f10, f10, f11, f11, f12, f12, f13, f13});
        return c9500a;
    }

    /* renamed from: b */
    public final boolean m18718b() {
        return true;
    }

    /* renamed from: c */
    public void m18719c(ColorStateList colorStateList) {
        if (m18718b()) {
            super.setColor(colorStateList);
        } else {
            this.f21976b = colorStateList;
            setColor(colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
        }
    }

    /* renamed from: d */
    public void m18720d(boolean z10) {
        this.f21975a = z10;
    }

    /* renamed from: e */
    public void m18721e(int i10, ColorStateList colorStateList) {
        if (m18718b()) {
            super.setStroke(i10, colorStateList);
            return;
        }
        this.f21977c = i10;
        this.f21978d = colorStateList;
        setStroke(i10, colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f21976b;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f21978d;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f21975a) {
            setCornerRadius(Math.min(rect.width(), rect.height()) / 2.0f);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f21976b;
        if (colorStateList != null) {
            setColor(colorStateList.getColorForState(iArr, 0));
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f21978d;
        if (colorStateList2 == null) {
            return zOnStateChange;
        }
        setStroke(this.f21977c, colorStateList2.getColorForState(iArr, 0));
        return true;
    }
}

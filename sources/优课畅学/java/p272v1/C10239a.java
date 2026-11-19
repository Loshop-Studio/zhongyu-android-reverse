package p272v1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6875e;

/* renamed from: v1.a */
/* loaded from: classes4.dex */
public class C10239a extends GradientDrawable {

    /* renamed from: b */
    public ColorStateList f20429b;

    /* renamed from: d */
    public ColorStateList f20431d;

    /* renamed from: a */
    public boolean f20428a = true;

    /* renamed from: c */
    public int f20430c = 0;

    /* renamed from: a */
    public static C10239a m19153a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundButton);
        ColorStateList colorStateListM6448d = AbstractC6875e.m6448d(context, typedArrayObtainStyledAttributes, R$styleable.RoundButton_rb_backgroundColor);
        ColorStateList colorStateListM6448d2 = AbstractC6875e.m6448d(context, typedArrayObtainStyledAttributes, R$styleable.RoundButton_rb_borderColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_borderWidth, AbstractC6875e.m6450f(context, R$dimen.default_rb_border_width));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RoundButton_rb_isRadiusAdjustBounds, false);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radius, AbstractC6875e.m6450f(context, R$dimen.default_rb_radius));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusTopLeft, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusTopRight, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusBottomLeft, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundButton_rb_radiusBottomRight, 0);
        typedArrayObtainStyledAttributes.recycle();
        C10239a c10239a = new C10239a();
        c10239a.m19155c(colorStateListM6448d);
        c10239a.m19157e(dimensionPixelSize, colorStateListM6448d2);
        c10239a.m19156d(z10);
        if (dimensionPixelSize3 <= 0 && dimensionPixelSize4 <= 0 && dimensionPixelSize5 <= 0 && dimensionPixelSize6 <= 0) {
            c10239a.setCornerRadius(dimensionPixelSize2);
            return c10239a;
        }
        float f10 = dimensionPixelSize3;
        float f11 = dimensionPixelSize4;
        float f12 = dimensionPixelSize6;
        float f13 = dimensionPixelSize5;
        c10239a.setCornerRadii(new float[]{f10, f10, f11, f11, f12, f12, f13, f13});
        return c10239a;
    }

    /* renamed from: b */
    public final boolean m19154b() {
        return true;
    }

    /* renamed from: c */
    public void m19155c(ColorStateList colorStateList) {
        if (m19154b()) {
            super.setColor(colorStateList);
        } else {
            this.f20429b = colorStateList;
            setColor(colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
        }
    }

    /* renamed from: d */
    public void m19156d(boolean z10) {
        this.f20428a = z10;
    }

    /* renamed from: e */
    public void m19157e(int i10, ColorStateList colorStateList) {
        if (m19154b()) {
            super.setStroke(i10, colorStateList);
            return;
        }
        this.f20430c = i10;
        this.f20431d = colorStateList;
        setStroke(i10, colorStateList != null ? colorStateList.getColorForState(getState(), 0) : 0);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f20429b;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f20431d;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f20428a) {
            setCornerRadius(Math.min(rect.width(), rect.height()) / 2.0f);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f20429b;
        if (colorStateList != null) {
            setColor(colorStateList.getColorForState(iArr, 0));
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f20431d;
        if (colorStateList2 == null) {
            return zOnStateChange;
        }
        setStroke(this.f20430c, colorStateList2.getColorForState(iArr, 0));
        return true;
    }
}

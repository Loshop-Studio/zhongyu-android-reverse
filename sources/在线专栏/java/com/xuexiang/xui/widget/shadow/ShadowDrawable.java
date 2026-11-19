package com.xuexiang.xui.widget.shadow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0358u;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class ShadowDrawable extends Drawable {
    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUND = 1;
    private int[] mBgColor;
    private Paint mBgPaint;
    private int mOffsetX;
    private int mOffsetY;
    private RectF mRect;
    private Paint mShadowPaint;
    private int mShadowRadius;
    private int mShape;
    private int mShapeRadius;

    public static class Builder {
        public static final int DEFAULT_SHADOW_COLOR = Color.parseColor("#4d000000");
        private int mShape = 0;
        private int mShapeRadius = 10;
        private int mShadowColor = DEFAULT_SHADOW_COLOR;
        private int mShadowRadius = 16;
        private int mOffsetX = 0;
        private int mOffsetY = 0;
        private int[] mBgColor = {0};

        public ShadowDrawable build() {
            return new ShadowDrawable(this.mShape, this.mBgColor, this.mShapeRadius, this.mShadowColor, this.mShadowRadius, this.mOffsetX, this.mOffsetY);
        }

        public Builder setBgColor(int i4) {
            this.mBgColor[0] = i4;
            return this;
        }

        public Builder setOffsetX(int i4) {
            this.mOffsetX = i4;
            return this;
        }

        public Builder setOffsetY(int i4) {
            this.mOffsetY = i4;
            return this;
        }

        public Builder setShadowColor(int i4) {
            this.mShadowColor = i4;
            return this;
        }

        public Builder setShadowRadius(int i4) {
            this.mShadowRadius = i4;
            return this;
        }

        public Builder setShape(int i4) {
            this.mShape = i4;
            return this;
        }

        public Builder setShapeRadius(int i4) {
            this.mShapeRadius = i4;
            return this;
        }

        public Builder setBgColor(int[] iArr) {
            this.mBgColor = iArr;
            return this;
        }
    }

    public static ShadowDrawable fromAttributeSet(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.ShadowDrawable);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowDrawable_sd_shadowRadius, ResUtils.getDimensionPixelSize(C2042R.dimen.default_sd_shadow_radius));
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowDrawable_sd_shadowColor, Builder.DEFAULT_SHADOW_COLOR);
        int i4 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ShadowDrawable_sd_shapeType, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowDrawable_sd_shapeRadius, ResUtils.getDimensionPixelSize(C2042R.dimen.default_sd_shape_radius));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowDrawable_sd_offsetX, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.ShadowDrawable_sd_offsetY, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowDrawable_sd_bgColor, ResUtils.getColor(C2042R.color.xui_config_color_white));
        int color3 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.ShadowDrawable_sd_secondBgColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        Builder offsetY = new Builder().setShape(i4).setShapeRadius(dimensionPixelSize2).setShadowColor(color).setShadowRadius(dimensionPixelSize).setOffsetX(dimensionPixelSize3).setOffsetY(dimensionPixelSize4);
        if (color3 != -1) {
            offsetY.setBgColor(new int[]{color2, color3});
        } else {
            offsetY.setBgColor(color2);
        }
        return offsetY.build();
    }

    public static void setShadowDrawable(View view, Drawable drawable) {
        view.setLayerType(1, null);
        C0358u.m2057t0(view, drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int[] iArr = this.mBgColor;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.mBgPaint.setColor(iArr[0]);
            } else {
                Paint paint = this.mBgPaint;
                RectF rectF = this.mRect;
                float f4 = rectF.left;
                float fHeight = rectF.height() / 2.0f;
                RectF rectF2 = this.mRect;
                paint.setShader(new LinearGradient(f4, fHeight, rectF2.right, rectF2.height() / 2.0f, this.mBgColor, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.mShape != 0) {
            canvas.drawCircle(this.mRect.centerX(), this.mRect.centerY(), Math.min(this.mRect.width(), this.mRect.height()) / 2.0f, this.mShadowPaint);
            canvas.drawCircle(this.mRect.centerX(), this.mRect.centerY(), Math.min(this.mRect.width(), this.mRect.height()) / 2.0f, this.mBgPaint);
            return;
        }
        RectF rectF3 = this.mRect;
        int i4 = this.mShapeRadius;
        canvas.drawRoundRect(rectF3, i4, i4, this.mShadowPaint);
        RectF rectF4 = this.mRect;
        int i5 = this.mShapeRadius;
        canvas.drawRoundRect(rectF4, i5, i5, this.mBgPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.mShadowPaint.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, i7);
        int i8 = this.mShadowRadius;
        int i9 = this.mOffsetX;
        int i10 = this.mOffsetY;
        this.mRect = new RectF((i4 + i8) - i9, (i5 + i8) - i10, (i6 - i8) - i9, (i7 - i8) - i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mShadowPaint.setColorFilter(colorFilter);
    }

    private ShadowDrawable(int i4, int[] iArr, int i5, int i6, int i7, int i8, int i9) {
        this.mShape = i4;
        this.mBgColor = iArr;
        this.mShapeRadius = i5;
        this.mShadowRadius = i7;
        this.mOffsetX = i8;
        this.mOffsetY = i9;
        Paint paint = new Paint();
        this.mShadowPaint = paint;
        paint.setColor(0);
        this.mShadowPaint.setAntiAlias(true);
        this.mShadowPaint.setShadowLayer(i7, i8, i9, i6);
        this.mShadowPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.mBgPaint = paint2;
        paint2.setAntiAlias(true);
    }

    public static void setShadowDrawable(View view, int i4, int i5, int i6, int i7, int i8) {
        ShadowDrawable shadowDrawableBuild = new Builder().setShapeRadius(i4).setShadowColor(i5).setShadowRadius(i6).setOffsetX(i7).setOffsetY(i8).build();
        view.setLayerType(1, null);
        C0358u.m2057t0(view, shadowDrawableBuild);
    }

    public static void setShadowDrawable(View view, int i4, int i5, int i6, int i7, int i8, int i9) {
        ShadowDrawable shadowDrawableBuild = new Builder().setBgColor(i4).setShapeRadius(i5).setShadowColor(i6).setShadowRadius(i7).setOffsetX(i8).setOffsetY(i9).build();
        view.setLayerType(1, null);
        C0358u.m2057t0(view, shadowDrawableBuild);
    }

    public static void setShadowDrawable(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ShadowDrawable shadowDrawableBuild = new Builder().setShape(i4).setBgColor(i5).setShapeRadius(i6).setShadowColor(i7).setShadowRadius(i8).setOffsetX(i9).setOffsetY(i10).build();
        view.setLayerType(1, null);
        C0358u.m2057t0(view, shadowDrawableBuild);
    }

    public static void setShadowDrawable(View view, int[] iArr, int i4, int i5, int i6, int i7, int i8) {
        ShadowDrawable shadowDrawableBuild = new Builder().setBgColor(iArr).setShapeRadius(i4).setShadowColor(i5).setShadowRadius(i6).setOffsetX(i7).setOffsetY(i8).build();
        view.setLayerType(1, null);
        C0358u.m2057t0(view, shadowDrawableBuild);
    }
}

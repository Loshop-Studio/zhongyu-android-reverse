package com.blankj.utilcode.util;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class ShadowUtils {
    private static final int SHADOW_TAG = -16;

    public static class Config {
        private static final int SHADOW_COLOR_DEFAULT = 1140850688;
        private static final int SHADOW_SIZE = UtilsBridge.dp2px(8.0f);
        private float mShadowRadius = -1.0f;
        private float mShadowSizeNormal = -1.0f;
        private float mShadowSizePressed = -1.0f;
        private float mShadowMaxSizeNormal = -1.0f;
        private float mShadowMaxSizePressed = -1.0f;
        private int mShadowColorNormal = SHADOW_COLOR_DEFAULT;
        private int mShadowColorPressed = SHADOW_COLOR_DEFAULT;
        private boolean isCircle = false;

        private float getShadowMaxSizeNormal() {
            if (this.mShadowMaxSizeNormal == -1.0f) {
                this.mShadowMaxSizeNormal = getShadowSizeNormal();
            }
            return this.mShadowMaxSizeNormal;
        }

        private float getShadowMaxSizePressed() {
            if (this.mShadowMaxSizePressed == -1.0f) {
                this.mShadowMaxSizePressed = getShadowSizePressed();
            }
            return this.mShadowMaxSizePressed;
        }

        private float getShadowRadius() {
            if (this.mShadowRadius < 0.0f) {
                this.mShadowRadius = 0.0f;
            }
            return this.mShadowRadius;
        }

        private float getShadowSizeNormal() {
            if (this.mShadowSizeNormal == -1.0f) {
                this.mShadowSizeNormal = SHADOW_SIZE;
            }
            return this.mShadowSizeNormal;
        }

        private float getShadowSizePressed() {
            if (this.mShadowSizePressed == -1.0f) {
                this.mShadowSizePressed = getShadowSizeNormal();
            }
            return this.mShadowSizePressed;
        }

        public Drawable apply(Drawable drawable) {
            if (drawable == null) {
                drawable = new ColorDrawable(0);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = drawable;
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ShadowDrawable(drawable2, getShadowRadius(), getShadowSizeNormal(), getShadowMaxSizeNormal(), this.mShadowColorPressed, this.isCircle));
            stateListDrawable.addState(StateSet.WILD_CARD, new ShadowDrawable(drawable2, getShadowRadius(), getShadowSizePressed(), getShadowMaxSizePressed(), this.mShadowColorNormal, this.isCircle));
            return stateListDrawable;
        }

        public Config setCircle() {
            this.isCircle = true;
            if (this.mShadowRadius == -1.0f) {
                return this;
            }
            throw new IllegalArgumentException("Set circle needn't set radius.");
        }

        public Config setShadowColor(int i4) {
            return setShadowColor(i4, i4);
        }

        public Config setShadowMaxSize(int i4) {
            return setShadowMaxSize(i4, i4);
        }

        public Config setShadowRadius(float f4) {
            this.mShadowRadius = f4;
            if (this.isCircle) {
                throw new IllegalArgumentException("Set circle needn't set radius.");
            }
            return this;
        }

        public Config setShadowSize(int i4) {
            return setShadowSize(i4, i4);
        }

        public Config setShadowColor(int i4, int i5) {
            this.mShadowColorNormal = i4;
            this.mShadowColorPressed = i5;
            return this;
        }

        public Config setShadowMaxSize(int i4, int i5) {
            this.mShadowMaxSizeNormal = i4;
            this.mShadowMaxSizePressed = i5;
            return this;
        }

        public Config setShadowSize(int i4, int i5) {
            this.mShadowSizeNormal = i4;
            this.mShadowSizePressed = i5;
            return this;
        }
    }

    public static class DrawableWrapper extends Drawable implements Drawable.Callback {
        private Drawable mDrawable;

        public DrawableWrapper(Drawable drawable) {
            setWrappedDrawable(drawable);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.mDrawable.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getChangingConfigurations() {
            return this.mDrawable.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable getCurrent() {
            return this.mDrawable.getCurrent();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.mDrawable.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.mDrawable.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return this.mDrawable.getMinimumHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return this.mDrawable.getMinimumWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.mDrawable.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return this.mDrawable.getPadding(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public int[] getState() {
            return this.mDrawable.getState();
        }

        @Override // android.graphics.drawable.Drawable
        public Region getTransparentRegion() {
            return this.mDrawable.getTransparentRegion();
        }

        public Drawable getWrappedDrawable() {
            return this.mDrawable;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isAutoMirrored() {
            return DrawableCompat.isAutoMirrored(this.mDrawable);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.mDrawable.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
            DrawableCompat.jumpToCurrentState(this.mDrawable);
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.mDrawable.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean onLevelChange(int i4) {
            return this.mDrawable.setLevel(i4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            this.mDrawable.setAlpha(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean z3) {
            DrawableCompat.setAutoMirrored(this.mDrawable, z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int i4) {
            this.mDrawable.setChangingConfigurations(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.mDrawable.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z3) {
            this.mDrawable.setDither(z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z3) {
            this.mDrawable.setFilterBitmap(z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            DrawableCompat.setHotspot(this.mDrawable, f4, f5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            DrawableCompat.setHotspotBounds(this.mDrawable, i4, i5, i6, i7);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            return this.mDrawable.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int i4) {
            DrawableCompat.setTint(this.mDrawable, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintList(ColorStateList colorStateList) {
            DrawableCompat.setTintList(this.mDrawable, colorStateList);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintMode(PorterDuff.Mode mode) {
            DrawableCompat.setTintMode(this.mDrawable, mode);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            return super.setVisible(z3, z4) || this.mDrawable.setVisible(z3, z4);
        }

        public void setWrappedDrawable(Drawable drawable) {
            Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.mDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    public static void apply(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            apply(view, new Config());
        }
    }

    public static void apply(View view, Config config) {
        if (view == null || config == null) {
            return;
        }
        Drawable background = view.getBackground();
        Object tag = view.getTag(SHADOW_TAG);
        if (tag instanceof Drawable) {
            ViewCompat.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable drawableApply = config.apply(background);
        ViewCompat.setBackground(view, drawableApply);
        view.setTag(SHADOW_TAG, drawableApply);
    }

    public static class ShadowDrawable extends DrawableWrapper {
        private static final double COS_45 = Math.cos(Math.toRadians(45.0d));
        private boolean isCircle;
        private boolean mAddPaddingForCorners;
        private RectF mContentBounds;
        private float mCornerRadius;
        private Paint mCornerShadowPaint;
        private Path mCornerShadowPath;
        private boolean mDirty;
        private Paint mEdgeShadowPaint;
        private float mMaxShadowSize;
        private float mRawMaxShadowSize;
        private float mRawShadowSize;
        private float mRotation;
        private float mShadowBottomScale;
        private final int mShadowEndColor;
        private float mShadowHorizScale;
        private float mShadowMultiplier;
        private float mShadowSize;
        private final int mShadowStartColor;
        private float mShadowTopScale;

        public ShadowDrawable(Drawable drawable, float f4, float f5, float f6, int i4, boolean z3) {
            super(drawable);
            this.mShadowMultiplier = 1.0f;
            this.mShadowTopScale = 1.0f;
            this.mShadowHorizScale = 1.0f;
            this.mShadowBottomScale = 1.0f;
            this.mDirty = true;
            this.mAddPaddingForCorners = false;
            this.mShadowStartColor = i4;
            this.mShadowEndColor = i4 & ViewCompat.MEASURED_SIZE_MASK;
            this.isCircle = z3;
            if (z3) {
                this.mShadowMultiplier = 1.0f;
                this.mShadowTopScale = 1.0f;
                this.mShadowHorizScale = 1.0f;
                this.mShadowBottomScale = 1.0f;
            }
            Paint paint = new Paint(5);
            this.mCornerShadowPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mCornerRadius = Math.round(f4);
            this.mContentBounds = new RectF();
            Paint paint2 = new Paint(this.mCornerShadowPaint);
            this.mEdgeShadowPaint = paint2;
            paint2.setAntiAlias(false);
            setShadowSize(f5, f6);
        }

        private void buildComponents(Rect rect) {
            if (this.isCircle) {
                this.mCornerRadius = rect.width() / 2;
            }
            float f4 = this.mRawMaxShadowSize;
            float f5 = this.mShadowMultiplier * f4;
            this.mContentBounds.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
            Drawable wrappedDrawable = getWrappedDrawable();
            RectF rectF = this.mContentBounds;
            wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            buildShadowCorners();
        }

        private void buildShadowCorners() {
            if (!this.isCircle) {
                float f4 = this.mCornerRadius;
                RectF rectF = new RectF(-f4, -f4, f4, f4);
                RectF rectF2 = new RectF(rectF);
                float f5 = this.mShadowSize;
                rectF2.inset(-f5, -f5);
                Path path = this.mCornerShadowPath;
                if (path == null) {
                    this.mCornerShadowPath = new Path();
                } else {
                    path.reset();
                }
                this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
                this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
                this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
                this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
                this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
                this.mCornerShadowPath.close();
                float f6 = -rectF2.top;
                if (f6 > 0.0f) {
                    this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, this.mCornerRadius / f6, 1.0f}, Shader.TileMode.CLAMP));
                }
                this.mEdgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, this.mShadowStartColor, this.mShadowEndColor, Shader.TileMode.CLAMP));
                this.mEdgeShadowPaint.setAntiAlias(false);
                return;
            }
            float fWidth = (this.mContentBounds.width() / 2.0f) - 1.0f;
            float f7 = -fWidth;
            RectF rectF3 = new RectF(f7, f7, fWidth, fWidth);
            RectF rectF4 = new RectF(rectF3);
            float f8 = this.mShadowSize;
            rectF4.inset(-f8, -f8);
            Path path2 = this.mCornerShadowPath;
            if (path2 == null) {
                this.mCornerShadowPath = new Path();
            } else {
                path2.reset();
            }
            this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
            this.mCornerShadowPath.moveTo(f7, 0.0f);
            this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
            this.mCornerShadowPath.arcTo(rectF4, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF4, 0.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 0.0f, 180.0f, false);
            this.mCornerShadowPath.close();
            float f9 = -rectF4.top;
            if (f9 > 0.0f) {
                this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, fWidth / f9, 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        private static float calculateHorizontalPadding(float f4, float f5, boolean z3) {
            return z3 ? (float) (f4 + ((1.0d - COS_45) * f5)) : f4;
        }

        private float calculateVerticalPadding(float f4, float f5, boolean z3) {
            return z3 ? (float) ((f4 * this.mShadowMultiplier) + ((1.0d - COS_45) * f5)) : f4 * this.mShadowMultiplier;
        }

        private void drawShadow(Canvas canvas) {
            int i4;
            float f4;
            int i5;
            float f5;
            float f6;
            float f7;
            if (this.isCircle) {
                int iSave = canvas.save();
                canvas.translate(this.mContentBounds.centerX(), this.mContentBounds.centerY());
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                canvas.restoreToCount(iSave);
                return;
            }
            int iSave2 = canvas.save();
            canvas.rotate(this.mRotation, this.mContentBounds.centerX(), this.mContentBounds.centerY());
            float f8 = this.mCornerRadius;
            float f9 = (-f8) - this.mShadowSize;
            float f10 = f8 * 2.0f;
            boolean z3 = this.mContentBounds.width() - f10 > 0.0f;
            boolean z4 = this.mContentBounds.height() - f10 > 0.0f;
            float f11 = this.mRawShadowSize;
            float f12 = f11 - (this.mShadowTopScale * f11);
            float f13 = f11 - (this.mShadowHorizScale * f11);
            float f14 = f11 - (this.mShadowBottomScale * f11);
            float f15 = f8 == 0.0f ? 1.0f : f8 / (f13 + f8);
            float f16 = f8 == 0.0f ? 1.0f : f8 / (f12 + f8);
            float f17 = f8 == 0.0f ? 1.0f : f8 / (f14 + f8);
            int iSave3 = canvas.save();
            RectF rectF = this.mContentBounds;
            canvas.translate(rectF.left + f8, rectF.top + f8);
            canvas.scale(f15, f16);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z3) {
                canvas.scale(1.0f / f15, 1.0f);
                i4 = iSave3;
                f4 = f17;
                i5 = iSave2;
                f5 = f16;
                canvas.drawRect(0.0f, f9, this.mContentBounds.width() - f10, -this.mCornerRadius, this.mEdgeShadowPaint);
            } else {
                i4 = iSave3;
                f4 = f17;
                i5 = iSave2;
                f5 = f16;
            }
            canvas.restoreToCount(i4);
            int iSave4 = canvas.save();
            RectF rectF2 = this.mContentBounds;
            canvas.translate(rectF2.right - f8, rectF2.bottom - f8);
            float f18 = f4;
            canvas.scale(f15, f18);
            canvas.rotate(180.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z3) {
                canvas.scale(1.0f / f15, 1.0f);
                f6 = f5;
                f7 = f18;
                canvas.drawRect(0.0f, f9, this.mContentBounds.width() - f10, -this.mCornerRadius, this.mEdgeShadowPaint);
            } else {
                f6 = f5;
                f7 = f18;
            }
            canvas.restoreToCount(iSave4);
            int iSave5 = canvas.save();
            RectF rectF3 = this.mContentBounds;
            canvas.translate(rectF3.left + f8, rectF3.bottom - f8);
            canvas.scale(f15, f7);
            canvas.rotate(270.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z4) {
                canvas.scale(1.0f / f7, 1.0f);
                canvas.drawRect(0.0f, f9, this.mContentBounds.height() - f10, -this.mCornerRadius, this.mEdgeShadowPaint);
            }
            canvas.restoreToCount(iSave5);
            int iSave6 = canvas.save();
            RectF rectF4 = this.mContentBounds;
            canvas.translate(rectF4.right - f8, rectF4.top + f8);
            float f19 = f6;
            canvas.scale(f15, f19);
            canvas.rotate(90.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z4) {
                canvas.scale(1.0f / f19, 1.0f);
                canvas.drawRect(0.0f, f9, this.mContentBounds.height() - f10, -this.mCornerRadius, this.mEdgeShadowPaint);
            }
            canvas.restoreToCount(iSave6);
            canvas.restoreToCount(i5);
        }

        private static int toEven(float f4) {
            int iRound = Math.round(f4);
            return iRound % 2 == 1 ? iRound - 1 : iRound;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.mDirty) {
                buildComponents(getBounds());
                this.mDirty = false;
            }
            drawShadow(canvas);
            super.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getChangingConfigurations() {
            return super.getChangingConfigurations();
        }

        public float getCornerRadius() {
            return this.mCornerRadius;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Drawable getCurrent() {
            return super.getCurrent();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
            return super.getIntrinsicHeight();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
            return super.getIntrinsicWidth();
        }

        public float getMaxShadowSize() {
            return this.mRawMaxShadowSize;
        }

        public float getMinHeight() {
            float f4 = this.mRawMaxShadowSize;
            return (Math.max(f4, this.mCornerRadius + ((this.mShadowMultiplier * f4) / 2.0f)) * 2.0f) + (this.mRawMaxShadowSize * this.mShadowMultiplier * 2.0f);
        }

        public float getMinWidth() {
            float f4 = this.mRawMaxShadowSize;
            return (Math.max(f4, this.mCornerRadius + (f4 / 2.0f)) * 2.0f) + (this.mRawMaxShadowSize * 2.0f);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumHeight() {
            return super.getMinimumHeight();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumWidth() {
            return super.getMinimumWidth();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            int iCeil = (int) Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
            int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
            rect.set(iCeil2, iCeil, iCeil2, iCeil);
            return true;
        }

        public float getShadowSize() {
            return this.mRawShadowSize;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int[] getState() {
            return super.getState();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Region getTransparentRegion() {
            return super.getTransparentRegion();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper
        public /* bridge */ /* synthetic */ Drawable getWrappedDrawable() {
            return super.getWrappedDrawable();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
            super.invalidateDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
            return super.isAutoMirrored();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isStateful() {
            return super.isStateful();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            super.jumpToCurrentState();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.mDirty = true;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            super.scheduleDrawable(drawable, runnable, j4);
        }

        public void setAddPaddingForCorners(boolean z3) {
            this.mAddPaddingForCorners = z3;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            super.setAlpha(i4);
            this.mCornerShadowPaint.setAlpha(i4);
            this.mEdgeShadowPaint.setAlpha(i4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z3) {
            super.setAutoMirrored(z3);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
            super.setChangingConfigurations(i4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }

        public void setCornerRadius(float f4) {
            float fRound = Math.round(f4);
            if (this.mCornerRadius == fRound) {
                return;
            }
            this.mCornerRadius = fRound;
            this.mDirty = true;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean z3) {
            super.setDither(z3);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
            super.setFilterBitmap(z3);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
            super.setHotspot(f4, f5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
            super.setHotspotBounds(i4, i5, i6, i7);
        }

        public void setMaxShadowSize(float f4) {
            setShadowSize(this.mRawShadowSize, f4);
        }

        public final void setRotation(float f4) {
            if (this.mRotation != f4) {
                this.mRotation = f4;
                invalidateSelf();
            }
        }

        public void setShadowSize(float f4, float f5) {
            if (f4 < 0.0f || f5 < 0.0f) {
                throw new IllegalArgumentException("invalid shadow size");
            }
            float even = toEven(f4);
            float even2 = toEven(f5);
            if (even > even2) {
                even = even2;
            }
            if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
                return;
            }
            this.mRawShadowSize = even;
            this.mRawMaxShadowSize = even2;
            this.mShadowSize = Math.round(even * this.mShadowMultiplier);
            this.mMaxShadowSize = even2;
            this.mDirty = true;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
            return super.setState(iArr);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTint(int i4) {
            super.setTint(i4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
            super.setTintList(colorStateList);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
            super.setTintMode(mode);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setVisible(boolean z3, boolean z4) {
            return super.setVisible(z3, z4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper
        public /* bridge */ /* synthetic */ void setWrappedDrawable(Drawable drawable) {
            super.setWrappedDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            super.unscheduleDrawable(drawable, runnable);
        }

        public void setShadowSize(float f4) {
            setShadowSize(f4, this.mRawMaxShadowSize);
        }
    }
}

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

/* loaded from: classes3.dex */
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
            Drawable drawable2 = drawable;
            StateListDrawable stateListDrawable = new StateListDrawable();
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

        public Config setShadowColor(int i10) {
            return setShadowColor(i10, i10);
        }

        public Config setShadowMaxSize(int i10) {
            return setShadowMaxSize(i10, i10);
        }

        public Config setShadowRadius(float f10) {
            this.mShadowRadius = f10;
            if (this.isCircle) {
                throw new IllegalArgumentException("Set circle needn't set radius.");
            }
            return this;
        }

        public Config setShadowSize(int i10) {
            return setShadowSize(i10, i10);
        }

        public Config setShadowColor(int i10, int i11) {
            this.mShadowColorNormal = i10;
            this.mShadowColorPressed = i11;
            return this;
        }

        public Config setShadowMaxSize(int i10, int i11) {
            this.mShadowMaxSizeNormal = i10;
            this.mShadowMaxSizePressed = i11;
            return this;
        }

        public Config setShadowSize(int i10, int i11) {
            this.mShadowSizeNormal = i10;
            this.mShadowSizePressed = i11;
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
        public boolean onLevelChange(int i10) {
            return this.mDrawable.setLevel(i10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            this.mDrawable.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean z9) {
            DrawableCompat.setAutoMirrored(this.mDrawable, z9);
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int i10) {
            this.mDrawable.setChangingConfigurations(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.mDrawable.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z9) {
            this.mDrawable.setDither(z9);
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z9) {
            this.mDrawable.setFilterBitmap(z9);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            DrawableCompat.setHotspot(this.mDrawable, f10, f11);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            DrawableCompat.setHotspotBounds(this.mDrawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            return this.mDrawable.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int i10) {
            DrawableCompat.setTint(this.mDrawable, i10);
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
        public boolean setVisible(boolean z9, boolean z10) {
            return super.setVisible(z9, z10) || this.mDrawable.setVisible(z9, z10);
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

        public ShadowDrawable(Drawable drawable, float f10, float f11, float f12, int i10, boolean z9) {
            super(drawable);
            this.mShadowMultiplier = 1.0f;
            this.mShadowTopScale = 1.0f;
            this.mShadowHorizScale = 1.0f;
            this.mShadowBottomScale = 1.0f;
            this.mDirty = true;
            this.mAddPaddingForCorners = false;
            this.mShadowStartColor = i10;
            this.mShadowEndColor = i10 & ViewCompat.MEASURED_SIZE_MASK;
            this.isCircle = z9;
            if (z9) {
                this.mShadowMultiplier = 1.0f;
                this.mShadowTopScale = 1.0f;
                this.mShadowHorizScale = 1.0f;
                this.mShadowBottomScale = 1.0f;
            }
            Paint paint = new Paint(5);
            this.mCornerShadowPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mCornerRadius = Math.round(f10);
            this.mContentBounds = new RectF();
            Paint paint2 = new Paint(this.mCornerShadowPaint);
            this.mEdgeShadowPaint = paint2;
            paint2.setAntiAlias(false);
            setShadowSize(f11, f12);
        }

        private void buildComponents(Rect rect) {
            if (this.isCircle) {
                this.mCornerRadius = rect.width() / 2;
            }
            float f10 = this.mRawMaxShadowSize;
            float f11 = this.mShadowMultiplier * f10;
            this.mContentBounds.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
            Drawable wrappedDrawable = getWrappedDrawable();
            RectF rectF = this.mContentBounds;
            wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            buildShadowCorners();
        }

        private void buildShadowCorners() {
            if (!this.isCircle) {
                float f10 = this.mCornerRadius;
                RectF rectF = new RectF(-f10, -f10, f10, f10);
                RectF rectF2 = new RectF(rectF);
                float f11 = this.mShadowSize;
                rectF2.inset(-f11, -f11);
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
                float f12 = -rectF2.top;
                if (f12 > 0.0f) {
                    this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f12, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, this.mCornerRadius / f12, 1.0f}, Shader.TileMode.CLAMP));
                }
                this.mEdgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, this.mShadowStartColor, this.mShadowEndColor, Shader.TileMode.CLAMP));
                this.mEdgeShadowPaint.setAntiAlias(false);
                return;
            }
            float fWidth = (this.mContentBounds.width() / 2.0f) - 1.0f;
            float f13 = -fWidth;
            RectF rectF3 = new RectF(f13, f13, fWidth, fWidth);
            RectF rectF4 = new RectF(rectF3);
            float f14 = this.mShadowSize;
            rectF4.inset(-f14, -f14);
            Path path2 = this.mCornerShadowPath;
            if (path2 == null) {
                this.mCornerShadowPath = new Path();
            } else {
                path2.reset();
            }
            this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
            this.mCornerShadowPath.moveTo(f13, 0.0f);
            this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
            this.mCornerShadowPath.arcTo(rectF4, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF4, 0.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 0.0f, 180.0f, false);
            this.mCornerShadowPath.close();
            float f15 = -rectF4.top;
            if (f15 > 0.0f) {
                this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f15, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, fWidth / f15, 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        private static float calculateHorizontalPadding(float f10, float f11, boolean z9) {
            return z9 ? (float) (f10 + ((1.0d - COS_45) * f11)) : f10;
        }

        private float calculateVerticalPadding(float f10, float f11, boolean z9) {
            return z9 ? (float) ((f10 * this.mShadowMultiplier) + ((1.0d - COS_45) * f11)) : f10 * this.mShadowMultiplier;
        }

        private void drawShadow(Canvas canvas) {
            float f10;
            int i10;
            if (this.isCircle) {
                int iSave = canvas.save();
                canvas.translate(this.mContentBounds.centerX(), this.mContentBounds.centerY());
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                canvas.restoreToCount(iSave);
                return;
            }
            int iSave2 = canvas.save();
            canvas.rotate(this.mRotation, this.mContentBounds.centerX(), this.mContentBounds.centerY());
            float f11 = this.mCornerRadius;
            float f12 = (-f11) - this.mShadowSize;
            float f13 = f11 * 2.0f;
            boolean z9 = this.mContentBounds.width() - f13 > 0.0f;
            boolean z10 = this.mContentBounds.height() - f13 > 0.0f;
            float f14 = this.mRawShadowSize;
            float f15 = f14 - (this.mShadowTopScale * f14);
            float f16 = f14 - (this.mShadowHorizScale * f14);
            float f17 = f14 - (this.mShadowBottomScale * f14);
            float f18 = f11 == 0.0f ? 1.0f : f11 / (f16 + f11);
            float f19 = f11 == 0.0f ? 1.0f : f11 / (f15 + f11);
            float f20 = f11 == 0.0f ? 1.0f : f11 / (f17 + f11);
            int iSave3 = canvas.save();
            RectF rectF = this.mContentBounds;
            canvas.translate(rectF.left + f11, rectF.top + f11);
            canvas.scale(f18, f19);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z9) {
                canvas.scale(1.0f / f18, 1.0f);
                f10 = 1.0f;
                i10 = iSave3;
                canvas.drawRect(0.0f, f12, this.mContentBounds.width() - f13, -this.mCornerRadius, this.mEdgeShadowPaint);
            } else {
                f10 = 1.0f;
                i10 = iSave3;
            }
            canvas.restoreToCount(i10);
            int iSave4 = canvas.save();
            RectF rectF2 = this.mContentBounds;
            canvas.translate(rectF2.right - f11, rectF2.bottom - f11);
            canvas.scale(f18, f20);
            canvas.rotate(180.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z9) {
                canvas.scale(f10 / f18, f10);
                canvas.drawRect(0.0f, f12, this.mContentBounds.width() - f13, -this.mCornerRadius, this.mEdgeShadowPaint);
            }
            canvas.restoreToCount(iSave4);
            int iSave5 = canvas.save();
            RectF rectF3 = this.mContentBounds;
            canvas.translate(rectF3.left + f11, rectF3.bottom - f11);
            canvas.scale(f18, f20);
            canvas.rotate(270.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z10) {
                canvas.scale(1.0f / f20, 1.0f);
                canvas.drawRect(0.0f, f12, this.mContentBounds.height() - f13, -this.mCornerRadius, this.mEdgeShadowPaint);
            }
            canvas.restoreToCount(iSave5);
            int iSave6 = canvas.save();
            RectF rectF4 = this.mContentBounds;
            canvas.translate(rectF4.right - f11, rectF4.top + f11);
            canvas.scale(f18, f19);
            canvas.rotate(90.0f);
            canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            if (z10) {
                canvas.scale(1.0f / f19, 1.0f);
                canvas.drawRect(0.0f, f12, this.mContentBounds.height() - f13, -this.mCornerRadius, this.mEdgeShadowPaint);
            }
            canvas.restoreToCount(iSave6);
            canvas.restoreToCount(iSave2);
        }

        private static int toEven(float f10) {
            int iRound = Math.round(f10);
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
            float f10 = this.mRawMaxShadowSize;
            return (Math.max(f10, this.mCornerRadius + ((this.mShadowMultiplier * f10) / 2.0f)) * 2.0f) + (this.mRawMaxShadowSize * this.mShadowMultiplier * 2.0f);
        }

        public float getMinWidth() {
            float f10 = this.mRawMaxShadowSize;
            return (Math.max(f10, this.mCornerRadius + (f10 / 2.0f)) * 2.0f) + (this.mRawMaxShadowSize * 2.0f);
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
        public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            super.scheduleDrawable(drawable, runnable, j10);
        }

        public void setAddPaddingForCorners(boolean z9) {
            this.mAddPaddingForCorners = z9;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            super.setAlpha(i10);
            this.mCornerShadowPaint.setAlpha(i10);
            this.mEdgeShadowPaint.setAlpha(i10);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z9) {
            super.setAutoMirrored(z9);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
            super.setChangingConfigurations(i10);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }

        public void setCornerRadius(float f10) {
            float fRound = Math.round(f10);
            if (this.mCornerRadius == fRound) {
                return;
            }
            this.mCornerRadius = fRound;
            this.mDirty = true;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean z9) {
            super.setDither(z9);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
            super.setFilterBitmap(z9);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
            super.setHotspot(f10, f11);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
            super.setHotspotBounds(i10, i11, i12, i13);
        }

        public void setMaxShadowSize(float f10) {
            setShadowSize(this.mRawShadowSize, f10);
        }

        public final void setRotation(float f10) {
            if (this.mRotation != f10) {
                this.mRotation = f10;
                invalidateSelf();
            }
        }

        public void setShadowSize(float f10, float f11) {
            if (f10 < 0.0f || f11 < 0.0f) {
                throw new IllegalArgumentException("invalid shadow size");
            }
            float even = toEven(f10);
            float even2 = toEven(f11);
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
        public /* bridge */ /* synthetic */ void setTint(int i10) {
            super.setTint(i10);
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
        public /* bridge */ /* synthetic */ boolean setVisible(boolean z9, boolean z10) {
            return super.setVisible(z9, z10);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper
        public /* bridge */ /* synthetic */ void setWrappedDrawable(Drawable drawable) {
            super.setWrappedDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            super.unscheduleDrawable(drawable, runnable);
        }

        public void setShadowSize(float f10) {
            setShadowSize(f10, this.mRawMaxShadowSize);
        }
    }
}

package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.core.graphics.Insets;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes2.dex */
public abstract class Protection {
    private static final long DEFAULT_DURATION_IN = 333;
    private static final long DEFAULT_DURATION_OUT = 166;
    private final Attributes mAttributes = new Attributes();
    private Object mController;
    private Insets mInsets;
    private Insets mInsetsIgnoringVisibility;
    private final int mSide;
    private float mSystemAlpha;
    private float mSystemInsetAmount;
    private float mUserAlpha;
    private ValueAnimator mUserAlphaAnimator;
    private float mUserInsetAmount;
    private ValueAnimator mUserInsetAmountAnimator;
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_IN = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_MOVE_OUT = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_IN = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    private static final Interpolator DEFAULT_INTERPOLATOR_FADE_OUT = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    public static class Attributes {
        private static final int UNSPECIFIED = -1;
        private Callback mCallback;
        private int mWidth = -1;
        private int mHeight = -1;
        private Insets mMargin = Insets.NONE;
        private boolean mVisible = false;
        private Drawable mDrawable = null;
        private float mTranslationX = 0.0f;
        private float mTranslationY = 0.0f;
        private float mAlpha = 1.0f;

        public interface Callback {
            default void onAlphaChanged(float f10) {
            }

            default void onDrawableChanged(Drawable drawable) {
            }

            default void onHeightChanged(int i10) {
            }

            default void onMarginChanged(Insets insets) {
            }

            default void onTranslationXChanged(float f10) {
            }

            default void onTranslationYChanged(float f10) {
            }

            default void onVisibilityChanged(boolean z9) {
            }

            default void onWidthChanged(int i10) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlpha(float f10) {
            if (this.mAlpha != f10) {
                this.mAlpha = f10;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onAlphaChanged(f10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
            Callback callback = this.mCallback;
            if (callback != null) {
                callback.onDrawableChanged(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i10) {
            if (this.mHeight != i10) {
                this.mHeight = i10;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onHeightChanged(i10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMargin(Insets insets) {
            if (this.mMargin.equals(insets)) {
                return;
            }
            this.mMargin = insets;
            Callback callback = this.mCallback;
            if (callback != null) {
                callback.onMarginChanged(insets);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationX(float f10) {
            if (this.mTranslationX != f10) {
                this.mTranslationX = f10;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationXChanged(f10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationY(float f10) {
            if (this.mTranslationY != f10) {
                this.mTranslationY = f10;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationYChanged(f10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisible(boolean z9) {
            if (this.mVisible != z9) {
                this.mVisible = z9;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onVisibilityChanged(z9);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i10) {
            if (this.mWidth != i10) {
                this.mWidth = i10;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onWidthChanged(i10);
                }
            }
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public Drawable getDrawable() {
            return this.mDrawable;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public Insets getMargin() {
            return this.mMargin;
        }

        public float getTranslationX() {
            return this.mTranslationX;
        }

        public float getTranslationY() {
            return this.mTranslationY;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public boolean isVisible() {
            return this.mVisible;
        }

        public void setCallback(Callback callback) {
            if (this.mCallback != null && callback != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.mCallback = callback;
        }
    }

    public Protection(int i10) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        this.mSystemAlpha = 1.0f;
        this.mUserAlpha = 1.0f;
        this.mSystemInsetAmount = 1.0f;
        this.mUserInsetAmount = 1.0f;
        this.mController = null;
        this.mUserAlphaAnimator = null;
        this.mUserInsetAmountAnimator = null;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            this.mSide = i10;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i10);
    }

    /* renamed from: a */
    public static /* synthetic */ void m1845a(Protection protection, ValueAnimator valueAnimator) {
        protection.getClass();
        protection.setAlphaInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: b */
    public static /* synthetic */ void m1846b(Protection protection, ValueAnimator valueAnimator) {
        protection.getClass();
        protection.setAlphaInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void cancelUserAlphaAnimation() {
        ValueAnimator valueAnimator = this.mUserAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mUserAlphaAnimator = null;
        }
    }

    private void cancelUserInsetsAmountAnimation() {
        ValueAnimator valueAnimator = this.mUserInsetAmountAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mUserInsetAmountAnimator = null;
        }
    }

    private void setAlphaInternal(float f10) {
        this.mUserAlpha = f10;
        updateAlpha();
    }

    private void setInsetAmountInternal(float f10) {
        this.mUserInsetAmount = f10;
        updateInsetAmount();
    }

    private void updateAlpha() {
        this.mAttributes.setAlpha(this.mSystemAlpha * this.mUserAlpha);
    }

    private void updateInsetAmount() {
        float f10 = this.mUserInsetAmount * this.mSystemInsetAmount;
        int i10 = this.mSide;
        if (i10 == 1) {
            this.mAttributes.setTranslationX((-(1.0f - f10)) * r1.mWidth);
            return;
        }
        if (i10 == 2) {
            this.mAttributes.setTranslationY((-(1.0f - f10)) * r1.mHeight);
        } else if (i10 == 4) {
            this.mAttributes.setTranslationX((1.0f - f10) * r1.mWidth);
        } else {
            if (i10 != 8) {
                return;
            }
            this.mAttributes.setTranslationY((1.0f - f10) * r1.mHeight);
        }
    }

    public void animateAlpha(float f10) {
        cancelUserAlphaAnimation();
        float f11 = this.mUserAlpha;
        if (f10 == f11) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f10);
        this.mUserAlphaAnimator = valueAnimatorOfFloat;
        if (this.mUserAlpha < f10) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_OUT);
        }
        this.mUserAlphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Protection.m1845a(this.f1626a, valueAnimator);
            }
        });
        this.mUserAlphaAnimator.start();
    }

    public void animateInsetsAmount(float f10) {
        cancelUserInsetsAmountAnimation();
        float f11 = this.mUserInsetAmount;
        if (f10 == f11) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f10);
        this.mUserInsetAmountAnimator = valueAnimatorOfFloat;
        if (this.mUserInsetAmount < f10) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_OUT);
        }
        this.mUserInsetAmountAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Protection.m1846b(this.f1625a, valueAnimator);
            }
        });
        this.mUserInsetAmountAnimator.start();
    }

    public void dispatchColorHint(int i10) {
    }

    public Insets dispatchInsets(Insets insets, Insets insets2, Insets insets3) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets2;
        this.mAttributes.setMargin(insets3);
        return updateLayout();
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN)
    public float getAlpha() {
        return this.mUserAlpha;
    }

    public Attributes getAttributes() {
        return this.mAttributes;
    }

    public Object getController() {
        return this.mController;
    }

    public float getInsetAmount() {
        return this.mUserInsetAmount;
    }

    public int getSide() {
        return this.mSide;
    }

    public int getThickness(int i10) {
        return i10;
    }

    public boolean occupiesCorners() {
        return false;
    }

    public void setAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            cancelUserAlphaAnimation();
            setAlphaInternal(f10);
        } else {
            throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + f10);
        }
    }

    public void setController(Object obj) {
        this.mController = obj;
    }

    public void setDrawable(Drawable drawable) {
        this.mAttributes.setDrawable(drawable);
    }

    public void setInsetAmount(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            cancelUserInsetsAmountAnimation();
            setInsetAmountInternal(f10);
        } else {
            throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + f10);
        }
    }

    public void setSystemAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        this.mSystemAlpha = f10;
        updateAlpha();
    }

    public void setSystemInsetAmount(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        this.mSystemInsetAmount = f10;
        updateInsetAmount();
    }

    public void setSystemVisible(boolean z9) {
        this.mAttributes.setVisible(z9);
    }

    public Insets updateLayout() {
        int i10;
        Insets insetsM1665of = Insets.NONE;
        int i11 = this.mSide;
        if (i11 == 1) {
            i10 = this.mInsets.left;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.left));
            if (occupiesCorners()) {
                insetsM1665of = Insets.m1665of(getThickness(i10), 0, 0, 0);
            }
        } else if (i11 == 2) {
            i10 = this.mInsets.f18238top;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.f18238top));
            if (occupiesCorners()) {
                insetsM1665of = Insets.m1665of(0, getThickness(i10), 0, 0);
            }
        } else if (i11 == 4) {
            i10 = this.mInsets.right;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.right));
            if (occupiesCorners()) {
                insetsM1665of = Insets.m1665of(0, 0, getThickness(i10), 0);
            }
        } else if (i11 != 8) {
            i10 = 0;
        } else {
            i10 = this.mInsets.bottom;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.bottom));
            if (occupiesCorners()) {
                insetsM1665of = Insets.m1665of(0, 0, 0, getThickness(i10));
            }
        }
        setSystemVisible(i10 > 0);
        setSystemAlpha(i10 > 0 ? 1.0f : 0.0f);
        setSystemInsetAmount(i10 > 0 ? 1.0f : 0.0f);
        return insetsM1665of;
    }
}

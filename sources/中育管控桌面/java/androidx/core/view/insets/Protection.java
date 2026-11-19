package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
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
            default void onAlphaChanged(float f6) {
            }

            default void onDrawableChanged(Drawable drawable) {
            }

            default void onHeightChanged(int i6) {
            }

            default void onMarginChanged(Insets insets) {
            }

            default void onTranslationXChanged(float f6) {
            }

            default void onTranslationYChanged(float f6) {
            }

            default void onVisibilityChanged(boolean z6) {
            }

            default void onWidthChanged(int i6) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlpha(float f6) {
            if (this.mAlpha != f6) {
                this.mAlpha = f6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onAlphaChanged(f6);
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
        public void setHeight(int i6) {
            if (this.mHeight != i6) {
                this.mHeight = i6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onHeightChanged(i6);
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
        public void setTranslationX(float f6) {
            if (this.mTranslationX != f6) {
                this.mTranslationX = f6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationXChanged(f6);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTranslationY(float f6) {
            if (this.mTranslationY != f6) {
                this.mTranslationY = f6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onTranslationYChanged(f6);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisible(boolean z6) {
            if (this.mVisible != z6) {
                this.mVisible = z6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onVisibilityChanged(z6);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i6) {
            if (this.mWidth != i6) {
                this.mWidth = i6;
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onWidthChanged(i6);
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

    public Protection(int i6) {
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
        if (i6 == 1 || i6 == 2 || i6 == 4 || i6 == 8) {
            this.mSide = i6;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i6);
    }

    /* renamed from: a */
    public static /* synthetic */ void m910a(Protection protection, ValueAnimator valueAnimator) {
        protection.getClass();
        protection.setAlphaInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: b */
    public static /* synthetic */ void m911b(Protection protection, ValueAnimator valueAnimator) {
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

    private void setAlphaInternal(float f6) {
        this.mUserAlpha = f6;
        updateAlpha();
    }

    private void setInsetAmountInternal(float f6) {
        this.mUserInsetAmount = f6;
        updateInsetAmount();
    }

    private void updateAlpha() {
        this.mAttributes.setAlpha(this.mSystemAlpha * this.mUserAlpha);
    }

    private void updateInsetAmount() {
        float f6 = this.mUserInsetAmount * this.mSystemInsetAmount;
        int i6 = this.mSide;
        if (i6 == 1) {
            this.mAttributes.setTranslationX((-(1.0f - f6)) * r1.mWidth);
            return;
        }
        if (i6 == 2) {
            this.mAttributes.setTranslationY((-(1.0f - f6)) * r1.mHeight);
        } else if (i6 == 4) {
            this.mAttributes.setTranslationX((1.0f - f6) * r1.mWidth);
        } else {
            if (i6 != 8) {
                return;
            }
            this.mAttributes.setTranslationY((1.0f - f6) * r1.mHeight);
        }
    }

    public void animateAlpha(float f6) {
        cancelUserAlphaAnimation();
        float f7 = this.mUserAlpha;
        if (f6 == f7) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f6);
        this.mUserAlphaAnimator = valueAnimatorOfFloat;
        if (this.mUserAlpha < f6) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserAlphaAnimator.setInterpolator(DEFAULT_INTERPOLATOR_FADE_OUT);
        }
        this.mUserAlphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Protection.m910a(this.f487a, valueAnimator);
            }
        });
        this.mUserAlphaAnimator.start();
    }

    public void animateInsetsAmount(float f6) {
        cancelUserInsetsAmountAnimation();
        float f7 = this.mUserInsetAmount;
        if (f6 == f7) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f6);
        this.mUserInsetAmountAnimator = valueAnimatorOfFloat;
        if (this.mUserInsetAmount < f6) {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_IN);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_IN);
        } else {
            valueAnimatorOfFloat.setDuration(DEFAULT_DURATION_OUT);
            this.mUserInsetAmountAnimator.setInterpolator(DEFAULT_INTERPOLATOR_MOVE_OUT);
        }
        this.mUserInsetAmountAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.insets.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Protection.m911b(this.f486a, valueAnimator);
            }
        });
        this.mUserInsetAmountAnimator.start();
    }

    public void dispatchColorHint(int i6) {
    }

    public Insets dispatchInsets(Insets insets, Insets insets2, Insets insets3) {
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets2;
        this.mAttributes.setMargin(insets3);
        return updateLayout();
    }

    @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN)
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

    public int getThickness(int i6) {
        return i6;
    }

    public boolean occupiesCorners() {
        return false;
    }

    public void setAlpha(@FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6) {
        if (f6 >= 0.0f && f6 <= 1.0f) {
            cancelUserAlphaAnimation();
            setAlphaInternal(f6);
        } else {
            throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + f6);
        }
    }

    public void setController(Object obj) {
        this.mController = obj;
    }

    public void setDrawable(Drawable drawable) {
        this.mAttributes.setDrawable(drawable);
    }

    public void setInsetAmount(@FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6) {
        if (f6 >= 0.0f && f6 <= 1.0f) {
            cancelUserInsetsAmountAnimation();
            setInsetAmountInternal(f6);
        } else {
            throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + f6);
        }
    }

    public void setSystemAlpha(@FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6) {
        this.mSystemAlpha = f6;
        updateAlpha();
    }

    public void setSystemInsetAmount(@FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6) {
        this.mSystemInsetAmount = f6;
        updateInsetAmount();
    }

    public void setSystemVisible(boolean z6) {
        this.mAttributes.setVisible(z6);
    }

    public Insets updateLayout() {
        int i6;
        Insets insetsM727of = Insets.NONE;
        int i7 = this.mSide;
        if (i7 == 1) {
            i6 = this.mInsets.left;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.left));
            if (occupiesCorners()) {
                insetsM727of = Insets.m727of(getThickness(i6), 0, 0, 0);
            }
        } else if (i7 == 2) {
            i6 = this.mInsets.top;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.top));
            if (occupiesCorners()) {
                insetsM727of = Insets.m727of(0, getThickness(i6), 0, 0);
            }
        } else if (i7 == 4) {
            i6 = this.mInsets.right;
            this.mAttributes.setWidth(getThickness(this.mInsetsIgnoringVisibility.right));
            if (occupiesCorners()) {
                insetsM727of = Insets.m727of(0, 0, getThickness(i6), 0);
            }
        } else if (i7 != 8) {
            i6 = 0;
        } else {
            i6 = this.mInsets.bottom;
            this.mAttributes.setHeight(getThickness(this.mInsetsIgnoringVisibility.bottom));
            if (occupiesCorners()) {
                insetsM727of = Insets.m727of(0, 0, 0, getThickness(i6));
            }
        }
        setSystemVisible(i6 > 0);
        setSystemAlpha(i6 > 0 ? 1.0f : 0.0f);
        setSystemInsetAmount(i6 > 0 ? 1.0f : 0.0f);
        return insetsM727of;
    }
}

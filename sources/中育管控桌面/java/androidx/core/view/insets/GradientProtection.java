package androidx.core.view.insets;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
import androidx.annotation.ColorInt;

/* loaded from: classes2.dex */
public class GradientProtection extends Protection {
    private static final float[] ALPHAS;

    @ColorInt
    private int mColor;
    private final int[] mColors;
    private final GradientDrawable mDrawable;
    private boolean mHasColor;
    private float mScale;

    static {
        float[] fArr = new float[100];
        ALPHAS = fArr;
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        int length = fArr.length - 1;
        for (int i6 = length; i6 >= 0; i6--) {
            ALPHAS[i6] = pathInterpolator.getInterpolation((length - i6) / length);
        }
    }

    public GradientProtection(int i6) {
        super(i6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.mDrawable = gradientDrawable;
        this.mColors = new int[ALPHAS.length];
        this.mColor = 0;
        this.mScale = 1.2f;
        if (i6 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            return;
        }
        if (i6 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i6 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else {
            if (i6 != 8) {
                return;
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    private void setColorInner(@ColorInt int i6) {
        if (this.mColor != i6) {
            this.mColor = i6;
            toColors(i6, this.mColors);
            this.mDrawable.setColors(this.mColors);
            setDrawable(this.mDrawable);
        }
    }

    private static void toColors(int i6, int[] iArr) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = Color.argb((int) (ALPHAS[length] * Color.alpha(i6)), Color.red(i6), Color.green(i6), Color.blue(i6));
        }
    }

    @Override // androidx.core.view.insets.Protection
    public void dispatchColorHint(@ColorInt int i6) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i6);
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    public float getScale() {
        return this.mScale;
    }

    @Override // androidx.core.view.insets.Protection
    public int getThickness(int i6) {
        return (int) (this.mScale * i6);
    }

    public void setColor(@ColorInt int i6) {
        this.mHasColor = true;
        setColorInner(i6);
    }

    public void setScale(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Scale must not be negative.");
        }
        this.mScale = f6;
        updateLayout();
    }

    public GradientProtection(int i6, @ColorInt int i7) {
        this(i6);
        setColor(i7);
    }
}

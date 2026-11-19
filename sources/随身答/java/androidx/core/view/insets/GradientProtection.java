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
        for (int i9 = length; i9 >= 0; i9--) {
            ALPHAS[i9] = pathInterpolator.getInterpolation((length - i9) / length);
        }
    }

    public GradientProtection(int i9) {
        super(i9);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.mDrawable = gradientDrawable;
        this.mColors = new int[ALPHAS.length];
        this.mColor = 0;
        this.mScale = 1.2f;
        if (i9 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            return;
        }
        if (i9 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i9 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else {
            if (i9 != 8) {
                return;
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    private void setColorInner(@ColorInt int i9) {
        if (this.mColor != i9) {
            this.mColor = i9;
            toColors(i9, this.mColors);
            this.mDrawable.setColors(this.mColors);
            setDrawable(this.mDrawable);
        }
    }

    private static void toColors(int i9, int[] iArr) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = Color.argb((int) (ALPHAS[length] * Color.alpha(i9)), Color.red(i9), Color.green(i9), Color.blue(i9));
        }
    }

    @Override // androidx.core.view.insets.Protection
    public void dispatchColorHint(@ColorInt int i9) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i9);
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    public float getScale() {
        return this.mScale;
    }

    @Override // androidx.core.view.insets.Protection
    public int getThickness(int i9) {
        return (int) (this.mScale * i9);
    }

    public void setColor(@ColorInt int i9) {
        this.mHasColor = true;
        setColorInner(i9);
    }

    public void setScale(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Scale must not be negative.");
        }
        this.mScale = f10;
        updateLayout();
    }

    public GradientProtection(int i9, @ColorInt int i10) {
        this(i9);
        setColor(i10);
    }
}

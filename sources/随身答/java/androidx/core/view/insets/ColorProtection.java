package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

/* loaded from: classes2.dex */
public class ColorProtection extends Protection {

    @ColorInt
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int i9) {
        super(i9);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    private void setColorInner(@ColorInt int i9) {
        if (this.mColor != i9) {
            this.mColor = i9;
            this.mDrawable.setColor(i9);
            setDrawable(this.mDrawable);
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

    @Override // androidx.core.view.insets.Protection
    public boolean occupiesCorners() {
        return true;
    }

    public void setColor(@ColorInt int i9) {
        this.mHasColor = true;
        setColorInner(i9);
    }

    public ColorProtection(int i9, @ColorInt int i10) {
        this(i9);
        setColor(i10);
    }
}

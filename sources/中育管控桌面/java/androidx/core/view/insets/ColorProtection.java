package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

/* loaded from: classes2.dex */
public class ColorProtection extends Protection {

    @ColorInt
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int i6) {
        super(i6);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    private void setColorInner(@ColorInt int i6) {
        if (this.mColor != i6) {
            this.mColor = i6;
            this.mDrawable.setColor(i6);
            setDrawable(this.mDrawable);
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

    @Override // androidx.core.view.insets.Protection
    public boolean occupiesCorners() {
        return true;
    }

    public void setColor(@ColorInt int i6) {
        this.mHasColor = true;
        setColorInner(i6);
    }

    public ColorProtection(int i6, @ColorInt int i7) {
        this(i6);
        setColor(i7);
    }
}

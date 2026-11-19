package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

/* loaded from: classes2.dex */
public class ColorProtection extends Protection {

    @ColorInt
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int i10) {
        super(i10);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    private void setColorInner(@ColorInt int i10) {
        if (this.mColor != i10) {
            this.mColor = i10;
            this.mDrawable.setColor(i10);
            setDrawable(this.mDrawable);
        }
    }

    @Override // androidx.core.view.insets.Protection
    public void dispatchColorHint(@ColorInt int i10) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i10);
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    @Override // androidx.core.view.insets.Protection
    public boolean occupiesCorners() {
        return true;
    }

    public void setColor(@ColorInt int i10) {
        this.mHasColor = true;
        setColorInner(i10);
    }

    public ColorProtection(int i10, @ColorInt int i11) {
        this(i10);
        setColor(i11);
    }
}

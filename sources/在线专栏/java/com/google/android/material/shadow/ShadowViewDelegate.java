package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(Drawable drawable);

    void setShadowPadding(int i4, int i5, int i6, int i7);
}

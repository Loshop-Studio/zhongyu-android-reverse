package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C6339R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes5.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;

    @Px
    public int indicatorInset;

    @Px
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C6339R.attr.circularProgressIndicatorStyle);
    }

    public int getIndicatorTrackGapSizeDegree() {
        if (this.indicatorTrackGapSize == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((this.indicatorSize - (this.indicatorInset * 2)) - this.trackThickness) * 3.141592653589793d) / (r0 + this.trackCornerRadius)));
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) throws Resources.NotFoundException {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6339R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C6339R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C6339R.styleable.CircularProgressIndicator, i10, i11, new int[0]);
        this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C6339R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C6339R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }
}

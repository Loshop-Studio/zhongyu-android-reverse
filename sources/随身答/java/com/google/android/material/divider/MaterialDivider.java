package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5733R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = C5733R.style.Widget_MaterialComponents_MaterialDivider;

    @ColorInt
    private int color;

    @NonNull
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i9;
        super.onDraw(canvas);
        boolean z9 = ViewCompat.getLayoutDirection(this) == 1;
        int i10 = z9 ? this.insetEnd : this.insetStart;
        if (z9) {
            width = getWidth();
            i9 = this.insetStart;
        } else {
            width = getWidth();
            i9 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i10, 0, width - i9, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i11 = this.thickness;
            if (i11 > 0 && measuredHeight != i11) {
                measuredHeight = i11;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i9) {
        if (this.color != i9) {
            this.color = i9;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i9));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i9) {
        setDividerColor(ContextCompat.getColor(getContext(), i9));
    }

    public void setDividerInsetEnd(@Px int i9) {
        this.insetEnd = i9;
    }

    public void setDividerInsetEndResource(@DimenRes int i9) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i9));
    }

    public void setDividerInsetStart(@Px int i9) {
        this.insetStart = i9;
    }

    public void setDividerInsetStartResource(@DimenRes int i9) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i9));
    }

    public void setDividerThickness(@Px int i9) {
        if (this.thickness != i9) {
            this.thickness = i9;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i9) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i9));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5733R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i9, i10), attributeSet, i9);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C5733R.styleable.MaterialDivider, i9, i10, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5733R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(C5733R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C5733R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C5733R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C5733R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

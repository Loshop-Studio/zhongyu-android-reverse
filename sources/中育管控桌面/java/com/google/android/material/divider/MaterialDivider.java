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
import com.google.android.material.C4853R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = C4853R.style.Widget_MaterialComponents_MaterialDivider;

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
        int i6;
        super.onDraw(canvas);
        boolean z6 = ViewCompat.getLayoutDirection(this) == 1;
        int i7 = z6 ? this.insetEnd : this.insetStart;
        if (z6) {
            width = getWidth();
            i6 = this.insetStart;
        } else {
            width = getWidth();
            i6 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i7, 0, width - i6, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i7);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i8 = this.thickness;
            if (i8 > 0 && measuredHeight != i8) {
                measuredHeight = i8;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i6) {
        if (this.color != i6) {
            this.color = i6;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i6));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i6) {
        setDividerColor(ContextCompat.getColor(getContext(), i6));
    }

    public void setDividerInsetEnd(@Px int i6) {
        this.insetEnd = i6;
    }

    public void setDividerInsetEndResource(@DimenRes int i6) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerInsetStart(@Px int i6) {
        this.insetStart = i6;
    }

    public void setDividerInsetStartResource(@DimenRes int i6) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerThickness(@Px int i6) {
        if (this.thickness != i6) {
            this.thickness = i6;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i6) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i6));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4853R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i6) {
        int i7 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i6, i7), attributeSet, i6);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C4853R.styleable.MaterialDivider, i6, i7, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4853R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(C4853R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C4853R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C4853R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C4853R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

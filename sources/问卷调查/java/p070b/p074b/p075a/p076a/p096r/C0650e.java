package p070b.p074b.p075a.p076a.p096r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.r.e */
/* loaded from: classes.dex */
public class C0650e extends ViewGroup {

    /* renamed from: b */
    public int f3923b;

    /* renamed from: c */
    public int f3924c;

    /* renamed from: d */
    public boolean f3925d;

    /* renamed from: e */
    public int f3926e;

    public C0650e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0650e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3925d = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0564b.f3512g, 0, 0);
        this.f3923b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3924c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo2261a() {
        return this.f3925d;
    }

    public int getItemSpacing() {
        return this.f3924c;
    }

    public int getLineSpacing() {
        return this.f3923b;
    }

    public int getRowCount() {
        return this.f3926e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f3926e = 0;
            return;
        }
        this.f3926e = 1;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1088R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                if (!this.f3925d && measuredWidth2 > i5) {
                    i6 = this.f3923b + paddingTop;
                    this.f3926e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C1088R.id.row_index_key, Integer.valueOf(this.f3926e - 1));
                int i8 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    i8 = i5 - measuredWidth3;
                    measuredWidth3 = (i5 - measuredWidth) - marginStart;
                }
                childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f3924c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !mo2261a()) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.f3923b;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.f3924c + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f3924c = i;
    }

    public void setLineSpacing(int i) {
        this.f3923b = i;
    }

    public void setSingleLine(boolean z) {
        this.f3925d = z;
    }
}

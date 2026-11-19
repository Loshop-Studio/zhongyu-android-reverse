package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f2857b;

    /* renamed from: c */
    public int f2858c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2858c = -1;
        int[] iArr = C0014b.f36k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0266o.m874m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f2857b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View viewFindViewById = findViewById(C1088R.id.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int m1583a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m1584b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f2857b) {
            if (size > this.f2858c && m1584b()) {
                setStacked(false);
            }
            this.f2858c = size;
        }
        if (m1584b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f2857b && !m1584b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM1583a = m1583a(0);
        if (iM1583a >= 0) {
            View childAt = getChildAt(iM1583a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1584b()) {
                int iM1583a2 = m1583a(iM1583a + 1);
                paddingBottom = iM1583a2 >= 0 ? getChildAt(iM1583a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f2857b != z) {
            this.f2857b = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

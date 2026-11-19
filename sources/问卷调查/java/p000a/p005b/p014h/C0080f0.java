package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.b.h.f0 */
/* loaded from: classes.dex */
public class C0080f0 extends ViewGroup {

    /* renamed from: b */
    public boolean f617b;

    /* renamed from: c */
    public int f618c;

    /* renamed from: d */
    public int f619d;

    /* renamed from: e */
    public int f620e;

    /* renamed from: f */
    public int f621f;

    /* renamed from: g */
    public int f622g;

    /* renamed from: h */
    public float f623h;

    /* renamed from: i */
    public boolean f624i;

    /* renamed from: j */
    public int[] f625j;

    /* renamed from: k */
    public int[] f626k;

    /* renamed from: l */
    public Drawable f627l;

    /* renamed from: m */
    public int f628m;

    /* renamed from: n */
    public int f629n;

    /* renamed from: o */
    public int f630o;

    /* renamed from: p */
    public int f631p;

    /* renamed from: a.b.h.f0$a */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0080f0(Context context) {
        this(context, null);
    }

    public C0080f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0080f0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f617b = true;
        this.f618c = -1;
        this.f619d = 0;
        this.f621f = 8388659;
        int[] iArr = C0014b.f38m;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0266o.m874m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f623h = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f618c = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.f624i = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : C0034a.m129a(context, resourceId));
        this.f630o = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f631p = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: f */
    public void m310f(Canvas canvas, int i) {
        this.f627l.setBounds(getPaddingLeft() + this.f631p, i, (getWidth() - getPaddingRight()) - this.f631p, this.f629n + i);
        this.f627l.draw(canvas);
    }

    /* renamed from: g */
    public void m311g(Canvas canvas, int i) {
        this.f627l.setBounds(i, getPaddingTop() + this.f631p, this.f628m + i, (getHeight() - getPaddingBottom()) - this.f631p);
        this.f627l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f618c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f618c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f618c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f619d;
        if (this.f620e == 1 && (i = this.f621f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f622g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f622g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f618c;
    }

    public Drawable getDividerDrawable() {
        return this.f627l;
    }

    public int getDividerPadding() {
        return this.f631p;
    }

    public int getDividerWidth() {
        return this.f628m;
    }

    public int getGravity() {
        return this.f621f;
    }

    public int getOrientation() {
        return this.f620e;
    }

    public int getShowDividers() {
        return this.f630o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f623h;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f620e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: k */
    public int m315k() {
        return 0;
    }

    /* renamed from: l */
    public int m316l() {
        return 0;
    }

    /* renamed from: m */
    public int m317m() {
        return 0;
    }

    /* renamed from: n */
    public boolean m318n(int i) {
        if (i == 0) {
            return (this.f630o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f630o & 4) != 0;
        }
        if ((this.f630o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void m319o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.f627l == null) {
            return;
        }
        int i = 0;
        if (this.f620e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i < virtualChildCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && m318n(i)) {
                    m310f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f629n);
                }
                i++;
            }
            if (m318n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m310f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f629n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM281b = C0069a1.m281b(this);
        while (i < virtualChildCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m318n(i)) {
                a aVar = (a) childAt3.getLayoutParams();
                m311g(canvas, zM281b ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f628m);
            }
            i++;
        }
        if (m318n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (zM281b) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f628m;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zM281b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f628m;
            }
            m311g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0080f0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0080f0.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public int m320p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f617b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f618c = i;
            return;
        }
        StringBuilder sbM2079g = C0561a.m2079g("base aligned child index out of range (0, ");
        sbM2079g.append(getChildCount());
        sbM2079g.append(")");
        throw new IllegalArgumentException(sbM2079g.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f627l) {
            return;
        }
        this.f627l = drawable;
        if (drawable != null) {
            this.f628m = drawable.getIntrinsicWidth();
            this.f629n = drawable.getIntrinsicHeight();
        } else {
            this.f628m = 0;
            this.f629n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f631p = i;
    }

    public void setGravity(int i) {
        if (this.f621f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f621f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f621f;
        if ((8388615 & i3) != i2) {
            this.f621f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f624i = z;
    }

    public void setOrientation(int i) {
        if (this.f620e != i) {
            this.f620e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f630o) {
            requestLayout();
        }
        this.f630o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f621f;
        if ((i3 & 112) != i2) {
            this.f621f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f623h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

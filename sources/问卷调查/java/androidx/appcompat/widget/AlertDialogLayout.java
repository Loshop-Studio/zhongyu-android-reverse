package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p005b.p014h.C0080f0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* loaded from: classes.dex */
public class AlertDialogLayout extends C0080f0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: q */
    public static int m1582q(View view) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1582q(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Laf
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lac
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lac
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            a.b.h.f0$a r6 = (p000a.p005b.p014h.C0080f0.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            java.util.WeakHashMap<android.view.View, a.h.j.v> r8 = p000a.p031h.p043j.C0266o.f1616a
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8c
            r8 = 5
            if (r7 == r8) goto L89
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L97
        L89:
            int r7 = r11 - r4
            goto L94
        L8c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L94:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L97:
            boolean r8 = r9.m318n(r0)
            if (r8 == 0) goto L9e
            int r12 = r12 + r14
        L9e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lac:
            int r0 = r0 + 1
            goto L50
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.View
    public void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM1582q;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C1088R.id.topPanel) {
                    view = childAt;
                } else if (id == C1088R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id != C1088R.id.contentPanel && id != C1088R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM1582q = m1582q(view2);
            measuredHeight = view2.getMeasuredHeight() - iM1582q;
            paddingBottom += iM1582q;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM1582q = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iM1582q;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM1582q += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM1582q, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    C0080f0.a aVar = (C0080f0.a) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).width == -1) {
                        int i8 = ((LinearLayout.LayoutParams) aVar).height;
                        ((LinearLayout.LayoutParams) aVar).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) aVar).height = i8;
                    }
                }
            }
        }
        z = true;
        if (z) {
            return;
        }
        super.onMeasure(i, i2);
    }
}

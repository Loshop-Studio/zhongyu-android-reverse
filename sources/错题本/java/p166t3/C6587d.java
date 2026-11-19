package p166t3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.widget.textview.badge.BadgeView;

/* renamed from: t3.d */
/* loaded from: classes3.dex */
public final class C6587d extends ViewGroup {
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (getParent() instanceof RelativeLayout) {
            return;
        }
        super.dispatchRestoreInstanceState(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        View view = null;
        View view2 = null;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof BadgeView) {
                view2 = childAt;
            } else {
                view = childAt;
            }
        }
        if (view == null) {
            super.onMeasure(i, i8);
            return;
        }
        view.measure(i, i8);
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), BasicMeasure.EXACTLY));
        }
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}

package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p080c.C0578i;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f5092i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: C */
    public boolean mo2716C(View view, View view2, boolean z, boolean z2) {
        int iIntValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f5092i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0506f) && (((CoordinatorLayout.C0506f) childAt.getLayoutParams()).f3114a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    Map<View, Integer> map = this.f5092i;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        iIntValue = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        iIntValue = this.f5092i.get(childAt).intValue();
                    }
                    WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                    childAt.setImportantForAccessibility(iIntValue);
                }
            }
            if (!z) {
                this.f5092i = null;
            }
        }
        super.mo2716C(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: N */
    public FabTransformationBehavior.C0952b mo2727N(Context context, boolean z) {
        int i = z ? C1088R.animator.mtrl_fab_transformation_sheet_expand_spec : C1088R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C0952b c0952b = new FabTransformationBehavior.C0952b();
        c0952b.f5086a = C0576g.m2102b(context, i);
        c0952b.f5087b = new C0578i(17, 0.0f, 0.0f);
        return c0952b;
    }
}

package com.zykj.study.view.itemtouchhelper;

import android.graphics.Canvas;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.C4466R;
import androidx.recyclerview.widget.ItemTouchUIUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    /* renamed from: a */
    public final float m11979a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float elevation = childAt.getElevation();
                if (elevation > f10) {
                    f10 = elevation;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(View view) {
        AbstractC9133u.m16133g(view, "view");
        Object tag = view.getTag(C4466R.id.item_touch_helper_previous_elevation);
        if (tag != null && (tag instanceof Float)) {
            view.setElevation(((Number) tag).floatValue());
        }
        view.setTag(C4466R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(Canvas c10, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        AbstractC9133u.m16133g(c10, "c");
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(view, "view");
        if (z10 && view.getTag(C4466R.id.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(view.getElevation());
            view.setElevation(m11979a(recyclerView, view) + 1.0f);
            view.setTag(C4466R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(Canvas c10, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        AbstractC9133u.m16133g(c10, "c");
        AbstractC9133u.m16133g(recyclerView, "recyclerView");
        AbstractC9133u.m16133g(view, "view");
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(View view) {
        AbstractC9133u.m16133g(view, "view");
    }
}

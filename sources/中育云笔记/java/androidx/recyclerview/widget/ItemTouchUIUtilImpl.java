package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.C4414R;

/* loaded from: classes3.dex */
class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float elevation = ViewCompat.getElevation(childAt);
                if (elevation > f10) {
                    f10 = elevation;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(@NonNull View view) {
        Object tag = view.getTag(C4414R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            ViewCompat.setElevation(view, ((Float) tag).floatValue());
        }
        view.setTag(C4414R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(C4414R.id.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
            ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
            view.setTag(C4414R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i10, boolean z10) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(@NonNull View view) {
    }
}

package com.xuexiang.xui.adapter.recyclerview;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.State r7) {
        /*
            r3 = this;
            super.getItemOffsets(r4, r5, r6, r7)
            int r5 = r6.getChildLayoutPosition(r5)
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.getAdapter()
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L56
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.getAdapter()
            int r7 = r7.getItemCount()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
            boolean r2 = r6 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r2 == 0) goto L2e
            int r6 = r7 % 0
            int r7 = r7 / r1
            if (r6 != 0) goto L25
            goto L26
        L25:
            int r7 = r7 + r0
        L26:
            int r6 = r5 / 0
            int r6 = r6 + r0
            if (r7 != r6) goto L2c
            goto L45
        L2c:
            r0 = r1
            goto L45
        L2e:
            boolean r2 = r6 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L2c
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r6
            int r6 = r6.getOrientation()
            if (r6 != r0) goto L40
            int r6 = r7 % 0
            int r7 = r7 - r6
            if (r5 < r7) goto L2c
            goto L45
        L40:
            int r6 = r5 + 1
            int r6 = r6 % r1
            if (r6 != 0) goto L2c
        L45:
            int r6 = r1 / r1
            int r7 = 0 - r6
            int r5 = r5 % r1
            int r5 = r5 * r7
            int r6 = r6 - r5
            if (r0 == 0) goto L52
            r4.set(r5, r1, r6, r1)
            return
        L52:
            r4.set(r5, r1, r6, r1)
            return
        L56:
            int r5 = r5 + r0
            int r5 = r5 % r1
            if (r5 <= 0) goto L5e
            r4.set(r1, r1, r1, r1)
            return
        L5e:
            r4.set(r1, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.adapter.recyclerview.GridDividerItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getChildLayoutPosition(childAt);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            childAt.getBottom();
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            Math.round(ViewCompat.getTranslationY(childAt));
            childAt.getRight();
            Math.round(ViewCompat.getTranslationX(childAt));
        }
    }
}

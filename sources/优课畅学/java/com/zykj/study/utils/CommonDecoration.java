package com.zykj.study.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CommonDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f13718a;

    /* renamed from: b */
    public final int f13719b;

    /* renamed from: c */
    public final boolean f13720c;

    public CommonDecoration(int i10, int i11, boolean z10) {
        this.f13718a = i10;
        this.f13719b = i11;
        this.f13720c = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC9133u.m16133g(outRect, "outRect");
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(parent, "parent");
        AbstractC9133u.m16133g(state, "state");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager instanceof LinearLayoutManager) {
                int i10 = this.f13718a;
                int i11 = this.f13719b;
                outRect.set(i10, i11, i10, i11);
                return;
            }
            return;
        }
        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i12 = childAdapterPosition % spanCount;
        int i13 = childAdapterPosition / spanCount;
        if (this.f13720c) {
            outRect.top = i13 == 0 ? this.f13719b : 0;
            outRect.bottom = this.f13719b;
            int i14 = this.f13718a;
            outRect.left = ((spanCount - i12) * i14) / spanCount;
            outRect.right = ((i12 + 1) * i14) / spanCount;
            return;
        }
        outRect.top = i13 == 0 ? 0 : this.f13719b;
        outRect.bottom = 0;
        int i15 = this.f13718a;
        outRect.left = (i12 * i15) / spanCount;
        outRect.right = (((spanCount - i12) - 1) * i15) / spanCount;
    }
}

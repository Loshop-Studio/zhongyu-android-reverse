package com.friday.common.helper;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f6036a;

    /* renamed from: b */
    public final int f6037b;

    /* renamed from: c */
    public final boolean f6038c;

    /* renamed from: d */
    public final boolean f6039d;

    public /* synthetic */ GridSpacingItemDecoration(int i10, int i11, boolean z10, boolean z11, int i12, AbstractC9972n abstractC9972n) {
        this(i10, i11, z10, (i12 & 8) != 0 ? true : z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC9979u.m20294g(outRect, "outRect");
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(parent, "parent");
        AbstractC9979u.m20294g(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int i10 = this.f6036a;
        int i11 = childLayoutPosition % i10;
        if (!this.f6038c) {
            int i12 = this.f6037b;
            outRect.left = (i11 * i12) / i10;
            outRect.right = i12 - (((i11 + 1) * i12) / i10);
            if (childLayoutPosition >= i10) {
                outRect.top = i12;
                return;
            }
            return;
        }
        int i13 = this.f6037b;
        outRect.left = i13 - ((i11 * i13) / i10);
        outRect.right = ((i11 + 1) * i13) / i10;
        if (childLayoutPosition < i10 && this.f6039d) {
            outRect.top = i13;
        }
        outRect.bottom = i13;
    }

    public GridSpacingItemDecoration(int i10, int i11, boolean z10, boolean z11) {
        this.f6036a = i10;
        this.f6037b = i11;
        this.f6038c = z10;
        this.f6039d = z11;
    }
}

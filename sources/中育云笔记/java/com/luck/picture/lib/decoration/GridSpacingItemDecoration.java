package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f12383a;

    /* renamed from: b */
    public final int f12384b;

    /* renamed from: c */
    public final boolean f12385c;

    public GridSpacingItemDecoration(int i10, int i11, boolean z10) {
        this.f12383a = i10;
        this.f12384b = i11;
        this.f12385c = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f12383a;
        int i11 = childAdapterPosition % i10;
        if (this.f12385c) {
            int i12 = this.f12384b;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f12384b;
            rect.left = (i11 * i13) / i10;
            rect.right = i13 - (((i11 + 1) * i13) / i10);
        }
        if (childAdapterPosition < i10) {
            rect.top = this.f12384b;
        }
        rect.bottom = this.f12384b;
    }
}

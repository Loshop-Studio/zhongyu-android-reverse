package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f12386a;

    /* renamed from: b */
    public final int f12387b;

    public HorizontalItemDecoration(int i10, int i11) {
        this.f12386a = i10;
        this.f12387b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f12386a;
        int i11 = childAdapterPosition % i10;
        if (childAdapterPosition == 0) {
            int i12 = this.f12387b;
            rect.left = i12 - ((i11 * i12) / i10);
        } else {
            rect.left = (this.f12387b * i11) / i10;
        }
        int i13 = this.f12387b;
        rect.right = i13 - (((i11 + 1) * i13) / i10);
        if (childAdapterPosition < i10) {
            rect.top = i13;
        }
        rect.bottom = i13;
    }
}

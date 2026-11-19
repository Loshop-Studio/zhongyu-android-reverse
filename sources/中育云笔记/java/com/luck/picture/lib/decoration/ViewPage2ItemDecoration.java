package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class ViewPage2ItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f12388a;

    /* renamed from: b */
    public final int f12389b;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f12388a;
        int i11 = childAdapterPosition % i10;
        int i12 = this.f12389b;
        rect.left = i12 - ((i11 * i12) / i10);
        rect.right = ((i11 + 1) * i12) / i10;
    }
}

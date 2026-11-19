package com.yanzhenjie.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class BorderItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f8540a;

    /* renamed from: b */
    public final int f8541b;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i10 = this.f8540a;
        int i11 = this.f8541b;
        rect.set(i10, i11, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        canvas.save();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager.getChildCount() <= 0) {
            canvas.restore();
        } else {
            layoutManager.getChildAt(0);
            throw null;
        }
    }
}

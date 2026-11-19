package com.xuexiang.xui.adapter.recyclerview.sticky;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class FullSpanUtils {
    private FullSpanUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void onAttachedToRecyclerView(RecyclerView recyclerView, final RecyclerView.AbstractC0562g abstractC0562g, final int i4) {
        RecyclerView.AbstractC0570o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.AbstractC0548b spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.AbstractC0548b() { // from class: com.xuexiang.xui.adapter.recyclerview.sticky.FullSpanUtils.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0548b
                public int getSpanSize(int i5) {
                    if (abstractC0562g.getItemViewType(i5) == i4) {
                        return gridLayoutManager.getSpanCount();
                    }
                    GridLayoutManager.AbstractC0548b abstractC0548b = spanSizeLookup;
                    if (abstractC0548b != null) {
                        return abstractC0548b.getSpanSize(i5);
                    }
                    return 1;
                }
            });
        }
    }

    public static void onViewAttachedToWindow(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0562g abstractC0562g, int i4) {
        ViewGroup.LayoutParams layoutParams = abstractC0557b0.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).m3218g(abstractC0562g.getItemViewType(abstractC0557b0.getLayoutPosition()) == i4);
        }
    }
}

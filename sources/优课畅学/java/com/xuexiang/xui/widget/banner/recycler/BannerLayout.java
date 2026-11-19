package com.xuexiang.xui.widget.banner.recycler;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class BannerLayout extends FrameLayout {

    public class IndicatorAdapter extends RecyclerView.Adapter {

        /* renamed from: a */
        public int f7143a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return BannerLayout.m6558c(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f7143a == i10 ? BannerLayout.m6556a(null) : BannerLayout.m6557b(null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m6556a(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ Drawable m6557b(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ int m6558c(BannerLayout bannerLayout) {
        throw null;
    }
}

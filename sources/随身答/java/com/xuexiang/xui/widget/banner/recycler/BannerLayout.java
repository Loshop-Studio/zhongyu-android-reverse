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
        public int f7073a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return BannerLayout.m6533c(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i9) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f7073a == i9 ? BannerLayout.m6531a(null) : BannerLayout.m6532b(null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i9) {
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m6531a(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ Drawable m6532b(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ int m6533c(BannerLayout bannerLayout) {
        throw null;
    }
}

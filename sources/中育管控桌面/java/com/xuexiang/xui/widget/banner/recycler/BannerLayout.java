package com.xuexiang.xui.widget.banner.recycler;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class BannerLayout extends FrameLayout {

    public class IndicatorAdapter extends RecyclerView.Adapter {

        /* renamed from: a */
        public int f4542a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return BannerLayout.m4447c(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i6) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f4542a == i6 ? BannerLayout.m4445a(null) : BannerLayout.m4446b(null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i6) {
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m4445a(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ Drawable m4446b(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ int m4447c(BannerLayout bannerLayout) {
        throw null;
    }
}

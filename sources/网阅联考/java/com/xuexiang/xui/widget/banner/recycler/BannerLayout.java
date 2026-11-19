package com.xuexiang.xui.widget.banner.recycler;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class BannerLayout extends FrameLayout {

    public class IndicatorAdapter extends RecyclerView.Adapter {

        /* renamed from: a */
        public int f3158a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return BannerLayout.m4123c(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            ((ImageView) viewHolder.itemView).setImageDrawable(this.f3158a == i4 ? BannerLayout.m4121a(null) : BannerLayout.m4122b(null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m4121a(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ Drawable m4122b(BannerLayout bannerLayout) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ int m4123c(BannerLayout bannerLayout) {
        throw null;
    }
}

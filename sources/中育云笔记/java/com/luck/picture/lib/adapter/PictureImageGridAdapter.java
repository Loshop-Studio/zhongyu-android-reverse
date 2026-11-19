package com.luck.picture.lib.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;

/* loaded from: classes5.dex */
public class PictureImageGridAdapter extends RecyclerView.Adapter<BaseRecyclerMediaHolder> {

    /* renamed from: a */
    public boolean f12157a;

    /* renamed from: b */
    public ArrayList f12158b = new ArrayList();

    /* renamed from: c */
    public final PictureSelectionConfig f12159c;

    /* renamed from: d */
    public final Context f12160d;

    /* renamed from: e */
    public InterfaceC7441b f12161e;

    /* renamed from: com.luck.picture.lib.adapter.PictureImageGridAdapter$a */
    public class ViewOnClickListenerC7440a implements View.OnClickListener {
        public ViewOnClickListenerC7440a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureImageGridAdapter.this.f12161e != null) {
                PictureImageGridAdapter.this.f12161e.mo8994b();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.PictureImageGridAdapter$b */
    public interface InterfaceC7441b {
        /* renamed from: a */
        int mo8993a(View view, int i10, LocalMedia localMedia);

        /* renamed from: b */
        void mo8994b();

        /* renamed from: c */
        void mo8995c(View view, int i10, LocalMedia localMedia);

        /* renamed from: d */
        void mo8996d(View view, int i10);
    }

    public PictureImageGridAdapter(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f12159c = pictureSelectionConfig;
        this.f12160d = context;
    }

    /* renamed from: b */
    public ArrayList m9135b() {
        return this.f12158b;
    }

    /* renamed from: c */
    public final int m9136c(int i10) {
        if (i10 == 1) {
            return R$layout.ps_item_grid_camera;
        }
        if (i10 == 3) {
            int iM21171a = AbstractC10148b.m21171a(this.f12160d, 4);
            return iM21171a != 0 ? iM21171a : R$layout.ps_item_grid_video;
        }
        if (i10 != 4) {
            int iM21171a2 = AbstractC10148b.m21171a(this.f12160d, 3);
            return iM21171a2 != 0 ? iM21171a2 : R$layout.ps_item_grid_image;
        }
        int iM21171a3 = AbstractC10148b.m21171a(this.f12160d, 5);
        return iM21171a3 != 0 ? iM21171a3 : R$layout.ps_item_grid_audio;
    }

    /* renamed from: d */
    public boolean m9137d() {
        return this.f12158b.size() == 0;
    }

    /* renamed from: e */
    public boolean m9138e() {
        return this.f12157a;
    }

    /* renamed from: f */
    public void m9139f(int i10) {
        notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseRecyclerMediaHolder baseRecyclerMediaHolder, int i10) {
        if (getItemViewType(i10) == 1) {
            baseRecyclerMediaHolder.itemView.setOnClickListener(new ViewOnClickListenerC7440a());
            return;
        }
        if (this.f12157a) {
            i10--;
        }
        baseRecyclerMediaHolder.mo9158d((LocalMedia) this.f12158b.get(i10), i10);
        baseRecyclerMediaHolder.m9180k(this.f12161e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12157a ? this.f12158b.size() + 1 : this.f12158b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        boolean z10 = this.f12157a;
        if (z10 && i10 == 0) {
            return 1;
        }
        if (z10) {
            i10--;
        }
        String strM9397t = ((LocalMedia) this.f12158b.get(i10)).m9397t();
        if (AbstractC10149c.m21180i(strM9397t)) {
            return 3;
        }
        return AbstractC10149c.m21175d(strM9397t) ? 4 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public BaseRecyclerMediaHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return BaseRecyclerMediaHolder.m9175f(viewGroup, i10, m9136c(i10), this.f12159c);
    }

    /* renamed from: i */
    public void m9142i(ArrayList arrayList) {
        if (arrayList != null) {
            this.f12158b = arrayList;
            notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public void m9143j(boolean z10) {
        this.f12157a = z10;
    }

    /* renamed from: k */
    public void m9144k(InterfaceC7441b interfaceC7441b) {
        this.f12161e = interfaceC7441b;
    }
}

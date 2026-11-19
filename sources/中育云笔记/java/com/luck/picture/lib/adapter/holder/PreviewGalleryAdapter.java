package com.luck.picture.lib.adapter.holder;

import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import java.util.ArrayList;
import java.util.List;
import p008a7.AbstractC0082o;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;
import p260n6.InterfaceC10322a;

/* loaded from: classes5.dex */
public class PreviewGalleryAdapter extends RecyclerView.Adapter<C7463e> {

    /* renamed from: a */
    public final List f12226a;

    /* renamed from: b */
    public final boolean f12227b;

    /* renamed from: c */
    public InterfaceC7461c f12228c;

    /* renamed from: d */
    public InterfaceC7462d f12229d;

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter$a */
    public class ViewOnClickListenerC7459a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ C7463e f12230c;

        /* renamed from: d */
        public final /* synthetic */ LocalMedia f12231d;

        public ViewOnClickListenerC7459a(C7463e c7463e, LocalMedia localMedia) {
            this.f12230c = c7463e;
            this.f12231d = localMedia;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PreviewGalleryAdapter.this.f12228c != null) {
                PreviewGalleryAdapter.this.f12228c.mo9090a(this.f12230c.getAbsoluteAdapterPosition(), this.f12231d, view);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter$b */
    public class ViewOnLongClickListenerC7460b implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ C7463e f12233c;

        public ViewOnLongClickListenerC7460b(C7463e c7463e) {
            this.f12233c = c7463e;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (PreviewGalleryAdapter.this.f12229d == null) {
                return true;
            }
            PreviewGalleryAdapter.this.f12229d.mo9091a(this.f12233c, this.f12233c.getAbsoluteAdapterPosition(), view);
            return true;
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter$c */
    public interface InterfaceC7461c {
        /* renamed from: a */
        void mo9090a(int i10, LocalMedia localMedia, View view);
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter$d */
    public interface InterfaceC7462d {
        /* renamed from: a */
        void mo9091a(RecyclerView.ViewHolder viewHolder, int i10, View view);
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter$e */
    public static class C7463e extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public ImageView f12235c;

        /* renamed from: d */
        public ImageView f12236d;

        /* renamed from: e */
        public ImageView f12237e;

        /* renamed from: f */
        public View f12238f;

        public C7463e(View view) {
            super(view);
            this.f12235c = (ImageView) view.findViewById(R$id.ivImage);
            this.f12236d = (ImageView) view.findViewById(R$id.ivPlay);
            this.f12237e = (ImageView) view.findViewById(R$id.ivEditor);
            this.f12238f = view.findViewById(R$id.viewBorder);
            SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
            if (AbstractC0082o.m228c(selectMainStyleM26627c.m9541o())) {
                this.f12237e.setImageResource(selectMainStyleM26627c.m9541o());
            }
            if (AbstractC0082o.m228c(selectMainStyleM26627c.m9544r())) {
                this.f12238f.setBackgroundResource(selectMainStyleM26627c.m9544r());
            }
            int iM9545s = selectMainStyleM26627c.m9545s();
            if (AbstractC0082o.m227b(iM9545s)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(iM9545s, iM9545s));
            }
        }
    }

    public PreviewGalleryAdapter(boolean z10, List list) {
        this.f12227b = z10;
        this.f12226a = new ArrayList(list);
        for (int i10 = 0; i10 < this.f12226a.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) this.f12226a.get(i10);
            localMedia.m9369e0(false);
            localMedia.m9355Q(false);
        }
    }

    /* renamed from: c */
    public void m9213c(LocalMedia localMedia) {
        int iM9216f = m9216f();
        if (iM9216f != -1) {
            ((LocalMedia) this.f12226a.get(iM9216f)).m9355Q(false);
            notifyItemChanged(iM9216f);
        }
        if (!this.f12227b || !this.f12226a.contains(localMedia)) {
            localMedia.m9355Q(true);
            this.f12226a.add(localMedia);
            notifyItemChanged(this.f12226a.size() - 1);
        } else {
            int iM9215e = m9215e(localMedia);
            LocalMedia localMedia2 = (LocalMedia) this.f12226a.get(iM9215e);
            localMedia2.m9369e0(false);
            localMedia2.m9355Q(true);
            notifyItemChanged(iM9215e);
        }
    }

    /* renamed from: d */
    public void m9214d() {
        this.f12226a.clear();
    }

    /* renamed from: e */
    public final int m9215e(LocalMedia localMedia) {
        for (int i10 = 0; i10 < this.f12226a.size(); i10++) {
            LocalMedia localMedia2 = (LocalMedia) this.f12226a.get(i10);
            if (TextUtils.equals(localMedia2.m9401x(), localMedia.m9401x()) || localMedia2.m9395s() == localMedia.m9395s()) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public int m9216f() {
        for (int i10 = 0; i10 < this.f12226a.size(); i10++) {
            if (((LocalMedia) this.f12226a.get(i10)).m9344E()) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public void m9217g(LocalMedia localMedia) {
        int iM9216f = m9216f();
        if (iM9216f != -1) {
            ((LocalMedia) this.f12226a.get(iM9216f)).m9355Q(false);
            notifyItemChanged(iM9216f);
        }
        int iM9215e = m9215e(localMedia);
        if (iM9215e != -1) {
            ((LocalMedia) this.f12226a.get(iM9215e)).m9355Q(true);
            notifyItemChanged(iM9215e);
        }
    }

    public List getData() {
        return this.f12226a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12226a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C7463e c7463e, int i10) {
        LocalMedia localMedia = (LocalMedia) this.f12226a.get(i10);
        ColorFilter colorFilterM232g = AbstractC0082o.m232g(c7463e.itemView.getContext(), localMedia.m9348I() ? R$color.ps_color_half_white : R$color.ps_color_transparent);
        if (localMedia.m9344E() && localMedia.m9348I()) {
            c7463e.f12238f.setVisibility(0);
        } else {
            c7463e.f12238f.setVisibility(localMedia.m9344E() ? 0 : 8);
        }
        String strM9401x = localMedia.m9401x();
        if (!localMedia.m9347H() || TextUtils.isEmpty(localMedia.m9385n())) {
            c7463e.f12237e.setVisibility(8);
        } else {
            strM9401x = localMedia.m9385n();
            c7463e.f12237e.setVisibility(0);
        }
        c7463e.f12235c.setColorFilter(colorFilterM232g);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        if (interfaceC10322a != null) {
            interfaceC10322a.mo19807e(c7463e.itemView.getContext(), strM9401x, c7463e.f12235c);
        }
        c7463e.f12236d.setVisibility(AbstractC10149c.m21180i(localMedia.m9397t()) ? 0 : 8);
        c7463e.itemView.setOnClickListener(new ViewOnClickListenerC7459a(c7463e, localMedia));
        c7463e.itemView.setOnLongClickListener(new ViewOnLongClickListenerC7460b(c7463e));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C7463e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int iM21171a = AbstractC10148b.m21171a(viewGroup.getContext(), 9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iM21171a == 0) {
            iM21171a = R$layout.ps_preview_gallery_item;
        }
        return new C7463e(layoutInflaterFrom.inflate(iM21171a, viewGroup, false));
    }

    /* renamed from: j */
    public void m9220j(LocalMedia localMedia) {
        int iM9215e = m9215e(localMedia);
        if (iM9215e != -1) {
            if (this.f12227b) {
                ((LocalMedia) this.f12226a.get(iM9215e)).m9369e0(true);
                notifyItemChanged(iM9215e);
            } else {
                this.f12226a.remove(iM9215e);
                notifyItemRemoved(iM9215e);
            }
        }
    }

    /* renamed from: k */
    public void m9221k(InterfaceC7461c interfaceC7461c) {
        this.f12228c = interfaceC7461c;
    }

    /* renamed from: l */
    public void m9222l(InterfaceC7462d interfaceC7462d) {
        this.f12229d = interfaceC7462d;
    }
}

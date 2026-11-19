package com.luck.picture.lib.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewAudioHolder;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;

/* loaded from: classes5.dex */
public class PicturePreviewAdapter extends RecyclerView.Adapter<BasePreviewHolder> {

    /* renamed from: a */
    public List f12163a;

    /* renamed from: b */
    public BasePreviewHolder.InterfaceC7442a f12164b;

    /* renamed from: c */
    public final LinkedHashMap f12165c = new LinkedHashMap();

    /* renamed from: a */
    public void m9145a() {
        Iterator it = this.f12165c.keySet().iterator();
        while (it.hasNext()) {
            BasePreviewHolder basePreviewHolder = (BasePreviewHolder) this.f12165c.get((Integer) it.next());
            if (basePreviewHolder instanceof PreviewVideoHolder) {
                ((PreviewVideoHolder) basePreviewHolder).m9232v();
            } else if (basePreviewHolder instanceof PreviewAudioHolder) {
                ((PreviewAudioHolder) basePreviewHolder).m9199E();
            }
        }
    }

    /* renamed from: b */
    public BasePreviewHolder m9146b(int i10) {
        return (BasePreviewHolder) this.f12165c.get(Integer.valueOf(i10));
    }

    /* renamed from: c */
    public LocalMedia m9147c(int i10) {
        if (i10 > this.f12163a.size()) {
            return null;
        }
        return (LocalMedia) this.f12163a.get(i10);
    }

    /* renamed from: d */
    public boolean m9148d(int i10) {
        BasePreviewHolder basePreviewHolderM9146b = m9146b(i10);
        if (basePreviewHolderM9146b instanceof PreviewVideoHolder) {
            return ((PreviewVideoHolder) basePreviewHolderM9146b).m9228q();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BasePreviewHolder basePreviewHolder, int i10) {
        basePreviewHolder.m9170k(this.f12164b);
        LocalMedia localMediaM9147c = m9147c(i10);
        this.f12165c.put(Integer.valueOf(i10), basePreviewHolder);
        basePreviewHolder.mo9161a(localMediaM9147c, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public BasePreviewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 2) {
            int iM21171a = AbstractC10148b.m21171a(viewGroup.getContext(), 8);
            if (iM21171a == 0) {
                iM21171a = R$layout.ps_preview_video;
            }
            return BasePreviewHolder.m9160c(viewGroup, i10, iM21171a);
        }
        if (i10 == 3) {
            int iM21171a2 = AbstractC10148b.m21171a(viewGroup.getContext(), 10);
            if (iM21171a2 == 0) {
                iM21171a2 = R$layout.ps_preview_audio;
            }
            return BasePreviewHolder.m9160c(viewGroup, i10, iM21171a2);
        }
        int iM21171a3 = AbstractC10148b.m21171a(viewGroup.getContext(), 7);
        if (iM21171a3 == 0) {
            iM21171a3 = R$layout.ps_preview_image;
        }
        return BasePreviewHolder.m9160c(viewGroup, i10, iM21171a3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(BasePreviewHolder basePreviewHolder) {
        super.onViewAttachedToWindow(basePreviewHolder);
        basePreviewHolder.mo9167h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f12163a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (AbstractC10149c.m21180i(((LocalMedia) this.f12163a.get(i10)).m9397t())) {
            return 2;
        }
        return AbstractC10149c.m21175d(((LocalMedia) this.f12163a.get(i10)).m9397t()) ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(BasePreviewHolder basePreviewHolder) {
        super.onViewDetachedFromWindow(basePreviewHolder);
        basePreviewHolder.mo9168i();
    }

    /* renamed from: i */
    public void m9153i(int i10) {
        BasePreviewHolder basePreviewHolderM9146b = m9146b(i10);
        if (basePreviewHolderM9146b != null) {
            LocalMedia localMediaM9147c = m9147c(i10);
            if (localMediaM9147c.m9343D() == 0 && localMediaM9147c.m9393r() == 0) {
                basePreviewHolderM9146b.f12172h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                basePreviewHolderM9146b.f12172h.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    /* renamed from: j */
    public void m9154j(List list) {
        this.f12163a = list;
    }

    /* renamed from: k */
    public void m9155k(BasePreviewHolder.InterfaceC7442a interfaceC7442a) {
        this.f12164b = interfaceC7442a;
    }

    /* renamed from: l */
    public void m9156l(int i10) {
        BasePreviewHolder basePreviewHolderM9146b = m9146b(i10);
        if (basePreviewHolderM9146b instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderM9146b;
            if (previewVideoHolder.m9228q()) {
                return;
            }
            previewVideoHolder.f12242j.setVisibility(0);
        }
    }

    /* renamed from: m */
    public void m9157m(int i10) {
        BasePreviewHolder basePreviewHolderM9146b = m9146b(i10);
        if (basePreviewHolderM9146b instanceof PreviewVideoHolder) {
            ((PreviewVideoHolder) basePreviewHolderM9146b).m9233w();
        }
    }
}

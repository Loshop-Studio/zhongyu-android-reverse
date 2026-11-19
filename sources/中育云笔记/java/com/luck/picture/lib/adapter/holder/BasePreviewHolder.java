package com.luck.picture.lib.adapter.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.PhotoView;
import p008a7.AbstractC0070c;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0075h;

/* loaded from: classes5.dex */
public abstract class BasePreviewHolder extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public final int f12167c;

    /* renamed from: d */
    public final int f12168d;

    /* renamed from: e */
    public final int f12169e;

    /* renamed from: f */
    public LocalMedia f12170f;

    /* renamed from: g */
    public final PictureSelectionConfig f12171g;

    /* renamed from: h */
    public PhotoView f12172h;

    /* renamed from: i */
    public InterfaceC7442a f12173i;

    /* renamed from: com.luck.picture.lib.adapter.holder.BasePreviewHolder$a */
    public interface InterfaceC7442a {
        /* renamed from: a */
        void mo9104a();

        /* renamed from: b */
        void mo9105b(LocalMedia localMedia);

        /* renamed from: c */
        void mo9106c(String str);
    }

    public BasePreviewHolder(View view) {
        super(view);
        this.f12171g = PictureSelectionConfig.m9328c();
        this.f12167c = AbstractC0072e.m165e(view.getContext());
        this.f12168d = AbstractC0072e.m167g(view.getContext());
        this.f12169e = AbstractC0072e.m164d(view.getContext());
        this.f12172h = (PhotoView) view.findViewById(R$id.preview_image);
        mo9162b(view);
    }

    /* renamed from: c */
    public static BasePreviewHolder m9160c(ViewGroup viewGroup, int i10, int i11) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        return i10 == 2 ? new PreviewVideoHolder(viewInflate) : i10 == 3 ? new PreviewAudioHolder(viewInflate) : new PreviewImageHolder(viewInflate);
    }

    /* renamed from: a */
    public void mo9161a(LocalMedia localMedia, int i10) {
        this.f12170f = localMedia;
        int[] iArrM9163d = m9163d(localMedia);
        int[] iArrM146b = AbstractC0070c.m146b(iArrM9163d[0], iArrM9163d[1]);
        mo9164e(localMedia, iArrM146b[0], iArrM146b[1]);
        mo9171l(localMedia);
        m9169j(localMedia);
        mo9165f();
        mo9166g(localMedia);
    }

    /* renamed from: b */
    public abstract void mo9162b(View view);

    /* renamed from: d */
    public int[] m9163d(LocalMedia localMedia) {
        return (!localMedia.m9346G() || localMedia.m9381l() <= 0 || localMedia.m9379k() <= 0) ? new int[]{localMedia.m9343D(), localMedia.m9393r()} : new int[]{localMedia.m9381l(), localMedia.m9379k()};
    }

    /* renamed from: e */
    public abstract void mo9164e(LocalMedia localMedia, int i10, int i11);

    /* renamed from: f */
    public abstract void mo9165f();

    /* renamed from: g */
    public abstract void mo9166g(LocalMedia localMedia);

    /* renamed from: h */
    public void mo9167h() {
    }

    /* renamed from: i */
    public void mo9168i() {
    }

    /* renamed from: j */
    public void m9169j(LocalMedia localMedia) {
        if (AbstractC0075h.m190m(localMedia.m9343D(), localMedia.m9393r())) {
            this.f12172h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f12172h.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* renamed from: k */
    public void m9170k(InterfaceC7442a interfaceC7442a) {
        this.f12173i = interfaceC7442a;
    }

    /* renamed from: l */
    public void mo9171l(LocalMedia localMedia) {
        if (this.f12171g.f12322M || this.f12167c >= this.f12168d || localMedia.m9343D() <= 0 || localMedia.m9393r() <= 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12172h.getLayoutParams();
        layoutParams.width = this.f12167c;
        layoutParams.height = this.f12169e;
        layoutParams.gravity = 17;
    }
}

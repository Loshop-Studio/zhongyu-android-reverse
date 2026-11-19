package com.luck.picture.lib.adapter.holder;

import android.view.View;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import p403x6.InterfaceC11807j;

/* loaded from: classes5.dex */
public class PreviewImageHolder extends BasePreviewHolder {

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewImageHolder$a */
    public class C7464a implements InterfaceC11807j {
        public C7464a() {
        }

        @Override // p403x6.InterfaceC11807j
        /* renamed from: a */
        public void mo9210a(View view, float f10, float f11) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewImageHolder.this.f12173i;
            if (interfaceC7442a != null) {
                interfaceC7442a.mo9104a();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewImageHolder$b */
    public class ViewOnLongClickListenerC7465b implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12240c;

        public ViewOnLongClickListenerC7465b(LocalMedia localMedia) {
            this.f12240c = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewImageHolder.this.f12173i;
            if (interfaceC7442a == null) {
                return false;
            }
            interfaceC7442a.mo9105b(this.f12240c);
            return false;
        }
    }

    public PreviewImageHolder(View view) {
        super(view);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: b */
    public void mo9162b(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: e */
    public void mo9164e(LocalMedia localMedia, int i10, int i11) {
        if (PictureSelectionConfig.f12293N0 != null) {
            String strM9371g = localMedia.m9371g();
            if (i10 == -1 && i11 == -1) {
                PictureSelectionConfig.f12293N0.mo19804b(this.itemView.getContext(), strM9371g, this.f12172h);
            } else {
                PictureSelectionConfig.f12293N0.mo19808f(this.itemView.getContext(), this.f12172h, strM9371g, i10, i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: f */
    public void mo9165f() {
        this.f12172h.setOnViewTapListener(new C7464a());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: g */
    public void mo9166g(LocalMedia localMedia) {
        this.f12172h.setOnLongClickListener(new ViewOnLongClickListenerC7465b(localMedia));
    }
}

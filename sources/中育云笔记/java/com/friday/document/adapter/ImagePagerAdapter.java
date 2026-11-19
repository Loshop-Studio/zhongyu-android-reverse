package com.friday.document.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.friday.document.R$drawable;
import com.friday.document.adapter.ImagePagerAdapter;
import com.friday.document.databinding.ItemPhotoPreviewBinding;
import com.friday.document.model.ShareFile;
import com.luck.picture.lib.photoview.PhotoView;
import gb.AbstractC9286b;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p428z0.C11955d;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ImagePagerAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    /* renamed from: a */
    public final List f6239a;

    /* renamed from: b */
    public InterfaceC9529a f6240b;

    public final class ImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemPhotoPreviewBinding f6241c;

        /* renamed from: d */
        public final /* synthetic */ ImagePagerAdapter f6242d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(ImagePagerAdapter imagePagerAdapter, ItemPhotoPreviewBinding binding) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            this.f6242d = imagePagerAdapter;
            this.f6241c = binding;
        }

        /* renamed from: a */
        public final ItemPhotoPreviewBinding m5467a() {
            return this.f6241c;
        }
    }

    public ImagePagerAdapter(List images, InterfaceC9529a onControlsVisibleClick) {
        AbstractC9979u.m20294g(images, "images");
        AbstractC9979u.m20294g(onControlsVisibleClick, "onControlsVisibleClick");
        this.f6239a = images;
        this.f6240b = onControlsVisibleClick;
    }

    /* renamed from: c */
    public static final C10786q m5464c(ImagePagerAdapter imagePagerAdapter, View it) {
        AbstractC9979u.m20294g(it, "it");
        imagePagerAdapter.f6240b.invoke();
        return C10786q.f26013a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ImageViewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        ComponentCallbacks2C5810b.m3946t(holder.m5467a().f6499c.getContext()).m4016t(((ShareFile) this.f6239a.get(i10)).getFileUrl()).mo3989b(((C11955d) new C11955d().m26535W(R$drawable.placeholder)).m26553j(R$drawable.errorholder)).m3981A0(holder.m5467a().f6499c);
        PhotoView ivPhoto = holder.m5467a().f6499c;
        AbstractC9979u.m20293f(ivPhoto, "ivPhoto");
        AbstractC9286b.m18309e(ivPhoto, new InterfaceC9540l() { // from class: o2.f
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ImagePagerAdapter.m5464c(this.f24831c, (View) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemPhotoPreviewBinding itemPhotoPreviewBindingM5535a = ItemPhotoPreviewBinding.m5535a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemPhotoPreviewBindingM5535a, "inflate(...)");
        return new ImageViewHolder(this, itemPhotoPreviewBindingM5535a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6239a.size();
    }
}

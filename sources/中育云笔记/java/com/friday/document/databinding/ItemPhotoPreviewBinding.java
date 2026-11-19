package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;
import com.luck.picture.lib.photoview.PhotoView;

/* loaded from: classes3.dex */
public abstract class ItemPhotoPreviewBinding extends ViewDataBinding {

    /* renamed from: c */
    public final PhotoView f6499c;

    public ItemPhotoPreviewBinding(Object obj, View view, int i10, PhotoView photoView) {
        super(obj, view, i10);
        this.f6499c = photoView;
    }

    /* renamed from: a */
    public static ItemPhotoPreviewBinding m5535a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5536c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemPhotoPreviewBinding m5536c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemPhotoPreviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_photo_preview, viewGroup, z10, obj);
    }
}

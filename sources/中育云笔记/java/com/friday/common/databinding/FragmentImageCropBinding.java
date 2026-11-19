package com.friday.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.canhub.cropper.CropImageView;
import com.friday.common.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentImageCropBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f5987c;

    /* renamed from: d */
    public final ImageView f5988d;

    /* renamed from: e */
    public final ProgressBar f5989e;

    /* renamed from: f */
    public final CropImageView f5990f;

    public FragmentImageCropBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ProgressBar progressBar, CropImageView cropImageView) {
        super(obj, view, i10);
        this.f5987c = imageView;
        this.f5988d = imageView2;
        this.f5989e = progressBar;
        this.f5990f = cropImageView;
    }

    /* renamed from: a */
    public static FragmentImageCropBinding m5234a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5235c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static FragmentImageCropBinding m5235c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (FragmentImageCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_image_crop, viewGroup, z10, obj);
    }
}

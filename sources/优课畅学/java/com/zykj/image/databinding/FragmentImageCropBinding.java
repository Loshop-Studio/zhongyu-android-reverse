package com.zykj.image.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.imageview.crop.CropImageView;

/* loaded from: classes4.dex */
public abstract class FragmentImageCropBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f9810a;

    /* renamed from: b */
    public final ImageView f9811b;

    /* renamed from: c */
    public final ProgressBar f9812c;

    /* renamed from: d */
    public final CropImageView f9813d;

    public FragmentImageCropBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ProgressBar progressBar, CropImageView cropImageView) {
        super(obj, view, i10);
        this.f9810a = imageView;
        this.f9811b = imageView2;
        this.f9812c = progressBar;
        this.f9813d = cropImageView;
    }
}

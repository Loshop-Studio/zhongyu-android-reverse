package com.canhub.cropper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.R$layout;

/* loaded from: classes3.dex */
public final class CropImageActivityBinding implements ViewBinding {

    /* renamed from: a */
    public final CropImageView f3983a;

    /* renamed from: b */
    public final CropImageView f3984b;

    public CropImageActivityBinding(CropImageView cropImageView, CropImageView cropImageView2) {
        this.f3983a = cropImageView;
        this.f3984b = cropImageView2;
    }

    /* renamed from: a */
    public static CropImageActivityBinding m3613a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CropImageView cropImageView = (CropImageView) view;
        return new CropImageActivityBinding(cropImageView, cropImageView);
    }

    /* renamed from: c */
    public static CropImageActivityBinding m3614c(LayoutInflater layoutInflater) {
        return m3615d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static CropImageActivityBinding m3615d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R$layout.crop_image_activity, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m3613a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView getRoot() {
        return this.f3983a;
    }
}

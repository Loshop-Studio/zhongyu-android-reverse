package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.canhub.cropper.CropImageView;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewActivityEzyCropBinding extends ViewDataBinding {

    @NonNull
    public final ImageView cancel;

    @NonNull
    public final ImageView confirmCrop;

    @NonNull
    public final CropImageView cropImageView;

    @NonNull
    public final ImageView ivTip;

    @NonNull
    public final ImageView rotate;

    @NonNull
    public final TextView tvTip;

    public ViewActivityEzyCropBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CropImageView cropImageView, ImageView imageView3, ImageView imageView4, TextView textView) {
        super(obj, view, i);
        this.cancel = imageView;
        this.confirmCrop = imageView2;
        this.cropImageView = cropImageView;
        this.ivTip = imageView3;
        this.rotate = imageView4;
        this.tvTip = textView;
    }

    public static ViewActivityEzyCropBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewActivityEzyCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewActivityEzyCropBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewActivityEzyCropBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_activity_ezy_crop);
    }

    @NonNull
    @Deprecated
    public static ViewActivityEzyCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewActivityEzyCropBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_activity_ezy_crop, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewActivityEzyCropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewActivityEzyCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewActivityEzyCropBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_activity_ezy_crop, null, false, obj);
    }
}

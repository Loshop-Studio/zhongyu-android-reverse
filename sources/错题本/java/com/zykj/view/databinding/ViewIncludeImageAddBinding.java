package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewIncludeImageAddBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivImageCamera;

    @NonNull
    public final AppCompatImageView ivImageGallery;

    @NonNull
    public final AppCompatImageView ivOval;

    @NonNull
    public final AppCompatImageView ivRectangle;

    @NonNull
    public final AppCompatImageView ivText;

    @NonNull
    public final ImageView ivTriangle;

    public ViewIncludeImageAddBinding(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, ImageView imageView) {
        super(obj, view, i);
        this.ivImageCamera = appCompatImageView;
        this.ivImageGallery = appCompatImageView2;
        this.ivOval = appCompatImageView3;
        this.ivRectangle = appCompatImageView4;
        this.ivText = appCompatImageView5;
        this.ivTriangle = imageView;
    }

    public static ViewIncludeImageAddBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeImageAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeImageAddBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeImageAddBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_image_add);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeImageAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeImageAddBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_image_add, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeImageAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeImageAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeImageAddBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_image_add, null, false, obj);
    }
}

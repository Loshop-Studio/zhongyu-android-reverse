package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentImageShowBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivPrev;

    public FragmentImageShowBinding(Object obj, View view, int i10, ImageView imageView) {
        super(obj, view, i10);
        this.ivPrev = imageView;
    }

    public static FragmentImageShowBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentImageShowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentImageShowBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentImageShowBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_image_show);
    }

    @NonNull
    @Deprecated
    public static FragmentImageShowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentImageShowBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_image_show, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentImageShowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentImageShowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentImageShowBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_image_show, null, false, obj);
    }
}

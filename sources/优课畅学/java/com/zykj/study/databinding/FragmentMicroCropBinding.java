package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMicroCropBinding extends ViewDataBinding {

    @NonNull
    public final FragmentContainerView fragmentContainerSketchCrop;

    public FragmentMicroCropBinding(Object obj, View view, int i10, FragmentContainerView fragmentContainerView) {
        super(obj, view, i10);
        this.fragmentContainerSketchCrop = fragmentContainerView;
    }

    public static FragmentMicroCropBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMicroCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMicroCropBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMicroCropBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_micro_crop);
    }

    @NonNull
    @Deprecated
    public static FragmentMicroCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMicroCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_crop, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMicroCropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMicroCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMicroCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_crop, null, false, obj);
    }
}

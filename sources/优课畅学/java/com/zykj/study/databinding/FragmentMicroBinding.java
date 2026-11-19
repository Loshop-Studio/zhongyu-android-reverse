package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMicroBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final RelativeLayout fragmentMicro;

    public FragmentMicroBinding(Object obj, View view, int i10, FrameLayout frameLayout, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.container = frameLayout;
        this.fragmentMicro = relativeLayout;
    }

    public static FragmentMicroBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMicroBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMicroBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_micro);
    }

    @NonNull
    @Deprecated
    public static FragmentMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMicroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro, null, false, obj);
    }
}

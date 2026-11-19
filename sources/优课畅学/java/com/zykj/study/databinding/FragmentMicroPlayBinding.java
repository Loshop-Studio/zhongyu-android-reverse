package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMicroPlayBinding extends ViewDataBinding {

    @NonNull
    public final RelativeLayout fragmentMicroPlay;

    public FragmentMicroPlayBinding(Object obj, View view, int i10, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.fragmentMicroPlay = relativeLayout;
    }

    public static FragmentMicroPlayBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMicroPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMicroPlayBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMicroPlayBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_micro_play);
    }

    @NonNull
    @Deprecated
    public static FragmentMicroPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMicroPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_play, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMicroPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMicroPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMicroPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_play, null, false, obj);
    }
}

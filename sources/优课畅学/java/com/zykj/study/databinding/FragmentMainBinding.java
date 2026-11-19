package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MainViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentMainBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentMain;

    @Bindable
    protected MainViewModel mEntity;

    public FragmentMainBinding(Object obj, View view, int i10, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.fragmentMain = linearLayout;
    }

    public static FragmentMainBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MainViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable MainViewModel mainViewModel);

    @Deprecated
    public static FragmentMainBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMainBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_main);
    }

    @NonNull
    @Deprecated
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_main, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMainBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_main, null, false, obj);
    }
}

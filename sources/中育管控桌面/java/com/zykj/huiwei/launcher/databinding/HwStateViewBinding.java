package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.BaseViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwStateViewBinding extends ViewDataBinding {

    @Bindable
    protected BaseViewModel mVm;

    public HwStateViewBinding(Object obj, View view, int i6) {
        super(obj, view, i6);
    }

    public static HwStateViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwStateViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseViewModel getVm() {
        return this.mVm;
    }

    public abstract void setVm(@Nullable BaseViewModel baseViewModel);

    @Deprecated
    public static HwStateViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwStateViewBinding) ViewDataBinding.bind(obj, view, R.layout.hw_state_view);
    }

    @NonNull
    @Deprecated
    public static HwStateViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwStateViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_state_view, viewGroup, z6, obj);
    }

    @NonNull
    public static HwStateViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwStateViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwStateViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_state_view, null, false, obj);
    }
}

package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kunminx.architecture.p043ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutBindViewModelBinding extends ViewDataBinding {

    @NonNull
    public final LoadingDialogView loadingDialogView;

    @Bindable
    protected Boolean mIsDialogVisible;

    @Bindable
    protected ProtectedUnPeekLiveData<ToastMessage> mToastLiveData;

    public LayoutBindViewModelBinding(Object obj, View view, int i10, LoadingDialogView loadingDialogView) {
        super(obj, view, i10);
        this.loadingDialogView = loadingDialogView;
    }

    public static LayoutBindViewModelBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutBindViewModelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean getIsDialogVisible() {
        return this.mIsDialogVisible;
    }

    @Nullable
    public ProtectedUnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.mToastLiveData;
    }

    public abstract void setIsDialogVisible(@Nullable Boolean bool);

    public abstract void setToastLiveData(@Nullable ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData);

    @Deprecated
    public static LayoutBindViewModelBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutBindViewModelBinding) ViewDataBinding.bind(obj, view, R$layout.layout_bind_view_model);
    }

    @NonNull
    @Deprecated
    public static LayoutBindViewModelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutBindViewModelBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_bind_view_model, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutBindViewModelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutBindViewModelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutBindViewModelBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_bind_view_model, null, false, obj);
    }
}

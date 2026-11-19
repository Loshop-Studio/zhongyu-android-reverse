package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemMicroViewBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mPlayClick;

    @Bindable
    protected String mUrl;

    public ItemMicroViewBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemMicroViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemMicroViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getPlayClick() {
        return this.mPlayClick;
    }

    @Nullable
    public String getUrl() {
        return this.mUrl;
    }

    public abstract void setPlayClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setUrl(@Nullable String str);

    @Deprecated
    public static ItemMicroViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMicroViewBinding) ViewDataBinding.bind(obj, view, R$layout.item_micro_view);
    }

    @NonNull
    @Deprecated
    public static ItemMicroViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemMicroViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_view, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemMicroViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemMicroViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMicroViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_view, null, false, obj);
    }
}

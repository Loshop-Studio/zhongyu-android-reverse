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
public abstract class ItemMicroBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mPlayClick;

    @Bindable
    protected String mUrl;

    public ItemMicroBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemMicroBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
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
    public static ItemMicroBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMicroBinding) ViewDataBinding.bind(obj, view, R$layout.item_micro);
    }

    @NonNull
    @Deprecated
    public static ItemMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemMicroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemMicroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMicroBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro, null, false, obj);
    }
}

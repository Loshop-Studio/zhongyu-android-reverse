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
public abstract class ItemMicroEditBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mDeleteClick;

    @Bindable
    protected View.OnClickListener mPlayClick;

    @Bindable
    protected String mUrl;

    public ItemMicroEditBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemMicroEditBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getDeleteClick() {
        return this.mDeleteClick;
    }

    @Nullable
    public View.OnClickListener getPlayClick() {
        return this.mPlayClick;
    }

    @Nullable
    public String getUrl() {
        return this.mUrl;
    }

    public abstract void setDeleteClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setPlayClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setUrl(@Nullable String str);

    @Deprecated
    public static ItemMicroEditBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMicroEditBinding) ViewDataBinding.bind(obj, view, R$layout.item_micro_edit);
    }

    @NonNull
    @Deprecated
    public static ItemMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemMicroEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_edit, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemMicroEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMicroEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_edit, null, false, obj);
    }
}

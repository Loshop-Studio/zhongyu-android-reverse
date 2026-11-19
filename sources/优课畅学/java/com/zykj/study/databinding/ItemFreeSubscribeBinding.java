package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.FreeSubscribe;

/* loaded from: classes3.dex */
public abstract class ItemFreeSubscribeBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivHeardPortrait;

    @Bindable
    protected FreeSubscribe mData;

    @Bindable
    protected View.OnClickListener mDeleteClick;

    @NonNull
    public final AppCompatTextView tvDelete;

    @NonNull
    public final AppCompatTextView tvSubscribeName;

    @NonNull
    public final AppCompatTextView tvSubscribeRole;

    @NonNull
    public final AppCompatTextView tvSubscribeTime;

    public ItemFreeSubscribeBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.ivHeardPortrait = appCompatImageView;
        this.tvDelete = appCompatTextView;
        this.tvSubscribeName = appCompatTextView2;
        this.tvSubscribeRole = appCompatTextView3;
        this.tvSubscribeTime = appCompatTextView4;
    }

    public static ItemFreeSubscribeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemFreeSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public FreeSubscribe getData() {
        return this.mData;
    }

    @Nullable
    public View.OnClickListener getDeleteClick() {
        return this.mDeleteClick;
    }

    public abstract void setData(@Nullable FreeSubscribe freeSubscribe);

    public abstract void setDeleteClick(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static ItemFreeSubscribeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemFreeSubscribeBinding) ViewDataBinding.bind(obj, view, R$layout.item_free_subscribe);
    }

    @NonNull
    @Deprecated
    public static ItemFreeSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemFreeSubscribeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_free_subscribe, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemFreeSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemFreeSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemFreeSubscribeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_free_subscribe, null, false, obj);
    }
}

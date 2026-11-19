package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.data.SearchHistoryEntity;

/* loaded from: classes3.dex */
public abstract class ItemHistorySearchBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivDelete;

    @NonNull
    public final ImageView ivTime;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected View.OnClickListener mDeleteClickListener;

    @Bindable
    protected SearchHistoryEntity mEntity;

    @NonNull
    public final TextView textView23;

    public ItemHistorySearchBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.ivDelete = imageView;
        this.ivTime = imageView2;
        this.textView23 = textView;
    }

    public static ItemHistorySearchBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemHistorySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public View.OnClickListener getDeleteClickListener() {
        return this.mDeleteClickListener;
    }

    @Nullable
    public SearchHistoryEntity getEntity() {
        return this.mEntity;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setDeleteClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEntity(@Nullable SearchHistoryEntity searchHistoryEntity);

    @Deprecated
    public static ItemHistorySearchBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemHistorySearchBinding) ViewDataBinding.bind(obj, view, R$layout.item_history_search);
    }

    @NonNull
    @Deprecated
    public static ItemHistorySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemHistorySearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_history_search, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemHistorySearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemHistorySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemHistorySearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_history_search, null, false, obj);
    }
}

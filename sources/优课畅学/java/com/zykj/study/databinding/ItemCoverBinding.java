package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.ImageViewInfo;
import com.zykj.study.bean.SelectModel;

/* loaded from: classes3.dex */
public abstract class ItemCoverBinding extends ViewDataBinding {

    @NonNull
    public final ImageView imageView2;

    @NonNull
    public final ImageView ivCheck;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected SelectModel<ImageViewInfo> mEntity;

    public ItemCoverBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2) {
        super(obj, view, i10);
        this.imageView2 = imageView;
        this.ivCheck = imageView2;
    }

    public static ItemCoverBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public SelectModel<ImageViewInfo> getEntity() {
        return this.mEntity;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEntity(@Nullable SelectModel<ImageViewInfo> selectModel);

    @Deprecated
    public static ItemCoverBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCoverBinding) ViewDataBinding.bind(obj, view, R$layout.item_cover);
    }

    @NonNull
    @Deprecated
    public static ItemCoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCoverBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_cover, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCoverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCoverBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_cover, null, false, obj);
    }
}

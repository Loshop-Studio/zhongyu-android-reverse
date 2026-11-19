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
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.SuperviseGroup;

/* loaded from: classes3.dex */
public abstract class ItemSuperviseGroupMemberSearchBinding extends ViewDataBinding {

    @NonNull
    public final ImageView imageView13;

    @NonNull
    public final ImageView imageView14;

    @NonNull
    public final ImageView imageView15;

    @Bindable
    protected SelectModel<SuperviseGroup> mEntity;

    @Bindable
    protected View.OnClickListener mOnclick;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView textView32;

    @NonNull
    public final View view5;

    public ItemSuperviseGroupMemberSearchBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, TextView textView, View view2) {
        super(obj, view, i10);
        this.imageView13 = imageView;
        this.imageView14 = imageView2;
        this.imageView15 = imageView3;
        this.recycler = recyclerView;
        this.textView32 = textView;
        this.view5 = view2;
    }

    public static ItemSuperviseGroupMemberSearchBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemSuperviseGroupMemberSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SelectModel<SuperviseGroup> getEntity() {
        return this.mEntity;
    }

    @Nullable
    public View.OnClickListener getOnclick() {
        return this.mOnclick;
    }

    public abstract void setEntity(@Nullable SelectModel<SuperviseGroup> selectModel);

    public abstract void setOnclick(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static ItemSuperviseGroupMemberSearchBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberSearchBinding) ViewDataBinding.bind(obj, view, R$layout.item_supervise_group_member_search);
    }

    @NonNull
    @Deprecated
    public static ItemSuperviseGroupMemberSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_supervise_group_member_search, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemSuperviseGroupMemberSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemSuperviseGroupMemberSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemSuperviseGroupMemberSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_supervise_group_member_search, null, false, obj);
    }
}

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
import com.zykj.study.bean.teach.SuperviseGroupMemberProgress;

/* loaded from: classes3.dex */
public abstract class ItemStatisticsBinding extends ViewDataBinding {

    @Bindable
    protected SuperviseGroupMemberProgress mEntity;

    @Bindable
    protected boolean mIsLeaf;

    public ItemStatisticsBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemStatisticsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SuperviseGroupMemberProgress getEntity() {
        return this.mEntity;
    }

    public boolean getIsLeaf() {
        return this.mIsLeaf;
    }

    public abstract void setEntity(@Nullable SuperviseGroupMemberProgress superviseGroupMemberProgress);

    public abstract void setIsLeaf(boolean z10);

    @Deprecated
    public static ItemStatisticsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemStatisticsBinding) ViewDataBinding.bind(obj, view, R$layout.item_statistics);
    }

    @NonNull
    @Deprecated
    public static ItemStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_statistics, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_statistics, null, false, obj);
    }
}

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
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.SubjectEntity;

/* loaded from: classes3.dex */
public abstract class ItemCatalogSubjectBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected SelectModel<SubjectEntity> mEntity;

    public ItemCatalogSubjectBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemCatalogSubjectBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCatalogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public SelectModel<SubjectEntity> getEntity() {
        return this.mEntity;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEntity(@Nullable SelectModel<SubjectEntity> selectModel);

    @Deprecated
    public static ItemCatalogSubjectBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCatalogSubjectBinding) ViewDataBinding.bind(obj, view, R$layout.item_catalog_subject);
    }

    @NonNull
    @Deprecated
    public static ItemCatalogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCatalogSubjectBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_catalog_subject, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCatalogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCatalogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCatalogSubjectBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_catalog_subject, null, false, obj);
    }
}

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
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public abstract class ItemKnowledgeBinding extends ViewDataBinding {

    @Bindable
    protected CatalogBean mEntity;

    public ItemKnowledgeBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ItemKnowledgeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemKnowledgeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogBean getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable CatalogBean catalogBean);

    @Deprecated
    public static ItemKnowledgeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemKnowledgeBinding) ViewDataBinding.bind(obj, view, R$layout.item_knowledge);
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemKnowledgeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemKnowledgeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemKnowledgeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge, null, false, obj);
    }
}

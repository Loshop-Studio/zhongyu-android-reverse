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
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.view.KnowledgeView;

/* loaded from: classes3.dex */
public abstract class ItemChapterBinding extends ViewDataBinding {

    @NonNull
    public final KnowledgeView knowView;

    @Bindable
    protected SelectModel<CatalogBean> mEntity;

    public ItemChapterBinding(Object obj, View view, int i10, KnowledgeView knowledgeView) {
        super(obj, view, i10);
        this.knowView = knowledgeView;
    }

    public static ItemChapterBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChapterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SelectModel<CatalogBean> getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable SelectModel<CatalogBean> selectModel);

    @Deprecated
    public static ItemChapterBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChapterBinding) ViewDataBinding.bind(obj, view, R$layout.item_chapter);
    }

    @NonNull
    @Deprecated
    public static ItemChapterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChapterBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChapterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChapterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChapterBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter, null, false, obj);
    }
}

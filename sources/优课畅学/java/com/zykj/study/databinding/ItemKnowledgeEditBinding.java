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
import androidx.legacy.widget.Space;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public abstract class ItemKnowledgeEditBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivAdd;

    @Bindable
    protected CatalogBean mEntity;

    @Bindable
    protected boolean mIsChild;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final Space viewSpace;

    public ItemKnowledgeEditBinding(Object obj, View view, int i10, ImageView imageView, TextView textView, Space space) {
        super(obj, view, i10);
        this.ivAdd = imageView;
        this.tvTitle = textView;
        this.viewSpace = space;
    }

    public static ItemKnowledgeEditBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemKnowledgeEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogBean getEntity() {
        return this.mEntity;
    }

    public boolean getIsChild() {
        return this.mIsChild;
    }

    public abstract void setEntity(@Nullable CatalogBean catalogBean);

    public abstract void setIsChild(boolean z10);

    @Deprecated
    public static ItemKnowledgeEditBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemKnowledgeEditBinding) ViewDataBinding.bind(obj, view, R$layout.item_knowledge_edit);
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemKnowledgeEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_edit, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemKnowledgeEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemKnowledgeEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_edit, null, false, obj);
    }
}

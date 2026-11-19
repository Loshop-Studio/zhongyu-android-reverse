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
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public abstract class ItemKnowledgeProgressBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivProgressComplete;

    @NonNull
    public final ImageView ivProgressNotComplete;

    @Bindable
    protected CatalogBean mEntity;

    @Bindable
    protected Boolean mIsTeacher;

    @NonNull
    public final TextView tvProgress;

    public ItemKnowledgeProgressBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.ivProgressComplete = imageView;
        this.ivProgressNotComplete = imageView2;
        this.tvProgress = textView;
    }

    public static ItemKnowledgeProgressBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemKnowledgeProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogBean getEntity() {
        return this.mEntity;
    }

    @Nullable
    public Boolean getIsTeacher() {
        return this.mIsTeacher;
    }

    public abstract void setEntity(@Nullable CatalogBean catalogBean);

    public abstract void setIsTeacher(@Nullable Boolean bool);

    @Deprecated
    public static ItemKnowledgeProgressBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemKnowledgeProgressBinding) ViewDataBinding.bind(obj, view, R$layout.item_knowledge_progress);
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemKnowledgeProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_progress, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemKnowledgeProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemKnowledgeProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_progress, null, false, obj);
    }
}

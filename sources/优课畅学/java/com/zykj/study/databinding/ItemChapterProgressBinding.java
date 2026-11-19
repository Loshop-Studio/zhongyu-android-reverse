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
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.view.KnowledgeProgressView;

/* loaded from: classes3.dex */
public abstract class ItemChapterProgressBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivProgressComplete;

    @NonNull
    public final ImageView ivProgressNotComplete;

    @NonNull
    public final KnowledgeProgressView knowView;

    @Bindable
    protected SelectModel<CatalogBean> mEntity;

    @NonNull
    public final TextView tvProgress;

    public ItemChapterProgressBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, KnowledgeProgressView knowledgeProgressView, TextView textView) {
        super(obj, view, i10);
        this.ivProgressComplete = imageView;
        this.ivProgressNotComplete = imageView2;
        this.knowView = knowledgeProgressView;
        this.tvProgress = textView;
    }

    public static ItemChapterProgressBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChapterProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SelectModel<CatalogBean> getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable SelectModel<CatalogBean> selectModel);

    @Deprecated
    public static ItemChapterProgressBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChapterProgressBinding) ViewDataBinding.bind(obj, view, R$layout.item_chapter_progress);
    }

    @NonNull
    @Deprecated
    public static ItemChapterProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChapterProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_progress, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChapterProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChapterProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChapterProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_progress, null, false, obj);
    }
}

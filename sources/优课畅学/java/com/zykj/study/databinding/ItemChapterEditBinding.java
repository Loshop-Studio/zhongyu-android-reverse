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

/* loaded from: classes3.dex */
public abstract class ItemChapterEditBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivAdd;

    @Bindable
    protected SelectModel<CatalogBean> mEntity;

    @NonNull
    public final TextView tvTitle;

    public ItemChapterEditBinding(Object obj, View view, int i10, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.ivAdd = imageView;
        this.tvTitle = textView;
    }

    public static ItemChapterEditBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChapterEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SelectModel<CatalogBean> getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable SelectModel<CatalogBean> selectModel);

    @Deprecated
    public static ItemChapterEditBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChapterEditBinding) ViewDataBinding.bind(obj, view, R$layout.item_chapter_edit);
    }

    @NonNull
    @Deprecated
    public static ItemChapterEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChapterEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_edit, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChapterEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChapterEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChapterEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_edit, null, false, obj);
    }
}

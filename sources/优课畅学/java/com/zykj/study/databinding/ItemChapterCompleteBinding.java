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
import com.zykj.study.view.KnowledgeCompleteView;

/* loaded from: classes3.dex */
public abstract class ItemChapterCompleteBinding extends ViewDataBinding {

    @NonNull
    public final KnowledgeCompleteView knowView;

    @Bindable
    protected SelectModel<CatalogBean> mEntity;

    @Bindable
    protected boolean mIsSelected;

    @Bindable
    protected View.OnClickListener mOnArrowClick;

    @Bindable
    protected int mTotalMember;

    public ItemChapterCompleteBinding(Object obj, View view, int i10, KnowledgeCompleteView knowledgeCompleteView) {
        super(obj, view, i10);
        this.knowView = knowledgeCompleteView;
    }

    public static ItemChapterCompleteBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChapterCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SelectModel<CatalogBean> getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public View.OnClickListener getOnArrowClick() {
        return this.mOnArrowClick;
    }

    public int getTotalMember() {
        return this.mTotalMember;
    }

    public abstract void setEntity(@Nullable SelectModel<CatalogBean> selectModel);

    public abstract void setIsSelected(boolean z10);

    public abstract void setOnArrowClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setTotalMember(int i10);

    @Deprecated
    public static ItemChapterCompleteBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChapterCompleteBinding) ViewDataBinding.bind(obj, view, R$layout.item_chapter_complete);
    }

    @NonNull
    @Deprecated
    public static ItemChapterCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChapterCompleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_complete, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChapterCompleteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChapterCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChapterCompleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_complete, null, false, obj);
    }
}

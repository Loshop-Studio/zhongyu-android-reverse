package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public abstract class ItemKnowledgeCompleteBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout llProgress;

    @Bindable
    protected CatalogBean mEntity;

    @Bindable
    protected boolean mIsSelected;

    @Bindable
    protected View.OnClickListener mOnClick;

    @Bindable
    protected int mTotalMember;

    public ItemKnowledgeCompleteBinding(Object obj, View view, int i10, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.llProgress = linearLayout;
    }

    public static ItemKnowledgeCompleteBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemKnowledgeCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogBean getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public View.OnClickListener getOnClick() {
        return this.mOnClick;
    }

    public int getTotalMember() {
        return this.mTotalMember;
    }

    public abstract void setEntity(@Nullable CatalogBean catalogBean);

    public abstract void setIsSelected(boolean z10);

    public abstract void setOnClick(@Nullable View.OnClickListener onClickListener);

    public abstract void setTotalMember(int i10);

    @Deprecated
    public static ItemKnowledgeCompleteBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemKnowledgeCompleteBinding) ViewDataBinding.bind(obj, view, R$layout.item_knowledge_complete);
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemKnowledgeCompleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_complete, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemKnowledgeCompleteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemKnowledgeCompleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_complete, null, false, obj);
    }
}

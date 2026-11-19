package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogManageData;

/* loaded from: classes3.dex */
public abstract class ItemKnowledgeManageBinding extends ViewDataBinding {

    @Bindable
    protected CatalogManageData mData;

    @NonNull
    public final SwitchButton switchBtn;

    public ItemKnowledgeManageBinding(Object obj, View view, int i10, SwitchButton switchButton) {
        super(obj, view, i10);
        this.switchBtn = switchButton;
    }

    public static ItemKnowledgeManageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemKnowledgeManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogManageData getData() {
        return this.mData;
    }

    public abstract void setData(@Nullable CatalogManageData catalogManageData);

    @Deprecated
    public static ItemKnowledgeManageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemKnowledgeManageBinding) ViewDataBinding.bind(obj, view, R$layout.item_knowledge_manage);
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemKnowledgeManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_manage, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemKnowledgeManageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemKnowledgeManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemKnowledgeManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_knowledge_manage, null, false, obj);
    }
}

package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogManageData;

/* loaded from: classes3.dex */
public abstract class ItemChapterManageBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivExpanded;

    @NonNull
    public final AppCompatImageView ivUnexpanded;

    @NonNull
    public final LinearLayoutCompat linearLayout;

    @Bindable
    protected CatalogManageData mData;

    @NonNull
    public final SwitchButton switchBtn;

    public ItemChapterManageBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat, SwitchButton switchButton) {
        super(obj, view, i10);
        this.ivExpanded = appCompatImageView;
        this.ivUnexpanded = appCompatImageView2;
        this.linearLayout = linearLayoutCompat;
        this.switchBtn = switchButton;
    }

    public static ItemChapterManageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemChapterManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CatalogManageData getData() {
        return this.mData;
    }

    public abstract void setData(@Nullable CatalogManageData catalogManageData);

    @Deprecated
    public static ItemChapterManageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemChapterManageBinding) ViewDataBinding.bind(obj, view, R$layout.item_chapter_manage);
    }

    @NonNull
    @Deprecated
    public static ItemChapterManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemChapterManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_manage, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemChapterManageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemChapterManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemChapterManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_chapter_manage, null, false, obj);
    }
}

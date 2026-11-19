package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentManagementSubscribeBinding extends ViewDataBinding {

    @NonNull
    public final LayoutFreeSubscriberListBinding freeSubscriberList;

    @NonNull
    public final LayoutFreeSubscriberListEmptyBinding freeSubscriberListEmpty;

    @NonNull
    public final Guideline guideline4;

    @Bindable
    protected ManagementSubscribeViewModel mViewModel;

    @NonNull
    public final LayoutOtherCourseSubscriberListBinding otherCourseSubscriberList;

    @NonNull
    public final LayoutSelfCourseSubscriberListBinding selfCourseSubscriberList;

    @NonNull
    public final RecyclerView subscribeTabList;

    @NonNull
    public final TitleBar title;

    public FragmentManagementSubscribeBinding(Object obj, View view, int i10, LayoutFreeSubscriberListBinding layoutFreeSubscriberListBinding, LayoutFreeSubscriberListEmptyBinding layoutFreeSubscriberListEmptyBinding, Guideline guideline, LayoutOtherCourseSubscriberListBinding layoutOtherCourseSubscriberListBinding, LayoutSelfCourseSubscriberListBinding layoutSelfCourseSubscriberListBinding, RecyclerView recyclerView, TitleBar titleBar) {
        super(obj, view, i10);
        this.freeSubscriberList = layoutFreeSubscriberListBinding;
        this.freeSubscriberListEmpty = layoutFreeSubscriberListEmptyBinding;
        this.guideline4 = guideline;
        this.otherCourseSubscriberList = layoutOtherCourseSubscriberListBinding;
        this.selfCourseSubscriberList = layoutSelfCourseSubscriberListBinding;
        this.subscribeTabList = recyclerView;
        this.title = titleBar;
    }

    public static FragmentManagementSubscribeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentManagementSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ManagementSubscribeViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable ManagementSubscribeViewModel managementSubscribeViewModel);

    @Deprecated
    public static FragmentManagementSubscribeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentManagementSubscribeBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_management_subscribe);
    }

    @NonNull
    @Deprecated
    public static FragmentManagementSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentManagementSubscribeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_management_subscribe, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentManagementSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentManagementSubscribeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentManagementSubscribeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_management_subscribe, null, false, obj);
    }
}

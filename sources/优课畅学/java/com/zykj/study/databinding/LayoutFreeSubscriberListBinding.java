package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutFreeSubscriberListBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatButton btBatchDelete;

    @NonNull
    public final AppCompatButton btReset;

    @NonNull
    public final AppCompatButton btSearch;

    @NonNull
    public final AppCompatTextView freeSubNumber;

    @NonNull
    public final AppCompatImageView ivSearch;

    @NonNull
    public final AppCompatImageView ivSearchEmpty;

    @NonNull
    public final ConstraintLayout llBatchDelete;

    @NonNull
    public final LinearLayoutCompat llFreeListHead;

    @NonNull
    public final LinearLayoutCompat llSearch;

    @NonNull
    public final LinearLayoutCompat llSearchEmpty;

    @NonNull
    public final RecyclerView rvFreeSubscriberList;

    @NonNull
    public final MaterialSpinner spRoleSelect;

    @NonNull
    public final AppCompatTextView tvDateSelect;

    @NonNull
    public final AppCompatEditText tvSearch;

    @NonNull
    public final AppCompatTextView tvSearchEmpty;

    public LayoutFreeSubscriberListBinding(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, RecyclerView recyclerView, MaterialSpinner materialSpinner, AppCompatTextView appCompatTextView2, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.btBatchDelete = appCompatButton;
        this.btReset = appCompatButton2;
        this.btSearch = appCompatButton3;
        this.freeSubNumber = appCompatTextView;
        this.ivSearch = appCompatImageView;
        this.ivSearchEmpty = appCompatImageView2;
        this.llBatchDelete = constraintLayout;
        this.llFreeListHead = linearLayoutCompat;
        this.llSearch = linearLayoutCompat2;
        this.llSearchEmpty = linearLayoutCompat3;
        this.rvFreeSubscriberList = recyclerView;
        this.spRoleSelect = materialSpinner;
        this.tvDateSelect = appCompatTextView2;
        this.tvSearch = appCompatEditText;
        this.tvSearchEmpty = appCompatTextView3;
    }

    public static LayoutFreeSubscriberListBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutFreeSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutFreeSubscriberListBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutFreeSubscriberListBinding) ViewDataBinding.bind(obj, view, R$layout.layout_free_subscriber_list);
    }

    @NonNull
    @Deprecated
    public static LayoutFreeSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutFreeSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_free_subscriber_list, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutFreeSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutFreeSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutFreeSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_free_subscriber_list, null, false, obj);
    }
}

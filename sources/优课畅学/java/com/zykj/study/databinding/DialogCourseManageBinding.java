package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class DialogCourseManageBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivClose;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final AppCompatTextView tvTip;

    @NonNull
    public final AppCompatTextView tvTitle;

    public DialogCourseManageBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.ivClose = appCompatImageView;
        this.recyclerView = recyclerView;
        this.tvTip = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    public static DialogCourseManageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogCourseManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCourseManageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogCourseManageBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_course_manage);
    }

    @NonNull
    @Deprecated
    public static DialogCourseManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogCourseManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_course_manage, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogCourseManageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogCourseManageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogCourseManageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_course_manage, null, false, obj);
    }
}

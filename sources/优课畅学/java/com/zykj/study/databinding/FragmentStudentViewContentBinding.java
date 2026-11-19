package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.StudentViewViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentStudentViewContentBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout container;

    @Bindable
    protected StudentViewViewModel mEntity;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView textView3;

    @NonNull
    public final TextView textView33;

    public FragmentStudentViewContentBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.container = constraintLayout;
        this.multipleStatusView = multipleStatusView;
        this.recycler = recyclerView;
        this.textView3 = textView;
        this.textView33 = textView2;
    }

    public static FragmentStudentViewContentBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudentViewContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public StudentViewViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable StudentViewViewModel studentViewViewModel);

    @Deprecated
    public static FragmentStudentViewContentBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudentViewContentBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_student_view_content);
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudentViewContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view_content, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudentViewContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudentViewContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view_content, null, false, obj);
    }
}

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
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.StudentViewViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentStudentViewBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout llContainer;

    @Bindable
    protected StudentViewViewModel mEntity;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    public FragmentStudentViewBinding(Object obj, View view, int i10, LinearLayout linearLayout, MultipleStatusView multipleStatusView) {
        super(obj, view, i10);
        this.llContainer = linearLayout;
        this.multipleStatusView = multipleStatusView;
    }

    public static FragmentStudentViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public StudentViewViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable StudentViewViewModel studentViewViewModel);

    @Deprecated
    public static FragmentStudentViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudentViewBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_student_view);
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudentViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudentViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudentViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view, null, false, obj);
    }
}

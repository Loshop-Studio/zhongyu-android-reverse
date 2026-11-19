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
import com.zykj.study.viewmodels.StudyViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentStudyBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentStudy;

    @Bindable
    protected StudyViewModel mViewModel;

    public FragmentStudyBinding(Object obj, View view, int i10, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.fragmentStudy = linearLayout;
    }

    public static FragmentStudyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public StudyViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable StudyViewModel studyViewModel);

    @Deprecated
    public static FragmentStudyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudyBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_study);
    }

    @NonNull
    @Deprecated
    public static FragmentStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study, null, false, obj);
    }
}

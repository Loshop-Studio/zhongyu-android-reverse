package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentGuideBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentTrain;

    @Bindable
    protected ExerciseTrainViewModel mEntity;

    public FragmentGuideBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.fragmentTrain = constraintLayout;
    }

    public static FragmentGuideBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseTrainViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable ExerciseTrainViewModel exerciseTrainViewModel);

    @Deprecated
    public static FragmentGuideBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentGuideBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_guide);
    }

    @NonNull
    @Deprecated
    public static FragmentGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_guide, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentGuideBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_guide, null, false, obj);
    }
}

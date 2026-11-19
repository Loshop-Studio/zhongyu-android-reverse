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
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentExercise;

    @Bindable
    protected ExerciseViewModel mEntity;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final TitleBar toolbar;

    public FragmentExerciseBinding(Object obj, View view, int i10, LinearLayout linearLayout, MultipleStatusView multipleStatusView, TitleBar titleBar) {
        super(obj, view, i10);
        this.fragmentExercise = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.toolbar = titleBar;
    }

    public static FragmentExerciseBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable ExerciseViewModel exerciseViewModel);

    @Deprecated
    public static FragmentExerciseBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise, null, false, obj);
    }
}

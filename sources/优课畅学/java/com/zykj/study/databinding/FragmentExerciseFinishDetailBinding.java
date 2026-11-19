package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseFinishDetailBinding extends ViewDataBinding {

    @Bindable
    protected Boolean mIsEmpty;

    @NonNull
    public final RecyclerView recyclerViewStudent;

    public FragmentExerciseFinishDetailBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.recyclerViewStudent = recyclerView;
    }

    public static FragmentExerciseFinishDetailBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseFinishDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean getIsEmpty() {
        return this.mIsEmpty;
    }

    public abstract void setIsEmpty(@Nullable Boolean bool);

    @Deprecated
    public static FragmentExerciseFinishDetailBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseFinishDetailBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_finish_detail);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseFinishDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseFinishDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_finish_detail, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseFinishDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseFinishDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseFinishDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_finish_detail, null, false, obj);
    }
}

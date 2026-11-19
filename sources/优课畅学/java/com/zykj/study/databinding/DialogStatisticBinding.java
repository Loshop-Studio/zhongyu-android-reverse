package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.GroupStatistic;

/* loaded from: classes3.dex */
public abstract class DialogStatisticBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout dialogStatistic;

    @NonNull
    public final Guideline guideline3;

    @NonNull
    public final ImageView imageView18;

    @Bindable
    protected GroupStatistic mEntity;

    @Bindable
    protected ExerciseBean mExerciseBean;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView textView36;

    @NonNull
    public final TextView textView37;

    @NonNull
    public final TextView textView38;

    @NonNull
    public final TextView textView39;

    @NonNull
    public final TextView textView40;

    @NonNull
    public final TextView textView41;

    public DialogStatisticBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.dialogStatistic = constraintLayout;
        this.guideline3 = guideline;
        this.imageView18 = imageView;
        this.recycler = recyclerView;
        this.textView36 = textView;
        this.textView37 = textView2;
        this.textView38 = textView3;
        this.textView39 = textView4;
        this.textView40 = textView5;
        this.textView41 = textView6;
    }

    public static DialogStatisticBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GroupStatistic getEntity() {
        return this.mEntity;
    }

    @Nullable
    public ExerciseBean getExerciseBean() {
        return this.mExerciseBean;
    }

    public abstract void setEntity(@Nullable GroupStatistic groupStatistic);

    public abstract void setExerciseBean(@Nullable ExerciseBean exerciseBean);

    @Deprecated
    public static DialogStatisticBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogStatisticBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_statistic);
    }

    @NonNull
    @Deprecated
    public static DialogStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogStatisticBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_statistic, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogStatisticBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogStatisticBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogStatisticBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_statistic, null, false, obj);
    }
}

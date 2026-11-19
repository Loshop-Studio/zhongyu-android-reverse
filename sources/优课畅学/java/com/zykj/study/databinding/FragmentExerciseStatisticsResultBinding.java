package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.view.MultipleStatusView;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseStatisticsResultBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout linearLayout2;

    @Bindable
    protected SuperviseGroup mGroup;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final TextView tvAvgScore;

    @NonNull
    public final TextView tvMemberWithCompleted;

    public FragmentExerciseStatisticsResultBinding(Object obj, View view, int i10, LinearLayout linearLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.linearLayout2 = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.recycler = recyclerView;
        this.tvAvgScore = textView;
        this.tvMemberWithCompleted = textView2;
    }

    public static FragmentExerciseStatisticsResultBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseStatisticsResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SuperviseGroup getGroup() {
        return this.mGroup;
    }

    public abstract void setGroup(@Nullable SuperviseGroup superviseGroup);

    @Deprecated
    public static FragmentExerciseStatisticsResultBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseStatisticsResultBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_statistics_result);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseStatisticsResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics_result, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseStatisticsResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseStatisticsResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics_result, null, false, obj);
    }
}

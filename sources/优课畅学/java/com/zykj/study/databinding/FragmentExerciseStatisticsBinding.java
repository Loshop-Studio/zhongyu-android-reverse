package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseStatisticsBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentTeachDetails;

    @NonNull
    public final LayoutBindViewModelBinding include;

    @NonNull
    public final ImageView ivDown;

    @NonNull
    public final ImageView ivUp;

    @NonNull
    public final LinearLayout linearLayout;

    @Bindable
    protected ExerciseStatisticsViewModel mViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    /* renamed from: rv */
    @NonNull
    public final RecyclerView f11148rv;

    @NonNull
    public final TitleBar toolbar;

    @NonNull
    public final TextView tvAllCondition;

    @NonNull
    public final TextView tvCourseGroupName;

    @NonNull
    public final TextView tvDoProblem;

    @NonNull
    public final View view2;

    @NonNull
    public final ViewPager2 viewPager;

    public FragmentExerciseStatisticsBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, LayoutBindViewModelBinding layoutBindViewModelBinding, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, TitleBar titleBar, TextView textView, TextView textView2, TextView textView3, View view2, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.fragmentTeachDetails = constraintLayout;
        this.include = layoutBindViewModelBinding;
        this.ivDown = imageView;
        this.ivUp = imageView2;
        this.linearLayout = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.f11148rv = recyclerView;
        this.toolbar = titleBar;
        this.tvAllCondition = textView;
        this.tvCourseGroupName = textView2;
        this.tvDoProblem = textView3;
        this.view2 = view2;
        this.viewPager = viewPager2;
    }

    public static FragmentExerciseStatisticsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseStatisticsViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable ExerciseStatisticsViewModel exerciseStatisticsViewModel);

    @Deprecated
    public static FragmentExerciseStatisticsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseStatisticsBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_statistics);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseStatisticsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics, null, false, obj);
    }
}

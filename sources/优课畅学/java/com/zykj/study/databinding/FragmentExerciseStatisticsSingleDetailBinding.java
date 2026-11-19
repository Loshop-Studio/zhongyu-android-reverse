package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseStatisticsSingleDetailBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout LinearLayoutFinishPerson;

    @NonNull
    public final LinearLayout linearCondition;

    @NonNull
    public final LinearLayoutCompat linearLayoutDetailContent;

    @NonNull
    public final RecyclerView recyclerViewChart;

    @NonNull
    public final Space spaceRecyclerViewBottom;

    @NonNull
    public final Space spaceRecyclerViewTop;

    @NonNull
    public final TextView tv0;

    @NonNull
    public final TextView tv100;

    @NonNull
    public final TextView tv20;

    @NonNull
    public final TextView tv40;

    @NonNull
    public final TextView tv60;

    @NonNull
    public final TextView tv80;

    @NonNull
    public final TextView tvAvgScore;

    @NonNull
    public final TextView tvConditionTips;

    @NonNull
    public final TextView tvCorrectAnswerLegend;

    @NonNull
    public final TextView tvDetailContent;

    @NonNull
    public final TextView tvDetailTitle;

    @NonNull
    public final TextView tvExplainTips;

    @NonNull
    public final TextView tvMemberWithCompleted;

    @NonNull
    public final TextView tvWrongAnswerLegend;

    @NonNull
    public final View view0;

    @NonNull
    public final View view100;

    @NonNull
    public final View view20;

    @NonNull
    public final View view40;

    @NonNull
    public final View view60;

    @NonNull
    public final View view80;

    @NonNull
    public final View viewLine;

    @NonNull
    public final View viewRightContent;

    @NonNull
    public final View viewWrongContent;

    public FragmentExerciseStatisticsSingleDetailBinding(Object obj, View view, int i10, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, Space space, Space space2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
        super(obj, view, i10);
        this.LinearLayoutFinishPerson = linearLayout;
        this.linearCondition = linearLayout2;
        this.linearLayoutDetailContent = linearLayoutCompat;
        this.recyclerViewChart = recyclerView;
        this.spaceRecyclerViewBottom = space;
        this.spaceRecyclerViewTop = space2;
        this.tv0 = textView;
        this.tv100 = textView2;
        this.tv20 = textView3;
        this.tv40 = textView4;
        this.tv60 = textView5;
        this.tv80 = textView6;
        this.tvAvgScore = textView7;
        this.tvConditionTips = textView8;
        this.tvCorrectAnswerLegend = textView9;
        this.tvDetailContent = textView10;
        this.tvDetailTitle = textView11;
        this.tvExplainTips = textView12;
        this.tvMemberWithCompleted = textView13;
        this.tvWrongAnswerLegend = textView14;
        this.view0 = view2;
        this.view100 = view3;
        this.view20 = view4;
        this.view40 = view5;
        this.view60 = view6;
        this.view80 = view7;
        this.viewLine = view8;
        this.viewRightContent = view9;
        this.viewWrongContent = view10;
    }

    public static FragmentExerciseStatisticsSingleDetailBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseStatisticsSingleDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentExerciseStatisticsSingleDetailBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseStatisticsSingleDetailBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_statistics_single_detail);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsSingleDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseStatisticsSingleDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics_single_detail, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseStatisticsSingleDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseStatisticsSingleDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseStatisticsSingleDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_statistics_single_detail, null, false, obj);
    }
}

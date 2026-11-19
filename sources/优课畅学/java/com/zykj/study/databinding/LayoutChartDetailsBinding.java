package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class LayoutChartDetailsBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat linearLayoutDetailContent;

    @NonNull
    public final ConstraintLayout parentLayout;

    @NonNull
    public final RecyclerView recyclerViewChart;

    @NonNull
    private final ConstraintLayout rootView;

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
    public final TextView tvCorrectAnswerLegend;

    @NonNull
    public final TextView tvDetailContent;

    @NonNull
    public final TextView tvDetailTitle;

    @NonNull
    public final TextView tvExplainTips;

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

    private LayoutChartDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8, @NonNull View view9) {
        this.rootView = constraintLayout;
        this.linearLayoutDetailContent = linearLayoutCompat;
        this.parentLayout = constraintLayout2;
        this.recyclerViewChart = recyclerView;
        this.spaceRecyclerViewBottom = space;
        this.spaceRecyclerViewTop = space2;
        this.tv0 = textView;
        this.tv100 = textView2;
        this.tv20 = textView3;
        this.tv40 = textView4;
        this.tv60 = textView5;
        this.tv80 = textView6;
        this.tvCorrectAnswerLegend = textView7;
        this.tvDetailContent = textView8;
        this.tvDetailTitle = textView9;
        this.tvExplainTips = textView10;
        this.tvWrongAnswerLegend = textView11;
        this.view0 = view;
        this.view100 = view2;
        this.view20 = view3;
        this.view40 = view4;
        this.view60 = view5;
        this.view80 = view6;
        this.viewLine = view7;
        this.viewRightContent = view8;
        this.viewWrongContent = view9;
    }

    @NonNull
    public static LayoutChartDetailsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        View viewFindChildViewById9;
        int i10 = R$id.linearLayout_detail_content;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
        if (linearLayoutCompat != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R$id.recycler_view_chart;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
            if (recyclerView != null) {
                i10 = R$id.space_recycler_view_bottom;
                Space space = (Space) ViewBindings.findChildViewById(view, i10);
                if (space != null) {
                    i10 = R$id.space_recycler_view_top;
                    Space space2 = (Space) ViewBindings.findChildViewById(view, i10);
                    if (space2 != null) {
                        i10 = R$id.tv_0;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView != null) {
                            i10 = R$id.tv_100;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                            if (textView2 != null) {
                                i10 = R$id.tv_20;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                                if (textView3 != null) {
                                    i10 = R$id.tv_40;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i10);
                                    if (textView4 != null) {
                                        i10 = R$id.tv_60;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i10);
                                        if (textView5 != null) {
                                            i10 = R$id.tv_80;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i10);
                                            if (textView6 != null) {
                                                i10 = R$id.tv_correct_answer_legend;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                if (textView7 != null) {
                                                    i10 = R$id.tv_detail_content;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                    if (textView8 != null) {
                                                        i10 = R$id.tv_detail_title;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                        if (textView9 != null) {
                                                            i10 = R$id.tv_explain_tips;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                            if (textView10 != null) {
                                                                i10 = R$id.tv_wrong_answer_legend;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                                if (textView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R$id.view_0))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i10 = R$id.view_100))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i10 = R$id.view_20))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i10 = R$id.view_40))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i10 = R$id.view_60))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i10 = R$id.view_80))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i10 = R$id.view_line))) != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i10 = R$id.view_right_content))) != null && (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i10 = R$id.view_wrong_content))) != null) {
                                                                    return new LayoutChartDetailsBinding(constraintLayout, linearLayoutCompat, constraintLayout, recyclerView, space, space2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutChartDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutChartDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_chart_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

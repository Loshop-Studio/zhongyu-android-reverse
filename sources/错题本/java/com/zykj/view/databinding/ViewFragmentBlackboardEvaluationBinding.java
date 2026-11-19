package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.C5280R;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes3.dex */
public abstract class ViewFragmentBlackboardEvaluationBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout flEvaluationPenColorProxy;

    @NonNull
    public final ViewIncludeEvaluationPenProxyBinding includePenColorSelectProxy;

    @NonNull
    public final ViewIncludeEvaluationPenBinding includePenColorToolbar;

    @NonNull
    public final ImageView ivAnswer;

    @NonNull
    public final ImageView ivCamera;

    @NonNull
    public final ImageView ivDelete;

    @NonNull
    public final ImageView ivDottedLine;

    @NonNull
    public final ImageView ivDrag;

    @NonNull
    public final ImageView ivEraser;

    @NonNull
    public final ImageView ivEvaSubmit;

    @NonNull
    public final ImageView ivLine;

    @NonNull
    public final ImageView ivPen;

    @NonNull
    public final ImageView ivQuestion;

    @NonNull
    public final ImageView ivRecover;

    @NonNull
    public final ImageView ivSelect;

    @NonNull
    public final ImageView ivText;

    @NonNull
    public final ImageView ivTouch;

    @NonNull
    public final ImageView ivWithdraw;

    @NonNull
    public final LinearLayout llEvaluationTools;

    @NonNull
    public final SketchRecorderView sketchView;

    @NonNull
    public final TextView tvHint;

    @NonNull
    public final TouchSwitchView viewRoot;

    @NonNull
    public final View viewTop;

    public ViewFragmentBlackboardEvaluationBinding(Object obj, View view, int i, FrameLayout frameLayout, ViewIncludeEvaluationPenProxyBinding viewIncludeEvaluationPenProxyBinding, ViewIncludeEvaluationPenBinding viewIncludeEvaluationPenBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14, ImageView imageView15, LinearLayout linearLayout, SketchRecorderView sketchRecorderView, TextView textView, TouchSwitchView touchSwitchView, View view2) {
        super(obj, view, i);
        this.flEvaluationPenColorProxy = frameLayout;
        this.includePenColorSelectProxy = viewIncludeEvaluationPenProxyBinding;
        this.includePenColorToolbar = viewIncludeEvaluationPenBinding;
        this.ivAnswer = imageView;
        this.ivCamera = imageView2;
        this.ivDelete = imageView3;
        this.ivDottedLine = imageView4;
        this.ivDrag = imageView5;
        this.ivEraser = imageView6;
        this.ivEvaSubmit = imageView7;
        this.ivLine = imageView8;
        this.ivPen = imageView9;
        this.ivQuestion = imageView10;
        this.ivRecover = imageView11;
        this.ivSelect = imageView12;
        this.ivText = imageView13;
        this.ivTouch = imageView14;
        this.ivWithdraw = imageView15;
        this.llEvaluationTools = linearLayout;
        this.sketchView = sketchRecorderView;
        this.tvHint = textView;
        this.viewRoot = touchSwitchView;
        this.viewTop = view2;
    }

    public static ViewFragmentBlackboardEvaluationBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentBlackboardEvaluationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentBlackboardEvaluationBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_blackboard_evaluation);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBlackboardEvaluationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_blackboard_evaluation, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentBlackboardEvaluationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBlackboardEvaluationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_blackboard_evaluation, null, false, obj);
    }
}

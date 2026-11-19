package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.C5280R;
import com.zykj.view.widget.SketchBoardTouchFrameLayout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;

/* loaded from: classes3.dex */
public abstract class ViewFragmentBoardBinding extends ViewDataBinding {

    @NonNull
    public final CustomColorFrameLayout flBoardCustomColor;

    @NonNull
    public final CustomColorFrameLayout flCustomColor;

    @NonNull
    public final SketchBoardTouchFrameLayout flSketchBoardTouch;

    @NonNull
    public final ViewIncludeBackgroundColorBinding includeBackground;

    @NonNull
    public final ViewItemSketchRecordBinding includeCommit;

    @NonNull
    public final ViewIncludeEraserBinding includeEraser;

    @NonNull
    public final ViewIncludeImageAddBinding includeGraph;

    @NonNull
    public final ViewIncludeMenuBinding includeMenu;

    @NonNull
    public final ViewIncludePenBinding includePen;

    @NonNull
    public final ViewItemSketchRecordAudioBinding includeRecord;

    @NonNull
    public final ViewIncludeSelectTypeBinding includeSelect;

    @NonNull
    public final AppCompatImageView ivBack;

    @NonNull
    public final AppCompatImageView ivExpansion;

    @NonNull
    public final FrameLayout loadingLayout;

    @NonNull
    public final SketchProgressView sketchProgressHorizontal;

    @NonNull
    public final SketchProgressView sketchProgressVertical;

    @NonNull
    public final SketchRecorderView sketchView;

    @NonNull
    public final FrameLayout toolPanel;

    @NonNull
    public final TextView tvLoadingTips;

    public ViewFragmentBoardBinding(Object obj, View view, int i, CustomColorFrameLayout customColorFrameLayout, CustomColorFrameLayout customColorFrameLayout2, SketchBoardTouchFrameLayout sketchBoardTouchFrameLayout, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SketchRecorderView sketchRecorderView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i);
        this.flBoardCustomColor = customColorFrameLayout;
        this.flCustomColor = customColorFrameLayout2;
        this.flSketchBoardTouch = sketchBoardTouchFrameLayout;
        this.includeBackground = viewIncludeBackgroundColorBinding;
        this.includeCommit = viewItemSketchRecordBinding;
        this.includeEraser = viewIncludeEraserBinding;
        this.includeGraph = viewIncludeImageAddBinding;
        this.includeMenu = viewIncludeMenuBinding;
        this.includePen = viewIncludePenBinding;
        this.includeRecord = viewItemSketchRecordAudioBinding;
        this.includeSelect = viewIncludeSelectTypeBinding;
        this.ivBack = appCompatImageView;
        this.ivExpansion = appCompatImageView2;
        this.loadingLayout = frameLayout;
        this.sketchProgressHorizontal = sketchProgressView;
        this.sketchProgressVertical = sketchProgressView2;
        this.sketchView = sketchRecorderView;
        this.toolPanel = frameLayout2;
        this.tvLoadingTips = textView;
    }

    public static ViewFragmentBoardBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentBoardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentBoardBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_board);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBoardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_board, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentBoardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBoardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_board, null, false, obj);
    }
}

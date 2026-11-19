package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;

/* loaded from: classes3.dex */
public abstract class ViewFragmentSimpleBinding extends ViewDataBinding {

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
    public final AppCompatImageView ivBack;

    @NonNull
    public final AppCompatImageView ivExpansion;

    @NonNull
    public final SketchProgressView sketchProgressHorizontal;

    @NonNull
    public final SketchProgressView sketchProgressVertical;

    @NonNull
    public final SimpleBoardView sketchView;

    @NonNull
    public final FrameLayout toolPanel;

    public ViewFragmentSimpleBinding(Object obj, View view, int i, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SimpleBoardView simpleBoardView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.includeBackground = viewIncludeBackgroundColorBinding;
        this.includeCommit = viewItemSketchRecordBinding;
        this.includeEraser = viewIncludeEraserBinding;
        this.includeGraph = viewIncludeImageAddBinding;
        this.includeMenu = viewIncludeMenuBinding;
        this.includePen = viewIncludePenBinding;
        this.includeRecord = viewItemSketchRecordAudioBinding;
        this.ivBack = appCompatImageView;
        this.ivExpansion = appCompatImageView2;
        this.sketchProgressHorizontal = sketchProgressView;
        this.sketchProgressVertical = sketchProgressView2;
        this.sketchView = simpleBoardView;
        this.toolPanel = frameLayout;
    }

    public static ViewFragmentSimpleBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentSimpleBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_simple);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_simple, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentSimpleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_simple, null, false, obj);
    }
}

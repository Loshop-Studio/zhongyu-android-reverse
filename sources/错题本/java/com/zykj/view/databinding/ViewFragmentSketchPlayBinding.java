package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.C5280R;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes3.dex */
public abstract class ViewFragmentSketchPlayBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout clRoot;

    @NonNull
    public final ViewItemSketchPlayBinding controlBar;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivFullscreen;

    @NonNull
    public final ImageView ivSetting;

    @NonNull
    public final SketchProgressView sketchProgressHorizontal;

    @NonNull
    public final SketchProgressView sketchProgressVertical;

    @NonNull
    public final MergeSketchPlayView sketchView;

    @NonNull
    public final TouchSwitchView touchSwitchView;

    public ViewFragmentSketchPlayBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ViewItemSketchPlayBinding viewItemSketchPlayBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, MergeSketchPlayView mergeSketchPlayView, TouchSwitchView touchSwitchView) {
        super(obj, view, i);
        this.clRoot = constraintLayout;
        this.controlBar = viewItemSketchPlayBinding;
        this.ivBack = imageView;
        this.ivFullscreen = imageView2;
        this.ivSetting = imageView3;
        this.sketchProgressHorizontal = sketchProgressView;
        this.sketchProgressVertical = sketchProgressView2;
        this.sketchView = mergeSketchPlayView;
        this.touchSwitchView = touchSwitchView;
    }

    public static ViewFragmentSketchPlayBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentSketchPlayBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_sketch_play);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_sketch_play, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_sketch_play, null, false, obj);
    }
}

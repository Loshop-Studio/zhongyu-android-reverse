package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes5.dex */
public abstract class ViewFragmentSketchPlayBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ConstraintLayout f15415a;

    /* renamed from: b */
    public final ViewItemSketchPlayBinding f15416b;

    /* renamed from: c */
    public final ImageView f15417c;

    /* renamed from: d */
    public final ImageView f15418d;

    /* renamed from: e */
    public final ImageView f15419e;

    /* renamed from: f */
    public final SketchProgressView f15420f;

    /* renamed from: g */
    public final SketchProgressView f15421g;

    /* renamed from: h */
    public final MergeSketchPlayView f15422h;

    /* renamed from: i */
    public final TouchSwitchView f15423i;

    public ViewFragmentSketchPlayBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ViewItemSketchPlayBinding viewItemSketchPlayBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, MergeSketchPlayView mergeSketchPlayView, TouchSwitchView touchSwitchView) {
        super(obj, view, i10);
        this.f15415a = constraintLayout;
        this.f15416b = viewItemSketchPlayBinding;
        this.f15417c = imageView;
        this.f15418d = imageView2;
        this.f15419e = imageView3;
        this.f15420f = sketchProgressView;
        this.f15421g = sketchProgressView2;
        this.f15422h = mergeSketchPlayView;
        this.f15423i = touchSwitchView;
    }

    /* renamed from: a */
    public static ViewFragmentSketchPlayBinding m13284a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m13285b(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentSketchPlayBinding m13285b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_sketch_play, viewGroup, z10, obj);
    }
}

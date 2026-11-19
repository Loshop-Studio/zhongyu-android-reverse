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
    public final ConstraintLayout f12670a;

    /* renamed from: b */
    public final ViewItemSketchPlayBinding f12671b;

    /* renamed from: c */
    public final ImageView f12672c;

    /* renamed from: d */
    public final ImageView f12673d;

    /* renamed from: e */
    public final ImageView f12674e;

    /* renamed from: f */
    public final SketchProgressView f12675f;

    /* renamed from: g */
    public final SketchProgressView f12676g;

    /* renamed from: h */
    public final MergeSketchPlayView f12677h;

    /* renamed from: i */
    public final TouchSwitchView f12678i;

    public ViewFragmentSketchPlayBinding(Object obj, View view, int i9, ConstraintLayout constraintLayout, ViewItemSketchPlayBinding viewItemSketchPlayBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, MergeSketchPlayView mergeSketchPlayView, TouchSwitchView touchSwitchView) {
        super(obj, view, i9);
        this.f12670a = constraintLayout;
        this.f12671b = viewItemSketchPlayBinding;
        this.f12672c = imageView;
        this.f12673d = imageView2;
        this.f12674e = imageView3;
        this.f12675f = sketchProgressView;
        this.f12676g = sketchProgressView2;
        this.f12677h = mergeSketchPlayView;
        this.f12678i = touchSwitchView;
    }

    /* renamed from: a */
    public static ViewFragmentSketchPlayBinding m11905a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11906c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentSketchPlayBinding m11906c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_sketch_play, viewGroup, z9, obj);
    }
}

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
    public final ConstraintLayout f11426a;

    /* renamed from: b */
    public final ViewItemSketchPlayBinding f11427b;

    /* renamed from: c */
    public final ImageView f11428c;

    /* renamed from: d */
    public final ImageView f11429d;

    /* renamed from: e */
    public final ImageView f11430e;

    /* renamed from: f */
    public final SketchProgressView f11431f;

    /* renamed from: g */
    public final SketchProgressView f11432g;

    /* renamed from: h */
    public final MergeSketchPlayView f11433h;

    /* renamed from: i */
    public final TouchSwitchView f11434i;

    public ViewFragmentSketchPlayBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ViewItemSketchPlayBinding viewItemSketchPlayBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, MergeSketchPlayView mergeSketchPlayView, TouchSwitchView touchSwitchView) {
        super(obj, view, i10);
        this.f11426a = constraintLayout;
        this.f11427b = viewItemSketchPlayBinding;
        this.f11428c = imageView;
        this.f11429d = imageView2;
        this.f11430e = imageView3;
        this.f11431f = sketchProgressView;
        this.f11432g = sketchProgressView2;
        this.f11433h = mergeSketchPlayView;
        this.f11434i = touchSwitchView;
    }

    /* renamed from: a */
    public static ViewFragmentSketchPlayBinding m11415a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11416j(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentSketchPlayBinding m11416j(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_sketch_play, viewGroup, z9, obj);
    }
}

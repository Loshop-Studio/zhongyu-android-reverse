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

/* loaded from: classes6.dex */
public abstract class ViewFragmentSketchPlayBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f20626c;

    /* renamed from: d */
    public final ViewItemSketchPlayBinding f20627d;

    /* renamed from: e */
    public final ImageView f20628e;

    /* renamed from: f */
    public final ImageView f20629f;

    /* renamed from: g */
    public final ImageView f20630g;

    /* renamed from: h */
    public final SketchProgressView f20631h;

    /* renamed from: i */
    public final SketchProgressView f20632i;

    /* renamed from: j */
    public final MergeSketchPlayView f20633j;

    /* renamed from: k */
    public final TouchSwitchView f20634k;

    public ViewFragmentSketchPlayBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ViewItemSketchPlayBinding viewItemSketchPlayBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, MergeSketchPlayView mergeSketchPlayView, TouchSwitchView touchSwitchView) {
        super(obj, view, i10);
        this.f20626c = constraintLayout;
        this.f20627d = viewItemSketchPlayBinding;
        this.f20628e = imageView;
        this.f20629f = imageView2;
        this.f20630g = imageView3;
        this.f20631h = sketchProgressView;
        this.f20632i = sketchProgressView2;
        this.f20633j = mergeSketchPlayView;
        this.f20634k = touchSwitchView;
    }

    /* renamed from: a */
    public static ViewFragmentSketchPlayBinding m17356a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m17357c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentSketchPlayBinding m17357c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_sketch_play, viewGroup, z10, obj);
    }
}

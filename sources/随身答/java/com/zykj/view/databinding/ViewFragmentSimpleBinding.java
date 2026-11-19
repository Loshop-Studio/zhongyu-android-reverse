package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;

/* loaded from: classes5.dex */
public abstract class ViewFragmentSimpleBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ViewIncludeBackgroundColorBinding f12653a;

    /* renamed from: b */
    public final ViewItemSketchRecordBinding f12654b;

    /* renamed from: c */
    public final ViewIncludeEraserBinding f12655c;

    /* renamed from: d */
    public final ViewIncludeImageAddBinding f12656d;

    /* renamed from: e */
    public final ViewIncludeMenuBinding f12657e;

    /* renamed from: f */
    public final ViewIncludePenBinding f12658f;

    /* renamed from: g */
    public final ViewItemSketchRecordAudioBinding f12659g;

    /* renamed from: h */
    public final AppCompatImageView f12660h;

    /* renamed from: i */
    public final AppCompatImageView f12661i;

    /* renamed from: j */
    public final SketchProgressView f12662j;

    /* renamed from: k */
    public final SketchProgressView f12663k;

    /* renamed from: l */
    public final SimpleBoardView f12664l;

    /* renamed from: m */
    public final FrameLayout f12665m;

    public ViewFragmentSimpleBinding(Object obj, View view, int i9, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SimpleBoardView simpleBoardView, FrameLayout frameLayout) {
        super(obj, view, i9);
        this.f12653a = viewIncludeBackgroundColorBinding;
        this.f12654b = viewItemSketchRecordBinding;
        this.f12655c = viewIncludeEraserBinding;
        this.f12656d = viewIncludeImageAddBinding;
        this.f12657e = viewIncludeMenuBinding;
        this.f12658f = viewIncludePenBinding;
        this.f12659g = viewItemSketchRecordAudioBinding;
        this.f12660h = appCompatImageView;
        this.f12661i = appCompatImageView2;
        this.f12662j = sketchProgressView;
        this.f12663k = sketchProgressView2;
        this.f12664l = simpleBoardView;
        this.f12665m = frameLayout;
    }

    /* renamed from: a */
    public static ViewFragmentSimpleBinding m11896a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11897c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentSimpleBinding m11897c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_simple, viewGroup, z9, obj);
    }
}

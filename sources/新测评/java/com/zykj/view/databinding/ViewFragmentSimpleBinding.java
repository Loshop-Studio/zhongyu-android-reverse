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
    public final ViewIncludeBackgroundColorBinding f11409a;

    /* renamed from: b */
    public final ViewItemSketchRecordBinding f11410b;

    /* renamed from: c */
    public final ViewIncludeEraserBinding f11411c;

    /* renamed from: d */
    public final ViewIncludeImageAddBinding f11412d;

    /* renamed from: e */
    public final ViewIncludeMenuBinding f11413e;

    /* renamed from: f */
    public final ViewIncludePenBinding f11414f;

    /* renamed from: g */
    public final ViewItemSketchRecordAudioBinding f11415g;

    /* renamed from: h */
    public final AppCompatImageView f11416h;

    /* renamed from: i */
    public final AppCompatImageView f11417i;

    /* renamed from: j */
    public final SketchProgressView f11418j;

    /* renamed from: k */
    public final SketchProgressView f11419k;

    /* renamed from: l */
    public final SimpleBoardView f11420l;

    /* renamed from: m */
    public final FrameLayout f11421m;

    public ViewFragmentSimpleBinding(Object obj, View view, int i10, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SimpleBoardView simpleBoardView, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f11409a = viewIncludeBackgroundColorBinding;
        this.f11410b = viewItemSketchRecordBinding;
        this.f11411c = viewIncludeEraserBinding;
        this.f11412d = viewIncludeImageAddBinding;
        this.f11413e = viewIncludeMenuBinding;
        this.f11414f = viewIncludePenBinding;
        this.f11415g = viewItemSketchRecordAudioBinding;
        this.f11416h = appCompatImageView;
        this.f11417i = appCompatImageView2;
        this.f11418j = sketchProgressView;
        this.f11419k = sketchProgressView2;
        this.f11420l = simpleBoardView;
        this.f11421m = frameLayout;
    }

    /* renamed from: a */
    public static ViewFragmentSimpleBinding m11406a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11407j(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentSimpleBinding m11407j(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_simple, viewGroup, z9, obj);
    }
}

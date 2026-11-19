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

/* loaded from: classes6.dex */
public abstract class ViewFragmentSimpleBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ViewIncludeBackgroundColorBinding f20609c;

    /* renamed from: d */
    public final ViewItemSketchRecordBinding f20610d;

    /* renamed from: e */
    public final ViewIncludeEraserBinding f20611e;

    /* renamed from: f */
    public final ViewIncludeImageAddBinding f20612f;

    /* renamed from: g */
    public final ViewIncludeMenuBinding f20613g;

    /* renamed from: h */
    public final ViewIncludePenBinding f20614h;

    /* renamed from: i */
    public final ViewItemSketchRecordAudioBinding f20615i;

    /* renamed from: j */
    public final AppCompatImageView f20616j;

    /* renamed from: k */
    public final AppCompatImageView f20617k;

    /* renamed from: l */
    public final SketchProgressView f20618l;

    /* renamed from: m */
    public final SketchProgressView f20619m;

    /* renamed from: n */
    public final SimpleBoardView f20620n;

    /* renamed from: o */
    public final FrameLayout f20621o;

    public ViewFragmentSimpleBinding(Object obj, View view, int i10, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SimpleBoardView simpleBoardView, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f20609c = viewIncludeBackgroundColorBinding;
        this.f20610d = viewItemSketchRecordBinding;
        this.f20611e = viewIncludeEraserBinding;
        this.f20612f = viewIncludeImageAddBinding;
        this.f20613g = viewIncludeMenuBinding;
        this.f20614h = viewIncludePenBinding;
        this.f20615i = viewItemSketchRecordAudioBinding;
        this.f20616j = appCompatImageView;
        this.f20617k = appCompatImageView2;
        this.f20618l = sketchProgressView;
        this.f20619m = sketchProgressView2;
        this.f20620n = simpleBoardView;
        this.f20621o = frameLayout;
    }

    /* renamed from: a */
    public static ViewFragmentSimpleBinding m17347a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m17348c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentSimpleBinding m17348c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_simple, viewGroup, z10, obj);
    }
}

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
    public final ViewIncludeBackgroundColorBinding f15398a;

    /* renamed from: b */
    public final ViewItemSketchRecordBinding f15399b;

    /* renamed from: c */
    public final ViewIncludeEraserBinding f15400c;

    /* renamed from: d */
    public final ViewIncludeImageAddBinding f15401d;

    /* renamed from: e */
    public final ViewIncludeMenuBinding f15402e;

    /* renamed from: f */
    public final ViewIncludePenBinding f15403f;

    /* renamed from: g */
    public final ViewItemSketchRecordAudioBinding f15404g;

    /* renamed from: h */
    public final AppCompatImageView f15405h;

    /* renamed from: i */
    public final AppCompatImageView f15406i;

    /* renamed from: j */
    public final SketchProgressView f15407j;

    /* renamed from: k */
    public final SketchProgressView f15408k;

    /* renamed from: l */
    public final SimpleBoardView f15409l;

    /* renamed from: m */
    public final FrameLayout f15410m;

    public ViewFragmentSimpleBinding(Object obj, View view, int i10, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SimpleBoardView simpleBoardView, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f15398a = viewIncludeBackgroundColorBinding;
        this.f15399b = viewItemSketchRecordBinding;
        this.f15400c = viewIncludeEraserBinding;
        this.f15401d = viewIncludeImageAddBinding;
        this.f15402e = viewIncludeMenuBinding;
        this.f15403f = viewIncludePenBinding;
        this.f15404g = viewItemSketchRecordAudioBinding;
        this.f15405h = appCompatImageView;
        this.f15406i = appCompatImageView2;
        this.f15407j = sketchProgressView;
        this.f15408k = sketchProgressView2;
        this.f15409l = simpleBoardView;
        this.f15410m = frameLayout;
    }

    /* renamed from: a */
    public static ViewFragmentSimpleBinding m13275a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m13276b(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentSimpleBinding m13276b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentSimpleBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_simple, viewGroup, z10, obj);
    }
}

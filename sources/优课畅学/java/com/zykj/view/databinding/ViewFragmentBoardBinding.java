package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchProgressView;

/* loaded from: classes5.dex */
public abstract class ViewFragmentBoardBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ViewIncludeBackgroundColorBinding f15367a;

    /* renamed from: b */
    public final ViewItemSketchRecordBinding f15368b;

    /* renamed from: c */
    public final ViewIncludeEraserBinding f15369c;

    /* renamed from: d */
    public final ViewIncludeImageAddBinding f15370d;

    /* renamed from: e */
    public final ViewIncludeMenuBinding f15371e;

    /* renamed from: f */
    public final ViewIncludePenBinding f15372f;

    /* renamed from: g */
    public final ViewItemSketchRecordAudioBinding f15373g;

    /* renamed from: h */
    public final AppCompatImageView f15374h;

    /* renamed from: i */
    public final AppCompatImageView f15375i;

    /* renamed from: j */
    public final FrameLayout f15376j;

    /* renamed from: k */
    public final SketchProgressView f15377k;

    /* renamed from: l */
    public final SketchProgressView f15378l;

    /* renamed from: m */
    public final SketchRecorderView f15379m;

    /* renamed from: n */
    public final FrameLayout f15380n;

    /* renamed from: o */
    public final TextView f15381o;

    public ViewFragmentBoardBinding(Object obj, View view, int i10, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SketchRecorderView sketchRecorderView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i10);
        this.f15367a = viewIncludeBackgroundColorBinding;
        this.f15368b = viewItemSketchRecordBinding;
        this.f15369c = viewIncludeEraserBinding;
        this.f15370d = viewIncludeImageAddBinding;
        this.f15371e = viewIncludeMenuBinding;
        this.f15372f = viewIncludePenBinding;
        this.f15373g = viewItemSketchRecordAudioBinding;
        this.f15374h = appCompatImageView;
        this.f15375i = appCompatImageView2;
        this.f15376j = frameLayout;
        this.f15377k = sketchProgressView;
        this.f15378l = sketchProgressView2;
        this.f15379m = sketchRecorderView;
        this.f15380n = frameLayout2;
        this.f15381o = textView;
    }

    /* renamed from: a */
    public static ViewFragmentBoardBinding m13264a(LayoutInflater layoutInflater) {
        return m13265b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentBoardBinding m13265b(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_board, null, false, obj);
    }
}

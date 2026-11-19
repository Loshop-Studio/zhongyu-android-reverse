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

/* loaded from: classes6.dex */
public abstract class ViewFragmentBoardBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ViewIncludeBackgroundColorBinding f20578c;

    /* renamed from: d */
    public final ViewItemSketchRecordBinding f20579d;

    /* renamed from: e */
    public final ViewIncludeEraserBinding f20580e;

    /* renamed from: f */
    public final ViewIncludeImageAddBinding f20581f;

    /* renamed from: g */
    public final ViewIncludeMenuBinding f20582g;

    /* renamed from: h */
    public final ViewIncludePenBinding f20583h;

    /* renamed from: i */
    public final ViewItemSketchRecordAudioBinding f20584i;

    /* renamed from: j */
    public final AppCompatImageView f20585j;

    /* renamed from: k */
    public final AppCompatImageView f20586k;

    /* renamed from: l */
    public final FrameLayout f20587l;

    /* renamed from: m */
    public final SketchProgressView f20588m;

    /* renamed from: n */
    public final SketchProgressView f20589n;

    /* renamed from: o */
    public final SketchRecorderView f20590o;

    /* renamed from: p */
    public final FrameLayout f20591p;

    /* renamed from: q */
    public final TextView f20592q;

    public ViewFragmentBoardBinding(Object obj, View view, int i10, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SketchRecorderView sketchRecorderView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i10);
        this.f20578c = viewIncludeBackgroundColorBinding;
        this.f20579d = viewItemSketchRecordBinding;
        this.f20580e = viewIncludeEraserBinding;
        this.f20581f = viewIncludeImageAddBinding;
        this.f20582g = viewIncludeMenuBinding;
        this.f20583h = viewIncludePenBinding;
        this.f20584i = viewItemSketchRecordAudioBinding;
        this.f20585j = appCompatImageView;
        this.f20586k = appCompatImageView2;
        this.f20587l = frameLayout;
        this.f20588m = sketchProgressView;
        this.f20589n = sketchProgressView2;
        this.f20590o = sketchRecorderView;
        this.f20591p = frameLayout2;
        this.f20592q = textView;
    }

    /* renamed from: a */
    public static ViewFragmentBoardBinding m17336a(LayoutInflater layoutInflater) {
        return m17337c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentBoardBinding m17337c(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_board, null, false, obj);
    }
}

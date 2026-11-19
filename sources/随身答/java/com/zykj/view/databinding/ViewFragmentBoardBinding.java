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
import com.zykj.view.widget.SketchBoardTouchFrameLayout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;

/* loaded from: classes5.dex */
public abstract class ViewFragmentBoardBinding extends ViewDataBinding {

    /* renamed from: a */
    public final CustomColorFrameLayout f12618a;

    /* renamed from: b */
    public final CustomColorFrameLayout f12619b;

    /* renamed from: c */
    public final SketchBoardTouchFrameLayout f12620c;

    /* renamed from: d */
    public final ViewIncludeBackgroundColorBinding f12621d;

    /* renamed from: e */
    public final ViewItemSketchRecordBinding f12622e;

    /* renamed from: f */
    public final ViewIncludeEraserBinding f12623f;

    /* renamed from: g */
    public final ViewIncludeImageAddBinding f12624g;

    /* renamed from: h */
    public final ViewIncludeMenuBinding f12625h;

    /* renamed from: i */
    public final ViewIncludePenBinding f12626i;

    /* renamed from: j */
    public final ViewItemSketchRecordAudioBinding f12627j;

    /* renamed from: k */
    public final ViewIncludeSelectTypeBinding f12628k;

    /* renamed from: l */
    public final AppCompatImageView f12629l;

    /* renamed from: m */
    public final AppCompatImageView f12630m;

    /* renamed from: n */
    public final FrameLayout f12631n;

    /* renamed from: o */
    public final SketchProgressView f12632o;

    /* renamed from: p */
    public final SketchProgressView f12633p;

    /* renamed from: q */
    public final SketchRecorderView f12634q;

    /* renamed from: r */
    public final FrameLayout f12635r;

    /* renamed from: s */
    public final TextView f12636s;

    public ViewFragmentBoardBinding(Object obj, View view, int i9, CustomColorFrameLayout customColorFrameLayout, CustomColorFrameLayout customColorFrameLayout2, SketchBoardTouchFrameLayout sketchBoardTouchFrameLayout, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SketchRecorderView sketchRecorderView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i9);
        this.f12618a = customColorFrameLayout;
        this.f12619b = customColorFrameLayout2;
        this.f12620c = sketchBoardTouchFrameLayout;
        this.f12621d = viewIncludeBackgroundColorBinding;
        this.f12622e = viewItemSketchRecordBinding;
        this.f12623f = viewIncludeEraserBinding;
        this.f12624g = viewIncludeImageAddBinding;
        this.f12625h = viewIncludeMenuBinding;
        this.f12626i = viewIncludePenBinding;
        this.f12627j = viewItemSketchRecordAudioBinding;
        this.f12628k = viewIncludeSelectTypeBinding;
        this.f12629l = appCompatImageView;
        this.f12630m = appCompatImageView2;
        this.f12631n = frameLayout;
        this.f12632o = sketchProgressView;
        this.f12633p = sketchProgressView2;
        this.f12634q = sketchRecorderView;
        this.f12635r = frameLayout2;
        this.f12636s = textView;
    }

    /* renamed from: a */
    public static ViewFragmentBoardBinding m11884a(LayoutInflater layoutInflater) {
        return m11885c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentBoardBinding m11885c(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_board, null, false, obj);
    }
}

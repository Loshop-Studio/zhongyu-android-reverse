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
    public final CustomColorFrameLayout f11374a;

    /* renamed from: b */
    public final CustomColorFrameLayout f11375b;

    /* renamed from: c */
    public final SketchBoardTouchFrameLayout f11376c;

    /* renamed from: d */
    public final ViewIncludeBackgroundColorBinding f11377d;

    /* renamed from: e */
    public final ViewItemSketchRecordBinding f11378e;

    /* renamed from: f */
    public final ViewIncludeEraserBinding f11379f;

    /* renamed from: g */
    public final ViewIncludeImageAddBinding f11380g;

    /* renamed from: h */
    public final ViewIncludeMenuBinding f11381h;

    /* renamed from: i */
    public final ViewIncludePenBinding f11382i;

    /* renamed from: j */
    public final ViewItemSketchRecordAudioBinding f11383j;

    /* renamed from: k */
    public final ViewIncludeSelectTypeBinding f11384k;

    /* renamed from: l */
    public final AppCompatImageView f11385l;

    /* renamed from: m */
    public final AppCompatImageView f11386m;

    /* renamed from: n */
    public final FrameLayout f11387n;

    /* renamed from: o */
    public final SketchProgressView f11388o;

    /* renamed from: p */
    public final SketchProgressView f11389p;

    /* renamed from: q */
    public final SketchRecorderView f11390q;

    /* renamed from: r */
    public final FrameLayout f11391r;

    /* renamed from: s */
    public final TextView f11392s;

    public ViewFragmentBoardBinding(Object obj, View view, int i10, CustomColorFrameLayout customColorFrameLayout, CustomColorFrameLayout customColorFrameLayout2, SketchBoardTouchFrameLayout sketchBoardTouchFrameLayout, ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, ViewItemSketchRecordBinding viewItemSketchRecordBinding, ViewIncludeEraserBinding viewIncludeEraserBinding, ViewIncludeImageAddBinding viewIncludeImageAddBinding, ViewIncludeMenuBinding viewIncludeMenuBinding, ViewIncludePenBinding viewIncludePenBinding, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, SketchProgressView sketchProgressView, SketchProgressView sketchProgressView2, SketchRecorderView sketchRecorderView, FrameLayout frameLayout2, TextView textView) {
        super(obj, view, i10);
        this.f11374a = customColorFrameLayout;
        this.f11375b = customColorFrameLayout2;
        this.f11376c = sketchBoardTouchFrameLayout;
        this.f11377d = viewIncludeBackgroundColorBinding;
        this.f11378e = viewItemSketchRecordBinding;
        this.f11379f = viewIncludeEraserBinding;
        this.f11380g = viewIncludeImageAddBinding;
        this.f11381h = viewIncludeMenuBinding;
        this.f11382i = viewIncludePenBinding;
        this.f11383j = viewItemSketchRecordAudioBinding;
        this.f11384k = viewIncludeSelectTypeBinding;
        this.f11385l = appCompatImageView;
        this.f11386m = appCompatImageView2;
        this.f11387n = frameLayout;
        this.f11388o = sketchProgressView;
        this.f11389p = sketchProgressView2;
        this.f11390q = sketchRecorderView;
        this.f11391r = frameLayout2;
        this.f11392s = textView;
    }

    /* renamed from: a */
    public static ViewFragmentBoardBinding m11394a(LayoutInflater layoutInflater) {
        return m11395j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentBoardBinding m11395j(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBoardBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_board, null, false, obj);
    }
}

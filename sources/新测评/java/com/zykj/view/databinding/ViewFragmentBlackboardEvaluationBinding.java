package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$layout;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes5.dex */
public abstract class ViewFragmentBlackboardEvaluationBinding extends ViewDataBinding {

    /* renamed from: a */
    public final FrameLayout f11348a;

    /* renamed from: b */
    public final ViewIncludeEvaluationPenProxyBinding f11349b;

    /* renamed from: c */
    public final ViewIncludeEvaluationPenBinding f11350c;

    /* renamed from: d */
    public final ImageView f11351d;

    /* renamed from: e */
    public final ImageView f11352e;

    /* renamed from: f */
    public final ImageView f11353f;

    /* renamed from: g */
    public final ImageView f11354g;

    /* renamed from: h */
    public final ImageView f11355h;

    /* renamed from: i */
    public final ImageView f11356i;

    /* renamed from: j */
    public final ImageView f11357j;

    /* renamed from: k */
    public final ImageView f11358k;

    /* renamed from: l */
    public final ImageView f11359l;

    /* renamed from: m */
    public final ImageView f11360m;

    /* renamed from: n */
    public final ImageView f11361n;

    /* renamed from: o */
    public final ImageView f11362o;

    /* renamed from: p */
    public final ImageView f11363p;

    /* renamed from: q */
    public final ImageView f11364q;

    /* renamed from: r */
    public final ImageView f11365r;

    /* renamed from: s */
    public final LinearLayout f11366s;

    /* renamed from: t */
    public final SketchRecorderView f11367t;

    /* renamed from: u */
    public final TextView f11368u;

    /* renamed from: v */
    public final TouchSwitchView f11369v;

    /* renamed from: w */
    public final View f11370w;

    public ViewFragmentBlackboardEvaluationBinding(Object obj, View view, int i10, FrameLayout frameLayout, ViewIncludeEvaluationPenProxyBinding viewIncludeEvaluationPenProxyBinding, ViewIncludeEvaluationPenBinding viewIncludeEvaluationPenBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14, ImageView imageView15, LinearLayout linearLayout, SketchRecorderView sketchRecorderView, TextView textView, TouchSwitchView touchSwitchView, View view2) {
        super(obj, view, i10);
        this.f11348a = frameLayout;
        this.f11349b = viewIncludeEvaluationPenProxyBinding;
        this.f11350c = viewIncludeEvaluationPenBinding;
        this.f11351d = imageView;
        this.f11352e = imageView2;
        this.f11353f = imageView3;
        this.f11354g = imageView4;
        this.f11355h = imageView5;
        this.f11356i = imageView6;
        this.f11357j = imageView7;
        this.f11358k = imageView8;
        this.f11359l = imageView9;
        this.f11360m = imageView10;
        this.f11361n = imageView11;
        this.f11362o = imageView12;
        this.f11363p = imageView13;
        this.f11364q = imageView14;
        this.f11365r = imageView15;
        this.f11366s = linearLayout;
        this.f11367t = sketchRecorderView;
        this.f11368u = textView;
        this.f11369v = touchSwitchView;
        this.f11370w = view2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardEvaluationBinding m11390a(LayoutInflater layoutInflater) {
        return m11391j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentBlackboardEvaluationBinding m11391j(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_evaluation, null, false, obj);
    }
}

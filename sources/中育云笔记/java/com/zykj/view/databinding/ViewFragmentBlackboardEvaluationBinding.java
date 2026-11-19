package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$layout;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes6.dex */
public abstract class ViewFragmentBlackboardEvaluationBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f20557c;

    /* renamed from: d */
    public final ImageView f20558d;

    /* renamed from: e */
    public final ImageView f20559e;

    /* renamed from: f */
    public final ImageView f20560f;

    /* renamed from: g */
    public final ImageView f20561g;

    /* renamed from: h */
    public final ImageView f20562h;

    /* renamed from: i */
    public final ImageView f20563i;

    /* renamed from: j */
    public final ImageView f20564j;

    /* renamed from: k */
    public final ImageView f20565k;

    /* renamed from: l */
    public final ImageView f20566l;

    /* renamed from: m */
    public final ImageView f20567m;

    /* renamed from: n */
    public final ImageView f20568n;

    /* renamed from: o */
    public final ImageView f20569o;

    /* renamed from: p */
    public final ImageView f20570p;

    /* renamed from: q */
    public final SketchRecorderView f20571q;

    /* renamed from: r */
    public final TextView f20572r;

    /* renamed from: s */
    public final TouchSwitchView f20573s;

    /* renamed from: t */
    public final View f20574t;

    public ViewFragmentBlackboardEvaluationBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14, SketchRecorderView sketchRecorderView, TextView textView, TouchSwitchView touchSwitchView, View view2) {
        super(obj, view, i10);
        this.f20557c = imageView;
        this.f20558d = imageView2;
        this.f20559e = imageView3;
        this.f20560f = imageView4;
        this.f20561g = imageView5;
        this.f20562h = imageView6;
        this.f20563i = imageView7;
        this.f20564j = imageView8;
        this.f20565k = imageView9;
        this.f20566l = imageView10;
        this.f20567m = imageView11;
        this.f20568n = imageView12;
        this.f20569o = imageView13;
        this.f20570p = imageView14;
        this.f20571q = sketchRecorderView;
        this.f20572r = textView;
        this.f20573s = touchSwitchView;
        this.f20574t = view2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardEvaluationBinding m17334a(LayoutInflater layoutInflater) {
        return m17335c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentBlackboardEvaluationBinding m17335c(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_evaluation, null, false, obj);
    }
}

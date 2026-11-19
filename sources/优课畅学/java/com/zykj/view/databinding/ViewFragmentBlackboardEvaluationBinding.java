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

/* loaded from: classes5.dex */
public abstract class ViewFragmentBlackboardEvaluationBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f15346a;

    /* renamed from: b */
    public final ImageView f15347b;

    /* renamed from: c */
    public final ImageView f15348c;

    /* renamed from: d */
    public final ImageView f15349d;

    /* renamed from: e */
    public final ImageView f15350e;

    /* renamed from: f */
    public final ImageView f15351f;

    /* renamed from: g */
    public final ImageView f15352g;

    /* renamed from: h */
    public final ImageView f15353h;

    /* renamed from: i */
    public final ImageView f15354i;

    /* renamed from: j */
    public final ImageView f15355j;

    /* renamed from: k */
    public final ImageView f15356k;

    /* renamed from: l */
    public final ImageView f15357l;

    /* renamed from: m */
    public final ImageView f15358m;

    /* renamed from: n */
    public final ImageView f15359n;

    /* renamed from: o */
    public final SketchRecorderView f15360o;

    /* renamed from: p */
    public final TextView f15361p;

    /* renamed from: q */
    public final TouchSwitchView f15362q;

    /* renamed from: r */
    public final View f15363r;

    public ViewFragmentBlackboardEvaluationBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ImageView imageView14, SketchRecorderView sketchRecorderView, TextView textView, TouchSwitchView touchSwitchView, View view2) {
        super(obj, view, i10);
        this.f15346a = imageView;
        this.f15347b = imageView2;
        this.f15348c = imageView3;
        this.f15349d = imageView4;
        this.f15350e = imageView5;
        this.f15351f = imageView6;
        this.f15352g = imageView7;
        this.f15353h = imageView8;
        this.f15354i = imageView9;
        this.f15355j = imageView10;
        this.f15356k = imageView11;
        this.f15357l = imageView12;
        this.f15358m = imageView13;
        this.f15359n = imageView14;
        this.f15360o = sketchRecorderView;
        this.f15361p = textView;
        this.f15362q = touchSwitchView;
        this.f15363r = view2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardEvaluationBinding m13262a(LayoutInflater layoutInflater) {
        return m13263b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentBlackboardEvaluationBinding m13263b(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardEvaluationBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_evaluation, null, false, obj);
    }
}

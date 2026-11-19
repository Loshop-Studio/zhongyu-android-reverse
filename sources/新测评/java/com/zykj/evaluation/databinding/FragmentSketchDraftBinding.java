package com.zykj.evaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.evaluation.R;
import com.zykj.view.simpleBoard.SimpleBoardView;

/* loaded from: classes4.dex */
public final class FragmentSketchDraftBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f8740a;

    /* renamed from: b */
    public final Guideline f8741b;

    /* renamed from: c */
    public final ImageView f8742c;

    /* renamed from: d */
    public final ImageView f8743d;

    /* renamed from: e */
    public final ImageView f8744e;

    /* renamed from: f */
    public final ImageView f8745f;

    /* renamed from: g */
    public final ImageView f8746g;

    /* renamed from: h */
    public final ImageView f8747h;

    /* renamed from: i */
    public final ImageView f8748i;

    /* renamed from: j */
    public final ImageView f8749j;

    /* renamed from: k */
    public final ImageView f8750k;

    /* renamed from: l */
    public final ImageView f8751l;

    /* renamed from: m */
    public final LinearLayoutCompat f8752m;

    /* renamed from: n */
    public final LinearLayoutCompat f8753n;

    /* renamed from: o */
    public final SimpleBoardView f8754o;

    /* renamed from: p */
    public final AppCompatTextView f8755p;

    /* renamed from: q */
    public final FrameLayout f8756q;

    public FragmentSketchDraftBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, SimpleBoardView simpleBoardView, AppCompatTextView appCompatTextView, FrameLayout frameLayout) {
        this.f8740a = constraintLayout;
        this.f8741b = guideline;
        this.f8742c = imageView;
        this.f8743d = imageView2;
        this.f8744e = imageView3;
        this.f8745f = imageView4;
        this.f8746g = imageView5;
        this.f8747h = imageView6;
        this.f8748i = imageView7;
        this.f8749j = imageView8;
        this.f8750k = imageView9;
        this.f8751l = imageView10;
        this.f8752m = linearLayoutCompat;
        this.f8753n = linearLayoutCompat2;
        this.f8754o = simpleBoardView;
        this.f8755p = appCompatTextView;
        this.f8756q = frameLayout;
    }

    /* renamed from: a */
    public static FragmentSketchDraftBinding m8662a(View view) {
        int i10 = R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
        if (guideline != null) {
            i10 = R.id.iv_sketch_clean;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_clean);
            if (imageView != null) {
                i10 = R.id.iv_sketch_dotted_line;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_dotted_line);
                if (imageView2 != null) {
                    i10 = R.id.iv_sketch_enlarge;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_enlarge);
                    if (imageView3 != null) {
                        i10 = R.id.iv_sketch_eraser;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_eraser);
                        if (imageView4 != null) {
                            i10 = R.id.iv_sketch_line;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_line);
                            if (imageView5 != null) {
                                i10 = R.id.iv_sketch_pen;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_pen);
                                if (imageView6 != null) {
                                    i10 = R.id.iv_sketch_reduce;
                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_reduce);
                                    if (imageView7 != null) {
                                        i10 = R.id.iv_sketch_refresh;
                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_refresh);
                                        if (imageView8 != null) {
                                            i10 = R.id.iv_sketch_select;
                                            ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_select);
                                            if (imageView9 != null) {
                                                i10 = R.id.iv_sketch_touch_enable;
                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sketch_touch_enable);
                                                if (imageView10 != null) {
                                                    i10 = R.id.ll_control;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.ll_control);
                                                    if (linearLayoutCompat != null) {
                                                        i10 = R.id.ll_loading;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.ll_loading);
                                                        if (linearLayoutCompat2 != null) {
                                                            i10 = R.id.simple_sketch;
                                                            SimpleBoardView simpleBoardView = (SimpleBoardView) ViewBindings.findChildViewById(view, R.id.simple_sketch);
                                                            if (simpleBoardView != null) {
                                                                i10 = R.id.tv_show_analysis;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tv_show_analysis);
                                                                if (appCompatTextView != null) {
                                                                    i10 = R.id.web_view_frame;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.web_view_frame);
                                                                    if (frameLayout != null) {
                                                                        return new FragmentSketchDraftBinding((ConstraintLayout) view, guideline, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, linearLayoutCompat, linearLayoutCompat2, simpleBoardView, appCompatTextView, frameLayout);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: c */
    public static FragmentSketchDraftBinding m8663c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sketch_draft, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m8662a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f8740a;
    }
}

package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xuexiang.xui.widget.alpha.XUIAlphaImageButton;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.widget.TouchSwitchMotionLayout;

/* loaded from: classes5.dex */
public final class DialogueFragmentAnswerDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final TouchSwitchMotionLayout f10410a;

    /* renamed from: b */
    public final FrameLayout f10411b;

    /* renamed from: c */
    public final FrameLayout f10412c;

    /* renamed from: d */
    public final FrameLayout f10413d;

    /* renamed from: e */
    public final XUIAlphaImageButton f10414e;

    /* renamed from: f */
    public final AppCompatImageView f10415f;

    /* renamed from: g */
    public final LinearLayoutCompat f10416g;

    /* renamed from: h */
    public final TouchSwitchMotionLayout f10417h;

    /* renamed from: i */
    public final ConstraintLayout f10418i;

    /* renamed from: j */
    public final View f10419j;

    /* renamed from: k */
    public final AppCompatTextView f10420k;

    /* renamed from: l */
    public final TextView f10421l;

    /* renamed from: m */
    public final AppCompatTextView f10422m;

    /* renamed from: n */
    public final View f10423n;

    public DialogueFragmentAnswerDetailBinding(TouchSwitchMotionLayout touchSwitchMotionLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, XUIAlphaImageButton xUIAlphaImageButton, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, TouchSwitchMotionLayout touchSwitchMotionLayout2, ConstraintLayout constraintLayout, View view, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, View view2) {
        this.f10410a = touchSwitchMotionLayout;
        this.f10411b = frameLayout;
        this.f10412c = frameLayout2;
        this.f10413d = frameLayout3;
        this.f10414e = xUIAlphaImageButton;
        this.f10415f = appCompatImageView;
        this.f10416g = linearLayoutCompat;
        this.f10417h = touchSwitchMotionLayout2;
        this.f10418i = constraintLayout;
        this.f10419j = view;
        this.f10420k = appCompatTextView;
        this.f10421l = textView;
        this.f10422m = appCompatTextView2;
        this.f10423n = view2;
    }

    /* renamed from: a */
    public static DialogueFragmentAnswerDetailBinding m9937a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i9 = R.id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i9);
        if (frameLayout != null) {
            i9 = R.id.fl_tab;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i9);
            if (frameLayout2 != null) {
                i9 = R.id.fl_wrapper;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i9);
                if (frameLayout3 != null) {
                    i9 = R.id.iv_back;
                    XUIAlphaImageButton xUIAlphaImageButton = (XUIAlphaImageButton) ViewBindings.findChildViewById(view, i9);
                    if (xUIAlphaImageButton != null) {
                        i9 = R.id.iv_closed_state;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                        if (appCompatImageView != null) {
                            i9 = R.id.ll_closed_state;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i9);
                            if (linearLayoutCompat != null) {
                                TouchSwitchMotionLayout touchSwitchMotionLayout = (TouchSwitchMotionLayout) view;
                                i9 = R.id.title_bar;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i9);
                                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i9 = R.id.tutorial_bg_step1))) != null) {
                                    i9 = R.id.tv_closed_state;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                    if (appCompatTextView != null) {
                                        i9 = R.id.tv_description;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i9);
                                        if (textView != null) {
                                            i9 = R.id.tv_understood;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                            if (appCompatTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i9 = R.id.v_closed_divider))) != null) {
                                                return new DialogueFragmentAnswerDetailBinding(touchSwitchMotionLayout, frameLayout, frameLayout2, frameLayout3, xUIAlphaImageButton, appCompatImageView, linearLayoutCompat, touchSwitchMotionLayout, constraintLayout, viewFindChildViewById, appCompatTextView, textView, appCompatTextView2, viewFindChildViewById2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static DialogueFragmentAnswerDetailBinding m9938c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.dialogue_fragment_answer_detail, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9937a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TouchSwitchMotionLayout getRoot() {
        return this.f10410a;
    }
}

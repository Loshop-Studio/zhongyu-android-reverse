package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class DialogueCardSessionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f10376a;

    /* renamed from: b */
    public final AppCompatTextView f10377b;

    /* renamed from: c */
    public final AppCompatImageView f10378c;

    /* renamed from: d */
    public final ShapeableImageView f10379d;

    /* renamed from: e */
    public final AppCompatImageView f10380e;

    /* renamed from: f */
    public final AppCompatImageView f10381f;

    /* renamed from: g */
    public final AppCompatImageView f10382g;

    /* renamed from: h */
    public final AppCompatImageView f10383h;

    /* renamed from: i */
    public final AppCompatImageView f10384i;

    /* renamed from: j */
    public final AppCompatTextView f10385j;

    /* renamed from: k */
    public final AppCompatTextView f10386k;

    /* renamed from: l */
    public final AppCompatTextView f10387l;

    /* renamed from: m */
    public final AppCompatTextView f10388m;

    /* renamed from: n */
    public final AppCompatTextView f10389n;

    /* renamed from: o */
    public final AppCompatTextView f10390o;

    /* renamed from: p */
    public final AppCompatTextView f10391p;

    /* renamed from: q */
    public final AppCompatTextView f10392q;

    /* renamed from: r */
    public final AppCompatTextView f10393r;

    /* renamed from: s */
    public final LinearLayoutCompat f10394s;

    /* renamed from: t */
    public final View f10395t;

    /* renamed from: u */
    public final View f10396u;

    /* renamed from: v */
    public final View f10397v;

    public DialogueCardSessionBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, LinearLayoutCompat linearLayoutCompat, View view, View view2, View view3) {
        this.f10376a = constraintLayout;
        this.f10377b = appCompatTextView;
        this.f10378c = appCompatImageView;
        this.f10379d = shapeableImageView;
        this.f10380e = appCompatImageView2;
        this.f10381f = appCompatImageView3;
        this.f10382g = appCompatImageView4;
        this.f10383h = appCompatImageView5;
        this.f10384i = appCompatImageView6;
        this.f10385j = appCompatTextView2;
        this.f10386k = appCompatTextView3;
        this.f10387l = appCompatTextView4;
        this.f10388m = appCompatTextView5;
        this.f10389n = appCompatTextView6;
        this.f10390o = appCompatTextView7;
        this.f10391p = appCompatTextView8;
        this.f10392q = appCompatTextView9;
        this.f10393r = appCompatTextView10;
        this.f10394s = linearLayoutCompat;
        this.f10395t = view;
        this.f10396u = view2;
        this.f10397v = view3;
    }

    /* renamed from: a */
    public static DialogueCardSessionBinding m9934a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i9 = R.id.flag_replay;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
        if (appCompatTextView != null) {
            i9 = R.id.icon_new;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
            if (appCompatImageView != null) {
                i9 = R.id.iv_head_portrait;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i9);
                if (shapeableImageView != null) {
                    i9 = R.id.iv_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                    if (appCompatImageView2 != null) {
                        i9 = R.id.iv_icon1;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                        if (appCompatImageView3 != null) {
                            i9 = R.id.iv_more;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                            if (appCompatImageView4 != null) {
                                i9 = R.id.iv_select;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                                if (appCompatImageView5 != null) {
                                    i9 = R.id.iv_thumbnail;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                                    if (appCompatImageView6 != null) {
                                        i9 = R.id.tv_ask_class;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                        if (appCompatTextView2 != null) {
                                            i9 = R.id.tv_ask_user;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                            if (appCompatTextView3 != null) {
                                                i9 = R.id.tv_close;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                if (appCompatTextView4 != null) {
                                                    i9 = R.id.tv_describe;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                    if (appCompatTextView5 != null) {
                                                        i9 = R.id.tv_message_count;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                        if (appCompatTextView6 != null) {
                                                            i9 = R.id.tv_read;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                            if (appCompatTextView7 != null) {
                                                                i9 = R.id.tv_select;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                                if (appCompatTextView8 != null) {
                                                                    i9 = R.id.tv_subjects;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                                    if (appCompatTextView9 != null) {
                                                                        i9 = R.id.tv_time;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                                                        if (appCompatTextView10 != null) {
                                                                            i9 = R.id.v_select;
                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i9);
                                                                            if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i9 = R.id.v_split))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i9 = R.id.v_split_replay))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i9 = R.id.v_tv_close))) != null) {
                                                                                return new DialogueCardSessionBinding((ConstraintLayout) view, appCompatTextView, appCompatImageView, shapeableImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, linearLayoutCompat, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static DialogueCardSessionBinding m9935c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.dialogue_card_session, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9934a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f10376a;
    }
}

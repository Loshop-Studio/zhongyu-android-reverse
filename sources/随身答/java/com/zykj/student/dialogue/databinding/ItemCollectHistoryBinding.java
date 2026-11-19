package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class ItemCollectHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f10545a;

    /* renamed from: b */
    public final AppCompatImageView f10546b;

    /* renamed from: c */
    public final ShapeableImageView f10547c;

    /* renamed from: d */
    public final AppCompatImageView f10548d;

    /* renamed from: e */
    public final AppCompatTextView f10549e;

    /* renamed from: f */
    public final AppCompatTextView f10550f;

    /* renamed from: g */
    public final AppCompatTextView f10551g;

    /* renamed from: h */
    public final AppCompatTextView f10552h;

    /* renamed from: i */
    public final AppCompatTextView f10553i;

    /* renamed from: j */
    public final View f10554j;

    public ItemCollectHistoryBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, View view) {
        this.f10545a = constraintLayout;
        this.f10546b = appCompatImageView;
        this.f10547c = shapeableImageView;
        this.f10548d = appCompatImageView2;
        this.f10549e = appCompatTextView;
        this.f10550f = appCompatTextView2;
        this.f10551g = appCompatTextView3;
        this.f10552h = appCompatTextView4;
        this.f10553i = appCompatTextView5;
        this.f10554j = view;
    }

    /* renamed from: a */
    public static ItemCollectHistoryBinding m9971a(View view) {
        View viewFindChildViewById;
        int i9 = R.id.iv_collected;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
        if (appCompatImageView != null) {
            i9 = R.id.iv_head_portrait;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i9);
            if (shapeableImageView != null) {
                i9 = R.id.iv_thumbnail;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i9);
                if (appCompatImageView2 != null) {
                    i9 = R.id.tv_ask_class;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                    if (appCompatTextView != null) {
                        i9 = R.id.tv_ask_user;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                        if (appCompatTextView2 != null) {
                            i9 = R.id.tv_describe;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                            if (appCompatTextView3 != null) {
                                i9 = R.id.tv_subjects;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                if (appCompatTextView4 != null) {
                                    i9 = R.id.tv_time;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i9);
                                    if (appCompatTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i9 = R.id.v_split))) != null) {
                                        return new ItemCollectHistoryBinding((ConstraintLayout) view, appCompatImageView, shapeableImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, viewFindChildViewById);
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
    public static ItemCollectHistoryBinding m9972c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.item_collect_history, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9971a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f10545a;
    }
}

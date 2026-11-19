package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public final class FragmentSearchedQuestionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f10538a;

    /* renamed from: b */
    public final ComposeView f10539b;

    /* renamed from: c */
    public final ImageView f10540c;

    /* renamed from: d */
    public final LinearLayout f10541d;

    /* renamed from: e */
    public final RecyclerView f10542e;

    /* renamed from: f */
    public final TextView f10543f;

    /* renamed from: g */
    public final TextView f10544g;

    public FragmentSearchedQuestionBinding(ConstraintLayout constraintLayout, ComposeView composeView, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f10538a = constraintLayout;
        this.f10539b = composeView;
        this.f10540c = imageView;
        this.f10541d = linearLayout;
        this.f10542e = recyclerView;
        this.f10543f = textView;
        this.f10544g = textView2;
    }

    /* renamed from: a */
    public static FragmentSearchedQuestionBinding m9968a(View view) {
        int i9 = R.id.compose_title;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i9);
        if (composeView != null) {
            i9 = R.id.iv_create;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i9);
            if (imageView != null) {
                i9 = R.id.ll_empty;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i9);
                if (linearLayout != null) {
                    i9 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i9);
                    if (recyclerView != null) {
                        i9 = R.id.tv_create;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i9);
                        if (textView != null) {
                            i9 = R.id.tv_head;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i9);
                            if (textView2 != null) {
                                return new FragmentSearchedQuestionBinding((ConstraintLayout) view, composeView, imageView, linearLayout, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i9)));
    }

    /* renamed from: c */
    public static FragmentSearchedQuestionBinding m9969c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_searched_question, viewGroup, false);
        if (z9) {
            viewGroup.addView(viewInflate);
        }
        return m9968a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f10538a;
    }
}

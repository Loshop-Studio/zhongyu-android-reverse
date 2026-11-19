package com.zykj.policy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.policy.R$id;
import com.zykj.policy.R$layout;

/* loaded from: classes6.dex */
public final class PolicyActivityWebviewBinding implements ViewBinding {

    /* renamed from: c */
    public final LinearLayout f19861c;

    /* renamed from: d */
    public final ImageView f19862d;

    /* renamed from: e */
    public final AppCompatTextView f19863e;

    public PolicyActivityWebviewBinding(LinearLayout linearLayout, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.f19861c = linearLayout;
        this.f19862d = imageView;
        this.f19863e = appCompatTextView;
    }

    /* renamed from: a */
    public static PolicyActivityWebviewBinding m16581a(View view) {
        int i10 = R$id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R$id.tvContent;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new PolicyActivityWebviewBinding((LinearLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: c */
    public static PolicyActivityWebviewBinding m16582c(LayoutInflater layoutInflater) {
        return m16583d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyActivityWebviewBinding m16583d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_activity_webview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m16581a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f19861c;
    }
}

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

/* loaded from: classes4.dex */
public final class PolicyActivityWebviewBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f7427a;

    /* renamed from: b */
    public final ImageView f7428b;

    /* renamed from: c */
    public final AppCompatTextView f7429c;

    public PolicyActivityWebviewBinding(LinearLayout linearLayout, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.f7427a = linearLayout;
        this.f7428b = imageView;
        this.f7429c = appCompatTextView;
    }

    /* renamed from: a */
    public static PolicyActivityWebviewBinding m6228a(View view) {
        int i6 = R$id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i6);
        if (imageView != null) {
            i6 = R$id.tvContent;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i6);
            if (appCompatTextView != null) {
                return new PolicyActivityWebviewBinding((LinearLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    /* renamed from: c */
    public static PolicyActivityWebviewBinding m6229c(LayoutInflater layoutInflater) {
        return m6230d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyActivityWebviewBinding m6230d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_activity_webview, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return m6228a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f7427a;
    }
}

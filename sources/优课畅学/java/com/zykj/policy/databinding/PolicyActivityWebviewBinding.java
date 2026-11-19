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

/* loaded from: classes.dex */
public final class PolicyActivityWebviewBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f10559a;

    /* renamed from: b */
    public final ImageView f10560b;

    /* renamed from: c */
    public final AppCompatTextView f10561c;

    public PolicyActivityWebviewBinding(LinearLayout linearLayout, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.f10559a = linearLayout;
        this.f10560b = imageView;
        this.f10561c = appCompatTextView;
    }

    /* renamed from: a */
    public static PolicyActivityWebviewBinding m9716a(View view) {
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
    public static PolicyActivityWebviewBinding m9717c(LayoutInflater layoutInflater) {
        return m9718d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyActivityWebviewBinding m9718d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_activity_webview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m9716a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10559a;
    }
}

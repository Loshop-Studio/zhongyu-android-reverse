package com.zykj.policy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.policy.R$id;
import com.zykj.policy.R$layout;

/* loaded from: classes4.dex */
public final class PolicyDialogPolicyBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f7430a;

    /* renamed from: b */
    public final AppCompatButton f7431b;

    /* renamed from: c */
    public final AppCompatButton f7432c;

    /* renamed from: d */
    public final TextView f7433d;

    /* renamed from: e */
    public final TextView f7434e;

    public PolicyDialogPolicyBinding(LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView, TextView textView2) {
        this.f7430a = linearLayoutCompat;
        this.f7431b = appCompatButton;
        this.f7432c = appCompatButton2;
        this.f7433d = textView;
        this.f7434e = textView2;
    }

    /* renamed from: a */
    public static PolicyDialogPolicyBinding m6232a(View view) {
        int i6 = R$id.btn_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i6);
        if (appCompatButton != null) {
            i6 = R$id.btn_confirm;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i6);
            if (appCompatButton2 != null) {
                i6 = R$id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i6);
                if (textView != null) {
                    i6 = R$id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i6);
                    if (textView2 != null) {
                        return new PolicyDialogPolicyBinding((LinearLayoutCompat) view, appCompatButton, appCompatButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    /* renamed from: c */
    public static PolicyDialogPolicyBinding m6233c(LayoutInflater layoutInflater) {
        return m6234d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyDialogPolicyBinding m6234d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_dialog_policy, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return m6232a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f7430a;
    }
}

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

/* loaded from: classes.dex */
public final class PolicyDialogPolicyBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f10562a;

    /* renamed from: b */
    public final AppCompatButton f10563b;

    /* renamed from: c */
    public final AppCompatButton f10564c;

    /* renamed from: d */
    public final TextView f10565d;

    /* renamed from: e */
    public final TextView f10566e;

    public PolicyDialogPolicyBinding(LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView, TextView textView2) {
        this.f10562a = linearLayoutCompat;
        this.f10563b = appCompatButton;
        this.f10564c = appCompatButton2;
        this.f10565d = textView;
        this.f10566e = textView2;
    }

    /* renamed from: a */
    public static PolicyDialogPolicyBinding m9720a(View view) {
        int i10 = R$id.btn_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatButton != null) {
            i10 = R$id.btn_confirm;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
            if (appCompatButton2 != null) {
                i10 = R$id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    i10 = R$id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        return new PolicyDialogPolicyBinding((LinearLayoutCompat) view, appCompatButton, appCompatButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: c */
    public static PolicyDialogPolicyBinding m9721c(LayoutInflater layoutInflater) {
        return m9722d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyDialogPolicyBinding m9722d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_dialog_policy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m9720a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f10562a;
    }
}

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

/* loaded from: classes6.dex */
public final class PolicyDialogPolicyBinding implements ViewBinding {

    /* renamed from: c */
    public final LinearLayoutCompat f19864c;

    /* renamed from: d */
    public final AppCompatButton f19865d;

    /* renamed from: e */
    public final AppCompatButton f19866e;

    /* renamed from: f */
    public final TextView f19867f;

    /* renamed from: g */
    public final TextView f19868g;

    public PolicyDialogPolicyBinding(LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView, TextView textView2) {
        this.f19864c = linearLayoutCompat;
        this.f19865d = appCompatButton;
        this.f19866e = appCompatButton2;
        this.f19867f = textView;
        this.f19868g = textView2;
    }

    /* renamed from: a */
    public static PolicyDialogPolicyBinding m16585a(View view) {
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
    public static PolicyDialogPolicyBinding m16586c(LayoutInflater layoutInflater) {
        return m16587d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static PolicyDialogPolicyBinding m16587d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.policy_dialog_policy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m16585a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f19864c;
    }
}

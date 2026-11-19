package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class PolicyDialogPolicyBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnCancel;

    @NonNull
    public final AppCompatButton btnConfirm;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    private PolicyDialogPolicyBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatButton appCompatButton2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayoutCompat;
        this.btnCancel = appCompatButton;
        this.btnConfirm = appCompatButton2;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static PolicyDialogPolicyBinding bind(@NonNull View view) {
        int i6 = R.id.btn_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (appCompatButton != null) {
            i6 = R.id.btn_confirm;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, R.id.btn_confirm);
            if (appCompatButton2 != null) {
                i6 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView != null) {
                    i6 = R.id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new PolicyDialogPolicyBinding((LinearLayoutCompat) view, appCompatButton, appCompatButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static PolicyDialogPolicyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PolicyDialogPolicyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.policy_dialog_policy, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

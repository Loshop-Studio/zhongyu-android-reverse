package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class XuiLayoutXtoastBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatImageView toastIcon;

    @NonNull
    public final LinearLayout toastRoot;

    @NonNull
    public final TextView toastText;

    private XuiLayoutXtoastBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.toastIcon = appCompatImageView;
        this.toastRoot = linearLayout2;
        this.toastText = textView;
    }

    @NonNull
    public static XuiLayoutXtoastBinding bind(@NonNull View view) {
        int i10 = R$id.toast_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = R$id.toast_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new XuiLayoutXtoastBinding(linearLayout, appCompatImageView, linearLayout, textView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static XuiLayoutXtoastBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static XuiLayoutXtoastBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.xui_layout_xtoast, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

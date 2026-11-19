package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class LayoutStatusNoSuperviseGroupBinding implements ViewBinding {

    @NonNull
    public final RoundButton btnCreate;

    @NonNull
    public final ImageView imageView3;

    @NonNull
    public final ConstraintLayout llNoSuperviseGroup;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView textView2;

    private LayoutStatusNoSuperviseGroupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RoundButton roundButton, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.btnCreate = roundButton;
        this.imageView3 = imageView;
        this.llNoSuperviseGroup = constraintLayout2;
        this.textView2 = textView;
    }

    @NonNull
    public static LayoutStatusNoSuperviseGroupBinding bind(@NonNull View view) {
        int i10 = R$id.btn_create;
        RoundButton roundButton = (RoundButton) ViewBindings.findChildViewById(view, i10);
        if (roundButton != null) {
            i10 = R$id.imageView3;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R$id.textView2;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    return new LayoutStatusNoSuperviseGroupBinding(constraintLayout, roundButton, imageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutStatusNoSuperviseGroupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutStatusNoSuperviseGroupBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_status_no_supervise_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

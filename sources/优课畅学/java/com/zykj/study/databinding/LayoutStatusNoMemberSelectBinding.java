package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class LayoutStatusNoMemberSelectBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llNoMemberSelect;

    @NonNull
    private final LinearLayout rootView;

    private LayoutStatusNoMemberSelectBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llNoMemberSelect = linearLayout2;
    }

    @NonNull
    public static LayoutStatusNoMemberSelectBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new LayoutStatusNoMemberSelectBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static LayoutStatusNoMemberSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutStatusNoMemberSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_status_no_member_select, viewGroup, false);
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

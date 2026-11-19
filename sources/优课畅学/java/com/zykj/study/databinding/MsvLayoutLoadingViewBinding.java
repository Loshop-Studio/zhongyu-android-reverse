package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class MsvLayoutLoadingViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout loadingView;

    @NonNull
    private final ConstraintLayout rootView;

    private MsvLayoutLoadingViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.loadingView = constraintLayout2;
    }

    @NonNull
    public static MsvLayoutLoadingViewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new MsvLayoutLoadingViewBinding(constraintLayout, constraintLayout);
    }

    @NonNull
    public static MsvLayoutLoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MsvLayoutLoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.msv_layout_loading_view, viewGroup, false);
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

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
public final class LayoutStatusNoCatalogToEditBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llNoCatalogToEdit;

    @NonNull
    private final LinearLayout rootView;

    private LayoutStatusNoCatalogToEditBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llNoCatalogToEdit = linearLayout2;
    }

    @NonNull
    public static LayoutStatusNoCatalogToEditBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new LayoutStatusNoCatalogToEditBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static LayoutStatusNoCatalogToEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutStatusNoCatalogToEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_status_no_catalog_to_edit, viewGroup, false);
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

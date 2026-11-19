package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class FragmentSingleDialogBinding implements ViewBinding {

    @NonNull
    public final MaterialButton btnNegative;

    @NonNull
    public final MaterialButton btnPositive;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final MaterialTextView tvMessage;

    @NonNull
    public final MaterialTextView tvTitle;

    private FragmentSingleDialogBinding(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialTextView materialTextView, @NonNull MaterialTextView materialTextView2) {
        this.rootView = frameLayout;
        this.btnNegative = materialButton;
        this.btnPositive = materialButton2;
        this.tvMessage = materialTextView;
        this.tvTitle = materialTextView2;
    }

    @NonNull
    public static FragmentSingleDialogBinding bind(@NonNull View view) {
        int i6 = R.id.btn_negative;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_negative);
        if (materialButton != null) {
            i6 = R.id.btn_positive;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_positive);
            if (materialButton2 != null) {
                i6 = R.id.tv_message;
                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.tv_message);
                if (materialTextView != null) {
                    i6 = R.id.tv_title;
                    MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (materialTextView2 != null) {
                        return new FragmentSingleDialogBinding((FrameLayout) view, materialButton, materialButton2, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static FragmentSingleDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSingleDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_single_dialog, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

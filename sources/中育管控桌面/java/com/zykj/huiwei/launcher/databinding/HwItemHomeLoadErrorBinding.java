package com.zykj.huiwei.launcher.databinding;

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
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class HwItemHomeLoadErrorBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout itemHomeLoadError;

    @NonNull
    public final ImageView ivImage;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvRetry;

    @NonNull
    public final TextView tvTip;

    private HwItemHomeLoadErrorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.itemHomeLoadError = constraintLayout2;
        this.ivImage = imageView;
        this.tvRetry = textView;
        this.tvTip = textView2;
    }

    @NonNull
    public static HwItemHomeLoadErrorBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i6 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_image);
        if (imageView != null) {
            i6 = R.id.tv_retry;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_retry);
            if (textView != null) {
                i6 = R.id.tv_tip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tip);
                if (textView2 != null) {
                    return new HwItemHomeLoadErrorBinding(constraintLayout, constraintLayout, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static HwItemHomeLoadErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static HwItemHomeLoadErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.hw_item_home_load_error, viewGroup, false);
        if (z6) {
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

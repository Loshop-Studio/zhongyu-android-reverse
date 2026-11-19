package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class FloatingToolbarBinding implements ViewBinding {

    @NonNull
    public final ImageView imgArrowLeft;

    @NonNull
    public final ImageView imgArrowRight;

    @NonNull
    public final LinearLayout imgLinear;

    @NonNull
    public final ImageView imgScreenShot;

    @NonNull
    public final ImageView imgScreenTurnOpen;

    @NonNull
    public final LinearLayout linearMenu;

    @NonNull
    private final LinearLayout rootView;

    private FloatingToolbarBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.imgArrowLeft = imageView;
        this.imgArrowRight = imageView2;
        this.imgLinear = linearLayout2;
        this.imgScreenShot = imageView3;
        this.imgScreenTurnOpen = imageView4;
        this.linearMenu = linearLayout3;
    }

    @NonNull
    public static FloatingToolbarBinding bind(@NonNull View view) {
        int i6 = R.id.img_arrow_left;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_arrow_left);
        if (imageView != null) {
            i6 = R.id.img_arrow_right;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_arrow_right);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i6 = R.id.img_screen_shot;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_screen_shot);
                if (imageView3 != null) {
                    i6 = R.id.img_screen_turn_open;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_screen_turn_open);
                    if (imageView4 != null) {
                        i6 = R.id.linear_menu;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linear_menu);
                        if (linearLayout2 != null) {
                            return new FloatingToolbarBinding(linearLayout, imageView, imageView2, linearLayout, imageView3, imageView4, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static FloatingToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FloatingToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.floating_toolbar, viewGroup, false);
        if (z6) {
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

package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class DialogCroppedBitmapBinding implements ViewBinding {

    @NonNull
    public final ImageView croppedImageView;

    @NonNull
    public final ImageView imgClose;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final Button saveBtn;

    private DialogCroppedBitmapBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Button button) {
        this.rootView = frameLayout;
        this.croppedImageView = imageView;
        this.imgClose = imageView2;
        this.saveBtn = button;
    }

    @NonNull
    public static DialogCroppedBitmapBinding bind(@NonNull View view) {
        int i6 = R.id.cropped_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cropped_image_view);
        if (imageView != null) {
            i6 = R.id.img_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_close);
            if (imageView2 != null) {
                i6 = R.id.save_btn;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.save_btn);
                if (button != null) {
                    return new DialogCroppedBitmapBinding((FrameLayout) view, imageView, imageView2, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static DialogCroppedBitmapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogCroppedBitmapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_cropped_bitmap, viewGroup, false);
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

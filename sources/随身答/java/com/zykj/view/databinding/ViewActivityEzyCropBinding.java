package com.zykj.view.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.canhub.cropper.CropImageView;

/* loaded from: classes5.dex */
public abstract class ViewActivityEzyCropBinding extends ViewDataBinding {

    /* renamed from: a */
    public final LinearLayout f12548a;

    /* renamed from: b */
    public final FrameLayout f12549b;

    /* renamed from: c */
    public final View f12550c;

    /* renamed from: d */
    public final ConstraintLayout f12551d;

    /* renamed from: e */
    public final CropImageView f12552e;

    /* renamed from: f */
    public final ImageView f12553f;

    /* renamed from: g */
    public final LinearLayout f12554g;

    /* renamed from: h */
    public final TextView f12555h;

    /* renamed from: i */
    public boolean f12556i;

    public ViewActivityEzyCropBinding(Object obj, View view, int i9, LinearLayout linearLayout, FrameLayout frameLayout, View view2, ConstraintLayout constraintLayout, CropImageView cropImageView, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        super(obj, view, i9);
        this.f12548a = linearLayout;
        this.f12549b = frameLayout;
        this.f12550c = view2;
        this.f12551d = constraintLayout;
        this.f12552e = cropImageView;
        this.f12553f = imageView;
        this.f12554g = linearLayout2;
        this.f12555h = textView;
    }

    /* renamed from: a */
    public abstract void mo11875a(boolean z9);
}

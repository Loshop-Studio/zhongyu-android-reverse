package com.xuexiang.xui.widget.imageview.preview.p034ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import p018b2.ViewOnClickListenerC3103c;
import p164t1.AbstractC6582a;
import p173u2.C6611a;
import p189w2.C6702a;

/* loaded from: classes3.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: a */
    public SmoothImageView f4441a;

    /* renamed from: b */
    public View f4442b;

    /* renamed from: c */
    public ImageView f4443c;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C6611a c6611aM6254a = C6611a.m6254a();
        FragmentActivity activity = getActivity();
        c6611aM6254a.f11042a.getClass();
        ComponentCallbacks2C3408b.m2360c(activity).m2364b();
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SmoothImageView smoothImageView = this.f4441a;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f4441a.setOnViewTapListener(null);
            this.f4441a.setOnPhotoTapListener(null);
            this.f4441a.setAlphaChangeListener(null);
            this.f4441a.setTransformOutListener(null);
            SmoothImageView smoothImageView2 = this.f4441a;
            smoothImageView2.setOnTransformListener(null);
            smoothImageView2.f4500j = true;
            smoothImageView2.f4493c = SmoothImageView.Status.STATE_IN;
            smoothImageView2.invalidate();
            this.f4441a.m3517f(null);
            this.f4441a.setOnLongClickListener(null);
            this.f4443c.setOnClickListener(null);
            this.f4441a = null;
            this.f4442b = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C6611a.m6254a().f11042a.getClass();
        ComponentCallbacks2C3408b.m2363f(this).onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f4441a = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f4443c = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f4442b = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f4441a.setDrawingCacheEnabled(false);
        this.f4443c.setOnClickListener(new ViewOnClickListenerC3103c(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme);
            AbstractC6582a.m6217a();
            throw null;
        }
        this.f4442b.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f4441a.setOnViewTapListener(new C6702a(this));
        this.f4441a.setAlphaChangeListener(new C6702a(this));
        this.f4441a.setTransformOutListener(new C6702a(this));
    }
}

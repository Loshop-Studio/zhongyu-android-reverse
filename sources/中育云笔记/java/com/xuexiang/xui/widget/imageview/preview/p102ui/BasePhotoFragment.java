package com.xuexiang.xui.widget.imageview.preview.p102ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p336s8.C11079a;
import p347t8.InterfaceC11253c;

/* loaded from: classes5.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: k */
    public static final /* synthetic */ int f16252k = 0;

    /* renamed from: d */
    public IPreviewInfo f16253d;

    /* renamed from: e */
    public boolean f16254e = false;

    /* renamed from: f */
    public SmoothImageView f16255f;

    /* renamed from: g */
    public View f16256g;

    /* renamed from: h */
    public MaterialProgressBar f16257h;

    /* renamed from: i */
    public InterfaceC11253c f16258i;

    /* renamed from: j */
    public ImageView f16259j;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC8142a implements View.OnClickListener {
        public ViewOnClickListenerC8142a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM12849e = BasePhotoFragment.this.f16253d.m12849e();
            if (strM12849e == null || strM12849e.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m12880L(BasePhotoFragment.this, strM12849e);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C8143b implements InterfaceC11253c {
        public C8143b() {
        }

        @Override // p347t8.InterfaceC11253c
        /* renamed from: a */
        public void mo12861a() {
            BasePhotoFragment.this.f16257h.setVisibility(8);
            String strM12849e = BasePhotoFragment.this.f16253d.m12849e();
            if (strM12849e == null || strM12849e.isEmpty()) {
                BasePhotoFragment.this.f16259j.setVisibility(8);
            } else {
                BasePhotoFragment.this.f16259j.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f16259j).alpha(1.0f).setDuration(1000L).start();
            }
        }

        @Override // p347t8.InterfaceC11253c
        /* renamed from: b */
        public void mo12862b(Drawable drawable) {
            BasePhotoFragment.this.f16257h.setVisibility(8);
            BasePhotoFragment.this.f16259j.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f16255f.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C8144c implements ViewOnTouchListenerC8141c.i {
        public C8144c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c.i
        /* renamed from: a */
        public void mo12848a(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f16255f.m12897j()) {
                BasePhotoFragment.this.m12855x();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C8145d implements ViewOnTouchListenerC8141c.f {
        public C8145d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c.f
        /* renamed from: a */
        public void mo12846a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c.f
        /* renamed from: b */
        public void mo12847b(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f16255f.m12897j()) {
                BasePhotoFragment.this.m12855x();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C8146e implements SmoothImageView.InterfaceC8161g {
        public C8146e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC8161g
        /* renamed from: a */
        public void mo12863a(int i10) {
            String strM12849e;
            if (i10 != 255 || (strM12849e = BasePhotoFragment.this.f16253d.m12849e()) == null || strM12849e.isEmpty()) {
                BasePhotoFragment.this.f16259j.setVisibility(8);
            } else {
                BasePhotoFragment.this.f16259j.setVisibility(0);
            }
            BasePhotoFragment.this.f16256g.setBackgroundColor(BasePhotoFragment.m12852r(i10 / 255.0f, ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C8147f implements SmoothImageView.InterfaceC8162h {
        public C8147f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC8162h
        /* renamed from: a */
        public void mo12864a() {
            BasePhotoFragment.this.m12855x();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C8148g implements SmoothImageView.InterfaceC8164j {
        public C8148g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC8164j
        /* renamed from: a */
        public void mo12865a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f16256g.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* renamed from: r */
    public static int m12852r(float f10, int i10) {
        return (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: s */
    private void m12853s() {
        boolean z10;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f16257h.setSupportIndeterminateTintList(AbstractC8040f.m12203d(arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z10 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f16253d = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f16255f.m12902o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f16255f.setThumbRect(this.f16253d.getBounds());
            this.f16256g.setTag(this.f16253d.getUrl());
            this.f16254e = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f16253d.getUrl().toLowerCase().contains(".gif")) {
                this.f16255f.setZoomable(false);
                C11079a.m24625e().mo24628c(this, this.f16253d.getUrl(), this.f16255f, this.f16258i);
            } else {
                C11079a.m24625e().mo24629d(this, this.f16253d.getUrl(), this.f16255f, this.f16258i);
            }
        } else {
            z10 = true;
        }
        if (this.f16254e) {
            this.f16255f.setMinimumScale(0.7f);
        } else {
            this.f16256g.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z10) {
            this.f16255f.setOnViewTapListener(new C8144c());
        } else {
            this.f16255f.setOnPhotoTapListener(new C8145d());
        }
        this.f16255f.setAlphaChangeListener(new C8146e());
        this.f16255f.setTransformOutListener(new C8147f());
    }

    /* renamed from: u */
    public static BasePhotoFragment m12854u(Class cls, IPreviewInfo iPreviewInfo, boolean z10, boolean z11, boolean z12, float f10, int i10) {
        BasePhotoFragment basePhotoFragment;
        try {
            basePhotoFragment = (BasePhotoFragment) cls.newInstance();
        } catch (Exception unused) {
            basePhotoFragment = new BasePhotoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", iPreviewInfo);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z10);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z11);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", z12);
        bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", f10);
        bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", i10);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m12855x() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m12877U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C11079a.m24625e().mo24626a(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m12858v();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C11079a.m24625e().mo24627b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m12857t(view);
        m12853s();
    }

    /* renamed from: q */
    public void m12856q(int i10) {
        ViewCompat.animate(this.f16259j).alpha(0.0f).setDuration(500L).start();
        this.f16256g.setBackgroundColor(i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
    }

    /* renamed from: t */
    public final void m12857t(View view) {
        this.f16257h = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f16255f = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f16259j = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f16256g = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f16255f.setDrawingCacheEnabled(false);
        this.f16259j.setOnClickListener(new ViewOnClickListenerC8142a());
        this.f16258i = new C8143b();
    }

    /* renamed from: v */
    public void m12858v() {
        this.f16258i = null;
        SmoothImageView smoothImageView = this.f16255f;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f16255f.setOnViewTapListener(null);
            this.f16255f.setOnPhotoTapListener(null);
            this.f16255f.setAlphaChangeListener(null);
            this.f16255f.setTransformOutListener(null);
            this.f16255f.m12904q(null);
            this.f16255f.m12905r(null);
            this.f16255f.setOnLongClickListener(null);
            this.f16259j.setOnClickListener(null);
            this.f16255f = null;
            this.f16256g = null;
            this.f16254e = false;
        }
    }

    /* renamed from: w */
    public void m12859w() {
        this.f16255f.m12904q(new C8148g());
    }

    /* renamed from: y */
    public void m12860y(SmoothImageView.InterfaceC8164j interfaceC8164j) {
        this.f16255f.m12905r(interfaceC8164j);
    }
}

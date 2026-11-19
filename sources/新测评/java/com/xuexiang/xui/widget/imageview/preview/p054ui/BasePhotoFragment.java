package com.xuexiang.xui.widget.imageview.preview.p054ui;

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
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p119i3.C7660a;
import p130j3.InterfaceC7791c;

/* loaded from: classes4.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f6388h = 0;

    /* renamed from: a */
    public IPreviewInfo f6389a;

    /* renamed from: b */
    public boolean f6390b = false;

    /* renamed from: c */
    public SmoothImageView f6391c;

    /* renamed from: d */
    public View f6392d;

    /* renamed from: e */
    public MaterialProgressBar f6393e;

    /* renamed from: f */
    public InterfaceC7791c f6394f;

    /* renamed from: g */
    public ImageView f6395g;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC6530a implements View.OnClickListener {
        public ViewOnClickListenerC6530a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM5762k = BasePhotoFragment.this.f6389a.m5762k();
            if (strM5762k == null || strM5762k.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m5795o(BasePhotoFragment.this, strM5762k);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C6531b implements InterfaceC7791c {
        public C6531b() {
        }

        @Override // p130j3.InterfaceC7791c
        /* renamed from: a */
        public void mo5774a() {
            BasePhotoFragment.this.f6393e.setVisibility(8);
            String strM5762k = BasePhotoFragment.this.f6389a.m5762k();
            if (strM5762k == null || strM5762k.isEmpty()) {
                BasePhotoFragment.this.f6395g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f6395g.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f6395g).alpha(1.0f).setDuration(1000L).start();
            }
        }

        @Override // p130j3.InterfaceC7791c
        /* renamed from: b */
        public void mo5775b(Drawable drawable) {
            BasePhotoFragment.this.f6393e.setVisibility(8);
            BasePhotoFragment.this.f6395g.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f6391c.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C6532c implements ViewOnTouchListenerC6529c.i {
        public C6532c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c.i
        /* renamed from: a */
        public void mo5761a(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f6391c.m5812j()) {
                BasePhotoFragment.this.m5768l();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C6533d implements ViewOnTouchListenerC6529c.f {
        public C6533d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c.f
        /* renamed from: a */
        public void mo5759a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c.f
        /* renamed from: b */
        public void mo5760b(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f6391c.m5812j()) {
                BasePhotoFragment.this.m5768l();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C6534e implements SmoothImageView.InterfaceC6549g {
        public C6534e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6549g
        /* renamed from: a */
        public void mo5776a(int i10) {
            String strM5762k;
            if (i10 != 255 || (strM5762k = BasePhotoFragment.this.f6389a.m5762k()) == null || strM5762k.isEmpty()) {
                BasePhotoFragment.this.f6395g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f6395g.setVisibility(0);
            }
            BasePhotoFragment.this.f6392d.setBackgroundColor(BasePhotoFragment.m5765f(i10 / 255.0f, ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C6535f implements SmoothImageView.InterfaceC6550h {
        public C6535f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6550h
        /* renamed from: a */
        public void mo5777a() {
            BasePhotoFragment.this.m5768l();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C6536g implements SmoothImageView.InterfaceC6552j {
        public C6536g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6552j
        /* renamed from: a */
        public void mo5778a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f6392d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* renamed from: f */
    public static int m5765f(float f10, int i10) {
        return (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: g */
    private void m5766g() {
        boolean z9;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f6393e.setSupportIndeterminateTintList(AbstractC6480e.m5358d(getContext(), arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z9 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f6389a = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f6391c.m5817o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f6391c.setThumbRect(this.f6389a.getBounds());
            this.f6392d.setTag(this.f6389a.getUrl());
            this.f6390b = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f6389a.getUrl().toLowerCase().contains(".gif")) {
                this.f6391c.setZoomable(false);
                C7660a.m12728e().mo12732d(this, this.f6389a.getUrl(), this.f6391c, this.f6394f);
            } else {
                C7660a.m12728e().mo12731c(this, this.f6389a.getUrl(), this.f6391c, this.f6394f);
            }
        } else {
            z9 = true;
        }
        if (this.f6390b) {
            this.f6391c.setMinimumScale(0.7f);
        } else {
            this.f6392d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z9) {
            this.f6391c.setOnViewTapListener(new C6532c());
        } else {
            this.f6391c.setOnPhotoTapListener(new C6533d());
        }
        this.f6391c.setAlphaChangeListener(new C6534e());
        this.f6391c.setTransformOutListener(new C6535f());
    }

    /* renamed from: i */
    public static BasePhotoFragment m5767i(Class cls, IPreviewInfo iPreviewInfo, boolean z9, boolean z10, boolean z11, float f10, int i10) {
        BasePhotoFragment basePhotoFragment;
        try {
            basePhotoFragment = (BasePhotoFragment) cls.newInstance();
        } catch (Exception unused) {
            basePhotoFragment = new BasePhotoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", iPreviewInfo);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z9);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z10);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", z11);
        bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", f10);
        bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", i10);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m5768l() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m5792z();
        }
    }

    /* renamed from: e */
    public void m5769e(int i10) {
        ViewCompat.animate(this.f6395g).alpha(0.0f).setDuration(500L).start();
        this.f6392d.setBackgroundColor(i10);
    }

    /* renamed from: h */
    public final void m5770h(View view) {
        this.f6393e = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f6391c = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f6395g = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f6392d = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f6391c.setDrawingCacheEnabled(false);
        this.f6395g.setOnClickListener(new ViewOnClickListenerC6530a());
        this.f6394f = new C6531b();
    }

    /* renamed from: j */
    public void m5771j() {
        this.f6394f = null;
        SmoothImageView smoothImageView = this.f6391c;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f6391c.setOnViewTapListener(null);
            this.f6391c.setOnPhotoTapListener(null);
            this.f6391c.setAlphaChangeListener(null);
            this.f6391c.setTransformOutListener(null);
            this.f6391c.m5819q(null);
            this.f6391c.m5820r(null);
            this.f6391c.setOnLongClickListener(null);
            this.f6395g.setOnClickListener(null);
            this.f6391c = null;
            this.f6392d = null;
            this.f6390b = false;
        }
    }

    /* renamed from: k */
    public void m5772k() {
        this.f6391c.m5819q(new C6536g());
    }

    /* renamed from: m */
    public void m5773m(SmoothImageView.InterfaceC6552j interfaceC6552j) {
        this.f6391c.m5820r(interfaceC6552j);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C7660a.m12728e().mo12729a(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m5771j();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C7660a.m12728e().mo12730b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m5770h(view);
        m5766g();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z9) {
        super.setUserVisibleHint(z9);
    }
}

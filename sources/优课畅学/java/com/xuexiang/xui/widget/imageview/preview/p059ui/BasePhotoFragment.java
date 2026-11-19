package com.xuexiang.xui.widget.imageview.preview.p059ui;

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
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p118h2.C8709a;
import p129i2.InterfaceC8755c;

/* loaded from: classes4.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f7805h = 0;

    /* renamed from: a */
    public IPreviewInfo f7806a;

    /* renamed from: b */
    public boolean f7807b = false;

    /* renamed from: c */
    public SmoothImageView f7808c;

    /* renamed from: d */
    public View f7809d;

    /* renamed from: e */
    public MaterialProgressBar f7810e;

    /* renamed from: f */
    public InterfaceC8755c f7811f;

    /* renamed from: g */
    public ImageView f7812g;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC6936a implements View.OnClickListener {
        public ViewOnClickListenerC6936a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM6956e = BasePhotoFragment.this.f7806a.m6956e();
            if (strM6956e == null || strM6956e.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m6989o(BasePhotoFragment.this, strM6956e);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C6937b implements InterfaceC8755c {
        public C6937b() {
        }

        @Override // p129i2.InterfaceC8755c
        /* renamed from: a */
        public void mo6968a(Drawable drawable) {
            BasePhotoFragment.this.f7810e.setVisibility(8);
            BasePhotoFragment.this.f7812g.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f7808c.setImageDrawable(drawable);
            }
        }

        @Override // p129i2.InterfaceC8755c
        /* renamed from: b */
        public void mo6969b() {
            BasePhotoFragment.this.f7810e.setVisibility(8);
            String strM6956e = BasePhotoFragment.this.f7806a.m6956e();
            if (strM6956e == null || strM6956e.isEmpty()) {
                BasePhotoFragment.this.f7812g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f7812g.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f7812g).alpha(1.0f).setDuration(1000L).start();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C6938c implements ViewOnTouchListenerC6935c.i {
        public C6938c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.i
        /* renamed from: a */
        public void mo6955a(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f7808c.m7006j()) {
                BasePhotoFragment.this.m6962o();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C6939d implements ViewOnTouchListenerC6935c.f {
        public C6939d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.f
        /* renamed from: a */
        public void mo6953a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.f
        /* renamed from: b */
        public void mo6954b(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f7808c.m7006j()) {
                BasePhotoFragment.this.m6962o();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C6940e implements SmoothImageView.InterfaceC6955g {
        public C6940e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6955g
        /* renamed from: a */
        public void mo6970a(int i10) {
            String strM6956e;
            if (i10 != 255 || (strM6956e = BasePhotoFragment.this.f7806a.m6956e()) == null || strM6956e.isEmpty()) {
                BasePhotoFragment.this.f7812g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f7812g.setVisibility(0);
            }
            BasePhotoFragment.this.f7809d.setBackgroundColor(BasePhotoFragment.m6959i(i10 / 255.0f, -16777216));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C6941f implements SmoothImageView.InterfaceC6956h {
        public C6941f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6956h
        /* renamed from: a */
        public void mo6971a() {
            BasePhotoFragment.this.m6962o();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C6942g implements SmoothImageView.InterfaceC6958j {
        public C6942g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6958j
        /* renamed from: a */
        public void mo6972a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f7809d.setBackgroundColor(-16777216);
        }
    }

    /* renamed from: i */
    public static int m6959i(float f10, int i10) {
        return (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: j */
    private void m6960j() {
        boolean z10;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f7810e.setSupportIndeterminateTintList(AbstractC6875e.m6449e(getContext(), arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z10 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f7806a = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f7808c.m7011o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f7808c.setThumbRect(this.f7806a.getBounds());
            this.f7809d.setTag(this.f7806a.getUrl());
            this.f7807b = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f7806a.getUrl().toLowerCase().contains(".gif")) {
                this.f7808c.setZoomable(false);
                C8709a.m14209e().mo14212c(this, this.f7806a.getUrl(), this.f7808c, this.f7811f);
            } else {
                C8709a.m14209e().mo14213d(this, this.f7806a.getUrl(), this.f7808c, this.f7811f);
            }
        } else {
            z10 = true;
        }
        if (this.f7807b) {
            this.f7808c.setMinimumScale(0.7f);
        } else {
            this.f7809d.setBackgroundColor(-16777216);
        }
        if (z10) {
            this.f7808c.setOnViewTapListener(new C6938c());
        } else {
            this.f7808c.setOnPhotoTapListener(new C6939d());
        }
        this.f7808c.setAlphaChangeListener(new C6940e());
        this.f7808c.setTransformOutListener(new C6941f());
    }

    /* renamed from: l */
    public static BasePhotoFragment m6961l(Class cls, IPreviewInfo iPreviewInfo, boolean z10, boolean z11, boolean z12, float f10, int i10) {
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
    /* renamed from: o */
    public void m6962o() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m6986z();
        }
    }

    /* renamed from: h */
    public void m6963h(int i10) {
        ViewCompat.animate(this.f7812g).alpha(0.0f).setDuration(500L).start();
        this.f7809d.setBackgroundColor(i10);
    }

    /* renamed from: k */
    public final void m6964k(View view) {
        this.f7810e = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f7808c = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f7812g = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f7809d = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f7808c.setDrawingCacheEnabled(false);
        this.f7812g.setOnClickListener(new ViewOnClickListenerC6936a());
        this.f7811f = new C6937b();
    }

    /* renamed from: m */
    public void m6965m() {
        this.f7811f = null;
        SmoothImageView smoothImageView = this.f7808c;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f7808c.setOnViewTapListener(null);
            this.f7808c.setOnPhotoTapListener(null);
            this.f7808c.setAlphaChangeListener(null);
            this.f7808c.setTransformOutListener(null);
            this.f7808c.m7013q(null);
            this.f7808c.m7014r(null);
            this.f7808c.setOnLongClickListener(null);
            this.f7812g.setOnClickListener(null);
            this.f7808c = null;
            this.f7809d = null;
            this.f7807b = false;
        }
    }

    /* renamed from: n */
    public void m6966n() {
        this.f7808c.m7013q(new C6942g());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8709a.m14209e().mo14210a(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m6965m();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C8709a.m14209e().mo14211b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m6964k(view);
        m6960j();
    }

    /* renamed from: p */
    public void m6967p(SmoothImageView.InterfaceC6958j interfaceC6958j) {
        this.f7808c.m7014r(interfaceC6958j);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
    }
}

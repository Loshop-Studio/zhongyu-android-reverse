package com.xuexiang.xui.widget.imageview.preview.p073ui;

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
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p301y3.C9947a;
import p311z3.InterfaceC9997c;

/* loaded from: classes4.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f7646h = 0;

    /* renamed from: a */
    public IPreviewInfo f7647a;

    /* renamed from: b */
    public boolean f7648b = false;

    /* renamed from: c */
    public SmoothImageView f7649c;

    /* renamed from: d */
    public View f7650d;

    /* renamed from: e */
    public MaterialProgressBar f7651e;

    /* renamed from: f */
    public InterfaceC9997c f7652f;

    /* renamed from: g */
    public ImageView f7653g;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC6850a implements View.OnClickListener {
        public ViewOnClickListenerC6850a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM6868n = BasePhotoFragment.this.f7647a.m6868n();
            if (strM6868n == null || strM6868n.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m6901o(BasePhotoFragment.this, strM6868n);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C6851b implements InterfaceC9997c {
        public C6851b() {
        }

        @Override // p311z3.InterfaceC9997c
        /* renamed from: a */
        public void mo6880a() {
            BasePhotoFragment.this.f7651e.setVisibility(8);
            String strM6868n = BasePhotoFragment.this.f7647a.m6868n();
            if (strM6868n == null || strM6868n.isEmpty()) {
                BasePhotoFragment.this.f7653g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f7653g.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f7653g).alpha(1.0f).setDuration(1000L).start();
            }
        }

        @Override // p311z3.InterfaceC9997c
        /* renamed from: b */
        public void mo6881b(Drawable drawable) {
            BasePhotoFragment.this.f7651e.setVisibility(8);
            BasePhotoFragment.this.f7653g.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f7649c.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C6852c implements ViewOnTouchListenerC6849c.i {
        public C6852c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c.i
        /* renamed from: a */
        public void mo6867a(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f7649c.m6918j()) {
                BasePhotoFragment.this.m6874l();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C6853d implements ViewOnTouchListenerC6849c.f {
        public C6853d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c.f
        /* renamed from: a */
        public void mo6865a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c.f
        /* renamed from: b */
        public void mo6866b(View view, float f10, float f11) {
            if (BasePhotoFragment.this.f7649c.m6918j()) {
                BasePhotoFragment.this.m6874l();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C6854e implements SmoothImageView.InterfaceC6869g {
        public C6854e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6869g
        /* renamed from: a */
        public void mo6882a(int i9) {
            String strM6868n;
            if (i9 != 255 || (strM6868n = BasePhotoFragment.this.f7647a.m6868n()) == null || strM6868n.isEmpty()) {
                BasePhotoFragment.this.f7653g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f7653g.setVisibility(0);
            }
            BasePhotoFragment.this.f7650d.setBackgroundColor(BasePhotoFragment.m6871f(i9 / 255.0f, ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C6855f implements SmoothImageView.InterfaceC6870h {
        public C6855f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6870h
        /* renamed from: a */
        public void mo6883a() {
            BasePhotoFragment.this.m6874l();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C6856g implements SmoothImageView.InterfaceC6872j {
        public C6856g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC6872j
        /* renamed from: a */
        public void mo6884a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f7650d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* renamed from: f */
    public static int m6871f(float f10, int i9) {
        return (Math.min(255, Math.max(0, (int) (f10 * 255.0f))) << 24) + (i9 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: g */
    private void m6872g() {
        boolean z9;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f7651e.setSupportIndeterminateTintList(AbstractC6799e.m6458c(arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z9 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f7647a = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f7649c.m6923o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f7649c.setThumbRect(this.f7647a.getBounds());
            this.f7650d.setTag(this.f7647a.getUrl());
            this.f7648b = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f7647a.getUrl().toLowerCase().contains(".gif")) {
                this.f7649c.setZoomable(false);
                C9947a.m17150e().mo17153c(this, this.f7647a.getUrl(), this.f7649c, this.f7652f);
            } else {
                C9947a.m17150e().mo17154d(this, this.f7647a.getUrl(), this.f7649c, this.f7652f);
            }
        } else {
            z9 = true;
        }
        if (this.f7648b) {
            this.f7649c.setMinimumScale(0.7f);
        } else {
            this.f7650d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z9) {
            this.f7649c.setOnViewTapListener(new C6852c());
        } else {
            this.f7649c.setOnPhotoTapListener(new C6853d());
        }
        this.f7649c.setAlphaChangeListener(new C6854e());
        this.f7649c.setTransformOutListener(new C6855f());
    }

    /* renamed from: i */
    public static BasePhotoFragment m6873i(Class cls, IPreviewInfo iPreviewInfo, boolean z9, boolean z10, boolean z11, float f10, int i9) {
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
        bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", i9);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m6874l() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m6898z();
        }
    }

    /* renamed from: e */
    public void m6875e(int i9) {
        ViewCompat.animate(this.f7653g).alpha(0.0f).setDuration(500L).start();
        this.f7650d.setBackgroundColor(i9);
    }

    /* renamed from: h */
    public final void m6876h(View view) {
        this.f7651e = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f7649c = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f7653g = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f7650d = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f7649c.setDrawingCacheEnabled(false);
        this.f7653g.setOnClickListener(new ViewOnClickListenerC6850a());
        this.f7652f = new C6851b();
    }

    /* renamed from: j */
    public void m6877j() {
        this.f7652f = null;
        SmoothImageView smoothImageView = this.f7649c;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f7649c.setOnViewTapListener(null);
            this.f7649c.setOnPhotoTapListener(null);
            this.f7649c.setAlphaChangeListener(null);
            this.f7649c.setTransformOutListener(null);
            this.f7649c.m6925q(null);
            this.f7649c.m6926r(null);
            this.f7649c.setOnLongClickListener(null);
            this.f7653g.setOnClickListener(null);
            this.f7649c = null;
            this.f7650d = null;
            this.f7648b = false;
        }
    }

    /* renamed from: k */
    public void m6878k() {
        this.f7649c.m6925q(new C6856g());
    }

    /* renamed from: m */
    public void m6879m(SmoothImageView.InterfaceC6872j interfaceC6872j) {
        this.f7649c.m6926r(interfaceC6872j);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C9947a.m17150e().mo17151a(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m6877j();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C9947a.m17150e().mo17152b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m6876h(view);
        m6872g();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z9) {
        super.setUserVisibleHint(z9);
    }
}

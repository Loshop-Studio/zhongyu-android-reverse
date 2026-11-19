package com.xuexiang.xui.widget.imageview.preview.p033ui;

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
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p083j2.C6584a;
import p090k2.InterfaceC6629c;

/* loaded from: classes3.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f5113h = 0;

    /* renamed from: a */
    public IPreviewInfo f5114a;

    /* renamed from: b */
    public boolean f5115b = false;

    /* renamed from: c */
    public SmoothImageView f5116c;

    /* renamed from: d */
    public View f5117d;

    /* renamed from: e */
    public MaterialProgressBar f5118e;

    /* renamed from: f */
    public InterfaceC6629c f5119f;

    /* renamed from: g */
    public ImageView f5120g;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC5909a implements View.OnClickListener {
        public ViewOnClickListenerC5909a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM4781d = BasePhotoFragment.this.f5114a.m4781d();
            if (strM4781d == null || strM4781d.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m4814n(BasePhotoFragment.this, strM4781d);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C5910b implements InterfaceC6629c {
        public C5910b() {
        }

        @Override // p090k2.InterfaceC6629c
        /* renamed from: b */
        public void mo4793b(Drawable drawable) {
            BasePhotoFragment.this.f5118e.setVisibility(8);
            BasePhotoFragment.this.f5120g.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f5116c.setImageDrawable(drawable);
            }
        }

        @Override // p090k2.InterfaceC6629c
        /* renamed from: c */
        public void mo4794c() {
            BasePhotoFragment.this.f5118e.setVisibility(8);
            String strM4781d = BasePhotoFragment.this.f5114a.m4781d();
            if (strM4781d == null || strM4781d.isEmpty()) {
                BasePhotoFragment.this.f5120g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f5120g.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f5120g).alpha(1.0f).setDuration(1000L).start();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C5911c implements ViewOnTouchListenerC5908c.i {
        public C5911c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c.i
        /* renamed from: a */
        public void mo4780a(View view, float f6, float f7) {
            if (BasePhotoFragment.this.f5116c.m4831j()) {
                BasePhotoFragment.this.m4787o();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C5912d implements ViewOnTouchListenerC5908c.f {
        public C5912d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c.f
        /* renamed from: a */
        public void mo4778a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c.f
        /* renamed from: b */
        public void mo4779b(View view, float f6, float f7) {
            if (BasePhotoFragment.this.f5116c.m4831j()) {
                BasePhotoFragment.this.m4787o();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C5913e implements SmoothImageView.InterfaceC5928g {
        public C5913e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC5928g
        /* renamed from: a */
        public void mo4795a(int i6) {
            String strM4781d;
            if (i6 != 255 || (strM4781d = BasePhotoFragment.this.f5114a.m4781d()) == null || strM4781d.isEmpty()) {
                BasePhotoFragment.this.f5120g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f5120g.setVisibility(0);
            }
            BasePhotoFragment.this.f5117d.setBackgroundColor(BasePhotoFragment.m4784i(i6 / 255.0f, ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C5914f implements SmoothImageView.InterfaceC5929h {
        public C5914f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC5929h
        /* renamed from: a */
        public void mo4796a() {
            BasePhotoFragment.this.m4787o();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C5915g implements SmoothImageView.InterfaceC5931j {
        public C5915g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC5931j
        /* renamed from: a */
        public void mo4797a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f5117d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* renamed from: i */
    public static int m4784i(float f6, int i6) {
        return (Math.min(255, Math.max(0, (int) (f6 * 255.0f))) << 24) + (i6 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: j */
    private void m4785j() {
        boolean z6;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f5118e.setSupportIndeterminateTintList(AbstractC5857e.m4363d(getContext(), arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z6 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f5114a = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f5116c.m4836o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f5116c.setThumbRect(this.f5114a.getBounds());
            this.f5117d.setTag(this.f5114a.getUrl());
            this.f5115b = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f5114a.getUrl().toLowerCase().contains(".gif")) {
                this.f5116c.setZoomable(false);
                C6584a.m7476e().mo7479c(this, this.f5114a.getUrl(), this.f5116c, this.f5119f);
            } else {
                C6584a.m7476e().mo7480d(this, this.f5114a.getUrl(), this.f5116c, this.f5119f);
            }
        } else {
            z6 = true;
        }
        if (this.f5115b) {
            this.f5116c.setMinimumScale(0.7f);
        } else {
            this.f5117d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z6) {
            this.f5116c.setOnViewTapListener(new C5911c());
        } else {
            this.f5116c.setOnPhotoTapListener(new C5912d());
        }
        this.f5116c.setAlphaChangeListener(new C5913e());
        this.f5116c.setTransformOutListener(new C5914f());
    }

    /* renamed from: l */
    public static BasePhotoFragment m4786l(Class cls, IPreviewInfo iPreviewInfo, boolean z6, boolean z7, boolean z8, float f6, int i6) {
        BasePhotoFragment basePhotoFragment;
        try {
            basePhotoFragment = (BasePhotoFragment) cls.newInstance();
        } catch (Exception unused) {
            basePhotoFragment = new BasePhotoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", iPreviewInfo);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z6);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z7);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", z8);
        bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", f6);
        bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", i6);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m4787o() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m4811y();
        }
    }

    /* renamed from: h */
    public void m4788h(int i6) {
        ViewCompat.animate(this.f5120g).alpha(0.0f).setDuration(500L).start();
        this.f5117d.setBackgroundColor(i6);
    }

    /* renamed from: k */
    public final void m4789k(View view) {
        this.f5118e = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f5116c = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f5120g = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f5117d = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f5116c.setDrawingCacheEnabled(false);
        this.f5120g.setOnClickListener(new ViewOnClickListenerC5909a());
        this.f5119f = new C5910b();
    }

    /* renamed from: m */
    public void m4790m() {
        this.f5119f = null;
        SmoothImageView smoothImageView = this.f5116c;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f5116c.setOnViewTapListener(null);
            this.f5116c.setOnPhotoTapListener(null);
            this.f5116c.setAlphaChangeListener(null);
            this.f5116c.setTransformOutListener(null);
            this.f5116c.m4838q(null);
            this.f5116c.m4839r(null);
            this.f5116c.setOnLongClickListener(null);
            this.f5120g.setOnClickListener(null);
            this.f5116c = null;
            this.f5117d = null;
            this.f5115b = false;
        }
    }

    /* renamed from: n */
    public void m4791n() {
        this.f5116c.m4838q(new C5915g());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C6584a.m7476e().mo7477a(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m4790m();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C6584a.m7476e().mo7478b(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m4789k(view);
        m4785j();
    }

    /* renamed from: p */
    public void m4792p(SmoothImageView.InterfaceC5931j interfaceC5931j) {
        this.f5116c.m4839r(interfaceC5931j);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
    }
}

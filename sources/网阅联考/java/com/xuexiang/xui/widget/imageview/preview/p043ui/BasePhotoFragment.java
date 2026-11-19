package com.xuexiang.xui.widget.imageview.preview.p043ui;

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
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import p002a1.InterfaceC0008c;
import p147z0.C4705a;

/* loaded from: classes2.dex */
public class BasePhotoFragment extends Fragment {

    /* renamed from: h */
    public static final /* synthetic */ int f3592h = 0;

    /* renamed from: a */
    public IPreviewInfo f3593a;

    /* renamed from: b */
    public boolean f3594b = false;

    /* renamed from: c */
    public SmoothImageView f3595c;

    /* renamed from: d */
    public View f3596d;

    /* renamed from: e */
    public MaterialProgressBar f3597e;

    /* renamed from: f */
    public InterfaceC0008c f3598f;

    /* renamed from: g */
    public ImageView f3599g;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$a */
    public class ViewOnClickListenerC3570a implements View.OnClickListener {
        public ViewOnClickListenerC3570a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String strM4405c = BasePhotoFragment.this.f3593a.m4405c();
            if (strM4405c == null || strM4405c.isEmpty()) {
                return;
            }
            VideoPlayerActivity.m4435k(BasePhotoFragment.this, strM4405c);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$b */
    public class C3571b implements InterfaceC0008c {
        public C3571b() {
        }

        @Override // p002a1.InterfaceC0008c
        /* renamed from: a */
        public void mo16a(Drawable drawable) {
            BasePhotoFragment.this.f3597e.setVisibility(8);
            BasePhotoFragment.this.f3599g.setVisibility(8);
            if (drawable != null) {
                BasePhotoFragment.this.f3595c.setImageDrawable(drawable);
            }
        }

        @Override // p002a1.InterfaceC0008c
        /* renamed from: b */
        public void mo17b() {
            BasePhotoFragment.this.f3597e.setVisibility(8);
            String strM4405c = BasePhotoFragment.this.f3593a.m4405c();
            if (strM4405c == null || strM4405c.isEmpty()) {
                BasePhotoFragment.this.f3599g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f3599g.setVisibility(0);
                ViewCompat.animate(BasePhotoFragment.this.f3599g).alpha(1.0f).setDuration(1000L).start();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$c */
    public class C3572c implements ViewOnTouchListenerC3569c.i {
        public C3572c() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c.i
        /* renamed from: a */
        public void mo4403a(View view, float f4, float f5) {
            if (BasePhotoFragment.this.f3595c.m4453j()) {
                BasePhotoFragment.this.m4415j();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$d */
    public class C3573d implements ViewOnTouchListenerC3569c.f {
        public C3573d() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c.f
        /* renamed from: a */
        public void mo4401a(View view, float f4, float f5) {
            if (BasePhotoFragment.this.f3595c.m4453j()) {
                BasePhotoFragment.this.m4415j();
            }
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c.f
        /* renamed from: b */
        public void mo4402b() {
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$e */
    public class C3574e implements SmoothImageView.InterfaceC3589g {
        public C3574e() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC3589g
        /* renamed from: a */
        public void mo4417a(int i4) {
            String strM4405c;
            if (i4 != 255 || (strM4405c = BasePhotoFragment.this.f3593a.m4405c()) == null || strM4405c.isEmpty()) {
                BasePhotoFragment.this.f3599g.setVisibility(8);
            } else {
                BasePhotoFragment.this.f3599g.setVisibility(0);
            }
            BasePhotoFragment.this.f3596d.setBackgroundColor(BasePhotoFragment.m4408d(i4 / 255.0f, ViewCompat.MEASURED_STATE_MASK));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$f */
    public class C3575f implements SmoothImageView.InterfaceC3590h {
        public C3575f() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC3590h
        /* renamed from: a */
        public void mo4418a() {
            BasePhotoFragment.this.m4415j();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.ui.BasePhotoFragment$g */
    public class C3576g implements SmoothImageView.InterfaceC3592j {
        public C3576g() {
        }

        @Override // com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.InterfaceC3592j
        /* renamed from: a */
        public void mo4419a(SmoothImageView.Status status) {
            BasePhotoFragment.this.f3596d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* renamed from: d */
    public static int m4408d(float f4, int i4) {
        return (Math.min(255, Math.max(0, (int) (f4 * 255.0f))) << 24) + (i4 & ViewCompat.MEASURED_SIZE_MASK);
    }

    /* renamed from: g */
    public static BasePhotoFragment m4409g(Class cls, IPreviewInfo iPreviewInfo, boolean z3, boolean z4, boolean z5, float f4, int i4) {
        BasePhotoFragment basePhotoFragment;
        try {
            basePhotoFragment = (BasePhotoFragment) cls.newInstance();
        } catch (Exception unused) {
            basePhotoFragment = new BasePhotoFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM", iPreviewInfo);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", z3);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING", z4);
        bundle.putBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG", z5);
        bundle.putFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY", f4);
        bundle.putInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", i4);
        basePhotoFragment.setArguments(bundle);
        return basePhotoFragment;
    }

    /* renamed from: c */
    public void m4410c(int i4) {
        ViewCompat.animate(this.f3599g).alpha(0.0f).setDuration(500L).start();
        this.f3596d.setBackgroundColor(i4);
    }

    /* renamed from: e */
    public final void m4411e() {
        boolean z3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f3597e.setSupportIndeterminateTintList(AbstractC3530e.m4062c(arguments.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", R$color.xui_config_color_main_theme)));
            z3 = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f3593a = (IPreviewInfo) arguments.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            this.f3595c.m4458o(arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG"), arguments.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"));
            this.f3595c.setThumbRect(this.f3593a.getBounds());
            this.f3596d.setTag(this.f3593a.m4404a());
            this.f3594b = arguments.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f3593a.m4404a().toLowerCase().contains(".gif")) {
                this.f3595c.setZoomable(false);
                C4705a.m6708e().mo11d(this, this.f3593a.m4404a(), this.f3595c, this.f3598f);
            } else {
                C4705a.m6708e().mo8a(this, this.f3593a.m4404a(), this.f3595c, this.f3598f);
            }
        } else {
            z3 = true;
        }
        if (this.f3594b) {
            this.f3595c.setMinimumScale(0.7f);
        } else {
            this.f3596d.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z3) {
            this.f3595c.setOnViewTapListener(new C3572c());
        } else {
            this.f3595c.setOnPhotoTapListener(new C3573d());
        }
        this.f3595c.setAlphaChangeListener(new C3574e());
        this.f3595c.setTransformOutListener(new C3575f());
    }

    /* renamed from: f */
    public final void m4412f(View view) {
        this.f3597e = (MaterialProgressBar) view.findViewById(R$id.loading);
        this.f3595c = (SmoothImageView) view.findViewById(R$id.photoView);
        this.f3599g = (ImageView) view.findViewById(R$id.btnVideo);
        View viewFindViewById = view.findViewById(R$id.rootView);
        this.f3596d = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f3595c.setDrawingCacheEnabled(false);
        this.f3599g.setOnClickListener(new ViewOnClickListenerC3570a());
        this.f3598f = new C3571b();
    }

    /* renamed from: h */
    public void m4413h() {
        this.f3598f = null;
        SmoothImageView smoothImageView = this.f3595c;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f3595c.setOnViewTapListener(null);
            this.f3595c.setOnPhotoTapListener(null);
            this.f3595c.setAlphaChangeListener(null);
            this.f3595c.setTransformOutListener(null);
            this.f3595c.m4460q(null);
            this.f3595c.m4461r(null);
            this.f3595c.setOnLongClickListener(null);
            this.f3599g.setOnClickListener(null);
            this.f3595c = null;
            this.f3596d = null;
            this.f3594b = false;
        }
    }

    /* renamed from: i */
    public void m4414i() {
        this.f3595c.m4460q(new C3576g());
    }

    /* renamed from: j */
    public final void m4415j() {
        PreviewActivity previewActivity = (PreviewActivity) getActivity();
        if (previewActivity != null) {
            previewActivity.m4433v();
        }
    }

    /* renamed from: k */
    public void m4416k(SmoothImageView.InterfaceC3592j interfaceC3592j) {
        this.f3595c.m4461r(interfaceC3592j);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C4705a.m6708e().mo9b(getActivity());
        if (getActivity() != null) {
            getActivity().isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m4413h();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C4705a.m6708e().mo10c(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m4412f(view);
        m4411e();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
    }
}

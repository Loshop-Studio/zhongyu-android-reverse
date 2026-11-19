package p070b.p113c.p114a.p116e.p128f.p133c.p136e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xuexiang.xui.widget.imageview.preview.p159ui.PreviewActivity;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.p116e.p128f.p133c.C0829a;
import p070b.p113c.p114a.p116e.p128f.p133c.p134c.InterfaceC0831a;
import p070b.p113c.p114a.p116e.p128f.p133c.p135d.InterfaceC0834c;

/* renamed from: b.c.a.e.f.c.e.h */
/* loaded from: classes.dex */
public class C0842h extends ComponentCallbacksC0320m {

    /* renamed from: c0 */
    public static final /* synthetic */ int f4619c0 = 0;

    /* renamed from: V */
    public InterfaceC0831a f4620V;

    /* renamed from: W */
    public boolean f4621W = false;

    /* renamed from: X */
    public SmoothImageView f4622X;

    /* renamed from: Y */
    public View f4623Y;

    /* renamed from: Z */
    public MaterialProgressBar f4624Z;

    /* renamed from: a0 */
    public InterfaceC0834c f4625a0;

    /* renamed from: b0 */
    public ImageView f4626b0;

    /* renamed from: x0 */
    public static void m2557x0(C0842h c0842h) {
        PreviewActivity previewActivity = (PreviewActivity) c0842h.m1158h();
        if (previewActivity != null) {
            previewActivity.m2761x();
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: P */
    public View mo1143P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1088R.layout.preview_fragment_image_photo, viewGroup, false);
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: Q */
    public void mo1144Q() {
        this.f1961E = true;
        C0829a c0829aM2547e = C0829a.m2547e();
        c0829aM2547e.f4608a.mo2549b(m1158h());
        if (m1158h() != null) {
            m1158h().isFinishing();
        }
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: R */
    public void mo1115R() {
        this.f4625a0 = null;
        SmoothImageView smoothImageView = this.f4622X;
        if (smoothImageView != null) {
            smoothImageView.setImageBitmap(null);
            this.f4622X.setOnViewTapListener(null);
            this.f4622X.setOnPhotoTapListener(null);
            this.f4622X.setAlphaChangeListener(null);
            this.f4622X.setTransformOutListener(null);
            SmoothImageView smoothImageView2 = this.f4622X;
            smoothImageView2.setOnTransformListener(null);
            smoothImageView2.f5282m = true;
            smoothImageView2.f5275f = SmoothImageView.EnumC0974g.STATE_IN;
            smoothImageView2.invalidate();
            this.f4622X.m2772i(null);
            this.f4622X.setOnLongClickListener(null);
            this.f4626b0.setOnClickListener(null);
            this.f4622X = null;
            this.f4623Y = null;
            this.f4621W = false;
        }
        this.f1961E = true;
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: d0 */
    public void mo1121d0() {
        C0829a.m2547e().f4608a.mo2548a(this);
        this.f1961E = true;
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: e0 */
    public void mo1155e0(View view, Bundle bundle) {
        this.f4624Z = (MaterialProgressBar) view.findViewById(C1088R.id.loading);
        this.f4622X = (SmoothImageView) view.findViewById(C1088R.id.photoView);
        this.f4626b0 = (ImageView) view.findViewById(C1088R.id.btnVideo);
        View viewFindViewById = view.findViewById(C1088R.id.rootView);
        this.f4623Y = viewFindViewById;
        viewFindViewById.setDrawingCacheEnabled(false);
        this.f4622X.setDrawingCacheEnabled(false);
        this.f4626b0.setOnClickListener(new ViewOnClickListenerC0835a(this));
        this.f4625a0 = new C0836b(this);
        Bundle bundle2 = this.f1983h;
        boolean z = true;
        if (bundle2 != null) {
            this.f4624Z.setSupportIndeterminateTintList(C0787a.m2482p().getColorStateList(bundle2.getInt("com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR", C1088R.color.xui_config_color_main_theme)));
            z = bundle2.getBoolean("com.xuexiang.xui.widget.preview.KEY_SING_FILING");
            this.f4620V = (InterfaceC0831a) bundle2.getParcelable("com.xuexiang.xui.widget.preview.KEY_PREVIEW_ITEM");
            SmoothImageView smoothImageView = this.f4622X;
            boolean z2 = bundle2.getBoolean("com.xuexiang.xui.widget.preview.KEY_DRAG");
            float f2 = bundle2.getFloat("com.xuexiang.xui.widget.preview.KEY_SENSITIVITY");
            smoothImageView.f5285p = z2;
            smoothImageView.f5287r = f2;
            this.f4622X.setThumbRect(this.f4620V.m2553f());
            this.f4623Y.setTag(this.f4620V.m2552c());
            this.f4621W = bundle2.getBoolean("com.xuexiang.xui.widget.preview.KEY_TRANS_PHOTO", false);
            if (this.f4620V.m2552c().toLowerCase().contains(".gif")) {
                this.f4622X.setZoomable(false);
                C0829a c0829aM2547e = C0829a.m2547e();
                c0829aM2547e.f4608a.mo2551d(this, this.f4620V.m2552c(), this.f4622X, this.f4625a0);
            } else {
                C0829a c0829aM2547e2 = C0829a.m2547e();
                c0829aM2547e2.f4608a.mo2550c(this, this.f4620V.m2552c(), this.f4622X, this.f4625a0);
            }
        }
        if (this.f4621W) {
            this.f4622X.setMinimumScale(0.7f);
        } else {
            this.f4623Y.setBackgroundColor(-16777216);
        }
        SmoothImageView smoothImageView2 = this.f4622X;
        if (z) {
            smoothImageView2.setOnViewTapListener(new C0837c(this));
        } else {
            smoothImageView2.setOnPhotoTapListener(new C0838d(this));
        }
        this.f4622X.setAlphaChangeListener(new C0839e(this));
        this.f4622X.setTransformOutListener(new C0840f(this));
    }

    @Override // p000a.p052k.p053b.ComponentCallbacksC0320m
    /* renamed from: v0 */
    public void mo1187v0(boolean z) {
        super.mo1187v0(z);
    }
}

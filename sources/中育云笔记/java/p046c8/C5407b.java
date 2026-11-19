package p046c8;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC8041g;
import java.lang.ref.WeakReference;

/* renamed from: c8.b */
/* loaded from: classes5.dex */
public class C5407b implements InterfaceC5406a {

    /* renamed from: a */
    public WeakReference f3450a;

    /* renamed from: b */
    public boolean f3451b;

    /* renamed from: c */
    public boolean f3452c;

    /* renamed from: d */
    public float f3453d = 1.0f;

    /* renamed from: e */
    public float f3454e;

    /* renamed from: f */
    public float f3455f;

    public C5407b(View view) {
        this.f3450a = new WeakReference(view);
        this.f3451b = AbstractC8041g.m12216c(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f3452c = AbstractC8041g.m12216c(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f3454e = AbstractC8041g.m12224k(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f3455f = AbstractC8041g.m12224k(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p046c8.InterfaceC5406a
    /* renamed from: a */
    public void mo2842a(boolean z10) {
        this.f3451b = z10;
    }

    @Override // p046c8.InterfaceC5406a
    /* renamed from: b */
    public void mo2843b(boolean z10) {
        this.f3452c = z10;
        View view = (View) this.f3450a.get();
        if (view != null) {
            mo2844c(view, view.isEnabled());
        }
    }

    @Override // p046c8.InterfaceC5406a
    /* renamed from: c */
    public void mo2844c(View view, boolean z10) {
        View view2 = (View) this.f3450a.get();
        if (view2 == null) {
            return;
        }
        float f10 = (!this.f3452c || z10) ? this.f3453d : this.f3455f;
        if (view != view2 && view2.isEnabled() != z10) {
            view2.setEnabled(z10);
        }
        view2.setAlpha(f10);
    }

    @Override // p046c8.InterfaceC5406a
    /* renamed from: d */
    public void mo2845d(View view, boolean z10) {
        View view2 = (View) this.f3450a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f3451b && z10 && view.isClickable()) ? this.f3454e : this.f3453d);
        } else if (this.f3452c) {
            view2.setAlpha(this.f3455f);
        }
    }
}

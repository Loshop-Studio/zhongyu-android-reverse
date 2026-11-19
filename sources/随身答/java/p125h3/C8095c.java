package p125h3;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6801g;
import java.lang.ref.WeakReference;

/* renamed from: h3.c */
/* loaded from: classes4.dex */
public class C8095c implements InterfaceC8093a {

    /* renamed from: a */
    public WeakReference f13798a;

    /* renamed from: b */
    public boolean f13799b;

    /* renamed from: c */
    public boolean f13800c;

    /* renamed from: d */
    public float f13801d = 1.0f;

    /* renamed from: e */
    public float f13802e;

    /* renamed from: f */
    public float f13803f;

    public C8095c(View view) {
        this.f13798a = new WeakReference(view);
        this.f13799b = AbstractC6801g.m6478k(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f13800c = AbstractC6801g.m6478k(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f13802e = AbstractC6801g.m6485r(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f13803f = AbstractC6801g.m6485r(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p125h3.InterfaceC8093a
    /* renamed from: a */
    public void mo12928a(boolean z9) {
        this.f13799b = z9;
    }

    @Override // p125h3.InterfaceC8093a
    /* renamed from: b */
    public void mo12929b(boolean z9) {
        this.f13800c = z9;
        View view = (View) this.f13798a.get();
        if (view != null) {
            mo12930c(view, view.isEnabled());
        }
    }

    @Override // p125h3.InterfaceC8093a
    /* renamed from: c */
    public void mo12930c(View view, boolean z9) {
        View view2 = (View) this.f13798a.get();
        if (view2 == null) {
            return;
        }
        float f10 = (!this.f13800c || z9) ? this.f13801d : this.f13803f;
        if (view != view2 && view2.isEnabled() != z9) {
            view2.setEnabled(z9);
        }
        view2.setAlpha(f10);
    }

    @Override // p125h3.InterfaceC8093a
    /* renamed from: d */
    public void mo12931d(View view, boolean z9) {
        View view2 = (View) this.f13798a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f13799b && z9 && view.isClickable()) ? this.f13802e : this.f13801d);
        } else if (this.f13800c) {
            view2.setAlpha(this.f13803f);
        }
    }
}

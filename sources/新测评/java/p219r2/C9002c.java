package p219r2;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6482g;
import java.lang.ref.WeakReference;

/* renamed from: r2.c */
/* loaded from: classes4.dex */
public class C9002c implements InterfaceC9000a {

    /* renamed from: a */
    public WeakReference f15406a;

    /* renamed from: b */
    public boolean f15407b;

    /* renamed from: c */
    public boolean f15408c;

    /* renamed from: d */
    public float f15409d = 1.0f;

    /* renamed from: e */
    public float f15410e;

    /* renamed from: f */
    public float f15411f;

    public C9002c(View view) {
        this.f15406a = new WeakReference(view);
        this.f15407b = AbstractC6482g.m5381l(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f15408c = AbstractC6482g.m5381l(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f15410e = AbstractC6482g.m5388s(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f15411f = AbstractC6482g.m5388s(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p219r2.InterfaceC9000a
    /* renamed from: a */
    public void mo15145a(boolean z9) {
        this.f15407b = z9;
    }

    @Override // p219r2.InterfaceC9000a
    /* renamed from: b */
    public void mo15146b(boolean z9) {
        this.f15408c = z9;
        View view = (View) this.f15406a.get();
        if (view != null) {
            mo15147c(view, view.isEnabled());
        }
    }

    @Override // p219r2.InterfaceC9000a
    /* renamed from: c */
    public void mo15147c(View view, boolean z9) {
        View view2 = (View) this.f15406a.get();
        if (view2 == null) {
            return;
        }
        float f10 = (!this.f15408c || z9) ? this.f15409d : this.f15411f;
        if (view != view2 && view2.isEnabled() != z9) {
            view2.setEnabled(z9);
        }
        view2.setAlpha(f10);
    }

    @Override // p219r2.InterfaceC9000a
    /* renamed from: d */
    public void mo15148d(View view, boolean z9) {
        View view2 = (View) this.f15406a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f15407b && z9 && view.isClickable()) ? this.f15410e : this.f15409d);
        } else if (this.f15408c) {
            view2.setAlpha(this.f15411f);
        }
    }
}

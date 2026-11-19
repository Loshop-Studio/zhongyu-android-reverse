package p206p1;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6877g;
import java.lang.ref.WeakReference;

/* renamed from: p1.c */
/* loaded from: classes4.dex */
public class C9638c implements InterfaceC9636a {

    /* renamed from: a */
    public WeakReference f19295a;

    /* renamed from: b */
    public boolean f19296b;

    /* renamed from: c */
    public boolean f19297c;

    /* renamed from: d */
    public float f19298d = 1.0f;

    /* renamed from: e */
    public float f19299e;

    /* renamed from: f */
    public float f19300f;

    public C9638c(View view) {
        this.f19295a = new WeakReference(view);
        this.f19296b = AbstractC6877g.m6478l(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f19297c = AbstractC6877g.m6478l(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f19299e = AbstractC6877g.m6485s(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f19300f = AbstractC6877g.m6485s(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p206p1.InterfaceC9636a
    /* renamed from: a */
    public void mo18201a(boolean z10) {
        this.f19296b = z10;
    }

    @Override // p206p1.InterfaceC9636a
    /* renamed from: b */
    public void mo18202b(boolean z10) {
        this.f19297c = z10;
        View view = (View) this.f19295a.get();
        if (view != null) {
            mo18203c(view, view.isEnabled());
        }
    }

    @Override // p206p1.InterfaceC9636a
    /* renamed from: c */
    public void mo18203c(View view, boolean z10) {
        View view2 = (View) this.f19295a.get();
        if (view2 == null) {
            return;
        }
        float f10 = (!this.f19297c || z10) ? this.f19298d : this.f19300f;
        if (view != view2 && view2.isEnabled() != z10) {
            view2.setEnabled(z10);
        }
        view2.setAlpha(f10);
    }

    @Override // p206p1.InterfaceC9636a
    /* renamed from: d */
    public void mo18204d(View view, boolean z10) {
        View view2 = (View) this.f19295a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f19296b && z10 && view.isClickable()) ? this.f19299e : this.f19298d);
        } else if (this.f19297c) {
            view2.setAlpha(this.f19300f);
        }
    }
}

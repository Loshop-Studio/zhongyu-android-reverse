package p089l0;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC3531f;
import java.lang.ref.WeakReference;

/* renamed from: l0.c */
/* loaded from: classes2.dex */
public class C4336c implements InterfaceC4334a {

    /* renamed from: a */
    public WeakReference f4843a;

    /* renamed from: b */
    public boolean f4844b;

    /* renamed from: c */
    public boolean f4845c;

    /* renamed from: d */
    public float f4846d = 1.0f;

    /* renamed from: e */
    public float f4847e;

    /* renamed from: f */
    public float f4848f;

    public C4336c(View view) {
        this.f4843a = new WeakReference(view);
        this.f4844b = AbstractC3531f.m4070c(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f4845c = AbstractC3531f.m4070c(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f4847e = AbstractC3531f.m4077j(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f4848f = AbstractC3531f.m4077j(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p089l0.InterfaceC4334a
    /* renamed from: a */
    public void mo5346a(boolean z3) {
        this.f4844b = z3;
    }

    @Override // p089l0.InterfaceC4334a
    /* renamed from: b */
    public void mo5347b(boolean z3) {
        this.f4845c = z3;
        View view = (View) this.f4843a.get();
        if (view != null) {
            mo5348c(view, view.isEnabled());
        }
    }

    @Override // p089l0.InterfaceC4334a
    /* renamed from: c */
    public void mo5348c(View view, boolean z3) {
        View view2 = (View) this.f4843a.get();
        if (view2 == null) {
            return;
        }
        float f4 = (!this.f4845c || z3) ? this.f4846d : this.f4848f;
        if (view != view2 && view2.isEnabled() != z3) {
            view2.setEnabled(z3);
        }
        view2.setAlpha(f4);
    }

    @Override // p089l0.InterfaceC4334a
    /* renamed from: d */
    public void mo5349d(View view, boolean z3) {
        View view2 = (View) this.f4843a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f4844b && z3 && view.isClickable()) ? this.f4847e : this.f4846d);
        } else if (this.f4845c) {
            view2.setAlpha(this.f4848f);
        }
    }
}

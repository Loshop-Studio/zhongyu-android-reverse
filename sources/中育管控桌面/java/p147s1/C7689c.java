package p147s1;

import android.view.View;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC5859g;
import java.lang.ref.WeakReference;

/* renamed from: s1.c */
/* loaded from: classes3.dex */
public class C7689c implements InterfaceC7687a {

    /* renamed from: a */
    public WeakReference f10151a;

    /* renamed from: b */
    public boolean f10152b;

    /* renamed from: c */
    public boolean f10153c;

    /* renamed from: d */
    public float f10154d = 1.0f;

    /* renamed from: e */
    public float f10155e;

    /* renamed from: f */
    public float f10156f;

    public C7689c(View view) {
        this.f10151a = new WeakReference(view);
        this.f10152b = AbstractC5859g.m4386l(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f10153c = AbstractC5859g.m4386l(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f10155e = AbstractC5859g.m4393s(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f10156f = AbstractC5859g.m4393s(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    @Override // p147s1.InterfaceC7687a
    /* renamed from: a */
    public void mo9145a(boolean z6) {
        this.f10152b = z6;
    }

    @Override // p147s1.InterfaceC7687a
    /* renamed from: b */
    public void mo9146b(boolean z6) {
        this.f10153c = z6;
        View view = (View) this.f10151a.get();
        if (view != null) {
            mo9147c(view, view.isEnabled());
        }
    }

    @Override // p147s1.InterfaceC7687a
    /* renamed from: c */
    public void mo9147c(View view, boolean z6) {
        View view2 = (View) this.f10151a.get();
        if (view2 == null) {
            return;
        }
        float f6 = (!this.f10153c || z6) ? this.f10154d : this.f10156f;
        if (view != view2 && view2.isEnabled() != z6) {
            view2.setEnabled(z6);
        }
        view2.setAlpha(f6);
    }

    @Override // p147s1.InterfaceC7687a
    /* renamed from: d */
    public void mo9148d(View view, boolean z6) {
        View view2 = (View) this.f10151a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f10152b && z6 && view.isClickable()) ? this.f10155e : this.f10154d);
        } else if (this.f10153c) {
            view2.setAlpha(this.f10156f);
        }
    }
}

package p070b.p113c.p114a.p116e.p117a;

import android.view.View;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import p070b.p113c.p114a.C0787a;

/* renamed from: b.c.a.e.a.c */
/* loaded from: classes.dex */
public class C0793c implements InterfaceC0791a {

    /* renamed from: a */
    public WeakReference<View> f4460a;

    /* renamed from: b */
    public boolean f4461b;

    /* renamed from: c */
    public boolean f4462c;

    /* renamed from: d */
    public float f4463d;

    /* renamed from: e */
    public float f4464e;

    public C0793c(View view) {
        this.f4460a = new WeakReference<>(view);
        this.f4461b = C0787a.m2492z(view.getContext(), C1088R.attr.xui_switch_alpha_pressed, true);
        this.f4462c = C0787a.m2492z(view.getContext(), C1088R.attr.xui_switch_alpha_disabled, true);
        this.f4463d = C0787a.m2464D(view.getContext(), C1088R.attr.xui_alpha_pressed, 0.5f);
        this.f4464e = C0787a.m2464D(view.getContext(), C1088R.attr.xui_alpha_disabled, 0.5f);
    }

    /* renamed from: a */
    public void m2494a(View view, boolean z) {
        View view2 = this.f4460a.get();
        if (view2 == null) {
            return;
        }
        float f2 = 1.0f;
        if (this.f4462c && !z) {
            f2 = this.f4464e;
        }
        if (view != view2 && view2.isEnabled() != z) {
            view2.setEnabled(z);
        }
        view2.setAlpha(f2);
    }

    /* renamed from: b */
    public void m2495b(View view, boolean z) {
        float f2;
        View view2 = this.f4460a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            f2 = (this.f4461b && z && view.isClickable()) ? this.f4463d : 1.0f;
        } else if (!this.f4462c) {
            return;
        } else {
            f2 = this.f4464e;
        }
        view2.setAlpha(f2);
    }

    /* renamed from: c */
    public void m2496c(boolean z) {
        this.f4462c = z;
        View view = this.f4460a.get();
        if (view != null) {
            m2494a(view, view.isEnabled());
        }
    }
}

package p196x1;

import android.view.View;
import com.xuexiang.xui.R$attr;
import java.lang.ref.WeakReference;
import kotlin.collections.AbstractC5806u;

/* renamed from: x1.b */
/* loaded from: classes3.dex */
public final class C6742b implements InterfaceC6741a {

    /* renamed from: a */
    public final WeakReference f11401a;

    /* renamed from: b */
    public boolean f11402b;

    /* renamed from: c */
    public boolean f11403c;

    /* renamed from: d */
    public final float f11404d;

    /* renamed from: e */
    public final float f11405e;

    public C6742b(View view) {
        this.f11401a = new WeakReference(view);
        this.f11402b = AbstractC5806u.m5251E(view.getContext(), R$attr.xui_switch_alpha_pressed, true);
        this.f11403c = AbstractC5806u.m5251E(view.getContext(), R$attr.xui_switch_alpha_disabled, true);
        this.f11404d = AbstractC5806u.m5254H(view.getContext(), R$attr.xui_alpha_pressed, 0.5f);
        this.f11405e = AbstractC5806u.m5254H(view.getContext(), R$attr.xui_alpha_disabled, 0.5f);
    }

    /* renamed from: a */
    public final void m6427a(View view, boolean z8) {
        View view2 = (View) this.f11401a.get();
        if (view2 == null) {
            return;
        }
        float f = 1.0f;
        if (this.f11403c && !z8) {
            f = this.f11405e;
        }
        if (view != view2 && view2.isEnabled() != z8) {
            view2.setEnabled(z8);
        }
        view2.setAlpha(f);
    }

    /* renamed from: b */
    public final void m6428b(View view, boolean z8) {
        View view2 = (View) this.f11401a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            view2.setAlpha((this.f11402b && z8 && view.isClickable()) ? this.f11404d : 1.0f);
        } else if (this.f11403c) {
            view2.setAlpha(this.f11405e);
        }
    }

    /* renamed from: c */
    public final void m6429c(boolean z8) {
        this.f11403c = z8;
        View view = (View) this.f11401a.get();
        if (view != null) {
            m6427a(view, view.isEnabled());
        }
    }
}

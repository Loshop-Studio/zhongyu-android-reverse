package p000a.p005b.p006c;

import android.view.View;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;

/* renamed from: a.b.c.n */
/* loaded from: classes.dex */
public class C0028n extends C0275x {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0024j f153a;

    public C0028n(LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j) {
        this.f153a = layoutInflaterFactory2C0024j;
    }

    @Override // p000a.p031h.p043j.InterfaceC0274w
    /* renamed from: a */
    public void mo88a(View view) {
        this.f153a.f106p.setAlpha(1.0f);
        this.f153a.f109s.m889d(null);
        this.f153a.f109s = null;
    }

    @Override // p000a.p031h.p043j.C0275x, p000a.p031h.p043j.InterfaceC0274w
    /* renamed from: b */
    public void mo97b(View view) {
        this.f153a.f106p.setVisibility(0);
        this.f153a.f106p.sendAccessibilityEvent(32);
        if (this.f153a.f106p.getParent() instanceof View) {
            View view2 = (View) this.f153a.f106p.getParent();
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view2.requestApplyInsets();
        }
    }
}

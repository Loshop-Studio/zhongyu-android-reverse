package p000a.p005b.p006c;

import android.view.View;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;

/* renamed from: a.b.c.m */
/* loaded from: classes.dex */
public class RunnableC0027m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0024j f151b;

    /* renamed from: a.b.c.m$a */
    public class a extends C0275x {
        public a() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            RunnableC0027m.this.f151b.f106p.setAlpha(1.0f);
            RunnableC0027m.this.f151b.f109s.m889d(null);
            RunnableC0027m.this.f151b.f109s = null;
        }

        @Override // p000a.p031h.p043j.C0275x, p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: b */
        public void mo97b(View view) {
            RunnableC0027m.this.f151b.f106p.setVisibility(0);
        }
    }

    public RunnableC0027m(LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j) {
        this.f151b = layoutInflaterFactory2C0024j;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j = this.f151b;
        layoutInflaterFactory2C0024j.f107q.showAtLocation(layoutInflaterFactory2C0024j.f106p, 55, 0, 0);
        this.f151b.m63I();
        if (!this.f151b.m76V()) {
            this.f151b.f106p.setAlpha(1.0f);
            this.f151b.f106p.setVisibility(0);
            return;
        }
        this.f151b.f106p.setAlpha(0.0f);
        LayoutInflaterFactory2C0024j layoutInflaterFactory2C0024j2 = this.f151b;
        C0273v c0273vM862a = C0266o.m862a(layoutInflaterFactory2C0024j2.f106p);
        c0273vM862a.m886a(1.0f);
        layoutInflaterFactory2C0024j2.f109s = c0273vM862a;
        C0273v c0273v = this.f151b.f109s;
        a aVar = new a();
        View view = c0273v.f1632a.get();
        if (view != null) {
            c0273v.m890e(view, aVar);
        }
    }
}

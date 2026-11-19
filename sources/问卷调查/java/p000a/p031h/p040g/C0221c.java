package p000a.p031h.p040g;

import android.os.Handler;
import p000a.p031h.p040g.C0228j;

/* renamed from: a.h.g.c */
/* loaded from: classes.dex */
public class C0221c {

    /* renamed from: a */
    public final C0231m f1488a;

    /* renamed from: b */
    public final Handler f1489b;

    public C0221c(C0231m c0231m, Handler handler) {
        this.f1488a = c0231m;
        this.f1489b = handler;
    }

    /* renamed from: a */
    public void m791a(C0228j.a aVar) {
        int i = aVar.f1511b;
        if (!(i == 0)) {
            this.f1489b.post(new RunnableC0220b(this, this.f1488a, i));
        } else {
            this.f1489b.post(new RunnableC0219a(this, this.f1488a, aVar.f1510a));
        }
    }
}

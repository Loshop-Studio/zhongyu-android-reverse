package p000a.p031h.p040g;

import p000a.p031h.p033c.p034b.C0200h;
import p000a.p031h.p035d.C0205d;

/* renamed from: a.h.g.b */
/* loaded from: classes.dex */
public class RunnableC0220b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0231m f1486b;

    /* renamed from: c */
    public final /* synthetic */ int f1487c;

    public RunnableC0220b(C0221c c0221c, C0231m c0231m, int i) {
        this.f1486b = c0231m;
        this.f1487c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0231m c0231m = this.f1486b;
        int i = this.f1487c;
        C0200h.a aVar = ((C0205d.a) c0231m).f1462a;
        if (aVar != null) {
            aVar.mo411d(i);
        }
    }
}

package p000a.p031h.p040g;

import android.graphics.Typeface;
import p000a.p031h.p033c.p034b.C0200h;
import p000a.p031h.p035d.C0205d;

/* renamed from: a.h.g.a */
/* loaded from: classes.dex */
public class RunnableC0219a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0231m f1484b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f1485c;

    public RunnableC0219a(C0221c c0221c, C0231m c0231m, Typeface typeface) {
        this.f1484b = c0231m;
        this.f1485c = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0231m c0231m = this.f1484b;
        Typeface typeface = this.f1485c;
        C0200h.a aVar = ((C0205d.a) c0231m).f1462a;
        if (aVar != null) {
            aVar.mo412e(typeface);
        }
    }
}

package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

/* renamed from: anet.channel.request.b */
/* loaded from: classes3.dex */
public class C5034b implements Cancelable {
    public static final C5034b NULL = new C5034b(null, null);

    /* renamed from: a */
    private final Future<?> f2537a;

    /* renamed from: b */
    private final String f2538b;

    public C5034b(Future<?> future, String str) {
        this.f2537a = future;
        this.f2538b = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f2537a != null) {
            ALog.m2530i("awcn.FutureCancelable", "cancel request", this.f2538b, new Object[0]);
            this.f2537a.cancel(true);
        }
    }
}

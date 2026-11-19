package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

/* renamed from: anet.channel.request.b */
/* loaded from: classes.dex */
public class C0911b implements Cancelable {
    public static final C0911b NULL = new C0911b(null, null);

    /* renamed from: a */
    private final Future<?> f5259a;

    /* renamed from: b */
    private final String f5260b;

    public C0911b(Future<?> future, String str) {
        this.f5259a = future;
        this.f5260b = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f5259a != null) {
            ALog.m4639i("awcn.FutureCancelable", "cancel request", this.f5260b, new Object[0]);
            this.f5259a.cancel(true);
        }
    }
}

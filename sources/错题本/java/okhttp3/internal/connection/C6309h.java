package okhttp3.internal.connection;

import okio.AsyncTimeout;

/* renamed from: okhttp3.internal.connection.h */
/* loaded from: classes4.dex */
public final class C6309h extends AsyncTimeout {

    /* renamed from: a */
    public final /* synthetic */ C6310i f10148a;

    public C6309h(C6310i c6310i) {
        this.f10148a = c6310i;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        this.f10148a.cancel();
    }
}

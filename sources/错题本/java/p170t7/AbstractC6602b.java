package p170t7;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Source;
import okio.Timeout;

/* renamed from: t7.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6602b implements Source {

    /* renamed from: a */
    public final ForwardingTimeout f11019a;

    /* renamed from: b */
    public boolean f11020b;

    /* renamed from: c */
    public final /* synthetic */ C6607g f11021c;

    public AbstractC6602b(C6607g c6607g) {
        this.f11021c = c6607g;
        this.f11019a = new ForwardingTimeout(c6607g.f11034c.getThis$0());
    }

    /* renamed from: a */
    public final void m6250a() {
        C6607g c6607g = this.f11021c;
        int i = c6607g.f11036e;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C6607g.m6251i(c6607g, this.f11019a);
            c6607g.f11036e = 6;
        } else {
            throw new IllegalStateException("state: " + c6607g.f11036e);
        }
    }

    @Override // okio.Source
    public long read(Buffer sink, long j7) throws IOException {
        C6607g c6607g = this.f11021c;
        AbstractC5830k.m5330g(sink, "sink");
        try {
            return c6607g.f11034c.read(sink, j7);
        } catch (IOException e) {
            c6607g.f11033b.m5930k();
            m6250a();
            throw e;
        }
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getThis$0() {
        return this.f11019a;
    }
}

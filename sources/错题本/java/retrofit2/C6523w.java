package retrofit2;

import okhttp3.AbstractC6323m0;
import okhttp3.C6333u;
import okio.BufferedSource;

/* renamed from: retrofit2.w */
/* loaded from: classes4.dex */
public final class C6523w extends AbstractC6323m0 {

    /* renamed from: a */
    public final C6333u f10798a;

    /* renamed from: b */
    public final long f10799b;

    public C6523w(C6333u c6333u, long j7) {
        this.f10798a = c6333u;
        this.f10799b = j7;
    }

    @Override // okhttp3.AbstractC6323m0
    public final long contentLength() {
        return this.f10799b;
    }

    @Override // okhttp3.AbstractC6323m0
    public final C6333u contentType() {
        return this.f10798a;
    }

    @Override // okhttp3.AbstractC6323m0
    public final BufferedSource source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}

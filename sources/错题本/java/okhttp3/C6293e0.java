package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSink;

/* renamed from: okhttp3.e0 */
/* loaded from: classes4.dex */
public final class C6293e0 extends AbstractC6297g0 {

    /* renamed from: a */
    public final /* synthetic */ C6333u f10084a;

    /* renamed from: b */
    public final /* synthetic */ int f10085b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f10086c;

    /* renamed from: d */
    public final /* synthetic */ int f10087d;

    public C6293e0(C6333u c6333u, byte[] bArr, int i, int i8) {
        this.f10084a = c6333u;
        this.f10085b = i;
        this.f10086c = bArr;
        this.f10087d = i8;
    }

    @Override // okhttp3.AbstractC6297g0
    public final long contentLength() {
        return this.f10085b;
    }

    @Override // okhttp3.AbstractC6297g0
    public final C6333u contentType() {
        return this.f10084a;
    }

    @Override // okhttp3.AbstractC6297g0
    public final void writeTo(BufferedSink sink) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        sink.write(this.f10086c, this.f10087d, this.f10085b);
    }
}

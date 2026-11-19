package p115m4;

import coil3.decode.C3261b;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.AbstractC6323m0;
import okhttp3.C6333u;
import okio.BufferedSource;
import okio.Okio;

/* renamed from: m4.f */
/* loaded from: classes3.dex */
public final class C6108f extends AbstractC6323m0 {

    /* renamed from: a */
    public final /* synthetic */ int f9750a = 1;

    /* renamed from: b */
    public final AbstractC6323m0 f9751b;

    /* renamed from: c */
    public BufferedSource f9752c;

    /* renamed from: d */
    public Object f9753d;

    public C6108f(AbstractC6323m0 abstractC6323m0) {
        this.f9751b = abstractC6323m0;
        this.f9752c = Okio.buffer(new C3261b(this, abstractC6323m0.source()));
    }

    @Override // okhttp3.AbstractC6323m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f9750a) {
            case 1:
                this.f9751b.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // okhttp3.AbstractC6323m0
    public final long contentLength() {
        switch (this.f9750a) {
        }
        return this.f9751b.contentLength();
    }

    @Override // okhttp3.AbstractC6323m0
    public final C6333u contentType() {
        switch (this.f9750a) {
        }
        return this.f9751b.contentType();
    }

    @Override // okhttp3.AbstractC6323m0
    public final BufferedSource source() {
        switch (this.f9750a) {
            case 0:
                if (this.f9752c == null) {
                    this.f9752c = Okio.buffer(new C6107e(this, this.f9751b.source()));
                }
                BufferedSource bufferedSource = this.f9752c;
                AbstractC5830k.m5327d(bufferedSource);
                return bufferedSource;
            default:
                return this.f9752c;
        }
    }

    public C6108f(AbstractC6323m0 responseBody, InterfaceC6106d interfaceC6106d) {
        AbstractC5830k.m5330g(responseBody, "responseBody");
        this.f9751b = responseBody;
        this.f9753d = interfaceC6106d;
    }
}

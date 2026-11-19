package okhttp3;

import coil3.network.AbstractC3315g;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* renamed from: okhttp3.d0 */
/* loaded from: classes4.dex */
public final class C6291d0 extends AbstractC6297g0 {

    /* renamed from: a */
    public final /* synthetic */ int f10081a;

    /* renamed from: b */
    public final C6333u f10082b;

    /* renamed from: c */
    public final Object f10083c;

    public /* synthetic */ C6291d0(C6333u c6333u, Object obj, int i) {
        this.f10081a = i;
        this.f10082b = c6333u;
        this.f10083c = obj;
    }

    @Override // okhttp3.AbstractC6297g0
    public final long contentLength() {
        switch (this.f10081a) {
            case 0:
                return ((File) this.f10083c).length();
            case 1:
                return ((ByteString) this.f10083c).size();
            default:
                return ((AbstractC6297g0) this.f10083c).contentLength();
        }
    }

    @Override // okhttp3.AbstractC6297g0
    public final C6333u contentType() {
        switch (this.f10081a) {
        }
        return this.f10082b;
    }

    @Override // okhttp3.AbstractC6297g0
    public final void writeTo(BufferedSink sink) throws IOException {
        switch (this.f10081a) {
            case 0:
                AbstractC5830k.m5330g(sink, "sink");
                Source source = Okio.source((File) this.f10083c);
                try {
                    sink.writeAll(source);
                    AbstractC3315g.m2237e(source, null);
                    return;
                } finally {
                }
            case 1:
                AbstractC5830k.m5330g(sink, "sink");
                sink.write((ByteString) this.f10083c);
                return;
            default:
                ((AbstractC6297g0) this.f10083c).writeTo(sink);
                return;
        }
    }

    public C6291d0(AbstractC6297g0 abstractC6297g0, C6333u c6333u) {
        this.f10081a = 2;
        this.f10083c = abstractC6297g0;
        this.f10082b = c6333u;
    }
}

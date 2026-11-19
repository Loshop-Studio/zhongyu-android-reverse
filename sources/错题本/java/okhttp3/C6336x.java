package okhttp3;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* renamed from: okhttp3.x */
/* loaded from: classes4.dex */
public final class C6336x extends AbstractC6297g0 {

    /* renamed from: e */
    public static final C6333u f10285e;

    /* renamed from: f */
    public static final C6333u f10286f;

    /* renamed from: g */
    public static final byte[] f10287g;

    /* renamed from: h */
    public static final byte[] f10288h;

    /* renamed from: i */
    public static final byte[] f10289i;

    /* renamed from: a */
    public final ByteString f10290a;

    /* renamed from: b */
    public final List f10291b;

    /* renamed from: c */
    public final C6333u f10292c;

    /* renamed from: d */
    public long f10293d;

    static {
        Pattern pattern = C6333u.f10275d;
        f10285e = AbstractC6326o.m5956f("multipart/mixed");
        AbstractC6326o.m5956f("multipart/alternative");
        AbstractC6326o.m5956f("multipart/digest");
        AbstractC6326o.m5956f("multipart/parallel");
        f10286f = AbstractC6326o.m5956f("multipart/form-data");
        f10287g = new byte[]{58, 32};
        f10288h = new byte[]{13, 10};
        f10289i = new byte[]{45, 45};
    }

    public C6336x(ByteString boundaryByteString, C6333u type, List list) {
        AbstractC5830k.m5330g(boundaryByteString, "boundaryByteString");
        AbstractC5830k.m5330g(type, "type");
        this.f10290a = boundaryByteString;
        this.f10291b = list;
        Pattern pattern = C6333u.f10275d;
        this.f10292c = AbstractC6326o.m5956f(type + "; boundary=" + boundaryByteString.utf8());
        this.f10293d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final long m5979a(BufferedSink bufferedSink, boolean z8) throws IOException {
        Buffer buffer;
        BufferedSink buffer2;
        if (z8) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List list = this.f10291b;
        int size = list.size();
        long j7 = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f10290a;
            byte[] bArr = f10289i;
            byte[] bArr2 = f10288h;
            if (i >= size) {
                AbstractC5830k.m5327d(buffer2);
                buffer2.write(bArr);
                buffer2.write(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z8) {
                    return j7;
                }
                AbstractC5830k.m5327d(buffer);
                long size2 = buffer.size() + j7;
                buffer.clear();
                return size2;
            }
            C6335w c6335w = (C6335w) list.get(i);
            C6329q c6329q = c6335w.f10283a;
            AbstractC6297g0 abstractC6297g0 = c6335w.f10284b;
            AbstractC5830k.m5327d(buffer2);
            buffer2.write(bArr);
            buffer2.write(byteString);
            buffer2.write(bArr2);
            int size3 = c6329q.size();
            for (int i8 = 0; i8 < size3; i8++) {
                buffer2.writeUtf8(c6329q.m5963b(i8)).write(f10287g).writeUtf8(c6329q.m5966e(i8)).write(bArr2);
            }
            C6333u c6333uContentType = abstractC6297g0.contentType();
            if (c6333uContentType != null) {
                buffer2.writeUtf8("Content-Type: ").writeUtf8(c6333uContentType.f10277a).write(bArr2);
            }
            long jContentLength = abstractC6297g0.contentLength();
            if (jContentLength != -1) {
                buffer2.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(bArr2);
            } else if (z8) {
                AbstractC5830k.m5327d(buffer);
                buffer.clear();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z8) {
                j7 += jContentLength;
            } else {
                abstractC6297g0.writeTo(buffer2);
            }
            buffer2.write(bArr2);
            i++;
        }
    }

    @Override // okhttp3.AbstractC6297g0
    public final long contentLength() throws IOException {
        long j7 = this.f10293d;
        if (j7 != -1) {
            return j7;
        }
        long jM5979a = m5979a(null, true);
        this.f10293d = jM5979a;
        return jM5979a;
    }

    @Override // okhttp3.AbstractC6297g0
    public final C6333u contentType() {
        return this.f10292c;
    }

    @Override // okhttp3.AbstractC6297g0
    public final void writeTo(BufferedSink sink) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        m5979a(sink, false);
    }
}

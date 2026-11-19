package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSink;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.n */
/* loaded from: classes4.dex */
public final class C6324n extends AbstractC6297g0 {

    /* renamed from: c */
    public static final C6333u f10253c;

    /* renamed from: a */
    public final List f10254a;

    /* renamed from: b */
    public final List f10255b;

    static {
        Pattern pattern = C6333u.f10275d;
        f10253c = AbstractC6326o.m5956f("application/x-www-form-urlencoded");
    }

    public C6324n(ArrayList encodedNames, ArrayList encodedValues) {
        AbstractC5830k.m5330g(encodedNames, "encodedNames");
        AbstractC5830k.m5330g(encodedValues, "encodedValues");
        this.f10254a = AbstractC6396c.m6062v(encodedNames);
        this.f10255b = AbstractC6396c.m6062v(encodedValues);
    }

    /* renamed from: a */
    public final long m5950a(BufferedSink bufferedSink, boolean z8) throws EOFException {
        Buffer buffer;
        if (z8) {
            buffer = new Buffer();
        } else {
            AbstractC5830k.m5327d(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        List list = this.f10254a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) list.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f10255b.get(i));
        }
        if (!z8) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // okhttp3.AbstractC6297g0
    public final long contentLength() {
        return m5950a(null, true);
    }

    @Override // okhttp3.AbstractC6297g0
    public final C6333u contentType() {
        return f10253c;
    }

    @Override // okhttp3.AbstractC6297g0
    public final void writeTo(BufferedSink sink) throws EOFException {
        AbstractC5830k.m5330g(sink, "sink");
        m5950a(sink, false);
    }
}

package p183o;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* renamed from: o.b */
/* loaded from: classes3.dex */
public final class C8679b implements Sink {

    /* renamed from: a */
    public final Sink f14414a;

    /* renamed from: b */
    public final Function1 f14415b;

    /* renamed from: c */
    public boolean f14416c;

    public C8679b(Sink sink, Function1 function1) {
        this.f14414a = sink;
        this.f14415b = function1;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f14414a.close();
        } catch (IOException e10) {
            this.f14416c = true;
            this.f14415b.invoke(e10);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        try {
            this.f14414a.flush();
        } catch (IOException e10) {
            this.f14416c = true;
            this.f14415b.invoke(e10);
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.f14414a.getTimeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j10) throws EOFException {
        if (this.f14416c) {
            buffer.skip(j10);
            return;
        }
        try {
            this.f14414a.write(buffer, j10);
        } catch (IOException e10) {
            this.f14416c = true;
            this.f14415b.invoke(e10);
        }
    }
}

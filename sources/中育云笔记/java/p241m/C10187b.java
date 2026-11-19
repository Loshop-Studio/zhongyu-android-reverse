package p241m;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import p181hd.InterfaceC9540l;

/* renamed from: m.b */
/* loaded from: classes3.dex */
public final class C10187b implements Sink {

    /* renamed from: c */
    public final Sink f24232c;

    /* renamed from: d */
    public final InterfaceC9540l f24233d;

    /* renamed from: e */
    public boolean f24234e;

    public C10187b(Sink sink, InterfaceC9540l interfaceC9540l) {
        this.f24232c = sink;
        this.f24233d = interfaceC9540l;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f24232c.close();
        } catch (IOException e10) {
            this.f24234e = true;
            this.f24233d.invoke(e10);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        try {
            this.f24232c.flush();
        } catch (IOException e10) {
            this.f24234e = true;
            this.f24233d.invoke(e10);
        }
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f24232c.timeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j10) throws EOFException {
        if (this.f24234e) {
            buffer.skip(j10);
            return;
        }
        try {
            this.f24232c.write(buffer, j10);
        } catch (IOException e10) {
            this.f24234e = true;
            this.f24233d.invoke(e10);
        }
    }
}

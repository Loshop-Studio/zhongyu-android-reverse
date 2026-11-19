package p117o;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* renamed from: o.b */
/* loaded from: classes3.dex */
public final class C7487b implements Sink {

    /* renamed from: a */
    public final Sink f9666a;

    /* renamed from: b */
    public final Function1 f9667b;

    /* renamed from: c */
    public boolean f9668c;

    public C7487b(Sink sink, Function1 function1) {
        this.f9666a = sink;
        this.f9667b = function1;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f9666a.close();
        } catch (IOException e6) {
            this.f9668c = true;
            this.f9667b.invoke(e6);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        try {
            this.f9666a.flush();
        } catch (IOException e6) {
            this.f9668c = true;
            this.f9667b.invoke(e6);
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.f9666a.getTimeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j6) throws EOFException {
        if (this.f9668c) {
            buffer.skip(j6);
            return;
        }
        try {
            this.f9666a.write(buffer, j6);
        } catch (IOException e6) {
            this.f9668c = true;
            this.f9667b.invoke(e6);
        }
    }
}

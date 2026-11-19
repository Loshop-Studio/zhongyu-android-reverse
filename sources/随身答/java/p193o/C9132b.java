package p193o;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* renamed from: o.b */
/* loaded from: classes3.dex */
public final class C9132b implements Sink {

    /* renamed from: a */
    public final Sink f15371a;

    /* renamed from: b */
    public final Function1 f15372b;

    /* renamed from: c */
    public boolean f15373c;

    public C9132b(Sink sink, Function1 function1) {
        this.f15371a = sink;
        this.f15372b = function1;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f15371a.close();
        } catch (IOException e10) {
            this.f15373c = true;
            this.f15372b.invoke(e10);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        try {
            this.f15371a.flush();
        } catch (IOException e10) {
            this.f15373c = true;
            this.f15372b.invoke(e10);
        }
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f15371a.timeout();
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j9) throws EOFException {
        if (this.f15373c) {
            buffer.skip(j9);
            return;
        }
        try {
            this.f15371a.write(buffer, j9);
        } catch (IOException e10) {
            this.f15373c = true;
            this.f15372b.invoke(e10);
        }
    }
}

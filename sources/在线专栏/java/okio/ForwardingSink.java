package okio;

import java.io.IOException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class ForwardingSink implements Sink {

    @NotNull
    private final Sink delegate;

    public ForwardingSink(@NotNull Sink delegate) {
        C2769l.m9241e(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Sink m10887deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j4) throws IOException {
        C2769l.m9241e(source, "source");
        this.delegate.write(source, j4);
    }
}

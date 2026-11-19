package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.C2769l;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* loaded from: classes.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    @NotNull
    private final InterfaceC3470l<IOException, C2925r> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull Sink delegate, @NotNull InterfaceC3470l<? super IOException, C2925r> onException) {
        super(delegate);
        C2769l.m9241e(delegate, "delegate");
        C2769l.m9241e(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    @NotNull
    public final InterfaceC3470l<IOException, C2925r> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j4) throws EOFException {
        C2769l.m9241e(source, "source");
        if (this.hasErrors) {
            source.skip(j4);
            return;
        }
        try {
            super.write(source, j4);
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }
}

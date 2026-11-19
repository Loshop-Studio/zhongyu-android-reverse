package okio.internal;

import kotlin.jvm.internal.AbstractC9979u;
import okio.Pipe;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* loaded from: classes6.dex */
public final class PipeSocket implements Socket {
    private final Pipe sinkPipe;
    private final Pipe sourcePipe;

    public PipeSocket(Pipe sinkPipe, Pipe sourcePipe) {
        AbstractC9979u.m20294g(sinkPipe, "sinkPipe");
        AbstractC9979u.m20294g(sourcePipe, "sourcePipe");
        this.sinkPipe = sinkPipe;
        this.sourcePipe = sourcePipe;
    }

    @Override // okio.Socket
    public void cancel() {
        this.sourcePipe.cancel();
        this.sinkPipe.cancel();
    }

    @Override // okio.Socket
    public Sink getSink() {
        return this.sinkPipe.sink();
    }

    public final Pipe getSinkPipe() {
        return this.sinkPipe;
    }

    @Override // okio.Socket
    public Source getSource() {
        return this.sourcePipe.source();
    }

    public final Pipe getSourcePipe() {
        return this.sourcePipe;
    }
}

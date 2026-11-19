package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Pipe;
import okio.Sink;
import okio.Socket;
import okio.Source;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m13558d2 = {"Lokio/internal/PipeSocket;", "Lokio/Socket;", "sinkPipe", "Lokio/Pipe;", "sourcePipe", "<init>", "(Lokio/Pipe;Lokio/Pipe;)V", "getSinkPipe", "()Lokio/Pipe;", "getSourcePipe", "source", "Lokio/Source;", "getSource", "()Lokio/Source;", "sink", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "cancel", "", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class PipeSocket implements Socket {
    private final Pipe sinkPipe;
    private final Pipe sourcePipe;

    public PipeSocket(Pipe sinkPipe, Pipe sourcePipe) {
        Intrinsics.checkNotNullParameter(sinkPipe, "sinkPipe");
        Intrinsics.checkNotNullParameter(sourcePipe, "sourcePipe");
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

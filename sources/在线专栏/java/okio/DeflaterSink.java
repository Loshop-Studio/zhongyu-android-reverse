package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.C2769l;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(@NotNull BufferedSink sink, @NotNull Deflater deflater) {
        C2769l.m9241e(sink, "sink");
        C2769l.m9241e(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    @IgnoreJRERequirement
    private final void deflate(boolean z3) throws IOException {
        Segment segmentWritableSegment$okio;
        int iDeflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            if (z3) {
                Deflater deflater = this.deflater;
                byte[] bArr = segmentWritableSegment$okio.data;
                int i4 = segmentWritableSegment$okio.limit;
                iDeflate = deflater.deflate(bArr, i4, 8192 - i4, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = segmentWritableSegment$okio.data;
                int i5 = segmentWritableSegment$okio.limit;
                iDeflate = deflater2.deflate(bArr2, i5, 8192 - i5);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$okio.limit += iDeflate;
                buffer.setSize$okio(buffer.size() + iDeflate);
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        Throwable th = null;
        try {
            finishDeflate$okio();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j4) throws IOException {
        C2769l.m9241e(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j4);
        while (j4 > 0) {
            Segment segment = source.head;
            C2769l.m9239c(segment);
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, iMin);
            deflate(false);
            long j5 = iMin;
            source.setSize$okio(source.size() - j5);
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j4 -= j5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@NotNull Sink sink, @NotNull Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        C2769l.m9241e(sink, "sink");
        C2769l.m9241e(deflater, "deflater");
    }
}

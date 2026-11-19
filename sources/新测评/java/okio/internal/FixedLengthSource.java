package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "size", "", "truncate", "", "<init>", "(Lokio/Source;JZ)V", "bytesReceived", "read", "sink", "Lokio/Buffer;", "byteCount", "truncateToSize", "", "newSize", "okio"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source delegate, long j10, boolean z9) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j10;
        this.truncate = z9;
    }

    private final void truncateToSize(Buffer buffer, long j10) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j10);
        buffer2.clear();
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.bytesReceived;
        long j11 = this.size;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.truncate) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long j13 = super.read(sink, byteCount);
        if (j13 != -1) {
            this.bytesReceived += j13;
        }
        long j14 = this.bytesReceived;
        long j15 = this.size;
        if ((j14 >= j15 || j13 != -1) && j14 <= j15) {
            return j13;
        }
        if (j13 > 0 && j14 > j15) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}

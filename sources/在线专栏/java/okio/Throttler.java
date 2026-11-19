package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;

/* loaded from: classes.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j4) {
        this.allocatedUntil = j4;
        this.waitByteCount = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = throttler.waitByteCount;
        }
        long j7 = j5;
        if ((i4 & 4) != 0) {
            j6 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j4, j7, j6);
    }

    private final long bytesToNanos(long j4) {
        return (j4 * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j4) {
        return (j4 * this.bytesPerSecond) / 1000000000;
    }

    private final void waitNanos(long j4) throws InterruptedException {
        long j5 = j4 / 1000000;
        wait(j5, (int) (j4 - (1000000 * j5)));
    }

    public final long byteCountOrWaitNanos$okio(long j4, long j5) {
        if (this.bytesPerSecond == 0) {
            return j5;
        }
        long jMax = Math.max(this.allocatedUntil - j4, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= j5) {
            this.allocatedUntil = j4 + jMax + bytesToNanos(j5);
            return j5;
        }
        long j6 = this.waitByteCount;
        if (jNanosToBytes >= j6) {
            this.allocatedUntil = j4 + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j6, j5);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = j4 + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    public final void bytesPerSecond(long j4) {
        bytesPerSecond$default(this, j4, 0L, 0L, 6, null);
    }

    public final void bytesPerSecond(long j4, long j5) {
        bytesPerSecond$default(this, j4, j5, 0L, 4, null);
    }

    public final void bytesPerSecond(long j4, long j5, long j6) {
        synchronized (this) {
            if (!(j4 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j5 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j6 >= j5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.bytesPerSecond = j4;
            this.waitByteCount = j5;
            this.maxByteCount = j6;
            notifyAll();
            C2925r c2925r = C2925r.f11415a;
        }
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        C2769l.m9241e(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer source, long j4) throws IOException {
                C2769l.m9241e(source, "source");
                while (j4 > 0) {
                    try {
                        long jTake$okio = Throttler.this.take$okio(j4);
                        super.write(source, jTake$okio);
                        j4 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        C2769l.m9241e(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long j4) throws InterruptedIOException {
                C2769l.m9241e(sink, "sink");
                try {
                    return super.read(sink, Throttler.this.take$okio(j4));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j4) {
        long jByteCountOrWaitNanos$okio;
        if (!(j4 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            while (true) {
                jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j4);
                if (jByteCountOrWaitNanos$okio < 0) {
                    waitNanos(-jByteCountOrWaitNanos$okio);
                }
            }
        }
        return jByteCountOrWaitNanos$okio;
    }

    public Throttler() {
        this(System.nanoTime());
    }
}

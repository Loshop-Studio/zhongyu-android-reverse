package okio;

import java.util.Arrays;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @NotNull
    public final byte[] data;
    public int limit;

    @Nullable
    public Segment next;
    public boolean owner;
    public int pos;

    @Nullable
    public Segment prev;
    public boolean shared;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i4 = 0;
        if (!(segment != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C2769l.m9239c(segment);
        if (segment.owner) {
            int i5 = this.limit - this.pos;
            Segment segment2 = this.prev;
            C2769l.m9239c(segment2);
            int i6 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            C2769l.m9239c(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                C2769l.m9239c(segment4);
                i4 = segment4.pos;
            }
            if (i5 > i6 + i4) {
                return;
            }
            Segment segment5 = this.prev;
            C2769l.m9239c(segment5);
            writeTo(segment5, i5);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        C2769l.m9239c(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        C2769l.m9239c(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        C2769l.m9241e(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        C2769l.m9239c(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final Segment split(int i4) {
        Segment segmentTake;
        if (!(i4 > 0 && i4 <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i4 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i5 = this.pos;
            C2723g.m9083e(bArr, bArr2, 0, i5, i5 + i4, 2, null);
        }
        segmentTake.limit = segmentTake.pos + i4;
        this.pos += i4;
        Segment segment = this.prev;
        C2769l.m9239c(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@NotNull Segment sink, int i4) {
        C2769l.m9241e(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i5 = sink.limit;
        if (i5 + i4 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i6 = sink.pos;
            if ((i5 + i4) - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            C2723g.m9083e(bArr, bArr, 0, i6, i5, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i7 = sink.limit;
        int i8 = this.pos;
        C2723g.m9081c(bArr2, bArr3, i7, i8, i8 + i4);
        sink.limit += i4;
        this.pos += i4;
    }

    public Segment(@NotNull byte[] data, int i4, int i5, boolean z3, boolean z4) {
        C2769l.m9241e(data, "data");
        this.data = data;
        this.pos = i4;
        this.limit = i5;
        this.shared = z3;
        this.owner = z4;
    }
}

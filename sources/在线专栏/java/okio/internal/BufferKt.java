package okio.internal;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.umeng.analytics.pro.C1892bw;
import java.io.EOFException;
import java.io.IOException;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p171x2.InterfaceC3474p;

/* loaded from: classes.dex */
public final class BufferKt {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull Buffer commonClear) throws EOFException {
        C2769l.m9241e(commonClear, "$this$commonClear");
        commonClear.skip(commonClear.size());
    }

    public static final long commonCompleteSegmentByteCount(@NotNull Buffer commonCompleteSegmentByteCount) {
        C2769l.m9241e(commonCompleteSegmentByteCount, "$this$commonCompleteSegmentByteCount");
        long size = commonCompleteSegmentByteCount.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = commonCompleteSegmentByteCount.head;
        C2769l.m9239c(segment);
        Segment segment2 = segment.prev;
        C2769l.m9239c(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    @NotNull
    public static final Buffer commonCopy(@NotNull Buffer commonCopy) {
        C2769l.m9241e(commonCopy, "$this$commonCopy");
        Buffer buffer = new Buffer();
        if (commonCopy.size() == 0) {
            return buffer;
        }
        Segment segment = commonCopy.head;
        C2769l.m9239c(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            C2769l.m9239c(segment3);
            C2769l.m9239c(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(commonCopy.size());
        return buffer;
    }

    @NotNull
    public static final Buffer commonCopyTo(@NotNull Buffer commonCopyTo, @NotNull Buffer out, long j4, long j5) {
        C2769l.m9241e(commonCopyTo, "$this$commonCopyTo");
        C2769l.m9241e(out, "out");
        Util.checkOffsetAndCount(commonCopyTo.size(), j4, j5);
        if (j5 == 0) {
            return commonCopyTo;
        }
        out.setSize$okio(out.size() + j5);
        Segment segment = commonCopyTo.head;
        while (true) {
            C2769l.m9239c(segment);
            int i4 = segment.limit;
            int i5 = segment.pos;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            segment = segment.next;
        }
        while (j5 > 0) {
            C2769l.m9239c(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            int i6 = segmentSharedCopy.pos + ((int) j4);
            segmentSharedCopy.pos = i6;
            segmentSharedCopy.limit = Math.min(i6 + ((int) j5), segmentSharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy;
                out.head = segmentSharedCopy;
            } else {
                C2769l.m9239c(segment2);
                Segment segment3 = segment2.prev;
                C2769l.m9239c(segment3);
                segment3.push(segmentSharedCopy);
            }
            j5 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
            segment = segment.next;
            j4 = 0;
        }
        return commonCopyTo;
    }

    public static final boolean commonEquals(@NotNull Buffer commonEquals, @Nullable Object obj) {
        C2769l.m9241e(commonEquals, "$this$commonEquals");
        if (commonEquals == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (commonEquals.size() != buffer.size()) {
            return false;
        }
        if (commonEquals.size() == 0) {
            return true;
        }
        Segment segment = commonEquals.head;
        C2769l.m9239c(segment);
        Segment segment2 = buffer.head;
        C2769l.m9239c(segment2);
        int i4 = segment.pos;
        int i5 = segment2.pos;
        long j4 = 0;
        while (j4 < commonEquals.size()) {
            long jMin = Math.min(segment.limit - i4, segment2.limit - i5);
            long j5 = 0;
            while (j5 < jMin) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (segment.data[i4] != segment2.data[i5]) {
                    return false;
                }
                j5++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == segment.limit) {
                segment = segment.next;
                C2769l.m9239c(segment);
                i4 = segment.pos;
            }
            if (i5 == segment2.limit) {
                segment2 = segment2.next;
                C2769l.m9239c(segment2);
                i5 = segment2.pos;
            }
            j4 += jMin;
        }
        return true;
    }

    public static final byte commonGet(@NotNull Buffer commonGet, long j4) {
        C2769l.m9241e(commonGet, "$this$commonGet");
        Util.checkOffsetAndCount(commonGet.size(), j4, 1L);
        Segment segment = commonGet.head;
        if (segment == null) {
            C2769l.m9239c(null);
            throw null;
        }
        if (commonGet.size() - j4 < j4) {
            long size = commonGet.size();
            while (size > j4) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size -= segment.limit - segment.pos;
            }
            C2769l.m9239c(segment);
            return segment.data[(int) ((segment.pos + j4) - size)];
        }
        long j5 = 0;
        while (true) {
            long j6 = (segment.limit - segment.pos) + j5;
            if (j6 > j4) {
                C2769l.m9239c(segment);
                return segment.data[(int) ((segment.pos + j4) - j5)];
            }
            segment = segment.next;
            C2769l.m9239c(segment);
            j5 = j6;
        }
    }

    public static final int commonHashCode(@NotNull Buffer commonHashCode) {
        C2769l.m9241e(commonHashCode, "$this$commonHashCode");
        Segment segment = commonHashCode.head;
        if (segment == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = segment.limit;
            for (int i6 = segment.pos; i6 < i5; i6++) {
                i4 = (i4 * 31) + segment.data[i6];
            }
            segment = segment.next;
            C2769l.m9239c(segment);
        } while (segment != commonHashCode.head);
        return i4;
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, byte b4, long j4, long j5) {
        Segment segment;
        int i4;
        C2769l.m9241e(commonIndexOf, "$this$commonIndexOf");
        long size = 0;
        if (!(0 <= j4 && j5 >= j4)) {
            throw new IllegalArgumentException(("size=" + commonIndexOf.size() + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        if (j5 > commonIndexOf.size()) {
            j5 = commonIndexOf.size();
        }
        if (j4 == j5 || (segment = commonIndexOf.head) == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j4 < j4) {
            size = commonIndexOf.size();
            while (size > j4) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j5) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j5) - size);
                i4 = (int) ((segment.pos + j4) - size);
                while (i4 < iMin) {
                    if (bArr[i4] != b4) {
                        i4++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                C2769l.m9239c(segment);
                j4 = size;
            }
            return -1L;
        }
        while (true) {
            long j6 = (segment.limit - segment.pos) + size;
            if (j6 > j4) {
                break;
            }
            segment = segment.next;
            C2769l.m9239c(segment);
            size = j6;
        }
        while (size < j5) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j5) - size);
            i4 = (int) ((segment.pos + j4) - size);
            while (i4 < iMin2) {
                if (bArr2[i4] != b4) {
                    i4++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            C2769l.m9239c(segment);
            j4 = size;
        }
        return -1L;
        return (i4 - segment.pos) + size;
    }

    public static final long commonIndexOfElement(@NotNull Buffer commonIndexOfElement, @NotNull ByteString targetBytes, long j4) {
        int i4;
        int i5;
        C2769l.m9241e(commonIndexOfElement, "$this$commonIndexOfElement");
        C2769l.m9241e(targetBytes, "targetBytes");
        long size = 0;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        Segment segment = commonIndexOfElement.head;
        if (segment == null) {
            return -1L;
        }
        if (commonIndexOfElement.size() - j4 < j4) {
            size = commonIndexOfElement.size();
            while (size > j4) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b4 = targetBytes.getByte(0);
                byte b5 = targetBytes.getByte(1);
                while (size < commonIndexOfElement.size()) {
                    byte[] bArr = segment.data;
                    i4 = (int) ((segment.pos + j4) - size);
                    int i6 = segment.limit;
                    while (i4 < i6) {
                        byte b6 = bArr[i4];
                        if (b6 == b4 || b6 == b5) {
                            i5 = segment.pos;
                        } else {
                            i4++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    C2769l.m9239c(segment);
                    j4 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < commonIndexOfElement.size()) {
                    byte[] bArr2 = segment.data;
                    i4 = (int) ((segment.pos + j4) - size);
                    int i7 = segment.limit;
                    while (i4 < i7) {
                        byte b7 = bArr2[i4];
                        for (byte b8 : bArrInternalArray$okio) {
                            if (b7 == b8) {
                                i5 = segment.pos;
                            }
                        }
                        i4++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    C2769l.m9239c(segment);
                    j4 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j5 = (segment.limit - segment.pos) + size;
            if (j5 > j4) {
                break;
            }
            segment = segment.next;
            C2769l.m9239c(segment);
            size = j5;
        }
        if (targetBytes.size() == 2) {
            byte b9 = targetBytes.getByte(0);
            byte b10 = targetBytes.getByte(1);
            while (size < commonIndexOfElement.size()) {
                byte[] bArr3 = segment.data;
                i4 = (int) ((segment.pos + j4) - size);
                int i8 = segment.limit;
                while (i4 < i8) {
                    byte b11 = bArr3[i4];
                    if (b11 == b9 || b11 == b10) {
                        i5 = segment.pos;
                    } else {
                        i4++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                C2769l.m9239c(segment);
                j4 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < commonIndexOfElement.size()) {
                byte[] bArr4 = segment.data;
                i4 = (int) ((segment.pos + j4) - size);
                int i9 = segment.limit;
                while (i4 < i9) {
                    byte b12 = bArr4[i4];
                    for (byte b13 : bArrInternalArray$okio2) {
                        if (b12 == b13) {
                            i5 = segment.pos;
                        }
                    }
                    i4++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                C2769l.m9239c(segment);
                j4 = size;
            }
        }
        return -1L;
        return (i4 - i5) + size;
    }

    public static final boolean commonRangeEquals(@NotNull Buffer commonRangeEquals, long j4, @NotNull ByteString bytes, int i4, int i5) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(bytes, "bytes");
        if (j4 < 0 || i4 < 0 || i5 < 0 || commonRangeEquals.size() - j4 < i5 || bytes.size() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (commonRangeEquals.getByte(i6 + j4) != bytes.getByte(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink) {
        C2769l.m9241e(commonRead, "$this$commonRead");
        C2769l.m9241e(sink, "sink");
        return commonRead.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull Buffer commonReadAll, @NotNull Sink sink) throws IOException {
        C2769l.m9241e(commonReadAll, "$this$commonReadAll");
        C2769l.m9241e(sink, "sink");
        long size = commonReadAll.size();
        if (size > 0) {
            sink.write(commonReadAll, size);
        }
        return size;
    }

    public static final byte commonReadByte(@NotNull Buffer commonReadByte) throws EOFException {
        C2769l.m9241e(commonReadByte, "$this$commonReadByte");
        if (commonReadByte.size() == 0) {
            throw new EOFException();
        }
        Segment segment = commonReadByte.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        int i6 = i4 + 1;
        byte b4 = segment.data[i4];
        commonReadByte.setSize$okio(commonReadByte.size() - 1);
        if (i6 == i5) {
            commonReadByte.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return b4;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray) {
        C2769l.m9241e(commonReadByteArray, "$this$commonReadByteArray");
        return commonReadByteArray.readByteArray(commonReadByteArray.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString) {
        C2769l.m9241e(commonReadByteString, "$this$commonReadByteString");
        return commonReadByteString.readByteString(commonReadByteString.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[EDGE_INSN: B:51:0x00c7->B:41:0x00c7 BREAK  A[LOOP:0: B:5:0x0016->B:53:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r17) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull byte[] sink) throws EOFException {
        C2769l.m9241e(commonReadFully, "$this$commonReadFully");
        C2769l.m9241e(sink, "sink");
        int i4 = 0;
        while (i4 < sink.length) {
            int i5 = commonReadFully.read(sink, i4, sink.length - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:37:0x00b3 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) throws java.io.EOFException {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.C2769l.m9241e(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lbd
            r0 = 0
            r4 = r2
            r1 = 0
        L12:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.C2769l.m9239c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L9f
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L48
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3d
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L48
        L3d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L80
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L80
            goto L38
        L48:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r15 = r15.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r15 = r15.readUtf8()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L80:
            if (r0 == 0) goto L84
            r1 = 1
            goto L9f
        L84:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L9f:
            if (r8 != r9) goto Lab
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto Lad
        Lab:
            r6.pos = r8
        Lad:
            if (r1 != 0) goto Lb3
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L12
        Lb3:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lbd:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull Buffer commonReadInt) throws EOFException {
        C2769l.m9241e(commonReadInt, "$this$commonReadInt");
        if (commonReadInt.size() < 4) {
            throw new EOFException();
        }
        Segment segment = commonReadInt.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 4) {
            return (commonReadInt.readByte() & 255) | ((commonReadInt.readByte() & 255) << 24) | ((commonReadInt.readByte() & 255) << 16) | ((commonReadInt.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & 255) << 24) | ((bArr[i6] & 255) << 16);
        int i9 = i7 + 1;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        int i11 = i9 + 1;
        int i12 = i10 | (bArr[i9] & 255);
        commonReadInt.setSize$okio(commonReadInt.size() - 4);
        if (i11 == i5) {
            commonReadInt.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return i12;
    }

    public static final long commonReadLong(@NotNull Buffer commonReadLong) throws EOFException {
        C2769l.m9241e(commonReadLong, "$this$commonReadLong");
        if (commonReadLong.size() < 8) {
            throw new EOFException();
        }
        Segment segment = commonReadLong.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 8) {
            return ((commonReadLong.readInt() & 4294967295L) << 32) | (4294967295L & commonReadLong.readInt());
        }
        byte[] bArr = segment.data;
        long j4 = (bArr[i4] & 255) << 56;
        long j5 = j4 | ((bArr[r6] & 255) << 48);
        long j6 = j5 | ((bArr[r1] & 255) << 40);
        int i6 = i4 + 1 + 1 + 1 + 1;
        long j7 = ((bArr[r6] & 255) << 32) | j6;
        long j8 = j7 | ((bArr[i6] & 255) << 24);
        long j9 = j8 | ((bArr[r8] & 255) << 16);
        long j10 = j9 | ((bArr[r1] & 255) << 8);
        int i7 = i6 + 1 + 1 + 1 + 1;
        long j11 = j10 | (bArr[r8] & 255);
        commonReadLong.setSize$okio(commonReadLong.size() - 8);
        if (i7 == i5) {
            commonReadLong.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return j11;
    }

    public static final short commonReadShort(@NotNull Buffer commonReadShort) throws EOFException {
        C2769l.m9241e(commonReadShort, "$this$commonReadShort");
        if (commonReadShort.size() < 2) {
            throw new EOFException();
        }
        Segment segment = commonReadShort.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 2) {
            return (short) ((commonReadShort.readByte() & 255) | ((commonReadShort.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
        commonReadShort.setSize$okio(commonReadShort.size() - 2);
        if (i7 == i5) {
            commonReadShort.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return (short) i8;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull Buffer commonReadUtf8, long j4) throws EOFException {
        C2769l.m9241e(commonReadUtf8, "$this$commonReadUtf8");
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (commonReadUtf8.size() < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        Segment segment = commonReadUtf8.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        if (i4 + j4 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(commonReadUtf8.readByteArray(j4), 0, 0, 3, null);
        }
        int i5 = (int) j4;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i4, i4 + i5);
        segment.pos += i5;
        commonReadUtf8.setSize$okio(commonReadUtf8.size() - j4);
        if (segment.pos == segment.limit) {
            commonReadUtf8.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull Buffer commonReadUtf8CodePoint) throws EOFException {
        int i4;
        int i5;
        int i6;
        C2769l.m9241e(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        if (commonReadUtf8CodePoint.size() == 0) {
            throw new EOFException();
        }
        byte b4 = commonReadUtf8CodePoint.getByte(0L);
        if ((b4 & 128) == 0) {
            i4 = b4 & 127;
            i5 = 1;
            i6 = 0;
        } else if ((b4 & 224) == 192) {
            i4 = b4 & 31;
            i5 = 2;
            i6 = 128;
        } else if ((b4 & 240) == 224) {
            i4 = b4 & C1892bw.f8538m;
            i5 = 3;
            i6 = 2048;
        } else {
            if ((b4 & 248) != 240) {
                commonReadUtf8CodePoint.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b4 & 7;
            i5 = 4;
            i6 = ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
        }
        long j4 = i5;
        if (commonReadUtf8CodePoint.size() < j4) {
            throw new EOFException("size < " + i5 + ": " + commonReadUtf8CodePoint.size() + " (to read code point prefixed 0x" + Util.toHexString(b4) + ')');
        }
        for (int i7 = 1; i7 < i5; i7++) {
            long j5 = i7;
            byte b5 = commonReadUtf8CodePoint.getByte(j5);
            if ((b5 & 192) != 128) {
                commonReadUtf8CodePoint.skip(j5);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = (i4 << 6) | (b5 & Utf8.REPLACEMENT_BYTE);
        }
        commonReadUtf8CodePoint.skip(j4);
        return i4 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 <= i4 && 57343 >= i4) || i4 < i6) ? Utf8.REPLACEMENT_CODE_POINT : i4;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull Buffer commonReadUtf8Line) {
        C2769l.m9241e(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8Line, jIndexOf);
        }
        if (commonReadUtf8Line.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull Buffer commonReadUtf8LineStrict, long j4) throws EOFException {
        C2769l.m9241e(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        byte b4 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b4, 0L, j5);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8LineStrict, jIndexOf);
        }
        if (j5 < commonReadUtf8LineStrict.size() && commonReadUtf8LineStrict.getByte(j5 - 1) == ((byte) 13) && commonReadUtf8LineStrict.getByte(j5) == b4) {
            return readUtf8Line(commonReadUtf8LineStrict, j5);
        }
        Buffer buffer = new Buffer();
        commonReadUtf8LineStrict.copyTo(buffer, 0L, Math.min(32, commonReadUtf8LineStrict.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.size(), j4) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final int commonSelect(@NotNull Buffer commonSelect, @NotNull Options options) throws EOFException {
        C2769l.m9241e(commonSelect, "$this$commonSelect");
        C2769l.m9241e(options, "options");
        int iSelectPrefix$default = selectPrefix$default(commonSelect, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        commonSelect.skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull Buffer commonSkip, long j4) throws EOFException {
        C2769l.m9241e(commonSkip, "$this$commonSkip");
        while (j4 > 0) {
            Segment segment = commonSkip.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            long j5 = iMin;
            commonSkip.setSize$okio(commonSkip.size() - j5);
            j4 -= j5;
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                commonSkip.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot) {
        C2769l.m9241e(commonSnapshot, "$this$commonSnapshot");
        if (commonSnapshot.size() <= ((long) Integer.MAX_VALUE)) {
            return commonSnapshot.snapshot((int) commonSnapshot.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + commonSnapshot.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull Buffer commonWritableSegment, int i4) {
        C2769l.m9241e(commonWritableSegment, "$this$commonWritableSegment");
        if (!(i4 >= 1 && i4 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = commonWritableSegment.head;
        if (segment != null) {
            C2769l.m9239c(segment);
            Segment segment2 = segment.prev;
            C2769l.m9239c(segment2);
            return (segment2.limit + i4 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        commonWritableSegment.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull ByteString byteString, int i4, int i5) {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(byteString, "byteString");
        byteString.write$okio(commonWrite, i4, i5);
        return commonWrite;
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer commonWrite, ByteString byteString, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = byteString.size();
        }
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(byteString, "byteString");
        byteString.write$okio(commonWrite, i4, i5);
        return commonWrite;
    }

    public static final long commonWriteAll(@NotNull Buffer commonWriteAll, @NotNull Source source) throws IOException {
        C2769l.m9241e(commonWriteAll, "$this$commonWriteAll");
        C2769l.m9241e(source, "source");
        long j4 = 0;
        while (true) {
            long j5 = source.read(commonWriteAll, 8192);
            if (j5 == -1) {
                return j4;
            }
            j4 += j5;
        }
    }

    @NotNull
    public static final Buffer commonWriteByte(@NotNull Buffer commonWriteByte, int i4) {
        C2769l.m9241e(commonWriteByte, "$this$commonWriteByte");
        Segment segmentWritableSegment$okio = commonWriteByte.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i5 + 1;
        bArr[i5] = (byte) i4;
        commonWriteByte.setSize$okio(commonWriteByte.size() + 1);
        return commonWriteByte;
    }

    @NotNull
    public static final Buffer commonWriteDecimalLong(@NotNull Buffer commonWriteDecimalLong, long j4) {
        C2769l.m9241e(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (j4 == 0) {
            return commonWriteDecimalLong.writeByte(48);
        }
        boolean z3 = false;
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return commonWriteDecimalLong.writeUtf8("-9223372036854775808");
            }
            z3 = true;
        }
        if (j4 >= 100000000) {
            i4 = j4 < 1000000000000L ? j4 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= 10000) {
            i4 = j4 < 1000000 ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
        } else if (j4 >= 100) {
            i4 = j4 < 1000 ? 3 : 4;
        } else if (j4 >= 10) {
            i4 = 2;
        }
        if (z3) {
            i4++;
        }
        Segment segmentWritableSegment$okio = commonWriteDecimalLong.writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit + i4;
        while (j4 != 0) {
            long j5 = 10;
            i5--;
            bArr[i5] = getHEX_DIGIT_BYTES()[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z3) {
            bArr[i5 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i4;
        commonWriteDecimalLong.setSize$okio(commonWriteDecimalLong.size() + i4);
        return commonWriteDecimalLong;
    }

    @NotNull
    public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer commonWriteHexadecimalUnsignedLong, long j4) {
        C2769l.m9241e(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (j4 == 0) {
            return commonWriteHexadecimalUnsignedLong.writeByte(48);
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i4 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = commonWriteHexadecimalUnsignedLong.writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = getHEX_DIGIT_BYTES()[(int) (15 & j4)];
            j4 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i4;
        commonWriteHexadecimalUnsignedLong.setSize$okio(commonWriteHexadecimalUnsignedLong.size() + i4);
        return commonWriteHexadecimalUnsignedLong;
    }

    @NotNull
    public static final Buffer commonWriteInt(@NotNull Buffer commonWriteInt, int i4) {
        C2769l.m9241e(commonWriteInt, "$this$commonWriteInt");
        Segment segmentWritableSegment$okio = commonWriteInt.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i4 >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i4 >>> 8) & 255);
        bArr[i8] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i8 + 1;
        commonWriteInt.setSize$okio(commonWriteInt.size() + 4);
        return commonWriteInt;
    }

    @NotNull
    public static final Buffer commonWriteLong(@NotNull Buffer commonWriteLong, long j4) {
        C2769l.m9241e(commonWriteLong, "$this$commonWriteLong");
        Segment segmentWritableSegment$okio = commonWriteLong.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j4 >>> 56) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j4 >>> 48) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j4 >>> 40) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j4 >>> 32) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j4 >>> 24) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j4 >>> 16) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j4 >>> 8) & 255);
        bArr[i11] = (byte) (j4 & 255);
        segmentWritableSegment$okio.limit = i11 + 1;
        commonWriteLong.setSize$okio(commonWriteLong.size() + 8);
        return commonWriteLong;
    }

    @NotNull
    public static final Buffer commonWriteShort(@NotNull Buffer commonWriteShort, int i4) {
        C2769l.m9241e(commonWriteShort, "$this$commonWriteShort");
        Segment segmentWritableSegment$okio = commonWriteShort.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i6] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i6 + 1;
        commonWriteShort.setSize$okio(commonWriteShort.size() + 2);
        return commonWriteShort;
    }

    @NotNull
    public static final Buffer commonWriteUtf8(@NotNull Buffer commonWriteUtf8, @NotNull String string, int i4, int i5) {
        C2769l.m9241e(commonWriteUtf8, "$this$commonWriteUtf8");
        C2769l.m9241e(string, "string");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (!(i5 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + string.length()).toString());
        }
        while (i4 < i5) {
            char cCharAt = string.charAt(i4);
            if (cCharAt < 128) {
                Segment segmentWritableSegment$okio = commonWriteUtf8.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i6 = segmentWritableSegment$okio.limit - i4;
                int iMin = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                bArr[i4 + i6] = (byte) cCharAt;
                while (i7 < iMin) {
                    char cCharAt2 = string.charAt(i7);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i7 + i6] = (byte) cCharAt2;
                    i7++;
                }
                int i8 = segmentWritableSegment$okio.limit;
                int i9 = (i6 + i7) - i8;
                segmentWritableSegment$okio.limit = i8 + i9;
                commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + i9);
                i4 = i7;
            } else {
                if (cCharAt < 2048) {
                    Segment segmentWritableSegment$okio2 = commonWriteUtf8.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i10 = segmentWritableSegment$okio2.limit;
                    bArr2[i10] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio2.limit = i10 + 2;
                    commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentWritableSegment$okio3 = commonWriteUtf8.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i11 = segmentWritableSegment$okio3.limit;
                    bArr3[i11] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$okio3.limit = i11 + 3;
                    commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 3);
                } else {
                    int i12 = i4 + 1;
                    char cCharAt3 = i12 < i5 ? string.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        commonWriteUtf8.writeByte(63);
                        i4 = i12;
                    } else {
                        int i13 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
                        Segment segmentWritableSegment$okio4 = commonWriteUtf8.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i14 = segmentWritableSegment$okio4.limit;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i14 + 4;
                        commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return commonWriteUtf8;
    }

    @NotNull
    public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer commonWriteUtf8CodePoint, int i4) {
        C2769l.m9241e(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (i4 < 128) {
            commonWriteUtf8CodePoint.writeByte(i4);
        } else if (i4 < 2048) {
            Segment segmentWritableSegment$okio = commonWriteUtf8CodePoint.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i5 = segmentWritableSegment$okio.limit;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio.limit = i5 + 2;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 2);
        } else if (55296 <= i4 && 57343 >= i4) {
            commonWriteUtf8CodePoint.writeByte(63);
        } else if (i4 < 65536) {
            Segment segmentWritableSegment$okio2 = commonWriteUtf8CodePoint.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i6 = segmentWritableSegment$okio2.limit;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio2.limit = i6 + 3;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 3);
        } else {
            if (i4 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i4));
            }
            Segment segmentWritableSegment$okio3 = commonWriteUtf8CodePoint.writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i7 = segmentWritableSegment$okio3.limit;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio3.limit = i7 + 4;
            commonWriteUtf8CodePoint.setSize$okio(commonWriteUtf8CodePoint.size() + 4);
        }
        return commonWriteUtf8CodePoint;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i4, @NotNull byte[] bytes, int i5, int i6) {
        C2769l.m9241e(segment, "segment");
        C2769l.m9241e(bytes, "bytes");
        int i7 = segment.limit;
        byte[] bArr = segment.data;
        while (i5 < i6) {
            if (i4 == i7) {
                segment = segment.next;
                C2769l.m9239c(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i4 = segment.pos;
                i7 = segment.limit;
            }
            if (bArr[i4] != bytes[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull Buffer readUtf8Line, long j4) throws EOFException {
        C2769l.m9241e(readUtf8Line, "$this$readUtf8Line");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (readUtf8Line.getByte(j5) == ((byte) 13)) {
                String utf8 = readUtf8Line.readUtf8(j5);
                readUtf8Line.skip(2L);
                return utf8;
            }
        }
        String utf82 = readUtf8Line.readUtf8(j4);
        readUtf8Line.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull Buffer seek, long j4, @NotNull InterfaceC3474p<? super Segment, ? super Long, ? extends T> lambda) {
        C2769l.m9241e(seek, "$this$seek");
        C2769l.m9241e(lambda, "lambda");
        Segment segment = seek.head;
        if (segment == null) {
            return lambda.mo2812d(null, -1L);
        }
        if (seek.size() - j4 < j4) {
            long size = seek.size();
            while (size > j4) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.mo2812d(segment, Long.valueOf(size));
        }
        long j5 = 0;
        while (true) {
            long j6 = (segment.limit - segment.pos) + j5;
            if (j6 > j4) {
                return lambda.mo2812d(segment, Long.valueOf(j5));
            }
            segment = segment.next;
            C2769l.m9239c(segment);
            j5 = j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return selectPrefix(buffer, options, z3);
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink, int i4, int i5) {
        C2769l.m9241e(commonRead, "$this$commonRead");
        C2769l.m9241e(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i4, i5);
        Segment segment = commonRead.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i5, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i6 = segment.pos;
        C2723g.m9081c(bArr, sink, i4, i6, i6 + iMin);
        segment.pos += iMin;
        commonRead.setSize$okio(commonRead.size() - iMin);
        if (segment.pos == segment.limit) {
            commonRead.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray, long j4) throws EOFException {
        C2769l.m9241e(commonReadByteArray, "$this$commonReadByteArray");
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (commonReadByteArray.size() < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        commonReadByteArray.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString, long j4) throws EOFException {
        C2769l.m9241e(commonReadByteString, "$this$commonReadByteString");
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (commonReadByteString.size() < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new ByteString(commonReadByteString.readByteArray(j4));
        }
        ByteString byteStringSnapshot = commonReadByteString.snapshot((int) j4);
        commonReadByteString.skip(j4);
        return byteStringSnapshot;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source) {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(source, "source");
        return commonWrite.write(source, 0, source.length);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source, int i4, int i5) {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(source, "source");
        long j4 = i5;
        Util.checkOffsetAndCount(source.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            Segment segmentWritableSegment$okio = commonWrite.writableSegment$okio(1);
            int iMin = Math.min(i6 - i4, 8192 - segmentWritableSegment$okio.limit);
            int i7 = i4 + iMin;
            C2723g.m9081c(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i4, i7);
            segmentWritableSegment$okio.limit += iMin;
            i4 = i7;
        }
        commonWrite.setSize$okio(commonWrite.size() + j4);
        return commonWrite;
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull Buffer sink, long j4) throws EOFException {
        C2769l.m9241e(commonReadFully, "$this$commonReadFully");
        C2769l.m9241e(sink, "sink");
        if (commonReadFully.size() >= j4) {
            sink.write(commonReadFully, j4);
        } else {
            sink.write(commonReadFully, commonReadFully.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot, int i4) {
        C2769l.m9241e(commonSnapshot, "$this$commonSnapshot");
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(commonSnapshot.size(), 0L, i4);
        Segment segment = commonSnapshot.head;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            C2769l.m9239c(segment);
            int i8 = segment.limit;
            int i9 = segment.pos;
            if (i8 != i9) {
                i6 += i8 - i9;
                i7++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        Segment segment2 = commonSnapshot.head;
        int i10 = 0;
        while (i5 < i4) {
            C2769l.m9239c(segment2);
            bArr[i10] = segment2.data;
            i5 += segment2.limit - segment2.pos;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = segment2.pos;
            segment2.shared = true;
            i10++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull Source source, long j4) throws IOException {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(source, "source");
        while (j4 > 0) {
            long j5 = source.read(commonWrite, j4);
            if (j5 == -1) {
                throw new EOFException();
            }
            j4 -= j5;
        }
        return commonWrite;
    }

    public static final long commonRead(@NotNull Buffer commonRead, @NotNull Buffer sink, long j4) {
        C2769l.m9241e(commonRead, "$this$commonRead");
        C2769l.m9241e(sink, "sink");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (commonRead.size() == 0) {
            return -1L;
        }
        if (j4 > commonRead.size()) {
            j4 = commonRead.size();
        }
        sink.write(commonRead, j4);
        return j4;
    }

    public static final void commonWrite(@NotNull Buffer commonWrite, @NotNull Buffer source, long j4) {
        Segment segment;
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(source, "source");
        if (source != commonWrite) {
            Util.checkOffsetAndCount(source.size(), 0L, j4);
            while (j4 > 0) {
                Segment segment2 = source.head;
                C2769l.m9239c(segment2);
                int i4 = segment2.limit;
                C2769l.m9239c(source.head);
                if (j4 < i4 - r2.pos) {
                    Segment segment3 = commonWrite.head;
                    if (segment3 != null) {
                        C2769l.m9239c(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j4) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            C2769l.m9239c(segment4);
                            segment4.writeTo(segment, (int) j4);
                            source.setSize$okio(source.size() - j4);
                            commonWrite.setSize$okio(commonWrite.size() + j4);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    C2769l.m9239c(segment5);
                    source.head = segment5.split((int) j4);
                }
                Segment segment6 = source.head;
                C2769l.m9239c(segment6);
                long j5 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = commonWrite.head;
                if (segment7 == null) {
                    commonWrite.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    C2769l.m9239c(segment7);
                    Segment segment8 = segment7.prev;
                    C2769l.m9239c(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j5);
                commonWrite.setSize$okio(commonWrite.size() + j5);
                j4 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, @NotNull ByteString bytes, long j4) {
        long size;
        int i4;
        long j5 = j4;
        C2769l.m9241e(commonIndexOf, "$this$commonIndexOf");
        C2769l.m9241e(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j6 = 0;
        if (j5 >= 0) {
            Segment segment = commonIndexOf.head;
            if (segment == null) {
                return -1L;
            }
            if (commonIndexOf.size() - j5 < j5) {
                size = commonIndexOf.size();
                while (size > j5) {
                    segment = segment.prev;
                    C2769l.m9239c(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b4 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (commonIndexOf.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i4 = (int) ((segment.pos + j5) - size);
                    while (i4 < iMin) {
                        if (bArr[i4] != b4 || !rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                            i4++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    C2769l.m9239c(segment);
                    j5 = size;
                }
                return -1L;
            }
            while (true) {
                long j7 = (segment.limit - segment.pos) + j6;
                if (j7 > j5) {
                    break;
                }
                segment = segment.next;
                C2769l.m9239c(segment);
                j6 = j7;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b5 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (commonIndexOf.size() - size4) + 1;
            size = j6;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j8 = size5;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i4 = (int) ((segment.pos + j5) - size);
                while (i4 < iMin2) {
                    if (bArr2[i4] == b5 && rangeEquals(segment, i4 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i4++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                C2769l.m9239c(segment);
                size5 = j8;
                j5 = size;
            }
            return -1L;
            return (i4 - segment.pos) + size;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
    }
}

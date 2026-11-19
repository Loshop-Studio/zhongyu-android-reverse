package okio.internal;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3376bw;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
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

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0080\b\u001a\r\u0010\u0014\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u0010\u0015\u001a\u00020\u0013*\u00020\u0013H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\u0017\u0010\u001a\u001a\u00020\n*\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u001e*\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0005H\u0080\b\u001a\r\u0010 \u001a\u00020\b*\u00020\u0013H\u0080\b\u001a%\u0010!\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010!\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010&\u001a\u00020\u0005*\u00020\u00132\u0006\u0010'\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a-\u0010(\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00132\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a%\u0010)\u001a\u00020\b*\u00020\u00132\u0006\u0010*\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u001d\u0010)\u001a\u00020\u0005*\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010+\u001a\u00020\u0005*\u00020\u00132\u0006\u0010*\u001a\u00020,H\u0080\b\u001a\r\u0010-\u001a\u00020\u001e*\u00020\u0013H\u0080\b\u001a\r\u0010.\u001a\u00020\u0001*\u00020\u0013H\u0080\b\u001a\u0015\u0010.\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\r\u0010/\u001a\u00020%*\u00020\u0013H\u0080\b\u001a\u0015\u0010/\u001a\u00020%*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\r\u00100\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0012*\u00020\u00132\u0006\u0010*\u001a\u00020\u0001H\u0080\b\u001a\u001d\u00101\u001a\u00020\u0012*\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\r\u00102\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u00103\u001a\u00020\b*\u00020\u0013H\u0080\b\u001a\r\u00104\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0013H\u0080\b\u001a\u0015\u00107\u001a\u000208*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\r\u00109\u001a\u00020\b*\u00020\u0013H\u0080\b\u001a\u000f\u0010:\u001a\u0004\u0018\u000108*\u00020\u0013H\u0080\b\u001a\u0015\u0010;\u001a\u000208*\u00020\u00132\u0006\u0010<\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010=\u001a\u00020\b*\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0080\b\u001a\u0015\u0010@\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\r\u0010A\u001a\u00020%*\u00020\u0013H\u0080\b\u001a\u0015\u0010A\u001a\u00020%*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u0015\u0010B\u001a\u00020\f*\u00020\u00132\u0006\u0010C\u001a\u00020\bH\u0080\b\u001a\u0015\u0010D\u001a\u00020\u0013*\u00020\u00132\u0006\u0010E\u001a\u00020\u0001H\u0080\b\u001a%\u0010D\u001a\u00020\u0013*\u00020\u00132\u0006\u0010E\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u001d\u0010D\u001a\u00020\u0012*\u00020\u00132\u0006\u0010E\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a)\u0010D\u001a\u00020\u0013*\u00020\u00132\u0006\u0010F\u001a\u00020%2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0080\b\u001a\u001d\u0010D\u001a\u00020\u0013*\u00020\u00132\u0006\u0010E\u001a\u00020G2\u0006\u0010\u0019\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010H\u001a\u00020\u0005*\u00020\u00132\u0006\u0010E\u001a\u00020GH\u0080\b\u001a\u0015\u0010I\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\"\u001a\u00020\bH\u0080\b\u001a\u0015\u0010J\u001a\u00020\u0013*\u00020\u00132\u0006\u0010K\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010L\u001a\u00020\u0013*\u00020\u00132\u0006\u0010K\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0013*\u00020\u00132\u0006\u0010N\u001a\u00020\bH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u0013*\u00020\u00132\u0006\u0010K\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010P\u001a\u00020\u0013*\u00020\u00132\u0006\u0010Q\u001a\u00020\bH\u0080\b\u001a%\u0010R\u001a\u00020\u0013*\u00020\u00132\u0006\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\bH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0013*\u00020\u00132\u0006\u0010W\u001a\u00020\bH\u0080\b\u001a\u0014\u0010X\u001a\u000208*\u00020\u00132\u0006\u0010Y\u001a\u00020\u0005H\u0000\u001a?\u0010Z\u001a\u0002H[\"\u0004\b\u0000\u0010[*\u00020\u00132\u0006\u0010#\u001a\u00020\u00052\u001a\u0010\\\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H[0]H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010^\u001a\u001e\u0010_\u001a\u00020\b*\u00020\u00132\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010`\u001a\u00020\nH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006a"}, m5175d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", "offset", "byteCount", "commonEquals", "other", "", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", C3335ai.f1662aC, "commonWriteHexadecimalUnsignedLong", "commonWriteInt", C3335ai.f1660aA, "commonWriteLong", "commonWriteShort", C3335ai.f1711az, "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", ExifInterface.GPS_DIRECTION_TRUE, "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class BufferKt {
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(Buffer commonClear) throws EOFException {
        Intrinsics.checkNotNullParameter(commonClear, "$this$commonClear");
        commonClear.skip(commonClear.size());
    }

    public static final long commonCompleteSegmentByteCount(Buffer commonCompleteSegmentByteCount) {
        Intrinsics.checkNotNullParameter(commonCompleteSegmentByteCount, "$this$commonCompleteSegmentByteCount");
        long size = commonCompleteSegmentByteCount.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = commonCompleteSegmentByteCount.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    public static final Buffer commonCopy(Buffer commonCopy) {
        Intrinsics.checkNotNullParameter(commonCopy, "$this$commonCopy");
        Buffer buffer = new Buffer();
        if (commonCopy.size() == 0) {
            return buffer;
        }
        Segment segment = commonCopy.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(commonCopy.size());
        return buffer;
    }

    public static final Buffer commonCopyTo(Buffer commonCopyTo, Buffer out, long j4, long j5) {
        Intrinsics.checkNotNullParameter(commonCopyTo, "$this$commonCopyTo");
        Intrinsics.checkNotNullParameter(out, "out");
        Util.checkOffsetAndCount(commonCopyTo.size(), j4, j5);
        if (j5 == 0) {
            return commonCopyTo;
        }
        out.setSize$okio(out.size() + j5);
        Segment segment = commonCopyTo.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            int i4 = segment.limit;
            int i5 = segment.pos;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            segment = segment.next;
        }
        while (j5 > 0) {
            Intrinsics.checkNotNull(segment);
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
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j5 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
            segment = segment.next;
            j4 = 0;
        }
        return commonCopyTo;
    }

    public static final boolean commonEquals(Buffer commonEquals, Object obj) {
        Intrinsics.checkNotNullParameter(commonEquals, "$this$commonEquals");
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
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer.head;
        Intrinsics.checkNotNull(segment2);
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
                Intrinsics.checkNotNull(segment);
                i4 = segment.pos;
            }
            if (i5 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i5 = segment2.pos;
            }
            j4 += jMin;
        }
        return true;
    }

    public static final byte commonGet(Buffer commonGet, long j4) {
        Intrinsics.checkNotNullParameter(commonGet, "$this$commonGet");
        Util.checkOffsetAndCount(commonGet.size(), j4, 1L);
        Segment segment = commonGet.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (commonGet.size() - j4 < j4) {
            long size = commonGet.size();
            while (size > j4) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j4) - size)];
        }
        long j5 = 0;
        while (true) {
            long j6 = (segment.limit - segment.pos) + j5;
            if (j6 > j4) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j4) - j5)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j5 = j6;
        }
    }

    public static final int commonHashCode(Buffer commonHashCode) {
        Intrinsics.checkNotNullParameter(commonHashCode, "$this$commonHashCode");
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
            Intrinsics.checkNotNull(segment);
        } while (segment != commonHashCode.head);
        return i4;
    }

    public static final long commonIndexOf(Buffer commonIndexOf, byte b4, long j4, long j5) {
        Segment segment;
        int i4;
        Intrinsics.checkNotNullParameter(commonIndexOf, "$this$commonIndexOf");
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
                Intrinsics.checkNotNull(segment);
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
                Intrinsics.checkNotNull(segment);
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
            Intrinsics.checkNotNull(segment);
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
            Intrinsics.checkNotNull(segment);
            j4 = size;
        }
        return -1L;
        return (i4 - segment.pos) + size;
    }

    public static final long commonIndexOfElement(Buffer commonIndexOfElement, ByteString targetBytes, long j4) {
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(commonIndexOfElement, "$this$commonIndexOfElement");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
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
                Intrinsics.checkNotNull(segment);
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
                    Intrinsics.checkNotNull(segment);
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
                    Intrinsics.checkNotNull(segment);
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
            Intrinsics.checkNotNull(segment);
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
                Intrinsics.checkNotNull(segment);
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
                Intrinsics.checkNotNull(segment);
                j4 = size;
            }
        }
        return -1L;
        return (i4 - i5) + size;
    }

    public static final boolean commonRangeEquals(Buffer commonRangeEquals, long j4, ByteString bytes, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
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

    public static final int commonRead(Buffer commonRead, byte[] sink) {
        Intrinsics.checkNotNullParameter(commonRead, "$this$commonRead");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return commonRead.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(Buffer commonReadAll, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadAll, "$this$commonReadAll");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = commonReadAll.size();
        if (size > 0) {
            sink.write(commonReadAll, size);
        }
        return size;
    }

    public static final byte commonReadByte(Buffer commonReadByte) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByte, "$this$commonReadByte");
        if (commonReadByte.size() == 0) {
            throw new EOFException();
        }
        Segment segment = commonReadByte.head;
        Intrinsics.checkNotNull(segment);
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

    public static final byte[] commonReadByteArray(Buffer commonReadByteArray) {
        Intrinsics.checkNotNullParameter(commonReadByteArray, "$this$commonReadByteArray");
        return commonReadByteArray.readByteArray(commonReadByteArray.size());
    }

    public static final ByteString commonReadByteString(Buffer commonReadByteString) {
        Intrinsics.checkNotNullParameter(commonReadByteString, "$this$commonReadByteString");
        return commonReadByteString.readByteString(commonReadByteString.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[EDGE_INSN: B:48:0x00b8->B:38:0x00b8 BREAK  A[LOOP:0: B:5:0x0016->B:50:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(okio.Buffer r15) throws java.io.EOFException {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc6
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L16:
            okio.Segment r7 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L21:
            if (r9 >= r10) goto La4
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L74
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L74
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L47
            if (r13 != 0) goto L41
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L41
            goto L47
        L41:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L80
        L47:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeDecimalLong(r3)
            okio.Buffer r15 = r15.writeByte(r11)
            if (r1 != 0) goto L59
            r15.readByte()
        L59:
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
        L74:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L85
            if (r0 != 0) goto L85
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L80:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L21
        L85:
            if (r0 == 0) goto L89
            r2 = r13
            goto La4
        L89:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        La4:
            if (r9 != r10) goto Lb0
            okio.Segment r8 = r7.pop()
            r15.head = r8
            okio.SegmentPool.recycle(r7)
            goto Lb2
        Lb0:
            r7.pos = r9
        Lb2:
            if (r2 != 0) goto Lb8
            okio.Segment r7 = r15.head
            if (r7 != 0) goto L16
        Lb8:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.setSize$okio(r5)
            if (r1 == 0) goto Lc4
            goto Lc5
        Lc4:
            long r3 = -r3
        Lc5:
            return r3
        Lc6:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(Buffer commonReadFully, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadFully, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(sink, "sink");
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
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbd
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
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
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L80:
            if (r0 == 0) goto L84
            r1 = 1
            goto L9f
        L84:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L9f:
            if (r8 != r9) goto Lab
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto Lad
        Lab:
            r6.pos = r8
        Lad:
            if (r1 != 0) goto Lb3
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        Lb3:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lbd:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(Buffer commonReadInt) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadInt, "$this$commonReadInt");
        if (commonReadInt.size() < 4) {
            throw new EOFException();
        }
        Segment segment = commonReadInt.head;
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 4) {
            return (commonReadInt.readByte() & UByte.MAX_VALUE) | ((commonReadInt.readByte() & UByte.MAX_VALUE) << 24) | ((commonReadInt.readByte() & UByte.MAX_VALUE) << 16) | ((commonReadInt.readByte() & UByte.MAX_VALUE) << 8);
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & UByte.MAX_VALUE) << 24) | ((bArr[i6] & UByte.MAX_VALUE) << 16);
        int i9 = i7 + 1;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8);
        int i11 = i9 + 1;
        int i12 = i10 | (bArr[i9] & UByte.MAX_VALUE);
        commonReadInt.setSize$okio(commonReadInt.size() - 4);
        if (i11 == i5) {
            commonReadInt.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return i12;
    }

    public static final long commonReadLong(Buffer commonReadLong) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadLong, "$this$commonReadLong");
        if (commonReadLong.size() < 8) {
            throw new EOFException();
        }
        Segment segment = commonReadLong.head;
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 8) {
            return ((commonReadLong.readInt() & 4294967295L) << 32) | (4294967295L & commonReadLong.readInt());
        }
        byte[] bArr = segment.data;
        long j4 = (bArr[i4] & 255) << 56;
        int i6 = i4 + 1 + 1 + 1;
        long j5 = j4 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j6 = j5 | ((bArr[i6] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j7 = j6 | ((bArr[r8] & 255) << 16);
        long j8 = j7 | ((bArr[r1] & 255) << 8);
        int i7 = i6 + 1 + 1 + 1 + 1 + 1;
        long j9 = j8 | (bArr[r8] & 255);
        commonReadLong.setSize$okio(commonReadLong.size() - 8);
        if (i7 == i5) {
            commonReadLong.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return j9;
    }

    public static final short commonReadShort(Buffer commonReadShort) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadShort, "$this$commonReadShort");
        if (commonReadShort.size() < 2) {
            throw new EOFException();
        }
        Segment segment = commonReadShort.head;
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 2) {
            return (short) ((commonReadShort.readByte() & UByte.MAX_VALUE) | ((commonReadShort.readByte() & UByte.MAX_VALUE) << 8));
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & UByte.MAX_VALUE) << 8) | (bArr[i6] & UByte.MAX_VALUE);
        commonReadShort.setSize$okio(commonReadShort.size() - 2);
        if (i7 == i5) {
            commonReadShort.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return (short) i8;
    }

    public static final String commonReadUtf8(Buffer commonReadUtf8, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadUtf8, "$this$commonReadUtf8");
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
        Intrinsics.checkNotNull(segment);
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

    public static final int commonReadUtf8CodePoint(Buffer commonReadUtf8CodePoint) throws EOFException {
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        if (commonReadUtf8CodePoint.size() == 0) {
            throw new EOFException();
        }
        byte b4 = commonReadUtf8CodePoint.getByte(0L);
        if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
            i4 = b4 & ByteCompanionObject.MAX_VALUE;
            i6 = 0;
            i5 = 1;
        } else if ((b4 & 224) == 192) {
            i4 = b4 & 31;
            i5 = 2;
            i6 = 128;
        } else if ((b4 & 240) == 224) {
            i4 = b4 & C3376bw.f1946m;
            i5 = 3;
            i6 = 2048;
        } else {
            if ((b4 & 248) != 240) {
                commonReadUtf8CodePoint.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b4 & 7;
            i5 = 4;
            i6 = 65536;
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

    public static final String commonReadUtf8Line(Buffer commonReadUtf8Line) {
        Intrinsics.checkNotNullParameter(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(commonReadUtf8Line, jIndexOf);
        }
        if (commonReadUtf8Line.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(Buffer commonReadUtf8LineStrict, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
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
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.size(), j4) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    public static final int commonSelect(Buffer commonSelect, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(commonSelect, "$this$commonSelect");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(commonSelect, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        commonSelect.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(Buffer commonSkip, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonSkip, "$this$commonSkip");
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

    public static final ByteString commonSnapshot(Buffer commonSnapshot) {
        Intrinsics.checkNotNullParameter(commonSnapshot, "$this$commonSnapshot");
        if (commonSnapshot.size() <= ((long) Integer.MAX_VALUE)) {
            return commonSnapshot.snapshot((int) commonSnapshot.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + commonSnapshot.size()).toString());
    }

    public static final Segment commonWritableSegment(Buffer commonWritableSegment, int i4) {
        Intrinsics.checkNotNullParameter(commonWritableSegment, "$this$commonWritableSegment");
        if (!(i4 >= 1 && i4 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = commonWritableSegment.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i4 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        commonWritableSegment.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final Buffer commonWrite(Buffer commonWrite, ByteString byteString, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
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
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(commonWrite, i4, i5);
        return commonWrite;
    }

    public static final long commonWriteAll(Buffer commonWriteAll, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(commonWriteAll, "$this$commonWriteAll");
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long j5 = source.read(commonWriteAll, 8192);
            if (j5 == -1) {
                return j4;
            }
            j4 += j5;
        }
    }

    public static final Buffer commonWriteByte(Buffer commonWriteByte, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteByte, "$this$commonWriteByte");
        Segment segmentWritableSegment$okio = commonWriteByte.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i5 + 1;
        bArr[i5] = (byte) i4;
        commonWriteByte.setSize$okio(commonWriteByte.size() + 1);
        return commonWriteByte;
    }

    public static final Buffer commonWriteDecimalLong(Buffer commonWriteDecimalLong, long j4) {
        boolean z3;
        Intrinsics.checkNotNullParameter(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (j4 == 0) {
            return commonWriteDecimalLong.writeByte(48);
        }
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return commonWriteDecimalLong.writeUtf8("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 >= 100000000) {
            i4 = j4 < 1000000000000L ? j4 < 10000000000L ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= 10000) {
            i4 = j4 < AnimationKt.MillisToNanos ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
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

    public static final Buffer commonWriteHexadecimalUnsignedLong(Buffer commonWriteHexadecimalUnsignedLong, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
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

    public static final Buffer commonWriteInt(Buffer commonWriteInt, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteInt, "$this$commonWriteInt");
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

    public static final Buffer commonWriteLong(Buffer commonWriteLong, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteLong, "$this$commonWriteLong");
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

    public static final Buffer commonWriteShort(Buffer commonWriteShort, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteShort, "$this$commonWriteShort");
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

    public static final Buffer commonWriteUtf8(Buffer commonWriteUtf8, String string, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWriteUtf8, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(string, "string");
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
                        int i13 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
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

    public static final Buffer commonWriteUtf8CodePoint(Buffer commonWriteUtf8CodePoint, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
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

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i4, byte[] bytes, int i5, int i6) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i7 = segment.limit;
        byte[] bArr = segment.data;
        while (i5 < i6) {
            if (i4 == i7) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
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

    public static final String readUtf8Line(Buffer readUtf8Line, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(readUtf8Line, "$this$readUtf8Line");
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

    public static final <T> T seek(Buffer seek, long j4, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(seek, "$this$seek");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = seek.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (seek.size() - j4 < j4) {
            long size = seek.size();
            while (size > j4) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j5 = 0;
        while (true) {
            long j6 = (segment.limit - segment.pos) + j5;
            if (j6 > j4) {
                return lambda.invoke(segment, Long.valueOf(j5));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
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
    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
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

    public static final int commonRead(Buffer commonRead, byte[] sink, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonRead, "$this$commonRead");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i4, i5);
        Segment segment = commonRead.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i5, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i6 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, i4, i6, i6 + iMin);
        segment.pos += iMin;
        commonRead.setSize$okio(commonRead.size() - iMin);
        if (segment.pos == segment.limit) {
            commonRead.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(Buffer commonReadByteArray, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByteArray, "$this$commonReadByteArray");
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

    public static final ByteString commonReadByteString(Buffer commonReadByteString, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByteString, "$this$commonReadByteString");
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

    public static final Buffer commonWrite(Buffer commonWrite, byte[] source) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        return commonWrite.write(source, 0, source.length);
    }

    public static final Buffer commonWrite(Buffer commonWrite, byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = i5;
        Util.checkOffsetAndCount(source.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            Segment segmentWritableSegment$okio = commonWrite.writableSegment$okio(1);
            int iMin = Math.min(i6 - i4, 8192 - segmentWritableSegment$okio.limit);
            int i7 = i4 + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i4, i7);
            segmentWritableSegment$okio.limit += iMin;
            i4 = i7;
        }
        commonWrite.setSize$okio(commonWrite.size() + j4);
        return commonWrite;
    }

    public static final void commonReadFully(Buffer commonReadFully, Buffer sink, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadFully, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (commonReadFully.size() >= j4) {
            sink.write(commonReadFully, j4);
        } else {
            sink.write(commonReadFully, commonReadFully.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(Buffer commonSnapshot, int i4) {
        Intrinsics.checkNotNullParameter(commonSnapshot, "$this$commonSnapshot");
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(commonSnapshot.size(), 0L, i4);
        Segment segment = commonSnapshot.head;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Intrinsics.checkNotNull(segment);
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
            Intrinsics.checkNotNull(segment2);
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

    public static final Buffer commonWrite(Buffer commonWrite, Source source, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j4 > 0) {
            long j5 = source.read(commonWrite, j4);
            if (j5 == -1) {
                throw new EOFException();
            }
            j4 -= j5;
        }
        return commonWrite;
    }

    public static final long commonRead(Buffer commonRead, Buffer sink, long j4) {
        Intrinsics.checkNotNullParameter(commonRead, "$this$commonRead");
        Intrinsics.checkNotNullParameter(sink, "sink");
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

    public static final void commonWrite(Buffer commonWrite, Buffer source, long j4) {
        Segment segment;
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != commonWrite) {
            Util.checkOffsetAndCount(source.size(), 0L, j4);
            while (j4 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i4 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (j4 < i4 - r2.pos) {
                    Segment segment3 = commonWrite.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j4) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j4);
                            source.setSize$okio(source.size() - j4);
                            commonWrite.setSize$okio(commonWrite.size() + j4);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) j4);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j5 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = commonWrite.head;
                if (segment7 == null) {
                    commonWrite.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    Intrinsics.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    Intrinsics.checkNotNull(segment8);
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

    public static final long commonIndexOf(Buffer commonIndexOf, ByteString bytes, long j4) {
        long j5 = j4;
        Intrinsics.checkNotNullParameter(commonIndexOf, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        boolean z3 = true;
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
                long size = commonIndexOf.size();
                while (size > j5) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b4 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (commonIndexOf.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    for (int i4 = (int) ((segment.pos + j5) - size); i4 < iMin; i4++) {
                        if (bArr[i4] == b4 && rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                            return (i4 - segment.pos) + size;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
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
                Intrinsics.checkNotNull(segment);
                j6 = j7;
                z3 = z3;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b5 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (commonIndexOf.size() - size4) + 1;
            while (j6 < size5) {
                byte[] bArr2 = segment.data;
                long j8 = j6;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - j6);
                for (int i5 = (int) ((segment.pos + j5) - j8); i5 < iMin2; i5++) {
                    if (bArr2[i5] == b5 && rangeEquals(segment, i5 + 1, bArrInternalArray$okio2, 1, size4)) {
                        return (i5 - segment.pos) + j8;
                    }
                }
                j6 = j8 + (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j5 = j6;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
    }
}

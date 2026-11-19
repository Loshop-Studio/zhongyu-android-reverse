package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import okio.Buffer;
import okio.ByteString;
import okio.C10096SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;

@Metadata(m13412d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a?\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u001a\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\u00140\u0017H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0000\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\r\u0010!\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010\"\u001a\u00020#*\u00020\u0010H\u0080\b\u001a\r\u0010$\u001a\u00020%*\u00020\u0010H\u0080\b\u001a\r\u0010&\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\u0015\u0010(\u001a\u00020#*\u00020\u00102\u0006\u0010)\u001a\u00020\u0012H\u0080\b\u001a\r\u0010*\u001a\u00020+*\u00020\u0010H\u0080\b\u001a\u0015\u0010,\u001a\u00020+*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a)\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0012H\u0002\u001a\u0015\u00105\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0015\u00106\u001a\u00020\t*\u00020\u00102\u0006\u00107\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u0001H\u0080\b\u001a%\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u00109\u001a\u00020\u0001*\u00020\u0010H\u0080\b\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a%\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u0010?\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010@\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010A\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010A\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010B\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0080\b\u001a\u001d\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010C\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020DH\u0080\b\u001a\u0015\u0010E\u001a\u00020\u000f*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u000f\u0010F\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u000f*\u00020\u00102\u0006\u0010H\u001a\u00020\u0012H\u0080\b\u001a\r\u0010I\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a%\u0010J\u001a\u00020\u0010*\u00020\u00102\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010N\u001a\u00020\u0010*\u00020\u00102\u0006\u0010O\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010P\u001a\u00020\u0012*\u00020\u00102\u0006\u00108\u001a\u00020QH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020Q2\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010R\u001a\u00020\u0010*\u00020\u00102\u0006\u0010S\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010T\u001a\u00020\u0010*\u00020\u00102\u0006\u0010U\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0010*\u00020\u00102\u0006\u0010W\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010X\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010-\u001a\u00020+*\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a%\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010S\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010[\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\\\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0012H\u0080\b\u001a-\u0010]\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0017\u0010^\u001a\u00020\u0007*\u00020\u00102\b\u0010_\u001a\u0004\u0018\u00010`H\u0080\b\u001a\r\u0010a\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010b\u001a\u00020\u0010*\u00020\u0010H\u0080\b\u001a\r\u0010c\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010c\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0014\u0010d\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\u0014\u0010g\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\r\u0010h\u001a\u00020\u0005*\u00020eH\u0080\b\u001a\u0015\u0010i\u001a\u00020\u0005*\u00020e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010j\u001a\u00020\u0012*\u00020e2\u0006\u0010k\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010l\u001a\u00020\u0012*\u00020e2\u0006\u0010m\u001a\u00020\u0005H\u0080\b\u001a\r\u0010n\u001a\u00020+*\u00020eH\u0080\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006o"}, m13413d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "readUtf8Line", "", "Lokio/Buffer;", "newline", "", "seek", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "options", "Lokio/Options;", "selectTruncated", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonCompleteSegmentByteCount", "commonReadByte", "", "commonReadShort", "", "commonReadInt", "commonReadLong", "commonGet", "pos", "commonClear", "", "commonSkip", "commonWrite", "byteString", "Lokio/ByteString;", "commonWriteDecimalLong", "v", "countDigitsIn", "DigitCountToLargestValue", "", "commonWriteHexadecimalUnsignedLong", "commonWritableSegment", "minimumCapacity", "source", "commonReadByteArray", "commonRead", "sink", "commonReadFully", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "commonReadAll", "Lokio/Sink;", "commonReadUtf8", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonReadUtf8CodePoint", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "commonWriteAll", "Lokio/Source;", "commonWriteByte", "b", "commonWriteShort", "s", "commonWriteInt", "i", "commonWriteLong", "commonIndexOf", "toIndex", "commonIndexOfElement", "targetBytes", "commonRangeEquals", "commonEquals", "other", "", "commonHashCode", "commonCopy", "commonSnapshot", "commonReadUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadAndWriteUnsafe", "commonNext", "commonSeek", "commonResizeBuffer", "newSize", "commonExpandBuffer", "minByteCount", "commonClose", "okio"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1700:1\n110#1,20:1723\n110#1,20:1756\n110#1:1776\n112#1,18:1778\n110#1,20:1796\n73#2:1701\n73#2:1702\n73#2:1703\n73#2:1704\n73#2:1705\n73#2:1706\n73#2:1707\n73#2:1708\n73#2:1709\n73#2:1710\n73#2:1711\n73#2:1712\n82#2:1713\n82#2:1714\n76#2:1715\n76#2:1716\n76#2:1717\n76#2:1718\n76#2:1719\n76#2:1720\n76#2:1721\n76#2:1722\n85#2:1743\n88#2:1745\n73#2:1746\n73#2:1747\n73#2:1748\n73#2:1749\n73#2:1750\n73#2:1751\n73#2:1752\n73#2:1753\n73#2:1754\n73#2:1755\n88#2:1777\n85#2:1816\n1#3:1744\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1723,20\n1262#1:1756,20\n1293#1:1776\n1293#1:1778,18\n1327#1:1796,20\n176#1:1701\n200#1:1702\n319#1:1703\n324#1:1704\n347#1:1705\n348#1:1706\n349#1:1707\n350#1:1708\n356#1:1709\n357#1:1710\n358#1:1711\n359#1:1712\n383#1:1713\n384#1:1714\n390#1:1715\n391#1:1716\n392#1:1717\n393#1:1718\n394#1:1719\n395#1:1720\n396#1:1721\n397#1:1722\n425#1:1743\n858#1:1745\n876#1:1746\n878#1:1747\n882#1:1748\n884#1:1749\n888#1:1750\n890#1:1751\n894#1:1752\n896#1:1753\n916#1:1754\n919#1:1755\n1306#1:1777\n1646#1:1816\n*E\n"})
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Buffer {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    private static final long[] DigitCountToLargestValue = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final void commonClear(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer out, long j9, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j11 = j9;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j11, j10);
        if (j10 != 0) {
            out.setSize$okio(out.size() + j10);
            Segment segment = buffer.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i9 = segment.limit;
                int i10 = segment.pos;
                if (j11 < i9 - i10) {
                    break;
                }
                j11 -= i9 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j12 = j10;
            while (j12 > 0) {
                Intrinsics.checkNotNull(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i11 = segmentSharedCopy.pos + ((int) j11);
                segmentSharedCopy.pos = i11;
                segmentSharedCopy.limit = Math.min(i11 + ((int) j12), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.prev;
                    Intrinsics.checkNotNull(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j12 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j11 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(okio.Buffer buffer, Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i9 = segment.pos;
        int i10 = segment2.pos;
        long j9 = 0;
        while (j9 < buffer.size()) {
            long jMin = Math.min(segment.limit - i9, segment2.limit - i10);
            long j10 = 0;
            while (j10 < jMin) {
                int i11 = i9 + 1;
                int i12 = i10 + 1;
                if (segment.data[i9] != segment2.data[i10]) {
                    return false;
                }
                j10++;
                i9 = i11;
                i10 = i12;
            }
            if (i9 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i9 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i10 = segment2.pos;
            }
            j9 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i9) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i9 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i9).toString());
        }
        if (i9 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i9).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
        int i10 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j9 = i10;
        buffer.setSize$okio(size + j9);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i10;
        unsafeCursor.end = 8192;
        return j9;
    }

    public static final byte commonGet(okio.Buffer buffer, long j9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j9, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j9 < j9) {
            long size = buffer.size();
            while (size > j9) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j9) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = (segment.limit - segment.pos) + j10;
            if (j11 > j9) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j9) - j10)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = j11;
        }
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i9 = (i9 * 31) + segment.data[i11];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i9;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b10, long j9, long j10) {
        Segment segment;
        int i9;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j9 || j9 > j10) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        if (j10 > buffer.size()) {
            j10 = buffer.size();
        }
        if (j9 == j10 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j9 < j9) {
            size = buffer.size();
            while (size > j9) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j10) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j10) - size);
                i9 = (int) ((segment.pos + j9) - size);
                while (i9 < iMin) {
                    if (bArr[i9] != b10) {
                        i9++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j9 = size;
            }
            return -1L;
        }
        while (true) {
            long j11 = (segment.limit - segment.pos) + size;
            if (j11 > j9) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j11;
        }
        while (size < j10) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j10) - size);
            i9 = (int) ((segment.pos + j9) - size);
            while (i9 < iMin2) {
                if (bArr2[i9] != b10) {
                    i9++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j9 = size;
        }
        return -1L;
        return (i9 - segment.pos) + size;
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, ByteString targetBytes, long j9) {
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j9 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j9).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j9 < j9) {
            size = buffer.size();
            while (size > j9) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i9 = (int) ((segment.pos + j9) - size);
                    int i11 = segment.limit;
                    while (i9 < i11) {
                        byte b12 = bArr[i9];
                        if (b12 == b10 || b12 == b11) {
                            i10 = segment.pos;
                        } else {
                            i9++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j9 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i9 = (int) ((segment.pos + j9) - size);
                    int i12 = segment.limit;
                    while (i9 < i12) {
                        byte b13 = bArr2[i9];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                i10 = segment.pos;
                            }
                        }
                        i9++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j9 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (segment.limit - segment.pos) + size;
            if (j10 > j9) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j10;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i9 = (int) ((segment.pos + j9) - size);
                int i13 = segment.limit;
                while (i9 < i13) {
                    byte b17 = bArr3[i9];
                    if (b17 == b15 || b17 == b16) {
                        i10 = segment.pos;
                    } else {
                        i9++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j9 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i9 = (int) ((segment.pos + j9) - size);
                int i14 = segment.limit;
                while (i9 < i14) {
                    byte b18 = bArr4[i9];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            i10 = segment.pos;
                        }
                    }
                    i9++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j9 = size;
            }
        }
        return -1L;
        return (i9 - i10) + size;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j9 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j9 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j10 = unsafeCursor.offset;
        return unsafeCursor.seek(j10 == -1 ? 0L : j10 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j9, ByteString bytes, int i9, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j9 < 0 || i9 < 0 || i10 < 0 || buffer.size() - j9 < i10 || bytes.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (buffer.getByte(i11 + j9) != bytes.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(okio.Buffer buffer, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        int i11 = i9 + 1;
        byte b10 = segment.data[i9];
        buffer.setSize$okio(buffer.size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i9 = 0;
        while (i9 < sink.length) {
            int i10 = buffer.read(sink, i9, sink.length - i9);
            if (i10 == -1) {
                throw new EOFException();
            }
            i9 += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[EDGE_INSN: B:43:0x00ac->B:37:0x00ac BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
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
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
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
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L98:
            if (r8 != r9) goto La4
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La6
        La4:
            r6.pos = r8
        La6:
            if (r1 != 0) goto Lac
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        Lac:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb6:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 4) {
            return (buffer.readByte() & UByte.MAX_VALUE) | ((buffer.readByte() & UByte.MAX_VALUE) << 24) | ((buffer.readByte() & UByte.MAX_VALUE) << 16) | ((buffer.readByte() & UByte.MAX_VALUE) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 3;
        int i12 = ((bArr[i9 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i9] & UByte.MAX_VALUE) << 24) | ((bArr[i9 + 2] & UByte.MAX_VALUE) << 8);
        int i13 = i9 + 4;
        int i14 = (bArr[i11] & UByte.MAX_VALUE) | i12;
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 7;
        long j9 = ((bArr[i9] & 255) << 56) | ((bArr[i9 + 1] & 255) << 48) | ((bArr[i9 + 2] & 255) << 40) | ((bArr[i9 + 3] & 255) << 32) | ((bArr[i9 + 4] & 255) << 24) | ((bArr[i9 + 5] & 255) << 16) | ((bArr[i9 + 6] & 255) << 8);
        int i12 = i9 + 8;
        long j10 = j9 | (bArr[i11] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j10;
    }

    public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i9 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i9 < 2) {
            return (short) ((buffer.readByte() & UByte.MAX_VALUE) | ((buffer.readByte() & UByte.MAX_VALUE) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i9 + 1;
        int i12 = (bArr[i9] & UByte.MAX_VALUE) << 8;
        int i13 = i9 + 2;
        int i14 = (bArr[i11] & UByte.MAX_VALUE) | i12;
        buffer.setSize$okio(buffer.size() - 2);
        if (i13 == i10) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final String commonReadUtf8(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 < 0 || j9 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (buffer.size() < j9) {
            throw new EOFException();
        }
        if (j9 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i9 = segment.pos;
        if (i9 + j9 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j9), 0, 0, 3, null);
        }
        int i10 = (int) j9;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i9, i9 + i10);
        segment.pos += i10;
        buffer.setSize$okio(buffer.size() - j9);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
            i9 = b10 & ByteCompanionObject.MAX_VALUE;
            i11 = 0;
            i10 = 1;
        } else if ((b10 & 224) == 192) {
            i9 = b10 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b10 & 240) == 224) {
            i9 = b10 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j9 = i10;
        if (buffer.size() < j9) {
            throw new EOFException("size < " + i10 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b10) + ')');
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte b11 = buffer.getByte(j10);
            if ((b11 & 192) != 128) {
                buffer.skip(j10);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i9 = (i9 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j9);
        return i9 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i9 || i9 >= 57344) && i9 >= i11) ? i9 : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 != Long.MAX_VALUE ? j9 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j10 < buffer.size() && buffer.getByte(j10 - 1) == 13 && buffer.getByte(j10) == 10) {
            return readUtf8Line(buffer, j10);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j9) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j9) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j9 <= size) {
            if (j9 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j9).toString());
            }
            long j10 = size - j9;
            while (true) {
                if (j10 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i9 = segment2.limit;
                long j11 = i9 - segment2.pos;
                if (j11 > j10) {
                    segment2.limit = i9 - ((int) j10);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j10 -= j11;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j9;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j9 > size) {
            long j12 = j9 - size;
            boolean z9 = true;
            while (j12 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j12, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j12 -= iMin;
                if (z9) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i10 - iMin;
                    unsafeCursor.end = i10;
                    z9 = false;
                }
            }
        }
        buffer.setSize$okio(j9);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j9) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j9 < -1 || j9 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j9 + " > size=" + buffer.size());
        }
        if (j9 == -1 || j9 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j9;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j10 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j11 = unsafeCursor.offset;
            int i9 = unsafeCursor.start;
            Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j12 = j11 - (i9 - r9.pos);
            if (j12 > j9) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j12;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j10 = j12;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j9 > j9 - j10) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i10 = segmentPush.limit;
                int i11 = segmentPush.pos;
                if (j9 < (i10 - i11) + j10) {
                    break;
                }
                j10 += i10 - i11;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j9) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            j10 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment2 = segmentPush.prev;
                Intrinsics.checkNotNull(segment2);
                segment2.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j9;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i12 = segmentPush.pos + ((int) (j9 - j10));
        unsafeCursor.start = i12;
        int i13 = segmentPush.limit;
        unsafeCursor.end = i13;
        return i13 - i12;
    }

    public static final int commonSelect(okio.Buffer buffer, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j9 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j9, segment.limit - segment.pos);
            long j10 = iMin;
            buffer.setSize$okio(buffer.size() - j10);
            j9 -= j10;
            int i9 = segment.pos + iMin;
            segment.pos = i9;
            if (i9 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= SieveCacheKt.NodeLinkMask) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i9 < 1 || i9 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i9 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i9, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i9, i10);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i9, i10);
        return buffer;
    }

    public static final long commonWriteAll(okio.Buffer buffer, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j9 = 0;
        while (true) {
            long j10 = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j10 == -1) {
                return j9;
            }
            j9 += j10;
        }
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j9) {
        boolean z9;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 == 0) {
            return buffer.writeByte(48);
        }
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        int iCountDigitsIn = countDigitsIn(j9);
        if (z9) {
            iCountDigitsIn++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(iCountDigitsIn);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i9 = segmentWritableSegment$okio.limit + iCountDigitsIn;
        while (j9 != 0) {
            long j10 = 10;
            i9--;
            bArr[i9] = getHEX_DIGIT_BYTES()[(int) (j9 % j10)];
            j9 /= j10;
        }
        if (z9) {
            bArr[i9 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += iCountDigitsIn;
        buffer.setSize$okio(buffer.size() + iCountDigitsIn);
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 == 0) {
            return buffer.writeByte(48);
        }
        long j10 = (j9 >>> 1) | j9;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i9 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i9);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j9)];
            j9 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i9;
        buffer.setSize$okio(buffer.size() + i9);
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i9 = segmentWritableSegment$okio.limit;
        bArr[i9] = (byte) ((j9 >>> 56) & 255);
        bArr[i9 + 1] = (byte) ((j9 >>> 48) & 255);
        bArr[i9 + 2] = (byte) ((j9 >>> 40) & 255);
        bArr[i9 + 3] = (byte) ((j9 >>> 32) & 255);
        bArr[i9 + 4] = (byte) ((j9 >>> 24) & 255);
        bArr[i9 + 5] = (byte) ((j9 >>> 16) & 255);
        bArr[i9 + 6] = (byte) ((j9 >>> 8) & 255);
        bArr[i9 + 7] = (byte) (j9 & 255);
        segmentWritableSegment$okio.limit = i9 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String string, int i9, int i10) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i9 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i9).toString());
        }
        if (i10 < i9) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i9).toString());
        }
        if (i10 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + string.length()).toString());
        }
        while (i9 < i10) {
            char cCharAt2 = string.charAt(i9);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit - i9;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i9 + 1;
                bArr[i9 + i11] = (byte) cCharAt2;
                while (true) {
                    i9 = i12;
                    if (i9 >= iMin || (cCharAt = string.charAt(i9)) >= 128) {
                        break;
                    }
                    i12 = i9 + 1;
                    bArr[i9 + i11] = (byte) cCharAt;
                }
                int i13 = segmentWritableSegment$okio.limit;
                int i14 = (i11 + i9) - i13;
                segmentWritableSegment$okio.limit = i13 + i14;
                buffer.setSize$okio(buffer.size() + i14);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i17 = i9 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i9 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i9 += 2;
                    }
                }
                i9++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i9 < 128) {
            buffer.writeByte(i9);
            return buffer;
        }
        if (i9 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i9 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i9 && i9 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i9 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i9 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i9 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i9 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i9 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i9));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i9 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i9 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i9 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i9 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countDigitsIn(long j9) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j9 > DigitCountToLargestValue[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i9, byte[] bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = segment.limit;
        byte[] bArr = segment.data;
        while (i10 < i11) {
            if (i9 == i12) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i9 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr[i9] != bytes[i10]) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 > 0) {
            long j10 = j9 - 1;
            if (buffer.getByte(j10) == 13) {
                String utf8 = buffer.readUtf8(j10);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j9);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(okio.Buffer buffer, long j9, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j9 < j9) {
            long size = buffer.size();
            while (size > j9) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j10 = 0;
        while (true) {
            long j11 = (segment.limit - segment.pos) + j10;
            if (j11 > j9) {
                return lambda.invoke(segment, Long.valueOf(j10));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return selectPrefix(buffer, options, z9);
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink, int i9, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i9, i10);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i11 = segment.pos;
        ArraysKt.copyInto(bArr, sink, i9, i11, i11 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 < 0 || j9 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (buffer.size() < j9) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j9];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j9 < 0 || j9 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (buffer.size() < j9) {
            throw new EOFException();
        }
        if (j9 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(buffer.readByteArray(j9));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j9);
        buffer.skip(j9);
        return byteStringSnapshot;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source, int i9, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j9 = i10;
        SegmentedByteString.checkOffsetAndCount(source.length, i9, j9);
        int i11 = i10 + i9;
        while (i9 < i11) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i11 - i9, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i9 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i9, i12);
            segmentWritableSegment$okio.limit += iMin;
            i9 = i12;
        }
        buffer.setSize$okio(buffer.size() + j9);
        return buffer;
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer sink, long j9) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j9) {
            sink.write(buffer, j9);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer, int i9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i9);
        Segment segment = buffer.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            Intrinsics.checkNotNull(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = buffer.head;
        int i15 = 0;
        while (i10 < i9) {
            Intrinsics.checkNotNull(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i9);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C10096SegmentedByteString(bArr, iArr);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j9) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j9 > 0) {
            long j10 = source.read(buffer, j9);
            if (j10 == -1) {
                throw new EOFException();
            }
            j9 -= j10;
        }
        return buffer;
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer sink, long j9) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j9 > buffer.size()) {
            j9 = buffer.size();
        }
        sink.write(buffer, j9);
        return j9;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer source, long j9) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j9);
            while (j9 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i9 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (j9 < i9 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j9) - (segment.shared ? 0 : segment.pos) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j9);
                            source.setSize$okio(source.size() - j9);
                            buffer.setSize$okio(buffer.size() + j9);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) j9);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j10 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    Intrinsics.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    Intrinsics.checkNotNull(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j10);
                buffer.setSize$okio(buffer.size() + j10);
                j9 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(okio.Buffer buffer, ByteString bytes, long j9) {
        int i9;
        long j10 = j9;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j10 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j10 < j10) {
                size = buffer.size();
                while (size > j10) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i9 = (int) ((segment.pos + j10) - size);
                    while (i9 < iMin) {
                        if (bArr[i9] != b10 || !rangeEquals(segment, i9 + 1, bArrInternalArray$okio, 1, size2)) {
                            i9++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j10 = size;
                }
                return -1L;
            }
            while (true) {
                long j11 = (segment.limit - segment.pos) + size;
                if (j11 > j10) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = j11;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j12 = size5;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i9 = (int) ((segment.pos + j10) - size);
                while (i9 < iMin2) {
                    if (bArr2[i9] == b11 && rangeEquals(segment, i9 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i9++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size5 = j12;
                j10 = size;
            }
            return -1L;
            return (i9 - segment.pos) + size;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }
}

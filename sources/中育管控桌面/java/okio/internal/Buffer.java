package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.io.EOFException;
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
import okio.C8049SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;

@Metadata(m7879d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a?\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u001a\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\u00140\u0017H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0000\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\r\u0010!\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010\"\u001a\u00020#*\u00020\u0010H\u0080\b\u001a\r\u0010$\u001a\u00020%*\u00020\u0010H\u0080\b\u001a\r\u0010&\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\u0015\u0010(\u001a\u00020#*\u00020\u00102\u0006\u0010)\u001a\u00020\u0012H\u0080\b\u001a\r\u0010*\u001a\u00020+*\u00020\u0010H\u0080\b\u001a\u0015\u0010,\u001a\u00020+*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a)\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0012H\u0002\u001a\u0015\u00105\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0015\u00106\u001a\u00020\t*\u00020\u00102\u0006\u00107\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u0001H\u0080\b\u001a%\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u00109\u001a\u00020\u0001*\u00020\u0010H\u0080\b\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a%\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u0010?\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010@\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010A\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010A\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010B\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0080\b\u001a\u001d\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010C\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020DH\u0080\b\u001a\u0015\u0010E\u001a\u00020\u000f*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u000f\u0010F\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u000f*\u00020\u00102\u0006\u0010H\u001a\u00020\u0012H\u0080\b\u001a\r\u0010I\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a%\u0010J\u001a\u00020\u0010*\u00020\u00102\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010N\u001a\u00020\u0010*\u00020\u00102\u0006\u0010O\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010P\u001a\u00020\u0012*\u00020\u00102\u0006\u00108\u001a\u00020QH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020Q2\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010R\u001a\u00020\u0010*\u00020\u00102\u0006\u0010S\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010T\u001a\u00020\u0010*\u00020\u00102\u0006\u0010U\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0010*\u00020\u00102\u0006\u0010W\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010X\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010-\u001a\u00020+*\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a%\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010S\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0080\b\u001a:\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010Z\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0005H\u0000\u001a\u001d\u0010[\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\\\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0012H\u0080\b\u001a-\u0010]\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0017\u0010^\u001a\u00020\u0007*\u00020\u00102\b\u0010_\u001a\u0004\u0018\u00010`H\u0080\b\u001a\r\u0010a\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010b\u001a\u00020\u0010*\u00020\u0010H\u0080\b\u001a\r\u0010c\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010c\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0014\u0010d\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\u0014\u0010g\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\r\u0010h\u001a\u00020\u0005*\u00020eH\u0080\b\u001a\u0015\u0010i\u001a\u00020\u0005*\u00020e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010j\u001a\u00020\u0012*\u00020e2\u0006\u0010k\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010l\u001a\u00020\u0012*\u00020e2\u0006\u0010m\u001a\u00020\u0005H\u0080\b\u001a\r\u0010n\u001a\u00020+*\u00020eH\u0080\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006o"}, m7880d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "readUtf8Line", "", "Lokio/Buffer;", "newline", "", "seek", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "options", "Lokio/Options;", "selectTruncated", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonCompleteSegmentByteCount", "commonReadByte", "", "commonReadShort", "", "commonReadInt", "commonReadLong", "commonGet", "pos", "commonClear", "", "commonSkip", "commonWrite", "byteString", "Lokio/ByteString;", "commonWriteDecimalLong", "v", "countDigitsIn", "DigitCountToLargestValue", "", "commonWriteHexadecimalUnsignedLong", "commonWritableSegment", "minimumCapacity", "source", "commonReadByteArray", "commonRead", "sink", "commonReadFully", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "commonReadAll", "Lokio/Sink;", "commonReadUtf8", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonReadUtf8CodePoint", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "commonWriteAll", "Lokio/Source;", "commonWriteByte", "b", "commonWriteShort", "s", "commonWriteInt", "i", "commonWriteLong", "commonIndexOf", "toIndex", "commonIndexOfElement", "targetBytes", "commonRangeEquals", "commonEquals", "other", "", "commonHashCode", "commonCopy", "commonSnapshot", "commonReadUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadAndWriteUnsafe", "commonNext", "commonSeek", "commonResizeBuffer", "newSize", "commonExpandBuffer", "minByteCount", "commonClose", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n110#1,20:1735\n110#1,20:1768\n110#1:1788\n112#1,18:1790\n110#1,20:1808\n73#2:1713\n73#2:1714\n73#2:1715\n73#2:1716\n73#2:1717\n73#2:1718\n73#2:1719\n73#2:1720\n73#2:1721\n73#2:1722\n73#2:1723\n73#2:1724\n82#2:1725\n82#2:1726\n76#2:1727\n76#2:1728\n76#2:1729\n76#2:1730\n76#2:1731\n76#2:1732\n76#2:1733\n76#2:1734\n85#2:1755\n88#2:1757\n73#2:1758\n73#2:1759\n73#2:1760\n73#2:1761\n73#2:1762\n73#2:1763\n73#2:1764\n73#2:1765\n73#2:1766\n73#2:1767\n88#2:1789\n85#2:1828\n1#3:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1735,20\n1262#1:1768,20\n1305#1:1788\n1305#1:1790,18\n1341#1:1808,20\n176#1:1713\n200#1:1714\n319#1:1715\n324#1:1716\n347#1:1717\n348#1:1718\n349#1:1719\n350#1:1720\n356#1:1721\n357#1:1722\n358#1:1723\n359#1:1724\n383#1:1725\n384#1:1726\n390#1:1727\n391#1:1728\n392#1:1729\n393#1:1730\n394#1:1731\n395#1:1732\n396#1:1733\n397#1:1734\n425#1:1755\n858#1:1757\n876#1:1758\n878#1:1759\n882#1:1760\n884#1:1761\n888#1:1762\n890#1:1763\n894#1:1764\n896#1:1765\n916#1:1766\n919#1:1767\n1317#1:1789\n1658#1:1828\n*E\n"})
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes4.dex */
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

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer out, long j6, long j7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j8 = j6;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j8, j7);
        if (j7 != 0) {
            out.setSize$okio(out.size() + j7);
            Segment segment = buffer.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i6 = segment.limit;
                int i7 = segment.pos;
                if (j8 < i6 - i7) {
                    break;
                }
                j8 -= i6 - i7;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j9 = j7;
            while (j9 > 0) {
                Intrinsics.checkNotNull(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i8 = segmentSharedCopy.pos + ((int) j8);
                segmentSharedCopy.pos = i8;
                segmentSharedCopy.limit = Math.min(i8 + ((int) j9), segmentSharedCopy.limit);
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
                j9 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j8 = 0;
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
        int i6 = segment.pos;
        int i7 = segment2.pos;
        long j6 = 0;
        while (j6 < buffer.size()) {
            long jMin = Math.min(segment.limit - i6, segment2.limit - i7);
            long j7 = 0;
            while (j7 < jMin) {
                int i8 = i6 + 1;
                int i9 = i7 + 1;
                if (segment.data[i6] != segment2.data[i7]) {
                    return false;
                }
                j7++;
                i6 = i8;
                i7 = i9;
            }
            if (i6 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i6 = segment.pos;
            }
            if (i7 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i7 = segment2.pos;
            }
            j6 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i6) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i6 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i6).toString());
        }
        if (i6 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i6).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i6);
        int i7 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j6 = i7;
        buffer.setSize$okio(size + j6);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i7;
        unsafeCursor.end = 8192;
        return j6;
    }

    public static final byte commonGet(okio.Buffer buffer, long j6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j6, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j6 < j6) {
            long size = buffer.size();
            while (size > j6) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j6) - size)];
        }
        long j7 = 0;
        while (true) {
            long j8 = (segment.limit - segment.pos) + j7;
            if (j8 > j6) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j6) - j7)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j7 = j8;
        }
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i7 = segment.limit;
            for (int i8 = segment.pos; i8 < i7; i8++) {
                i6 = (i6 * 31) + segment.data[i8];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i6;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b7, long j6, long j7) {
        Segment segment;
        int i6;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j6 || j6 > j7) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j6 + " toIndex=" + j7).toString());
        }
        if (j7 > buffer.size()) {
            j7 = buffer.size();
        }
        if (j6 == j7 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j6 < j6) {
            size = buffer.size();
            while (size > j6) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j7) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j7) - size);
                i6 = (int) ((segment.pos + j6) - size);
                while (i6 < iMin) {
                    if (bArr[i6] != b7) {
                        i6++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j6 = size;
            }
            return -1L;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + size;
            if (j8 > j6) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j8;
        }
        while (size < j7) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j7) - size);
            i6 = (int) ((segment.pos + j6) - size);
            while (i6 < iMin2) {
                if (bArr2[i6] != b7) {
                    i6++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j6 = size;
        }
        return -1L;
        return (i6 - segment.pos) + size;
    }

    public static /* synthetic */ long commonIndexOf$default(okio.Buffer buffer, ByteString byteString, long j6, long j7, int i6, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return commonIndexOf(buffer, byteString, j6, j7, (i8 & 8) != 0 ? 0 : i6, (i8 & 16) != 0 ? byteString.size() : i7);
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, ByteString targetBytes, long j6) {
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j6 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j6).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j6 < j6) {
            size = buffer.size();
            while (size > j6) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b7 = targetBytes.getByte(0);
                byte b8 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i6 = (int) ((segment.pos + j6) - size);
                    int i8 = segment.limit;
                    while (i6 < i8) {
                        byte b9 = bArr[i6];
                        if (b9 == b7 || b9 == b8) {
                            i7 = segment.pos;
                        } else {
                            i6++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j6 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i6 = (int) ((segment.pos + j6) - size);
                    int i9 = segment.limit;
                    while (i6 < i9) {
                        byte b10 = bArr2[i6];
                        for (byte b11 : bArrInternalArray$okio) {
                            if (b10 == b11) {
                                i7 = segment.pos;
                            }
                        }
                        i6++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j6 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j7 = (segment.limit - segment.pos) + size;
            if (j7 > j6) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j7;
        }
        if (targetBytes.size() == 2) {
            byte b12 = targetBytes.getByte(0);
            byte b13 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i6 = (int) ((segment.pos + j6) - size);
                int i10 = segment.limit;
                while (i6 < i10) {
                    byte b14 = bArr3[i6];
                    if (b14 == b12 || b14 == b13) {
                        i7 = segment.pos;
                    } else {
                        i6++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j6 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i6 = (int) ((segment.pos + j6) - size);
                int i11 = segment.limit;
                while (i6 < i11) {
                    byte b15 = bArr4[i6];
                    for (byte b16 : bArrInternalArray$okio2) {
                        if (b15 == b16) {
                            i7 = segment.pos;
                        }
                    }
                    i6++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j6 = size;
            }
        }
        return -1L;
        return (i6 - i7) + size;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j6 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j6 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j7 = unsafeCursor.offset;
        return unsafeCursor.seek(j7 == -1 ? 0L : j7 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j6, ByteString bytes, int i6, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return i7 >= 0 && j6 >= 0 && ((long) i7) + j6 <= buffer.size() && i6 >= 0 && i6 + i7 <= bytes.size() && (i7 == 0 || commonIndexOf(buffer, bytes, j6, j6 + 1, i6, i7) != -1);
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(okio.Buffer buffer, Sink sink) {
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
        int i6 = segment.pos;
        int i7 = segment.limit;
        int i8 = i6 + 1;
        byte b7 = segment.data[i6];
        buffer.setSize$okio(buffer.size() - 1);
        if (i8 != i7) {
            segment.pos = i8;
            return b7;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b7;
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
        int i6 = 0;
        while (i6 < sink.length) {
            int i7 = buffer.read(sink, i6, sink.length - i6);
            if (i7 == -1) {
                throw new EOFException();
            }
            i6 += i7;
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
        int i6 = segment.pos;
        int i7 = segment.limit;
        if (i7 - i6 < 4) {
            return (buffer.readByte() & UByte.MAX_VALUE) | ((buffer.readByte() & UByte.MAX_VALUE) << 24) | ((buffer.readByte() & UByte.MAX_VALUE) << 16) | ((buffer.readByte() & UByte.MAX_VALUE) << 8);
        }
        byte[] bArr = segment.data;
        int i8 = i6 + 3;
        int i9 = ((bArr[i6 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i6] & UByte.MAX_VALUE) << 24) | ((bArr[i6 + 2] & UByte.MAX_VALUE) << 8);
        int i10 = i6 + 4;
        int i11 = (bArr[i8] & UByte.MAX_VALUE) | i9;
        buffer.setSize$okio(buffer.size() - 4);
        if (i10 != i7) {
            segment.pos = i10;
            return i11;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i11;
    }

    public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i6 = segment.pos;
        int i7 = segment.limit;
        if (i7 - i6 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i8 = i6 + 7;
        long j6 = ((bArr[i6] & 255) << 56) | ((bArr[i6 + 1] & 255) << 48) | ((bArr[i6 + 2] & 255) << 40) | ((bArr[i6 + 3] & 255) << 32) | ((bArr[i6 + 4] & 255) << 24) | ((bArr[i6 + 5] & 255) << 16) | ((bArr[i6 + 6] & 255) << 8);
        int i9 = i6 + 8;
        long j7 = j6 | (bArr[i8] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i9 != i7) {
            segment.pos = i9;
            return j7;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j7;
    }

    public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i6 = segment.pos;
        int i7 = segment.limit;
        if (i7 - i6 < 2) {
            return (short) ((buffer.readByte() & UByte.MAX_VALUE) | ((buffer.readByte() & UByte.MAX_VALUE) << 8));
        }
        byte[] bArr = segment.data;
        int i8 = i6 + 1;
        int i9 = (bArr[i6] & UByte.MAX_VALUE) << 8;
        int i10 = i6 + 2;
        int i11 = (bArr[i8] & UByte.MAX_VALUE) | i9;
        buffer.setSize$okio(buffer.size() - 2);
        if (i10 == i7) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i10;
        }
        return (short) i11;
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

    public static final String commonReadUtf8(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 < 0 || j6 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (buffer.size() < j6) {
            throw new EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i6 = segment.pos;
        if (i6 + j6 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j6), 0, 0, 3, null);
        }
        int i7 = (int) j6;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i6, i6 + i7);
        segment.pos += i7;
        buffer.setSize$okio(buffer.size() - j6);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b7 = buffer.getByte(0L);
        if ((b7 & ByteCompanionObject.MIN_VALUE) == 0) {
            i6 = b7 & ByteCompanionObject.MAX_VALUE;
            i8 = 0;
            i7 = 1;
        } else if ((b7 & 224) == 192) {
            i6 = b7 & 31;
            i7 = 2;
            i8 = 128;
        } else if ((b7 & 240) == 224) {
            i6 = b7 & 15;
            i7 = 3;
            i8 = 2048;
        } else {
            if ((b7 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i6 = b7 & 7;
            i7 = 4;
            i8 = 65536;
        }
        long j6 = i7;
        if (buffer.size() < j6) {
            throw new EOFException("size < " + i7 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b7) + ')');
        }
        for (int i9 = 1; i9 < i7; i9++) {
            long j7 = i9;
            byte b8 = buffer.getByte(j7);
            if ((b8 & 192) != 128) {
                buffer.skip(j7);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i6 = (i6 << 6) | (b8 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j6);
        return i6 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i6 || i6 >= 57344) && i6 >= i8) ? i6 : Utf8.REPLACEMENT_CODE_POINT;
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

    public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j6).toString());
        }
        long j7 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j7);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j7 < buffer.size() && buffer.getByte(j7 - 1) == 13 && buffer.getByte(j7) == 10) {
            return readUtf8Line(buffer, j7);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j6) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j6) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j6 <= size) {
            if (j6 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j6).toString());
            }
            long j7 = size - j6;
            while (true) {
                if (j7 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i6 = segment2.limit;
                long j8 = i6 - segment2.pos;
                if (j8 > j7) {
                    segment2.limit = i6 - ((int) j7);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j7 -= j8;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j6;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j6 > size) {
            long j9 = j6 - size;
            boolean z6 = true;
            while (j9 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j9, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j9 -= iMin;
                if (z6) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i7 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i7 - iMin;
                    unsafeCursor.end = i7;
                    z6 = false;
                }
            }
        }
        buffer.setSize$okio(j6);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j6) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j6 < -1 || j6 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j6 + " > size=" + buffer.size());
        }
        if (j6 == -1 || j6 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j6;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j7 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j8 = unsafeCursor.offset;
            int i6 = unsafeCursor.start;
            Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j9 = j8 - (i6 - r9.pos);
            if (j9 > j6) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j9;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j7 = j9;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j6 > j6 - j7) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i7 = segmentPush.limit;
                int i8 = segmentPush.pos;
                if (j6 < (i7 - i8) + j7) {
                    break;
                }
                j7 += i7 - i8;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j6) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            j7 = size;
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
        unsafeCursor.offset = j6;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i9 = segmentPush.pos + ((int) (j6 - j7));
        unsafeCursor.start = i9;
        int i10 = segmentPush.limit;
        unsafeCursor.end = i10;
        return i10 - i9;
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

    public static final void commonSkip(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j6 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j6, segment.limit - segment.pos);
            long j7 = iMin;
            buffer.setSize$okio(buffer.size() - j7);
            j6 -= j7;
            int i6 = segment.pos + iMin;
            segment.pos = i6;
            if (i6 == segment.limit) {
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

    public static final Segment commonWritableSegment(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i6 < 1 || i6 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i6 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i6, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i6, i7);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i6, i7);
        return buffer;
    }

    public static final long commonWriteAll(okio.Buffer buffer, Source source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j6 = 0;
        while (true) {
            long j7 = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j7 == -1) {
                return j6;
            }
            j6 += j7;
        }
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i7 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i7 + 1;
        bArr[i7] = (byte) i6;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j6) {
        boolean z6;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 == 0) {
            return buffer.writeByte(48);
        }
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z6 = true;
        } else {
            z6 = false;
        }
        int iCountDigitsIn = countDigitsIn(j6);
        if (z6) {
            iCountDigitsIn++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(iCountDigitsIn);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i6 = segmentWritableSegment$okio.limit + iCountDigitsIn;
        while (j6 != 0) {
            long j7 = 10;
            i6--;
            bArr[i6] = getHEX_DIGIT_BYTES()[(int) (j6 % j7)];
            j6 /= j7;
        }
        if (z6) {
            bArr[i6 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += iCountDigitsIn;
        buffer.setSize$okio(buffer.size() + iCountDigitsIn);
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 == 0) {
            return buffer.writeByte(48);
        }
        long j7 = (j6 >>> 1) | j6;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i6 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i6);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i7 = segmentWritableSegment$okio.limit;
        for (int i8 = (i7 + i6) - 1; i8 >= i7; i8--) {
            bArr[i8] = getHEX_DIGIT_BYTES()[(int) (15 & j6)];
            j6 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i6;
        buffer.setSize$okio(buffer.size() + i6);
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i7 = segmentWritableSegment$okio.limit;
        bArr[i7] = (byte) ((i6 >>> 24) & 255);
        bArr[i7 + 1] = (byte) ((i6 >>> 16) & 255);
        bArr[i7 + 2] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 3] = (byte) (i6 & 255);
        segmentWritableSegment$okio.limit = i7 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i6 = segmentWritableSegment$okio.limit;
        bArr[i6] = (byte) ((j6 >>> 56) & 255);
        bArr[i6 + 1] = (byte) ((j6 >>> 48) & 255);
        bArr[i6 + 2] = (byte) ((j6 >>> 40) & 255);
        bArr[i6 + 3] = (byte) ((j6 >>> 32) & 255);
        bArr[i6 + 4] = (byte) ((j6 >>> 24) & 255);
        bArr[i6 + 5] = (byte) ((j6 >>> 16) & 255);
        bArr[i6 + 6] = (byte) ((j6 >>> 8) & 255);
        bArr[i6 + 7] = (byte) (j6 & 255);
        segmentWritableSegment$okio.limit = i6 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i7 = segmentWritableSegment$okio.limit;
        bArr[i7] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 1] = (byte) (i6 & 255);
        segmentWritableSegment$okio.limit = i7 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String string, int i6, int i7) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i6 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i6).toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i7 + " < " + i6).toString());
        }
        if (i7 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i7 + " > " + string.length()).toString());
        }
        while (i6 < i7) {
            char cCharAt2 = string.charAt(i6);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i8 = segmentWritableSegment$okio.limit - i6;
                int iMin = Math.min(i7, 8192 - i8);
                int i9 = i6 + 1;
                bArr[i6 + i8] = (byte) cCharAt2;
                while (true) {
                    i6 = i9;
                    if (i6 >= iMin || (cCharAt = string.charAt(i6)) >= 128) {
                        break;
                    }
                    i9 = i6 + 1;
                    bArr[i6 + i8] = (byte) cCharAt;
                }
                int i10 = segmentWritableSegment$okio.limit;
                int i11 = (i8 + i6) - i10;
                segmentWritableSegment$okio.limit = i10 + i11;
                buffer.setSize$okio(buffer.size() + i11);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i12 = segmentWritableSegment$okio2.limit;
                    bArr2[i12] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i12 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i13 = segmentWritableSegment$okio3.limit;
                    bArr3[i13] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i13 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i14 = i6 + 1;
                    char cCharAt3 = i14 < i7 ? string.charAt(i14) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i6 = i14;
                    } else {
                        int i15 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i16 = segmentWritableSegment$okio4.limit;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i16 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i6 += 2;
                    }
                }
                i6++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i6 < 128) {
            buffer.writeByte(i6);
            return buffer;
        }
        if (i6 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i7 = segmentWritableSegment$okio.limit;
            bArr[i7] = (byte) ((i6 >> 6) | 192);
            bArr[i7 + 1] = (byte) ((i6 & 63) | 128);
            segmentWritableSegment$okio.limit = i7 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i6 && i6 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i6 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i8 = segmentWritableSegment$okio2.limit;
            bArr2[i8] = (byte) ((i6 >> 12) | 224);
            bArr2[i8 + 1] = (byte) (((i6 >> 6) & 63) | 128);
            bArr2[i8 + 2] = (byte) ((i6 & 63) | 128);
            segmentWritableSegment$okio2.limit = i8 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i6 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i6));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i9 = segmentWritableSegment$okio3.limit;
        bArr3[i9] = (byte) ((i6 >> 18) | 240);
        bArr3[i9 + 1] = (byte) (((i6 >> 12) & 63) | 128);
        bArr3[i9 + 2] = (byte) (((i6 >> 6) & 63) | 128);
        bArr3[i9 + 3] = (byte) ((i6 & 63) | 128);
        segmentWritableSegment$okio3.limit = i9 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countDigitsIn(long j6) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j6)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j6 > DigitCountToLargestValue[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i6, byte[] bytes, int i7, int i8) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i9 = segment.limit;
        byte[] bArr = segment.data;
        while (i7 < i8) {
            if (i6 == i9) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i6 = segment.pos;
                i9 = segment.limit;
            }
            if (bArr[i6] != bytes[i7]) {
                return false;
            }
            i6++;
            i7++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 > 0) {
            long j7 = j6 - 1;
            if (buffer.getByte(j7) == 13) {
                String utf8 = buffer.readUtf8(j7);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j6);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(okio.Buffer buffer, long j6, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j6 < j6) {
            long size = buffer.size();
            while (size > j6) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j7 = 0;
        while (true) {
            long j8 = (segment.limit - segment.pos) + j7;
            if (j8 > j6) {
                return lambda.invoke(segment, Long.valueOf(j7));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j7 = j8;
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

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return selectPrefix(buffer, options, z6);
    }

    public static final int commonRead(okio.Buffer buffer, byte[] sink, int i6, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i6, i7);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i7, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i8 = segment.pos;
        ArraysKt.copyInto(bArr, sink, i6, i8, i8 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 < 0 || j6 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (buffer.size() < j6) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j6];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(okio.Buffer buffer, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j6 < 0 || j6 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (buffer.size() < j6) {
            throw new EOFException();
        }
        if (j6 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(buffer.readByteArray(j6));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j6);
        buffer.skip(j6);
        return byteStringSnapshot;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] source, int i6, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j6 = i7;
        SegmentedByteString.checkOffsetAndCount(source.length, i6, j6);
        int i8 = i7 + i6;
        while (i6 < i8) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i8 - i6, 8192 - segmentWritableSegment$okio.limit);
            int i9 = i6 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i6, i9);
            segmentWritableSegment$okio.limit += iMin;
            i6 = i9;
        }
        buffer.setSize$okio(buffer.size() + j6);
        return buffer;
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer sink, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j6) {
            sink.write(buffer, j6);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(okio.Buffer buffer, int i6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i6 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i6);
        Segment segment = buffer.head;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Intrinsics.checkNotNull(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (i10 != i11) {
                i8 += i10 - i11;
                i9++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i9][];
        int[] iArr = new int[i9 * 2];
        Segment segment2 = buffer.head;
        int i12 = 0;
        while (i7 < i6) {
            Intrinsics.checkNotNull(segment2);
            bArr[i12] = segment2.data;
            i7 += segment2.limit - segment2.pos;
            iArr[i12] = Math.min(i7, i6);
            iArr[i12 + i9] = segment2.pos;
            segment2.shared = true;
            i12++;
            segment2 = segment2.next;
        }
        return new C8049SegmentedByteString(bArr, iArr);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j6 > 0) {
            long j7 = source.read(buffer, j6);
            if (j7 == -1) {
                throw new EOFException();
            }
            j6 -= j7;
        }
        return buffer;
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer sink, long j6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j6 > buffer.size()) {
            j6 = buffer.size();
        }
        sink.write(buffer, j6);
        return j6;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer source, long j6) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j6);
            while (j6 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i6 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (j6 < i6 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j6) - (segment.shared ? 0 : segment.pos) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j6);
                            source.setSize$okio(source.size() - j6);
                            buffer.setSize$okio(buffer.size() + j6);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) j6);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j7 = segment6.limit - segment6.pos;
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
                source.setSize$okio(source.size() - j7);
                buffer.setSize$okio(buffer.size() + j7);
                j6 -= j7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(okio.Buffer buffer, ByteString bytes, long j6, long j7, int i6, int i7) {
        Segment segment;
        int i8;
        long j8 = j6;
        long size = j7;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j9 = i7;
        SegmentedByteString.checkOffsetAndCount(bytes.size(), i6, j9);
        if (i7 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
        }
        if (j8 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j8 + " > " + size).toString());
        }
        if (size > buffer.size()) {
            size = buffer.size();
        }
        long j10 = -1;
        if (j8 == size || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j8 < j8) {
            size2 = buffer.size();
            while (size2 > j8) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size2 -= segment.limit - segment.pos;
                j10 = j10;
            }
            long j11 = j10;
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b7 = bArrInternalArray$okio[i6];
            long jMin = Math.min(size, (buffer.size() - j9) + 1);
            while (size2 < jMin) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + jMin) - size2);
                i8 = (int) ((segment.pos + j8) - size2);
                while (i8 < iMin) {
                    if (bArr[i8] != b7 || !rangeEquals(segment, i8 + 1, bArrInternalArray$okio, i6 + 1, i7)) {
                        i8++;
                    }
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j8 = size2;
            }
            return j11;
        }
        while (true) {
            long j12 = (segment.limit - segment.pos) + size2;
            if (j12 > j8) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size2 = j12;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b8 = bArrInternalArray$okio2[i6];
        long jMin2 = Math.min(size, (buffer.size() - j9) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + jMin2) - size2);
            i8 = (int) ((segment.pos + j8) - size2);
            while (i8 < iMin2) {
                if (bArr2[i8] != b8 || !rangeEquals(segment, i8 + 1, bArrInternalArray$okio2, i6 + 1, i7)) {
                    i8++;
                }
            }
            size2 += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j8 = size2;
        }
        return -1L;
        return (i8 - segment.pos) + size2;
    }
}

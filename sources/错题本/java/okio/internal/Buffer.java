package okio.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C6897SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0016\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\f2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020#*\u00020\u000bH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010'\u001a\u00020&*\u00020\u000bH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b+\u0010\"\u001a\u001c\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010,\u001a\u00020\fH\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u00100\u001a\u00020/*\u00020\u000bH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020/*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b2\u00103\u001a0\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u001c\u00109\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010=\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b=\u0010:\u001a\u001c\u0010?\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010>\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b?\u0010@\u001a\u001c\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010A\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b6\u0010B\u001a,\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010A\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u0010C\u001a\u0014\u0010D\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010D\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bD\u0010F\u001a\u001c\u0010H\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010G\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bH\u0010I\u001a\u001c\u0010J\u001a\u00020/*\u00020\u000b2\u0006\u0010G\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a,\u0010H\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bH\u0010L\u001a\u0014\u0010M\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bM\u0010\"\u001a\u0014\u0010N\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bN\u0010\"\u001a\u0014\u0010O\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010O\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bO\u0010Q\u001a\u001c\u0010R\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\bR\u0010S\u001a$\u0010J\u001a\u00020/*\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bJ\u0010T\u001a\u001c\u0010V\u001a\u00020\f*\u00020\u000b2\u0006\u0010G\u001a\u00020UH\u0080\b¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bX\u0010\u0010\u001a\u0016\u0010Y\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010[\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\\\u0010\u0010\u001a\u0014\u0010]\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b]\u0010*\u001a,\u0010a\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\ba\u0010b\u001a\u001c\u0010d\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010c\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bd\u0010e\u001a\u001c\u0010g\u001a\u00020\f*\u00020\u000b2\u0006\u0010A\u001a\u00020fH\u0080\b¢\u0006\u0004\bg\u0010h\u001a$\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010A\u001a\u00020f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010i\u001a\u001c\u0010k\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010j\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bk\u0010e\u001a\u001c\u0010m\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010l\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bm\u0010e\u001a\u001c\u0010o\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010n\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bo\u0010e\u001a\u001c\u0010p\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\bp\u0010:\u001a$\u00106\u001a\u00020/*\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010T\u001a$\u0010H\u001a\u00020\f*\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bH\u0010q\u001a,\u0010s\u001a\u00020\f*\u00020\u000b2\u0006\u0010j\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010r\u001a\u00020\fH\u0080\b¢\u0006\u0004\bs\u0010t\u001a$\u0010s\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bs\u0010u\u001a$\u0010w\u001a\u00020\f*\u00020\u000b2\u0006\u0010v\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bw\u0010u\u001a4\u0010x\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bx\u0010y\u001a\u001e\u0010|\u001a\u00020\b*\u00020\u000b2\b\u0010{\u001a\u0004\u0018\u00010zH\u0080\b¢\u0006\u0004\b|\u0010}\u001a\u0014\u0010~\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b~\u0010*\u001a\u0015\u0010\u007f\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u0016\u0010\u0081\u0001\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u0081\u0001\u0010P\u001a\u001f\u0010\u0081\u0001\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a!\u0010\u0085\u0001\u001a\u00030\u0083\u0001*\u00020\u000b2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a!\u0010\u0087\u0001\u001a\u00030\u0083\u0001*\u00020\u000b2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001\u001a\u0018\u0010\u0088\u0001\u001a\u00020\u0002*\u00030\u0083\u0001H\u0080\b¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a \u0010\u008a\u0001\u001a\u00020\u0002*\u00030\u0083\u00012\u0006\u0010\u001d\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a!\u0010\u008d\u0001\u001a\u00020\f*\u00030\u0083\u00012\u0007\u0010\u008c\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a!\u0010\u0090\u0001\u001a\u00020\f*\u00030\u0083\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0018\u0010\u0092\u0001\u001a\u00020/*\u00030\u0083\u0001H\u0080\b¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u001f\u0010\u0094\u0001\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0017\u0010\u009f\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 \u0001"}, m5110d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lokio/Segment;I[BII)Z", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", "(Lokio/Buffer;J)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLr6/e;)Ljava/lang/Object;", "Lokio/Options;", "options", "selectTruncated", "selectPrefix", "(Lokio/Buffer;Lokio/Options;Z)I", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonCopyTo", "(Lokio/Buffer;Lokio/Buffer;JJ)Lokio/Buffer;", "commonCompleteSegmentByteCount", "(Lokio/Buffer;)J", "", "commonReadByte", "(Lokio/Buffer;)B", "", "commonReadShort", "(Lokio/Buffer;)S", "commonReadInt", "(Lokio/Buffer;)I", "commonReadLong", "pos", "commonGet", "(Lokio/Buffer;J)B", "Ld6/s;", "commonClear", "(Lokio/Buffer;)V", "commonSkip", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "commonWrite", "(Lokio/Buffer;Lokio/ByteString;II)Lokio/Buffer;", "v", "commonWriteDecimalLong", "(Lokio/Buffer;J)Lokio/Buffer;", "countDigitsIn", "(J)I", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lokio/Buffer;I)Lokio/Segment;", "source", "(Lokio/Buffer;[B)Lokio/Buffer;", "(Lokio/Buffer;[BII)Lokio/Buffer;", "commonReadByteArray", "(Lokio/Buffer;)[B", "(Lokio/Buffer;J)[B", "sink", "commonRead", "(Lokio/Buffer;[B)I", "commonReadFully", "(Lokio/Buffer;[B)V", "(Lokio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lokio/Buffer;)Lokio/ByteString;", "(Lokio/Buffer;J)Lokio/ByteString;", "commonSelect", "(Lokio/Buffer;Lokio/Options;)I", "(Lokio/Buffer;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/Buffer;Lokio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lokio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8", "(Lokio/Buffer;Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lokio/Buffer;I)Lokio/Buffer;", "Lokio/Source;", "commonWriteAll", "(Lokio/Buffer;Lokio/Source;)J", "(Lokio/Buffer;Lokio/Source;J)Lokio/Buffer;", "b", "commonWriteByte", "s", "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "(Lokio/Buffer;Lokio/Buffer;J)J", "toIndex", "commonIndexOf", "(Lokio/Buffer;BJJ)J", "(Lokio/Buffer;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lokio/Buffer;JLokio/ByteString;II)Z", "", "other", "commonEquals", "(Lokio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lokio/Buffer;)Lokio/Buffer;", "commonSnapshot", "(Lokio/Buffer;I)Lokio/ByteString;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "commonReadAndWriteUnsafe", "commonNext", "(Lokio/Buffer$UnsafeCursor;)I", "commonSeek", "(Lokio/Buffer$UnsafeCursor;J)I", "newSize", "commonResizeBuffer", "(Lokio/Buffer$UnsafeCursor;J)J", "minByteCount", "commonExpandBuffer", "(Lokio/Buffer$UnsafeCursor;I)J", "commonClose", "(Lokio/Buffer$UnsafeCursor;)V", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "I", "", "DigitCountToLargestValue", "[J", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1700:1\n110#1,20:1723\n110#1,20:1756\n110#1:1776\n112#1,18:1778\n110#1,20:1796\n73#2:1701\n73#2:1702\n73#2:1703\n73#2:1704\n73#2:1705\n73#2:1706\n73#2:1707\n73#2:1708\n73#2:1709\n73#2:1710\n73#2:1711\n73#2:1712\n82#2:1713\n82#2:1714\n76#2:1715\n76#2:1716\n76#2:1717\n76#2:1718\n76#2:1719\n76#2:1720\n76#2:1721\n76#2:1722\n85#2:1743\n88#2:1745\n73#2:1746\n73#2:1747\n73#2:1748\n73#2:1749\n73#2:1750\n73#2:1751\n73#2:1752\n73#2:1753\n73#2:1754\n73#2:1755\n88#2:1777\n85#2:1816\n1#3:1744\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1723,20\n1262#1:1756,20\n1293#1:1776\n1293#1:1778,18\n1327#1:1796,20\n176#1:1701\n200#1:1702\n319#1:1703\n324#1:1704\n347#1:1705\n348#1:1706\n349#1:1707\n350#1:1708\n356#1:1709\n357#1:1710\n358#1:1711\n359#1:1712\n383#1:1713\n384#1:1714\n390#1:1715\n391#1:1716\n392#1:1717\n393#1:1718\n394#1:1719\n395#1:1720\n396#1:1721\n397#1:1722\n425#1:1743\n858#1:1745\n876#1:1746\n878#1:1747\n882#1:1748\n884#1:1749\n888#1:1750\n890#1:1751\n894#1:1752\n896#1:1753\n916#1:1754\n919#1:1755\n1306#1:1777\n1646#1:1816\n*E\n"})
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Buffer {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");

    @NotNull
    private static final long[] DigitCountToLargestValue = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final void commonClear(@NotNull okio.Buffer buffer) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(unsafeCursor, "<this>");
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

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        Segment segment2 = segment.prev;
        AbstractC5830k.m5327d(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            AbstractC5830k.m5327d(segment3);
            AbstractC5830k.m5327d(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer out, long j7, long j8) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(out, "out");
        long j9 = j7;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j9, j8);
        if (j8 != 0) {
            out.setSize$okio(out.size() + j8);
            Segment segment = buffer.head;
            while (true) {
                AbstractC5830k.m5327d(segment);
                int i = segment.limit;
                int i8 = segment.pos;
                if (j9 < i - i8) {
                    break;
                }
                j9 -= i - i8;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = j8;
            while (j10 > 0) {
                AbstractC5830k.m5327d(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i9 = segmentSharedCopy.pos + ((int) j9);
                segmentSharedCopy.pos = i9;
                segmentSharedCopy.limit = Math.min(i9 + ((int) j10), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    AbstractC5830k.m5327d(segment3);
                    Segment segment4 = segment3.prev;
                    AbstractC5830k.m5327d(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j10 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j9 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        AbstractC5830k.m5330g(buffer, "<this>");
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
        AbstractC5830k.m5327d(segment);
        Segment segment2 = buffer2.head;
        AbstractC5830k.m5327d(segment2);
        int i = segment.pos;
        int i8 = segment2.pos;
        long j7 = 0;
        while (j7 < buffer.size()) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i8);
            long j8 = 0;
            while (j8 < jMin) {
                int i9 = i + 1;
                int i10 = i8 + 1;
                if (segment.data[i] != segment2.data[i8]) {
                    return false;
                }
                j8++;
                i = i9;
                i8 = i10;
            }
            if (i == segment.limit) {
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                i = segment.pos;
            }
            if (i8 == segment2.limit) {
                segment2 = segment2.next;
                AbstractC5830k.m5327d(segment2);
                i8 = segment2.pos;
            }
            j7 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i) {
        AbstractC5830k.m5330g(unsafeCursor, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "minByteCount > Segment.SIZE: ").toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        int i8 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j7 = i8;
        buffer.setSize$okio(size + j7);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i8;
        unsafeCursor.end = 8192;
        return j7;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j7) {
        AbstractC5830k.m5330g(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j7, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            AbstractC5830k.m5327d(null);
            throw null;
        }
        if (buffer.size() - j7 < j7) {
            long size = buffer.size();
            while (size > j7) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j7) - size)];
        }
        long j8 = 0;
        while (true) {
            int i = segment.limit;
            int i8 = segment.pos;
            long j9 = (i - i8) + j8;
            if (j9 > j7) {
                return segment.data[(int) ((i8 + j7) - j8)];
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            j8 = j9;
        }
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i8 = segment.limit;
            for (int i9 = segment.pos; i9 < i8; i9++) {
                i = (i * 31) + segment.data[i9];
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b6, long j7, long j8) {
        Segment segment;
        int i;
        AbstractC5830k.m5330g(buffer, "<this>");
        long size = 0;
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > buffer.size()) {
            j8 = buffer.size();
        }
        if (j7 == j8 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j7 < j7) {
            size = buffer.size();
            while (size > j7) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j8) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j8) - size);
                i = (int) ((segment.pos + j7) - size);
                while (i < iMin) {
                    if (bArr[i] != b6) {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                j7 = size;
            }
            return -1L;
        }
        while (true) {
            long j9 = (segment.limit - segment.pos) + size;
            if (j9 > j7) {
                break;
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            size = j9;
        }
        while (size < j8) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j8) - size);
            i = (int) ((segment.pos + j7) - size);
            while (i < iMin2) {
                if (bArr2[i] != b6) {
                    i++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            j7 = size;
        }
        return -1L;
        return (i - segment.pos) + size;
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString targetBytes, long j7) {
        int i;
        int i8;
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        long size = 0;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j7 < j7) {
            size = buffer.size();
            while (size > j7) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b6 = targetBytes.getByte(0);
                byte b9 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j7) - size);
                    int i9 = segment.limit;
                    while (i < i9) {
                        byte b10 = bArr[i];
                        if (b10 == b6 || b10 == b9) {
                            i8 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    j7 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j7) - size);
                    int i10 = segment.limit;
                    while (i < i10) {
                        byte b11 = bArr2[i];
                        for (byte b12 : bArrInternalArray$okio) {
                            if (b11 == b12) {
                                i8 = segment.pos;
                            }
                        }
                        i++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    j7 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + size;
            if (j8 > j7) {
                break;
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            size = j8;
        }
        if (targetBytes.size() == 2) {
            byte b13 = targetBytes.getByte(0);
            byte b14 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j7) - size);
                int i11 = segment.limit;
                while (i < i11) {
                    byte b15 = bArr3[i];
                    if (b15 == b13 || b15 == b14) {
                        i8 = segment.pos;
                    } else {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                j7 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j7) - size);
                int i12 = segment.limit;
                while (i < i12) {
                    byte b16 = bArr4[i];
                    for (byte b17 : bArrInternalArray$okio2) {
                        if (b16 == b17) {
                            i8 = segment.pos;
                        }
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                j7 = size;
            }
        }
        return -1L;
        return (i - i8) + size;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(unsafeCursor, "<this>");
        long j7 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        AbstractC5830k.m5327d(buffer);
        if (j7 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j8 = unsafeCursor.offset;
        return unsafeCursor.seek(j8 == -1 ? 0L : j8 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j7, @NotNull ByteString bytes, int i, int i8) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(bytes, "bytes");
        if (j7 < 0 || i < 0 || i8 < 0 || buffer.size() - j7 < i8 || bytes.size() - i < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (buffer.getByte(i9 + j7) != bytes.getByte(i + i9)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        int i9 = i + 1;
        byte b6 = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i9 != i8) {
            segment.pos = i9;
            return b6;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b6;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
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
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i8 = buffer.read(sink, i, sink.length - i);
            if (i8 == -1) {
                throw new EOFException();
            }
            i += i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.AbstractC5830k.m5327d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L92
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
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
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
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La0
        L9e:
            r6.pos = r8
        La0:
            if (r1 != 0) goto La6
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = (bArr[i9] & 255) | i10;
        buffer.setSize$okio(buffer.size() - 4);
        if (i11 != i8) {
            segment.pos = i11;
            return i12;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i12;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i9 = i + 7;
        long j7 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i10 = i + 8;
        long j8 = j7 | (bArr[i9] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i10 != i8) {
            segment.pos = i10;
            return j8;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j8;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        int i8 = segment.limit;
        if (i8 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i9 = i + 1;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i9] & 255) | i10;
        buffer.setSize$okio(buffer.size() - 2);
        if (i11 == i8) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return (short) i12;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 < 0 || j7 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount: ").toString());
        }
        if (buffer.size() < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        AbstractC5830k.m5327d(segment);
        int i = segment.pos;
        if (i + j7 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j7), 0, 0, 3, null);
        }
        int i8 = (int) j7;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i, i + i8);
        segment.pos += i8;
        buffer.setSize$okio(buffer.size() - j7);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) throws EOFException {
        int i;
        int i8;
        int i9;
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b6 = buffer.getByte(0L);
        if ((b6 & 128) == 0) {
            i = b6 & 127;
            i9 = 0;
            i8 = 1;
        } else if ((b6 & 224) == 192) {
            i = b6 & 31;
            i8 = 2;
            i9 = 128;
        } else if ((b6 & 240) == 224) {
            i = b6 & 15;
            i8 = 3;
            i9 = 2048;
        } else {
            if ((b6 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b6 & 7;
            i8 = 4;
            i9 = 65536;
        }
        long j7 = i8;
        if (buffer.size() < j7) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i8, "size < ", ": ");
            sbM94s.append(buffer.size());
            sbM94s.append(" (to read code point prefixed 0x");
            sbM94s.append(SegmentedByteString.toHexString(b6));
            sbM94s.append(')');
            throw new EOFException(sbM94s.toString());
        }
        for (int i10 = 1; i10 < i8; i10++) {
            long j8 = i10;
            byte b9 = buffer.getByte(j8);
            if ((b9 & 192) != 128) {
                buffer.skip(j8);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b9 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j7);
        return i > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i || i >= 57344) && i >= i9) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "limit < 0: ").toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j8 < buffer.size() && buffer.getByte(j8 - 1) == 13 && buffer.getByte(j8) == 10) {
            return readUtf8Line(buffer, j8);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j7) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j7) {
        AbstractC5830k.m5330g(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j7 <= size) {
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "newSize < 0: ").toString());
            }
            long j8 = size - j7;
            while (true) {
                if (j8 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                AbstractC5830k.m5327d(segment);
                Segment segment2 = segment.prev;
                AbstractC5830k.m5327d(segment2);
                int i = segment2.limit;
                long j9 = i - segment2.pos;
                if (j9 > j8) {
                    segment2.limit = i - ((int) j8);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j8 -= j9;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j7;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j7 > size) {
            long j10 = j7 - size;
            boolean z8 = true;
            while (j10 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j10 -= iMin;
                if (z8) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i8 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i8 - iMin;
                    unsafeCursor.end = i8;
                    z8 = false;
                }
            }
        }
        buffer.setSize$okio(j7);
        return size;
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j7) {
        Segment segmentPush;
        AbstractC5830k.m5330g(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j7 < -1 || j7 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j7 + " > size=" + buffer.size());
        }
        if (j7 == -1 || j7 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j7;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j8 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j9 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            AbstractC5830k.m5327d(unsafeCursor.getSegment());
            long j10 = j9 - (i - r9.pos);
            if (j10 > j7) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j10;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j8 = j10;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j7 > j7 - j8) {
            while (true) {
                AbstractC5830k.m5327d(segmentPush);
                int i8 = segmentPush.limit;
                int i9 = segmentPush.pos;
                if (j7 < (i8 - i9) + j8) {
                    break;
                }
                j8 += i8 - i9;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j7) {
                AbstractC5830k.m5327d(segment);
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            j8 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            AbstractC5830k.m5327d(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment2 = segmentPush.prev;
                AbstractC5830k.m5327d(segment2);
                segment2.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j7;
        AbstractC5830k.m5327d(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i10 = segmentPush.pos + ((int) (j7 - j8));
        unsafeCursor.start = i10;
        int i11 = segmentPush.limit;
        unsafeCursor.end = i11;
        return i11 - i10;
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        while (j7 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j7, segment.limit - segment.pos);
            long j8 = iMin;
            buffer.setSize$okio(buffer.size() - j8);
            j7 -= j8;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (buffer.size() <= SieveCacheKt.NodeLinkMask) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            AbstractC5830k.m5327d(segment);
            Segment segment2 = segment.prev;
            AbstractC5830k.m5327d(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i, int i8) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(byteString, "byteString");
        byteString.write$okio(buffer, i, i8);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = byteString.size();
        }
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(byteString, "byteString");
        byteString.write$okio(buffer, i, i8);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) throws IOException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(source, "source");
        long j7 = 0;
        while (true) {
            long j8 = source.read(buffer, 8192L);
            if (j8 == -1) {
                return j7;
            }
            j7 += j8;
        }
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i8 + 1;
        bArr[i8] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j7) {
        boolean z8;
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 == 0) {
            return buffer.writeByte(48);
        }
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        int iCountDigitsIn = countDigitsIn(j7);
        if (z8) {
            iCountDigitsIn++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(iCountDigitsIn);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit + iCountDigitsIn;
        while (j7 != 0) {
            long j8 = 10;
            i--;
            bArr[i] = getHEX_DIGIT_BYTES()[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z8) {
            bArr[i - 1] = 45;
        }
        segmentWritableSegment$okio.limit += iCountDigitsIn;
        buffer.setSize$okio(buffer.size() + iCountDigitsIn);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j7) {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 == 0) {
            return buffer.writeByte(48);
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        for (int i9 = (i8 + i) - 1; i9 >= i8; i9--) {
            bArr[i9] = getHEX_DIGIT_BYTES()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        bArr[i8] = (byte) ((i >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i8 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j7) {
        AbstractC5830k.m5330g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        bArr[i] = (byte) ((j7 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i + 7] = (byte) (j7 & 255);
        segmentWritableSegment$okio.limit = i + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i8 = segmentWritableSegment$okio.limit;
        bArr[i8] = (byte) ((i >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i8 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String string, int i, int i8) {
        char cCharAt;
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "beginIndex < 0: ").toString());
        }
        if (i8 < i) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i8, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i8 > string.length()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i8, "endIndex > string.length: ", " > ");
            sbM94s.append(string.length());
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        while (i < i8) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i9 = segmentWritableSegment$okio.limit - i;
                int iMin = Math.min(i8, 8192 - i9);
                int i10 = i + 1;
                bArr[i + i9] = (byte) cCharAt2;
                while (true) {
                    i = i10;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i10 = i + 1;
                    bArr[i + i9] = (byte) cCharAt;
                }
                int i11 = segmentWritableSegment$okio.limit;
                int i12 = (i9 + i) - i11;
                segmentWritableSegment$okio.limit = i11 + i12;
                buffer.setSize$okio(buffer.size() + i12);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i13 = segmentWritableSegment$okio2.limit;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i13 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i14 = segmentWritableSegment$okio3.limit;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i14 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i15 = i + 1;
                    char cCharAt3 = i15 < i8 ? string.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i17 = segmentWritableSegment$okio4.limit;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i17 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
            return buffer;
        }
        if (i < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i8 = segmentWritableSegment$okio.limit;
            bArr[i8] = (byte) ((i >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit = i8 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i && i < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i9 = segmentWritableSegment$okio2.limit;
            bArr2[i9] = (byte) ((i >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio2.limit = i9 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i10 = segmentWritableSegment$okio3.limit;
        bArr3[i10] = (byte) ((i >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i & 63) | 128);
        segmentWritableSegment$okio3.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countDigitsIn(long j7) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j7)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j7 > DigitCountToLargestValue[iNumberOfLeadingZeros] ? 1 : 0);
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i, @NotNull byte[] bytes, int i8, int i9) {
        AbstractC5830k.m5330g(segment, "segment");
        AbstractC5830k.m5330g(bytes, "bytes");
        int i10 = segment.limit;
        byte[] bArr = segment.data;
        while (i8 < i9) {
            if (i == i10) {
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i10 = segment.limit;
            }
            if (bArr[i] != bytes[i8]) {
                return false;
            }
            i++;
            i8++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (buffer.getByte(j8) == 13) {
                String utf8 = buffer.readUtf8(j8);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j7);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j7, @NotNull InterfaceC6473e lambda) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (buffer.size() - j7 < j7) {
            long size = buffer.size();
            while (size > j7) {
                segment = segment.prev;
                AbstractC5830k.m5327d(segment);
                size -= segment.limit - segment.pos;
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j8 = 0;
        while (true) {
            long j9 = (segment.limit - segment.pos) + j8;
            if (j9 > j7) {
                return (T) lambda.invoke(segment, Long.valueOf(j8));
            }
            segment = segment.next;
            AbstractC5830k.m5327d(segment);
            j8 = j9;
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
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.selectPrefix(okio.Buffer, okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        return selectPrefix(buffer, options, z8);
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink, int i, int i8) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i, i8);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i8, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i9 = segment.pos;
        AbstractC5802q.m5213z(bArr, i, sink, i9, i9 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 < 0 || j7 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount: ").toString());
        }
        if (buffer.size() < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (j7 < 0 || j7 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount: ").toString());
        }
        if (buffer.size() < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new ByteString(buffer.readByteArray(j7));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j7);
        buffer.skip(j7);
        return byteStringSnapshot;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source, int i, int i8) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(source, "source");
        long j7 = i8;
        SegmentedByteString.checkOffsetAndCount(source.length, i, j7);
        int i9 = i8 + i;
        while (i < i9) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i9 - i, 8192 - segmentWritableSegment$okio.limit);
            int i10 = i + iMin;
            AbstractC5802q.m5213z(source, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, i, i10);
            segmentWritableSegment$okio.limit += iMin;
            i = i10;
        }
        buffer.setSize$okio(buffer.size() + j7);
        return buffer;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j7) throws EOFException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        if (buffer.size() >= j7) {
            sink.write(buffer, j7);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i) {
        AbstractC5830k.m5330g(buffer, "<this>");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            AbstractC5830k.m5327d(segment);
            int i11 = segment.limit;
            int i12 = segment.pos;
            if (i11 != i12) {
                i9 += i11 - i12;
                i10++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        Segment segment2 = buffer.head;
        int i13 = 0;
        while (i8 < i) {
            AbstractC5830k.m5327d(segment2);
            bArr[i13] = segment2.data;
            i8 += segment2.limit - segment2.pos;
            iArr[i13] = Math.min(i8, i);
            iArr[i13 + i10] = segment2.pos;
            segment2.shared = true;
            i13++;
            segment2 = segment2.next;
        }
        return new C6897SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j7) throws IOException {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(source, "source");
        while (j7 > 0) {
            long j8 = source.read(buffer, j7);
            if (j8 == -1) {
                throw new EOFException();
            }
            j7 -= j8;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j7) {
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j7 > buffer.size()) {
            j7 = buffer.size();
        }
        sink.write(buffer, j7);
        return j7;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer source, long j7) {
        Segment segment;
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j7);
            while (j7 > 0) {
                Segment segment2 = source.head;
                AbstractC5830k.m5327d(segment2);
                int i = segment2.limit;
                AbstractC5830k.m5327d(source.head);
                if (j7 < i - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        AbstractC5830k.m5327d(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j7) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            AbstractC5830k.m5327d(segment4);
                            segment4.writeTo(segment, (int) j7);
                            source.setSize$okio(source.size() - j7);
                            buffer.setSize$okio(buffer.size() + j7);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    AbstractC5830k.m5327d(segment5);
                    source.head = segment5.split((int) j7);
                }
                Segment segment6 = source.head;
                AbstractC5830k.m5327d(segment6);
                long j8 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    AbstractC5830k.m5327d(segment7);
                    Segment segment8 = segment7.prev;
                    AbstractC5830k.m5327d(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j8);
                buffer.setSize$okio(buffer.size() + j8);
                j7 -= j8;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString bytes, long j7) {
        int i;
        long j8 = j7;
        AbstractC5830k.m5330g(buffer, "<this>");
        AbstractC5830k.m5330g(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j8 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j8 < j8) {
                size = buffer.size();
                while (size > j8) {
                    segment = segment.prev;
                    AbstractC5830k.m5327d(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b6 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i = (int) ((segment.pos + j8) - size);
                    while (i < iMin) {
                        if (bArr[i] != b6 || !rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC5830k.m5327d(segment);
                    j8 = size;
                }
                return -1L;
            }
            while (true) {
                long j9 = (segment.limit - segment.pos) + size;
                if (j9 > j8) {
                    break;
                }
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                size = j9;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b9 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j10 = size5;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i = (int) ((segment.pos + j8) - size);
                while (i < iMin2) {
                    if (bArr2[i] == b9 && rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC5830k.m5327d(segment);
                size5 = j10;
                j8 = size;
            }
            return -1L;
            return (i - segment.pos) + size;
        }
        throw new IllegalArgumentException(AbstractC0584a.m913n(j8, "fromIndex < 0: ").toString());
    }
}

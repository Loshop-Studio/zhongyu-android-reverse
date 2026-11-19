package okio.internal;

import com.umeng.analytics.pro.C3335ai;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import okio.buffer;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, m5175d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", "offset", "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", C3335ai.f1662aC, "commonWriteHexadecimalUnsignedLong", "commonWriteInt", C3335ai.f1660aA, "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", C3335ai.f1711az, "commonWriteShortLe", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealBufferedSinkKt {
    public static final void commonClose(buffer commonClose) throws Throwable {
        Intrinsics.checkNotNullParameter(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        try {
            if (commonClose.bufferField.size() > 0) {
                Sink sink = commonClose.sink;
                Buffer buffer = commonClose.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            commonClose.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        commonClose.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(buffer commonEmit) throws IOException {
        Intrinsics.checkNotNullParameter(commonEmit, "$this$commonEmit");
        if (!(!commonEmit.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = commonEmit.bufferField.size();
        if (size > 0) {
            commonEmit.sink.write(commonEmit.bufferField, size);
        }
        return commonEmit;
    }

    public static final BufferedSink commonEmitCompleteSegments(buffer commonEmitCompleteSegments) throws IOException {
        Intrinsics.checkNotNullParameter(commonEmitCompleteSegments, "$this$commonEmitCompleteSegments");
        if (!(!commonEmitCompleteSegments.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = commonEmitCompleteSegments.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            commonEmitCompleteSegments.sink.write(commonEmitCompleteSegments.bufferField, jCompleteSegmentByteCount);
        }
        return commonEmitCompleteSegments;
    }

    public static final void commonFlush(buffer commonFlush) throws IOException {
        Intrinsics.checkNotNullParameter(commonFlush, "$this$commonFlush");
        if (!(!commonFlush.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonFlush.bufferField.size() > 0) {
            Sink sink = commonFlush.sink;
            Buffer buffer = commonFlush.bufferField;
            sink.write(buffer, buffer.size());
        }
        commonFlush.sink.flush();
    }

    public static final Timeout commonTimeout(buffer commonTimeout) {
        Intrinsics.checkNotNullParameter(commonTimeout, "$this$commonTimeout");
        return commonTimeout.sink.getTimeout();
    }

    public static final String commonToString(buffer commonToString) {
        Intrinsics.checkNotNullParameter(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.sink + ')';
    }

    public static final void commonWrite(buffer commonWrite, Buffer source, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!commonWrite.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWrite.bufferField.write(source, j4);
        commonWrite.emitCompleteSegments();
    }

    public static final long commonWriteAll(buffer commonWriteAll, Source source) throws IOException {
        Intrinsics.checkNotNullParameter(commonWriteAll, "$this$commonWriteAll");
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long j5 = source.read(commonWriteAll.bufferField, 8192);
            if (j5 == -1) {
                return j4;
            }
            j4 += j5;
            commonWriteAll.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(buffer commonWriteByte, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteByte, "$this$commonWriteByte");
        if (!(!commonWriteByte.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteByte.bufferField.writeByte(i4);
        return commonWriteByte.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(buffer commonWriteDecimalLong, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        if (!(!commonWriteDecimalLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteDecimalLong.bufferField.writeDecimalLong(j4);
        return commonWriteDecimalLong.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(buffer commonWriteHexadecimalUnsignedLong, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (!(!commonWriteHexadecimalUnsignedLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteHexadecimalUnsignedLong.bufferField.writeHexadecimalUnsignedLong(j4);
        return commonWriteHexadecimalUnsignedLong.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(buffer commonWriteInt, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteInt, "$this$commonWriteInt");
        if (!(!commonWriteInt.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteInt.bufferField.writeInt(i4);
        return commonWriteInt.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(buffer commonWriteIntLe, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteIntLe, "$this$commonWriteIntLe");
        if (!(!commonWriteIntLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteIntLe.bufferField.writeIntLe(i4);
        return commonWriteIntLe.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(buffer commonWriteLong, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteLong, "$this$commonWriteLong");
        if (!(!commonWriteLong.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteLong.bufferField.writeLong(j4);
        return commonWriteLong.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(buffer commonWriteLongLe, long j4) {
        Intrinsics.checkNotNullParameter(commonWriteLongLe, "$this$commonWriteLongLe");
        if (!(!commonWriteLongLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteLongLe.bufferField.writeLongLe(j4);
        return commonWriteLongLe.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(buffer commonWriteShort, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteShort, "$this$commonWriteShort");
        if (!(!commonWriteShort.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteShort.bufferField.writeShort(i4);
        return commonWriteShort.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(buffer commonWriteShortLe, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteShortLe, "$this$commonWriteShortLe");
        if (!(!commonWriteShortLe.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteShortLe.bufferField.writeShortLe(i4);
        return commonWriteShortLe.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(buffer commonWriteUtf8, String string) {
        Intrinsics.checkNotNullParameter(commonWriteUtf8, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!commonWriteUtf8.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteUtf8.bufferField.writeUtf8(string);
        return commonWriteUtf8.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(buffer commonWriteUtf8CodePoint, int i4) {
        Intrinsics.checkNotNullParameter(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (!(!commonWriteUtf8CodePoint.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        commonWriteUtf8CodePoint.bufferField.writeUtf8CodePoint(i4);
        return commonWriteUtf8CodePoint.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(buffer commonWrite, ByteString byteString) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!commonWrite.closed) {
            commonWrite.bufferField.write(byteString);
            return commonWrite.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWriteUtf8(buffer commonWriteUtf8, String string, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWriteUtf8, "$this$commonWriteUtf8");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!commonWriteUtf8.closed) {
            commonWriteUtf8.bufferField.writeUtf8(string, i4, i5);
            return commonWriteUtf8.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(buffer commonWrite, ByteString byteString, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!commonWrite.closed) {
            commonWrite.bufferField.write(byteString, i4, i5);
            return commonWrite.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(buffer commonWrite, byte[] source) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!commonWrite.closed) {
            commonWrite.bufferField.write(source);
            return commonWrite.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(buffer commonWrite, byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!commonWrite.closed) {
            commonWrite.bufferField.write(source, i4, i5);
            return commonWrite.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(buffer commonWrite, Source source, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j4 > 0) {
            long j5 = source.read(commonWrite.bufferField, j4);
            if (j5 != -1) {
                j4 -= j5;
                commonWrite.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return commonWrite;
    }
}

package okio.internal;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.Sink;
import okio.Timeout;
import okio.Util;
import okio.buffer;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, m5175d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(buffer commonClose) throws IOException {
        Intrinsics.checkNotNullParameter(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        commonClose.closed = true;
        commonClose.source.close();
        commonClose.bufferField.clear();
    }

    public static final boolean commonExhausted(buffer commonExhausted) {
        Intrinsics.checkNotNullParameter(commonExhausted, "$this$commonExhausted");
        if (!commonExhausted.closed) {
            return commonExhausted.bufferField.exhausted() && commonExhausted.source.read(commonExhausted.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(buffer commonIndexOf, byte b4, long j4, long j5) {
        Intrinsics.checkNotNullParameter(commonIndexOf, "$this$commonIndexOf");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j4 && j5 >= j4)) {
            throw new IllegalArgumentException(("fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        while (j4 < j5) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(b4, j4, j5);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (size >= j5 || commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                break;
            }
            j4 = Math.max(j4, size);
        }
        return -1L;
    }

    public static final long commonIndexOfElement(buffer commonIndexOfElement, ByteString targetBytes, long j4) {
        Intrinsics.checkNotNullParameter(commonIndexOfElement, "$this$commonIndexOfElement");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!commonIndexOfElement.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = commonIndexOfElement.bufferField.indexOfElement(targetBytes, j4);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = commonIndexOfElement.bufferField.size();
            if (commonIndexOfElement.source.read(commonIndexOfElement.bufferField, 8192) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, size);
        }
    }

    public static final BufferedSource commonPeek(buffer commonPeek) {
        Intrinsics.checkNotNullParameter(commonPeek, "$this$commonPeek");
        return Okio.buffer(new PeekSource(commonPeek));
    }

    public static final boolean commonRangeEquals(buffer commonRangeEquals, long j4, ByteString bytes, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!commonRangeEquals.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j4 < 0 || i4 < 0 || i5 < 0 || bytes.size() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            long j5 = i6 + j4;
            if (!commonRangeEquals.request(1 + j5) || commonRangeEquals.bufferField.getByte(j5) != bytes.getByte(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(buffer commonRead, Buffer sink, long j4) {
        Intrinsics.checkNotNullParameter(commonRead, "$this$commonRead");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!commonRead.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1L;
        }
        return commonRead.bufferField.read(sink, Math.min(j4, commonRead.bufferField.size()));
    }

    public static final long commonReadAll(buffer commonReadAll, Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadAll, "$this$commonReadAll");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j4 = 0;
        while (commonReadAll.source.read(commonReadAll.bufferField, 8192) != -1) {
            long jCompleteSegmentByteCount = commonReadAll.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j4 += jCompleteSegmentByteCount;
                sink.write(commonReadAll.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (commonReadAll.bufferField.size() <= 0) {
            return j4;
        }
        long size = j4 + commonReadAll.bufferField.size();
        Buffer buffer = commonReadAll.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(buffer commonReadByte) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByte, "$this$commonReadByte");
        commonReadByte.require(1L);
        return commonReadByte.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(buffer commonReadByteArray, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.require(j4);
        return commonReadByteArray.bufferField.readByteArray(j4);
    }

    public static final ByteString commonReadByteString(buffer commonReadByteString, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.require(j4);
        return commonReadByteString.bufferField.readByteString(j4);
    }

    public static final long commonReadDecimalLong(buffer commonReadDecimalLong) throws EOFException {
        byte b4;
        Intrinsics.checkNotNullParameter(commonReadDecimalLong, "$this$commonReadDecimalLong");
        commonReadDecimalLong.require(1L);
        long j4 = 0;
        while (true) {
            long j5 = j4 + 1;
            if (!commonReadDecimalLong.request(j5)) {
                break;
            }
            b4 = commonReadDecimalLong.bufferField.getByte(j4);
            if ((b4 < ((byte) 48) || b4 > ((byte) 57)) && !(j4 == 0 && b4 == ((byte) 45))) {
                break;
            }
            j4 = j5;
        }
        if (j4 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(b4, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadDecimalLong.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(buffer commonReadFully, byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadFully, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            commonReadFully.require(sink.length);
            commonReadFully.bufferField.readFully(sink);
        } catch (EOFException e4) {
            int i4 = 0;
            while (commonReadFully.bufferField.size() > 0) {
                Buffer buffer = commonReadFully.bufferField;
                int i5 = buffer.read(sink, i4, (int) buffer.size());
                if (i5 == -1) {
                    throw new AssertionError();
                }
                i4 += i5;
            }
            throw e4;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(buffer commonReadHexadecimalUnsignedLong) throws EOFException {
        byte b4;
        Intrinsics.checkNotNullParameter(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
        commonReadHexadecimalUnsignedLong.require(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (!commonReadHexadecimalUnsignedLong.request(i5)) {
                break;
            }
            b4 = commonReadHexadecimalUnsignedLong.bufferField.getByte(i4);
            if ((b4 < ((byte) 48) || b4 > ((byte) 57)) && ((b4 < ((byte) 97) || b4 > ((byte) 102)) && (b4 < ((byte) 65) || b4 > ((byte) 70)))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b4, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadHexadecimalUnsignedLong.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(buffer commonReadInt) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadInt, "$this$commonReadInt");
        commonReadInt.require(4L);
        return commonReadInt.bufferField.readInt();
    }

    public static final int commonReadIntLe(buffer commonReadIntLe) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadIntLe, "$this$commonReadIntLe");
        commonReadIntLe.require(4L);
        return commonReadIntLe.bufferField.readIntLe();
    }

    public static final long commonReadLong(buffer commonReadLong) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadLong, "$this$commonReadLong");
        commonReadLong.require(8L);
        return commonReadLong.bufferField.readLong();
    }

    public static final long commonReadLongLe(buffer commonReadLongLe) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadLongLe, "$this$commonReadLongLe");
        commonReadLongLe.require(8L);
        return commonReadLongLe.bufferField.readLongLe();
    }

    public static final short commonReadShort(buffer commonReadShort) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadShort, "$this$commonReadShort");
        commonReadShort.require(2L);
        return commonReadShort.bufferField.readShort();
    }

    public static final short commonReadShortLe(buffer commonReadShortLe) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadShortLe, "$this$commonReadShortLe");
        commonReadShortLe.require(2L);
        return commonReadShortLe.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(buffer commonReadUtf8, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.require(j4);
        return commonReadUtf8.bufferField.readUtf8(j4);
    }

    public static final int commonReadUtf8CodePoint(buffer commonReadUtf8CodePoint) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        commonReadUtf8CodePoint.require(1L);
        byte b4 = commonReadUtf8CodePoint.bufferField.getByte(0L);
        if ((b4 & 224) == 192) {
            commonReadUtf8CodePoint.require(2L);
        } else if ((b4 & 240) == 224) {
            commonReadUtf8CodePoint.require(3L);
        } else if ((b4 & 248) == 240) {
            commonReadUtf8CodePoint.require(4L);
        }
        return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(buffer commonReadUtf8Line) {
        Intrinsics.checkNotNullParameter(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8Line.bufferField, jIndexOf);
        }
        if (commonReadUtf8Line.bufferField.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(buffer commonReadUtf8LineStrict, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        byte b4 = (byte) 10;
        long jIndexOf = commonReadUtf8LineStrict.indexOf(b4, 0L, j5);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, jIndexOf);
        }
        if (j5 < Long.MAX_VALUE && commonReadUtf8LineStrict.request(j5) && commonReadUtf8LineStrict.bufferField.getByte(j5 - 1) == ((byte) 13) && commonReadUtf8LineStrict.request(1 + j5) && commonReadUtf8LineStrict.bufferField.getByte(j5) == b4) {
            return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, j5);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = commonReadUtf8LineStrict.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.bufferField.size(), j4) + " content=" + buffer.readByteString().hex() + "…");
    }

    public static final boolean commonRequest(buffer commonRequest, long j4) {
        Intrinsics.checkNotNullParameter(commonRequest, "$this$commonRequest");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(!commonRequest.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (commonRequest.bufferField.size() < j4) {
            if (commonRequest.source.read(commonRequest.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(buffer commonRequire, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonRequire, "$this$commonRequire");
        if (!commonRequire.request(j4)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(buffer commonSelect, Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(commonSelect, "$this$commonSelect");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!commonSelect.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = BufferKt.selectPrefix(commonSelect.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                commonSelect.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (commonSelect.source.read(commonSelect.bufferField, 8192) != -1);
        return -1;
    }

    public static final void commonSkip(buffer commonSkip, long j4) throws EOFException {
        Intrinsics.checkNotNullParameter(commonSkip, "$this$commonSkip");
        if (!(!commonSkip.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j4 > 0) {
            if (commonSkip.bufferField.size() == 0 && commonSkip.source.read(commonSkip.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, commonSkip.bufferField.size());
            commonSkip.bufferField.skip(jMin);
            j4 -= jMin;
        }
    }

    public static final Timeout commonTimeout(buffer commonTimeout) {
        Intrinsics.checkNotNullParameter(commonTimeout, "$this$commonTimeout");
        return commonTimeout.source.getTimeout();
    }

    public static final String commonToString(buffer commonToString) {
        Intrinsics.checkNotNullParameter(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.source + ')';
    }

    public static final byte[] commonReadByteArray(buffer commonReadByteArray) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.bufferField.writeAll(commonReadByteArray.source);
        return commonReadByteArray.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(buffer commonReadByteString) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.bufferField.writeAll(commonReadByteString.source);
        return commonReadByteString.bufferField.readByteString();
    }

    public static final String commonReadUtf8(buffer commonReadUtf8) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.bufferField.writeAll(commonReadUtf8.source);
        return commonReadUtf8.bufferField.readUtf8();
    }

    public static final void commonReadFully(buffer commonReadFully, Buffer sink, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(commonReadFully, "$this$commonReadFully");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            commonReadFully.require(j4);
            commonReadFully.bufferField.readFully(sink, j4);
        } catch (EOFException e4) {
            sink.writeAll(commonReadFully.bufferField);
            throw e4;
        }
    }

    public static final long commonIndexOf(buffer commonIndexOf, ByteString bytes, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(commonIndexOf, "$this$commonIndexOf");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = commonIndexOf.bufferField.indexOf(bytes, j4);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, (size - bytes.size()) + 1);
        }
    }

    public static final int commonRead(buffer commonRead, byte[] sink, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonRead, "$this$commonRead");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j4 = i5;
        Util.checkOffsetAndCount(sink.length, i4, j4);
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1;
        }
        return commonRead.bufferField.read(sink, i4, (int) Math.min(j4, commonRead.bufferField.size()));
    }
}

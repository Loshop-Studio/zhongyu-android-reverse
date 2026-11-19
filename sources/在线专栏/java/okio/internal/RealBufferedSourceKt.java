package okio.internal;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.C2769l;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2476b;

/* loaded from: classes.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(@NotNull RealBufferedSource commonClose) throws IOException {
        C2769l.m9241e(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        commonClose.closed = true;
        commonClose.source.close();
        commonClose.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource commonExhausted) {
        C2769l.m9241e(commonExhausted, "$this$commonExhausted");
        if (!commonExhausted.closed) {
            return commonExhausted.bufferField.exhausted() && commonExhausted.source.read(commonExhausted.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, byte b4, long j4, long j5) {
        C2769l.m9241e(commonIndexOf, "$this$commonIndexOf");
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

    public static final long commonIndexOfElement(@NotNull RealBufferedSource commonIndexOfElement, @NotNull ByteString targetBytes, long j4) {
        C2769l.m9241e(commonIndexOfElement, "$this$commonIndexOfElement");
        C2769l.m9241e(targetBytes, "targetBytes");
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

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource commonPeek) {
        C2769l.m9241e(commonPeek, "$this$commonPeek");
        return Okio.buffer(new PeekSource(commonPeek));
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource commonRangeEquals, long j4, @NotNull ByteString bytes, int i4, int i5) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(bytes, "bytes");
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

    public static final long commonRead(@NotNull RealBufferedSource commonRead, @NotNull Buffer sink, long j4) {
        C2769l.m9241e(commonRead, "$this$commonRead");
        C2769l.m9241e(sink, "sink");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (!(true ^ commonRead.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1L;
        }
        return commonRead.bufferField.read(sink, Math.min(j4, commonRead.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull RealBufferedSource commonReadAll, @NotNull Sink sink) throws IOException {
        C2769l.m9241e(commonReadAll, "$this$commonReadAll");
        C2769l.m9241e(sink, "sink");
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

    public static final byte commonReadByte(@NotNull RealBufferedSource commonReadByte) throws EOFException {
        C2769l.m9241e(commonReadByte, "$this$commonReadByte");
        commonReadByte.require(1L);
        return commonReadByte.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray, long j4) throws EOFException {
        C2769l.m9241e(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.require(j4);
        return commonReadByteArray.bufferField.readByteArray(j4);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString, long j4) throws EOFException {
        C2769l.m9241e(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.require(j4);
        return commonReadByteString.bufferField.readByteString(j4);
    }

    public static final long commonReadDecimalLong(@NotNull RealBufferedSource commonReadDecimalLong) throws EOFException {
        byte b4;
        C2769l.m9241e(commonReadDecimalLong, "$this$commonReadDecimalLong");
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
            String string = Integer.toString(b4, C2476b.m8260a(C2476b.m8260a(16)));
            C2769l.m9240d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadDecimalLong.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull byte[] sink) throws EOFException {
        C2769l.m9241e(commonReadFully, "$this$commonReadFully");
        C2769l.m9241e(sink, "sink");
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

    public static final long commonReadHexadecimalUnsignedLong(@NotNull RealBufferedSource commonReadHexadecimalUnsignedLong) throws EOFException {
        byte b4;
        C2769l.m9241e(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
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
            String string = Integer.toString(b4, C2476b.m8260a(C2476b.m8260a(16)));
            C2769l.m9240d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return commonReadHexadecimalUnsignedLong.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull RealBufferedSource commonReadInt) throws EOFException {
        C2769l.m9241e(commonReadInt, "$this$commonReadInt");
        commonReadInt.require(4L);
        return commonReadInt.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource commonReadIntLe) throws EOFException {
        C2769l.m9241e(commonReadIntLe, "$this$commonReadIntLe");
        commonReadIntLe.require(4L);
        return commonReadIntLe.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull RealBufferedSource commonReadLong) throws EOFException {
        C2769l.m9241e(commonReadLong, "$this$commonReadLong");
        commonReadLong.require(8L);
        return commonReadLong.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource commonReadLongLe) throws EOFException {
        C2769l.m9241e(commonReadLongLe, "$this$commonReadLongLe");
        commonReadLongLe.require(8L);
        return commonReadLongLe.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull RealBufferedSource commonReadShort) throws EOFException {
        C2769l.m9241e(commonReadShort, "$this$commonReadShort");
        commonReadShort.require(2L);
        return commonReadShort.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource commonReadShortLe) throws EOFException {
        C2769l.m9241e(commonReadShortLe, "$this$commonReadShortLe");
        commonReadShortLe.require(2L);
        return commonReadShortLe.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8, long j4) throws EOFException {
        C2769l.m9241e(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.require(j4);
        return commonReadUtf8.bufferField.readUtf8(j4);
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource commonReadUtf8CodePoint) throws EOFException {
        C2769l.m9241e(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
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

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource commonReadUtf8Line) {
        C2769l.m9241e(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long jIndexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(commonReadUtf8Line.bufferField, jIndexOf);
        }
        if (commonReadUtf8Line.bufferField.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource commonReadUtf8LineStrict, long j4) throws EOFException {
        C2769l.m9241e(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
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

    public static final boolean commonRequest(@NotNull RealBufferedSource commonRequest, long j4) {
        C2769l.m9241e(commonRequest, "$this$commonRequest");
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

    public static final void commonRequire(@NotNull RealBufferedSource commonRequire, long j4) throws EOFException {
        C2769l.m9241e(commonRequire, "$this$commonRequire");
        if (!commonRequire.request(j4)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull RealBufferedSource commonSelect, @NotNull Options options) throws EOFException {
        C2769l.m9241e(commonSelect, "$this$commonSelect");
        C2769l.m9241e(options, "options");
        if (!(!commonSelect.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = BufferKt.selectPrefix(commonSelect.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                commonSelect.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (commonSelect.source.read(commonSelect.bufferField, 8192) != -1);
        return -1;
    }

    public static final void commonSkip(@NotNull RealBufferedSource commonSkip, long j4) throws EOFException {
        C2769l.m9241e(commonSkip, "$this$commonSkip");
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

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource commonTimeout) {
        C2769l.m9241e(commonTimeout, "$this$commonTimeout");
        return commonTimeout.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource commonToString) {
        C2769l.m9241e(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.source + ')';
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray) throws IOException {
        C2769l.m9241e(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.bufferField.writeAll(commonReadByteArray.source);
        return commonReadByteArray.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString) throws IOException {
        C2769l.m9241e(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.bufferField.writeAll(commonReadByteString.source);
        return commonReadByteString.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8) throws IOException {
        C2769l.m9241e(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.bufferField.writeAll(commonReadUtf8.source);
        return commonReadUtf8.bufferField.readUtf8();
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull Buffer sink, long j4) throws IOException {
        C2769l.m9241e(commonReadFully, "$this$commonReadFully");
        C2769l.m9241e(sink, "sink");
        try {
            commonReadFully.require(j4);
            commonReadFully.bufferField.readFully(sink, j4);
        } catch (EOFException e4) {
            sink.writeAll(commonReadFully.bufferField);
            throw e4;
        }
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, @NotNull ByteString bytes, long j4) throws IOException {
        C2769l.m9241e(commonIndexOf, "$this$commonIndexOf");
        C2769l.m9241e(bytes, "bytes");
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

    public static final int commonRead(@NotNull RealBufferedSource commonRead, @NotNull byte[] sink, int i4, int i5) {
        C2769l.m9241e(commonRead, "$this$commonRead");
        C2769l.m9241e(sink, "sink");
        long j4 = i5;
        Util.checkOffsetAndCount(sink.length, i4, j4);
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1;
        }
        return commonRead.bufferField.read(sink, i4, (int) Math.min(j4, commonRead.bufferField.size()));
    }
}

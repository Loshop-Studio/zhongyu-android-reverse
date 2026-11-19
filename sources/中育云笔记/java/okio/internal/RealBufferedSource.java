package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import p310qd.AbstractC10788a;

/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes6.dex */
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b10, long j10, long j11) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j12 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public static /* synthetic */ long commonIndexOf$default(okio.RealBufferedSource realBufferedSource, ByteString byteString, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        return commonIndexOf(realBufferedSource, byteString, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j10) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public static final BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j10, ByteString bytes, int i10, int i11) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return i11 >= 0 && j10 >= 0 && i10 >= 0 && i10 + i11 <= bytes.size() && (i11 == 0 || commonIndexOf(realBufferedSource, bytes, i10, i11, j10, j10 + 1) != -1);
    }

    public static final long commonRead(okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, Sink sink) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(sink, "sink");
        long j10 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j10;
        }
        long size = j10 + realBufferedSource.bufferField.size();
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteArray(j10);
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!realBufferedSource.request(j11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b10, AbstractC10788a.m23073a(16));
            AbstractC9979u.m20293f(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!realBufferedSource.request(i11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b10, AbstractC10788a.m23073a(16));
            AbstractC9979u.m20293f(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && realBufferedSource.request(j11) && realBufferedSource.bufferField.getByte(j11 - 1) == 13 && realBufferedSource.request(j11 + 1) && realBufferedSource.bufferField.getByte(j11) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j10) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j10) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    public static final Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    private static final boolean isMatchPossibleByExpandingBuffer(Buffer buffer, ByteString byteString, int i10, int i11, long j10, long j11) {
        if (buffer.size() < j11) {
            return true;
        }
        int iMax = (int) Math.max(1L, (buffer.size() - j11) + 1);
        int iMin = ((int) Math.min(i11, (buffer.size() - j10) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i12 = iMin;
        while (true) {
            Buffer buffer2 = buffer;
            ByteString byteString2 = byteString;
            int i13 = i10;
            if (buffer2.rangeEquals(buffer.size() - i12, byteString2, i13, i12)) {
                return true;
            }
            if (i12 == iMax) {
                return false;
            }
            i12--;
            buffer = buffer2;
            byteString = byteString2;
            i10 = i13;
        }
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) throws EOFException {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(sink, "sink");
        try {
            realBufferedSource.require(j10);
            realBufferedSource.bufferField.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e10;
        }
    }

    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString byteString, int i10, int i11, long j10, long j11) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        ByteString bytes = byteString;
        AbstractC9979u.m20294g(bytes, "bytes");
        int i12 = i10;
        long j12 = i11;
        SegmentedByteString.checkOffsetAndCount(bytes.size(), i12, j12);
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        long jMax = j10;
        while (true) {
            long jCommonIndexOf = Buffer.commonIndexOf(realBufferedSource.bufferField, bytes, jMax, j11, i12, i11);
            if (jCommonIndexOf != -1) {
                return jCommonIndexOf;
            }
            long size = (realBufferedSource.bufferField.size() - j12) + 1;
            if (size >= j11) {
                return -1L;
            }
            long j13 = jMax;
            if (!isMatchPossibleByExpandingBuffer(realBufferedSource.bufferField, byteString, i10, i11, j13, j11) || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j13, size);
            bytes = byteString;
            i12 = i10;
        }
    }

    public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] sink, int i10, int i11) {
        AbstractC9979u.m20294g(realBufferedSource, "<this>");
        AbstractC9979u.m20294g(sink, "sink");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, j10);
        if (realBufferedSource.bufferField.size() == 0) {
            if (i11 == 0) {
                return 0;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return realBufferedSource.bufferField.read(sink, i10, (int) Math.min(j10, realBufferedSource.bufferField.size()));
    }
}

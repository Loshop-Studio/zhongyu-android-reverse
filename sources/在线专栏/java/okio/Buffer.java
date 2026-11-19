package okio;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.umeng.analytics.pro.C1892bw;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2757a0;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.connection.RealConnection;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2478d;

/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @Nullable
    public Segment head;
    private long size;

    public static final class UnsafeCursor implements Closeable {

        @Nullable
        public Buffer buffer;

        @Nullable
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i4) {
            if (!(i4 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i4).toString());
            }
            if (!(i4 <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i4).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
            int i5 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j4 = i5;
            buffer.setSize$okio(size + j4);
            this.segment = segmentWritableSegment$okio;
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i5;
            this.end = 8192;
            return j4;
        }

        public final int next() {
            long j4 = this.offset;
            Buffer buffer = this.buffer;
            C2769l.m9239c(buffer);
            if (!(j4 != buffer.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j5 = this.offset;
            return seek(j5 == -1 ? 0L : j5 + (this.end - this.start));
        }

        public final long resizeBuffer(long j4) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i4 = 1;
            if (j4 <= size) {
                if (!(j4 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j4).toString());
                }
                long j5 = size - j4;
                while (true) {
                    if (j5 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    C2769l.m9239c(segment);
                    Segment segment2 = segment.prev;
                    C2769l.m9239c(segment2);
                    int i5 = segment2.limit;
                    long j6 = i5 - segment2.pos;
                    if (j6 > j5) {
                        segment2.limit = i5 - ((int) j5);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j5 -= j6;
                }
                this.segment = null;
                this.offset = j4;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j4 > size) {
                long j7 = j4 - size;
                boolean z3 = true;
                while (j7 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
                    int iMin = (int) Math.min(j7, 8192 - segmentWritableSegment$okio.limit);
                    int i6 = segmentWritableSegment$okio.limit + iMin;
                    segmentWritableSegment$okio.limit = i6;
                    j7 -= iMin;
                    if (z3) {
                        this.segment = segmentWritableSegment$okio;
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        this.start = i6 - iMin;
                        this.end = i6;
                        z3 = false;
                    }
                    i4 = 1;
                }
            }
            buffer.setSize$okio(j4);
            return size;
        }

        public final int seek(long j4) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j4 < -1 || j4 > buffer.size()) {
                C2757a0 c2757a0 = C2757a0.f10720a;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(buffer.size())}, 2));
                C2769l.m9240d(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (j4 == -1 || j4 == buffer.size()) {
                this.segment = null;
                this.offset = j4;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long j5 = 0;
            long size = buffer.size();
            Segment segment = buffer.head;
            Segment segment2 = this.segment;
            if (segment2 != null) {
                long j6 = this.offset;
                int i4 = this.start;
                C2769l.m9239c(segment2);
                long j7 = j6 - (i4 - segment2.pos);
                if (j7 > j4) {
                    segmentPush = segment;
                    segment = this.segment;
                    size = j7;
                } else {
                    segmentPush = this.segment;
                    j5 = j7;
                }
            } else {
                segmentPush = segment;
            }
            if (size - j4 > j4 - j5) {
                while (true) {
                    C2769l.m9239c(segmentPush);
                    int i5 = segmentPush.limit;
                    int i6 = segmentPush.pos;
                    if (j4 < (i5 - i6) + j5) {
                        break;
                    }
                    j5 += i5 - i6;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j4) {
                    C2769l.m9239c(segment);
                    segment = segment.prev;
                    C2769l.m9239c(segment);
                    size -= segment.limit - segment.pos;
                }
                j5 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                C2769l.m9239c(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    C2769l.m9239c(segment3);
                    segment3.pop();
                }
            }
            this.segment = segmentPush;
            this.offset = j4;
            C2769l.m9239c(segmentPush);
            this.data = segmentPush.data;
            int i7 = segmentPush.pos + ((int) (j4 - j5));
            this.start = i7;
            int i8 = segmentPush.limit;
            this.end = i8;
            return i8 - i7;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j4, long j5, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        long j6 = j4;
        if ((i4 & 4) != 0) {
            j5 = buffer.size - j6;
        }
        return buffer.copyTo(outputStream, j6, j5);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return buffer.copyTo(buffer2, j4);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return buffer.copyTo(buffer2, j4, j5);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            messageDigest.update(bArr, i4, segment.limit - i4);
            Segment segment2 = segment.next;
            C2769l.m9239c(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i5 = segment2.pos;
                messageDigest.update(bArr2, i5, segment2.limit - i5);
                segment2 = segment2.next;
                C2769l.m9239c(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        C2769l.m9240d(bArrDigest, "messageDigest.digest()");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i4 = segment.pos;
                mac.update(bArr, i4, segment.limit - i4);
                Segment segment2 = segment.next;
                C2769l.m9239c(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i5 = segment2.pos;
                    mac.update(bArr2, i5, segment2.limit - i5);
                    segment2 = segment2.next;
                    C2769l.m9239c(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            C2769l.m9240d(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j4, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j4 = buffer.size;
        }
        return buffer.writeTo(outputStream, j4);
    }

    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m10875deprecated_getByte(long j4) {
        return getByte(j4);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m10876deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        Segment segment2 = segment.prev;
        C2769l.m9239c(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= r3 - segment2.pos;
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
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
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j4) throws IOException {
        return copyTo$default(this, outputStream, j4, 0L, 4, (Object) null);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j4, long j5) throws IOException {
        C2769l.m9241e(out, "out");
        Util.checkOffsetAndCount(this.size, j4, j5);
        if (j5 == 0) {
            return this;
        }
        Segment segment = this.head;
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
            int iMin = (int) Math.min(segment.limit - r10, j5);
            out.write(segment.data, (int) (segment.pos + j4), iMin);
            j5 -= iMin;
            segment = segment.next;
            j4 = 0;
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            Buffer buffer = (Buffer) obj;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                Segment segment = this.head;
                C2769l.m9239c(segment);
                Segment segment2 = buffer.head;
                C2769l.m9239c(segment2);
                int i4 = segment.pos;
                int i5 = segment2.pos;
                long j4 = 0;
                while (j4 < size()) {
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
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j4) {
        Util.checkOffsetAndCount(size(), j4, 1L);
        Segment segment = this.head;
        if (segment == null) {
            C2769l.m9239c(null);
            throw null;
        }
        if (size() - j4 < j4) {
            long size = size();
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

    public int hashCode() {
        Segment segment = this.head;
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
        } while (segment != this.head);
        return i4;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac("HmacSHA1", key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4) {
        return indexOf(b4, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        C2769l.m9241e(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int i4, int i5) {
                C2769l.m9241e(sink, "sink");
                return Buffer.this.read(sink, i4, i5);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i4) {
                Buffer.this.writeByte(i4);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int i4, int i5) {
                C2769l.m9241e(data, "data");
                Buffer.this.write(data, i4, i5);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j4, @NotNull ByteString bytes) {
        C2769l.m9241e(bytes, "bytes");
        return rangeEquals(j4, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        C2769l.m9241e(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i4 = segment.pos + iMin;
        segment.pos = i4;
        this.size -= iMin;
        if (i4 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        C2769l.m9241e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        C2769l.m9241e(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        int i6 = i4 + 1;
        byte b4 = segment.data[i4];
        setSize$okio(size() - 1);
        if (i6 == i5) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return b4;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[EDGE_INSN: B:51:0x00c2->B:41:0x00c2 BREAK  A[LOOP:0: B:5:0x0011->B:53:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        C2769l.m9241e(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long j4) throws EOFException {
        C2769l.m9241e(sink, "sink");
        if (size() >= j4) {
            sink.write(this, j4);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[EDGE_INSN: B:43:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.C2769l.m9239c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto La8
        La6:
            r6.pos = r8
        La8:
            if (r1 != 0) goto Lae
            okio.Segment r6 = r15.head
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & 255) << 24) | ((bArr[i6] & 255) << 16);
        int i9 = i7 + 1;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        int i11 = i9 + 1;
        int i12 = i10 | (bArr[i9] & 255);
        setSize$okio(size() - 4);
        if (i11 == i5) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i11;
        }
        return i12;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
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
        setSize$okio(size() - 8);
        if (i7 == i5) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return j11;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
        setSize$okio(size() - 2);
        if (i7 == i5) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return (short) i8;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        C2769l.m9241e(charset, "charset");
        return readString(this.size, charset);
    }

    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        C2769l.m9241e(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, C2478d.f10082b);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i4;
        int i5;
        int i6;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b4 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b4 & 7;
            i5 = 4;
            i6 = ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
        }
        long j4 = i5;
        if (size() < j4) {
            throw new EOFException("size < " + i5 + ": " + size() + " (to read code point prefixed 0x" + Util.toHexString(b4) + ')');
        }
        for (int i7 = 1; i7 < i5; i7++) {
            long j5 = i7;
            byte b5 = getByte(j5);
            if ((b5 & 192) != 128) {
                skip(j5);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = (i4 << 6) | (b5 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j4);
        return i4 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 <= i4 && 57343 >= i4) || i4 < i6) ? Utf8.REPLACEMENT_CODE_POINT : i4;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long j4) {
        return this.size >= j4;
    }

    @Override // okio.BufferedSource
    public void require(long j4) throws EOFException {
        if (this.size < j4) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        C2769l.m9241e(options, "options");
        int iSelectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j4) {
        this.size = j4;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j4) throws EOFException {
        while (j4 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            long j5 = iMin;
            setSize$okio(size() - j5);
            j4 -= j5;
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i4) {
        if (!(i4 >= 1 && i4 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            C2769l.m9239c(segment);
            Segment segment2 = segment.prev;
            C2769l.m9239c(segment2);
            return (segment2.limit + i4 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        C2769l.m9241e(source, "source");
        long j4 = 0;
        while (true) {
            long j5 = source.read(this, 8192);
            if (j5 == -1) {
                return j4;
            }
            j4 += j5;
        }
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long j4) throws IOException {
        C2769l.m9241e(out, "out");
        Util.checkOffsetAndCount(this.size, 0L, j4);
        Segment segment = this.head;
        while (j4 > 0) {
            C2769l.m9239c(segment);
            int iMin = (int) Math.min(j4, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            long j5 = iMin;
            this.size -= j5;
            j4 -= j5;
            if (i4 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4, long j4) {
        return indexOf(b4, j4, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long j4) {
        int i4;
        int i5;
        C2769l.m9241e(targetBytes, "targetBytes");
        long size = 0;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j4 < j4) {
            size = size();
            while (size > j4) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b4 = targetBytes.getByte(0);
                byte b5 = targetBytes.getByte(1);
                while (size < size()) {
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
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
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
            while (size < size()) {
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
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
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
        return -1L;
        return (i4 - i5) + size;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j4, @NotNull ByteString bytes, int i4, int i5) {
        C2769l.m9241e(bytes, "bytes");
        if (j4 < 0 || i4 < 0 || i5 < 0 || size() - j4 < i5 || bytes.size() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (getByte(i6 + j4) != bytes.getByte(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j4) throws EOFException {
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (size() < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j4) throws EOFException {
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (size() < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new ByteString(readByteArray(j4));
        }
        ByteString byteStringSnapshot = snapshot((int) j4);
        skip(j4);
        return byteStringSnapshot;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long j4) throws IOException {
        C2769l.m9241e(input, "input");
        if (j4 >= 0) {
            readFrom(input, j4, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j4, @NotNull Charset charset) throws EOFException {
        C2769l.m9241e(charset, "charset");
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.size < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        Segment segment = this.head;
        C2769l.m9239c(segment);
        int i4 = segment.pos;
        if (i4 + j4 > segment.limit) {
            return new String(readByteArray(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(segment.data, i4, i5, charset);
        int i6 = segment.pos + i5;
        segment.pos = i6;
        this.size -= j4;
        if (i6 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j4) throws EOFException {
        return readString(j4, C2478d.f10082b);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j4) throws EOFException {
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        byte b4 = (byte) 10;
        long jIndexOf = indexOf(b4, 0L, j5);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this, jIndexOf);
        }
        if (j5 < size() && getByte(j5 - 1) == ((byte) 13) && getByte(j5) == b4) {
            return BufferKt.readUtf8Line(this, j5);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j4) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i5 + 1;
        bArr[i5] = (byte) i4;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long j4) {
        if (j4 == 0) {
            return writeByte(48);
        }
        boolean z3 = false;
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return writeUtf8("-9223372036854775808");
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit + i4;
        while (j4 != 0) {
            long j5 = 10;
            i5--;
            bArr[i5] = BufferKt.getHEX_DIGIT_BYTES()[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z3) {
            bArr[i5 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j4) {
        if (j4 == 0) {
            return writeByte(48);
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
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j4)];
            j4 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
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
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i4) {
        return writeInt(Util.reverseBytes(i4));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long j4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
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
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long j4) {
        return writeLong(Util.reverseBytes(j4));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int i4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i6] = (byte) (i4 & 255);
        segmentWritableSegment$okio.limit = i6 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int i4) {
        return writeShort((int) Util.reverseBytes((short) i4));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int i4) {
        if (i4 < 128) {
            writeByte(i4);
        } else if (i4 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i5 = segmentWritableSegment$okio.limit;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio.limit = i5 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i4 && 57343 >= i4) {
            writeByte(63);
        } else if (i4 < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i6 = segmentWritableSegment$okio2.limit;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio2.limit = i6 + 3;
            setSize$okio(size() + 3);
        } else {
            if (i4 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i4));
            }
            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i7 = segmentWritableSegment$okio3.limit;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            segmentWritableSegment$okio3.limit = i7 + 4;
            setSize$okio(size() + 4);
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        C2769l.m9241e(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        C2769l.m9241e(string, "string");
        C2769l.m9241e(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        C2769l.m9241e(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    private final void readFrom(InputStream inputStream, long j4, boolean z3) throws IOException {
        while (true) {
            if (j4 <= 0 && !z3) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i4 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j4, 8192 - segmentWritableSegment$okio.limit));
            if (i4 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z3) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i4;
            long j5 = i4;
            this.size += j5;
            j4 -= j5;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4, long j4, long j5) {
        Segment segment;
        int i4;
        long size = 0;
        if (!(0 <= j4 && j5 >= j4)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        if (j5 > size()) {
            j5 = size();
        }
        if (j4 == j5 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j4 < j4) {
            size = size();
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

    @NotNull
    public final ByteString snapshot(int i4) {
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, i4);
        Segment segment = this.head;
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
        Segment segment2 = this.head;
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

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int i4, int i5, @NotNull Charset charset) {
        C2769l.m9241e(string, "string");
        C2769l.m9241e(charset, "charset");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 >= i4) {
            if (i5 <= string.length()) {
                if (C2769l.m9237a(charset, C2478d.f10082b)) {
                    return writeUtf8(string, i4, i5);
                }
                String strSubstring = string.substring(i4, i5);
                C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = strSubstring.getBytes(charset);
                C2769l.m9240d(bytes, "(this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + string.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int i4, int i5) {
        C2769l.m9241e(string, "string");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 >= i4) {
            if (!(i5 <= string.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + string.length()).toString());
            }
            while (i4 < i5) {
                char cCharAt = string.charAt(i4);
                if (cCharAt < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
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
                    setSize$okio(size() + i9);
                    i4 = i7;
                } else {
                    if (cCharAt < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i10 = segmentWritableSegment$okio2.limit;
                        bArr2[i10] = (byte) ((cCharAt >> 6) | 192);
                        bArr2[i10 + 1] = (byte) ((cCharAt & '?') | 128);
                        segmentWritableSegment$okio2.limit = i10 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                        int i11 = i4 + 1;
                        char cCharAt3 = i11 < i5 ? string.charAt(i11) : (char) 0;
                        if (cCharAt <= 56319 && 56320 <= cCharAt3 && 57343 >= cCharAt3) {
                            int i12 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i13 = segmentWritableSegment$okio3.limit;
                            bArr3[i13] = (byte) ((i12 >> 18) | 240);
                            bArr3[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                            bArr3[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                            bArr3[i13 + 3] = (byte) ((i12 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i13 + 4;
                            setSize$okio(size() + 4);
                            i4 += 2;
                        } else {
                            writeByte(63);
                            i4 = i11;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i14 = segmentWritableSegment$okio4.limit;
                        bArr4[i14] = (byte) ((cCharAt >> '\f') | 224);
                        bArr4[i14 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                        bArr4[i14 + 2] = (byte) ((cCharAt & '?') | 128);
                        segmentWritableSegment$okio4.limit = i14 + 3;
                        setSize$okio(size() + 3);
                    }
                    i4++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        C2769l.m9241e(sink, "sink");
        int i4 = 0;
        while (i4 < sink.length) {
            int i5 = read(sink, i4, sink.length - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        C2769l.m9241e(source, "source");
        int iRemaining = source.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i4, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i4 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        C2769l.m9241e(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j4) {
        C2769l.m9241e(out, "out");
        return copyTo(out, j4, this.size - j4);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int i4, int i5) {
        C2769l.m9241e(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i4, i5);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i5, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i6 = segment.pos;
        C2723g.m9081c(bArr, sink, i4, i6, i6 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos != segment.limit) {
            return iMin;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return iMin;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j4, long j5) {
        C2769l.m9241e(out, "out");
        Util.checkOffsetAndCount(size(), j4, j5);
        if (j5 != 0) {
            out.setSize$okio(out.size() + j5);
            Segment segment = this.head;
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
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        C2769l.m9241e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i4, int i5) {
        C2769l.m9241e(byteString, "byteString");
        byteString.write$okio(this, i4, i5);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        C2769l.m9241e(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int i4, int i5) {
        C2769l.m9241e(source, "source");
        long j4 = i5;
        Util.checkOffsetAndCount(source.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i6 - i4, 8192 - segmentWritableSegment$okio.limit);
            int i7 = i4 + iMin;
            C2723g.m9081c(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i4, i7);
            segmentWritableSegment$okio.limit += iMin;
            i4 = i7;
        }
        setSize$okio(size() + j4);
        return this;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j4) {
        C2769l.m9241e(sink, "sink");
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j4 > size()) {
            j4 = size();
        }
        sink.write(this, j4);
        return j4;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long j4) throws IOException {
        C2769l.m9241e(source, "source");
        while (j4 > 0) {
            long j5 = source.read(this, j4);
            if (j5 == -1) {
                throw new EOFException();
            }
            j4 -= j5;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long j4) throws IOException {
        long j5 = j4;
        C2769l.m9241e(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j6 = 0;
        if (j5 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j5 < j5) {
                    long size = size();
                    while (size > j5) {
                        segment = segment.prev;
                        C2769l.m9239c(segment);
                        size -= segment.limit - segment.pos;
                    }
                    byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                    byte b4 = bArrInternalArray$okio[0];
                    int size2 = bytes.size();
                    long size3 = (size() - size2) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        long j7 = size;
                        int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                        for (int i4 = (int) ((segment.pos + j5) - j7); i4 < iMin; i4++) {
                            if (bArr[i4] == b4 && BufferKt.rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                                return (i4 - segment.pos) + j7;
                            }
                        }
                        size = j7 + (segment.limit - segment.pos);
                        segment = segment.next;
                        C2769l.m9239c(segment);
                        j5 = size;
                    }
                } else {
                    while (true) {
                        long j8 = (segment.limit - segment.pos) + j6;
                        if (j8 > j5) {
                            break;
                        }
                        segment = segment.next;
                        C2769l.m9239c(segment);
                        j6 = j8;
                    }
                    byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                    byte b5 = bArrInternalArray$okio2[0];
                    int size4 = bytes.size();
                    long size5 = (size() - size4) + 1;
                    while (j6 < size5) {
                        byte[] bArr2 = segment.data;
                        long j9 = size5;
                        int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - j6);
                        for (int i5 = (int) ((segment.pos + j5) - j6); i5 < iMin2; i5++) {
                            if (bArr2[i5] == b5 && BufferKt.rangeEquals(segment, i5 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return (i5 - segment.pos) + j6;
                            }
                        }
                        j6 += segment.limit - segment.pos;
                        segment = segment.next;
                        C2769l.m9239c(segment);
                        j5 = j6;
                        size5 = j9;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j4) {
        Segment segment;
        C2769l.m9241e(source, "source");
        if (source != this) {
            Util.checkOffsetAndCount(source.size(), 0L, j4);
            while (j4 > 0) {
                Segment segment2 = source.head;
                C2769l.m9239c(segment2);
                int i4 = segment2.limit;
                C2769l.m9239c(source.head);
                if (j4 < i4 - r2.pos) {
                    Segment segment3 = this.head;
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
                            setSize$okio(size() + j4);
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
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    C2769l.m9239c(segment7);
                    Segment segment8 = segment7.prev;
                    C2769l.m9239c(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j5);
                setSize$okio(size() + j5);
                j4 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}

package okio;

import androidx.compose.animation.core.AnimationKt;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3376bw;
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
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.internal.BufferKt;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, m5175d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", C3335ai.f1662aC, "writeHexadecimalUnsignedLong", "writeInt", C3335ai.f1660aA, "writeIntLe", "writeLong", "writeLongLe", "writeShort", C3335ai.f1711az, "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @JvmField
    public Segment head;
    private long size;

    @Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m5175d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", "offset", "", "readWrite", "", "segment", "Lokio/Segment;", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, m5176k = 1, m5177mv = {1, 4, 0})
    public static final class UnsafeCursor implements Closeable {

        @JvmField
        public Buffer buffer;

        @JvmField
        public byte[] data;

        @JvmField
        public boolean readWrite;
        private Segment segment;

        @JvmField
        public long offset = -1;

        @JvmField
        public int start = -1;

        @JvmField
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

        public final long expandBuffer(int minByteCount) {
            if (!(minByteCount > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + minByteCount).toString());
            }
            if (!(minByteCount <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + minByteCount).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i4 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j4 = i4;
            buffer.setSize$okio(size + j4);
            this.segment = segmentWritableSegment$okio;
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i4;
            this.end = 8192;
            return j4;
        }

        public final int next() {
            long j4 = this.offset;
            Buffer buffer = this.buffer;
            Intrinsics.checkNotNull(buffer);
            if (!(j4 != buffer.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j5 = this.offset;
            return seek(j5 == -1 ? 0L : j5 + (this.end - this.start));
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i4 = 1;
            if (newSize <= size) {
                if (!(newSize >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j4 = size - newSize;
                while (true) {
                    if (j4 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    Intrinsics.checkNotNull(segment);
                    Segment segment2 = segment.prev;
                    Intrinsics.checkNotNull(segment2);
                    int i5 = segment2.limit;
                    long j5 = i5 - segment2.pos;
                    if (j5 > j4) {
                        segment2.limit = i5 - ((int) j4);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j4 -= j5;
                }
                this.segment = null;
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j6 = newSize - size;
                boolean z3 = true;
                while (j6 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i4);
                    int iMin = (int) Math.min(j6, 8192 - segmentWritableSegment$okio.limit);
                    int i6 = segmentWritableSegment$okio.limit + iMin;
                    segmentWritableSegment$okio.limit = i6;
                    j6 -= iMin;
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
            buffer.setSize$okio(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (offset < -1 || offset > buffer.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(offset), Long.valueOf(buffer.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (offset == -1 || offset == buffer.size()) {
                this.segment = null;
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            Segment segment2 = this.segment;
            long j4 = 0;
            if (segment2 != null) {
                long j5 = this.offset;
                int i4 = this.start;
                Intrinsics.checkNotNull(segment2);
                long j6 = j5 - (i4 - segment2.pos);
                if (j6 > offset) {
                    segmentPush = segment;
                    segment = this.segment;
                    size = j6;
                } else {
                    segmentPush = this.segment;
                    j4 = j6;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j4) {
                while (true) {
                    Intrinsics.checkNotNull(segmentPush);
                    int i5 = segmentPush.limit;
                    int i6 = segmentPush.pos;
                    if (offset < (i5 - i6) + j4) {
                        break;
                    }
                    j4 += i5 - i6;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.checkNotNull(segment);
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= segment.limit - segment.pos;
                }
                j4 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    Intrinsics.checkNotNull(segment3);
                    segment3.pop();
                }
            }
            this.segment = segmentPush;
            this.offset = offset;
            Intrinsics.checkNotNull(segmentPush);
            this.data = segmentPush.data;
            int i7 = segmentPush.pos + ((int) (offset - j4));
            this.start = i7;
            int i8 = segmentPush.limit;
            this.end = i8;
            return i8 - i7;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return buffer.copyTo(buffer2, j4);
    }

    private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i4 = segment.pos;
            messageDigest.update(bArr, i4, segment.limit - i4);
            Segment segment2 = segment.next;
            Intrinsics.checkNotNull(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i5 = segment2.pos;
                messageDigest.update(bArr2, i5, segment2.limit - i5);
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest()");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String algorithm, ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.internalArray$okio(), algorithm));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i4 = segment.pos;
                mac.update(bArr, i4, segment.limit - i4);
                Segment segment2 = segment.next;
                Intrinsics.checkNotNull(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i5 = segment2.pos;
                    mac.update(bArr2, i5, segment2.limit - i5);
                    segment2 = segment2.next;
                    Intrinsics.checkNotNull(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "mac.doFinal()");
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

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m13365deprecated_getByte(long index) {
        return getByte(index);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* renamed from: buffer */
    public Buffer getBufferField() {
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
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= r3 - segment2.pos;
        }
        return size;
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
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
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @JvmOverloads
    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Buffer) {
            Buffer buffer = (Buffer) other;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = buffer.head;
                Intrinsics.checkNotNull(segment2);
                int i4 = segment.pos;
                int i5 = segment2.pos;
                long j4 = 0;
                while (j4 < size()) {
                    long jMin = Math.min(segment.limit - i4, segment2.limit - i5);
                    long j5 = 0;
                    while (j5 < jMin) {
                        int i6 = i4 + 1;
                        int i7 = i5 + 1;
                        if (segment.data[i4] == segment2.data[i5]) {
                            j5++;
                            i4 = i6;
                            i5 = i7;
                        }
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
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long pos) {
        Util.checkOffsetAndCount(size(), pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + pos) - size)];
        }
        long j4 = 0;
        while (true) {
            long j5 = (segment.limit - segment.pos) + j4;
            if (j5 > pos) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + pos) - j4)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j4 = j5;
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
            Intrinsics.checkNotNull(segment);
        } while (segment != this.head);
        return i4;
    }

    public final ByteString hmacSha1(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4) {
        return indexOf(b4, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
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
                    return Buffer.this.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int offset, int byteCount) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                return Buffer.this.read(sink, offset, byteCount);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b4) {
                Buffer.this.writeByte(b4);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                Buffer.this.write(data, offset, byteCount);
            }
        };
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
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
    public long readAll(Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @JvmOverloads
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
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
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3 A[EDGE_INSN: B:48:0x00b3->B:38:0x00b3 BREAK  A[LOOP:0: B:5:0x0011->B:50:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            okio.Segment r7 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L1c:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6f
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6f
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7b
        L42:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            okio.Buffer r0 = r0.writeByte(r11)
            if (r1 != 0) goto L54
            r0.readByte()
        L54:
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
        L6f:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L80
            if (r0 != 0) goto L80
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7b:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1c
        L80:
            if (r0 == 0) goto L84
            r2 = r13
            goto L9f
        L84:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.Util.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            okio.Segment r8 = r7.pop()
            r15.head = r8
            okio.SegmentPool.recycle(r7)
            goto Lad
        Lab:
            r7.pos = r9
        Lad:
            if (r2 != 0) goto Lb3
            okio.Segment r7 = r15.head
            if (r7 != 0) goto L11
        Lb3:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.setSize$okio(r5)
            if (r1 == 0) goto Lbf
            goto Lc0
        Lbf:
            long r3 = -r3
        Lc0:
            return r3
        Lc1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= byteCount) {
            sink.write(this, byteCount);
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
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
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
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
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
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La8
        La6:
            r6.pos = r8
        La8:
            if (r1 != 0) goto Lae
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
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
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & UByte.MAX_VALUE) << 24) | ((bArr[i6] & UByte.MAX_VALUE) << 16);
        int i9 = i7 + 1;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8);
        int i11 = i9 + 1;
        int i12 = i10 | (bArr[i9] & UByte.MAX_VALUE);
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
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
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
        setSize$okio(size() - 8);
        if (i7 == i5) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i7;
        }
        return j9;
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
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        int i5 = segment.limit;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        byte[] bArr = segment.data;
        int i6 = i4 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i4] & UByte.MAX_VALUE) << 8) | (bArr[i6] & UByte.MAX_VALUE);
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
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    @JvmOverloads
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i4 = b4 & 7;
            i5 = 4;
            i6 = 65536;
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
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j4) {
        this.size = j4;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j4 = iMin;
            setSize$okio(size() - j4);
            byteCount -= j4;
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            if (i4 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int minimumCapacity) {
        if (!(minimumCapacity >= 1 && minimumCapacity <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long j5 = source.read(this, 8192);
            if (j5 == -1) {
                return j4;
            }
            j4 += j5;
        }
    }

    @JvmOverloads
    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return buffer.copyTo(buffer2, j4, j5);
    }

    public Buffer clone() {
        return copy();
    }

    @JvmOverloads
    public final Buffer copyTo(OutputStream outputStream, long j4) throws IOException {
        return copyTo$default(this, outputStream, j4, 0L, 4, (Object) null);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4, long fromIndex) {
        return indexOf(b4, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long fromIndex) {
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (!(fromIndex >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b4 = targetBytes.getByte(0);
                byte b5 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i4 = (int) ((segment.pos + fromIndex) - size);
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
                    fromIndex = size;
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = segment.data;
                i4 = (int) ((segment.pos + fromIndex) - size);
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
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + size;
            if (j4 > fromIndex) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        if (targetBytes.size() == 2) {
            byte b9 = targetBytes.getByte(0);
            byte b10 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i4 = (int) ((segment.pos + fromIndex) - size);
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
                fromIndex = size;
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = segment.data;
            i4 = (int) ((segment.pos + fromIndex) - size);
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
            fromIndex = size;
        }
        return -1L;
        return (i4 - i5) + size;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i4 = 0; i4 < byteCount; i4++) {
            if (getByte(i4 + offset) != bytes.getByte(bytesOffset + i4)) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringSnapshot = snapshot((int) byteCount);
        skip(byteCount);
        return byteStringSnapshot;
    }

    public final Buffer readFrom(InputStream input, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        if (byteCount >= 0) {
            readFrom(input, byteCount, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
    }

    @Override // okio.BufferedSource
    public String readString(long byteCount, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i4 = segment.pos;
        if (i4 + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i5 = (int) byteCount;
        String str = new String(segment.data, i4, i5, charset);
        int i6 = segment.pos + i5;
        segment.pos = i6;
        this.size -= byteCount;
        if (i6 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @JvmOverloads
    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j4 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        byte b4 = (byte) 10;
        long jIndexOf = indexOf(b4, 0L, j4);
        if (jIndexOf != -1) {
            return BufferKt.readUtf8Line(this, jIndexOf);
        }
        if (j4 < size() && getByte(j4 - 1) == ((byte) 13) && getByte(j4) == b4) {
            return BufferKt.readUtf8Line(this, j4);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int b4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i4 + 1;
        bArr[i4] = (byte) b4;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long v3) {
        boolean z3;
        if (v3 == 0) {
            return writeByte(48);
        }
        int i4 = 1;
        if (v3 < 0) {
            v3 = -v3;
            if (v3 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (v3 >= 100000000) {
            i4 = v3 < 1000000000000L ? v3 < 10000000000L ? v3 < 1000000000 ? 9 : 10 : v3 < 100000000000L ? 11 : 12 : v3 < 1000000000000000L ? v3 < 10000000000000L ? 13 : v3 < 100000000000000L ? 14 : 15 : v3 < 100000000000000000L ? v3 < 10000000000000000L ? 16 : 17 : v3 < 1000000000000000000L ? 18 : 19;
        } else if (v3 >= 10000) {
            i4 = v3 < AnimationKt.MillisToNanos ? v3 < 100000 ? 5 : 6 : v3 < 10000000 ? 7 : 8;
        } else if (v3 >= 100) {
            i4 = v3 < 1000 ? 3 : 4;
        } else if (v3 >= 10) {
            i4 = 2;
        }
        if (z3) {
            i4++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit + i4;
        while (v3 != 0) {
            long j4 = 10;
            i5--;
            bArr[i5] = BufferKt.getHEX_DIGIT_BYTES()[(int) (v3 % j4)];
            v3 /= j4;
        }
        if (z3) {
            bArr[i5 - 1] = (byte) 45;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long v3) {
        if (v3 == 0) {
            return writeByte(48);
        }
        long j4 = (v3 >>> 1) | v3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i4 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = writableSegment$okio(i4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & v3)];
            v3 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i4;
        setSize$okio(size() + i4);
        return this;
    }

    @Override // okio.BufferedSink
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
    public Buffer writeIntLe(int i4) {
        return writeInt(Util.reverseBytes(i4));
    }

    @Override // okio.BufferedSink
    public Buffer writeLong(long v3) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((v3 >>> 56) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((v3 >>> 48) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((v3 >>> 40) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((v3 >>> 32) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((v3 >>> 24) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((v3 >>> 16) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((v3 >>> 8) & 255);
        bArr[i11] = (byte) (v3 & 255);
        segmentWritableSegment$okio.limit = i11 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeLongLe(long v3) {
        return writeLong(Util.reverseBytes(v3));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int s3) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i4 = segmentWritableSegment$okio.limit;
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((s3 >>> 8) & 255);
        bArr[i5] = (byte) (s3 & 255);
        segmentWritableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeShortLe(int s3) {
        return writeShort((int) Util.reverseBytes((short) s3));
    }

    @JvmOverloads
    public final Buffer writeTo(OutputStream out, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        Util.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        while (byteCount > 0) {
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i4 = segment.pos + iMin;
            segment.pos = i4;
            long j4 = iMin;
            this.size -= j4;
            byteCount -= j4;
            if (i4 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i4 = segmentWritableSegment$okio.limit;
            bArr[i4] = (byte) ((codePoint >> 6) | 192);
            bArr[i4 + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit = i4 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= codePoint && 57343 >= codePoint) {
            writeByte(63);
        } else if (codePoint < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i5 = segmentWritableSegment$okio2.limit;
            bArr2[i5] = (byte) ((codePoint >> 12) | 224);
            bArr2[i5 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i5 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio2.limit = i5 + 3;
            setSize$okio(size() + 3);
        } else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(codePoint));
            }
            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i6 = segmentWritableSegment$okio3.limit;
            bArr3[i6] = (byte) ((codePoint >> 18) | 240);
            bArr3[i6 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
            bArr3[i6 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr3[i6 + 3] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio3.limit = i6 + 4;
            setSize$okio(size() + 4);
        }
        return this;
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

    @JvmOverloads
    public final Buffer copyTo(OutputStream out, long offset, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        Util.checkOffsetAndCount(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            int i4 = segment.limit;
            int i5 = segment.pos;
            if (offset < i4 - i5) {
                break;
            }
            offset -= i4 - i5;
            segment = segment.next;
        }
        while (byteCount > 0) {
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(segment.limit - r9, byteCount);
            out.write(segment.data, (int) (segment.pos + offset), iMin);
            byteCount -= iMin;
            segment = segment.next;
            offset = 0;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i4 = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i4 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i4;
            long j4 = i4;
            this.size += j4;
            byteCount -= j4;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b4, long fromIndex, long toIndex) {
        Segment segment;
        int i4;
        long size = 0;
        if (!(0 <= fromIndex && toIndex >= fromIndex)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
                i4 = (int) ((segment.pos + fromIndex) - size);
                while (i4 < iMin) {
                    if (bArr[i4] != b4) {
                        i4++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + size;
            if (j4 > fromIndex) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j4;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
            i4 = (int) ((segment.pos + fromIndex) - size);
            while (i4 < iMin2) {
                if (bArr2[i4] != b4) {
                    i4++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            fromIndex = size;
        }
        return -1L;
        return (i4 - segment.pos) + size;
    }

    public final ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, byteCount);
        Segment segment = this.head;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < byteCount) {
            Intrinsics.checkNotNull(segment);
            int i7 = segment.limit;
            int i8 = segment.pos;
            if (i7 != i8) {
                i5 += i7 - i8;
                i6++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        Segment segment2 = this.head;
        int i9 = 0;
        while (i4 < byteCount) {
            Intrinsics.checkNotNull(segment2);
            bArr[i9] = segment2.data;
            i4 += segment2.limit - segment2.pos;
            iArr[i9] = Math.min(i4, byteCount);
            iArr[i9 + i6] = segment2.pos;
            segment2.shared = true;
            i9++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String string, int beginIndex, int endIndex, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex <= string.length()) {
                if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                    return writeUtf8(string, beginIndex, endIndex);
                }
                String strSubstring = string.substring(beginIndex, endIndex);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (strSubstring != null) {
                    byte[] bytes = strSubstring.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String string, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex >= beginIndex) {
            if (!(endIndex <= string.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
            }
            while (beginIndex < endIndex) {
                char cCharAt = string.charAt(beginIndex);
                if (cCharAt < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i4 = segmentWritableSegment$okio.limit - beginIndex;
                    int iMin = Math.min(endIndex, 8192 - i4);
                    int i5 = beginIndex + 1;
                    bArr[beginIndex + i4] = (byte) cCharAt;
                    while (i5 < iMin) {
                        char cCharAt2 = string.charAt(i5);
                        if (cCharAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) cCharAt2;
                        i5++;
                    }
                    int i6 = segmentWritableSegment$okio.limit;
                    int i7 = (i4 + i5) - i6;
                    segmentWritableSegment$okio.limit = i6 + i7;
                    setSize$okio(size() + i7);
                    beginIndex = i5;
                } else {
                    if (cCharAt < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i8 = segmentWritableSegment$okio2.limit;
                        bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                        segmentWritableSegment$okio2.limit = i8 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                        int i9 = beginIndex + 1;
                        char cCharAt3 = i9 < endIndex ? string.charAt(i9) : (char) 0;
                        if (cCharAt <= 56319 && 56320 <= cCharAt3 && 57343 >= cCharAt3) {
                            int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i11 = segmentWritableSegment$okio3.limit;
                            bArr3[i11] = (byte) ((i10 >> 18) | 240);
                            bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i11 + 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        } else {
                            writeByte(63);
                            beginIndex = i9;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i12 = segmentWritableSegment$okio4.limit;
                        bArr4[i12] = (byte) ((cCharAt >> '\f') | 224);
                        bArr4[i12 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                        bArr4[i12 + 2] = (byte) ((cCharAt & '?') | 128);
                        segmentWritableSegment$okio4.limit = i12 + 3;
                        setSize$okio(size() + 3);
                    }
                    beginIndex++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
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
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
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
    public int read(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Util.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i4 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, offset, i4, i4 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos != segment.limit) {
            return iMin;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return iMin;
    }

    public final Buffer copyTo(Buffer out, long offset) {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        Util.checkOffsetAndCount(size(), offset, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            Segment segment = this.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i4 = segment.limit;
                int i5 = segment.pos;
                if (offset < i4 - i5) {
                    break;
                }
                offset -= i4 - i5;
                segment = segment.next;
            }
            while (byteCount > 0) {
                Intrinsics.checkNotNull(segment);
                Segment segmentSharedCopy = segment.sharedCopy();
                int i6 = segmentSharedCopy.pos + ((int) offset);
                segmentSharedCopy.pos = i6;
                segmentSharedCopy.limit = Math.min(i6 + ((int) byteCount), segmentSharedCopy.limit);
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
                byteCount -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment = segment.next;
                offset = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = byteCount;
        Util.checkOffsetAndCount(source.length, offset, j4);
        int i4 = byteCount + offset;
        while (offset < i4) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i4 - offset, 8192 - segmentWritableSegment$okio.limit);
            int i5 = offset + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, offset, i5);
            segmentWritableSegment$okio.limit += iMin;
            offset = i5;
        }
        setSize$okio(size() + j4);
        return this;
    }

    @Override // okio.Source
    public long read(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.BufferedSink
    public Buffer write(Source source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long j4 = source.read(this, byteCount);
            if (j4 == -1) {
                throw new EOFException();
            }
            byteCount -= j4;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes, long fromIndex) throws IOException {
        long j4 = fromIndex;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j5 = 0;
        if (j4 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j4 < j4) {
                    long size = size();
                    while (size > j4) {
                        segment = segment.prev;
                        Intrinsics.checkNotNull(segment);
                        size -= segment.limit - segment.pos;
                    }
                    byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                    byte b4 = bArrInternalArray$okio[0];
                    int size2 = bytes.size();
                    long size3 = (size() - size2) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        long j6 = size;
                        int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                        for (int i4 = (int) ((segment.pos + j4) - j6); i4 < iMin; i4++) {
                            if (bArr[i4] == b4 && BufferKt.rangeEquals(segment, i4 + 1, bArrInternalArray$okio, 1, size2)) {
                                return (i4 - segment.pos) + j6;
                            }
                        }
                        size = j6 + (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j4 = size;
                    }
                } else {
                    while (true) {
                        long j7 = (segment.limit - segment.pos) + j5;
                        if (j7 > j4) {
                            break;
                        }
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j5 = j7;
                    }
                    byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                    byte b5 = bArrInternalArray$okio2[0];
                    int size4 = bytes.size();
                    long size5 = (size() - size4) + 1;
                    while (j5 < size5) {
                        byte[] bArr2 = segment.data;
                        long j8 = size5;
                        int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - j5);
                        for (int i5 = (int) ((segment.pos + j4) - j5); i5 < iMin2; i5++) {
                            if (bArr2[i5] == b5 && BufferKt.rangeEquals(segment, i5 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return (i5 - segment.pos) + j5;
                            }
                        }
                        j5 += segment.limit - segment.pos;
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j4 = j5;
                        size5 = j8;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
    }

    @Override // okio.Sink
    public void write(Buffer source, long byteCount) {
        Segment segment;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            Util.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i4 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (byteCount < i4 - r2.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + byteCount) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) byteCount);
                            source.setSize$okio(source.size() - byteCount);
                            setSize$okio(size() + byteCount);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) byteCount);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j4 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    Intrinsics.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    Intrinsics.checkNotNull(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j4);
                setSize$okio(size() + j4);
                byteCount -= j4;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}

package okio.internal;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010\u0005\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\b\u0005\u0010\"\u001a$\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010'*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010-\u001a\u00020'*\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00104\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010/\u001a\u0014\u00105\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u0010/\u001a\u0014\u00106\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00107\u001a\u0014\u0010:\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00107\u001a\u001c\u0010;\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b;\u0010\f\u001a,\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010@\u001a$\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010A\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010B\u001a$\u0010D\u001a\u00020\u0003*\u00020\u00002\u0006\u0010C\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bD\u0010B\u001a4\u0010F\u001a\u00020\u0007*\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010I\u001a\u00020H*\u00020\u0000H\u0080\b¢\u0006\u0004\bI\u0010J\u001a\u0014\u0010K\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010)¨\u0006Q"}, m5110d2 = {"Lokio/RealBufferedSource;", "Lokio/Buffer;", "sink", "", "byteCount", "commonRead", "(Lokio/RealBufferedSource;Lokio/Buffer;J)J", "", "commonExhausted", "(Lokio/RealBufferedSource;)Z", "Ld6/s;", "commonRequire", "(Lokio/RealBufferedSource;J)V", "commonRequest", "(Lokio/RealBufferedSource;J)Z", "", "commonReadByte", "(Lokio/RealBufferedSource;)B", "Lokio/ByteString;", "commonReadByteString", "(Lokio/RealBufferedSource;)Lokio/ByteString;", "(Lokio/RealBufferedSource;J)Lokio/ByteString;", "Lokio/Options;", "options", "", "commonSelect", "(Lokio/RealBufferedSource;Lokio/Options;)I", "", "commonReadByteArray", "(Lokio/RealBufferedSource;)[B", "(Lokio/RealBufferedSource;J)[B", "commonReadFully", "(Lokio/RealBufferedSource;[B)V", TypedValues.CycleType.S_WAVE_OFFSET, "(Lokio/RealBufferedSource;[BII)I", "(Lokio/RealBufferedSource;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/RealBufferedSource;Lokio/Sink;)J", "", "commonReadUtf8", "(Lokio/RealBufferedSource;)Ljava/lang/String;", "(Lokio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "(Lokio/RealBufferedSource;)I", "", "commonReadShort", "(Lokio/RealBufferedSource;)S", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "(Lokio/RealBufferedSource;)J", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", "b", "fromIndex", "toIndex", "commonIndexOf", "(Lokio/RealBufferedSource;BJJ)J", "bytes", "(Lokio/RealBufferedSource;Lokio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "(Lokio/RealBufferedSource;JLokio/ByteString;II)Z", "Lokio/BufferedSource;", "commonPeek", "(Lokio/RealBufferedSource;)Lokio/BufferedSource;", "commonClose", "(Lokio/RealBufferedSource;)V", "Lokio/Timeout;", "commonTimeout", "(Lokio/RealBufferedSource;)Lokio/Timeout;", "commonToString", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-RealBufferedSource")
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,404:1\n1#2:405\n63#3:406\n63#3:407\n63#3:408\n63#3:409\n63#3:410\n63#3:411\n63#3:412\n63#3:413\n63#3:414\n63#3:415\n63#3:416\n63#3:417\n63#3:418\n63#3:419\n63#3:420\n63#3:421\n63#3:422\n63#3:423\n63#3:424\n63#3:425\n63#3:426\n63#3:427\n63#3:428\n63#3:430\n63#3:431\n63#3:432\n63#3:433\n63#3:434\n63#3:435\n63#3:436\n63#3:437\n63#3:438\n63#3:439\n63#3:440\n63#3:441\n63#3:442\n63#3:443\n63#3:444\n63#3:445\n63#3:446\n63#3:447\n63#3:448\n63#3:449\n63#3:451\n63#3:452\n63#3:453\n63#3:454\n63#3:455\n63#3:456\n63#3:457\n63#3:458\n63#3:459\n63#3:460\n63#3:461\n63#3:462\n63#3:463\n63#3:464\n63#3:465\n63#3:466\n63#3:467\n63#3:468\n63#3:469\n63#3:470\n63#3:471\n63#3:472\n63#3:473\n63#3:474\n63#3:475\n63#3:476\n63#3:477\n88#4:429\n88#4:450\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:406\n43#1:407\n47#1:408\n48#1:409\n53#1:410\n63#1:411\n64#1:412\n71#1:413\n75#1:414\n76#1:415\n81#1:416\n88#1:417\n95#1:418\n100#1:419\n108#1:420\n109#1:421\n114#1:422\n123#1:423\n124#1:424\n131#1:425\n137#1:426\n139#1:427\n143#1:428\n144#1:430\n152#1:431\n156#1:432\n161#1:433\n162#1:434\n165#1:435\n168#1:436\n169#1:437\n170#1:438\n176#1:439\n177#1:440\n182#1:441\n189#1:442\n190#1:443\n195#1:444\n203#1:445\n205#1:446\n206#1:447\n208#1:448\n211#1:449\n213#1:451\n221#1:452\n228#1:453\n233#1:454\n238#1:455\n243#1:456\n248#1:457\n253#1:458\n258#1:459\n266#1:460\n277#1:461\n285#1:462\n299#1:463\n306#1:464\n309#1:465\n310#1:466\n321#1:467\n326#1:468\n327#1:469\n340#1:470\n343#1:471\n344#1:472\n356#1:473\n359#1:474\n360#1:475\n385#1:476\n398#1:477\n143#1:429\n211#1:450\n*E\n"})
/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes4.dex */
public final class RealBufferedSource {
    public static final void commonClose(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull okio.RealBufferedSource realBufferedSource) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(@NotNull okio.RealBufferedSource realBufferedSource, byte b6, long j7, long j8) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        long jMax = j7;
        while (jMax < j8) {
            byte b9 = b6;
            long j9 = j8;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b9, jMax, j9);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j9 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b6 = b9;
            j8 = j9;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull ByteString targetBytes, long j7) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j7);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull okio.RealBufferedSource realBufferedSource) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(@NotNull okio.RealBufferedSource realBufferedSource, long j7, @NotNull ByteString bytes, int i, int i8) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j7 < 0 || i < 0 || i8 < 0 || bytes.size() - i < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = i9 + j7;
            if (!realBufferedSource.request(1 + j8) || realBufferedSource.bufferField.getByte(j8) != bytes.getByte(i + i9)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j7) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0) {
            if (j7 == 0) {
                return 0L;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j7, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Sink sink) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        long j7 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j7 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j7;
        }
        long size = realBufferedSource.bufferField.size() + j7;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(j7);
        return realBufferedSource.bufferField.readByteArray(j7);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(j7);
        return realBufferedSource.bufferField.readByteString(j7);
    }

    public static final long commonReadDecimalLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b6;
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j7 = 0;
        while (true) {
            long j8 = j7 + 1;
            if (!realBufferedSource.request(j8)) {
                break;
            }
            b6 = realBufferedSource.bufferField.getByte(j7);
            if ((b6 < 48 || b6 > 57) && !(j7 == 0 && b6 == 45)) {
                break;
            }
            j7 = j8;
        }
        if (j7 == 0) {
            AbstractC6768a.m6440d(16);
            String string = Integer.toString(b6, 16);
            AbstractC5830k.m5329f(string, "toString(...)");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i8 = buffer.read(sink, i, (int) buffer.size());
                if (i8 == -1) {
                    throw new AssertionError();
                }
                i += i8;
            }
            throw e;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b6;
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i8 = i + 1;
            if (!realBufferedSource.request(i8)) {
                break;
            }
            b6 = realBufferedSource.bufferField.getByte(i);
            if ((b6 < 48 || b6 > 57) && ((b6 < 97 || b6 > 102) && (b6 < 65 || b6 > 70))) {
                break;
            }
            i = i8;
        }
        if (i == 0) {
            AbstractC6768a.m6440d(16);
            String string = Integer.toString(b6, 16);
            AbstractC5830k.m5329f(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(j7);
        return realBufferedSource.bufferField.readUtf8(j7);
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b6 = realBufferedSource.bufferField.getByte(0L);
        if ((b6 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b6 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b6 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.RealBufferedSource realBufferedSource) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "limit < 0: ").toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j8 < Long.MAX_VALUE && realBufferedSource.request(j8) && realBufferedSource.bufferField.getByte(j8 - 1) == 13 && realBufferedSource.request(j8 + 1) && realBufferedSource.bufferField.getByte(j8) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j8);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j7) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(@NotNull okio.RealBufferedSource realBufferedSource, long j7) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(j7, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j7) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j7)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Options options) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public static final void commonSkip(@NotNull okio.RealBufferedSource realBufferedSource, long j7) throws EOFException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j7 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j7, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j7 -= jMin;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull okio.RealBufferedSource realBufferedSource) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        return realBufferedSource.source.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull okio.RealBufferedSource realBufferedSource) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j7) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        try {
            realBufferedSource.require(j7);
            realBufferedSource.bufferField.readFully(sink, j7);
        } catch (EOFException e) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull ByteString bytes, long j7) throws IOException {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j7);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, (size - bytes.size()) + 1);
        }
    }

    public static final int commonRead(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink, int i, int i8) {
        AbstractC5830k.m5330g(realBufferedSource, "<this>");
        AbstractC5830k.m5330g(sink, "sink");
        long j7 = i8;
        SegmentedByteString.checkOffsetAndCount(sink.length, i, j7);
        if (realBufferedSource.bufferField.size() == 0) {
            if (i8 == 0) {
                return 0;
            }
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return realBufferedSource.bufferField.read(sink, i, (int) Math.min(j7, realBufferedSource.bufferField.size()));
    }
}

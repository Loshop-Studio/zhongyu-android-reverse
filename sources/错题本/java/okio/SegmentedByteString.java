package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u0011\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001b\u001a7\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010&\u001a\u00020%*\u00020\nH\u0000¢\u0006\u0004\b&\u0010(\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010)\u001a\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010,\u001a\u00020\n*\u00020.2\u0006\u0010/\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00100\u001a\u001b\u0010,\u001a\u00020\n*\u00020\u001f2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00102\"\u001a\u00103\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u001a\u00107\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, m5110d2 = {"", "size", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "Ld6/s;", "checkOffsetAndCount", "(JJJ)V", "", "reverseBytes", "(S)S", "", "(I)I", "(J)J", "bitCount", "leftRotate", "(II)I", "rightRotate", "(JI)J", "", "other", "shr", "(BI)I", "shl", "and", "(BJ)J", "xor", "(BB)B", "(IJ)J", "a", "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "([BI[BII)Z", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "Lokio/ByteString;", RequestParameters.POSITION, "(Lokio/ByteString;I)I", "sizeParam", "([BI)I", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "DEFAULT__ByteString_size", "I", "getDEFAULT__ByteString_size", "()I", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class SegmentedByteString {

    @NotNull
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b6, int i) {
        return b6 & i;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a9, int i, @NotNull byte[] b6, int i8, int i9) {
        AbstractC5830k.m5330g(a9, "a");
        AbstractC5830k.m5330g(b6, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a9[i10 + i] != b6[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i, int i8) {
        return (i >>> (32 - i8)) | (i << i8);
    }

    public static final long minOf(long j7, int i) {
        return Math.min(j7, i);
    }

    @NotNull
    public static final Buffer.UnsafeCursor resolveDefaultParameter(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC5830k.m5330g(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long rightRotate(long j7, int i) {
        return (j7 << (64 - i)) | (j7 >>> i);
    }

    public static final int shl(byte b6, int i) {
        return b6 << i;
    }

    public static final int shr(byte b6, int i) {
        return b6 >> i;
    }

    @NotNull
    public static final String toHexString(byte b6) {
        return new String(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b6 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b6 & 15]});
    }

    public static final byte xor(byte b6, byte b9) {
        return (byte) (b6 ^ b9);
    }

    public static final long and(byte b6, long j7) {
        return b6 & j7;
    }

    public static final long minOf(int i, long j7) {
        return Math.min(i, j7);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString, int i) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return i == DEFAULT__ByteString_size ? byteString.size() : i;
    }

    public static final long reverseBytes(long j7) {
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    public static final long and(int i, long j7) {
        return i & j7;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] bArr, int i) {
        AbstractC5830k.m5330g(bArr, "<this>");
        return i == DEFAULT__ByteString_size ? bArr.length : i;
    }

    public static final short reverseBytes(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    @NotNull
    public static final String toHexString(int i) {
        if (i == 0) {
            return "0";
        }
        int i8 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i & 15]};
        while (i8 < 8 && cArr[i8] == '0') {
            i8++;
        }
        return AbstractC5862w.m5412s(cArr, i8, 8);
    }

    @NotNull
    public static final String toHexString(long j7) {
        if (j7 == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j7 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j7 & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return AbstractC5862w.m5412s(cArr, i, 16);
    }
}

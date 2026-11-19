package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Buffer;

@Metadata(m7879d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0000\u001a\f\u0010\u0006\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0003H\u0080\b\u001a0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\rH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0000\u001a\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020\u00172\u0006\u0010'\u001a\u00020\bH\u0000\"\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\bX\u0080D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, m7880d2 = {"checkOffsetAndCount", "", "size", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "reverseBytes", "", "", "leftRotate", "bitCount", "rightRotate", "shr", "", "other", "shl", "and", "xor", "minOf", "a", "b", "arrayRangeEquals", "", "", "aOffset", "bOffset", "toHexString", "", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "resolveDefaultParameter", "unsafeCursor", "DEFAULT__ByteString_size", "getDEFAULT__ByteString_size", "()I", "Lokio/ByteString;", RequestParameters.POSITION, "sizeParam", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b7, int i6) {
        return b7 & i6;
    }

    public static final boolean arrayRangeEquals(byte[] a7, int i6, byte[] b7, int i7, int i8) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        for (int i9 = 0; i9 < i8; i9++) {
            if (a7[i9 + i6] != b7[i9 + i7]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j6, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j6 || j6 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i6, int i7) {
        return (i6 >>> (32 - i7)) | (i6 << i7);
    }

    public static final long minOf(long j6, int i6) {
        return Math.min(j6, i6);
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i6) {
        return ((i6 & 255) << 24) | (((-16777216) & i6) >>> 24) | ((16711680 & i6) >>> 8) | ((65280 & i6) << 8);
    }

    public static final long rightRotate(long j6, int i6) {
        return (j6 << (64 - i6)) | (j6 >>> i6);
    }

    public static final int shl(byte b7, int i6) {
        return b7 << i6;
    }

    public static final int shr(byte b7, int i6) {
        return b7 >> i6;
    }

    public static final String toHexString(byte b7) {
        return StringsKt.concatToString(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b7 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b7 & 15]});
    }

    public static final byte xor(byte b7, byte b8) {
        return (byte) (b7 ^ b8);
    }

    public static final long and(byte b7, long j6) {
        return b7 & j6;
    }

    public static final long minOf(int i6, long j6) {
        return Math.min(i6, j6);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i6) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i6 == DEFAULT__ByteString_size ? byteString.size() : i6;
    }

    public static final long reverseBytes(long j6) {
        return ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
    }

    public static final long and(int i6, long j6) {
        return i6 & j6;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i6 == DEFAULT__ByteString_size ? bArr.length : i6;
    }

    public static final short reverseBytes(short s6) {
        return (short) (((s6 & 255) << 8) | ((65280 & s6) >>> 8));
    }

    public static final String toHexString(int i6) {
        if (i6 == 0) {
            return "0";
        }
        int i7 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i6 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i6 & 15]};
        while (i7 < 8 && cArr[i7] == '0') {
            i7++;
        }
        return StringsKt.concatToString(cArr, i7, 8);
    }

    public static final String toHexString(long j6) {
        if (j6 == 0) {
            return "0";
        }
        int i6 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j6 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j6 & 15)]};
        while (i6 < 16 && cArr[i6] == '0') {
            i6++;
        }
        return StringsKt.concatToString(cArr, i6, 16);
    }
}

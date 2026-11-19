package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.Buffer;

@Metadata(m13412d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0000\u001a\f\u0010\u0006\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0003H\u0080\b\u001a0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\rH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0000\u001a\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020\u00172\u0006\u0010'\u001a\u00020\bH\u0000\"\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\bX\u0080D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, m13413d2 = {"checkOffsetAndCount", "", "size", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "reverseBytes", "", "", "leftRotate", "bitCount", "rightRotate", "shr", "", "other", "shl", "and", "xor", "minOf", "a", "b", "arrayRangeEquals", "", "", "aOffset", "bOffset", "toHexString", "", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "resolveDefaultParameter", "unsafeCursor", "DEFAULT__ByteString_size", "getDEFAULT__ByteString_size", "()I", "Lokio/ByteString;", RequestParameters.POSITION, "sizeParam", "okio"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes5.dex */
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b10, int i9) {
        return b10 & i9;
    }

    public static final boolean arrayRangeEquals(byte[] a10, int i9, byte[] b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a10[i12 + i9] != b10[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j9 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i9, int i10) {
        return (i9 >>> (32 - i10)) | (i9 << i10);
    }

    public static final long minOf(long j9, int i9) {
        return Math.min(j9, i9);
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i9) {
        return ((i9 & 255) << 24) | (((-16777216) & i9) >>> 24) | ((16711680 & i9) >>> 8) | ((65280 & i9) << 8);
    }

    public static final long rightRotate(long j9, int i9) {
        return (j9 << (64 - i9)) | (j9 >>> i9);
    }

    public static final int shl(byte b10, int i9) {
        return b10 << i9;
    }

    public static final int shr(byte b10, int i9) {
        return b10 >> i9;
    }

    public static final String toHexString(byte b10) {
        return StringsKt.concatToString(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final long and(byte b10, long j9) {
        return b10 & j9;
    }

    public static final long minOf(int i9, long j9) {
        return Math.min(i9, j9);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i9) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i9 == DEFAULT__ByteString_size ? byteString.size() : i9;
    }

    public static final long reverseBytes(long j9) {
        return ((j9 & 255) << 56) | (((-72057594037927936L) & j9) >>> 56) | ((71776119061217280L & j9) >>> 40) | ((280375465082880L & j9) >>> 24) | ((1095216660480L & j9) >>> 8) | ((4278190080L & j9) << 8) | ((16711680 & j9) << 24) | ((65280 & j9) << 40);
    }

    public static final long and(int i9, long j9) {
        return i9 & j9;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i9 == DEFAULT__ByteString_size ? bArr.length : i9;
    }

    public static final short reverseBytes(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static final String toHexString(int i9) {
        if (i9 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i9 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return StringsKt.concatToString(cArr, i10, 8);
    }

    public static final String toHexString(long j9) {
        if (j9 == 0) {
            return "0";
        }
        int i9 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j9 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j9 & 15)]};
        while (i9 < 16 && cArr[i9] == '0') {
            i9++;
        }
        return StringsKt.concatToString(cArr, i9, 16);
    }
}

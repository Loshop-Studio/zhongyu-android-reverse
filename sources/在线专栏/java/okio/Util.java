package okio;

import com.umeng.analytics.pro.C1892bw;
import kotlin.jvm.internal.C2769l;
import okio.internal.ByteStringKt;
import org.android.agoo.message.MessageService;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-Util, reason: invalid class name */
/* loaded from: classes.dex */
public final class Util {
    public static final int and(byte b4, int i4) {
        return b4 & i4;
    }

    public static final long and(byte b4, long j4) {
        return b4 & j4;
    }

    public static final long and(int i4, long j4) {
        return i4 & j4;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a4, int i4, @NotNull byte[] b4, int i5, int i6) {
        C2769l.m9241e(a4, "a");
        C2769l.m9241e(b4, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (a4[i7 + i4] != b4[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static final long minOf(long j4, int i4) {
        return Math.min(j4, i4);
    }

    public static final int reverseBytes(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final long reverseBytes(long j4) {
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public static final short reverseBytes(short s3) {
        int i4 = s3 & 65535;
        return (short) (((i4 & 255) << 8) | ((65280 & i4) >>> 8));
    }

    public static final int shl(byte b4, int i4) {
        return b4 << i4;
    }

    public static final int shr(byte b4, int i4) {
        return b4 >> i4;
    }

    @NotNull
    public static final String toHexString(byte b4) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b4 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b4 & C1892bw.f8538m]});
    }

    public static final long minOf(int i4, long j4) {
        return Math.min(i4, j4);
    }

    @NotNull
    public static final String toHexString(int i4) {
        if (i4 == 0) {
            return MessageService.MSG_DB_READY_REPORT;
        }
        int i5 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i4 >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i4 & 15]};
        while (i5 < 8 && cArr[i5] == '0') {
            i5++;
        }
        return new String(cArr, i5, 8 - i5);
    }

    @NotNull
    public static final String toHexString(long j4) {
        if (j4 == 0) {
            return MessageService.MSG_DB_READY_REPORT;
        }
        int i4 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j4 >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j4 & 15)]};
        while (i4 < 16 && cArr[i4] == '0') {
            i4++;
        }
        return new String(cArr, i4, 16 - i4);
    }
}

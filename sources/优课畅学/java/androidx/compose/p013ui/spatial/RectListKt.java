package androidx.compose.p013ui.spatial;

/* loaded from: classes2.dex */
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final long EverythingButLastChildOffset = -2301339409586323457L;
    public static final long EverythingButParentId = -4503599560261633L;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower26Bits = 67108863;
    public static final int Lower9Bits = 511;
    private static final long PackedIntsHighestBit = -9223372034707292160L;
    private static final long PackedIntsLowestBit = 4294967297L;
    public static final long TombStone = 2305843009213693951L;

    public static final int distanceScore(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i10 == 0) {
            return distanceScoreAlongAxis(i12, i18, i13, i11, i17, i15);
        }
        if (i10 == 1) {
            return distanceScoreAlongAxis(i16, i14, i13, i11, i17, i15);
        }
        if (i10 == 2) {
            return distanceScoreAlongAxis(i11, i17, i14, i12, i18, i16);
        }
        if (i10 != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i15, i13, i14, i12, i18, i16);
    }

    public static final int distanceScoreAlongAxis(int i10, int i11, int i12, int i13, int i14, int i15) {
        return ((i10 - i11) + 1) * ((((i12 - i13) + Math.max(i13, i15)) - Math.min(i12, i14)) + 1);
    }

    public static final long metaMarkUpdated(long j10) {
        return j10 | 2305843009213693952L;
    }

    public static final long metaUnMarkUpdated(long j10) {
        return j10 & (-2305843009213693953L);
    }

    public static final long metaWithLastChildOffset(long j10, int i10) {
        return (j10 & EverythingButLastChildOffset) | ((i10 & 511) << 52);
    }

    public static final long metaWithParentId(long j10, int i10) {
        return (j10 & EverythingButParentId) | ((i10 & Lower26Bits) << 26);
    }

    public static final long metaWithUpdated(long j10, boolean z10) {
        return (j10 & (-2305843009213693953L)) | ((z10 ? 1L : 0L) << 61);
    }

    public static final long packMeta(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12) {
        return ((z11 ? 1L : 0L) << 62) | ((z12 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 61) | ((i12 & 511) << 52) | ((i11 & Lower26Bits) << 26) | (i10 & Lower26Bits);
    }

    public static final long packXY(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final boolean rectIntersectsRect(long j10, long j11, long j12, long j13) {
        return ((((j13 - j10) - 4294967297L) | ((j11 - j12) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z10) {
        return z10 ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j10) {
        return ((int) (j10 >> 62)) & 1;
    }

    public static final int unpackMetaGesturable(long j10) {
        return ((int) (j10 >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j10) {
        return ((int) (j10 >> 52)) & 511;
    }

    public static final int unpackMetaParentId(long j10) {
        return ((int) (j10 >> 26)) & Lower26Bits;
    }

    public static final int unpackMetaUpdated(long j10) {
        return ((int) (j10 >> 61)) & 1;
    }

    public static final int unpackMetaValue(long j10) {
        return ((int) j10) & Lower26Bits;
    }

    public static final int unpackX(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int unpackY(long j10) {
        return (int) j10;
    }
}

package androidx.compose.p013ui.spatial;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0017\u001aP\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0000\u001a8\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0000\u001a\u0011\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0019\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0080\b\u001a9\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0080\b\u001a\u0019\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0080\b\u001a)\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000eH\u0080\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u00109\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010:\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010;\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010<\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010=\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010@\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0080\b\u001a\r\u0010A\u001a\u00020\u000e*\u00020+H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0004\n\u0002\u0010\u0007\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006B"}, m13558d2 = {"AxisEast", "", "AxisNorth", "AxisSouth", "AxisWest", "EverythingButLastChildOffset", "Lkotlin/ULong;", "J", "EverythingButParentId", "InitialSize", "LongsPerItem", "Lower26Bits", "Lower9Bits", "PackedIntsHighestBit", "", "PackedIntsLowestBit", "TombStone", "distanceScore", "axis", "queryL", "queryT", "queryR", "queryB", "l", "t", "r", "b", "distanceScoreAlongAxis", "distanceMin", "distanceMax", "queryCrossAxisMax", "queryCrossAxisMin", "crossAxisMax", "crossAxisMin", "metaMarkUpdated", "meta", "metaUnMarkUpdated", "metaWithLastChildOffset", "lastChildOffset", "metaWithParentId", "parentId", "metaWithUpdated", "updated", "", "packMeta", "itemId", "focusable", "gesturable", "packXY", "x", "y", "rectIntersectsRect", "srcLT", "srcRB", "destLT", "destRB", "unpackMetaFocusable", "unpackMetaGesturable", "unpackMetaLastChildOffset", "unpackMetaParentId", "unpackMetaUpdated", "unpackMetaValue", "unpackX", "xy", "unpackY", "toLong", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n870#1:969\n870#1:970\n870#1:971\n870#1:972\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n803#1:969\n804#1:970\n805#1:971\n821#1:972\n*E\n"})
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
        return j10 | LockFreeTaskQueueCore.CLOSED_MASK;
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

    public static final long metaWithUpdated(long j10, boolean z9) {
        return (j10 & (-2305843009213693953L)) | ((z9 ? 1L : 0L) << 61);
    }

    public static final long packMeta(int i10, int i11, int i12, boolean z9, boolean z10, boolean z11) {
        return ((z10 ? 1L : 0L) << 62) | ((z11 ? 1L : 0L) << 63) | ((z9 ? 1L : 0L) << 61) | ((i12 & 511) << 52) | ((i11 & Lower26Bits) << 26) | (i10 & Lower26Bits);
    }

    public static final long packXY(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final boolean rectIntersectsRect(long j10, long j11, long j12, long j13) {
        return ((((j13 - j10) - 4294967297L) | ((j11 - j12) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z9) {
        return z9 ? 1L : 0L;
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

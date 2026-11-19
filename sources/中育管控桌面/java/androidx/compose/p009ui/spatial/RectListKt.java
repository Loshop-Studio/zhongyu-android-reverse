package androidx.compose.p009ui.spatial;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m7879d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0017\u001aP\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0000\u001a8\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0000\u001a\u0011\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0019\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0080\b\u001a9\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0080\b\u001a\u0019\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0080\b\u001a)\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000eH\u0080\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u00109\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010:\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010;\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010<\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010=\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0080\b\u001a\u0011\u0010@\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0080\b\u001a\r\u0010A\u001a\u00020\u000e*\u00020+H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0004\n\u0002\u0010\u0007\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006B"}, m7880d2 = {"AxisEast", "", "AxisNorth", "AxisSouth", "AxisWest", "EverythingButLastChildOffset", "Lkotlin/ULong;", "J", "EverythingButParentId", "InitialSize", "LongsPerItem", "Lower26Bits", "Lower9Bits", "PackedIntsHighestBit", "", "PackedIntsLowestBit", "TombStone", "distanceScore", "axis", "queryL", "queryT", "queryR", "queryB", "l", "t", "r", "b", "distanceScoreAlongAxis", "distanceMin", "distanceMax", "queryCrossAxisMax", "queryCrossAxisMin", "crossAxisMax", "crossAxisMin", "metaMarkUpdated", "meta", "metaUnMarkUpdated", "metaWithLastChildOffset", "lastChildOffset", "metaWithParentId", "parentId", "metaWithUpdated", "updated", "", "packMeta", "itemId", "focusable", "gesturable", "packXY", "x", "y", "rectIntersectsRect", "srcLT", "srcRB", "destLT", "destRB", "unpackMetaFocusable", "unpackMetaGesturable", "unpackMetaLastChildOffset", "unpackMetaParentId", "unpackMetaUpdated", "unpackMetaValue", "unpackX", "xy", "unpackY", "toLong", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
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

    public static final int distanceScore(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i6 == 0) {
            return distanceScoreAlongAxis(i8, i14, i9, i7, i13, i11);
        }
        if (i6 == 1) {
            return distanceScoreAlongAxis(i12, i10, i9, i7, i13, i11);
        }
        if (i6 == 2) {
            return distanceScoreAlongAxis(i7, i13, i10, i8, i14, i12);
        }
        if (i6 != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i11, i9, i10, i8, i14, i12);
    }

    public static final int distanceScoreAlongAxis(int i6, int i7, int i8, int i9, int i10, int i11) {
        return ((i6 - i7) + 1) * ((((i8 - i9) + Math.max(i9, i11)) - Math.min(i8, i10)) + 1);
    }

    public static final long metaMarkUpdated(long j6) {
        return j6 | LockFreeTaskQueueCore.CLOSED_MASK;
    }

    public static final long metaUnMarkUpdated(long j6) {
        return j6 & (-2305843009213693953L);
    }

    public static final long metaWithLastChildOffset(long j6, int i6) {
        return (j6 & EverythingButLastChildOffset) | ((i6 & 511) << 52);
    }

    public static final long metaWithParentId(long j6, int i6) {
        return (j6 & EverythingButParentId) | ((i6 & Lower26Bits) << 26);
    }

    public static final long metaWithUpdated(long j6, boolean z6) {
        return (j6 & (-2305843009213693953L)) | ((z6 ? 1L : 0L) << 61);
    }

    public static final long packMeta(int i6, int i7, int i8, boolean z6, boolean z7, boolean z8) {
        return ((z7 ? 1L : 0L) << 62) | ((z8 ? 1L : 0L) << 63) | ((z6 ? 1L : 0L) << 61) | ((i8 & 511) << 52) | ((i7 & Lower26Bits) << 26) | (i6 & Lower26Bits);
    }

    public static final long packXY(int i6, int i7) {
        return (i7 & 4294967295L) | (i6 << 32);
    }

    public static final boolean rectIntersectsRect(long j6, long j7, long j8, long j9) {
        return ((((j9 - j6) - 4294967297L) | ((j7 - j8) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z6) {
        return z6 ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j6) {
        return ((int) (j6 >> 62)) & 1;
    }

    public static final int unpackMetaGesturable(long j6) {
        return ((int) (j6 >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j6) {
        return ((int) (j6 >> 52)) & 511;
    }

    public static final int unpackMetaParentId(long j6) {
        return ((int) (j6 >> 26)) & Lower26Bits;
    }

    public static final int unpackMetaUpdated(long j6) {
        return ((int) (j6 >> 61)) & 1;
    }

    public static final int unpackMetaValue(long j6) {
        return ((int) j6) & Lower26Bits;
    }

    public static final int unpackX(long j6) {
        return (int) (j6 >> 32);
    }

    public static final int unpackY(long j6) {
        return (int) j6;
    }
}

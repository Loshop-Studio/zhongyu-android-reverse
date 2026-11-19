package okio.internal;

import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2769l;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3475q;

/* loaded from: classes.dex */
public final class SegmentedByteStringKt {
    public static final int binarySearch(@NotNull int[] binarySearch, int i4, int i5, int i6) {
        C2769l.m9241e(binarySearch, "$this$binarySearch");
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int i9 = binarySearch[i8];
            if (i9 < i4) {
                i5 = i8 + 1;
            } else {
                if (i9 <= i4) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final boolean commonEquals(@NotNull SegmentedByteString commonEquals, @Nullable Object obj) {
        C2769l.m9241e(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.size() && commonEquals.rangeEquals(0, byteString, 0, commonEquals.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull SegmentedByteString commonGetSize) {
        C2769l.m9241e(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getDirectory$okio()[commonGetSize.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(@NotNull SegmentedByteString commonHashCode) {
        C2769l.m9241e(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = commonHashCode.getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i4 < length) {
            int i7 = commonHashCode.getDirectory$okio()[length + i4];
            int i8 = commonHashCode.getDirectory$okio()[i4];
            byte[] bArr = commonHashCode.getSegments$okio()[i4];
            int i9 = (i8 - i5) + i7;
            while (i7 < i9) {
                i6 = (i6 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i5 = i8;
        }
        commonHashCode.setHashCode$okio(i6);
        return i6;
    }

    public static final byte commonInternalGet(@NotNull SegmentedByteString commonInternalGet, int i4) {
        C2769l.m9241e(commonInternalGet, "$this$commonInternalGet");
        Util.checkOffsetAndCount(commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length - 1], i4, 1L);
        int iSegment = segment(commonInternalGet, i4);
        return commonInternalGet.getSegments$okio()[iSegment][(i4 - (iSegment == 0 ? 0 : commonInternalGet.getDirectory$okio()[iSegment - 1])) + commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i4, @NotNull ByteString other, int i5, int i6) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(other, "other");
        if (i4 < 0 || i4 > commonRangeEquals.size() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = segment(commonRangeEquals, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[iSegment - 1];
            int i9 = commonRangeEquals.getDirectory$okio()[iSegment] - i8;
            int i10 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!other.rangeEquals(i5, commonRangeEquals.getSegments$okio()[iSegment], i10 + (i4 - i8), iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull SegmentedByteString commonSubstring, int i4, int i5) {
        C2769l.m9241e(commonSubstring, "$this$commonSubstring");
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i4 + " < 0").toString());
        }
        if (!(i5 <= commonSubstring.size())) {
            throw new IllegalArgumentException(("endIndex=" + i5 + " > length(" + commonSubstring.size() + ')').toString());
        }
        int i6 = i5 - i4;
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i5 + " < beginIndex=" + i4).toString());
        }
        if (i4 == 0 && i5 == commonSubstring.size()) {
            return commonSubstring;
        }
        if (i4 == i5) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(commonSubstring, i4);
        int iSegment2 = segment(commonSubstring, i5 - 1);
        byte[][] bArr = (byte[][]) C2723g.m9086h(commonSubstring.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i7 = iSegment;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(commonSubstring.getDirectory$okio()[i7] - i4, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr.length] = commonSubstring.getDirectory$okio()[commonSubstring.getSegments$okio().length + i7];
                if (i7 == iSegment2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iSegment != 0 ? commonSubstring.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i4 - i10);
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull SegmentedByteString commonToByteArray) {
        C2769l.m9241e(commonToByteArray, "$this$commonToByteArray");
        byte[] bArr = new byte[commonToByteArray.size()];
        int length = commonToByteArray.getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = commonToByteArray.getDirectory$okio()[length + i4];
            int i8 = commonToByteArray.getDirectory$okio()[i4];
            int i9 = i8 - i5;
            C2723g.m9081c(commonToByteArray.getSegments$okio()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull SegmentedByteString commonWrite, @NotNull Buffer buffer, int i4, int i5) {
        C2769l.m9241e(commonWrite, "$this$commonWrite");
        C2769l.m9241e(buffer, "buffer");
        int i6 = i5 + i4;
        int iSegment = segment(commonWrite, i4);
        while (i4 < i6) {
            int i7 = iSegment == 0 ? 0 : commonWrite.getDirectory$okio()[iSegment - 1];
            int i8 = commonWrite.getDirectory$okio()[iSegment] - i7;
            int i9 = commonWrite.getDirectory$okio()[commonWrite.getSegments$okio().length + iSegment];
            int iMin = Math.min(i6, i8 + i7) - i4;
            int i10 = i9 + (i4 - i7);
            Segment segment = new Segment(commonWrite.getSegments$okio()[iSegment], i10, i10 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                C2769l.m9239c(segment2);
                Segment segment3 = segment2.prev;
                C2769l.m9239c(segment3);
                segment3.push(segment);
            }
            i4 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + commonWrite.size());
    }

    public static final void forEachSegment(@NotNull SegmentedByteString forEachSegment, @NotNull InterfaceC3475q<? super byte[], ? super Integer, ? super Integer, C2925r> action) {
        C2769l.m9241e(forEachSegment, "$this$forEachSegment");
        C2769l.m9241e(action, "action");
        int length = forEachSegment.getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = forEachSegment.getDirectory$okio()[length + i4];
            int i7 = forEachSegment.getDirectory$okio()[i4];
            action.mo9025c(forEachSegment.getSegments$okio()[i4], Integer.valueOf(i6), Integer.valueOf(i7 - i5));
            i4++;
            i5 = i7;
        }
    }

    public static final int segment(@NotNull SegmentedByteString segment, int i4) {
        C2769l.m9241e(segment, "$this$segment");
        int iBinarySearch = binarySearch(segment.getDirectory$okio(), i4 + 1, 0, segment.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i4, int i5, InterfaceC3475q<? super byte[], ? super Integer, ? super Integer, C2925r> interfaceC3475q) {
        int iSegment = segment(segmentedByteString, i4);
        while (i4 < i5) {
            int i6 = iSegment == 0 ? 0 : segmentedByteString.getDirectory$okio()[iSegment - 1];
            int i7 = segmentedByteString.getDirectory$okio()[iSegment] - i6;
            int i8 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i4;
            interfaceC3475q.mo9025c(segmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i8 + (i4 - i6)), Integer.valueOf(iMin));
            i4 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i4, @NotNull byte[] other, int i5, int i6) {
        C2769l.m9241e(commonRangeEquals, "$this$commonRangeEquals");
        C2769l.m9241e(other, "other");
        if (i4 < 0 || i4 > commonRangeEquals.size() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = segment(commonRangeEquals, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[iSegment - 1];
            int i9 = commonRangeEquals.getDirectory$okio()[iSegment] - i8;
            int i10 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!Util.arrayRangeEquals(commonRangeEquals.getSegments$okio()[iSegment], i10 + (i4 - i8), other, i5, iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }
}

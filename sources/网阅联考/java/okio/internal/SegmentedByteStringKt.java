package okio.internal;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0080\b\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0012*\u00020\bH\u0080\b\u001a%\u0010\u001a\u001a\u00020\u001b*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a]\u0010\u001e\u001a\u00020\u001b*\u00020\b2K\u0010\u001f\u001aG\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u001b0 H\u0080\bø\u0001\u0000\u001aj\u0010\u001e\u001a\u00020\u001b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012K\u0010\u001f\u001aG\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u001b0 H\u0082\b\u001a\u0014\u0010$\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, m5175d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonEquals", "", "Lokio/SegmentedByteString;", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "offset", "", "otherOffset", "byteCount", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", "segment", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SegmentedByteStringKt {
    public static final int binarySearch(int[] binarySearch, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
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

    public static final boolean commonEquals(SegmentedByteString commonEquals, Object obj) {
        Intrinsics.checkNotNullParameter(commonEquals, "$this$commonEquals");
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

    public static final int commonGetSize(SegmentedByteString commonGetSize) {
        Intrinsics.checkNotNullParameter(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getDirectory()[commonGetSize.getSegments().length - 1];
    }

    public static final int commonHashCode(SegmentedByteString commonHashCode) {
        Intrinsics.checkNotNullParameter(commonHashCode, "$this$commonHashCode");
        int hashCode = commonHashCode.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = commonHashCode.getSegments().length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int i7 = commonHashCode.getDirectory()[length + i4];
            int i8 = commonHashCode.getDirectory()[i4];
            byte[] bArr = commonHashCode.getSegments()[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        commonHashCode.setHashCode$okio(i5);
        return i5;
    }

    public static final byte commonInternalGet(SegmentedByteString commonInternalGet, int i4) {
        Intrinsics.checkNotNullParameter(commonInternalGet, "$this$commonInternalGet");
        Util.checkOffsetAndCount(commonInternalGet.getDirectory()[commonInternalGet.getSegments().length - 1], i4, 1L);
        int iSegment = segment(commonInternalGet, i4);
        return commonInternalGet.getSegments()[iSegment][(i4 - (iSegment == 0 ? 0 : commonInternalGet.getDirectory()[iSegment - 1])) + commonInternalGet.getDirectory()[commonInternalGet.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(SegmentedByteString commonRangeEquals, int i4, ByteString other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i4 < 0 || i4 > commonRangeEquals.size() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = segment(commonRangeEquals, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory()[iSegment - 1];
            int i9 = commonRangeEquals.getDirectory()[iSegment] - i8;
            int i10 = commonRangeEquals.getDirectory()[commonRangeEquals.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!other.rangeEquals(i5, commonRangeEquals.getSegments()[iSegment], i10 + (i4 - i8), iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(SegmentedByteString commonSubstring, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonSubstring, "$this$commonSubstring");
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
        byte[][] bArr = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(commonSubstring.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i7 = 0;
            int i8 = iSegment;
            while (true) {
                iArr[i7] = Math.min(commonSubstring.getDirectory()[i8] - i4, i6);
                int i9 = i7 + 1;
                iArr[i7 + bArr.length] = commonSubstring.getDirectory()[commonSubstring.getSegments().length + i8];
                if (i8 == iSegment2) {
                    break;
                }
                i8++;
                i7 = i9;
            }
        }
        int i10 = iSegment != 0 ? commonSubstring.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i4 - i10);
        return new SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(SegmentedByteString commonToByteArray) {
        Intrinsics.checkNotNullParameter(commonToByteArray, "$this$commonToByteArray");
        byte[] bArr = new byte[commonToByteArray.size()];
        int length = commonToByteArray.getSegments().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = commonToByteArray.getDirectory()[length + i4];
            int i8 = commonToByteArray.getDirectory()[i4];
            int i9 = i8 - i5;
            ArraysKt___ArraysJvmKt.copyInto(commonToByteArray.getSegments()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    public static final void commonWrite(SegmentedByteString commonWrite, Buffer buffer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(commonWrite, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i6 = i5 + i4;
        int iSegment = segment(commonWrite, i4);
        while (i4 < i6) {
            int i7 = iSegment == 0 ? 0 : commonWrite.getDirectory()[iSegment - 1];
            int i8 = commonWrite.getDirectory()[iSegment] - i7;
            int i9 = commonWrite.getDirectory()[commonWrite.getSegments().length + iSegment];
            int iMin = Math.min(i6, i8 + i7) - i4;
            int i10 = i9 + (i4 - i7);
            Segment segment = new Segment(commonWrite.getSegments()[iSegment], i10, i10 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i4 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + commonWrite.size());
    }

    public static final void forEachSegment(SegmentedByteString forEachSegment, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachSegment, "$this$forEachSegment");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = forEachSegment.getSegments().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = forEachSegment.getDirectory()[length + i4];
            int i7 = forEachSegment.getDirectory()[i4];
            action.invoke(forEachSegment.getSegments()[i4], Integer.valueOf(i6), Integer.valueOf(i7 - i5));
            i4++;
            i5 = i7;
        }
    }

    public static final int segment(SegmentedByteString segment, int i4) {
        Intrinsics.checkNotNullParameter(segment, "$this$segment");
        int iBinarySearch = binarySearch(segment.getDirectory(), i4 + 1, 0, segment.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i4, int i5, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(segmentedByteString, i4);
        while (i4 < i5) {
            int i6 = iSegment == 0 ? 0 : segmentedByteString.getDirectory()[iSegment - 1];
            int i7 = segmentedByteString.getDirectory()[iSegment] - i6;
            int i8 = segmentedByteString.getDirectory()[segmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i5, i7 + i6) - i4;
            function3.invoke(segmentedByteString.getSegments()[iSegment], Integer.valueOf(i8 + (i4 - i6)), Integer.valueOf(iMin));
            i4 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(SegmentedByteString commonRangeEquals, int i4, byte[] other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(commonRangeEquals, "$this$commonRangeEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i4 < 0 || i4 > commonRangeEquals.size() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = segment(commonRangeEquals, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : commonRangeEquals.getDirectory()[iSegment - 1];
            int i9 = commonRangeEquals.getDirectory()[iSegment] - i8;
            int i10 = commonRangeEquals.getDirectory()[commonRangeEquals.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!Util.arrayRangeEquals(commonRangeEquals.getSegments()[iSegment], i10 + (i4 - i8), other, i5, iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }
}

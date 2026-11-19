package okio.internal;

import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.ByteString;
import okio.C12161SegmentedByteString;
import okio.Segment;
import p181hd.InterfaceC9545q;
import p325rc.AbstractC10964p;

/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes6.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(C12161SegmentedByteString c12161SegmentedByteString, int i10, byte[] target, int i11, int i12) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        AbstractC9979u.m20294g(target, "target");
        long j10 = i12;
        okio.SegmentedByteString.checkOffsetAndCount(c12161SegmentedByteString.size(), i10, j10);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c12161SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c12161SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            AbstractC10964p.m24017j(c12161SegmentedByteString.getSegments$okio()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C12161SegmentedByteString c12161SegmentedByteString, Object obj) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        if (obj == c12161SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c12161SegmentedByteString.size() && c12161SegmentedByteString.rangeEquals(0, byteString, 0, c12161SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C12161SegmentedByteString c12161SegmentedByteString) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        return c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C12161SegmentedByteString c12161SegmentedByteString) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        int hashCode$okio = c12161SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c12161SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c12161SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c12161SegmentedByteString.getDirectory$okio()[i10];
            byte[] bArr = c12161SegmentedByteString.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c12161SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C12161SegmentedByteString c12161SegmentedByteString, int i10) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(c12161SegmentedByteString, i10);
        return c12161SegmentedByteString.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C12161SegmentedByteString c12161SegmentedByteString, int i10, ByteString other, int i11, int i12) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        AbstractC9979u.m20294g(other, "other");
        if (i10 < 0 || i10 > c12161SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c12161SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c12161SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c12161SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C12161SegmentedByteString c12161SegmentedByteString, int i10, int i11) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c12161SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c12161SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c12161SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c12161SegmentedByteString.size()) {
            return c12161SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c12161SegmentedByteString, i10);
        int iSegment2 = segment(c12161SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) AbstractC10964p.m24032y(c12161SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c12161SegmentedByteString.getDirectory$okio()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c12161SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C12161SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C12161SegmentedByteString c12161SegmentedByteString) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        byte[] bArr = new byte[c12161SegmentedByteString.size()];
        int length = c12161SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c12161SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c12161SegmentedByteString.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            AbstractC10964p.m24017j(c12161SegmentedByteString.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C12161SegmentedByteString c12161SegmentedByteString, Buffer buffer, int i10, int i11) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        AbstractC9979u.m20294g(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c12161SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c12161SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c12161SegmentedByteString.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                AbstractC9979u.m20291d(segment2);
                Segment segment3 = segment2.prev;
                AbstractC9979u.m20291d(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    public static final void forEachSegment(C12161SegmentedByteString c12161SegmentedByteString, InterfaceC9545q action) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        AbstractC9979u.m20294g(action, "action");
        int length = c12161SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c12161SegmentedByteString.getDirectory$okio()[length + i10];
            int i13 = c12161SegmentedByteString.getDirectory$okio()[i10];
            action.invoke(c12161SegmentedByteString.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(C12161SegmentedByteString c12161SegmentedByteString, int i10) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c12161SegmentedByteString.getDirectory$okio(), i10 + 1, 0, c12161SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C12161SegmentedByteString c12161SegmentedByteString, int i10, int i11, InterfaceC9545q interfaceC9545q) {
        int iSegment = segment(c12161SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c12161SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            interfaceC9545q.invoke(c12161SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C12161SegmentedByteString c12161SegmentedByteString, int i10, byte[] other, int i11, int i12) {
        AbstractC9979u.m20294g(c12161SegmentedByteString, "<this>");
        AbstractC9979u.m20294g(other, "other");
        if (i10 < 0 || i10 > c12161SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c12161SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c12161SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c12161SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c12161SegmentedByteString.getDirectory$okio()[c12161SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.SegmentedByteString.arrayRangeEquals(c12161SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}

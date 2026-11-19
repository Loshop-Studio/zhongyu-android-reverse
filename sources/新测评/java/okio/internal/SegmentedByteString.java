package okio.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C10167SegmentedByteString;
import okio.Segment;

@Metadata(m13557d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a]\u0010\t\u001a\u00020\n*\u00020\u00072K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0080\bø\u0001\u0000\u001aj\u0010\t\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0082\b\u001a\u001d\u0010\u0015\u001a\u00020\u0016*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\r*\u00020\u0007H\u0080\b\u001a%\u0010\u001b\u001a\u00020\n*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\"\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010%\u001a\u00020\u001f*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010&H\u0080\b\u001a\r\u0010'\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m13558d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "segment", "Lokio/SegmentedByteString;", "pos", "forEachSegment", "", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "beginIndex", "endIndex", "commonSubstring", "Lokio/ByteString;", "commonInternalGet", "", "commonGetSize", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "commonRangeEquals", "", "other", "otherOffset", "commonCopyInto", TypedValues.AttributesType.S_TARGET, "targetOffset", "commonEquals", "", "commonHashCode", "okio"}, m13559k = 2, m13560mv = {2, 1, 0}, m13562xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes5.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
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

    public static final void commonCopyInto(C10167SegmentedByteString c10167SegmentedByteString, int i10, byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = i12;
        okio.SegmentedByteString.checkOffsetAndCount(c10167SegmentedByteString.size(), i10, j10);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c10167SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c10167SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            ArraysKt.copyInto(c10167SegmentedByteString.getSegments()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C10167SegmentedByteString c10167SegmentedByteString, Object obj) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        if (obj == c10167SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c10167SegmentedByteString.size() && c10167SegmentedByteString.rangeEquals(0, byteString, 0, c10167SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C10167SegmentedByteString c10167SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        return c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(C10167SegmentedByteString c10167SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        int hashCode = c10167SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c10167SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c10167SegmentedByteString.getDirectory()[length + i10];
            int i14 = c10167SegmentedByteString.getDirectory()[i10];
            byte[] bArr = c10167SegmentedByteString.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c10167SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C10167SegmentedByteString c10167SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length - 1], i10, 1L);
        int iSegment = segment(c10167SegmentedByteString, i10);
        return c10167SegmentedByteString.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1])) + c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C10167SegmentedByteString c10167SegmentedByteString, int i10, ByteString other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c10167SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c10167SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c10167SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c10167SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C10167SegmentedByteString c10167SegmentedByteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c10167SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c10167SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c10167SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c10167SegmentedByteString.size()) {
            return c10167SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c10167SegmentedByteString, i10);
        int iSegment2 = segment(c10167SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c10167SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c10167SegmentedByteString.getDirectory()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c10167SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C10167SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C10167SegmentedByteString c10167SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        byte[] bArr = new byte[c10167SegmentedByteString.size()];
        int length = c10167SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c10167SegmentedByteString.getDirectory()[length + i10];
            int i14 = c10167SegmentedByteString.getDirectory()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(c10167SegmentedByteString.getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C10167SegmentedByteString c10167SegmentedByteString, Buffer buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c10167SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c10167SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c10167SegmentedByteString.getSegments()[iSegment], i16, i16 + iMin, true, false);
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
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    public static final void forEachSegment(C10167SegmentedByteString c10167SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c10167SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c10167SegmentedByteString.getDirectory()[length + i10];
            int i13 = c10167SegmentedByteString.getDirectory()[i10];
            action.invoke(c10167SegmentedByteString.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(C10167SegmentedByteString c10167SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c10167SegmentedByteString.getDirectory(), i10 + 1, 0, c10167SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C10167SegmentedByteString c10167SegmentedByteString, int i10, int i11, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c10167SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c10167SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            function3.invoke(c10167SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C10167SegmentedByteString c10167SegmentedByteString, int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c10167SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c10167SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c10167SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c10167SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c10167SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c10167SegmentedByteString.getDirectory()[c10167SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.SegmentedByteString.arrayRangeEquals(c10167SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}

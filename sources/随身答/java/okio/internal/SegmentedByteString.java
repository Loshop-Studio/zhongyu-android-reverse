package okio.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C10096SegmentedByteString;
import okio.Segment;

@Metadata(m13412d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a]\u0010\t\u001a\u00020\n*\u00020\u00072K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0080\bø\u0001\u0000\u001aj\u0010\t\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0082\b\u001a\u001d\u0010\u0015\u001a\u00020\u0016*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\r*\u00020\u0007H\u0080\b\u001a%\u0010\u001b\u001a\u00020\n*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\"\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010%\u001a\u00020\u001f*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010&H\u0080\b\u001a\r\u0010'\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m13413d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "segment", "Lokio/SegmentedByteString;", "pos", "forEachSegment", "", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "beginIndex", "endIndex", "commonSubstring", "Lokio/ByteString;", "commonInternalGet", "", "commonGetSize", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "commonRangeEquals", "", "other", "otherOffset", "commonCopyInto", TypedValues.AttributesType.S_TARGET, "targetOffset", "commonEquals", "", "commonHashCode", "okio"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes5.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i9) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i9) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final void commonCopyInto(C10096SegmentedByteString c10096SegmentedByteString, int i9, byte[] target, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j9 = i11;
        okio.SegmentedByteString.checkOffsetAndCount(c10096SegmentedByteString.size(), i9, j9);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i10, j9);
        int i12 = i11 + i9;
        int iSegment = segment(c10096SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c10096SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            int i16 = i15 + (i9 - i13);
            ArraysKt.copyInto(c10096SegmentedByteString.getSegments()[iSegment], target, i10, i16, i16 + iMin);
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C10096SegmentedByteString c10096SegmentedByteString, Object obj) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        if (obj == c10096SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c10096SegmentedByteString.size() && c10096SegmentedByteString.rangeEquals(0, byteString, 0, c10096SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C10096SegmentedByteString c10096SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        return c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(C10096SegmentedByteString c10096SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        int hashCode = c10096SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c10096SegmentedByteString.getSegments().length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int i12 = c10096SegmentedByteString.getDirectory()[length + i9];
            int i13 = c10096SegmentedByteString.getDirectory()[i9];
            byte[] bArr = c10096SegmentedByteString.getSegments()[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        c10096SegmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    public static final byte commonInternalGet(C10096SegmentedByteString c10096SegmentedByteString, int i9) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length - 1], i9, 1L);
        int iSegment = segment(c10096SegmentedByteString, i9);
        return c10096SegmentedByteString.getSegments()[iSegment][(i9 - (iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1])) + c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C10096SegmentedByteString c10096SegmentedByteString, int i9, ByteString other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i9 < 0 || i9 > c10096SegmentedByteString.size() - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(c10096SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c10096SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!other.rangeEquals(i10, c10096SegmentedByteString.getSegments()[iSegment], i15 + (i9 - i13), iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C10096SegmentedByteString c10096SegmentedByteString, int i9, int i10) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c10096SegmentedByteString, i10);
        if (i9 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i9 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c10096SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c10096SegmentedByteString.size() + ')').toString());
        }
        int i11 = iResolveDefaultParameter - i9;
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i9).toString());
        }
        if (i9 == 0 && iResolveDefaultParameter == c10096SegmentedByteString.size()) {
            return c10096SegmentedByteString;
        }
        if (i9 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c10096SegmentedByteString, i9);
        int iSegment2 = segment(c10096SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c10096SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(c10096SegmentedByteString.getDirectory()[i12] - i9, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? c10096SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i9 - i15);
        return new C10096SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C10096SegmentedByteString c10096SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        byte[] bArr = new byte[c10096SegmentedByteString.size()];
        int length = c10096SegmentedByteString.getSegments().length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int i12 = c10096SegmentedByteString.getDirectory()[length + i9];
            int i13 = c10096SegmentedByteString.getDirectory()[i9];
            int i14 = i13 - i10;
            ArraysKt.copyInto(c10096SegmentedByteString.getSegments()[i9], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    public static final void commonWrite(C10096SegmentedByteString c10096SegmentedByteString, Buffer buffer, int i9, int i10) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i11 = i9 + i10;
        int iSegment = segment(c10096SegmentedByteString, i9);
        while (i9 < i11) {
            int i12 = iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c10096SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i9;
            int i15 = i14 + (i9 - i12);
            Segment segment = new Segment(c10096SegmentedByteString.getSegments()[iSegment], i15, i15 + iMin, true, false);
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
            i9 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i10);
    }

    public static final void forEachSegment(C10096SegmentedByteString c10096SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c10096SegmentedByteString.getSegments().length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = c10096SegmentedByteString.getDirectory()[length + i9];
            int i12 = c10096SegmentedByteString.getDirectory()[i9];
            action.invoke(c10096SegmentedByteString.getSegments()[i9], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i9++;
            i10 = i12;
        }
    }

    public static final int segment(C10096SegmentedByteString c10096SegmentedByteString, int i9) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c10096SegmentedByteString.getDirectory(), i9 + 1, 0, c10096SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C10096SegmentedByteString c10096SegmentedByteString, int i9, int i10, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c10096SegmentedByteString, i9);
        while (i9 < i10) {
            int i11 = iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1];
            int i12 = c10096SegmentedByteString.getDirectory()[iSegment] - i11;
            int i13 = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i9;
            function3.invoke(c10096SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i13 + (i9 - i11)), Integer.valueOf(iMin));
            i9 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C10096SegmentedByteString c10096SegmentedByteString, int i9, byte[] other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c10096SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i9 < 0 || i9 > c10096SegmentedByteString.size() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i9;
        int iSegment = segment(c10096SegmentedByteString, i9);
        while (i9 < i12) {
            int i13 = iSegment == 0 ? 0 : c10096SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c10096SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c10096SegmentedByteString.getDirectory()[c10096SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i9;
            if (!okio.SegmentedByteString.arrayRangeEquals(c10096SegmentedByteString.getSegments()[iSegment], i15 + (i9 - i13), other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i9 += iMin;
            iSegment++;
        }
        return true;
    }
}

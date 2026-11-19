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
import okio.C8049SegmentedByteString;
import okio.Segment;

@Metadata(m7879d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a]\u0010\t\u001a\u00020\n*\u00020\u00072K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0080\bø\u0001\u0000\u001aj\u0010\t\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\fH\u0082\b\u001a\u001d\u0010\u0015\u001a\u00020\u0016*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\r*\u00020\u0007H\u0080\b\u001a%\u0010\u001b\u001a\u00020\n*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u001e\u001a\u00020\u001f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a-\u0010\"\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010%\u001a\u00020\u001f*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010&H\u0080\b\u001a\r\u0010'\u001a\u00020\u0001*\u00020\u0007H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m7880d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "segment", "Lokio/SegmentedByteString;", "pos", "forEachSegment", "", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "beginIndex", "endIndex", "commonSubstring", "Lokio/ByteString;", "commonInternalGet", "", "commonGetSize", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "commonRangeEquals", "", "other", "otherOffset", "commonCopyInto", TypedValues.AttributesType.S_TARGET, "targetOffset", "commonEquals", "", "commonHashCode", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i6) {
                i7 = i10 + 1;
            } else {
                if (i11 <= i6) {
                    return i10;
                }
                i9 = i10 - 1;
            }
        }
        return (-i7) - 1;
    }

    public static final void commonCopyInto(C8049SegmentedByteString c8049SegmentedByteString, int i6, byte[] target, int i7, int i8) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j6 = i8;
        okio.SegmentedByteString.checkOffsetAndCount(c8049SegmentedByteString.size(), i6, j6);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i7, j6);
        int i9 = i8 + i6;
        int iSegment = segment(c8049SegmentedByteString, i6);
        while (i6 < i9) {
            int i10 = iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1];
            int i11 = c8049SegmentedByteString.getDirectory()[iSegment] - i10;
            int i12 = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i9, i11 + i10) - i6;
            int i13 = i12 + (i6 - i10);
            ArraysKt.copyInto(c8049SegmentedByteString.getSegments()[iSegment], target, i7, i13, i13 + iMin);
            i7 += iMin;
            i6 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C8049SegmentedByteString c8049SegmentedByteString, Object obj) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        if (obj == c8049SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c8049SegmentedByteString.size() && c8049SegmentedByteString.rangeEquals(0, byteString, 0, c8049SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C8049SegmentedByteString c8049SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        return c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(C8049SegmentedByteString c8049SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        int hashCode = c8049SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c8049SegmentedByteString.getSegments().length;
        int i6 = 0;
        int i7 = 1;
        int i8 = 0;
        while (i6 < length) {
            int i9 = c8049SegmentedByteString.getDirectory()[length + i6];
            int i10 = c8049SegmentedByteString.getDirectory()[i6];
            byte[] bArr = c8049SegmentedByteString.getSegments()[i6];
            int i11 = (i10 - i8) + i9;
            while (i9 < i11) {
                i7 = (i7 * 31) + bArr[i9];
                i9++;
            }
            i6++;
            i8 = i10;
        }
        c8049SegmentedByteString.setHashCode$okio(i7);
        return i7;
    }

    public static final byte commonInternalGet(C8049SegmentedByteString c8049SegmentedByteString, int i6) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length - 1], i6, 1L);
        int iSegment = segment(c8049SegmentedByteString, i6);
        return c8049SegmentedByteString.getSegments()[iSegment][(i6 - (iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1])) + c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C8049SegmentedByteString c8049SegmentedByteString, int i6, ByteString other, int i7, int i8) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i6 < 0 || i6 > c8049SegmentedByteString.size() - i8) {
            return false;
        }
        int i9 = i8 + i6;
        int iSegment = segment(c8049SegmentedByteString, i6);
        while (i6 < i9) {
            int i10 = iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1];
            int i11 = c8049SegmentedByteString.getDirectory()[iSegment] - i10;
            int i12 = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i9, i11 + i10) - i6;
            if (!other.rangeEquals(i7, c8049SegmentedByteString.getSegments()[iSegment], i12 + (i6 - i10), iMin)) {
                return false;
            }
            i7 += iMin;
            i6 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C8049SegmentedByteString c8049SegmentedByteString, int i6, int i7) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c8049SegmentedByteString, i7);
        if (i6 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i6 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c8049SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c8049SegmentedByteString.size() + ')').toString());
        }
        int i8 = iResolveDefaultParameter - i6;
        if (i8 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i6).toString());
        }
        if (i6 == 0 && iResolveDefaultParameter == c8049SegmentedByteString.size()) {
            return c8049SegmentedByteString;
        }
        if (i6 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c8049SegmentedByteString, i6);
        int iSegment2 = segment(c8049SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c8049SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i9 = iSegment;
            int i10 = 0;
            while (true) {
                iArr[i10] = Math.min(c8049SegmentedByteString.getDirectory()[i9] - i6, i8);
                int i11 = i10 + 1;
                iArr[i10 + bArr.length] = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + i9];
                if (i9 == iSegment2) {
                    break;
                }
                i9++;
                i10 = i11;
            }
        }
        int i12 = iSegment != 0 ? c8049SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i6 - i12);
        return new C8049SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C8049SegmentedByteString c8049SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        byte[] bArr = new byte[c8049SegmentedByteString.size()];
        int length = c8049SegmentedByteString.getSegments().length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int i9 = c8049SegmentedByteString.getDirectory()[length + i6];
            int i10 = c8049SegmentedByteString.getDirectory()[i6];
            int i11 = i10 - i7;
            ArraysKt.copyInto(c8049SegmentedByteString.getSegments()[i6], bArr, i8, i9, i9 + i11);
            i8 += i11;
            i6++;
            i7 = i10;
        }
        return bArr;
    }

    public static final void commonWrite(C8049SegmentedByteString c8049SegmentedByteString, Buffer buffer, int i6, int i7) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i8 = i6 + i7;
        int iSegment = segment(c8049SegmentedByteString, i6);
        while (i6 < i8) {
            int i9 = iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1];
            int i10 = c8049SegmentedByteString.getDirectory()[iSegment] - i9;
            int i11 = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i8, i10 + i9) - i6;
            int i12 = i11 + (i6 - i9);
            Segment segment = new Segment(c8049SegmentedByteString.getSegments()[iSegment], i12, i12 + iMin, true, false);
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
            i6 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i7);
    }

    public static final void forEachSegment(C8049SegmentedByteString c8049SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c8049SegmentedByteString.getSegments().length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = c8049SegmentedByteString.getDirectory()[length + i6];
            int i9 = c8049SegmentedByteString.getDirectory()[i6];
            action.invoke(c8049SegmentedByteString.getSegments()[i6], Integer.valueOf(i8), Integer.valueOf(i9 - i7));
            i6++;
            i7 = i9;
        }
    }

    public static final int segment(C8049SegmentedByteString c8049SegmentedByteString, int i6) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c8049SegmentedByteString.getDirectory(), i6 + 1, 0, c8049SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C8049SegmentedByteString c8049SegmentedByteString, int i6, int i7, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c8049SegmentedByteString, i6);
        while (i6 < i7) {
            int i8 = iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1];
            int i9 = c8049SegmentedByteString.getDirectory()[iSegment] - i8;
            int i10 = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i6;
            function3.invoke(c8049SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i10 + (i6 - i8)), Integer.valueOf(iMin));
            i6 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C8049SegmentedByteString c8049SegmentedByteString, int i6, byte[] other, int i7, int i8) {
        Intrinsics.checkNotNullParameter(c8049SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i6 < 0 || i6 > c8049SegmentedByteString.size() - i8 || i7 < 0 || i7 > other.length - i8) {
            return false;
        }
        int i9 = i8 + i6;
        int iSegment = segment(c8049SegmentedByteString, i6);
        while (i6 < i9) {
            int i10 = iSegment == 0 ? 0 : c8049SegmentedByteString.getDirectory()[iSegment - 1];
            int i11 = c8049SegmentedByteString.getDirectory()[iSegment] - i10;
            int i12 = c8049SegmentedByteString.getDirectory()[c8049SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i9, i11 + i10) - i6;
            if (!okio.SegmentedByteString.arrayRangeEquals(c8049SegmentedByteString.getSegments()[iSegment], i12 + (i6 - i10), other, i7, iMin)) {
                return false;
            }
            i7 += iMin;
            i6 += iMin;
            iSegment++;
        }
        return true;
    }
}

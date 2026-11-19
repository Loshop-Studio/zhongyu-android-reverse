package okio.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C6897SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001ad\u0010\u0014\u001a\u00020\u0012*\u00020\u00072K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0014\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0018\u001a$\u0010\u001a\u001a\u00020\u0019*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u001c*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b!\u0010\"\u001a,\u0010%\u001a\u00020\u0012*\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b%\u0010&\u001a4\u0010*\u001a\u00020)*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b*\u0010+\u001a4\u0010*\u001a\u00020)*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b*\u0010,\u001a4\u0010/\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u001e\u00102\u001a\u00020)*\u00020\u00072\b\u0010'\u001a\u0004\u0018\u000101H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b4\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, m5110d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lokio/SegmentedByteString;", "pos", "segment", "(Lokio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "Ld6/s;", "action", "forEachSegment", "(Lokio/SegmentedByteString;Lr6/f;)V", "beginIndex", "endIndex", "(Lokio/SegmentedByteString;IILr6/f;)V", "Lokio/ByteString;", "commonSubstring", "(Lokio/SegmentedByteString;II)Lokio/ByteString;", "", "commonInternalGet", "(Lokio/SegmentedByteString;I)B", "commonGetSize", "(Lokio/SegmentedByteString;)I", "commonToByteArray", "(Lokio/SegmentedByteString;)[B", "Lokio/Buffer;", "buffer", "commonWrite", "(Lokio/SegmentedByteString;Lokio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lokio/SegmentedByteString;ILokio/ByteString;II)Z", "(Lokio/SegmentedByteString;I[BII)Z", TypedValues.AttributesType.S_TARGET, "targetOffset", "commonCopyInto", "(Lokio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lokio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i, int i8, int i9) {
        AbstractC5830k.m5330g(iArr, "<this>");
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i) {
                i8 = i11 + 1;
            } else {
                if (i12 <= i) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return (-i8) - 1;
    }

    public static final void commonCopyInto(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i, @NotNull byte[] target, int i8, int i9) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        AbstractC5830k.m5330g(target, "target");
        long j7 = i9;
        okio.SegmentedByteString.checkOffsetAndCount(c6897SegmentedByteString.size(), i, j7);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i8, j7);
        int i10 = i9 + i;
        int iSegment = segment(c6897SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1];
            int i12 = c6897SegmentedByteString.getDirectory()[iSegment] - i11;
            int i13 = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            int i14 = (i - i11) + i13;
            AbstractC5802q.m5213z(c6897SegmentedByteString.getSegments()[iSegment], i8, target, i14, i14 + iMin);
            i8 += iMin;
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C6897SegmentedByteString c6897SegmentedByteString, @Nullable Object obj) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        if (obj == c6897SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c6897SegmentedByteString.size() && c6897SegmentedByteString.rangeEquals(0, byteString, 0, c6897SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C6897SegmentedByteString c6897SegmentedByteString) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        return c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C6897SegmentedByteString c6897SegmentedByteString) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        int hashCode = c6897SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c6897SegmentedByteString.getSegments().length;
        int i = 0;
        int i8 = 1;
        int i9 = 0;
        while (i < length) {
            int i10 = c6897SegmentedByteString.getDirectory()[length + i];
            int i11 = c6897SegmentedByteString.getDirectory()[i];
            byte[] bArr = c6897SegmentedByteString.getSegments()[i];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i++;
            i9 = i11;
        }
        c6897SegmentedByteString.setHashCode$okio(i8);
        return i8;
    }

    public static final byte commonInternalGet(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length - 1], i, 1L);
        int iSegment = segment(c6897SegmentedByteString, i);
        return c6897SegmentedByteString.getSegments()[iSegment][(i - (iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1])) + c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i, @NotNull ByteString other, int i8, int i9) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        if (i < 0 || i > c6897SegmentedByteString.size() - i9) {
            return false;
        }
        int i10 = i9 + i;
        int iSegment = segment(c6897SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1];
            int i12 = c6897SegmentedByteString.getDirectory()[iSegment] - i11;
            int i13 = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!other.rangeEquals(i8, c6897SegmentedByteString.getSegments()[iSegment], (i - i11) + i13, iMin)) {
                return false;
            }
            i8 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i, int i8) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c6897SegmentedByteString, i8);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c6897SegmentedByteString.size()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(iResolveDefaultParameter, "endIndex=", " > length(");
            sbM94s.append(c6897SegmentedByteString.size());
            sbM94s.append(')');
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        int i9 = iResolveDefaultParameter - i;
        if (i9 < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(iResolveDefaultParameter, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && iResolveDefaultParameter == c6897SegmentedByteString.size()) {
            return c6897SegmentedByteString;
        }
        if (i == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c6897SegmentedByteString, i);
        int iSegment2 = segment(c6897SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) AbstractC5802q.m5184K(iSegment, iSegment2 + 1, c6897SegmentedByteString.getSegments());
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i10 = iSegment;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(c6897SegmentedByteString.getDirectory()[i10] - i, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr.length] = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + i10];
                if (i10 == iSegment2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iSegment != 0 ? c6897SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i - i13) + iArr[length];
        return new C6897SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C6897SegmentedByteString c6897SegmentedByteString) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        byte[] bArr = new byte[c6897SegmentedByteString.size()];
        int length = c6897SegmentedByteString.getSegments().length;
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i < length) {
            int i10 = c6897SegmentedByteString.getDirectory()[length + i];
            int i11 = c6897SegmentedByteString.getDirectory()[i];
            int i12 = i11 - i8;
            AbstractC5802q.m5213z(c6897SegmentedByteString.getSegments()[i], i9, bArr, i10, i10 + i12);
            i9 += i12;
            i++;
            i8 = i11;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C6897SegmentedByteString c6897SegmentedByteString, @NotNull Buffer buffer, int i, int i8) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        AbstractC5830k.m5330g(buffer, "buffer");
        int i9 = i + i8;
        int iSegment = segment(c6897SegmentedByteString, i);
        while (i < i9) {
            int i10 = iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1];
            int i11 = c6897SegmentedByteString.getDirectory()[iSegment] - i10;
            int i12 = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i9, i11 + i10) - i;
            int i13 = (i - i10) + i12;
            Segment segment = new Segment(c6897SegmentedByteString.getSegments()[iSegment], i13, i13 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                AbstractC5830k.m5327d(segment2);
                Segment segment3 = segment2.prev;
                AbstractC5830k.m5327d(segment3);
                segment3.push(segment);
            }
            i += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i8);
    }

    public static final void forEachSegment(@NotNull C6897SegmentedByteString c6897SegmentedByteString, @NotNull InterfaceC6474f action) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        AbstractC5830k.m5330g(action, "action");
        int length = c6897SegmentedByteString.getSegments().length;
        int i = 0;
        int i8 = 0;
        while (i < length) {
            int i9 = c6897SegmentedByteString.getDirectory()[length + i];
            int i10 = c6897SegmentedByteString.getDirectory()[i];
            action.invoke(c6897SegmentedByteString.getSegments()[i], Integer.valueOf(i9), Integer.valueOf(i10 - i8));
            i++;
            i8 = i10;
        }
    }

    public static final int segment(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c6897SegmentedByteString.getDirectory(), i + 1, 0, c6897SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C6897SegmentedByteString c6897SegmentedByteString, int i, int i8, InterfaceC6474f interfaceC6474f) {
        int iSegment = segment(c6897SegmentedByteString, i);
        while (i < i8) {
            int i9 = iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1];
            int i10 = c6897SegmentedByteString.getDirectory()[iSegment] - i9;
            int i11 = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i8, i10 + i9) - i;
            interfaceC6474f.invoke(c6897SegmentedByteString.getSegments()[iSegment], Integer.valueOf((i - i9) + i11), Integer.valueOf(iMin));
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C6897SegmentedByteString c6897SegmentedByteString, int i, @NotNull byte[] other, int i8, int i9) {
        AbstractC5830k.m5330g(c6897SegmentedByteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        if (i < 0 || i > c6897SegmentedByteString.size() - i9 || i8 < 0 || i8 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i;
        int iSegment = segment(c6897SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c6897SegmentedByteString.getDirectory()[iSegment - 1];
            int i12 = c6897SegmentedByteString.getDirectory()[iSegment] - i11;
            int i13 = c6897SegmentedByteString.getDirectory()[c6897SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!okio.SegmentedByteString.arrayRangeEquals(c6897SegmentedByteString.getSegments()[iSegment], (i - i11) + i13, other, i8, iMin)) {
                return false;
            }
            i8 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }
}

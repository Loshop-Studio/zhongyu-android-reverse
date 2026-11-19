package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m28092boximpl(long j10) {
        return new CursorAndWedgeAffinity(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m28093component1impl(long j10) {
        return m28100getCursorimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m28094component2impl(long j10) {
        return m28101getWedgeAffinityimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28097constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28098equalsimpl(long j10, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j10 == ((CursorAndWedgeAffinity) obj).m28104unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28099equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m28100getCursorimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m28101getWedgeAffinityimpl(long j10) {
        int i10 = (int) (j10 & 4294967295L);
        if (i10 < 0) {
            return null;
        }
        return i10 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28102hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28103toStringimpl(long j10) {
        return "CursorAndWedgeAffinity(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m28098equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28102hashCodeimpl(this.value);
    }

    public String toString() {
        return m28103toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m28104unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28095constructorimpl(int i10) {
        return m28097constructorimpl((i10 << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28096constructorimpl(int i10, WedgeAffinity wedgeAffinity) {
        int i11 = -1;
        int i12 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i12 != -1) {
            i11 = 1;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return m28097constructorimpl((i10 << 32) | (i11 & 4294967295L));
    }
}

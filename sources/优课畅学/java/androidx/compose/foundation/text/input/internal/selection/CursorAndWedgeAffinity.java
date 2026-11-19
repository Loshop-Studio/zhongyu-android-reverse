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
    public static final /* synthetic */ CursorAndWedgeAffinity m21490boximpl(long j10) {
        return new CursorAndWedgeAffinity(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m21491component1impl(long j10) {
        return m21498getCursorimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m21492component2impl(long j10) {
        return m21499getWedgeAffinityimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21495constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21496equalsimpl(long j10, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j10 == ((CursorAndWedgeAffinity) obj).m21502unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21497equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m21498getCursorimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m21499getWedgeAffinityimpl(long j10) {
        int i10 = (int) (j10 & 4294967295L);
        if (i10 < 0) {
            return null;
        }
        return i10 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21500hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21501toStringimpl(long j10) {
        return "CursorAndWedgeAffinity(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m21496equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m21500hashCodeimpl(this.value);
    }

    public String toString() {
        return m21501toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m21502unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21493constructorimpl(int i10) {
        return m21495constructorimpl((i10 << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21494constructorimpl(int i10, WedgeAffinity wedgeAffinity) {
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
        return m21495constructorimpl((i10 << 32) | (i11 & 4294967295L));
    }
}

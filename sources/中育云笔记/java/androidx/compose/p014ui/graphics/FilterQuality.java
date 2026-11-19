package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m30970constructorimpl(0);
    private static final int Low = m30970constructorimpl(1);
    private static final int Medium = m30970constructorimpl(2);
    private static final int High = m30970constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m30976getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m30977getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m30978getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m30979getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FilterQuality(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m30969boximpl(int i10) {
        return new FilterQuality(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30970constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30971equalsimpl(int i10, Object obj) {
        return (obj instanceof FilterQuality) && i10 == ((FilterQuality) obj).m30975unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30972equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30973hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30974toStringimpl(int i10) {
        return m30972equalsimpl0(i10, None) ? "None" : m30972equalsimpl0(i10, Low) ? "Low" : m30972equalsimpl0(i10, Medium) ? "Medium" : m30972equalsimpl0(i10, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m30971equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m30973hashCodeimpl(this.value);
    }

    public String toString() {
        return m30974toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30975unboximpl() {
        return this.value;
    }
}

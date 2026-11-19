package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m24368constructorimpl(0);
    private static final int Low = m24368constructorimpl(1);
    private static final int Medium = m24368constructorimpl(2);
    private static final int High = m24368constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m24374getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m24375getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m24376getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m24377getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FilterQuality(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m24367boximpl(int i10) {
        return new FilterQuality(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24368constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24369equalsimpl(int i10, Object obj) {
        return (obj instanceof FilterQuality) && i10 == ((FilterQuality) obj).m24373unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24370equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24371hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24372toStringimpl(int i10) {
        return m24370equalsimpl0(i10, None) ? "None" : m24370equalsimpl0(i10, Low) ? "Low" : m24370equalsimpl0(i10, Medium) ? "Medium" : m24370equalsimpl0(i10, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24369equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m24371hashCodeimpl(this.value);
    }

    public String toString() {
        return m24372toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24373unboximpl() {
        return this.value;
    }
}

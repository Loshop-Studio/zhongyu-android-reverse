package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerLayoutType {
    public static final Companion Companion = new Companion(null);
    private static final int Horizontal = m29347constructorimpl(0);
    private static final int Vertical = m29347constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getHorizontal-QJTpgSE, reason: not valid java name */
        public final int m29353getHorizontalQJTpgSE() {
            return TimePickerLayoutType.Horizontal;
        }

        /* renamed from: getVertical-QJTpgSE, reason: not valid java name */
        public final int m29354getVerticalQJTpgSE() {
            return TimePickerLayoutType.Vertical;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TimePickerLayoutType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerLayoutType m29346boximpl(int i10) {
        return new TimePickerLayoutType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m29347constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m29348equalsimpl(int i10, Object obj) {
        return (obj instanceof TimePickerLayoutType) && i10 == ((TimePickerLayoutType) obj).m29352unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29349equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m29350hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m29351toStringimpl(int i10) {
        return m29349equalsimpl0(i10, Horizontal) ? "Horizontal" : m29349equalsimpl0(i10, Vertical) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m29348equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m29350hashCodeimpl(this.value);
    }

    public String toString() {
        return m29351toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29352unboximpl() {
        return this.value;
    }
}

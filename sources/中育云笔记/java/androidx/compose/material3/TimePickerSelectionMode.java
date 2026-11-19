package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerSelectionMode {
    public static final Companion Companion = new Companion(null);
    private static final int Hour = m29356constructorimpl(0);
    private static final int Minute = m29356constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getHour-yecRtBI, reason: not valid java name */
        public final int m29362getHouryecRtBI() {
            return TimePickerSelectionMode.Hour;
        }

        /* renamed from: getMinute-yecRtBI, reason: not valid java name */
        public final int m29363getMinuteyecRtBI() {
            return TimePickerSelectionMode.Minute;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TimePickerSelectionMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerSelectionMode m29355boximpl(int i10) {
        return new TimePickerSelectionMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m29356constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m29357equalsimpl(int i10, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i10 == ((TimePickerSelectionMode) obj).m29361unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29358equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m29359hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m29360toStringimpl(int i10) {
        return m29358equalsimpl0(i10, Hour) ? "Hour" : m29358equalsimpl0(i10, Minute) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return m29357equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m29359hashCodeimpl(this.value);
    }

    public String toString() {
        return m29360toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29361unboximpl() {
        return this.value;
    }
}

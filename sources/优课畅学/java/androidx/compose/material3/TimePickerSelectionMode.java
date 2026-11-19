package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9126n;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerSelectionMode {
    public static final Companion Companion = new Companion(null);
    private static final int Hour = m22754constructorimpl(0);
    private static final int Minute = m22754constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getHour-yecRtBI, reason: not valid java name */
        public final int m22760getHouryecRtBI() {
            return TimePickerSelectionMode.Hour;
        }

        /* renamed from: getMinute-yecRtBI, reason: not valid java name */
        public final int m22761getMinuteyecRtBI() {
            return TimePickerSelectionMode.Minute;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TimePickerSelectionMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerSelectionMode m22753boximpl(int i10) {
        return new TimePickerSelectionMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m22754constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22755equalsimpl(int i10, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i10 == ((TimePickerSelectionMode) obj).m22759unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22756equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22757hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22758toStringimpl(int i10) {
        return m22756equalsimpl0(i10, Hour) ? "Hour" : m22756equalsimpl0(i10, Minute) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return m22755equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m22757hashCodeimpl(this.value);
    }

    public String toString() {
        return m22758toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22759unboximpl() {
        return this.value;
    }
}

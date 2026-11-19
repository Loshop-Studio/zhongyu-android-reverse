package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class TimePickerLayoutType {
    public static final Companion Companion = new Companion(null);
    private static final int Horizontal = m22745constructorimpl(0);
    private static final int Vertical = m22745constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getHorizontal-QJTpgSE, reason: not valid java name */
        public final int m22751getHorizontalQJTpgSE() {
            return TimePickerLayoutType.Horizontal;
        }

        /* renamed from: getVertical-QJTpgSE, reason: not valid java name */
        public final int m22752getVerticalQJTpgSE() {
            return TimePickerLayoutType.Vertical;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TimePickerLayoutType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerLayoutType m22744boximpl(int i10) {
        return new TimePickerLayoutType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m22745constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22746equalsimpl(int i10, Object obj) {
        return (obj instanceof TimePickerLayoutType) && i10 == ((TimePickerLayoutType) obj).m22750unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22747equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22748hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22749toStringimpl(int i10) {
        return m22747equalsimpl0(i10, Horizontal) ? "Horizontal" : m22747equalsimpl0(i10, Vertical) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m22746equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22748hashCodeimpl(this.value);
    }

    public String toString() {
        return m22749toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22750unboximpl() {
        return this.value;
    }
}

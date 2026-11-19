package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class InputIdentifier {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int SingleDateInput = m28764constructorimpl(0);
    private static final int StartDateInput = m28764constructorimpl(1);
    private static final int EndDateInput = m28764constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m28770getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m28771getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m28772getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputIdentifier(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m28763boximpl(int i10) {
        return new InputIdentifier(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m28764constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28765equalsimpl(int i10, Object obj) {
        return (obj instanceof InputIdentifier) && i10 == ((InputIdentifier) obj).m28769unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28766equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28767hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28768toStringimpl(int i10) {
        return m28766equalsimpl0(i10, SingleDateInput) ? "SingleDateInput" : m28766equalsimpl0(i10, StartDateInput) ? "StartDateInput" : m28766equalsimpl0(i10, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28765equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28767hashCodeimpl(this.value);
    }

    public String toString() {
        return m28768toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28769unboximpl() {
        return this.value;
    }
}

package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class InputIdentifier {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int SingleDateInput = m22162constructorimpl(0);
    private static final int StartDateInput = m22162constructorimpl(1);
    private static final int EndDateInput = m22162constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m22168getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m22169getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m22170getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InputIdentifier(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m22161boximpl(int i10) {
        return new InputIdentifier(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m22162constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22163equalsimpl(int i10, Object obj) {
        return (obj instanceof InputIdentifier) && i10 == ((InputIdentifier) obj).m22167unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22164equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22165hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22166toStringimpl(int i10) {
        return m22164equalsimpl0(i10, SingleDateInput) ? "SingleDateInput" : m22164equalsimpl0(i10, StartDateInput) ? "StartDateInput" : m22164equalsimpl0(i10, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m22163equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22165hashCodeimpl(this.value);
    }

    public String toString() {
        return m22166toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22167unboximpl() {
        return this.value;
    }
}

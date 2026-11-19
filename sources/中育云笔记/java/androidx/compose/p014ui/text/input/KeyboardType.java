package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m33183constructorimpl(0);
    private static final int Text = m33183constructorimpl(1);
    private static final int Ascii = m33183constructorimpl(2);
    private static final int Number = m33183constructorimpl(3);
    private static final int Phone = m33183constructorimpl(4);
    private static final int Uri = m33183constructorimpl(5);
    private static final int Email = m33183constructorimpl(6);
    private static final int Password = m33183constructorimpl(7);
    private static final int NumberPassword = m33183constructorimpl(8);
    private static final int Decimal = m33183constructorimpl(9);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33189getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33190getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33191getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33192getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33193getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33194getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33195getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33196getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33197getUnspecifiedPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m33198getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m33199getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m33200getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m33201getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m33202getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m33203getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m33204getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m33205getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m33206getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m33207getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m33208getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m33182boximpl(int i10) {
        return new KeyboardType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m33183constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33184equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardType) && i10 == ((KeyboardType) obj).m33188unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33185equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33186hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33187toStringimpl(int i10) {
        return m33185equalsimpl0(i10, Unspecified) ? "Unspecified" : m33185equalsimpl0(i10, Text) ? "Text" : m33185equalsimpl0(i10, Ascii) ? "Ascii" : m33185equalsimpl0(i10, Number) ? "Number" : m33185equalsimpl0(i10, Phone) ? "Phone" : m33185equalsimpl0(i10, Uri) ? "Uri" : m33185equalsimpl0(i10, Email) ? "Email" : m33185equalsimpl0(i10, Password) ? "Password" : m33185equalsimpl0(i10, NumberPassword) ? "NumberPassword" : m33185equalsimpl0(i10, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33184equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33186hashCodeimpl(this.value);
    }

    public String toString() {
        return m33187toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33188unboximpl() {
        return this.value;
    }
}

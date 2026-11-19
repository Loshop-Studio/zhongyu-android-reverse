package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m26581constructorimpl(0);
    private static final int Text = m26581constructorimpl(1);
    private static final int Ascii = m26581constructorimpl(2);
    private static final int Number = m26581constructorimpl(3);
    private static final int Phone = m26581constructorimpl(4);
    private static final int Uri = m26581constructorimpl(5);
    private static final int Email = m26581constructorimpl(6);
    private static final int Password = m26581constructorimpl(7);
    private static final int NumberPassword = m26581constructorimpl(8);
    private static final int Decimal = m26581constructorimpl(9);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26587getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26588getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26589getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26590getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26591getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26592getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26593getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26594getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26595getUnspecifiedPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m26596getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m26597getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m26598getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m26599getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m26600getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m26601getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m26602getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m26603getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m26604getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m26605getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m26606getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m26580boximpl(int i10) {
        return new KeyboardType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26581constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26582equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardType) && i10 == ((KeyboardType) obj).m26586unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26583equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26584hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26585toStringimpl(int i10) {
        return m26583equalsimpl0(i10, Unspecified) ? "Unspecified" : m26583equalsimpl0(i10, Text) ? "Text" : m26583equalsimpl0(i10, Ascii) ? "Ascii" : m26583equalsimpl0(i10, Number) ? "Number" : m26583equalsimpl0(i10, Phone) ? "Phone" : m26583equalsimpl0(i10, Uri) ? "Uri" : m26583equalsimpl0(i10, Email) ? "Email" : m26583equalsimpl0(i10, Password) ? "Password" : m26583equalsimpl0(i10, NumberPassword) ? "NumberPassword" : m26583equalsimpl0(i10, Decimal) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26582equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26584hashCodeimpl(this.value);
    }

    public String toString() {
        return m26585toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26586unboximpl() {
        return this.value;
    }
}

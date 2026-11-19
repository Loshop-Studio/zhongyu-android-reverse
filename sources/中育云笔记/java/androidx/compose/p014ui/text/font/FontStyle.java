package androidx.compose.p014ui.text.font;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m33075constructorimpl(0);
    private static final int Italic = m33075constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m33081getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m33082getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m33083getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m33084getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return AbstractC10978w.m24139q(FontStyle.m33074boximpl(m33084getNormal_LCdwA()), FontStyle.m33074boximpl(m33083getItalic_LCdwA()));
        }

        private Companion() {
        }
    }

    @InterfaceC10770a
    private /* synthetic */ FontStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m33074boximpl(int i10) {
        return new FontStyle(i10);
    }

    @InterfaceC10770a
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33075constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33076equalsimpl(int i10, Object obj) {
        return (obj instanceof FontStyle) && i10 == ((FontStyle) obj).m33080unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33077equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33078hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33079toStringimpl(int i10) {
        return m33077equalsimpl0(i10, Normal) ? "Normal" : m33077equalsimpl0(i10, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33076equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m33078hashCodeimpl(this.value);
    }

    public String toString() {
        return m33079toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33080unboximpl() {
        return this.value;
    }
}

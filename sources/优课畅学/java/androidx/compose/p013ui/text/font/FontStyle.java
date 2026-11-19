package androidx.compose.p013ui.text.font;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m26473constructorimpl(0);
    private static final int Italic = m26473constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m26479getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m26480getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m26481getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m26482getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return AbstractC8809v.m14774q(FontStyle.m26472boximpl(m26482getNormal_LCdwA()), FontStyle.m26472boximpl(m26481getItalic_LCdwA()));
        }

        private Companion() {
        }
    }

    @InterfaceC8721a
    private /* synthetic */ FontStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m26472boximpl(int i10) {
        return new FontStyle(i10);
    }

    @InterfaceC8721a
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26473constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26474equalsimpl(int i10, Object obj) {
        return (obj instanceof FontStyle) && i10 == ((FontStyle) obj).m26478unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26475equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26476hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26477toStringimpl(int i10) {
        return m26475equalsimpl0(i10, Normal) ? "Normal" : m26475equalsimpl0(i10, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26474equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m26476hashCodeimpl(this.value);
    }

    public String toString() {
        return m26477toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26478unboximpl() {
        return this.value;
    }
}

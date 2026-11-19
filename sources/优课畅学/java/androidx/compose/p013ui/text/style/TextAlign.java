package androidx.compose.p013ui.text.style;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m26777constructorimpl(1);
    private static final int Right = m26777constructorimpl(2);
    private static final int Center = m26777constructorimpl(3);
    private static final int Justify = m26777constructorimpl(4);
    private static final int Start = m26777constructorimpl(5);
    private static final int End = m26777constructorimpl(6);
    private static final int Unspecified = m26777constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m26783getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m26784getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m26785getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m26786getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m26787getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m26788getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m26789getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        public final List<TextAlign> values() {
            return AbstractC8809v.m14774q(TextAlign.m26776boximpl(m26786getLefte0LSkKk()), TextAlign.m26776boximpl(m26787getRighte0LSkKk()), TextAlign.m26776boximpl(m26783getCentere0LSkKk()), TextAlign.m26776boximpl(m26785getJustifye0LSkKk()), TextAlign.m26776boximpl(m26788getStarte0LSkKk()), TextAlign.m26776boximpl(m26784getEnde0LSkKk()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextAlign(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m26776boximpl(int i10) {
        return new TextAlign(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26777constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26778equalsimpl(int i10, Object obj) {
        return (obj instanceof TextAlign) && i10 == ((TextAlign) obj).m26782unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26779equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26780hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26781toStringimpl(int i10) {
        return m26779equalsimpl0(i10, Left) ? "Left" : m26779equalsimpl0(i10, Right) ? "Right" : m26779equalsimpl0(i10, Center) ? "Center" : m26779equalsimpl0(i10, Justify) ? "Justify" : m26779equalsimpl0(i10, Start) ? "Start" : m26779equalsimpl0(i10, End) ? "End" : m26779equalsimpl0(i10, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26778equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26780hashCodeimpl(this.value);
    }

    public String toString() {
        return m26781toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26782unboximpl() {
        return this.value;
    }
}

package androidx.compose.p014ui.text.style;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m33379constructorimpl(1);
    private static final int Right = m33379constructorimpl(2);
    private static final int Center = m33379constructorimpl(3);
    private static final int Justify = m33379constructorimpl(4);
    private static final int Start = m33379constructorimpl(5);
    private static final int End = m33379constructorimpl(6);
    private static final int Unspecified = m33379constructorimpl(Integer.MIN_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m33385getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m33386getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m33387getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m33388getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m33389getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m33390getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m33391getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        public final List<TextAlign> values() {
            return AbstractC10978w.m24139q(TextAlign.m33378boximpl(m33388getLefte0LSkKk()), TextAlign.m33378boximpl(m33389getRighte0LSkKk()), TextAlign.m33378boximpl(m33385getCentere0LSkKk()), TextAlign.m33378boximpl(m33387getJustifye0LSkKk()), TextAlign.m33378boximpl(m33390getStarte0LSkKk()), TextAlign.m33378boximpl(m33386getEnde0LSkKk()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextAlign(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m33378boximpl(int i10) {
        return new TextAlign(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33379constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33380equalsimpl(int i10, Object obj) {
        return (obj instanceof TextAlign) && i10 == ((TextAlign) obj).m33384unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33381equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33382hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33383toStringimpl(int i10) {
        return m33381equalsimpl0(i10, Left) ? "Left" : m33381equalsimpl0(i10, Right) ? "Right" : m33381equalsimpl0(i10, Center) ? "Center" : m33381equalsimpl0(i10, Justify) ? "Justify" : m33381equalsimpl0(i10, Start) ? "Start" : m33381equalsimpl0(i10, End) ? "End" : m33381equalsimpl0(i10, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33380equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33382hashCodeimpl(this.value);
    }

    public String toString() {
        return m33383toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33384unboximpl() {
        return this.value;
    }
}

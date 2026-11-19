package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m24633constructorimpl(0);
    private static final int Round = m24633constructorimpl(1);
    private static final int Bevel = m24633constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m24639getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m24640getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m24641getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeJoin(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m24632boximpl(int i10) {
        return new StrokeJoin(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24633constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24634equalsimpl(int i10, Object obj) {
        return (obj instanceof StrokeJoin) && i10 == ((StrokeJoin) obj).m24638unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24635equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24636hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24637toStringimpl(int i10) {
        return m24635equalsimpl0(i10, Miter) ? "Miter" : m24635equalsimpl0(i10, Round) ? "Round" : m24635equalsimpl0(i10, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24634equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24636hashCodeimpl(this.value);
    }

    public String toString() {
        return m24637toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24638unboximpl() {
        return this.value;
    }
}

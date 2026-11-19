package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m31235constructorimpl(0);
    private static final int Round = m31235constructorimpl(1);
    private static final int Bevel = m31235constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m31241getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m31242getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m31243getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeJoin(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m31234boximpl(int i10) {
        return new StrokeJoin(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31235constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31236equalsimpl(int i10, Object obj) {
        return (obj instanceof StrokeJoin) && i10 == ((StrokeJoin) obj).m31240unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31237equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31238hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31239toStringimpl(int i10) {
        return m31237equalsimpl0(i10, Miter) ? "Miter" : m31237equalsimpl0(i10, Round) ? "Round" : m31237equalsimpl0(i10, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31236equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31238hashCodeimpl(this.value);
    }

    public String toString() {
        return m31239toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31240unboximpl() {
        return this.value;
    }
}

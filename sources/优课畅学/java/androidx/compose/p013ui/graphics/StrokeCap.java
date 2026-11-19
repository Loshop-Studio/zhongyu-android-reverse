package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m24623constructorimpl(0);
    private static final int Round = m24623constructorimpl(1);
    private static final int Square = m24623constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m24629getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m24630getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m24631getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeCap(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m24622boximpl(int i10) {
        return new StrokeCap(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24623constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24624equalsimpl(int i10, Object obj) {
        return (obj instanceof StrokeCap) && i10 == ((StrokeCap) obj).m24628unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24625equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24626hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24627toStringimpl(int i10) {
        return m24625equalsimpl0(i10, Butt) ? "Butt" : m24625equalsimpl0(i10, Round) ? "Round" : m24625equalsimpl0(i10, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24624equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24626hashCodeimpl(this.value);
    }

    public String toString() {
        return m24627toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24628unboximpl() {
        return this.value;
    }
}

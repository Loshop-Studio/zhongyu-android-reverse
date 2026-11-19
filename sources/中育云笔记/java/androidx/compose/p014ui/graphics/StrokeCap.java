package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m31225constructorimpl(0);
    private static final int Round = m31225constructorimpl(1);
    private static final int Square = m31225constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m31231getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m31232getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m31233getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeCap(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m31224boximpl(int i10) {
        return new StrokeCap(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31225constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31226equalsimpl(int i10, Object obj) {
        return (obj instanceof StrokeCap) && i10 == ((StrokeCap) obj).m31230unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31227equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31228hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31229toStringimpl(int i10) {
        return m31227equalsimpl0(i10, Butt) ? "Butt" : m31227equalsimpl0(i10, Round) ? "Round" : m31227equalsimpl0(i10, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31226equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31228hashCodeimpl(this.value);
    }

    public String toString() {
        return m31229toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31230unboximpl() {
        return this.value;
    }
}

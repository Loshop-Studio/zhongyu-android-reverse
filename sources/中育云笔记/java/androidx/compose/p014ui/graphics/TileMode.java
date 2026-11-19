package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m31245constructorimpl(0);
    private static final int Repeated = m31245constructorimpl(1);
    private static final int Mirror = m31245constructorimpl(2);
    private static final int Decal = m31245constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m31251getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m31252getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m31253getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m31254getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TileMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m31244boximpl(int i10) {
        return new TileMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31245constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31246equalsimpl(int i10, Object obj) {
        return (obj instanceof TileMode) && i10 == ((TileMode) obj).m31250unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31247equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31248hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31249toStringimpl(int i10) {
        return m31247equalsimpl0(i10, Clamp) ? "Clamp" : m31247equalsimpl0(i10, Repeated) ? "Repeated" : m31247equalsimpl0(i10, Mirror) ? "Mirror" : m31247equalsimpl0(i10, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31246equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31248hashCodeimpl(this.value);
    }

    public String toString() {
        return m31249toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31250unboximpl() {
        return this.value;
    }
}

package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m24643constructorimpl(0);
    private static final int Repeated = m24643constructorimpl(1);
    private static final int Mirror = m24643constructorimpl(2);
    private static final int Decal = m24643constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m24649getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m24650getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m24651getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m24652getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TileMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m24642boximpl(int i10) {
        return new TileMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24643constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24644equalsimpl(int i10, Object obj) {
        return (obj instanceof TileMode) && i10 == ((TileMode) obj).m24648unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24645equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24646hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24647toStringimpl(int i10) {
        return m24645equalsimpl0(i10, Clamp) ? "Clamp" : m24645equalsimpl0(i10, Repeated) ? "Repeated" : m24645equalsimpl0(i10, Mirror) ? "Mirror" : m24645equalsimpl0(i10, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24644equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24646hashCodeimpl(this.value);
    }

    public String toString() {
        return m24647toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24648unboximpl() {
        return this.value;
    }
}

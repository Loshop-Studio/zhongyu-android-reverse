package androidx.compose.material3.carousel;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class CarouselAlignment {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = m29481constructorimpl(-1);
    private static final int Center = m29481constructorimpl(0);
    private static final int End = m29481constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m29487getCenterNUL3oTo() {
            return CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m29488getEndNUL3oTo() {
            return CarouselAlignment.End;
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m29489getStartNUL3oTo() {
            return CarouselAlignment.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CarouselAlignment(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CarouselAlignment m29480boximpl(int i10) {
        return new CarouselAlignment(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m29481constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m29482equalsimpl(int i10, Object obj) {
        return (obj instanceof CarouselAlignment) && i10 == ((CarouselAlignment) obj).m29486unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29483equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m29484hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m29485toStringimpl(int i10) {
        return "CarouselAlignment(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m29482equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m29484hashCodeimpl(this.value);
    }

    public String toString() {
        return m29485toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29486unboximpl() {
        return this.value;
    }
}

package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m23834getComposition6f8NoZ8() {
            return ReaderKind.m23825constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m23835getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m23825constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m23836getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m23825constructorimpl(2);
        }

        private Companion() {
        }
    }

    private /* synthetic */ ReaderKind(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m23824boximpl(int i10) {
        return new ReaderKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23825constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m23826constructorimpl$default(int i10, int i11, AbstractC9126n abstractC9126n) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m23825constructorimpl(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23827equalsimpl(int i10, Object obj) {
        return (obj instanceof ReaderKind) && i10 == ((ReaderKind) obj).m23833unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23828equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23829hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m23830isReadInh_f27i8(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23831toStringimpl(int i10) {
        return "ReaderKind(mask=" + i10 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m23832withReadIn3QSx2Dw(int i10, int i11) {
        return m23825constructorimpl(i10 | i11);
    }

    public boolean equals(Object obj) {
        return m23827equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m23829hashCodeimpl(this.mask);
    }

    public String toString() {
        return m23831toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m23833unboximpl() {
        return this.mask;
    }
}

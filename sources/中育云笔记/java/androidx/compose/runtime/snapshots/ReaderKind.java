package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m30436getComposition6f8NoZ8() {
            return ReaderKind.m30427constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m30437getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m30427constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m30438getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m30427constructorimpl(2);
        }

        private Companion() {
        }
    }

    private /* synthetic */ ReaderKind(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m30426boximpl(int i10) {
        return new ReaderKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30427constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m30428constructorimpl$default(int i10, int i11, AbstractC9972n abstractC9972n) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m30427constructorimpl(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30429equalsimpl(int i10, Object obj) {
        return (obj instanceof ReaderKind) && i10 == ((ReaderKind) obj).m30435unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30430equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30431hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m30432isReadInh_f27i8(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30433toStringimpl(int i10) {
        return "ReaderKind(mask=" + i10 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m30434withReadIn3QSx2Dw(int i10, int i11) {
        return m30427constructorimpl(i10 | i11);
    }

    public boolean equals(Object obj) {
        return m30429equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m30431hashCodeimpl(this.mask);
    }

    public String toString() {
        return m30433toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30435unboximpl() {
        return this.mask;
    }
}

package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isReadIn", "reader", "isReadIn-h_f27i8", "(II)Z", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "withReadIn", "withReadIn-3QSx2Dw", "(II)I", "Companion", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class ReaderKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int mask;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m20547getComposition6f8NoZ8() {
            return ReaderKind.m20538constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m20548getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m20538constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m20549getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m20538constructorimpl(2);
        }

        private Companion() {
        }
    }

    private /* synthetic */ ReaderKind(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m20537boximpl(int i10) {
        return new ReaderKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m20538constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m20539constructorimpl$default(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m20538constructorimpl(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20540equalsimpl(int i10, Object obj) {
        return (obj instanceof ReaderKind) && i10 == ((ReaderKind) obj).m20546unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20541equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20542hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m20543isReadInh_f27i8(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20544toStringimpl(int i10) {
        return "ReaderKind(mask=" + i10 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m20545withReadIn3QSx2Dw(int i10, int i11) {
        return m20538constructorimpl(i10 | i11);
    }

    public boolean equals(Object obj) {
        return m20540equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m20542hashCodeimpl(this.mask);
    }

    public String toString() {
        return m20544toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20546unboximpl() {
        return this.mask;
    }
}

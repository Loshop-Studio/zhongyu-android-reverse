package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m31269getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TransformOrigin(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m31256boximpl(long j10) {
        return new TransformOrigin(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m31257component1impl(long j10) {
        return m31264getPivotFractionXimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m31258component2impl(long j10) {
        return m31265getPivotFractionYimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m31259constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m31260copyzey9I6w(long j10, float f10, float f11) {
        return TransformOriginKt.TransformOrigin(f10, f11);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m31261copyzey9I6w$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m31264getPivotFractionXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m31265getPivotFractionYimpl(j10);
        }
        return m31260copyzey9I6w(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31262equalsimpl(long j10, Object obj) {
        return (obj instanceof TransformOrigin) && j10 == ((TransformOrigin) obj).m31268unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31263equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m31264getPivotFractionXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m31265getPivotFractionYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31266hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31267toStringimpl(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m31262equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m31266hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m31267toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31268unboximpl() {
        return this.packedValue;
    }
}

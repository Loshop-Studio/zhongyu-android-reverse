package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m24667getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TransformOrigin(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m24654boximpl(long j10) {
        return new TransformOrigin(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m24655component1impl(long j10) {
        return m24662getPivotFractionXimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m24656component2impl(long j10) {
        return m24663getPivotFractionYimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m24657constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m24658copyzey9I6w(long j10, float f10, float f11) {
        return TransformOriginKt.TransformOrigin(f10, f11);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m24659copyzey9I6w$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m24662getPivotFractionXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m24663getPivotFractionYimpl(j10);
        }
        return m24658copyzey9I6w(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24660equalsimpl(long j10, Object obj) {
        return (obj instanceof TransformOrigin) && j10 == ((TransformOrigin) obj).m24666unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24661equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m24662getPivotFractionXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m24663getPivotFractionYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24664hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24665toStringimpl(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m24660equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m24664hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m24665toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m24666unboximpl() {
        return this.packedValue;
    }
}

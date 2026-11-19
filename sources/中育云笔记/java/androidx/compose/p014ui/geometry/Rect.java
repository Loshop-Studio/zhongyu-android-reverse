package androidx.compose.p014ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f28515top;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        private Companion() {
        }
    }

    public Rect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.f28515top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = rect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = rect.f28515top;
        }
        if ((i10 & 4) != 0) {
            f12 = rect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = rect.bottom;
        }
        return rect.copy(f10, f11, f12, f13);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m30662getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.f28515top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m30663containsk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat >= this.left) & (fIntBitsToFloat < this.right) & (fIntBitsToFloat2 >= this.f28515top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final Rect copy(float f10, float f11, float f12, float f13) {
        return new Rect(f10, f11, f12, f13);
    }

    @Stable
    public final Rect deflate(float f10) {
        return inflate(-f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.f28515top, rect.f28515top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m30664getBottomCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f10 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m30665getBottomLeftF1C5BW0() {
        float f10 = this.left;
        float f11 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m30666getBottomRightF1C5BW0() {
        float f10 = this.right;
        float f11 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m30667getCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float bottom = this.f28515top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m30668getCenterLeftF1C5BW0() {
        float f10 = this.left;
        float bottom = this.f28515top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m30669getCenterRightF1C5BW0() {
        float f10 = this.right;
        float bottom = this.f28515top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m30670getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m30697constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.f28515top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m30671getTopCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f10 = this.f28515top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m30672getTopLeftF1C5BW0() {
        float f10 = this.left;
        float f11 = this.f28515top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m30673getTopRightF1C5BW0() {
        float f10 = this.right;
        float f11 = this.f28515top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.f28515top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @Stable
    public final Rect inflate(float f10) {
        return new Rect(this.left - f10, this.f28515top - f10, this.right + f10, this.bottom + f10);
    }

    @Stable
    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.f28515top, rect.f28515top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.f28515top >= this.bottom);
    }

    public final boolean isFinite() {
        return ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f28515top) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean isInfinite() {
        return (this.left == Float.POSITIVE_INFINITY) | (this.f28515top == Float.POSITIVE_INFINITY) | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(Rect rect) {
        return (this.left < rect.right) & (rect.left < this.right) & (this.f28515top < rect.bottom) & (rect.f28515top < this.bottom);
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28515top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    public final Rect translate(float f10, float f11) {
        return new Rect(this.left + f10, this.f28515top + f11, this.right + f10, this.bottom + f11);
    }

    @Stable
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m30674translatek4lQ0M(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new Rect(this.left + Float.intBitsToFloat(i10), this.f28515top + Float.intBitsToFloat(i11), this.right + Float.intBitsToFloat(i10), this.bottom + Float.intBitsToFloat(i11));
    }

    @Stable
    public final Rect intersect(float f10, float f11, float f12, float f13) {
        return new Rect(Math.max(this.left, f10), Math.max(this.f28515top, f11), Math.min(this.right, f12), Math.min(this.bottom, f13));
    }
}

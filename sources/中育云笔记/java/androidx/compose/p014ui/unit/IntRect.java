package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;

    /* renamed from: top, reason: collision with root package name */
    private final int f28522top;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        private Companion() {
        }
    }

    public IntRect(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.f28522top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = intRect.left;
        }
        if ((i14 & 2) != 0) {
            i11 = intRect.f28522top;
        }
        if ((i14 & 4) != 0) {
            i12 = intRect.right;
        }
        if ((i14 & 8) != 0) {
            i13 = intRect.bottom;
        }
        return intRect.copy(i10, i11, i12, i13);
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
    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m33648getSizeYbymL2g$annotations() {
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

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.f28522top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m33649containsgyyYBs(long j10) {
        return IntOffset.m33629getXimpl(j10) >= this.left && IntOffset.m33629getXimpl(j10) < this.right && IntOffset.m33630getYimpl(j10) >= this.f28522top && IntOffset.m33630getYimpl(j10) < this.bottom;
    }

    public final IntRect copy(int i10, int i11, int i12, int i13) {
        return new IntRect(i10, i11, i12, i13);
    }

    @Stable
    public final IntRect deflate(int i10) {
        return inflate(-i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.f28522top == intRect.f28522top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m33650getBottomCenternOccac() {
        return IntOffset.m33623constructorimpl((this.bottom & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m33651getBottomLeftnOccac() {
        return IntOffset.m33623constructorimpl((this.bottom & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m33652getBottomRightnOccac() {
        return IntOffset.m33623constructorimpl((this.bottom & 4294967295L) | (this.right << 32));
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m33653getCenternOccac() {
        return IntOffset.m33623constructorimpl(((this.f28522top + (getHeight() / 2)) & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m33654getCenterLeftnOccac() {
        return IntOffset.m33623constructorimpl(((this.f28522top + (getHeight() / 2)) & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m33655getCenterRightnOccac() {
        return IntOffset.m33623constructorimpl(((this.f28522top + (getHeight() / 2)) & 4294967295L) | (this.right << 32));
    }

    public final int getHeight() {
        return this.bottom - this.f28522top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m33656getSizeYbymL2g() {
        return IntSize.m33667constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    public final int getTop() {
        return this.f28522top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m33657getTopCenternOccac() {
        return IntOffset.m33623constructorimpl((this.f28522top & 4294967295L) | ((this.left + (getWidth() / 2)) << 32));
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m33658getTopLeftnOccac() {
        return IntOffset.m33623constructorimpl((this.f28522top & 4294967295L) | (this.left << 32));
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m33659getTopRightnOccac() {
        return IntOffset.m33623constructorimpl((this.f28522top & 4294967295L) | (this.right << 32));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.f28522top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    @Stable
    public final IntRect inflate(int i10) {
        return new IntRect(this.left - i10, this.f28522top - i10, this.right + i10, this.bottom + i10);
    }

    @Stable
    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.f28522top, intRect.f28522top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.f28522top >= this.bottom;
    }

    public final boolean overlaps(IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.f28522top && intRect.bottom > this.f28522top;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.f28522top + ", " + this.right + ", " + this.bottom + ')';
    }

    @Stable
    public final IntRect translate(int i10, int i11) {
        return new IntRect(this.left + i10, this.f28522top + i11, this.right + i10, this.bottom + i11);
    }

    @Stable
    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m33660translategyyYBs(long j10) {
        return new IntRect(this.left + IntOffset.m33629getXimpl(j10), this.f28522top + IntOffset.m33630getYimpl(j10), this.right + IntOffset.m33629getXimpl(j10), this.bottom + IntOffset.m33630getYimpl(j10));
    }
}

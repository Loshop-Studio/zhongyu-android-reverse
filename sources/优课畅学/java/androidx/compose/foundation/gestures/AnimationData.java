package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    public /* synthetic */ AnimationData(float f10, long j10, float f11, AbstractC9126n abstractC9126n) {
        this(f10, j10, f11);
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m20520copyd4ec7I$default(AnimationData animationData, float f10, long j10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = animationData.zoom;
        }
        if ((i10 & 2) != 0) {
            j10 = animationData.offset;
        }
        if ((i10 & 4) != 0) {
            f11 = animationData.degrees;
        }
        return animationData.m20522copyd4ec7I(f10, j10, f11);
    }

    public final float component1() {
        return this.zoom;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m20521component2F1C5BW0() {
        return this.offset;
    }

    public final float component3() {
        return this.degrees;
    }

    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m20522copyd4ec7I(float f10, long j10, float f11) {
        return new AnimationData(f10, j10, f11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m24032equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m20523getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return (((Float.hashCode(this.zoom) * 31) + Offset.m24037hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.degrees);
    }

    public String toString() {
        return "AnimationData(zoom=" + this.zoom + ", offset=" + ((Object) Offset.m24043toStringimpl(this.offset)) + ", degrees=" + this.degrees + ')';
    }

    private AnimationData(float f10, long j10, float f11) {
        this.zoom = f10;
        this.offset = j10;
        this.degrees = f11;
    }
}

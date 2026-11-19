package androidx.compose.foundation.gestures;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnimationData;", "", "", "zoom", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "degrees", "<init>", "(FJFLkotlin/jvm/internal/e;)V", "component1", "()F", "component2-F1C5BW0", "()J", "component2", "component3", "copy-d-4ec7I", "(FJF)Landroidx/compose/foundation/gestures/AnimationData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getZoom", "J", "getOffset-F1C5BW0", "getDegrees", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    public /* synthetic */ AnimationData(float f, long j7, float f7, AbstractC5824e abstractC5824e) {
        this(f, j7, f7);
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m6926copyd4ec7I$default(AnimationData animationData, float f, long j7, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = animationData.zoom;
        }
        if ((i & 2) != 0) {
            j7 = animationData.offset;
        }
        if ((i & 4) != 0) {
            f7 = animationData.degrees;
        }
        return animationData.m6928copyd4ec7I(f, j7, f7);
    }

    /* renamed from: component1, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDegrees() {
        return this.degrees;
    }

    @NotNull
    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m6928copyd4ec7I(float zoom, long offset, float degrees) {
        return new AnimationData(zoom, offset, degrees, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) other;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m10438equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m6929getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Float.hashCode(this.degrees) + ((Offset.m10443hashCodeimpl(this.offset) + (Float.hashCode(this.zoom) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.zoom);
        sb.append(", offset=");
        sb.append((Object) Offset.m10449toStringimpl(this.offset));
        sb.append(", degrees=");
        return AbstractC0584a.m915p(sb, this.degrees, ')');
    }

    private AnimationData(float f, long j7, float f7) {
        this.zoom = f;
        this.offset = j7;
        this.degrees = f7;
    }
}

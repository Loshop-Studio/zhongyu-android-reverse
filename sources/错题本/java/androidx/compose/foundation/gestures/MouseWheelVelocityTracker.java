package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p011ui.unit.VelocityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "delta", "Ld6/s;", "addDelta-Uv8p0NA", "(JJ)V", "addDelta", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,363:1\n65#2:364\n69#2:367\n60#3:365\n70#3:368\n22#4:366\n22#4:369\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n*L\n342#1:364\n343#1:367\n342#1:365\n343#1:368\n342#1:366\n343#1:369\n*E\n"})
/* loaded from: classes.dex */
final class MouseWheelVelocityTracker {

    @NotNull
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(true);

    @NotNull
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(true);

    /* renamed from: addDelta-Uv8p0NA, reason: not valid java name */
    public final void m7003addDeltaUv8p0NA(long timeMillis, long delta) {
        this.xVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat((int) (delta >> 32)));
        this.yVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat((int) (delta & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m7004calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Float.MAX_VALUE), this.yVelocityTracker.calculateVelocity(Float.MAX_VALUE));
    }
}

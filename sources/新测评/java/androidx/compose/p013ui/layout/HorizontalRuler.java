package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\t¨\u0006\n"}, m13558d2 = {"Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/Ruler;", "()V", "calculateCoordinate", "", "coordinate", "sourceCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "targetCoordinates", "calculateCoordinate$ui_release", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,73:1\n54#2:74\n85#3:75\n53#3,3:77\n70#3:81\n30#4:76\n69#5:80\n22#6:82\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n*L\n69#1:74\n69#1:75\n69#1:77,3\n70#1:81\n69#1:76\n70#1:80\n70#1:82\n*E\n"})
/* loaded from: classes2.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;

    public HorizontalRuler() {
        super(null);
    }

    @Override // androidx.compose.p013ui.layout.Ruler
    public float calculateCoordinate$ui_release(float coordinate, LayoutCoordinates sourceCoordinates, LayoutCoordinates targetCoordinates) {
        return Float.intBitsToFloat((int) (targetCoordinates.mo22333localPositionOfR5De75A(sourceCoordinates, Offset.m20727constructorimpl((Float.floatToRawIntBits(((int) (sourceCoordinates.mo22332getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(coordinate) & 4294967295L))) & 4294967295L));
    }
}

package coil3.compose;

import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcoil3/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,142:1\n78#2:143\n107#2,2:144\n1#3:146\n148#4:147\n148#4:148\n33#4:155\n153#4:159\n153#4:174\n153#4:175\n57#5:149\n61#5:152\n57#5:160\n61#5:163\n60#6:150\n70#6:153\n53#6,3:156\n60#6:161\n70#6:164\n22#7:151\n22#7:154\n22#7:162\n22#7:165\n108#8:166\n68#8,7:167\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n*L\n50#1:143\n50#1:144,2\n101#1:147\n102#1:148\n104#1:155\n123#1:159\n137#1:174\n138#1:175\n105#1:149\n106#1:152\n127#1:160\n128#1:163\n105#1:150\n106#1:153\n104#1:156,3\n127#1:161\n128#1:164\n105#1:151\n106#1:154\n127#1:162\n128#1:165\n126#1:166\n126#1:167,7\n*E\n"})
/* loaded from: classes2.dex */
public final class CrossfadePainter extends Painter {

    /* renamed from: a */
    public boolean f1838a;

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo11353getIntrinsicSizeNHjbRc() {
        Size.Companion companion = Size.INSTANCE;
        long jM10519getZeroNHjbRc = companion.m10519getZeroNHjbRc();
        long jM10519getZeroNHjbRc2 = companion.m10519getZeroNHjbRc();
        boolean z8 = jM10519getZeroNHjbRc != InlineClassHelperKt.UnspecifiedPackedFloats;
        boolean z9 = jM10519getZeroNHjbRc2 != InlineClassHelperKt.UnspecifiedPackedFloats;
        if (!z8 || !z9) {
            return companion.m10518getUnspecifiedNHjbRc();
        }
        return Size.m10501constructorimpl((Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jM10519getZeroNHjbRc >> 32)), Float.intBitsToFloat((int) (jM10519getZeroNHjbRc2 >> 32)))) << 32) | (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jM10519getZeroNHjbRc & 4294967295L)), Float.intBitsToFloat((int) (jM10519getZeroNHjbRc2 & 4294967295L)))) & 4294967295L));
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        if (!this.f1838a) {
            throw null;
        }
    }
}

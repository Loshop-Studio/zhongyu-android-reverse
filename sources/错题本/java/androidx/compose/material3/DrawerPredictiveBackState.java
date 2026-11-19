package androidx.compose.material3;

import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0003R+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006#"}, m5110d2 = {"Landroidx/compose/material3/DrawerPredictiveBackState;", "", "<init>", "()V", "", "progress", "", "swipeEdgeLeft", "isRtl", "maxScaleXDistanceGrow", "maxScaleXDistanceShrink", "maxScaleYDistance", "Ld6/s;", "update", "(FZZFFF)V", "clear", "<set-?>", "swipeEdgeMatchesDrawer$delegate", "Landroidx/compose/runtime/MutableState;", "getSwipeEdgeMatchesDrawer", "()Z", "setSwipeEdgeMatchesDrawer", "(Z)V", "swipeEdgeMatchesDrawer", "scaleXDistance$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getScaleXDistance", "()F", "setScaleXDistance", "(F)V", "scaleXDistance", "scaleYDistance$delegate", "getScaleYDistance", "setScaleYDistance", "scaleYDistance", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1167:1\n81#2:1168\n107#2,2:1169\n76#3:1171\n109#3,2:1172\n76#3:1174\n109#3,2:1175\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n*L\n1051#1:1168\n1051#1:1169,2\n1053#1:1171\n1053#1:1172,2\n1055#1:1174\n1055#1:1175,2\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;

    /* renamed from: swipeEdgeMatchesDrawer$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState swipeEdgeMatchesDrawer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* renamed from: scaleXDistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState scaleXDistance = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: scaleYDistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState scaleYDistance = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }

    public final float getScaleXDistance() {
        return this.scaleXDistance.getFloatValue();
    }

    public final float getScaleYDistance() {
        return this.scaleYDistance.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean) this.swipeEdgeMatchesDrawer.getValue()).booleanValue();
    }

    public final void setScaleXDistance(float f) {
        this.scaleXDistance.setFloatValue(f);
    }

    public final void setScaleYDistance(float f) {
        this.scaleYDistance.setFloatValue(f);
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z8) {
        this.swipeEdgeMatchesDrawer.setValue(Boolean.valueOf(z8));
    }

    public final void update(float progress, boolean swipeEdgeLeft, boolean isRtl, float maxScaleXDistanceGrow, float maxScaleXDistanceShrink, float maxScaleYDistance) {
        setSwipeEdgeMatchesDrawer(swipeEdgeLeft != isRtl);
        if (!getSwipeEdgeMatchesDrawer()) {
            maxScaleXDistanceGrow = maxScaleXDistanceShrink;
        }
        setScaleXDistance(MathHelpersKt.lerp(0.0f, maxScaleXDistanceGrow, progress));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, maxScaleYDistance, progress));
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.ConstraintsKt;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u0011X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7880d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$annotations", "()V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/Constraints;", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "J", "convertDimension", "", "value", "", "getKeyId", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "getKeyId$constraintlayout_compose_release", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2303:1\n1#2:2304\n288#3,2:2305\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/State\n*L\n1584#1:2305,2\n*E\n"})
/* loaded from: classes2.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;
    private final Density density;
    private long rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    public State(Density density) {
        this.density = density;
        setDpToPixel(new CorePixelDp() { // from class: androidx.constraintlayout.compose.c
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f6) {
                return State._init_$lambda$0(this.f347a, f6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$0(State state, float f6) {
        return state.density.getDensity() * f6;
    }

    @Deprecated(message = "Use #isLtr instead")
    public static /* synthetic */ void getLayoutDirection$annotations() {
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(Object value) {
        return value instanceof C2452Dp ? this.density.mo10249roundToPx0680j_4(((C2452Dp) value).m16498unboximpl()) : super.convertDimension(value);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final Object getKeyId$constraintlayout_compose_release(HelperWidget helperWidget) {
        Object next;
        Iterator<T> it = this.mHelperReferences.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((HelperReference) ((Map.Entry) next).getValue()).getHelperWidget(), helperWidget)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m16953setRootIncomingConstraintsBRTryo0(long j6) {
        this.rootIncomingConstraints = j6;
    }
}

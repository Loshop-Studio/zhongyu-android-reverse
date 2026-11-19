package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m5110d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n150#2,3:66\n34#2,6:69\n153#2:75\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n49#1:66,3\n49#1:69,6\n49#1:75\n*E\n"})
/* loaded from: classes2.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;

    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m13260getMinWidthimpl(j7), Constraints.m13259getMinHeightimpl(j7), null, new InterfaceC6471c() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        if (size == 1) {
            final Placeable placeableMo12033measureBRTryo0 = list.get(0).mo12033measureBRTryo0(j7);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m13275constrainWidthK40F9xA(j7, placeableMo12033measureBRTryo0.getWidth()), ConstraintsKt.m13274constrainHeightK40F9xA(j7, placeableMo12033measureBRTryo0.getHeight()), null, new InterfaceC6471c() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, (InterfaceC6471c) null, 12, (Object) null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            Placeable placeableMo12033measureBRTryo02 = list.get(i).mo12033measureBRTryo0(j7);
            iMax = Math.max(placeableMo12033measureBRTryo02.getWidth(), iMax);
            iMax2 = Math.max(placeableMo12033measureBRTryo02.getHeight(), iMax2);
            arrayList.add(placeableMo12033measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m13275constrainWidthK40F9xA(j7, iMax), ConstraintsKt.m13274constrainHeightK40F9xA(j7, iMax2), null, new InterfaceC6471c() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                List<Placeable> list2 = arrayList;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i8), 0, 0, 0.0f, (InterfaceC6471c) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }
}

package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0005"}, m5175d2 = {"onGloballyPositioned", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOnGloballyPositionedModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,92:1\n135#2:93\n*S KotlinDebug\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n47#1:93\n*E\n"})
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    @Stable
    public static final Modifier onGloballyPositioned(Modifier modifier, final Function1<? super LayoutCoordinates, Unit> onGloballyPositioned) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        return modifier.then(new OnGloballyPositionedModifierImpl(onGloballyPositioned, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.OnGloballyPositionedModifierKt$onGloballyPositioned$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("onGloballyPositioned");
                inspectorInfo.getProperties().set("onGloballyPositioned", onGloballyPositioned);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}

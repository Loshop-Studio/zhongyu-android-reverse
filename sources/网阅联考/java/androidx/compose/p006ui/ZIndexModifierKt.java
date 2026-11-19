package androidx.compose.p006ui;

import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, m5175d2 = {"zIndex", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nZIndexModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n*S KotlinDebug\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n45#1:77\n*E\n"})
/* loaded from: classes.dex */
public final class ZIndexModifierKt {
    @Stable
    public static final Modifier zIndex(Modifier modifier, final float f4) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new ZIndexModifier(f4, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("zIndex");
                inspectorInfo.setValue(Float.valueOf(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}

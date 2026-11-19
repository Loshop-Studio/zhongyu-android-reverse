package androidx.compose.p011ui.spatial;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ld6/s;", "RectListDebugger", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRectListDebugger.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebugger_androidKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,92:1\n121#2,6:93\n128#2,4:108\n132#2:118\n134#2:121\n272#3,9:99\n281#3,2:119\n4206#4,6:112\n*S KotlinDebug\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebugger_androidKt\n*L\n40#1:93,6\n40#1:108,4\n40#1:118\n40#1:121\n40#1:99,9\n40#1:119,2\n40#1:112,6\n*E\n"})
/* loaded from: classes2.dex */
public final class RectListDebugger_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RectListDebugger(@Nullable final Modifier modifier, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(949081399);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949081399, i9, -1, "androidx.compose.ui.spatial.RectListDebugger (RectListDebugger.android.kt:38)");
            }
            Modifier modifierThen = modifier.then(RectListDebuggerModifierElement.INSTANCE);
            EmptyFillMeasurePolicy emptyFillMeasurePolicy = EmptyFillMeasurePolicy.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            Updater.m10116setimpl(composerM10109constructorimpl, emptyFillMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10116setimpl(composerM10109constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            InterfaceC6473e setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.ui.spatial.RectListDebugger_androidKt.RectListDebugger.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i11) {
                    RectListDebugger_androidKt.RectListDebugger(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }
}

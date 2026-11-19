package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.LayoutModifierKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008d\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u001a\u001aD\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aD\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010 \u001a5\u0010$\u001a\u00020\u00042\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'*\u00020&H\u0003¢\u0006\u0004\b)\u0010*\u001a)\u0010,\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b,\u0010-\"\u0014\u0010/\u001a\u00020.8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, m5110d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "", "checked", "Lkotlin/Function1;", "Ld6/s;", "onCheckedChange", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "icon", "label", "SegmentedButton", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLr6/c;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLr6/a;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "space", "Lkotlin/ExtensionFunctionType;", "content", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLr6/f;Landroidx/compose/runtime/Composer;II)V", "SingleChoiceSegmentedButtonRow", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "MultiChoiceSegmentedButtonRow", "SegmentedButtonContent", "(Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "", "interactionCountAsState", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionCount", "interactionZIndex", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "", "CheckedZIndexFactor", "F", "IconSpacing", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,774:1\n1223#2,6:775\n1223#2,6:781\n1223#2,6:820\n1223#2,6:863\n1223#2,6:912\n1223#2,6:918\n62#3:787\n62#3:830\n98#4,3:788\n101#4:819\n105#4:829\n98#4,3:831\n101#4:862\n105#4:872\n78#5,6:791\n85#5,4:806\n89#5,2:816\n93#5:828\n78#5,6:834\n85#5,4:849\n89#5,2:859\n93#5:871\n78#5,6:879\n85#5,4:894\n89#5,2:904\n93#5:910\n368#6,9:797\n377#6:818\n378#6,2:826\n368#6,9:840\n377#6:861\n378#6,2:869\n368#6,9:885\n377#6:906\n378#6,2:908\n4032#7,6:810\n4032#7,6:853\n4032#7,6:898\n71#8:873\n69#8,5:874\n74#8:907\n78#8:911\n148#9:924\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n142#1:775,6\n220#1:781,6\n279#1:820,6\n316#1:863,6\n398#1:912,6\n399#1:918,6\n276#1:787\n313#1:830\n270#1:788,3\n270#1:819\n270#1:829\n308#1:831,3\n308#1:862\n308#1:872\n270#1:791,6\n270#1:806,4\n270#1:816,2\n270#1:828\n308#1:834,6\n308#1:849,4\n308#1:859,2\n308#1:871\n326#1:879,6\n326#1:894,4\n326#1:904,2\n326#1:910\n270#1:797,9\n270#1:818\n270#1:826,2\n308#1:840,9\n308#1:861\n308#1:869,2\n326#1:885,9\n326#1:906\n326#1:908,2\n270#1:810,6\n308#1:853,6\n326#1:898,6\n326#1:873\n326#1:874,5\n326#1:907\n326#1:911\n767#1:924\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = C2331Dp.m13305constructorimpl(8);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m8862MultiChoiceSegmentedButtonRowuFdPcIQ(@Nullable Modifier modifier, float f, @NotNull final InterfaceC6474f interfaceC6474f, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(155922315);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i11 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m8860getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155922315, i9, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:306)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m7294defaultMinSizeVpY3zN4$default(modifier, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m9775getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(-f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            interfaceC6474f.invoke((MultiChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i9 >> 3) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f7 = f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    SegmentedButtonKt.m8862MultiChoiceSegmentedButtonRowuFdPcIQ(modifier2, f7, interfaceC6474f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedButton(@org.jetbrains.annotations.NotNull final androidx.compose.material3.MultiChoiceSegmentedButtonRowScope r27, final boolean r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r29, @org.jetbrains.annotations.NotNull final androidx.compose.p011ui.graphics.Shape r30, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, boolean r32, @org.jetbrains.annotations.Nullable androidx.compose.material3.SegmentedButtonColors r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonKt.SegmentedButton(androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, boolean, r6.c, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SegmentedButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, r6.e, r6.e, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void SegmentedButtonContent(final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1464121570);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6473e) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464121570, i8, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:324)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1420592651, true, new InterfaceC6473e() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1420592651, i9, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:331)");
                    }
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new SegmentedButtonContentMeasurePolicy(coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) objRememberedValue2;
                    Modifier modifierHeight = IntrinsicKt.height(Modifier.INSTANCE, IntrinsicSize.Min);
                    InterfaceC6473e interfaceC6473eCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(AbstractC5806u.m5287z(interfaceC6473e, interfaceC6473e2));
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(segmentedButtonContentMeasurePolicy);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierHeight);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    interfaceC6473eCombineAsVirtualLayouts.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButtonContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    SegmentedButtonKt.SegmentedButtonContent(interfaceC6473e, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m8863SingleChoiceSegmentedButtonRowuFdPcIQ(@Nullable Modifier modifier, float f, @NotNull final InterfaceC6474f interfaceC6474f, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520863498);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i11 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m8860getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520863498, i9, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:268)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m7294defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m9775getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(-f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWidth);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            interfaceC6474f.invoke((SingleChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i9 >> 3) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f7 = f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    SegmentedButtonKt.m8863SingleChoiceSegmentedButtonRowuFdPcIQ(modifier2, f7, interfaceC6474f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    @Composable
    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:396)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        int i8 = i & 14;
        boolean z8 = ((i8 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z8 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC6473e) objRememberedValue2, composer, i8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, final boolean z8, final State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new InterfaceC6474f() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m8864invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
            }

            @NotNull
            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m8864invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
                int width = placeableMo12033measureBRTryo0.getWidth();
                int height = placeableMo12033measureBRTryo0.getHeight();
                final State<Integer> state2 = state;
                final boolean z9 = z8;
                return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                        placementScope.place(placeableMo12033measureBRTryo0, 0, 0, state2.getValue().floatValue() + (z9 ? SegmentedButtonKt.CheckedZIndexFactor : 0.0f));
                    }
                }, 4, null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedButton(@org.jetbrains.annotations.NotNull final androidx.compose.material3.SingleChoiceSegmentedButtonRowScope r27, final boolean r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r29, @org.jetbrains.annotations.NotNull final androidx.compose.p011ui.graphics.Shape r30, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r31, boolean r32, @org.jetbrains.annotations.Nullable androidx.compose.material3.SegmentedButtonColors r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonKt.SegmentedButton(androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, boolean, r6.a, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SegmentedButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, r6.e, r6.e, androidx.compose.runtime.Composer, int, int, int):void");
    }
}

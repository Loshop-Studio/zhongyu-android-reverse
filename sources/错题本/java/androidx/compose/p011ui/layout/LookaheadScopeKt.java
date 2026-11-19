package androidx.compose.p011ui.layout;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.UiComposable;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a2\u0010\u0007\u001a\u00020\u00022!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a§\u0001\u0010\u001d\u001a\u00020\t*\u00020\t2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u00002.\b\u0002\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0002\b\u00052A\u0010\u001c\u001a=\u0012\u0004\u0012\u00020\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u001d\u0010\u001e\u001a6\u0010&\u001a\u00020!*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\":\u0010'\u001a(\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "content", "LookaheadScope", "(Lr6/f;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "lookaheadSize", "", "isMeasurementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "isPlacementApproachInProgress", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "approachLayout", "(Landroidx/compose/ui/Modifier;Lr6/c;Lr6/e;Lr6/f;)Landroidx/compose/ui/Modifier;", "coordinates", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-Fgt4K4Q", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "defaultPlacementApproachInProgress", "Lr6/e;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,280:1\n1247#2,6:281\n347#3,12:287\n150#4:299\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n50#1:281,6\n51#1:287,12\n252#1:299\n*E\n"})
/* loaded from: classes2.dex */
public final class LookaheadScopeKt {

    @NotNull
    private static final InterfaceC6473e defaultPlacementApproachInProgress = new InterfaceC6473e() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // p152r6.InterfaceC6473e
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return Boolean.FALSE;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @UiComposable
    public static final void LookaheadScope(@NotNull final InterfaceC6474f interfaceC6474f, @Nullable Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6474f) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        int i9 = 1;
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i8, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LookaheadScopeImpl(null, i9, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) objRememberedValue;
            C21641 c21641 = new InterfaceC6469a() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.1
                @Override // p152r6.InterfaceC6469a
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 0, 2, null);
                }
            };
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(c21641);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            Updater.m10113initimpl(composerM10109constructorimpl, new InterfaceC6471c() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui_release(true);
                }
            });
            Updater.m10116setimpl(composerM10109constructorimpl, lookaheadScopeImpl, new InterfaceC6473e() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (LookaheadScopeImpl) obj2);
                    return C5443s.f8405a;
                }

                public final void invoke(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    lookaheadScopeImpl2.setScopeCoordinates(new InterfaceC6469a() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // p152r6.InterfaceC6469a
                        public final LayoutCoordinates invoke() {
                            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                            AbstractC5830k.m5327d(parent$ui_release);
                            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                        }
                    });
                }
            });
            interfaceC6474f.invoke(lookaheadScopeImpl, composerStartRestartGroup, Integer.valueOf((i8 << 3) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i10) {
                    LookaheadScopeKt.LookaheadScope(interfaceC6474f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @NotNull
    public static final Modifier approachLayout(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new ApproachLayoutElement(interfaceC6474f, interfaceC6471c, interfaceC6473e));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6473e = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, interfaceC6471c, interfaceC6473e, interfaceC6474f);
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m12062localLookaheadPositionOfFgt4K4Q(@NotNull LookaheadScope lookaheadScope, @NotNull LayoutCoordinates layoutCoordinates, @NotNull LayoutCoordinates layoutCoordinates2, long j7, boolean z8) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        return lookaheadCoordinates instanceof LookaheadLayoutCoordinates ? lookaheadCoordinates.mo12043localPositionOfS_NoaFU(lookaheadCoordinates2, j7, z8) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? Offset.m10433constructorimpl(lookaheadCoordinates2.mo12043localPositionOfS_NoaFU(lookaheadCoordinates, j7, z8) ^ (-9223372034707292160L)) : lookaheadCoordinates.mo12043localPositionOfS_NoaFU(lookaheadCoordinates, j7, z8);
    }
}

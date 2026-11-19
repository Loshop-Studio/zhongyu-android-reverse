package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float ContainerMaxWidth = C3186Dp.m33501constructorimpl(600);
    private static final float HeightToFirstLine = C3186Dp.m33501constructorimpl(30);
    private static final float HorizontalSpacing = C3186Dp.m33501constructorimpl(16);
    private static final float SeparateButtonExtraY = C3186Dp.m33501constructorimpl(2);
    private static final float SnackbarVerticalPadding = C3186Dp.m33501constructorimpl(6);
    private static final float LongButtonVerticalOffset = C3186Dp.m33501constructorimpl(12);

    static {
        float f10 = 8;
        HorizontalSpacingButtonSide = C3186Dp.m33501constructorimpl(f10);
        TextEndExtraSpacing = C3186Dp.m33501constructorimpl(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m29132NewLineButtonSnackbarkKq0p4A(final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final TextStyle textStyle, final long j10, final long j11, Composer composer, final int i10) {
        int i11;
        ?? r12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i11, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m27512widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            int i12 = i11;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM27313paddingFromBaselineVpY3zN4 = AlignmentLineKt.m27313paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float fM33501constructorimpl = HorizontalSpacingButtonSide;
            Modifier modifierM27462paddingqDBjuR0$default2 = PaddingKt.m27462paddingqDBjuR0$default(modifierM27313paddingFromBaselineVpY3zN4, 0.0f, 0.0f, fM33501constructorimpl, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default2);
            InterfaceC9529a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierAlign = columnScopeInstance.align(companion, companion2.getEnd());
            if (interfaceC9544p3 == null) {
                r12 = 0;
            } else {
                r12 = 0;
                fM33501constructorimpl = C3186Dp.m33501constructorimpl(0);
            }
            Modifier modifierM27462paddingqDBjuR0$default3 = PaddingKt.m27462paddingqDBjuR0$default(modifierAlign, 0.0f, 0.0f, fM33501constructorimpl, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r12);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default3);
            InterfaceC9529a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            InterfaceC9529a constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j10)), TextKt.getLocalTextStyle().provides(textStyle)};
            int i13 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, interfaceC9544p2, composerStartRestartGroup, (i12 & 112) | i13);
            composerStartRestartGroup.startReplaceGroup(618603253);
            if (interfaceC9544p3 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j11)), interfaceC9544p3, composerStartRestartGroup, i13 | ((i12 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SnackbarKt.m29132NewLineButtonSnackbarkKq0p4A(interfaceC9544p, interfaceC9544p2, interfaceC9544p3, textStyle, j10, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m29133OneRowSnackbarkKq0p4A(final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final TextStyle textStyle, final long j10, final long j11, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i11, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, interfaceC9544p3 == null ? HorizontalSpacingButtonSide : C3186Dp.m33501constructorimpl(0), 0.0f, 10, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            final String str = "text";
            int i12 = i11;
            final String str2 = "action";
            final String str3 = "dismissAction";
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[PHI: r0 r4
                      0x0125: PHI (r0v11 int) = (r0v10 int), (r0v17 int), (r0v17 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]
                      0x0125: PHI (r4v4 int) = (r4v3 int), (r4v12 int), (r4v12 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final androidx.compose.p014ui.layout.MeasureResult mo26741measure3p2s80s(androidx.compose.p014ui.layout.MeasureScope r22, java.util.List<? extends androidx.compose.p014ui.layout.Measurable> r23, long r24) {
                        /*
                            Method dump skipped, instructions count: 395
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.mo26741measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier modifierM27460paddingVpY3zN4$default = PaddingKt.m27460paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27460paddingVpY3zN4$default);
            InterfaceC9529a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-904778058);
            if (interfaceC9544p2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "action");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                InterfaceC9529a constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j10)), TextKt.getLocalTextStyle().provides(textStyle)}, interfaceC9544p2, composerStartRestartGroup, ProvidedValue.$stable | (i12 & 112));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-904766579);
            if (interfaceC9544p3 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
                InterfaceC9529a constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(j11)), interfaceC9544p3, composerStartRestartGroup, ProvidedValue.$stable | ((i12 >> 3) & 112));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    SnackbarKt.m29133OneRowSnackbarkKq0p4A(interfaceC9544p, interfaceC9544p2, interfaceC9544p3, textStyle, j10, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29134SnackbareQBnUkQ(androidx.compose.p014ui.Modifier r24, p181hd.InterfaceC9544p r25, p181hd.InterfaceC9544p r26, boolean r27, androidx.compose.p014ui.graphics.Shape r28, long r29, long r31, long r33, long r35, final p181hd.InterfaceC9544p r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m29134SnackbareQBnUkQ(androidx.compose.ui.Modifier, hd.p, hd.p, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29135SnackbarsDKtq54(final androidx.compose.material3.SnackbarData r34, androidx.compose.p014ui.Modifier r35, boolean r36, androidx.compose.p014ui.graphics.Shape r37, long r38, long r40, long r42, long r44, long r46, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m29135SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }
}

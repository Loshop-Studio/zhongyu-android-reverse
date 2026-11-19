package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.colorspace.ColorSpace;
import androidx.compose.p014ui.layout.AlignmentLineKt;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnitKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m30074getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = C3186Dp.m33501constructorimpl(72);
    private static final float HorizontalTextPadding = C3186Dp.m33501constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = C3186Dp.m33501constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = C3186Dp.m33501constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = C3186Dp.m33501constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29185LeadingIconTabwqdebIU(final boolean r20, final p181hd.InterfaceC9529a r21, final p181hd.InterfaceC9544p r22, final p181hd.InterfaceC9544p r23, androidx.compose.p014ui.Modifier r24, boolean r25, long r26, long r28, androidx.compose.foundation.interaction.MutableInteractionSource r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m29185LeadingIconTabwqdebIU(boolean, hd.a, hd.p, hd.p, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29186TabbogVsAg(final boolean r23, final p181hd.InterfaceC9529a r24, androidx.compose.p014ui.Modifier r25, boolean r26, long r27, long r29, androidx.compose.foundation.interaction.MutableInteractionSource r31, final p181hd.InterfaceC9545q r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m29186TabbogVsAg(boolean, hd.a, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29187TabwqdebIU(final boolean r27, final p181hd.InterfaceC9529a r28, androidx.compose.p014ui.Modifier r29, boolean r30, p181hd.InterfaceC9544p r31, p181hd.InterfaceC9544p r32, long r33, long r35, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m29187TabwqdebIU(boolean, hd.a, androidx.compose.ui.Modifier, boolean, hd.p, hd.p, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(514131524);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9544p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i11, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            int i12 = i11 & 14;
            boolean z10 = (i12 == 4) | ((i11 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        Placeable placeableMo32229measureBRTryo0;
                        Placeable placeableMo32229measureBRTryo02;
                        if (interfaceC9544p != null) {
                            int size = list.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                Measurable measurable = list.get(i13);
                                if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo32229measureBRTryo0 = null;
                        if (interfaceC9544p2 != null) {
                            int size2 = list.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                Measurable measurable2 = list.get(i14);
                                if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(j10);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo32229measureBRTryo02 = null;
                        final int iMax = Math.max(placeableMo32229measureBRTryo0 != null ? placeableMo32229measureBRTryo0.getWidth() : 0, placeableMo32229measureBRTryo02 != null ? placeableMo32229measureBRTryo02.getWidth() : 0);
                        final int iMax2 = Math.max(measureScope.mo27093roundToPx0680j_4((placeableMo32229measureBRTryo0 == null || placeableMo32229measureBRTryo02 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight), (placeableMo32229measureBRTryo02 != null ? placeableMo32229measureBRTryo02.getHeight() : 0) + (placeableMo32229measureBRTryo0 != null ? placeableMo32229measureBRTryo0.getHeight() : 0) + measureScope.mo27092roundToPxR2X_6o(TabKt.IconDistanceFromBaseline));
                        final Integer numValueOf = placeableMo32229measureBRTryo0 != null ? Integer.valueOf(placeableMo32229measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null;
                        final Integer numValueOf2 = placeableMo32229measureBRTryo0 != null ? Integer.valueOf(placeableMo32229measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null;
                        final Placeable placeable = placeableMo32229measureBRTryo0;
                        final Placeable placeable2 = placeableMo32229measureBRTryo02;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC9540l() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Placeable placeable3;
                                Placeable placeable4 = placeable;
                                if (placeable4 == null || (placeable3 = placeable2) == null) {
                                    if (placeable4 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable4, iMax2);
                                        return;
                                    }
                                    Placeable placeable5 = placeable2;
                                    if (placeable5 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable5, iMax2);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i15 = iMax;
                                int i16 = iMax2;
                                Integer num = numValueOf;
                                AbstractC9979u.m20291d(num);
                                int iIntValue = num.intValue();
                                Integer num2 = numValueOf2;
                                AbstractC9979u.m20291d(num2);
                                TabKt.placeTextAndIcon(placementScope, measureScope2, placeable4, placeable3, i15, i16, iIntValue, num2.intValue());
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            composerStartRestartGroup.startReplaceGroup(871566271);
            if (interfaceC9544p != null) {
                Modifier modifierM27460paddingVpY3zN4$default = PaddingKt.m27460paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf(i12));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(871570579);
            if (interfaceC9544p2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                interfaceC9544p2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TabKt.TabBaselineLayout.3
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
                    TabKt.TabBaselineLayout(interfaceC9544p, interfaceC9544p2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m29188TabTransitionKlgxPg(final long j10, final long j11, boolean z10, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        final boolean z11;
        TwoWayConverter twoWayConverter;
        Composer composerStartRestartGroup = composer.startRestartGroup(735731848);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i11, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            int i12 = i11 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z11), (String) null, composerStartRestartGroup, i12 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new InterfaceC9545q() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @Override // p181hd.InterfaceC9545q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-899623535);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-899623535, i13, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
                    }
                    TweenSpec tweenSpecTween = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween;
                }
            };
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j12 = zBooleanValue ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM30882getColorSpaceimpl = Color.m30882getColorSpaceimpl(j12);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM30882getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM30882getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM30868boximpl = Color.m30868boximpl(j13);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                twoWayConverter = twoWayConverter2;
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            } else {
                twoWayConverter = twoWayConverter2;
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m30868boximpl(TabTransition_Klgx_Pg$lambda$2(TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM30868boximpl, Color.m30868boximpl(j14), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke((Object) transitionUpdateTransition.getSegment(), (Object) composerStartRestartGroup, (Object) 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0)))), interfaceC9544p, composerStartRestartGroup, (i12 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.TabKt$TabTransition$1
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
                    TabKt.m29188TabTransitionKlgxPg(j10, j11, z11, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m30888unboximpl();
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i10, int i11, int i12, int i13) {
        int iMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(i12 == i13 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon) + density.mo27093roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m30072getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo27092roundToPxR2X_6o(IconDistanceFromBaseline)) - i12;
        int i14 = (i11 - i13) - iMo27093roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i10 - placeable.getWidth()) / 2, i14, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i10 - placeable2.getWidth()) / 2, i14 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i10) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i10 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}

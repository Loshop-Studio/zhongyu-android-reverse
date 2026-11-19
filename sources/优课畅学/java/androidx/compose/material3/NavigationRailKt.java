package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailHeaderPadding = C3156Dp.m26899constructorimpl(8);
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth;
    private static final float NavigationRailVerticalPadding;

    static {
        float f10 = 4;
        NavigationRailVerticalPadding = C3156Dp.m26899constructorimpl(f10);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemWidth = navigationRailTokens.m23344getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = navigationRailTokens.m23347getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = C3156Dp.m26899constructorimpl(f10);
        float f11 = 2;
        IndicatorHorizontalPadding = C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(navigationRailTokens.m23342getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m23345getIconSizeD9Ej5fM()) / f11);
        IndicatorVerticalPaddingWithLabel = C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(navigationRailTokens.m23341getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m23345getIconSizeD9Ej5fM()) / f11);
        IndicatorVerticalPaddingNoLabel = C3156Dp.m26899constructorimpl(C3156Dp.m26899constructorimpl(navigationRailTokens.m23347getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m23345getIconSizeD9Ej5fM()) / f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22335NavigationRailqi6gXK8(androidx.compose.p013ui.Modifier r23, long r24, long r26, p300x7.InterfaceC10575q r28, androidx.compose.foundation.layout.WindowInsets r29, final p300x7.InterfaceC10575q r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m22335NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, x7.q, androidx.compose.foundation.layout.WindowInsets, x7.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationRailItem(final boolean r25, final p300x7.InterfaceC10559a r26, final p300x7.InterfaceC10574p r27, androidx.compose.p013ui.Modifier r28, boolean r29, p300x7.InterfaceC10574p r30, boolean r31, androidx.compose.material3.NavigationRailItemColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, x7.a, x7.p, androidx.compose.ui.Modifier, boolean, x7.p, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemLayout(final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, final InterfaceC10574p interfaceC10574p3, final InterfaceC10574p interfaceC10574p4, final boolean z10, final InterfaceC10559a interfaceC10559a, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1498399348);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC10574p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p4) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10559a) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498399348, i11, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
            }
            int i12 = 458752 & i11;
            int i13 = 57344 & i11;
            boolean z11 = ((i11 & 7168) == 2048) | (i12 == 131072) | (i13 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$2$1
                    @Override // androidx.compose.p013ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        Measurable measurable;
                        Placeable placeableMo25627measureBRTryo0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = ((Number) interfaceC10559a.invoke()).floatValue();
                        long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Measurable measurable2 = list.get(i14);
                            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable placeableMo25627measureBRTryo02 = measurable2.mo25627measureBRTryo0(jM26842copyZbe2FdA$default);
                                float f10 = 2;
                                int width = placeableMo25627measureBRTryo02.getWidth() + measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl(NavigationRailKt.IndicatorHorizontalPadding * f10));
                                int iM20035d = AbstractC10729c.m20035d(width * fFloatValue);
                                int height = placeableMo25627measureBRTryo02.getHeight() + measureScope2.mo20491roundToPx0680j_4(C3156Dp.m26899constructorimpl((interfaceC10574p4 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * f10));
                                int size2 = list.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Measurable measurable3 = list.get(i15);
                                    if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo25627measureBRTryo03 = measurable3.mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(width, height));
                                        int size3 = list.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i16);
                                            if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i16++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo25627measureBRTryo04 = measurable4 != null ? measurable4.mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(iM20035d, height)) : null;
                                        if (interfaceC10574p4 != null) {
                                            int size4 = list.size();
                                            for (int i17 = 0; i17 < size4; i17++) {
                                                Measurable measurable5 = list.get(i17);
                                                if (AbstractC9133u.m16128b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeableMo25627measureBRTryo0 = measurable5.mo25627measureBRTryo0(jM26842copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo25627measureBRTryo0 = null;
                                        if (interfaceC10574p4 == null) {
                                            return NavigationRailKt.m22338placeIconX9ElhV4(measureScope2, placeableMo25627measureBRTryo02, placeableMo25627measureBRTryo03, placeableMo25627measureBRTryo04, j10);
                                        }
                                        AbstractC9133u.m16130d(placeableMo25627measureBRTryo0);
                                        return NavigationRailKt.m22339placeLabelAndIconzUg2_y0(measureScope, placeableMo25627measureBRTryo0, placeableMo25627measureBRTryo02, placeableMo25627measureBRTryo03, placeableMo25627measureBRTryo04, j10, z10, fFloatValue);
                                    }
                                    i15++;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i14++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            InterfaceC10559a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            interfaceC10574p.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            interfaceC10574p2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC10559a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC10574p3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(2145400941);
            if (interfaceC10574p4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z12 = (i13 == 16384) | (i12 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new InterfaceC10570l() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((GraphicsLayerScope) obj);
                            return C8736p.f16368a;
                        }

                        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z10 ? 1.0f : ((Number) interfaceC10559a.invoke()).floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId2, (InterfaceC10570l) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
                InterfaceC10559a constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM23703constructorimpl3 = Updater.m23703constructorimpl(composerStartRestartGroup);
                Updater.m23710setimpl(composerM23703constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m23710setimpl(composerM23703constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                InterfaceC10574p setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM23703constructorimpl3.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM23703constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM23703constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m23710setimpl(composerM23703constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                interfaceC10574p4.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 9) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.NavigationRailKt.NavigationRailItemLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i14) {
                    NavigationRailKt.NavigationRailItemLayout(interfaceC10574p, interfaceC10574p2, interfaceC10574p3, interfaceC10574p4, z10, interfaceC10559a, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m22338placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j10) {
        final int iM26869constrainWidthK40F9xA = ConstraintsKt.m26869constrainWidthK40F9xA(j10, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        final int iM26868constrainHeightK40F9xA = ConstraintsKt.m26868constrainHeightK40F9xA(j10, measureScope.mo20491roundToPx0680j_4(NavigationRailItemHeight));
        final int width = (iM26869constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height = (iM26868constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM26869constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int height2 = (iM26868constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM26869constrainWidthK40F9xA, iM26868constrainHeightK40F9xA, null, new InterfaceC10570l() { // from class: androidx.compose.material3.NavigationRailKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (iM26869constrainWidthK40F9xA - placeable4.getWidth()) / 2, (iM26868constrainHeightK40F9xA - placeable4.getHeight()) / 2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m22339placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, final boolean z10, final float f10) {
        float height = placeable2.getHeight();
        float f11 = IndicatorVerticalPaddingWithLabel;
        float fMo20497toPx0680j_4 = height + measureScope.mo20497toPx0680j_4(f11);
        float f12 = NavigationRailItemVerticalPadding;
        float fMo20497toPx0680j_42 = fMo20497toPx0680j_4 + measureScope.mo20497toPx0680j_4(f12) + placeable.getHeight();
        float f13 = 2;
        final float fM13509d = AbstractC8323h.m13509d((Constraints.m26853getMinHeightimpl(j10) - fMo20497toPx0680j_42) / f13, measureScope.mo20497toPx0680j_4(f11));
        float f14 = fMo20497toPx0680j_42 + (fM13509d * f13);
        final float height2 = ((z10 ? fM13509d : (f14 - placeable2.getHeight()) / f13) - fM13509d) * (1 - f10);
        final float height3 = placeable2.getHeight() + fM13509d + measureScope.mo20497toPx0680j_4(f11) + measureScope.mo20497toPx0680j_4(f12);
        final int iM26869constrainWidthK40F9xA = ConstraintsKt.m26869constrainWidthK40F9xA(j10, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        final int width = (iM26869constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int width2 = (iM26869constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int width3 = (iM26869constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final float fMo20497toPx0680j_43 = fM13509d - measureScope.mo20497toPx0680j_4(f11);
        return MeasureScope.layout$default(measureScope, iM26869constrainWidthK40F9xA, AbstractC10729c.m20035d(f14), null, new InterfaceC10570l() { // from class: androidx.compose.material3.NavigationRailKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i10 = iM26869constrainWidthK40F9xA;
                    float f15 = fM13509d;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, (i10 - placeable5.getWidth()) / 2, AbstractC10729c.m20035d((f15 - measureScope2.mo20497toPx0680j_4(NavigationRailKt.IndicatorVerticalPaddingWithLabel)) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z10 || f10 != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, AbstractC10729c.m20035d(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, width2, AbstractC10729c.m20035d(fM13509d + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, width3, AbstractC10729c.m20035d(fMo20497toPx0680j_43 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarIndicatorToLabelPadding;
    private static final float NavigationBarItemHorizontalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m29935getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = C3186Dp.m33501constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = C3186Dp.m33501constructorimpl(4);
        float f10 = 2;
        IndicatorHorizontalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(navigationBarTokens.m29933getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m29936getIconSizeD9Ej5fM()) / f10);
        IndicatorVerticalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(navigationBarTokens.m29932getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m29936getIconSizeD9Ej5fM()) / f10);
        IndicatorVerticalOffset = C3186Dp.m33501constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28872NavigationBarHsRjFd4(androidx.compose.p014ui.Modifier r23, long r24, long r26, float r28, androidx.compose.foundation.layout.WindowInsets r29, final p181hd.InterfaceC9545q r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m28872NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170 A[PHI: r0 r8 r9 r13 r15 r20
      0x0170: PHI (r0v12 androidx.compose.material3.NavigationBarItemColors) = (r0v8 androidx.compose.material3.NavigationBarItemColors), (r0v16 androidx.compose.material3.NavigationBarItemColors) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r8v5 androidx.compose.ui.Modifier) = (r8v3 androidx.compose.ui.Modifier), (r8v2 androidx.compose.ui.Modifier) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r9v4 boolean) = (r9v2 boolean), (r9v1 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v6 boolean) = (r13v4 boolean), (r13v3 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r15v6 hd.p) = (r15v4 hd.p), (r15v3 hd.p) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r20v8 int) = (r20v6 int), (r20v5 int) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBarItem(final androidx.compose.foundation.layout.RowScope r26, final boolean r27, final p181hd.InterfaceC9529a r28, final p181hd.InterfaceC9544p r29, androidx.compose.p014ui.Modifier r30, boolean r31, p181hd.InterfaceC9544p r32, boolean r33, androidx.compose.material3.NavigationBarItemColors r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, hd.a, hd.p, androidx.compose.ui.Modifier, boolean, hd.p, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItemLayout(final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final InterfaceC9544p interfaceC9544p4, final boolean z10, final InterfaceC9529a interfaceC9529a, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427075886);
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
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427075886, i11, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)");
            }
            int i12 = 458752 & i11;
            int i13 = 57344 & i11;
            boolean z11 = ((i11 & 7168) == 2048) | (i12 == 131072) | (i13 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        Measurable measurable;
                        Placeable placeableMo32229measureBRTryo0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = ((Number) interfaceC9529a.invoke()).floatValue();
                        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Measurable measurable2 = list.get(i14);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(jM33444copyZbe2FdA$default);
                                float f10 = 2;
                                int width = placeableMo32229measureBRTryo02.getWidth() + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f10));
                                int iM19282d = AbstractC9719c.m19282d(width * fFloatValue);
                                int height = placeableMo32229measureBRTryo02.getHeight() + measureScope2.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f10));
                                int size2 = list.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Measurable measurable3 = list.get(i15);
                                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(width, height));
                                        int size3 = list.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i16);
                                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i16++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo32229measureBRTryo04 = measurable4 != null ? measurable4.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(iM19282d, height)) : null;
                                        if (interfaceC9544p4 != null) {
                                            int size4 = list.size();
                                            for (int i17 = 0; i17 < size4; i17++) {
                                                Measurable measurable5 = list.get(i17);
                                                if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeableMo32229measureBRTryo0 = measurable5.mo32229measureBRTryo0(jM33444copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo32229measureBRTryo0 = null;
                                        if (interfaceC9544p4 == null) {
                                            return NavigationBarKt.m28875placeIconX9ElhV4(measureScope2, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo03, placeableMo32229measureBRTryo04, j10);
                                        }
                                        AbstractC9979u.m20291d(placeableMo32229measureBRTryo0);
                                        return NavigationBarKt.m28876placeLabelAndIconzUg2_y0(measureScope, placeableMo32229measureBRTryo0, placeableMo32229measureBRTryo02, placeableMo32229measureBRTryo03, placeableMo32229measureBRTryo04, j10, z10, fFloatValue);
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
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            interfaceC9544p2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            interfaceC9544p3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1087196576);
            if (interfaceC9544p4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z12 = (i13 == 16384) | (i12 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((GraphicsLayerScope) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z10 ? 1.0f : ((Number) interfaceC9529a.invoke()).floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId2, (InterfaceC9540l) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
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
                interfaceC9544p4.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 9) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemLayout.3
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
                    NavigationBarKt.NavigationBarItemLayout(interfaceC9544p, interfaceC9544p2, interfaceC9544p3, interfaceC9544p4, z10, interfaceC9529a, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m28875placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j10) {
        final int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        final int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j10, measureScope.mo27093roundToPx0680j_4(NavigationBarHeight));
        final int width = (iM33454getMaxWidthimpl - placeable.getWidth()) / 2;
        final int height = (iM33470constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM33454getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int height2 = (iM33470constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33470constrainHeightK40F9xA, null, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
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
                Placeable.PlacementScope placementScope2;
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (iM33454getMaxWidthimpl - placeable4.getWidth()) / 2, (iM33470constrainHeightK40F9xA - placeable4.getHeight()) / 2, 0.0f, 4, null);
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
    public static final MeasureResult m28876placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j10, final boolean z10, final float f10) {
        float height = placeable2.getHeight();
        float f11 = IndicatorVerticalPadding;
        float fMo27099toPx0680j_4 = height + measureScope.mo27099toPx0680j_4(f11);
        float f12 = NavigationBarIndicatorToLabelPadding;
        float fMo27099toPx0680j_42 = fMo27099toPx0680j_4 + measureScope.mo27099toPx0680j_4(f12) + placeable.getHeight();
        float f13 = 2;
        final float fM21751d = AbstractC10410o.m21751d((Constraints.m33455getMinHeightimpl(j10) - fMo27099toPx0680j_42) / f13, measureScope.mo27099toPx0680j_4(f11));
        float f14 = fMo27099toPx0680j_42 + (fM21751d * f13);
        final float height2 = ((z10 ? fM21751d : (f14 - placeable2.getHeight()) / f13) - fM21751d) * (1 - f10);
        final float height3 = placeable2.getHeight() + fM21751d + measureScope.mo27099toPx0680j_4(f11) + measureScope.mo27099toPx0680j_4(f12);
        final int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        final int width = (iM33454getMaxWidthimpl - placeable.getWidth()) / 2;
        final int width2 = (iM33454getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int width3 = (iM33454getMaxWidthimpl - placeable3.getWidth()) / 2;
        final float fMo27099toPx0680j_43 = fM21751d - measureScope.mo27099toPx0680j_4(f11);
        return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, AbstractC9719c.m19282d(f14), null, new InterfaceC9540l() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
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
                Placeable.PlacementScope placementScope2;
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i10 = iM33454getMaxWidthimpl;
                    float f15 = fM21751d;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, (i10 - placeable5.getWidth()) / 2, AbstractC9719c.m19282d((f15 - measureScope2.mo27093roundToPx0680j_4(NavigationBarKt.getIndicatorVerticalPadding())) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z10 || f10 != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, AbstractC9719c.m19282d(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, width2, AbstractC9719c.m19282d(fM21751d + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, width3, AbstractC9719c.m19282d(fMo27099toPx0680j_43 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }
}

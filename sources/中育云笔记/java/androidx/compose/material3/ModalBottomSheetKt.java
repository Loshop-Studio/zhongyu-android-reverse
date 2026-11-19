package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOriginKt;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.input.pointer.C2890xe3d9cdbd;
import androidx.compose.p014ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = C3186Dp.m33501constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = C3186Dp.m33501constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28838ModalBottomSheetdYc4hso(final p181hd.InterfaceC9529a r45, androidx.compose.p014ui.Modifier r46, androidx.compose.material3.SheetState r47, float r48, androidx.compose.p014ui.graphics.Shape r49, long r50, long r52, float r54, long r55, p181hd.InterfaceC9544p r57, p181hd.InterfaceC9544p r58, androidx.compose.material3.ModalBottomSheetProperties r59, final p181hd.InterfaceC9545q r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m28838ModalBottomSheetdYc4hso(hd.a, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, hd.p, hd.p, androidx.compose.material3.ModalBottomSheetProperties, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28839ModalBottomSheetContentIQkwcL4(final androidx.compose.foundation.layout.BoxScope r44, final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r45, final sd.InterfaceC11122i0 r46, final p181hd.InterfaceC9529a r47, final p181hd.InterfaceC9540l r48, androidx.compose.p014ui.Modifier r49, androidx.compose.material3.SheetState r50, float r51, androidx.compose.p014ui.graphics.Shape r52, long r53, long r55, float r57, p181hd.InterfaceC9544p r58, p181hd.InterfaceC9544p r59, final p181hd.InterfaceC9545q r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m28839ModalBottomSheetContentIQkwcL4(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, sd.i0, hd.a, hd.l, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, hd.p, hd.p, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m28840Scrim3JVO9M(final long j10, final InterfaceC9529a interfaceC9529a, final boolean z10, Composer composer, final int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(951870469);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i11, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j10 != 16) {
                int i12 = i11;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Strings.Companion companion = Strings.Companion;
                final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2638R.string.close_sheet), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1785653838);
                if (z10) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    int i13 = i12 & 112;
                    boolean z11 = i13 == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(interfaceC9529a, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierThen = companion2.then(new SuspendPointerInputElement(interfaceC9529a, null, null, new C2890xe3d9cdbd((InterfaceC9544p) objRememberedValue), 6, null));
                    boolean zChanged = composerStartRestartGroup.changed(strM29589getString2EP1pXo) | (i13 == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM29589getString2EP1pXo);
                                final InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // p181hd.InterfaceC9529a
                                    public final Boolean invoke() {
                                        interfaceC9529a2.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    modifierSemantics = SemanticsModifierKt.semantics(modifierThen, true, (InterfaceC9540l) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.Companion;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifierSemantics);
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i12 & 14) == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DrawScope) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(DrawScope drawScope) {
                            DrawScope.m31423drawRectnJ9OG0$default(drawScope, j10, 0L, 0L, AbstractC10410o.m21760m(ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(stateAnimateFloatAsState), 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                CanvasKt.Canvas(modifierThen2, (InterfaceC9540l) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
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
                    ModalBottomSheetKt.m28840Scrim3JVO9M(j10, interfaceC9529a, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f10) {
        float fM30706getWidthimpl = Size.m30706getWidthimpl(graphicsLayerScope.mo31064getSizeNHjbRc());
        if (Float.isNaN(fM30706getWidthimpl) || fM30706getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo27099toPx0680j_4(PredictiveBackMaxScaleXDistance), fM30706getWidthimpl), f10) / fM30706getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f10) {
        float fM30703getHeightimpl = Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc());
        if (Float.isNaN(fM30703getHeightimpl) || fM30703getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo27099toPx0680j_4(PredictiveBackMaxScaleYDistance), fM30703getHeightimpl), f10) / fM30703getHeightimpl);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberModalBottomSheetState(boolean z10, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i10, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z11, interfaceC9540l2, SheetValue.Hidden, false, composer, (i10 & 14) | 384 | (i10 & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}

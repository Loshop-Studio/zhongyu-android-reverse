package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = C3186Dp.m33501constructorimpl(280);
    private static final float DialogMaxWidth = C3186Dp.m33501constructorimpl(560);
    private static final float ButtonsMainAxisSpacing = C3186Dp.m33501constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = C3186Dp.m33501constructorimpl(12);

    static {
        float f10 = 24;
        DialogPadding = PaddingKt.m27451PaddingValues0680j_4(C3186Dp.m33501constructorimpl(f10));
        float f11 = 16;
        IconPadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3186Dp.m33501constructorimpl(f11), 7, null);
        TitlePadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3186Dp.m33501constructorimpl(f11), 7, null);
        TextPadding = PaddingKt.m27455PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3186Dp.m33501constructorimpl(f10), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AlertDialog(final p181hd.InterfaceC9529a r17, androidx.compose.p014ui.Modifier r18, androidx.compose.p014ui.window.DialogProperties r19, final p181hd.InterfaceC9544p r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.AlertDialog(hd.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28335AlertDialogContent4hvqGtA(final p181hd.InterfaceC9544p r29, androidx.compose.p014ui.Modifier r30, final p181hd.InterfaceC9544p r31, final p181hd.InterfaceC9544p r32, final p181hd.InterfaceC9544p r33, final androidx.compose.p014ui.graphics.Shape r34, final long r35, final float r37, final long r38, final long r40, final long r42, final long r44, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m28335AlertDialogContent4hvqGtA(hd.p, androidx.compose.ui.Modifier, hd.p, hd.p, hd.p, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m28336AlertDialogFlowRowixp7dh8(final float f10, final float f11, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f12, long j10, Placeable placeable) {
                        return list.isEmpty() || (ref$IntRef.f23400c + measureScope.mo27093roundToPx0680j_4(f12)) + placeable.getWidth() <= Constraints.m33454getMaxWidthimpl(j10);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f12, List<Placeable> list2, List<Integer> list3, Ref$IntRef ref$IntRef2, List<Integer> list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                        if (!list.isEmpty()) {
                            ref$IntRef.f23400c += measureScope.mo27093roundToPx0680j_4(f12);
                        }
                        list.add(0, AbstractC10947g0.m23922X0(list2));
                        list3.add(Integer.valueOf(ref$IntRef2.f23400c));
                        list4.add(Integer.valueOf(ref$IntRef.f23400c));
                        ref$IntRef.f23400c += ref$IntRef2.f23400c;
                        ref$IntRef3.f23400c = Math.max(ref$IntRef3.f23400c, ref$IntRef4.f23400c);
                        list2.clear();
                        ref$IntRef4.f23400c = 0;
                        ref$IntRef2.f23400c = 0;
                    }

                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        float f12 = f10;
                        float f13 = f11;
                        int size = list.size();
                        int i12 = 0;
                        while (i12 < size) {
                            ArrayList arrayList5 = arrayList;
                            Ref$IntRef ref$IntRef5 = ref$IntRef2;
                            Placeable placeableMo32229measureBRTryo0 = list.get(i12).mo32229measureBRTryo0(j10);
                            int i13 = i12;
                            Ref$IntRef ref$IntRef6 = ref$IntRef3;
                            ref$IntRef3 = ref$IntRef6;
                            int i14 = size;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, ref$IntRef6, measureScope, f12, j10, placeableMo32229measureBRTryo0)) {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                            } else {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                                measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f13, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                ref$IntRef3.f23400c += measureScope.mo27093roundToPx0680j_4(f12);
                            }
                            arrayList4.add(placeableMo32229measureBRTryo0);
                            ref$IntRef3.f23400c += placeableMo32229measureBRTryo0.getWidth();
                            ref$IntRef4.f23400c = Math.max(ref$IntRef4.f23400c, placeableMo32229measureBRTryo0.getHeight());
                            i12 = i13 + 1;
                            size = i14;
                        }
                        if (!arrayList4.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f11, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                        }
                        final int iMax = Math.max(ref$IntRef.f23400c, Constraints.m33456getMinWidthimpl(j10));
                        int iMax2 = Math.max(ref$IntRef2.f23400c, Constraints.m33455getMinHeightimpl(j10));
                        final float f14 = f10;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC9540l() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
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
                                List<List<Placeable>> list2 = arrayList6;
                                MeasureScope measureScope2 = measureScope;
                                float f15 = f14;
                                int i15 = iMax;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    List<Placeable> list4 = list2.get(i16);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i17 = 0;
                                    while (i17 < size3) {
                                        iArr[i17] = list4.get(i17).getWidth() + (i17 < AbstractC10978w.m24138p(list4) ? measureScope2.mo27093roundToPx0680j_4(f15) : 0);
                                        i17++;
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    int[] iArr2 = new int[size3];
                                    for (int i18 = 0; i18 < size3; i18++) {
                                        iArr2[i18] = 0;
                                    }
                                    end.arrange(measureScope2, i15, iArr, measureScope2.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i19 = 0; i19 < size4; i19++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i19), iArr2[i19], list3.get(i16).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int i12 = (i11 >> 6) & 14;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            int i13 = ((i12 << 6) & 896) | 6;
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
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
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
                    AlertDialogKt.m28336AlertDialogFlowRowixp7dh8(f10, f11, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m28337AlertDialogImplwrnwzgE(final InterfaceC9529a interfaceC9529a, final InterfaceC9544p interfaceC9544p, final Modifier modifier, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final InterfaceC9544p interfaceC9544p4, final InterfaceC9544p interfaceC9544p5, final Shape shape, final long j10, final long j11, final long j12, final long j13, final float f10, final DialogProperties dialogProperties, Composer composer, final int i10, final int i11) {
        int i12;
        InterfaceC9544p interfaceC9544p6;
        InterfaceC9544p interfaceC9544p7;
        InterfaceC9544p interfaceC9544p8;
        int i13;
        float f11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC9529a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC9544p6 = interfaceC9544p;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p6) ? 32 : 16;
        } else {
            interfaceC9544p6 = interfaceC9544p;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC9544p7 = interfaceC9544p2;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p7) ? 2048 : 1024;
        } else {
            interfaceC9544p7 = interfaceC9544p2;
        }
        if ((i10 & 24576) == 0) {
            interfaceC9544p8 = interfaceC9544p3;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p8) ? 16384 : 8192;
        } else {
            interfaceC9544p8 = interfaceC9544p3;
        }
        if ((i10 & ProfileVerifier.CompilationStatus.f1974xf2722a21) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p5) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= composerStartRestartGroup.changed(j11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.changed(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(j13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            f11 = f10;
            i13 |= composerStartRestartGroup.changed(f11) ? 256 : 128;
        } else {
            f11 = f10;
        }
        if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919826268, i12, i14, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            final InterfaceC9544p interfaceC9544p9 = interfaceC9544p6;
            final InterfaceC9544p interfaceC9544p10 = interfaceC9544p7;
            final float f12 = f11;
            final InterfaceC9544p interfaceC9544p11 = interfaceC9544p8;
            BasicAlertDialog(interfaceC9529a, modifier, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1852840226, true, new InterfaceC9544p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i15) {
                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1852840226, i15, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                    }
                    final InterfaceC9544p interfaceC9544p12 = interfaceC9544p10;
                    final InterfaceC9544p interfaceC9544p13 = interfaceC9544p9;
                    AlertDialogKt.m28335AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1163543932, true, new InterfaceC9544p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(Composer composer3, int i16) {
                            if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1163543932, i16, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                            }
                            float f13 = AlertDialogKt.ButtonsMainAxisSpacing;
                            float f14 = AlertDialogKt.ButtonsCrossAxisSpacing;
                            final InterfaceC9544p interfaceC9544p14 = interfaceC9544p12;
                            final InterfaceC9544p interfaceC9544p15 = interfaceC9544p13;
                            AlertDialogKt.m28336AlertDialogFlowRowixp7dh8(f13, f14, ComposableLambdaKt.rememberComposableLambda(1887135077, true, new InterfaceC9544p() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p181hd.InterfaceC9544p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C10786q.f26013a;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(Composer composer4, int i17) {
                                    if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1887135077, i17, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                                    }
                                    InterfaceC9544p interfaceC9544p16 = interfaceC9544p14;
                                    composer4.startReplaceGroup(1497073862);
                                    if (interfaceC9544p16 != null) {
                                        interfaceC9544p16.invoke(composer4, 0);
                                        C10786q c10786q = C10786q.f26013a;
                                    }
                                    composer4.endReplaceGroup();
                                    interfaceC9544p15.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 438);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, interfaceC9544p11, interfaceC9544p4, interfaceC9544p5, shape, j10, f12, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j11, j12, j13, composer2, 6, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 3072 | ((i12 >> 3) & 112) | ((i14 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AlertDialogKt.m28337AlertDialogImplwrnwzgE(interfaceC9529a, interfaceC9544p, modifier, interfaceC9544p2, interfaceC9544p3, interfaceC9544p4, interfaceC9544p5, shape, j10, j11, j12, j13, f10, dialogProperties, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicAlertDialog(final p181hd.InterfaceC9529a r16, androidx.compose.p014ui.Modifier r17, androidx.compose.p014ui.window.DialogProperties r18, final p181hd.InterfaceC9544p r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.BasicAlertDialog(hd.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }
}

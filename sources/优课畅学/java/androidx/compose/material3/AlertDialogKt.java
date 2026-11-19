package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.window.DialogProperties;
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
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = C3156Dp.m26899constructorimpl(280);
    private static final float DialogMaxWidth = C3156Dp.m26899constructorimpl(560);
    private static final float ButtonsMainAxisSpacing = C3156Dp.m26899constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = C3156Dp.m26899constructorimpl(12);

    static {
        float f10 = 24;
        DialogPadding = PaddingKt.m20849PaddingValues0680j_4(C3156Dp.m26899constructorimpl(f10));
        float f11 = 16;
        IconPadding = PaddingKt.m20853PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3156Dp.m26899constructorimpl(f11), 7, null);
        TitlePadding = PaddingKt.m20853PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3156Dp.m26899constructorimpl(f11), 7, null);
        TextPadding = PaddingKt.m20853PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, C3156Dp.m26899constructorimpl(f10), 7, null);
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
    @p123h7.InterfaceC8721a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AlertDialog(final p300x7.InterfaceC10559a r17, androidx.compose.p013ui.Modifier r18, androidx.compose.p013ui.window.DialogProperties r19, final p300x7.InterfaceC10574p r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.AlertDialog(x7.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, x7.p, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void m21733AlertDialogContent4hvqGtA(final p300x7.InterfaceC10574p r29, androidx.compose.p013ui.Modifier r30, final p300x7.InterfaceC10574p r31, final p300x7.InterfaceC10574p r32, final p300x7.InterfaceC10574p r33, final androidx.compose.p013ui.graphics.Shape r34, final long r35, final float r37, final long r38, final long r40, final long r42, final long r44, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m21733AlertDialogContent4hvqGtA(x7.p, androidx.compose.ui.Modifier, x7.p, x7.p, x7.p, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m21734AlertDialogFlowRowixp7dh8(final float f10, final float f11, final InterfaceC10574p interfaceC10574p, Composer composer, final int i10) {
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
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z10 = ((i11 & 14) == 4) | ((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f12, long j10, Placeable placeable) {
                        return list.isEmpty() || (ref$IntRef.f17471a + measureScope.mo20491roundToPx0680j_4(f12)) + placeable.getWidth() <= Constraints.m26852getMaxWidthimpl(j10);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f12, List<Placeable> list2, List<Integer> list3, Ref$IntRef ref$IntRef2, List<Integer> list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                        if (!list.isEmpty()) {
                            ref$IntRef.f17471a += measureScope.mo20491roundToPx0680j_4(f12);
                        }
                        list.add(0, AbstractC8778f0.m14544U0(list2));
                        list3.add(Integer.valueOf(ref$IntRef2.f17471a));
                        list4.add(Integer.valueOf(ref$IntRef.f17471a));
                        ref$IntRef.f17471a += ref$IntRef2.f17471a;
                        ref$IntRef3.f17471a = Math.max(ref$IntRef3.f17471a, ref$IntRef4.f17471a);
                        list2.clear();
                        ref$IntRef4.f17471a = 0;
                        ref$IntRef2.f17471a = 0;
                    }

                    @Override // androidx.compose.p013ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo20139measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j10) {
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
                            Placeable placeableMo25627measureBRTryo0 = list.get(i12).mo25627measureBRTryo0(j10);
                            int i13 = i12;
                            Ref$IntRef ref$IntRef6 = ref$IntRef3;
                            ref$IntRef3 = ref$IntRef6;
                            int i14 = size;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, ref$IntRef6, measureScope, f12, j10, placeableMo25627measureBRTryo0)) {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                            } else {
                                arrayList = arrayList5;
                                ref$IntRef2 = ref$IntRef5;
                                measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f13, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                ref$IntRef3.f17471a += measureScope.mo20491roundToPx0680j_4(f12);
                            }
                            arrayList4.add(placeableMo25627measureBRTryo0);
                            ref$IntRef3.f17471a += placeableMo25627measureBRTryo0.getWidth();
                            ref$IntRef4.f17471a = Math.max(ref$IntRef4.f17471a, placeableMo25627measureBRTryo0.getHeight());
                            i12 = i13 + 1;
                            size = i14;
                        }
                        if (!arrayList4.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, f11, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                        }
                        final int iMax = Math.max(ref$IntRef.f17471a, Constraints.m26854getMinWidthimpl(j10));
                        int iMax2 = Math.max(ref$IntRef2.f17471a, Constraints.m26853getMinHeightimpl(j10));
                        final float f14 = f10;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC10570l() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
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
                                        iArr[i17] = list4.get(i17).getWidth() + (i17 < AbstractC8809v.m14773p(list4) ? measureScope2.mo20491roundToPx0680j_4(f15) : 0);
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
            InterfaceC10559a constructor = companion2.getConstructor();
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
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composerStartRestartGroup);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            interfaceC10574p.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
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
                    AlertDialogKt.m21734AlertDialogFlowRowixp7dh8(f10, f11, interfaceC10574p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m21735AlertDialogImplwrnwzgE(final InterfaceC10559a interfaceC10559a, final InterfaceC10574p interfaceC10574p, final Modifier modifier, final InterfaceC10574p interfaceC10574p2, final InterfaceC10574p interfaceC10574p3, final InterfaceC10574p interfaceC10574p4, final InterfaceC10574p interfaceC10574p5, final Shape shape, final long j10, final long j11, final long j12, final long j13, final float f10, final DialogProperties dialogProperties, Composer composer, final int i10, final int i11) {
        int i12;
        InterfaceC10574p interfaceC10574p6;
        InterfaceC10574p interfaceC10574p7;
        InterfaceC10574p interfaceC10574p8;
        int i13;
        float f11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(interfaceC10559a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC10574p6 = interfaceC10574p;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p6) ? 32 : 16;
        } else {
            interfaceC10574p6 = interfaceC10574p;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC10574p7 = interfaceC10574p2;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p7) ? 2048 : 1024;
        } else {
            interfaceC10574p7 = interfaceC10574p2;
        }
        if ((i10 & 24576) == 0) {
            interfaceC10574p8 = interfaceC10574p3;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p8) ? 16384 : 8192;
        } else {
            interfaceC10574p8 = interfaceC10574p3;
        }
        if ((i10 & ProfileVerifier.CompilationStatus.f1860xf2722a21) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p4) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p5) ? 1048576 : 524288;
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
            final InterfaceC10574p interfaceC10574p9 = interfaceC10574p6;
            final InterfaceC10574p interfaceC10574p10 = interfaceC10574p7;
            final float f12 = f11;
            final InterfaceC10574p interfaceC10574p11 = interfaceC10574p8;
            BasicAlertDialog(interfaceC10559a, modifier, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1852840226, true, new InterfaceC10574p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
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
                    final InterfaceC10574p interfaceC10574p12 = interfaceC10574p10;
                    final InterfaceC10574p interfaceC10574p13 = interfaceC10574p9;
                    AlertDialogKt.m21733AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1163543932, true, new InterfaceC10574p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C8736p.f16368a;
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
                            final InterfaceC10574p interfaceC10574p14 = interfaceC10574p12;
                            final InterfaceC10574p interfaceC10574p15 = interfaceC10574p13;
                            AlertDialogKt.m21734AlertDialogFlowRowixp7dh8(f13, f14, ComposableLambdaKt.rememberComposableLambda(1887135077, true, new InterfaceC10574p() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // p300x7.InterfaceC10574p
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C8736p.f16368a;
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
                                    InterfaceC10574p interfaceC10574p16 = interfaceC10574p14;
                                    composer4.startReplaceGroup(1497073862);
                                    if (interfaceC10574p16 != null) {
                                        interfaceC10574p16.invoke(composer4, 0);
                                        C8736p c8736p = C8736p.f16368a;
                                    }
                                    composer4.endReplaceGroup();
                                    interfaceC10574p15.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 438);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, interfaceC10574p11, interfaceC10574p4, interfaceC10574p5, shape, j10, f12, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j11, j12, j13, composer2, 6, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 3072 | ((i12 >> 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | ((i14 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AlertDialogKt.m21735AlertDialogImplwrnwzgE(interfaceC10559a, interfaceC10574p, modifier, interfaceC10574p2, interfaceC10574p3, interfaceC10574p4, interfaceC10574p5, shape, j10, j11, j12, j13, f10, dialogProperties, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
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
    public static final void BasicAlertDialog(final p300x7.InterfaceC10559a r16, androidx.compose.p013ui.Modifier r17, androidx.compose.p013ui.window.DialogProperties r18, final p300x7.InterfaceC10574p r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.BasicAlertDialog(x7.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }
}

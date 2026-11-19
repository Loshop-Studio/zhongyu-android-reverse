package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.SubcomposeLayoutKt;
import androidx.compose.p014ui.layout.SubcomposeMeasureScope;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = C3186Dp.m33501constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29010ScaffoldTvnljyQ(androidx.compose.p014ui.Modifier r28, p181hd.InterfaceC9544p r29, p181hd.InterfaceC9544p r30, p181hd.InterfaceC9544p r31, p181hd.InterfaceC9544p r32, int r33, long r34, long r36, androidx.compose.foundation.layout.WindowInsets r38, final p181hd.InterfaceC9545q r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m29010ScaffoldTvnljyQ(androidx.compose.ui.Modifier, hd.p, hd.p, hd.p, hd.p, int, long, long, androidx.compose.foundation.layout.WindowInsets, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m29011ScaffoldLayoutFMILGgc(final int i10, final InterfaceC9544p interfaceC9544p, final InterfaceC9545q interfaceC9545q, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final WindowInsets windowInsets, final InterfaceC9544p interfaceC9544p4, Composer composer, final int i11) {
        int i12;
        InterfaceC9545q interfaceC9545q2;
        InterfaceC9544p interfaceC9544p5;
        final WindowInsets windowInsets2;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            interfaceC9545q2 = interfaceC9545q;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9545q2) ? 256 : 128;
        } else {
            interfaceC9545q2 = interfaceC9545q;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            interfaceC9544p5 = interfaceC9544p3;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p5) ? 16384 : 8192;
        } else {
            interfaceC9544p5 = interfaceC9544p3;
        }
        if ((196608 & i11) == 0) {
            windowInsets2 = windowInsets;
            i12 |= composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                final InterfaceC9545q interfaceC9545q3 = interfaceC9545q2;
                i13 = 1;
                final InterfaceC9544p interfaceC9544p6 = interfaceC9544p5;
                InterfaceC9544p interfaceC9544p7 = new InterfaceC9544p() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m29013invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m33460unboximpl());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m29013invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i14;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Integer numValueOf;
                        int height;
                        int bottom;
                        Object obj5;
                        Object obj6;
                        int iMo27093roundToPx0680j_4;
                        int iMo27093roundToPx0680j_42;
                        final int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
                        final int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
                        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, interfaceC9544p);
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            arrayList.add(listSubcompose.get(i15).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int iM24138p = AbstractC10978w.m24138p(arrayList);
                            if (1 <= iM24138p) {
                                int i16 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i16);
                                    int height3 = ((Placeable) obj7).getHeight();
                                    if (height2 < height3) {
                                        obj = obj7;
                                        height2 = height3;
                                    }
                                    if (i16 == iM24138p) {
                                        break;
                                    }
                                    i16++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, interfaceC9544p2);
                        WindowInsets windowInsets3 = windowInsets2;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            arrayList2.add(listSubcompose2.get(i17).mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i17++;
                            arrayList = arrayList;
                            listSubcompose2 = listSubcompose2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int iM24138p2 = AbstractC10978w.m24138p(arrayList2);
                            if (1 <= iM24138p2) {
                                Object obj8 = obj2;
                                int i18 = height5;
                                int i19 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i19);
                                    int height6 = ((Placeable) obj9).getHeight();
                                    if (i18 < height6) {
                                        obj8 = obj9;
                                        i18 = height6;
                                    }
                                    if (i19 == iM24138p2) {
                                        break;
                                    }
                                    i19++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int iM24138p3 = AbstractC10978w.m24138p(arrayList2);
                            if (1 <= iM24138p3) {
                                Object obj10 = obj3;
                                int i20 = width;
                                int i21 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i21);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i20 < width2) {
                                        obj10 = obj11;
                                        i20 = width2;
                                    }
                                    if (i21 == iM24138p3) {
                                        break;
                                    }
                                    i21++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, interfaceC9544p6);
                        WindowInsets windowInsets4 = windowInsets2;
                        final int i22 = width3;
                        final ArrayList arrayList4 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i23 = 0;
                        while (i23 < size3) {
                            int i24 = height7;
                            List<Measurable> list = listSubcompose3;
                            Placeable placeableMo32229measureBRTryo0 = listSubcompose3.get(i23).mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(jM33444copyZbe2FdA$default, (-windowInsets4.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope)));
                            if (placeableMo32229measureBRTryo0.getHeight() == 0 || placeableMo32229measureBRTryo0.getWidth() == 0) {
                                placeableMo32229measureBRTryo0 = null;
                            }
                            if (placeableMo32229measureBRTryo0 != null) {
                                arrayList4.add(placeableMo32229measureBRTryo0);
                            }
                            i23++;
                            height7 = i24;
                            listSubcompose3 = list;
                        }
                        int i25 = height7;
                        if (arrayList4.isEmpty()) {
                            i14 = height4;
                            fabPlacement = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int iM24138p4 = AbstractC10978w.m24138p(arrayList4);
                                if (1 <= iM24138p4) {
                                    Object obj12 = obj5;
                                    int i26 = width4;
                                    int i27 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i27);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i26 < width5) {
                                            obj12 = obj13;
                                            i26 = width5;
                                        }
                                        if (i27 == iM24138p4) {
                                            break;
                                        }
                                        i27++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            AbstractC9979u.m20291d(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList4.isEmpty()) {
                                i14 = height4;
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int height8 = ((Placeable) obj6).getHeight();
                                int iM24138p5 = AbstractC10978w.m24138p(arrayList4);
                                if (1 <= iM24138p5) {
                                    Object obj14 = obj6;
                                    int i28 = height8;
                                    int i29 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i29);
                                        i14 = height4;
                                        int height9 = ((Placeable) obj15).getHeight();
                                        if (i28 < height9) {
                                            i28 = height9;
                                            obj14 = obj15;
                                        }
                                        if (i29 == iM24138p5) {
                                            break;
                                        }
                                        i29++;
                                        height4 = i14;
                                    }
                                    obj6 = obj14;
                                } else {
                                    i14 = height4;
                                }
                            }
                            AbstractC9979u.m20291d(obj6);
                            int height10 = ((Placeable) obj6).getHeight();
                            int i30 = i10;
                            FabPosition.Companion companion = FabPosition.Companion;
                            if (!FabPosition.m28696equalsimpl0(i30, companion.m28703getStartERTFSPs())) {
                                if (!(FabPosition.m28696equalsimpl0(i30, companion.m28701getEndERTFSPs()) ? true : FabPosition.m28696equalsimpl0(i30, companion.m28702getEndOverlayERTFSPs()))) {
                                    iMo27093roundToPx0680j_4 = (iM33454getMaxWidthimpl - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo27093roundToPx0680j_42 = subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo27093roundToPx0680j_4 = (iM33454getMaxWidthimpl - iMo27093roundToPx0680j_42) - width6;
                                } else {
                                    iMo27093roundToPx0680j_4 = subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                fabPlacement = new FabPlacement(iMo27093roundToPx0680j_4, width6, height10);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                iMo27093roundToPx0680j_4 = subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                fabPlacement = new FabPlacement(iMo27093roundToPx0680j_4, width6, height10);
                            } else {
                                iMo27093roundToPx0680j_42 = subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                iMo27093roundToPx0680j_4 = (iM33454getMaxWidthimpl - iMo27093roundToPx0680j_42) - width6;
                                fabPlacement = new FabPlacement(iMo27093roundToPx0680j_4, width6, height10);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final InterfaceC9544p interfaceC9544p8 = interfaceC9544p4;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-2146438447, true, new InterfaceC9544p() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj16, Object obj17) {
                                invoke((Composer) obj16, ((Number) obj17).intValue());
                                return C10786q.f26013a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i31) {
                                if ((i31 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i31, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                interfaceC9544p8.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i31 = 0; i31 < size4; i31++) {
                            arrayList5.add(listSubcompose4.get(i31).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int height11 = ((Placeable) obj4).getHeight();
                            int iM24138p6 = AbstractC10978w.m24138p(arrayList5);
                            if (1 <= iM24138p6) {
                                int i32 = 1;
                                while (true) {
                                    Object obj16 = arrayList5.get(i32);
                                    int height12 = ((Placeable) obj16).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj4 = obj16;
                                    }
                                    if (i32 == iM24138p6) {
                                        break;
                                    }
                                    i32++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i33 = i10;
                            WindowInsets windowInsets5 = windowInsets2;
                            if (numValueOf2 == null || FabPosition.m28696equalsimpl0(i33, FabPosition.Companion.m28702getEndOverlayERTFSPs())) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                bottom = windowInsets5.getBottom(subcomposeMeasureScope);
                            } else {
                                height = numValueOf2.intValue() + fabPlacement.getHeight();
                                bottom = subcomposeMeasureScope.mo27093roundToPx0680j_4(ScaffoldKt.FabSpacing);
                            }
                            numValueOf = Integer.valueOf(height + bottom);
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = i25 != 0 ? i25 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final InterfaceC9545q interfaceC9545q4 = interfaceC9545q3;
                        final int i34 = i14;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1213360416, true, new InterfaceC9544p() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj17, Object obj18) {
                                invoke((Composer) obj17, ((Number) obj18).intValue());
                                return C10786q.f26013a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i35) {
                                Integer num;
                                if ((i35 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1213360416, i35, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                }
                                PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets6, subcomposeMeasureScope);
                                interfaceC9545q4.invoke(PaddingKt.m27454PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), arrayList3.isEmpty() ? paddingValuesAsPaddingValues.mo27410calculateTopPaddingD9Ej5fM() : subcomposeMeasureScope.mo27096toDpu2uoSUM(i34), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (arrayList5.isEmpty() || (num = numValueOf2) == null) ? paddingValuesAsPaddingValues.mo27407calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo27096toDpu2uoSUM(num.intValue())), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i35 = 0; i35 < size5; i35++) {
                            arrayList6.add(listSubcompose5.get(i35).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        final Integer num = numValueOf2;
                        final WindowInsets windowInsets7 = windowInsets2;
                        final Integer num2 = numValueOf;
                        final int i36 = iIntValue;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM33454getMaxWidthimpl, iM33453getMaxHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                                invoke((Placeable.PlacementScope) obj17);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                List<Placeable> list2 = arrayList6;
                                int size6 = list2.size();
                                for (int i37 = 0; i37 < size6; i37++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i37), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList3;
                                int size7 = list3.size();
                                for (int i38 = 0; i38 < size7; i38++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i38), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList2;
                                int i39 = iM33454getMaxWidthimpl;
                                int i40 = i22;
                                WindowInsets windowInsets8 = windowInsets7;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i41 = iM33453getMaxHeightimpl;
                                int i42 = i36;
                                int size8 = list4.size();
                                for (int i43 = 0; i43 < size8; i43++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i43), ((i39 - i40) / 2) + windowInsets8.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), i41 - i42, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList5;
                                int i44 = iM33453getMaxHeightimpl;
                                Integer num3 = num;
                                int size9 = list5.size();
                                for (int i45 = 0; i45 < size9; i45++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i45), 0, i44 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList4;
                                    int i46 = iM33453getMaxHeightimpl;
                                    Integer num4 = num2;
                                    int size10 = list6.size();
                                    for (int i47 = 0; i47 < size10; i47++) {
                                        Placeable placeable5 = list6.get(i47);
                                        int left = fabPlacement3.getLeft();
                                        AbstractC9979u.m20291d(num4);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i46 - num4.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC9544p7);
                objRememberedValue = interfaceC9544p7;
            } else {
                i13 = 1;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (InterfaceC9544p) objRememberedValue, composerStartRestartGroup, 0, i13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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
                    ScaffoldKt.m29011ScaffoldLayoutFMILGgc(i10, interfaceC9544p, interfaceC9545q, interfaceC9544p2, interfaceC9544p3, windowInsets, interfaceC9544p4, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}

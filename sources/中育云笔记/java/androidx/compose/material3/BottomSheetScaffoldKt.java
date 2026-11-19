package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p014ui.layout.LayoutKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p014ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28375BottomSheetScaffoldsdMYb0k(final p181hd.InterfaceC9545q r34, androidx.compose.p014ui.Modifier r35, androidx.compose.material3.BottomSheetScaffoldState r36, float r37, float r38, androidx.compose.p014ui.graphics.Shape r39, long r40, long r42, float r44, float r45, p181hd.InterfaceC9544p r46, boolean r47, p181hd.InterfaceC9544p r48, p181hd.InterfaceC9545q r49, long r50, long r52, final p181hd.InterfaceC9545q r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m28375BottomSheetScaffoldsdMYb0k(hd.q, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, float, androidx.compose.ui.graphics.Shape, long, long, float, float, hd.p, boolean, hd.p, hd.q, long, long, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-2E65NiM, reason: not valid java name */
    public static final void m28376BottomSheetScaffoldLayout2E65NiM(final Modifier modifier, final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final InterfaceC9544p interfaceC9544p4, final InterfaceC9529a interfaceC9529a, final SheetState sheetState, final long j10, final long j11, Composer composer, final int i10) {
        int i11;
        InterfaceC9544p interfaceC9544p5;
        char c10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651214892);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            interfaceC9544p5 = interfaceC9544p2;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p5) ? 256 : 128;
        } else {
            interfaceC9544p5 = interfaceC9544p2;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(sheetState) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            c10 = 2;
            i11 |= composerStartRestartGroup.changed(j11) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            c10 = 2;
        }
        char c11 = c10;
        if ((i11 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651214892, i11, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            InterfaceC9544p interfaceC9544pM28542getLambda3$material3_release = interfaceC9544p == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m28542getLambda3$material3_release() : interfaceC9544p;
            final InterfaceC9544p interfaceC9544p6 = interfaceC9544p5;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(398963586, true, new InterfaceC9544p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
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
                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398963586, i12, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                    }
                    SurfaceKt.m29151SurfaceT9BRK9s(modifier, null, j10, j11, 0.0f, 0.0f, null, interfaceC9544p6, composer2, 0, 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            InterfaceC9544p[] interfaceC9544pArr = new InterfaceC9544p[4];
            interfaceC9544pArr[0] = interfaceC9544pM28542getLambda3$material3_release;
            interfaceC9544pArr[1] = composableLambdaRememberComposableLambda;
            interfaceC9544pArr[c11] = interfaceC9544p3;
            interfaceC9544pArr[3] = interfaceC9544p4;
            List listM24139q = AbstractC10978w.m24139q(interfaceC9544pArr);
            boolean z10 = ((3670016 & i11) == 1048576) | ((i11 & 458752) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.p014ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo27405measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j12) {
                        Integer numValueOf;
                        List<? extends Measurable> list2 = list.get(0);
                        int i12 = 1;
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        final int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j12);
                        final int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j12);
                        long jM33444copyZbe2FdA$default = Constraints.m33444copyZbe2FdA$default(j12, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList.add(list4.get(i13).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            arrayList2.add(list2.get(i14).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        if (arrayList2.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                            int iM24138p = AbstractC10978w.m24138p(arrayList2);
                            if (1 <= iM24138p) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i12 == iM24138p) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jM33444copyZbe2FdA$default2 = Constraints.m33444copyZbe2FdA$default(jM33444copyZbe2FdA$default, 0, 0, 0, iM33453getMaxHeightimpl - iIntValue, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            arrayList3.add(list3.get(i15).mo32229measureBRTryo0(jM33444copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            arrayList4.add(list5.get(i16).mo32229measureBRTryo0(jM33444copyZbe2FdA$default));
                        }
                        final SheetState sheetState2 = sheetState;
                        final InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                        return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33453getMaxHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SheetValue.Hidden.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iM19282d;
                                List<Placeable> list6 = arrayList;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(list6.get(0).getWidth());
                                    int iM24138p2 = AbstractC10978w.m24138p(list6);
                                    if (1 <= iM24138p2) {
                                        int i17 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(list6.get(i17).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i17 == iM24138p2) {
                                                break;
                                            } else {
                                                i17++;
                                            }
                                        }
                                    }
                                }
                                int iMax = Integer.max(0, (iM33454getMaxWidthimpl - (numValueOf3 != null ? numValueOf3.intValue() : 0)) / 2);
                                List<Placeable> list7 = arrayList4;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(list7.get(0).getWidth());
                                    int iM24138p3 = AbstractC10978w.m24138p(list7);
                                    if (1 <= iM24138p3) {
                                        int i18 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(list7.get(i18).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i18 == iM24138p3) {
                                                break;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                List<Placeable> list8 = arrayList4;
                                if (!list8.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(list8.get(0).getHeight());
                                    int iM24138p4 = AbstractC10978w.m24138p(list8);
                                    if (1 <= iM24138p4) {
                                        int i19 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(list8.get(i19).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i19 == iM24138p4) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i20 = (iM33454getMaxWidthimpl - iIntValue2) / 2;
                                int i21 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i21 == 1) {
                                    iM19282d = AbstractC9719c.m19282d(((Number) interfaceC9529a2.invoke()).floatValue());
                                } else {
                                    if (i21 != 2 && i21 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iM19282d = iM33453getMaxHeightimpl;
                                }
                                int i22 = iM19282d - iIntValue3;
                                List<Placeable> list9 = arrayList3;
                                int i23 = iIntValue;
                                int size5 = list9.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i24), 0, i23, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList2;
                                int size6 = list10.size();
                                for (int i25 = 0; i25 < size6; i25++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i25), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList;
                                int size7 = list11.size();
                                for (int i26 = 0; i26 < size7; i26++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i26), iMax, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list12 = arrayList4;
                                int size8 = list12.size();
                                for (int i27 = 0; i27 < size8; i27++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list12.get(i27), i20, i22, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            InterfaceC9544p interfaceC9544pCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM24139q);
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
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
            interfaceC9544pCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    BottomSheetScaffoldKt.m28376BottomSheetScaffoldLayout2E65NiM(modifier, interfaceC9544p, interfaceC9544p2, interfaceC9544p3, interfaceC9544p4, interfaceC9529a, sheetState, j10, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m28377StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f10, final float f11, final boolean z10, final Shape shape, final long j10, final long j11, final float f12, final float f13, final InterfaceC9544p interfaceC9544p, final InterfaceC9545q interfaceC9545q, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        InterfaceC11122i0 interfaceC11122i0;
        int i14;
        Object obj;
        Modifier modifierNestedScroll$default;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(721467526);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(f11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(j11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.changed(f12) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.changed(f13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.changedInstance(interfaceC9545q) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721467526, i12, i13, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Orientation orientation = Orientation.Vertical;
            final float fMo27099toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(f10);
            composerStartRestartGroup.startReplaceGroup(-1831611516);
            if (z10) {
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChanged = composerStartRestartGroup.changed(sheetState.getAnchoredDraggableState$material3_release());
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    i14 = i12;
                } else {
                    i14 = i12;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    interfaceC11122i0 = coroutineScope;
                    obj = null;
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                }
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new InterfaceC9540l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1

                    @InterfaceC11829d(m26210c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", m26211f = "BottomSheetScaffold.kt", m26212l = {236}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1 */
                    public static final class C20621 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C20621(SheetState sheetState, float f10, InterfaceC11588c<? super C20621> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = sheetState;
                            this.$it = f10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C20621(this.$state, this.$it, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                SheetState sheetState = this.$state;
                                float f10 = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f10, this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C20621) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).floatValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(float f14) {
                        AbstractC11117h.m24726d(coroutineScope, null, null, new C20621(sheetState, f14, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                interfaceC11122i0 = coroutineScope;
                obj = null;
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
            } else {
                interfaceC11122i0 = coroutineScope;
                i14 = i12;
                obj = null;
                modifierNestedScroll$default = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.m27496requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m27512widthInVpY3zN4$default(Modifier.Companion, 0.0f, f11, 1, obj), 0.0f, 1, obj), f10, 0.0f, 2, obj).then(modifierNestedScroll$default);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            boolean zChanged2 = ((i14 & 14) == 4) | composerStartRestartGroup.changed(fMo27099toPx0680j_4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9544p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        return m28380invokeGpV2Q24(((IntSize) obj2).m33676unboximpl(), ((Constraints) obj3).m33460unboximpl());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r4
                      0x003c: PHI (r4v6 androidx.compose.material3.SheetValue) = 
                      (r4v5 androidx.compose.material3.SheetValue)
                      (r4v7 androidx.compose.material3.SheetValue)
                      (r4v8 androidx.compose.material3.SheetValue)
                      (r4v9 androidx.compose.material3.SheetValue)
                      (r4v10 androidx.compose.material3.SheetValue)
                      (r4v11 androidx.compose.material3.SheetValue)
                      (r4v12 androidx.compose.material3.SheetValue)
                     binds: [B:29:0x0077, B:20:0x005c, B:23:0x0065, B:26:0x006e, B:9:0x003a, B:12:0x0044, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.Pair<androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue>, androidx.compose.material3.SheetValue> m28380invokeGpV2Q24(long r2, long r4) {
                        /*
                            r1 = this;
                            int r4 = androidx.compose.p014ui.unit.Constraints.m33453getMaxHeightimpl(r4)
                            float r4 = (float) r4
                            int r2 = androidx.compose.p014ui.unit.IntSize.m33671getHeightimpl(r2)
                            float r2 = (float) r2
                            androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1 r3 = new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1
                            androidx.compose.material3.SheetState r5 = r1
                            float r0 = r2
                            r3.<init>()
                            androidx.compose.material3.internal.DraggableAnchors r2 = androidx.compose.material3.internal.AnchoredDraggableKt.DraggableAnchors(r3)
                            androidx.compose.material3.SheetState r3 = r1
                            androidx.compose.material3.internal.AnchoredDraggableState r3 = r3.getAnchoredDraggableState$material3_release()
                            java.lang.Object r3 = r3.getTargetValue()
                            androidx.compose.material3.SheetValue r3 = (androidx.compose.material3.SheetValue) r3
                            int[] r4 = androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.WhenMappings.$EnumSwitchMapping$0
                            int r5 = r3.ordinal()
                            r4 = r4[r5]
                            r5 = 1
                            if (r4 == r5) goto L71
                            r5 = 2
                            if (r4 == r5) goto L56
                            r5 = 3
                            if (r4 != r5) goto L50
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Expanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L3e
                        L3c:
                            r3 = r4
                            goto L7a
                        L3e:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.PartiallyExpanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L47
                            goto L3c
                        L47:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L50:
                            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                            r2.<init>()
                            throw r2
                        L56:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.PartiallyExpanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L5f
                            goto L3c
                        L5f:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Expanded
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L68
                            goto L3c
                        L68:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L71:
                            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
                            boolean r5 = r2.hasAnchorFor(r4)
                            if (r5 == 0) goto L7a
                            goto L3c
                        L7a:
                            kotlin.Pair r2 = p309qc.AbstractC10776g.m22975a(r2, r3)
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.m28380invokeGpV2Q24(long, long):kotlin.Pair");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final InterfaceC11122i0 interfaceC11122i02 = interfaceC11122i0;
            int i15 = i14 >> 9;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m29151SurfaceT9BRK9s(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifierThen, anchoredDraggableState$material3_release, orientation, (InterfaceC9544p) objRememberedValue3), sheetState.getAnchoredDraggableState$material3_release(), orientation, z10, false, null, 24, null), shape, j10, j11, f12, f13, null, ComposableLambdaKt.rememberComposableLambda(390720907, true, new InterfaceC9544p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
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
                        ComposerKt.traceEventStart(390720907, i16, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier.Companion companion3 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    final SheetState sheetState2 = sheetState;
                    final boolean z11 = z10;
                    final InterfaceC11122i0 interfaceC11122i03 = interfaceC11122i02;
                    InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion4 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion4.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer3);
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1168080147);
                    if (interfaceC9544p2 != null) {
                        Strings.Companion companion6 = Strings.Companion;
                        final String strM29589getString2EP1pXo = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                        final String strM29589getString2EP1pXo2 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                        final String strM29589getString2EP1pXo3 = Strings_androidKt.m29589getString2EP1pXo(Strings.m29519constructorimpl(C2296R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                        Modifier modifierAlign = columnScopeInstance.align(companion3, companion4.getCenterHorizontally());
                        boolean zChanged3 = composer3.changed(sheetState2) | composer3.changed(z11) | composer3.changed(strM29589getString2EP1pXo3) | composer3.changedInstance(interfaceC11122i03) | composer3.changed(strM29589getString2EP1pXo) | composer3.changed(strM29589getString2EP1pXo2);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new InterfaceC9540l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((SemanticsPropertyReceiver) obj2);
                                    return C10786q.f26013a;
                                }

                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z12 = z11;
                                    String str = strM29589getString2EP1pXo3;
                                    String str2 = strM29589getString2EP1pXo;
                                    String str3 = strM29589getString2EP1pXo2;
                                    final InterfaceC11122i0 interfaceC11122i04 = interfaceC11122i03;
                                    if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z12) {
                                        return;
                                    }
                                    SheetValue currentValue = sheetState3.getCurrentValue();
                                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                    if (currentValue == sheetValue) {
                                        if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded)).booleanValue()) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new InterfaceC9529a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1

                                                @InterfaceC11829d(m26210c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", m26211f = "BottomSheetScaffold.kt", m26212l = {311}, m26213m = "invokeSuspend")
                                                /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1 */
                                                public static final class C20591 extends SuspendLambda implements InterfaceC9544p {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C20591(SheetState sheetState, InterfaceC11588c<? super C20591> interfaceC11588c) {
                                                        super(2, interfaceC11588c);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                                        return new C20591(this.$this_with, interfaceC11588c);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object objM25952f = AbstractC11725a.m25952f();
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            AbstractC9924b.m20071b(obj);
                                                            SheetState sheetState = this.$this_with;
                                                            this.label = 1;
                                                            if (sheetState.expand(this) == objM25952f) {
                                                                return objM25952f;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            AbstractC9924b.m20071b(obj);
                                                        }
                                                        return C10786q.f26013a;
                                                    }

                                                    @Override // p181hd.InterfaceC9544p
                                                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                                        return ((C20591) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // p181hd.InterfaceC9529a
                                                public final Boolean invoke() {
                                                    AbstractC11117h.m24726d(interfaceC11122i04, null, null, new C20591(sheetState3, null), 3, null);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                    } else if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue)).booleanValue()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new InterfaceC9529a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2

                                            @InterfaceC11829d(m26210c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", m26211f = "BottomSheetScaffold.kt", m26212l = {320}, m26213m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1 */
                                            public static final class C20601 extends SuspendLambda implements InterfaceC9544p {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C20601(SheetState sheetState, InterfaceC11588c<? super C20601> interfaceC11588c) {
                                                    super(2, interfaceC11588c);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                                    return new C20601(this.$this_with, interfaceC11588c);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object objM25952f = AbstractC11725a.m25952f();
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        AbstractC9924b.m20071b(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.partialExpand(this) == objM25952f) {
                                                            return objM25952f;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        AbstractC9924b.m20071b(obj);
                                                    }
                                                    return C10786q.f26013a;
                                                }

                                                @Override // p181hd.InterfaceC9544p
                                                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                                    return ((C20601) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // p181hd.InterfaceC9529a
                                            public final Boolean invoke() {
                                                AbstractC11117h.m24726d(interfaceC11122i04, null, null, new C20601(sheetState3, null), 3, null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState$material3_release()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new InterfaceC9529a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3

                                        @InterfaceC11829d(m26210c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", m26211f = "BottomSheetScaffold.kt", m26212l = {327}, m26213m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1 */
                                        public static final class C20611 extends SuspendLambda implements InterfaceC9544p {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C20611(SheetState sheetState, InterfaceC11588c<? super C20611> interfaceC11588c) {
                                                super(2, interfaceC11588c);
                                                this.$this_with = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                                                return new C20611(this.$this_with, interfaceC11588c);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object objM25952f = AbstractC11725a.m25952f();
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    AbstractC9924b.m20071b(obj);
                                                    SheetState sheetState = this.$this_with;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == objM25952f) {
                                                        return objM25952f;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    AbstractC9924b.m20071b(obj);
                                                }
                                                return C10786q.f26013a;
                                            }

                                            @Override // p181hd.InterfaceC9544p
                                            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                                                return ((C20611) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // p181hd.InterfaceC9529a
                                        public final Boolean invoke() {
                                            AbstractC11117h.m24726d(interfaceC11122i04, null, null, new C20611(sheetState3, null), 3, null);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (InterfaceC9540l) objRememberedValue4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                        InterfaceC9529a constructor2 = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composer3);
                        Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        InterfaceC9544p setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        interfaceC9544p2.invoke(composer3, 0);
                        composer3.endNode();
                    }
                    composer3.endReplaceGroup();
                    interfaceC9545q2.invoke(columnScopeInstance, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i15 & 112) | 12582912 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer3, int i16) {
                    BottomSheetScaffoldKt.m28377StandardBottomSheetw7I5h1o(sheetState, f10, f11, z10, shape, j10, j11, f12, f13, interfaceC9544p, interfaceC9545q, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
                }
            });
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i10, int i11) {
        Composer composer2;
        if ((i11 & 1) != 0) {
            composer2 = composer;
            sheetState = rememberStandardBottomSheetState(null, null, false, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i11 & 2) != 0) {
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i10, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i10 & 48) == 32);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (z10 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, InterfaceC9540l interfaceC9540l, boolean z10, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i11 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i10, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, interfaceC9540l2, sheetValue2, z11, composer, (i10 & 112) | ((i10 << 6) & 896) | ((i10 << 3) & 7168), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}

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
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p013ui.layout.LayoutKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
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
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p322z7.AbstractC10729c;

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
    public static final void m21773BottomSheetScaffoldsdMYb0k(final p300x7.InterfaceC10575q r34, androidx.compose.p013ui.Modifier r35, androidx.compose.material3.BottomSheetScaffoldState r36, float r37, float r38, androidx.compose.p013ui.graphics.Shape r39, long r40, long r42, float r44, float r45, p300x7.InterfaceC10574p r46, boolean r47, p300x7.InterfaceC10574p r48, p300x7.InterfaceC10575q r49, long r50, long r52, final p300x7.InterfaceC10575q r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m21773BottomSheetScaffoldsdMYb0k(x7.q, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, float, androidx.compose.ui.graphics.Shape, long, long, float, float, x7.p, boolean, x7.p, x7.q, long, long, x7.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-2E65NiM, reason: not valid java name */
    public static final void m21774BottomSheetScaffoldLayout2E65NiM(final Modifier modifier, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, final InterfaceC10574p interfaceC10574p3, final InterfaceC10574p interfaceC10574p4, final InterfaceC10559a interfaceC10559a, final SheetState sheetState, final long j10, final long j11, Composer composer, final int i10) {
        int i11;
        InterfaceC10574p interfaceC10574p5;
        char c10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651214892);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            interfaceC10574p5 = interfaceC10574p2;
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p5) ? 256 : 128;
        } else {
            interfaceC10574p5 = interfaceC10574p2;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p4) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10559a) ? 131072 : 65536;
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
            InterfaceC10574p interfaceC10574pM21940getLambda3$material3_release = interfaceC10574p == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m21940getLambda3$material3_release() : interfaceC10574p;
            final InterfaceC10574p interfaceC10574p6 = interfaceC10574p5;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(398963586, true, new InterfaceC10574p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
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
                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398963586, i12, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                    }
                    SurfaceKt.m22549SurfaceT9BRK9s(modifier, null, j10, j11, 0.0f, 0.0f, null, interfaceC10574p6, composer2, 0, 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            InterfaceC10574p[] interfaceC10574pArr = new InterfaceC10574p[4];
            interfaceC10574pArr[0] = interfaceC10574pM21940getLambda3$material3_release;
            interfaceC10574pArr[1] = composableLambdaRememberComposableLambda;
            interfaceC10574pArr[c11] = interfaceC10574p3;
            interfaceC10574pArr[3] = interfaceC10574p4;
            List listM14774q = AbstractC8809v.m14774q(interfaceC10574pArr);
            boolean z10 = ((3670016 & i11) == 1048576) | ((i11 & 458752) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo20803measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j12) {
                        Integer numValueOf;
                        List<? extends Measurable> list2 = list.get(0);
                        int i12 = 1;
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        final int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j12);
                        final int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j12);
                        long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j12, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList.add(list4.get(i13).mo25627measureBRTryo0(jM26842copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            arrayList2.add(list2.get(i14).mo25627measureBRTryo0(jM26842copyZbe2FdA$default));
                        }
                        if (arrayList2.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                            int iM14773p = AbstractC8809v.m14773p(arrayList2);
                            if (1 <= iM14773p) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i12 == iM14773p) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jM26842copyZbe2FdA$default2 = Constraints.m26842copyZbe2FdA$default(jM26842copyZbe2FdA$default, 0, 0, 0, iM26851getMaxHeightimpl - iIntValue, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            arrayList3.add(list3.get(i15).mo25627measureBRTryo0(jM26842copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            arrayList4.add(list5.get(i16).mo25627measureBRTryo0(jM26842copyZbe2FdA$default));
                        }
                        final SheetState sheetState2 = sheetState;
                        final InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                        return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26851getMaxHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

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

                            @Override // p300x7.InterfaceC10570l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C8736p.f16368a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iM20035d;
                                List<Placeable> list6 = arrayList;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(list6.get(0).getWidth());
                                    int iM14773p2 = AbstractC8809v.m14773p(list6);
                                    if (1 <= iM14773p2) {
                                        int i17 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(list6.get(i17).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i17 == iM14773p2) {
                                                break;
                                            } else {
                                                i17++;
                                            }
                                        }
                                    }
                                }
                                int iMax = Integer.max(0, (iM26852getMaxWidthimpl - (numValueOf3 != null ? numValueOf3.intValue() : 0)) / 2);
                                List<Placeable> list7 = arrayList4;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(list7.get(0).getWidth());
                                    int iM14773p3 = AbstractC8809v.m14773p(list7);
                                    if (1 <= iM14773p3) {
                                        int i18 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(list7.get(i18).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i18 == iM14773p3) {
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
                                    int iM14773p4 = AbstractC8809v.m14773p(list8);
                                    if (1 <= iM14773p4) {
                                        int i19 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(list8.get(i19).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i19 == iM14773p4) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i20 = (iM26852getMaxWidthimpl - iIntValue2) / 2;
                                int i21 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i21 == 1) {
                                    iM20035d = AbstractC10729c.m20035d(((Number) interfaceC10559a2.invoke()).floatValue());
                                } else {
                                    if (i21 != 2 && i21 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iM20035d = iM26851getMaxHeightimpl;
                                }
                                int i22 = iM20035d - iIntValue3;
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
            InterfaceC10574p interfaceC10574pCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM14774q);
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
            interfaceC10574pCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i12) {
                    BottomSheetScaffoldKt.m21774BottomSheetScaffoldLayout2E65NiM(modifier, interfaceC10574p, interfaceC10574p2, interfaceC10574p3, interfaceC10574p4, interfaceC10559a, sheetState, j10, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m21775StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f10, final float f11, final boolean z10, final Shape shape, final long j10, final long j11, final float f12, final float f13, final InterfaceC10574p interfaceC10574p, final InterfaceC10575q interfaceC10575q, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        InterfaceC8822b0 interfaceC8822b0;
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
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.changedInstance(interfaceC10575q) ? 4 : 2);
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
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17438a, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC8822b0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Orientation orientation = Orientation.Vertical;
            final float fMo20497toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo20497toPx0680j_4(f10);
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
                    interfaceC8822b0 = coroutineScope;
                    obj = null;
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                }
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new InterfaceC10570l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1

                    @InterfaceC9539d(m17800c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", m17801f = "BottomSheetScaffold.kt", m17802l = {236}, m17803m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1 */
                    public static final class C20321 extends SuspendLambda implements InterfaceC10574p {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C20321(SheetState sheetState, float f10, InterfaceC9324c<? super C20321> interfaceC9324c) {
                            super(2, interfaceC9324c);
                            this.$state = sheetState;
                            this.$it = f10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                            return new C20321(this.$state, this.$it, interfaceC9324c);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            return ((C20321) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM17291f = AbstractC9434a.m17291f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9079b.m15926b(obj);
                                SheetState sheetState = this.$state;
                                float f10 = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f10, this) == objM17291f) {
                                    return objM17291f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9079b.m15926b(obj);
                            }
                            return C8736p.f16368a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).floatValue());
                        return C8736p.f16368a;
                    }

                    public final void invoke(float f14) {
                        AbstractC8839h.m14861d(coroutineScope, null, null, new C20321(sheetState, f14, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                interfaceC8822b0 = coroutineScope;
                obj = null;
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
            } else {
                interfaceC8822b0 = coroutineScope;
                i14 = i12;
                obj = null;
                modifierNestedScroll$default = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.m20894requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m20910widthInVpY3zN4$default(Modifier.Companion, 0.0f, f11, 1, obj), 0.0f, 1, obj), f10, 0.0f, 2, obj).then(modifierNestedScroll$default);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            boolean zChanged2 = ((i14 & 14) == 4) | composerStartRestartGroup.changed(fMo20497toPx0680j_4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC10574p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

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

                    @Override // p300x7.InterfaceC10574p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        return m21778invokeGpV2Q24(((IntSize) obj2).m27074unboximpl(), ((Constraints) obj3).m26858unboximpl());
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
                    public final kotlin.Pair<androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue>, androidx.compose.material3.SheetValue> m21778invokeGpV2Q24(long r2, long r4) {
                        /*
                            r1 = this;
                            int r4 = androidx.compose.p013ui.unit.Constraints.m26851getMaxHeightimpl(r4)
                            float r4 = (float) r4
                            int r2 = androidx.compose.p013ui.unit.IntSize.m27069getHeightimpl(r2)
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
                            kotlin.Pair r2 = p123h7.AbstractC8726f.m14230a(r2, r3)
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.m21778invokeGpV2Q24(long, long):kotlin.Pair");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final InterfaceC8822b0 interfaceC8822b02 = interfaceC8822b0;
            int i15 = i14 >> 9;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m22549SurfaceT9BRK9s(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifierThen, anchoredDraggableState$material3_release, orientation, (InterfaceC10574p) objRememberedValue3), sheetState.getAnchoredDraggableState$material3_release(), orientation, z10, false, null, 24, null), shape, j10, j11, f12, f13, null, ComposableLambdaKt.rememberComposableLambda(390720907, true, new InterfaceC10574p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
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
                        ComposerKt.traceEventStart(390720907, i16, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier.Companion companion3 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
                    final SheetState sheetState2 = sheetState;
                    final boolean z11 = z10;
                    final InterfaceC8822b0 interfaceC8822b03 = interfaceC8822b02;
                    InterfaceC10575q interfaceC10575q2 = interfaceC10575q;
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion4 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion4.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    InterfaceC10559a constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer3);
                    Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    InterfaceC10574p setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1168080147);
                    if (interfaceC10574p2 != null) {
                        Strings.Companion companion6 = Strings.Companion;
                        final String strM22987getString2EP1pXo = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                        final String strM22987getString2EP1pXo2 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                        final String strM22987getString2EP1pXo3 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                        Modifier modifierAlign = columnScopeInstance.align(companion3, companion4.getCenterHorizontally());
                        boolean zChanged3 = composer3.changed(sheetState2) | composer3.changed(z11) | composer3.changed(strM22987getString2EP1pXo3) | composer3.changedInstance(interfaceC8822b03) | composer3.changed(strM22987getString2EP1pXo) | composer3.changed(strM22987getString2EP1pXo2);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new InterfaceC10570l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p300x7.InterfaceC10570l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((SemanticsPropertyReceiver) obj2);
                                    return C8736p.f16368a;
                                }

                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z12 = z11;
                                    String str = strM22987getString2EP1pXo3;
                                    String str2 = strM22987getString2EP1pXo;
                                    String str3 = strM22987getString2EP1pXo2;
                                    final InterfaceC8822b0 interfaceC8822b04 = interfaceC8822b03;
                                    if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z12) {
                                        return;
                                    }
                                    SheetValue currentValue = sheetState3.getCurrentValue();
                                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                    if (currentValue == sheetValue) {
                                        if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded)).booleanValue()) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new InterfaceC10559a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1

                                                @InterfaceC9539d(m17800c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", m17801f = "BottomSheetScaffold.kt", m17802l = {311}, m17803m = "invokeSuspend")
                                                /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1 */
                                                public static final class C20291 extends SuspendLambda implements InterfaceC10574p {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C20291(SheetState sheetState, InterfaceC9324c<? super C20291> interfaceC9324c) {
                                                        super(2, interfaceC9324c);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                                        return new C20291(this.$this_with, interfaceC9324c);
                                                    }

                                                    @Override // p300x7.InterfaceC10574p
                                                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                                        return ((C20291) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) throws Throwable {
                                                        Object objM17291f = AbstractC9434a.m17291f();
                                                        int i10 = this.label;
                                                        if (i10 == 0) {
                                                            AbstractC9079b.m15926b(obj);
                                                            SheetState sheetState = this.$this_with;
                                                            this.label = 1;
                                                            if (sheetState.expand(this) == objM17291f) {
                                                                return objM17291f;
                                                            }
                                                        } else {
                                                            if (i10 != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            AbstractC9079b.m15926b(obj);
                                                        }
                                                        return C8736p.f16368a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // p300x7.InterfaceC10559a
                                                public final Boolean invoke() {
                                                    AbstractC8839h.m14861d(interfaceC8822b04, null, null, new C20291(sheetState3, null), 3, null);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                    } else if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue)).booleanValue()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new InterfaceC10559a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2

                                            @InterfaceC9539d(m17800c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", m17801f = "BottomSheetScaffold.kt", m17802l = {320}, m17803m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1 */
                                            public static final class C20301 extends SuspendLambda implements InterfaceC10574p {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C20301(SheetState sheetState, InterfaceC9324c<? super C20301> interfaceC9324c) {
                                                    super(2, interfaceC9324c);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                                    return new C20301(this.$this_with, interfaceC9324c);
                                                }

                                                @Override // p300x7.InterfaceC10574p
                                                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                                    return ((C20301) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) throws Throwable {
                                                    Object objM17291f = AbstractC9434a.m17291f();
                                                    int i10 = this.label;
                                                    if (i10 == 0) {
                                                        AbstractC9079b.m15926b(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.partialExpand(this) == objM17291f) {
                                                            return objM17291f;
                                                        }
                                                    } else {
                                                        if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        AbstractC9079b.m15926b(obj);
                                                    }
                                                    return C8736p.f16368a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // p300x7.InterfaceC10559a
                                            public final Boolean invoke() {
                                                AbstractC8839h.m14861d(interfaceC8822b04, null, null, new C20301(sheetState3, null), 3, null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState$material3_release()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new InterfaceC10559a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3

                                        @InterfaceC9539d(m17800c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", m17801f = "BottomSheetScaffold.kt", m17802l = {TbsListener.ErrorCode.TEST_THROWABLE_ISNOT_NULL}, m17803m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1 */
                                        public static final class C20311 extends SuspendLambda implements InterfaceC10574p {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C20311(SheetState sheetState, InterfaceC9324c<? super C20311> interfaceC9324c) {
                                                super(2, interfaceC9324c);
                                                this.$this_with = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                                return new C20311(this.$this_with, interfaceC9324c);
                                            }

                                            @Override // p300x7.InterfaceC10574p
                                            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                                return ((C20311) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) throws Throwable {
                                                Object objM17291f = AbstractC9434a.m17291f();
                                                int i10 = this.label;
                                                if (i10 == 0) {
                                                    AbstractC9079b.m15926b(obj);
                                                    SheetState sheetState = this.$this_with;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == objM17291f) {
                                                        return objM17291f;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    AbstractC9079b.m15926b(obj);
                                                }
                                                return C8736p.f16368a;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // p300x7.InterfaceC10559a
                                        public final Boolean invoke() {
                                            AbstractC8839h.m14861d(interfaceC8822b04, null, null, new C20311(sheetState3, null), 3, null);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (InterfaceC10570l) objRememberedValue4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                        InterfaceC10559a constructor2 = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM23703constructorimpl2 = Updater.m23703constructorimpl(composer3);
                        Updater.m23710setimpl(composerM23703constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m23710setimpl(composerM23703constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        InterfaceC10574p setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM23703constructorimpl2.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM23703constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM23703constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m23710setimpl(composerM23703constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        interfaceC10574p2.invoke(composer3, 0);
                        composer3.endNode();
                    }
                    composer3.endReplaceGroup();
                    interfaceC10575q2.invoke(columnScopeInstance, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i15 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | 12582912 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i16) {
                    BottomSheetScaffoldKt.m21775StandardBottomSheetw7I5h1o(sheetState, f10, f11, z10, shape, j10, j11, f12, f13, interfaceC10574p, interfaceC10575q, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
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
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i10 & 6) == 4) | ((((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i10 & 48) == 32);
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
    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, InterfaceC10570l interfaceC10570l, boolean z10, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i11 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i10, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, interfaceC10570l2, sheetValue2, z11, composer, (i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | ((i10 << 6) & 896) | ((i10 << 3) & 7168), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}

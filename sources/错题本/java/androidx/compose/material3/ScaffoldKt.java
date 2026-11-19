package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0087\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Lr6/e;IJJLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILr6/e;Lr6/f;Lr6/e;Lr6/e;Landroidx/compose/foundation/layout/WindowInsets;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/ui/unit/Dp;", "FabSpacing", "F", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,355:1\n1223#2,6:356\n1223#2,6:362\n1223#2,6:368\n148#3:374\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n96#1:356,6\n99#1:362,6\n140#1:368,6\n346#1:374\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = C2331Dp.m13305constructorimpl(16);

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
    public static final void m8814ScaffoldTvnljyQ(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r29, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r30, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r31, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r32, int r33, long r34, long r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r38, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m8814ScaffoldTvnljyQ(androidx.compose.ui.Modifier, r6.e, r6.e, r6.e, r6.e, int, long, long, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m8815ScaffoldLayoutFMILGgc(final int i, final InterfaceC6473e interfaceC6473e, final InterfaceC6474f interfaceC6474f, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final WindowInsets windowInsets, final InterfaceC6473e interfaceC6473e4, Composer composer, final int i8) {
        int i9;
        InterfaceC6474f interfaceC6474f2;
        InterfaceC6473e interfaceC6473e5;
        final WindowInsets windowInsets2;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            interfaceC6474f2 = interfaceC6474f;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f2) ? 256 : 128;
        } else {
            interfaceC6474f2 = interfaceC6474f;
        }
        if ((i8 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            interfaceC6473e5 = interfaceC6473e3;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 16384 : 8192;
        } else {
            interfaceC6473e5 = interfaceC6473e3;
        }
        if ((196608 & i8) == 0) {
            windowInsets2 = windowInsets;
            i9 |= composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i8 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 1048576 : 524288;
        }
        if ((i9 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i9, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z8 = ((i9 & 112) == 32) | ((i9 & 7168) == 2048) | ((458752 & i9) == 131072) | ((57344 & i9) == 16384) | ((i9 & 14) == 4) | ((3670016 & i9) == 1048576) | ((i9 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final InterfaceC6474f interfaceC6474f3 = interfaceC6474f2;
                i10 = 1;
                final InterfaceC6473e interfaceC6473e6 = interfaceC6473e5;
                InterfaceC6473e interfaceC6473e7 = new InterfaceC6473e() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m8817invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m8817invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j7) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i11;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Object obj5;
                        Object obj6;
                        int iMo6897roundToPx0680j_4;
                        int iMo6897roundToPx0680j_42;
                        final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
                        final int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
                        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, interfaceC6473e);
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            arrayList.add(listSubcompose.get(i12).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height = ((Placeable) obj).getHeight();
                            int iM5282u = AbstractC5806u.m5282u(arrayList);
                            if (1 <= iM5282u) {
                                int i13 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i13);
                                    int height2 = ((Placeable) obj7).getHeight();
                                    if (height < height2) {
                                        obj = obj7;
                                        height = height2;
                                    }
                                    if (i13 == iM5282u) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height3 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, interfaceC6473e2);
                        WindowInsets windowInsets3 = windowInsets2;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            arrayList2.add(listSubcompose2.get(i14).mo12033measureBRTryo0(ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i14++;
                            arrayList = arrayList;
                            listSubcompose2 = listSubcompose2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height4 = ((Placeable) obj2).getHeight();
                            int iM5282u2 = AbstractC5806u.m5282u(arrayList2);
                            if (1 <= iM5282u2) {
                                Object obj8 = obj2;
                                int i15 = height4;
                                int i16 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i16);
                                    int height5 = ((Placeable) obj9).getHeight();
                                    if (i15 < height5) {
                                        obj8 = obj9;
                                        i15 = height5;
                                    }
                                    if (i16 == iM5282u2) {
                                        break;
                                    }
                                    i16++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int iM5282u3 = AbstractC5806u.m5282u(arrayList2);
                            if (1 <= iM5282u3) {
                                Object obj10 = obj3;
                                int i17 = width;
                                int i18 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i18);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i17 < width2) {
                                        obj10 = obj11;
                                        i17 = width2;
                                    }
                                    if (i18 == iM5282u3) {
                                        break;
                                    }
                                    i18++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, interfaceC6473e6);
                        WindowInsets windowInsets4 = windowInsets2;
                        final int i19 = width3;
                        final ArrayList arrayList4 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i20 = 0;
                        while (i20 < size3) {
                            int i21 = height6;
                            List<Measurable> list = listSubcompose3;
                            Placeable placeableMo12033measureBRTryo0 = listSubcompose3.get(i20).mo12033measureBRTryo0(ConstraintsKt.m13277offsetNN6EwU(jM13248copyZbe2FdA$default, (-windowInsets4.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope)));
                            if (placeableMo12033measureBRTryo0.getHeight() == 0 || placeableMo12033measureBRTryo0.getWidth() == 0) {
                                placeableMo12033measureBRTryo0 = null;
                            }
                            if (placeableMo12033measureBRTryo0 != null) {
                                arrayList4.add(placeableMo12033measureBRTryo0);
                            }
                            i20++;
                            height6 = i21;
                            listSubcompose3 = list;
                        }
                        int i22 = height6;
                        if (arrayList4.isEmpty()) {
                            i11 = height3;
                            fabPlacement = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int iM5282u4 = AbstractC5806u.m5282u(arrayList4);
                                if (1 <= iM5282u4) {
                                    Object obj12 = obj5;
                                    int i23 = width4;
                                    int i24 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i24);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i23 < width5) {
                                            obj12 = obj13;
                                            i23 = width5;
                                        }
                                        if (i24 == iM5282u4) {
                                            break;
                                        }
                                        i24++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            AbstractC5830k.m5327d(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList4.isEmpty()) {
                                i11 = height3;
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int height7 = ((Placeable) obj6).getHeight();
                                int iM5282u5 = AbstractC5806u.m5282u(arrayList4);
                                if (1 <= iM5282u5) {
                                    Object obj14 = obj6;
                                    int i25 = height7;
                                    int i26 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i26);
                                        i11 = height3;
                                        int height8 = ((Placeable) obj15).getHeight();
                                        if (i25 < height8) {
                                            i25 = height8;
                                            obj14 = obj15;
                                        }
                                        if (i26 == iM5282u5) {
                                            break;
                                        }
                                        i26++;
                                        height3 = i11;
                                    }
                                    obj6 = obj14;
                                } else {
                                    i11 = height3;
                                }
                            }
                            AbstractC5830k.m5327d(obj6);
                            int height9 = ((Placeable) obj6).getHeight();
                            int i27 = i;
                            FabPosition.Companion companion = FabPosition.INSTANCE;
                            if (!FabPosition.m8500equalsimpl0(i27, companion.m8507getStartERTFSPs())) {
                                if (!(FabPosition.m8500equalsimpl0(i27, companion.m8505getEndERTFSPs()) ? true : FabPosition.m8500equalsimpl0(i27, companion.m8506getEndOverlayERTFSPs()))) {
                                    iMo6897roundToPx0680j_4 = (iM13258getMaxWidthimpl - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo6897roundToPx0680j_42 = subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo6897roundToPx0680j_4 = (iM13258getMaxWidthimpl - iMo6897roundToPx0680j_42) - width6;
                                } else {
                                    iMo6897roundToPx0680j_4 = subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                fabPlacement = new FabPlacement(iMo6897roundToPx0680j_4, width6, height9);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                iMo6897roundToPx0680j_4 = subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                fabPlacement = new FabPlacement(iMo6897roundToPx0680j_4, width6, height9);
                            } else {
                                iMo6897roundToPx0680j_42 = subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                iMo6897roundToPx0680j_4 = (iM13258getMaxWidthimpl - iMo6897roundToPx0680j_42) - width6;
                                fabPlacement = new FabPlacement(iMo6897roundToPx0680j_4, width6, height9);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final InterfaceC6473e interfaceC6473e8 = interfaceC6473e4;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-2146438447, true, new InterfaceC6473e() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            {
                                super(2);
                            }

                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj16, Object obj17) {
                                invoke((Composer) obj16, ((Number) obj17).intValue());
                                return C5443s.f8405a;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i28) {
                                if ((i28 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i28, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                interfaceC6473e8.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            arrayList5.add(listSubcompose4.get(i28).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int height10 = ((Placeable) obj4).getHeight();
                            int iM5282u6 = AbstractC5806u.m5282u(arrayList5);
                            if (1 <= iM5282u6) {
                                int i29 = 1;
                                while (true) {
                                    Object obj16 = arrayList5.get(i29);
                                    int height11 = ((Placeable) obj16).getHeight();
                                    if (height10 < height11) {
                                        height10 = height11;
                                        obj4 = obj16;
                                    }
                                    if (i29 == iM5282u6) {
                                        break;
                                    }
                                    i29++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        Integer numValueOf2 = fabPlacement != null ? Integer.valueOf((numValueOf == null || FabPosition.m8500equalsimpl0(i, FabPosition.INSTANCE.m8506getEndOverlayERTFSPs())) ? windowInsets2.getBottom(subcomposeMeasureScope) + subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() : subcomposeMeasureScope.mo6897roundToPx0680j_4(ScaffoldKt.FabSpacing) + fabPlacement.getHeight() + numValueOf.intValue()) : null;
                        int iIntValue = i22 != 0 ? i22 + (numValueOf2 != null ? numValueOf2.intValue() : numValueOf != null ? numValueOf.intValue() : windowInsets2.getBottom(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets5 = windowInsets2;
                        final InterfaceC6474f interfaceC6474f4 = interfaceC6474f3;
                        final int i30 = i11;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1213360416, true, new InterfaceC6473e() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj17, Object obj18) {
                                invoke((Composer) obj17, ((Number) obj18).intValue());
                                return C5443s.f8405a;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i31) {
                                Integer num;
                                if ((i31 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1213360416, i31, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                }
                                PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope);
                                interfaceC6474f4.invoke(PaddingKt.m7258PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), arrayList3.isEmpty() ? paddingValuesAsPaddingValues.getTop() : subcomposeMeasureScope.mo6900toDpu2uoSUM(i30), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (arrayList5.isEmpty() || (num = numValueOf) == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope.mo6900toDpu2uoSUM(num.intValue())), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i31 = 0; i31 < size5; i31++) {
                            arrayList6.add(listSubcompose5.get(i31).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        final Integer num = numValueOf;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final Integer num2 = numValueOf2;
                        final int i32 = iIntValue;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13258getMaxWidthimpl, iM13257getMaxHeightimpl, null, new InterfaceC6471c() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                                invoke((Placeable.PlacementScope) obj17);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                List<Placeable> list2 = arrayList6;
                                int size6 = list2.size();
                                for (int i33 = 0; i33 < size6; i33++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i33), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList3;
                                int size7 = list3.size();
                                for (int i34 = 0; i34 < size7; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i34), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList2;
                                int i35 = iM13258getMaxWidthimpl;
                                int i36 = i19;
                                WindowInsets windowInsets7 = windowInsets6;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i37 = iM13257getMaxHeightimpl;
                                int i38 = i32;
                                int size8 = list4.size();
                                for (int i39 = 0; i39 < size8; i39++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i39), windowInsets7.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()) + ((i35 - i36) / 2), i37 - i38, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList5;
                                int i40 = iM13257getMaxHeightimpl;
                                Integer num3 = num;
                                int size9 = list5.size();
                                for (int i41 = 0; i41 < size9; i41++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i41), 0, i40 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList4;
                                    int i42 = iM13257getMaxHeightimpl;
                                    Integer num4 = num2;
                                    int size10 = list6.size();
                                    for (int i43 = 0; i43 < size10; i43++) {
                                        Placeable placeable5 = list6.get(i43);
                                        int left = fabPlacement3.getLeft();
                                        AbstractC5830k.m5327d(num4);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i42 - num4.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC6473e7);
                objRememberedValue = interfaceC6473e7;
            } else {
                i10 = 1;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (InterfaceC6473e) objRememberedValue, composerStartRestartGroup, 0, i10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    ScaffoldKt.m8815ScaffoldLayoutFMILGgc(i, interfaceC6473e, interfaceC6474f, interfaceC6473e2, interfaceC6473e3, windowInsets, interfaceC6473e4, composer2, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }
}

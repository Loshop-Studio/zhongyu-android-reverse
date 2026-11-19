package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.layout.SubcomposeLayoutKt;
import androidx.compose.p006ui.layout.SubcomposeMeasureScope;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a´\u0001\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u008a\u0001\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00132\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m5175d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material3.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = C1700Dp.m11525constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8097ScaffoldTvnljyQ(androidx.compose.p006ui.Modifier r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, int r34, long r35, long r37, androidx.compose.foundation.layout.WindowInsets r39, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m8097ScaffoldTvnljyQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m8098ScaffoldLayoutFMILGgc(final int i4, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        int i7 = (i5 & 14) == 0 ? (composerStartRestartGroup.changed(i4) ? 4 : 2) | i5 : i5;
        if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i7 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i5) == 0) {
            i7 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i5) == 0) {
            i7 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            i7 |= composerStartRestartGroup.changed(function24) ? 1048576 : 524288;
        }
        final int i8 = i7;
        if ((2995931 & i8) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i8, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:113)");
            }
            Object[] objArr = {function2, function22, windowInsets, function23, FabPosition.m7976boximpl(i4), function24, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i9 = 0;
            boolean zChanged = false;
            for (int i10 = 7; i9 < i10; i10 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i9]);
                i9++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i6 = 0;
                composer2 = composerStartRestartGroup;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function25 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m8100invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m8100invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, long j4) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
                        final int iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
                        final long jM11484copyZbe2FdA$default = Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function26 = function2;
                        final Function2<Composer, Integer, Unit> function27 = function22;
                        final Function2<Composer, Integer, Unit> function28 = function23;
                        final int i11 = i4;
                        final WindowInsets windowInsets2 = windowInsets;
                        final Function2<Composer, Integer, Unit> function29 = function24;
                        final int i12 = i8;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.CC.m634p(SubcomposeLayout, iM11493getMaxWidthimpl, iM11492getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Object next;
                                Object next2;
                                Object next3;
                                final FabPlacement fabPlacement;
                                Object next4;
                                Integer numValueOf;
                                Object next5;
                                Object next6;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, function26);
                                long j5 = jM11484copyZbe2FdA$default;
                                final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose, 10));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo10585measureBRTryo0(j5));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        do {
                                            Object next7 = it2.next();
                                            int height2 = ((Placeable) next7).getHeight();
                                            if (height < height2) {
                                                next = next7;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                final int height3 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, function27);
                                WindowInsets windowInsets3 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                long j6 = jM11484copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose2, 10));
                                Iterator<T> it3 = listSubcompose2.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((Measurable) it3.next()).mo10585measureBRTryo0(ConstraintsKt.m11509offsetNN6EwU(j6, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                                }
                                Iterator it4 = arrayList2.iterator();
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (it4.hasNext()) {
                                        int height4 = ((Placeable) next2).getHeight();
                                        do {
                                            Object next8 = it4.next();
                                            int height5 = ((Placeable) next8).getHeight();
                                            if (height4 < height5) {
                                                next2 = next8;
                                                height4 = height5;
                                            }
                                        } while (it4.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                Placeable placeable2 = (Placeable) next2;
                                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                                Iterator it5 = arrayList2.iterator();
                                if (it5.hasNext()) {
                                    next3 = it5.next();
                                    if (it5.hasNext()) {
                                        int width = ((Placeable) next3).getWidth();
                                        do {
                                            Object next9 = it5.next();
                                            int width2 = ((Placeable) next9).getWidth();
                                            if (width < width2) {
                                                next3 = next9;
                                                width = width2;
                                            }
                                        } while (it5.hasNext());
                                    }
                                } else {
                                    next3 = null;
                                }
                                Placeable placeable3 = (Placeable) next3;
                                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                List<Measurable> listSubcompose3 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, function28);
                                WindowInsets windowInsets4 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                long j7 = jM11484copyZbe2FdA$default;
                                ArrayList<Placeable> arrayList3 = new ArrayList();
                                Iterator<T> it6 = listSubcompose3.iterator();
                                while (it6.hasNext()) {
                                    Placeable placeableMo10585measureBRTryo0 = ((Measurable) it6.next()).mo10585measureBRTryo0(ConstraintsKt.m11509offsetNN6EwU(j7, (-windowInsets4.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope2)));
                                    if (!((placeableMo10585measureBRTryo0.getHeight() == 0 || placeableMo10585measureBRTryo0.getWidth() == 0) ? false : true)) {
                                        placeableMo10585measureBRTryo0 = null;
                                    }
                                    if (placeableMo10585measureBRTryo0 != null) {
                                        arrayList3.add(placeableMo10585measureBRTryo0);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    Iterator it7 = arrayList3.iterator();
                                    if (it7.hasNext()) {
                                        next5 = it7.next();
                                        if (it7.hasNext()) {
                                            int width4 = ((Placeable) next5).getWidth();
                                            do {
                                                Object next10 = it7.next();
                                                int width5 = ((Placeable) next10).getWidth();
                                                if (width4 < width5) {
                                                    next5 = next10;
                                                    width4 = width5;
                                                }
                                            } while (it7.hasNext());
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                    Intrinsics.checkNotNull(next5);
                                    int width6 = ((Placeable) next5).getWidth();
                                    Iterator it8 = arrayList3.iterator();
                                    if (it8.hasNext()) {
                                        next6 = it8.next();
                                        if (it8.hasNext()) {
                                            int height7 = ((Placeable) next6).getHeight();
                                            do {
                                                Object next11 = it8.next();
                                                int height8 = ((Placeable) next11).getHeight();
                                                if (height7 < height8) {
                                                    next6 = next11;
                                                    height7 = height8;
                                                }
                                            } while (it8.hasNext());
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                    Intrinsics.checkNotNull(next6);
                                    fabPlacement = new FabPlacement(FabPosition.m7979equalsimpl0(i11, FabPosition.INSTANCE.m7984getEndERTFSPs()) ? SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? (iM11493getMaxWidthimpl - SubcomposeLayout.mo7200roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width6 : SubcomposeLayout.mo7200roundToPx0680j_4(ScaffoldKt.FabSpacing) : (iM11493getMaxWidthimpl - width6) / 2, width6, ((Placeable) next6).getHeight());
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function210 = function29;
                                final int i13 = i12;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1455477816, i14, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:195)");
                                        }
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, function210, composer3, ((i13 >> 15) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j8 = jM11484copyZbe2FdA$default;
                                final ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose4, 10));
                                Iterator<T> it9 = listSubcompose4.iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(((Measurable) it9.next()).mo10585measureBRTryo0(j8));
                                }
                                Iterator it10 = arrayList4.iterator();
                                if (it10.hasNext()) {
                                    next4 = it10.next();
                                    if (it10.hasNext()) {
                                        int height9 = ((Placeable) next4).getHeight();
                                        while (true) {
                                            Object next12 = it10.next();
                                            int height10 = ((Placeable) next12).getHeight();
                                            if (height9 < height10) {
                                                next4 = next12;
                                                height9 = height10;
                                            }
                                            if (!it10.hasNext()) {
                                                break;
                                            } else {
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                    }
                                } else {
                                    next4 = null;
                                }
                                Placeable placeable4 = (Placeable) next4;
                                Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope4 = SubcomposeLayout;
                                    numValueOf = Integer.valueOf(numValueOf2 == null ? fabPlacement.getHeight() + subcomposeMeasureScope4.mo7200roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets2.getBottom(subcomposeMeasureScope4) : numValueOf2.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope4.mo7200roundToPx0680j_4(ScaffoldKt.FabSpacing));
                                } else {
                                    numValueOf = null;
                                }
                                int iIntValue = height6 != 0 ? height6 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(SubcomposeLayout)) : 0;
                                final SubcomposeMeasureScope subcomposeMeasureScope5 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final WindowInsets windowInsets5 = windowInsets2;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                final int i14 = i12;
                                ArrayList arrayList5 = arrayList2;
                                final Integer num = numValueOf2;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                        invoke(composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(Composer composer3, int i15) {
                                        Integer num2;
                                        if ((i15 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1643221465, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:222)");
                                        }
                                        PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope5);
                                        function33.invoke(PaddingKt.m7312PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope5.getLayoutDirection()), arrayList.isEmpty() ? paddingValuesAsPaddingValues.getTop() : subcomposeMeasureScope5.mo7203toDpu2uoSUM(height3), PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope5.getLayoutDirection()), (arrayList4.isEmpty() || (num2 = num) == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope5.mo7203toDpu2uoSUM(num2.intValue())), composer3, Integer.valueOf((i14 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j9 = jM11484copyZbe2FdA$default;
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose5, 10));
                                Iterator<T> it11 = listSubcompose5.iterator();
                                while (it11.hasNext()) {
                                    arrayList6.add(((Measurable) it11.next()).mo10585measureBRTryo0(j9));
                                }
                                Iterator it12 = arrayList6.iterator();
                                while (it12.hasNext()) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) it12.next(), 0, 0, 0.0f, 4, null);
                                    arrayList = arrayList;
                                    arrayList4 = arrayList4;
                                }
                                ArrayList arrayList7 = arrayList4;
                                Iterator it13 = arrayList.iterator();
                                while (it13.hasNext()) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) it13.next(), 0, 0, 0.0f, 4, null);
                                }
                                int i15 = iM11493getMaxWidthimpl;
                                WindowInsets windowInsets6 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope6 = SubcomposeLayout;
                                int i16 = iM11492getMaxHeightimpl;
                                Iterator it14 = arrayList5.iterator();
                                while (it14.hasNext()) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) it14.next(), windowInsets6.getLeft(subcomposeMeasureScope6, subcomposeMeasureScope6.getLayoutDirection()) + ((i15 - width3) / 2), i16 - iIntValue, 0.0f, 4, null);
                                }
                                int i17 = iM11492getMaxHeightimpl;
                                Iterator it15 = arrayList7.iterator();
                                while (it15.hasNext()) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) it15.next(), 0, i17 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i18 = iM11492getMaxHeightimpl;
                                    for (Placeable placeable5 : arrayList3) {
                                        int left = fabPlacement.getLeft();
                                        Intrinsics.checkNotNull(numValueOf);
                                        Placeable.PlacementScope.place$default(layout, placeable5, left, i18 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(function25);
                objRememberedValue = function25;
            } else {
                i6 = 0;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composer2, i6, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11) {
                ScaffoldKt.m8098ScaffoldLayoutFMILGgc(i4, function2, function3, function22, function23, windowInsets, function24, composer3, i5 | 1);
            }
        });
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}

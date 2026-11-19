package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
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
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u008a\u0002\u0010!\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010%\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&\u001a9\u0010+\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00002\b\b\u0002\u0010*\u001a\u00020\u0016H\u0007¢\u0006\u0004\b+\u0010,\u001a\u008d\u0001\u00105\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u008e\u0001\u0010=\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00142\u0006\u0010:\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-sdMYb0k", "(Lr6/f;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLr6/e;ZLr6/e;Lr6/f;JJLr6/f;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lr6/c;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "state", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-w7I5h1o", "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLr6/e;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "StandardBottomSheet", "body", "bottomSheet", "", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-2E65NiM", "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,410:1\n148#2:411\n1223#3,6:412\n1223#3,6:418\n1223#3,6:424\n1223#3,3:435\n1226#3,3:441\n1223#3,6:447\n1223#3,6:453\n1223#3,6:459\n1223#3,6:473\n488#4:430\n487#4,4:431\n491#4,2:438\n495#4:444\n487#5:440\n77#6:445\n1#7:446\n170#8:465\n168#8,7:466\n78#8,6:479\n85#8,4:494\n89#8,2:504\n93#8:509\n176#8:510\n368#9,9:485\n377#9,3:506\n4032#10,6:498\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n119#1:411\n134#1:412,6\n180#1:418,6\n182#1:424,6\n226#1:435,3\n226#1:441,3\n232#1:447,6\n249#1:453,6\n371#1:459,6\n356#1:473,6\n226#1:430\n226#1:431,4\n226#1:438,2\n226#1:444\n226#1:440\n228#1:445\n356#1:465\n356#1:466,7\n356#1:479,6\n356#1:494,4\n356#1:504,2\n356#1:509\n356#1:510\n356#1:485,9\n356#1:506,3\n356#1:498,6\n*E\n"})
/* loaded from: classes.dex */
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
    public static final void m8179BottomSheetScaffoldsdMYb0k(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r34, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r35, @org.jetbrains.annotations.Nullable androidx.compose.material3.BottomSheetScaffoldState r36, float r37, float r38, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r39, long r40, long r42, float r44, float r45, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r46, boolean r47, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r48, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r49, long r50, long r52, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r54, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m8179BottomSheetScaffoldsdMYb0k(r6.f, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, float, androidx.compose.ui.graphics.Shape, long, long, float, float, r6.e, boolean, r6.e, r6.f, long, long, r6.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-2E65NiM, reason: not valid java name */
    public static final void m8180BottomSheetScaffoldLayout2E65NiM(final Modifier modifier, final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final InterfaceC6473e interfaceC6473e4, final InterfaceC6469a interfaceC6469a, final SheetState sheetState, final long j7, final long j8, Composer composer, final int i) {
        int i8;
        InterfaceC6473e interfaceC6473e5;
        char c;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651214892);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            interfaceC6473e5 = interfaceC6473e2;
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 256 : 128;
        } else {
            interfaceC6473e5 = interfaceC6473e2;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(sheetState) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            c = 2;
            i8 |= composerStartRestartGroup.changed(j8) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            c = 2;
        }
        char c9 = c;
        if ((i8 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651214892, i8, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            InterfaceC6473e interfaceC6473eM8346getLambda3$material3_release = interfaceC6473e == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m8346getLambda3$material3_release() : interfaceC6473e;
            final InterfaceC6473e interfaceC6473e6 = interfaceC6473e5;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(398963586, true, new InterfaceC6473e() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398963586, i9, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                    }
                    SurfaceKt.m8955SurfaceT9BRK9s(modifier, null, j7, j8, 0.0f, 0.0f, null, interfaceC6473e6, composer2, 0, 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            InterfaceC6473e[] interfaceC6473eArr = new InterfaceC6473e[4];
            interfaceC6473eArr[0] = interfaceC6473eM8346getLambda3$material3_release;
            interfaceC6473eArr[1] = composableLambdaRememberComposableLambda;
            interfaceC6473eArr[c9] = interfaceC6473e3;
            interfaceC6473eArr[3] = interfaceC6473e4;
            List listM5287z = AbstractC5806u.m5287z(interfaceC6473eArr);
            boolean z8 = ((3670016 & i8) == 1048576) | ((i8 & 458752) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7209measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j9) {
                        Integer numValueOf;
                        List<? extends Measurable> list2 = list.get(0);
                        int i9 = 1;
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j9);
                        final int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j9);
                        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j9, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            arrayList.add(list4.get(i10).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            arrayList2.add(list2.get(i11).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        if (arrayList2.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                            int iM5282u = AbstractC5806u.m5282u(arrayList2);
                            if (1 <= iM5282u) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i9)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i9 == iM5282u) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jM13248copyZbe2FdA$default2 = Constraints.m13248copyZbe2FdA$default(jM13248copyZbe2FdA$default, 0, 0, 0, iM13257getMaxHeightimpl - iIntValue, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            arrayList3.add(list3.get(i12).mo12033measureBRTryo0(jM13248copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            arrayList4.add(list5.get(i13).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                        }
                        final SheetState sheetState2 = sheetState;
                        final InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
                        return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iM13257getMaxHeightimpl, null, new InterfaceC6471c() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iM6241q;
                                List<Placeable> list6 = arrayList;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(list6.get(0).getWidth());
                                    int iM5282u2 = AbstractC5806u.m5282u(list6);
                                    if (1 <= iM5282u2) {
                                        int i14 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(list6.get(i14).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i14 == iM5282u2) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                                int iMax = Integer.max(0, (iM13258getMaxWidthimpl - (numValueOf3 != null ? numValueOf3.intValue() : 0)) / 2);
                                List<Placeable> list7 = arrayList4;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(list7.get(0).getWidth());
                                    int iM5282u3 = AbstractC5806u.m5282u(list7);
                                    if (1 <= iM5282u3) {
                                        int i15 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(list7.get(i15).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i15 == iM5282u3) {
                                                break;
                                            } else {
                                                i15++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                List<Placeable> list8 = arrayList4;
                                if (!list8.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(list8.get(0).getHeight());
                                    int iM5282u4 = AbstractC5806u.m5282u(list8);
                                    if (1 <= iM5282u4) {
                                        int i16 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(list8.get(i16).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i16 == iM5282u4) {
                                                break;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i17 = (iM13258getMaxWidthimpl - iIntValue2) / 2;
                                int i18 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i18 == 1) {
                                    iM6241q = AbstractC6600a.m6241q(((Number) interfaceC6469a2.invoke()).floatValue());
                                } else {
                                    if (i18 != 2 && i18 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iM6241q = iM13257getMaxHeightimpl;
                                }
                                int i19 = iM6241q - iIntValue3;
                                List<Placeable> list9 = arrayList3;
                                int i20 = iIntValue;
                                int size5 = list9.size();
                                for (int i21 = 0; i21 < size5; i21++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i21), 0, i20, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList2;
                                int size6 = list10.size();
                                for (int i22 = 0; i22 < size6; i22++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i22), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList;
                                int size7 = list11.size();
                                for (int i23 = 0; i23 < size7; i23++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i23), iMax, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list12 = arrayList4;
                                int size8 = list12.size();
                                for (int i24 = 0; i24 < size8; i24++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list12.get(i24), i17, i19, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            InterfaceC6473e interfaceC6473eCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM5287z);
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            interfaceC6473eCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    BottomSheetScaffoldKt.m8180BottomSheetScaffoldLayout2E65NiM(modifier, interfaceC6473e, interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, interfaceC6469a, sheetState, j7, j8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m8181StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f, final float f7, final boolean z8, final Shape shape, final long j7, final long j8, final float f8, final float f9, final InterfaceC6473e interfaceC6473e, final InterfaceC6474f interfaceC6474f, Composer composer, final int i, final int i8) {
        int i9;
        int i10;
        InterfaceC6009v interfaceC6009v;
        int i11;
        Object obj;
        Modifier modifierNestedScroll$default;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(721467526);
        if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(f7) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i9 |= composerStartRestartGroup.changed(j7) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i9 |= composerStartRestartGroup.changed(j8) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changed(f8) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changed(f9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changedInstance(interfaceC6474f) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i9 & 306783379) == 306783378 && (i10 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721467526, i9, i10, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            final InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Orientation orientation = Orientation.Vertical;
            final float fMo6903toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(f);
            composerStartRestartGroup.startReplaceGroup(-1831611516);
            if (z8) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChanged = composerStartRestartGroup.changed(sheetState.getAnchoredDraggableState$material3_release());
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    i11 = i9;
                } else {
                    i11 = i9;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    interfaceC6009v = coroutineScope;
                    obj = null;
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                }
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new InterfaceC6471c() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                    @DebugMetadata(m5302c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", m5303f = "BottomSheetScaffold.kt", m5304i = {}, m5305l = {236}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1 */
                    public static final class C15421 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C15421(SheetState sheetState, float f, InterfaceC5631c<? super C15421> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = sheetState;
                            this.$it = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                            return new C15421(this.$state, this.$it, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                SheetState sheetState = this.$state;
                                float f = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC5774b.m5119b(obj);
                            }
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        @Nullable
                        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C15421) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).floatValue());
                        return C5443s.f8405a;
                    }

                    public final void invoke(float f10) {
                        AbstractC6014x.m5651v(coroutineScope, null, null, new C15421(sheetState, f10, null), 3);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                interfaceC6009v = coroutineScope;
                obj = null;
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) objRememberedValue2, null, 2, null);
            } else {
                interfaceC6009v = coroutineScope;
                i11 = i9;
                obj = null;
                modifierNestedScroll$default = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.m7300requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m7316widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f7, 1, obj), 0.0f, 1, obj), f, 0.0f, 2, obj).then(modifierNestedScroll$default);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            boolean zChanged2 = ((i11 & 14) == 4) | composerStartRestartGroup.changed(fMo6903toPx0680j_4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC6473e() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        return m8184invokeGpV2Q24(((IntSize) obj2).m13480unboximpl(), ((Constraints) obj3).getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r4
                      0x003c: PHI (r4v7 androidx.compose.material3.SheetValue) = 
                      (r4v5 androidx.compose.material3.SheetValue)
                      (r4v8 androidx.compose.material3.SheetValue)
                      (r4v9 androidx.compose.material3.SheetValue)
                      (r4v10 androidx.compose.material3.SheetValue)
                      (r4v11 androidx.compose.material3.SheetValue)
                      (r4v12 androidx.compose.material3.SheetValue)
                      (r4v13 androidx.compose.material3.SheetValue)
                     binds: [B:29:0x0077, B:20:0x005c, B:23:0x0065, B:26:0x006e, B:9:0x003a, B:12:0x0044, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    @org.jetbrains.annotations.NotNull
                    /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final kotlin.Pair<androidx.compose.material3.internal.DraggableAnchors<androidx.compose.material3.SheetValue>, androidx.compose.material3.SheetValue> m8184invokeGpV2Q24(long r2, long r4) {
                        /*
                            r1 = this;
                            int r4 = androidx.compose.p011ui.unit.Constraints.m13257getMaxHeightimpl(r4)
                            float r4 = (float) r4
                            int r2 = androidx.compose.p011ui.unit.IntSize.m13475getHeightimpl(r2)
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
                            kotlin.Pair r4 = new kotlin.Pair
                            r4.<init>(r2, r3)
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1.m8184invokeGpV2Q24(long, long):kotlin.Pair");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final InterfaceC6009v interfaceC6009v2 = interfaceC6009v;
            int i12 = i11 >> 9;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8955SurfaceT9BRK9s(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifierThen, anchoredDraggableState$material3_release, orientation, (InterfaceC6473e) objRememberedValue3), sheetState.getAnchoredDraggableState$material3_release(), orientation, z8, false, null, 24, null), shape, j7, j8, f8, f9, null, ComposableLambdaKt.rememberComposableLambda(390720907, true, new InterfaceC6473e() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i13) {
                    ComposeUiNode.Companion companion3;
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(390720907, i13, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                    final SheetState sheetState2 = sheetState;
                    final boolean z9 = z8;
                    final InterfaceC6009v interfaceC6009v3 = interfaceC6009v2;
                    InterfaceC6474f interfaceC6474f2 = interfaceC6474f;
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion5.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion6, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1168080147);
                    if (interfaceC6473e2 != null) {
                        Strings.Companion companion7 = Strings.INSTANCE;
                        final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                        final String strM9393getString2EP1pXo2 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                        final String strM9393getString2EP1pXo3 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C1776R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                        Modifier modifierAlign = columnScopeInstance.align(companion4, companion5.getCenterHorizontally());
                        boolean zChanged3 = composer3.changed(sheetState2) | composer3.changed(z9) | composer3.changed(strM9393getString2EP1pXo3) | composer3.changedInstance(interfaceC6009v3) | composer3.changed(strM9393getString2EP1pXo) | composer3.changed(strM9393getString2EP1pXo2);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            companion3 = companion6;
                            Object obj2 = new InterfaceC6471c() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                    invoke((SemanticsPropertyReceiver) obj3);
                                    return C5443s.f8405a;
                                }

                                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z10 = z9;
                                    String str = strM9393getString2EP1pXo3;
                                    String str2 = strM9393getString2EP1pXo;
                                    String str3 = strM9393getString2EP1pXo2;
                                    final InterfaceC6009v interfaceC6009v4 = interfaceC6009v3;
                                    if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z10) {
                                        return;
                                    }
                                    SheetValue currentValue = sheetState3.getCurrentValue();
                                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                    if (currentValue == sheetValue) {
                                        if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange().invoke(SheetValue.Expanded)).booleanValue()) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new InterfaceC6469a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1

                                                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                                                @DebugMetadata(m5302c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", m5303f = "BottomSheetScaffold.kt", m5304i = {}, m5305l = {311}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                                                /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1 */
                                                public static final class C15391 extends SuspendLambda implements InterfaceC6473e {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C15391(SheetState sheetState, InterfaceC5631c<? super C15391> interfaceC5631c) {
                                                        super(2, interfaceC5631c);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                                                        return new C15391(this.$this_with, interfaceC5631c);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            AbstractC5774b.m5119b(obj);
                                                            SheetState sheetState = this.$this_with;
                                                            this.label = 1;
                                                            if (sheetState.expand(this) == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            AbstractC5774b.m5119b(obj);
                                                        }
                                                        return C5443s.f8405a;
                                                    }

                                                    @Override // p152r6.InterfaceC6473e
                                                    @Nullable
                                                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                                        return ((C15391) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // p152r6.InterfaceC6469a
                                                @NotNull
                                                public final Boolean invoke() {
                                                    AbstractC6014x.m5651v(interfaceC6009v4, null, null, new C15391(sheetState3, null), 3);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                    } else if (((Boolean) sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange().invoke(sheetValue)).booleanValue()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new InterfaceC6469a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2

                                            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                                            @DebugMetadata(m5302c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", m5303f = "BottomSheetScaffold.kt", m5304i = {}, m5305l = {320}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1 */
                                            public static final class C15401 extends SuspendLambda implements InterfaceC6473e {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C15401(SheetState sheetState, InterfaceC5631c<? super C15401> interfaceC5631c) {
                                                    super(2, interfaceC5631c);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                                                    return new C15401(this.$this_with, interfaceC5631c);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        AbstractC5774b.m5119b(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.partialExpand(this) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        AbstractC5774b.m5119b(obj);
                                                    }
                                                    return C5443s.f8405a;
                                                }

                                                @Override // p152r6.InterfaceC6473e
                                                @Nullable
                                                public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                                    return ((C15401) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // p152r6.InterfaceC6469a
                                            @NotNull
                                            public final Boolean invoke() {
                                                AbstractC6014x.m5651v(interfaceC6009v4, null, null, new C15401(sheetState3, null), 3);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new InterfaceC6469a() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3

                                        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                                        @DebugMetadata(m5302c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", m5303f = "BottomSheetScaffold.kt", m5304i = {}, m5305l = {327}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                                        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1 */
                                        public static final class C15411 extends SuspendLambda implements InterfaceC6473e {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C15411(SheetState sheetState, InterfaceC5631c<? super C15411> interfaceC5631c) {
                                                super(2, interfaceC5631c);
                                                this.$this_with = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                                                return new C15411(this.$this_with, interfaceC5631c);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                int i = this.label;
                                                if (i == 0) {
                                                    AbstractC5774b.m5119b(obj);
                                                    SheetState sheetState = this.$this_with;
                                                    this.label = 1;
                                                    if (sheetState.hide(this) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    AbstractC5774b.m5119b(obj);
                                                }
                                                return C5443s.f8405a;
                                            }

                                            @Override // p152r6.InterfaceC6473e
                                            @Nullable
                                            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                                return ((C15411) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // p152r6.InterfaceC6469a
                                        @NotNull
                                        public final Boolean invoke() {
                                            AbstractC6014x.m5651v(interfaceC6009v4, null, null, new C15411(sheetState3, null), 3);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(obj2);
                            objRememberedValue4 = obj2;
                        } else {
                            companion3 = companion6;
                        }
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (InterfaceC6471c) objRememberedValue4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                        InterfaceC6469a constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer3);
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AbstractC0584a.m920u(composer3, 0, interfaceC6473e2);
                    }
                    composer3.endReplaceGroup();
                    interfaceC6474f2.invoke(columnScopeInstance, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i12 & 112) | 12582912 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i13) {
                    BottomSheetScaffoldKt.m8181StandardBottomSheetw7I5h1o(sheetState, f, f7, z8, shape, j7, j8, f8, f9, interfaceC6473e, interfaceC6474f, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable SheetState sheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i8) {
        Composer composer2;
        if ((i8 & 1) != 0) {
            composer2 = composer;
            sheetState = rememberStandardBottomSheetState(null, null, false, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i8 & 2) != 0) {
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
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
    @NotNull
    public static final SheetState rememberStandardBottomSheetState(@Nullable SheetValue sheetValue, @Nullable InterfaceC6471c interfaceC6471c, boolean z8, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i8 & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        boolean z9 = z8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, interfaceC6471c2, sheetValue2, z9, composer, (i & 112) | ((i << 6) & 896) | ((i << 3) & 7168), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}

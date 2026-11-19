package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0080\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0090\u0001\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011\u001a\u0094\u0001\u0010\"\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0094\u0001\u0010$\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010!\u001a\u009a\u0001\u0010'\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001an\u0010*\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0086\u0001\u0010-\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a~\u0010/\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010)\u001a \u0001\u00102\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m5110d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLr6/f;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "SecondaryTabRow-pAZo6Ak", "SecondaryTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "TabRow-pAZo6Ak", "TabRow", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLr6/f;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "PrimaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryScrollableTabRow", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLr6/f;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLr6/f;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "TabRowImpl", "ScrollableTabRowImpl-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lr6/f;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "TabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILr6/f;Landroidx/compose/ui/Modifier;JJFLr6/e;Lr6/e;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "TabRowIndicatorSpec", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1361:1\n148#2:1362\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1352#1:1362\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C2331Dp.m13305constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    @NotNull
    private static final AnimationSpec<C2331Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9003PrimaryScrollableTabRowqhFBPw4(final int r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r29, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9003PrimaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9004PrimaryTabRowpAZo6Ak(final int r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, long r23, long r25, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9004PrimaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9005ScrollableTabRowsKfQg0A(final int r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r20, long r21, long r23, float r25, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r26, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9005ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final void m9006ScrollableTabRowImplsKfQg0A(final int i, final Modifier modifier, final long j7, final long j8, final float f, final ScrollState scrollState, final InterfaceC6474f interfaceC6474f, final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, Composer composer, final int i8) {
        int i9;
        float f7;
        ScrollState scrollState2;
        InterfaceC6474f interfaceC6474f2;
        InterfaceC6473e interfaceC6473e3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594140035);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(j7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(j8) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            f7 = f;
            i9 |= composerStartRestartGroup.changed(f7) ? 16384 : 8192;
        } else {
            f7 = f;
        }
        if ((196608 & i8) == 0) {
            scrollState2 = scrollState;
            i9 |= composerStartRestartGroup.changed(scrollState2) ? 131072 : 65536;
        } else {
            scrollState2 = scrollState;
        }
        if ((1572864 & i8) == 0) {
            interfaceC6474f2 = interfaceC6474f;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f2) ? 1048576 : 524288;
        } else {
            interfaceC6474f2 = interfaceC6474f;
        }
        if ((i8 & 12582912) == 0) {
            interfaceC6473e3 = interfaceC6473e;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 8388608 : 4194304;
        } else {
            interfaceC6473e3 = interfaceC6473e;
        }
        if ((100663296 & i8) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i9 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i9, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)");
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState2, false, null, false, 14, null)));
            final InterfaceC6473e interfaceC6473e4 = interfaceC6473e3;
            final InterfaceC6474f interfaceC6474f3 = interfaceC6474f2;
            final float f8 = f7;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8955SurfaceT9BRK9s(modifierClipToBounds, null, j7, j8, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
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
                public final void invoke(@Nullable Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1556158104, i10, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:711)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                    ScrollState scrollState3 = scrollState;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollState3, coroutineScope);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objRememberedValue3;
                    InterfaceC6473e interfaceC6473e5 = interfaceC6473e2;
                    InterfaceC6473e interfaceC6473e6 = interfaceC6473e4;
                    final InterfaceC6474f interfaceC6474f4 = interfaceC6474f3;
                    List listM5287z = AbstractC5806u.m5287z(interfaceC6473e5, interfaceC6473e6, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C5443s.f8405a;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i11) {
                            if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1530560661, i11, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:757)");
                            }
                            interfaceC6474f4.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54));
                    boolean zChanged2 = composer3.changed(f8) | composer3.changed(i) | composer3.changedInstance(scrollableTabData);
                    final float f9 = f8;
                    final int i11 = i;
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                            @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
                            @NotNull
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo7209measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j9) {
                                MeasureScope measureScope2 = measureScope;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                List<? extends Measurable> list4 = list.get(2);
                                final int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(f9);
                                int size = list2.size();
                                int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), list2.get(i12).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                int iIntValue = numValueOf.intValue();
                                int iMo6897roundToPx0680j_43 = iMo6897roundToPx0680j_4 * 2;
                                long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j9, iMo6897roundToPx0680j_42, 0, iIntValue, iIntValue, 2, null);
                                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                                ref$FloatRef.element = f9;
                                final ArrayList arrayList = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    arrayList.add(list2.get(i13).mo12033measureBRTryo0(jM13248copyZbe2FdA$default));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i14 = 0; i14 < size; i14++) {
                                    float fM13319unboximpl = ((C2331Dp) AbstractC6768a.m6451p(C2331Dp.m13303boximpl(TabRowKt.ScrollableTabRowMinimumTabWidth), C2331Dp.m13303boximpl(measureScope2.mo6900toDpu2uoSUM(((Placeable) arrayList.get(i14)).getWidth())))).m13319unboximpl();
                                    iMo6897roundToPx0680j_43 += measureScope2.mo6897roundToPx0680j_4(fM13319unboximpl);
                                    TabPosition tabPosition = new TabPosition(ref$FloatRef.element, fM13319unboximpl, ((C2331Dp) AbstractC6768a.m6451p(C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(fM13319unboximpl - C2331Dp.m13305constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(24)))).m13319unboximpl(), null);
                                    ref$FloatRef.element = C2331Dp.m13305constructorimpl(ref$FloatRef.element + fM13319unboximpl);
                                    arrayList2.add(tabPosition);
                                }
                                tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList2);
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                int i15 = 0;
                                while (i15 < size4) {
                                    int i16 = iMo6897roundToPx0680j_43;
                                    arrayList3.add(list3.get(i15).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j9, i16, iMo6897roundToPx0680j_43, 0, 0, 8, null)));
                                    i15++;
                                    size4 = size4;
                                    list3 = list3;
                                    iMo6897roundToPx0680j_43 = i16;
                                }
                                int i17 = iMo6897roundToPx0680j_43;
                                int i18 = i11;
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    int i20 = iIntValue;
                                    iIntValue = i20;
                                    arrayList4.add(list4.get(i19).mo12033measureBRTryo0(Constraints.m13247copyZbe2FdA(j9, 0, measureScope2.mo6897roundToPx0680j_4(((TabPosition) arrayList2.get(i18)).getWidth()), 0, i20)));
                                    i19++;
                                    measureScope2 = measureScope;
                                    list4 = list4;
                                }
                                final float f10 = f9;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i21 = i11;
                                final int i22 = iIntValue;
                                return MeasureScope.layout$default(measureScope, i17, iIntValue, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
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
                                        Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                                        ref$FloatRef2.element = f10;
                                        List<Placeable> list5 = arrayList;
                                        MeasureScope measureScope3 = measureScope;
                                        List<TabPosition> list6 = arrayList2;
                                        int size6 = list5.size();
                                        for (int i23 = 0; i23 < size6; i23++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i23), measureScope3.mo6897roundToPx0680j_4(ref$FloatRef2.element), 0, 0.0f, 4, null);
                                            ref$FloatRef2.element = C2331Dp.m13305constructorimpl(list6.get(i23).getWidth() + ref$FloatRef2.element);
                                        }
                                        List<Placeable> list7 = arrayList3;
                                        int i24 = i22;
                                        int size7 = list7.size();
                                        for (int i25 = 0; i25 < size7; i25++) {
                                            Placeable placeable = list7.get(i25);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i24 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list8 = arrayList4;
                                        MeasureScope measureScope4 = measureScope;
                                        List<TabPosition> list9 = arrayList2;
                                        int i26 = i21;
                                        int i27 = i22;
                                        int size8 = list8.size();
                                        for (int i28 = 0; i28 < size8; i28++) {
                                            Placeable placeable2 = list8.get(i28);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope4.mo6897roundToPx0680j_4(list9.get(i26).getWidth()) - placeable2.getWidth()) / 2), i27 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(measureScope, iMo6897roundToPx0680j_4, arrayList2, i21);
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    InterfaceC6473e interfaceC6473eCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM5287z);
                    boolean zChanged3 = composer3.changed(multiContentMeasurePolicy);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion3.getConstructor();
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
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    interfaceC6473eCombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i9 & 896) | 12582912 | (i9 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    TabRowKt.m9006ScrollableTabRowImplsKfQg0A(i, modifier, j7, j8, f, scrollState, interfaceC6474f, interfaceC6473e, interfaceC6473e2, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9007ScrollableTabRowWithSubcomposeImplqhFBPw4(final int r27, final p152r6.InterfaceC6474f r28, androidx.compose.p011ui.Modifier r29, long r30, long r32, float r34, p152r6.InterfaceC6473e r35, final p152r6.InterfaceC6473e r36, final androidx.compose.foundation.ScrollState r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9007ScrollableTabRowWithSubcomposeImplqhFBPw4(int, r6.f, androidx.compose.ui.Modifier, long, long, float, r6.e, r6.e, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9008SecondaryScrollableTabRowqhFBPw4(final int r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r29, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9008SecondaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9009SecondaryTabRowpAZo6Ak(final int r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, long r23, long r25, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9009SecondaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9010TabRowpAZo6Ak(final int r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, long r23, long r25, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m9010TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, r6.f, r6.e, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m9011TabRowImplDTcfvLk(Modifier modifier, final long j7, final long j8, final InterfaceC6474f interfaceC6474f, final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, Composer composer, final int i) {
        Modifier modifier2;
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i8, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:571)");
            }
            int i9 = i8 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8955SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j7, j8, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
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
                public final void invoke(@Nullable Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65106680, i10, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:577)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    InterfaceC6473e interfaceC6473e3 = interfaceC6473e2;
                    InterfaceC6473e interfaceC6473e4 = interfaceC6473e;
                    final InterfaceC6474f interfaceC6474f2 = interfaceC6474f;
                    List listM5287z = AbstractC5806u.m5287z(interfaceC6473e3, interfaceC6473e4, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C5443s.f8405a;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i11) {
                            if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1236693605, i11, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:618)");
                            }
                            interfaceC6474f2.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54));
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                            @Override // androidx.compose.p011ui.layout.MultiContentMeasurePolicy
                            @NotNull
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo7209measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j9) {
                                MeasureScope measureScope2 = measureScope;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                int i11 = 2;
                                List<? extends Measurable> list4 = list.get(2);
                                int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j9);
                                int size = list2.size();
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                if (size > 0) {
                                    ref$IntRef.element = iM13258getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    numValueOf = Integer.valueOf(Math.max(list2.get(i12).maxIntrinsicHeight(ref$IntRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                ArrayList arrayList = new ArrayList(size);
                                int i13 = 0;
                                while (i13 < size) {
                                    arrayList.add(new TabPosition(C2331Dp.m13305constructorimpl(measureScope2.mo6900toDpu2uoSUM(ref$IntRef.element) * i13), measureScope2.mo6900toDpu2uoSUM(ref$IntRef.element), ((C2331Dp) AbstractC6768a.m6451p(C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(measureScope2.mo6900toDpu2uoSUM(Math.min(list2.get(i13).maxIntrinsicWidth(iIntValue), ref$IntRef.element)) - C2331Dp.m13305constructorimpl(TabKt.getHorizontalTextPadding() * i11))), C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(24)))).m13319unboximpl(), null));
                                    i13++;
                                    measureScope2 = measureScope;
                                    i11 = 2;
                                }
                                tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                final ArrayList arrayList2 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    Measurable measurable = list2.get(i14);
                                    int i15 = ref$IntRef.element;
                                    int i16 = iIntValue;
                                    long jM13247copyZbe2FdA = Constraints.m13247copyZbe2FdA(j9, i15, i15, i16, iIntValue);
                                    iIntValue = i16;
                                    arrayList2.add(measurable.mo12033measureBRTryo0(jM13247copyZbe2FdA));
                                }
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                for (int i17 = 0; i17 < size4; i17++) {
                                    arrayList3.add(list3.get(i17).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j9, 0, 0, 0, 0, 11, null)));
                                }
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i18 = 0; i18 < size5; i18++) {
                                    Measurable measurable2 = list4.get(i18);
                                    int i19 = ref$IntRef.element;
                                    int i20 = iIntValue;
                                    iIntValue = i20;
                                    arrayList4.add(measurable2.mo12033measureBRTryo0(Constraints.m13247copyZbe2FdA(j9, i19, i19, 0, i20)));
                                }
                                return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iIntValue, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
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
                                        List<Placeable> list5 = arrayList2;
                                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                                        int size6 = list5.size();
                                        for (int i21 = 0; i21 < size6; i21++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i21), i21 * ref$IntRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Placeable> list6 = arrayList3;
                                        int i22 = iIntValue;
                                        int size7 = list6.size();
                                        for (int i23 = 0; i23 < size7; i23++) {
                                            Placeable placeable = list6.get(i23);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i22 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list7 = arrayList4;
                                        int i24 = iIntValue;
                                        int size8 = list7.size();
                                        for (int i25 = 0; i25 < size8; i25++) {
                                            Placeable placeable2 = list7.get(i25);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i24 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue2;
                    InterfaceC6473e interfaceC6473eCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM5287z);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion2.getConstructor();
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
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    interfaceC6473eCombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i9 & 896) | 12582912 | (i9 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    TabRowKt.m9011TabRowImplDTcfvLk(modifier3, j7, j8, interfaceC6474f, interfaceC6473e, interfaceC6473e2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m9012TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j7, final long j8, final InterfaceC6474f interfaceC6474f, final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, Composer composer, final int i) {
        Modifier modifier2;
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i8, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
            }
            int i9 = i8 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8955SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j7, j8, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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
                public final void invoke(@Nullable Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i10, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:954)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChanged = composer3.changed(interfaceC6473e2) | composer3.changed(interfaceC6473e) | composer3.changed(interfaceC6474f);
                    final InterfaceC6473e interfaceC6473e3 = interfaceC6473e2;
                    final InterfaceC6473e interfaceC6473e4 = interfaceC6473e;
                    final InterfaceC6474f interfaceC6474f2 = interfaceC6474f;
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m9020invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                            }

                            @NotNull
                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m9020invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j9);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, interfaceC6473e3);
                                int size = listSubcompose.size();
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                if (size > 0) {
                                    ref$IntRef.element = iM13258getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    numValueOf = Integer.valueOf(Math.max(listSubcompose.get(i11).maxIntrinsicHeight(ref$IntRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    Measurable measurable = listSubcompose.get(i12);
                                    int i13 = ref$IntRef.element;
                                    arrayList.add(measurable.mo12033measureBRTryo0(Constraints.m13247copyZbe2FdA(j9, i13, i13, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i14 = 0; i14 < size; i14++) {
                                    arrayList2.add(new TabPosition(C2331Dp.m13305constructorimpl(subcomposeMeasureScope.mo6900toDpu2uoSUM(ref$IntRef.element) * i14), subcomposeMeasureScope.mo6900toDpu2uoSUM(ref$IntRef.element), ((C2331Dp) AbstractC6768a.m6451p(C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(subcomposeMeasureScope.mo6900toDpu2uoSUM(Math.min(listSubcompose.get(i14).maxIntrinsicWidth(iIntValue), ref$IntRef.element)) - C2331Dp.m13305constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C2331Dp.m13303boximpl(C2331Dp.m13305constructorimpl(24)))).m13319unboximpl(), null));
                                }
                                final InterfaceC6473e interfaceC6473e5 = interfaceC6473e4;
                                final InterfaceC6474f interfaceC6474f3 = interfaceC6474f2;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM13258getMaxWidthimpl, iIntValue, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
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
                                        List<Placeable> list = arrayList;
                                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                                        int size4 = list.size();
                                        for (int i15 = 0; i15 < size4; i15++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i15), i15 * ref$IntRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, interfaceC6473e5);
                                        long j10 = j9;
                                        int i16 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i17 = 0; i17 < size5; i17++) {
                                            Placeable placeableMo12033measureBRTryo0 = listSubcompose2.get(i17).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, 0, i16 - placeableMo12033measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final InterfaceC6474f interfaceC6474f4 = interfaceC6474f3;
                                        final List<TabPosition> list2 = arrayList2;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // p152r6.InterfaceC6473e
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return C5443s.f8405a;
                                            }

                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i18) {
                                                if ((i18 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i18, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1000)");
                                                }
                                                interfaceC6474f4.invoke(list2, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i18 = iM13258getMaxWidthimpl;
                                        int i19 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i20 = 0; i20 < size6; i20++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i20).mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(i18, i19)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (InterfaceC6473e) objRememberedValue, composer3, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i9 & 896) | 12582912 | (i9 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    TabRowKt.m9012TabRowWithSubcomposeImplDTcfvLk(modifier3, j7, j8, interfaceC6474f, interfaceC6473e, interfaceC6473e2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

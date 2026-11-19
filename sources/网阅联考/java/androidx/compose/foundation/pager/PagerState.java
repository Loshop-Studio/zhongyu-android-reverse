package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 y2\u00020\u0001:\u0001yB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00052\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010bJ\u0011\u0010c\u001a\u00020]H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u0005H\u0016J\u0015\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u000206H\u0000¢\u0006\u0002\biJB\u0010j\u001a\u00020]2\u0006\u0010k\u001a\u00020l2'\u0010m\u001a#\b\u0001\u0012\u0004\u0012\u00020o\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0p\u0012\u0006\u0012\u0004\u0018\u00010q0n¢\u0006\u0002\brH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010sJ#\u0010t\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010uJ\r\u0010v\u001a\u00020]H\u0000¢\u0006\u0002\bwJ\f\u0010x\u001a\u00020\u0003*\u00020\u0003H\u0002R+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\nR\u001b\u0010\u001f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0016\u0010)\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u0014\u00102\u001a\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R/\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0007\u001a\u0004\u0018\u0001068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000e\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\nR\u0014\u0010?\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\nR\u0014\u0010A\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\nR+\u0010C\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u000e\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010\fR\u0014\u0010G\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010!R\u001b\u0010I\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u001e\u001a\u0004\bJ\u0010\nR+\u0010L\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u000e\u001a\u0004\bM\u0010\n\"\u0004\bN\u0010\fR+\u0010P\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000e\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\u001e\u001a\u0004\bV\u0010\nR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006z"}, m5175d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialPage", "", "initialPageOffsetFraction", "", "(IF)V", "<set-?>", "animationTargetPage", "getAnimationTargetPage", "()I", "setAnimationTargetPage", "(I)V", "animationTargetPage$delegate", "Landroidx/compose/runtime/MutableState;", "awaitLazyListStateSet", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollForward", "getCanScrollForward", "closestPageToSnappedPosition", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getClosestPageToSnappedPosition", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "currentPage", "getCurrentPage", "currentPage$delegate", "Landroidx/compose/runtime/State;", "currentPageOffsetFraction", "getCurrentPageOffsetFraction", "()F", "currentPageOffsetFraction$delegate", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "distanceToSnapPosition", "getDistanceToSnapPosition", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "getInitialPage", "getInitialPageOffsetFraction", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setLazyListState", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "lazyListState$delegate", "pageAvailableSpace", "getPageAvailableSpace", "pageCount", "getPageCount$foundation_release", "pageSize", "getPageSize$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "setPageSpacing$foundation_release", "pageSpacing$delegate", "positionThresholdFraction", "getPositionThresholdFraction", "settledPage", "getSettledPage", "settledPage$delegate", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "snapRemainingScrollOffset", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset$delegate", "targetPage", "getTargetPage", "targetPage$delegate", "visiblePages", "", "getVisiblePages", "()Ljava/util/List;", "animateScrollToPage", "", "page", "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "loadNewState", "newState", "loadNewState$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOnScrollStopped", "updateOnScrollStopped$foundation_release", "coerceInPageRange", "Companion", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,455:1\n76#2:456\n102#2,2:457\n76#2:459\n102#2,2:460\n76#2:462\n102#2,2:463\n76#2:484\n76#2:485\n102#2,2:486\n76#2:488\n102#2,2:489\n76#2:491\n76#2:492\n76#2:493\n171#3,13:465\n533#4,6:478\n452#5,4:494\n452#5,4:498\n452#5,4:502\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n96#1:456\n96#1:457,2\n98#1:459\n98#1:460,2\n100#1:462\n100#1:463,2\n177#1:484\n179#1:485\n179#1:486,2\n181#1:488\n181#1:489,2\n191#1:491\n204#1:492\n238#1:493\n133#1:465,13\n144#1:478,6\n262#1:494,4\n312#1:498,4\n328#1:502,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerState implements ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<PagerState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, PagerState, List<? extends Object>>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(SaverScope listSaver, PagerState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(Integer.valueOf(it.getCurrentPage()), Float.valueOf(it.getCurrentPageOffsetFraction()));
        }
    }, new Function1<List, PagerState>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ PagerState invoke(List list) {
            return invoke2((List<? extends Object>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final PagerState invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = it.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new PagerState(iIntValue, ((Float) obj2).floatValue());
        }
    });

    /* renamed from: animationTargetPage$delegate, reason: from kotlin metadata */
    private final MutableState animationTargetPage;
    private final AwaitLazyListStateSet awaitLazyListStateSet;

    /* renamed from: currentPage$delegate, reason: from kotlin metadata */
    private final State currentPage;

    /* renamed from: currentPageOffsetFraction$delegate, reason: from kotlin metadata */
    private final State currentPageOffsetFraction;
    private final int initialPage;
    private final float initialPageOffsetFraction;

    /* renamed from: lazyListState$delegate, reason: from kotlin metadata */
    private final MutableState lazyListState;

    /* renamed from: pageSpacing$delegate, reason: from kotlin metadata */
    private final MutableState pageSpacing;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final State settledPage;

    /* renamed from: settledPageState$delegate, reason: from kotlin metadata */
    private final MutableState settledPageState;

    /* renamed from: snapRemainingScrollOffset$delegate, reason: from kotlin metadata */
    private final MutableState snapRemainingScrollOffset;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final State targetPage;

    @Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5175d2 = {"Landroidx/compose/foundation/pager/PagerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.pager.PagerState", m5192f = "PagerState.kt", m5193i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, m5194l = {292, 317, 329}, m5195m = "animateScrollToPage", m5196n = {"this", "animationSpec", "page", "pageOffsetFraction", "this", "animationSpec", "pageOffsetFraction", "targetPage", "preJumpPosition", "this"}, m5197s = {"L$0", "L$1", "I$0", "F$0", "L$0", "L$1", "F$0", "I$0", "I$1", "L$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 */
    public static final class C07801 extends ContinuationImpl {
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07801(Continuation<? super C07801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.pager.PagerState", m5192f = "PagerState.kt", m5193i = {0}, m5194l = {334, 335}, m5195m = "awaitScrollDependencies", m5196n = {"this"}, m5197s = {"L$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 */
    public static final class C07811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07811(Continuation<? super C07811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.awaitScrollDependencies(this);
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.pager.PagerState", m5192f = "PagerState.kt", m5193i = {0, 0, 0}, m5194l = {Optimizer.OPTIMIZATION_STANDARD, 269}, m5195m = "scrollToPage", m5196n = {"this", "page", "pageOffsetFraction"}, m5197s = {"L$0", "I$0", "F$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$1 */
    public static final class C07821 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07821(Continuation<? super C07821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.scrollToPage(0, 0.0f, this);
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i4, float f4, AnimationSpec animationSpec, Continuation continuation, int i5, Object obj) throws Throwable {
        if ((i5 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return pagerState.animateScrollToPage(i4, f4, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitScrollDependencies(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState.C07811
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState.C07811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.awaitLazyListStateSet
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.waitFinalLazyListSetting(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.getLazyListState()
            if (r6 == 0) goto L66
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.getAwaitLayoutModifier()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.waitForFirstLayout(r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.awaitScrollDependencies(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i4) {
        if (getPageCount$foundation_release() > 0) {
            return RangesKt___RangesKt.coerceIn(i4, 0, getPageCount$foundation_release() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getAnimationTargetPage() {
        return ((Number) this.animationTargetPage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LazyListItemInfo getClosestPageToSnappedPosition() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        if (visiblePages.isEmpty()) {
            lazyListItemInfo = null;
        } else {
            LazyListItemInfo lazyListItemInfo2 = visiblePages.get(0);
            float f4 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo2, PagerStateKt.getSnapAlignmentStartToStart()));
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(visiblePages);
            int i4 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    LazyListItemInfo lazyListItemInfo3 = visiblePages.get(i4);
                    float f5 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo3, PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f4, f5) < 0) {
                        lazyListItemInfo2 = lazyListItemInfo3;
                        f4 = f5;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
            lazyListItemInfo = lazyListItemInfo2;
        }
        return lazyListItemInfo;
    }

    private final Density getDensity() {
        Density density$foundation_release;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (density$foundation_release = lazyListState.getDensity$foundation_release()) == null) ? PagerStateKt.UnitDensity : density$foundation_release;
    }

    private final float getDistanceToSnapPosition() {
        LazyListItemInfo closestPageToSnappedPosition = getClosestPageToSnappedPosition();
        if (closestPageToSnappedPosition != null) {
            return LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), closestPageToSnappedPosition, PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LazyListState getLazyListState() {
        return (LazyListState) this.lazyListState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(getDensity().mo7206toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getSettledPageState() {
        return ((Number) this.settledPageState.getValue()).intValue();
    }

    private final List<LazyListItemInfo> getVisiblePages() {
        return getLayoutInfo$foundation_release().getVisibleItemsInfo();
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i4, float f4, Continuation continuation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f4 = 0.0f;
        }
        return pagerState.scrollToPage(i4, f4, continuation);
    }

    private final void setAnimationTargetPage(int i4) {
        this.animationTargetPage.setValue(Integer.valueOf(i4));
    }

    private final void setLazyListState(LazyListState lazyListState) {
        this.lazyListState.setValue(lazyListState);
    }

    private final void setSettledPageState(int i4) {
        this.settledPageState.setValue(Integer.valueOf(i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r18, float r19, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.dispatchRawDelta(delta);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollBackward();
        }
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollForward();
        }
        return true;
    }

    public final int getCurrentPage() {
        return ((Number) this.currentPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction.getValue()).floatValue();
    }

    public final LazyListItemInfo getFirstVisiblePage$foundation_release() {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        ListIterator<LazyListItemInfo> listIterator = visiblePages.listIterator(visiblePages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfoPrevious = null;
                break;
            }
            lazyListItemInfoPrevious = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfoPrevious, PagerStateKt.getSnapAlignmentStartToStart()) <= 0.0f) {
                break;
            }
        }
        return lazyListItemInfoPrevious;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    public final InteractionSource getInteractionSource() {
        InteractionSource interactionSource;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (interactionSource = lazyListState.getInteractionSource()) == null) ? PagerStateKt.EmptyInteractionSources : interactionSource;
    }

    public final LazyListLayoutInfo getLayoutInfo$foundation_release() {
        LazyListLayoutInfo layoutInfo;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (layoutInfo = lazyListState.getLayoutInfo()) == null) ? PagerStateKt.EmptyLayoutInfo : layoutInfo;
    }

    public final int getPageCount$foundation_release() {
        return getLayoutInfo$foundation_release().getTotalItemsCount();
    }

    public final int getPageSize$foundation_release() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt___CollectionsKt.firstOrNull((List) getVisiblePages());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getPageSpacing$foundation_release() {
        return ((Number) this.pageSpacing.getValue()).intValue();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getSnapRemainingScrollOffset$foundation_release() {
        return ((Number) this.snapRemainingScrollOffset.getValue()).floatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.isScrollInProgress();
        }
        return false;
    }

    public final void loadNewState$foundation_release(LazyListState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        setLazyListState(newState);
        this.awaitLazyListStateSet.onStateLoaded();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null) {
            return Unit.INSTANCE;
        }
        Object objScroll = lazyListState.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollToPage(int r11, float r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.pager.PagerState.C07821
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.C07821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r13)
            goto L85
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            float r12 = r0.F$0
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.ResultKt.throwOnFailure(r13)
            goto L53
        L40:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.L$0 = r10
            r0.I$0 = r11
            r0.F$0 = r12
            r0.label = r4
            java.lang.Object r13 = r10.awaitScrollDependencies(r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            r2 = r10
        L53:
            double r5 = (double) r12
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r7 = 0
            if (r13 > 0) goto L62
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 > 0) goto L62
            goto L63
        L62:
            r4 = r7
        L63:
            if (r4 == 0) goto L94
            int r11 = r2.coerceInPageRange(r11)
            int r13 = r2.getPageAvailableSpace()
            float r13 = (float) r13
            float r13 = r13 * r12
            int r12 = kotlin.math.MathKt.roundToInt(r13)
            androidx.compose.foundation.lazy.LazyListState r13 = r2.getLazyListState()
            if (r13 == 0) goto L88
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r13.scrollToItem(r11, r12, r0)
            if (r11 != r1) goto L85
            return r1
        L85:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L88:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L94:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "pageOffsetFraction "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = " is not within the range -0.5 to 0.5"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scrollToPage(int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setPageSpacing$foundation_release(int i4) {
        this.pageSpacing.setValue(Integer.valueOf(i4));
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f4) {
        this.snapRemainingScrollOffset.setValue(Float.valueOf(f4));
    }

    public final void updateOnScrollStopped$foundation_release() {
        setSettledPageState(getCurrentPage());
    }

    public PagerState(int i4, float f4) {
        this.initialPage = i4;
        this.initialPageOffsetFraction = f4;
        double d4 = f4;
        if (!(-0.5d <= d4 && d4 <= 0.5d)) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f4 + " is not within the range -0.5 to 0.5").toString());
        }
        this.snapRemainingScrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.lazyListState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageSpacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.awaitLazyListStateSet = new AwaitLazyListStateSet();
        this.currentPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$currentPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                return Integer.valueOf(closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getIndex() : this.this$0.getInitialPage());
            }
        });
        this.animationTargetPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.settledPageState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i4), null, 2, null);
        this.settledPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                int iCoerceInPageRange;
                if (this.this$0.getPageCount$foundation_release() == 0) {
                    iCoerceInPageRange = 0;
                } else {
                    PagerState pagerState = this.this$0;
                    iCoerceInPageRange = pagerState.coerceInPageRange(pagerState.getSettledPageState());
                }
                return Integer.valueOf(iCoerceInPageRange);
            }
        });
        this.targetPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                int iRoundToInt;
                if (!this.this$0.isScrollInProgress()) {
                    iRoundToInt = this.this$0.getCurrentPage();
                } else if (this.this$0.getAnimationTargetPage() != -1) {
                    iRoundToInt = this.this$0.getAnimationTargetPage();
                } else {
                    if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                        iRoundToInt = Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction()) ? this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction())) : this.this$0.getCurrentPage();
                    } else {
                        iRoundToInt = MathKt__MathJVMKt.roundToInt(this.this$0.getSnapRemainingScrollOffset$foundation_release() / this.this$0.getPageAvailableSpace()) + this.this$0.getCurrentPage();
                    }
                }
                return Integer.valueOf(this.this$0.coerceInPageRange(iRoundToInt));
            }
        });
        this.currentPageOffsetFraction = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.foundation.pager.PagerState$currentPageOffsetFraction$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                int offset = closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getOffset() : 0;
                float pageAvailableSpace = this.this$0.getPageAvailableSpace();
                return Float.valueOf(pageAvailableSpace == 0.0f ? this.this$0.getInitialPageOffsetFraction() : RangesKt___RangesKt.coerceIn((-offset) / pageAvailableSpace, -0.5f, 0.5f));
            }
        });
    }

    public /* synthetic */ PagerState(int i4, float f4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i4, (i5 & 2) != 0 ? 0.0f : f4);
    }
}

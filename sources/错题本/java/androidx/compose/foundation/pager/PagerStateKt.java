package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000k\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004*\u00013\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001e\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0016*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010%\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0!¢\u0006\u0002\b#H\u0082@¢\u0006\u0004\b%\u0010&\"\u001a\u0010(\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u001a\u0010/\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, m5110d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLr6/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "currentPage", "currentPageOffsetFraction", "PagerState", "(IFLr6/a;)Landroidx/compose/foundation/pager/PagerState;", "Ld6/s;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lh6/c;)Ljava/lang/Object;", "animateToPreviousPage", "", "generateMsg", "debugLog", "(Lr6/a;)V", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "calculateNewMaxScrollOffset", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;I)J", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "calculateNewMinScrollOffset", "(Landroidx/compose/foundation/pager/PagerMeasureResult;I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "targetPage", "targetPageOffsetToSnappedPosition", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "updateTargetPage", "animateScrollToPage", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLandroidx/compose/animation/core/AnimationSpec;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "DefaultPositionThreshold", "F", "getDefaultPositionThreshold", "()F", "MaxPagesForAnimateScroll", "I", "PagesToPrefetch", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "UnitDensity", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,994:1\n897#1,4:1006\n897#1,4:1014\n897#1,4:1018\n1247#2,6:995\n1#3:1001\n54#4:1002\n59#4:1004\n54#4:1010\n59#4:1012\n85#5:1003\n90#5:1005\n85#5:1011\n90#5:1013\n113#6:1022\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n928#1:1006,4\n974#1:1014,4\n985#1:1018,4\n89#1:995,6\n908#1:1002\n908#1:1004\n938#1:1010\n938#1:1012\n908#1:1003\n908#1:1005\n938#1:1011\n938#1:1013\n854#1:1022\n*E\n"})
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = C2331Dp.m13305constructorimpl(56);

    @NotNull
    private static final PagerMeasureResult EmptyLayoutInfo = new PagerMeasureResult(EmptyList.INSTANCE, 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final Map<AlignmentLine, Integer> alignmentLines = AbstractC5785e0.m5147A();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.p011ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.p011ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.p011ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.p011ui.layout.MeasureResult
        public void placeChildren() {
        }
    }, false, null, null, AbstractC6014x.m5630a(EmptyCoroutineContext.INSTANCE), 393216, null);

    @NotNull
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.p011ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };

    @NotNull
    public static final PagerState PagerState(int i, @FloatRange(from = -0.5d, m246to = 0.5d) float f, @NotNull InterfaceC6469a interfaceC6469a) {
        return new DefaultPagerState(i, f, interfaceC6469a);
    }

    public static /* synthetic */ PagerState PagerState$default(int i, float f, InterfaceC6469a interfaceC6469a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            f = 0.0f;
        }
        return PagerState(i, f, interfaceC6469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, int i, float f, AnimationSpec<Float> animationSpec, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        int firstVisibleItemIndex;
        interfaceC6473e.invoke(lazyLayoutScrollScope, new Integer(i));
        boolean z8 = i > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z8 && i > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z8 && i < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            if (z8) {
                firstVisibleItemIndex = i - lastVisibleItemIndex;
                int firstVisibleItemIndex2 = lazyLayoutScrollScope.getFirstVisibleItemIndex();
                if (firstVisibleItemIndex < firstVisibleItemIndex2) {
                    firstVisibleItemIndex = firstVisibleItemIndex2;
                }
            } else {
                int i8 = lastVisibleItemIndex + i;
                firstVisibleItemIndex = lazyLayoutScrollScope.getFirstVisibleItemIndex();
                if (i8 <= firstVisibleItemIndex) {
                    firstVisibleItemIndex = i8;
                }
            }
            lazyLayoutScrollScope.snapToItem(firstVisibleItemIndex, 0);
        }
        float fCalculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i, 0, 2, null) + f;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Object objAnimate$default = SuspendAnimationKt.animate$default(0.0f, fCalculateDistanceTo$default, 0.0f, animationSpec, new InterfaceC6473e() { // from class: androidx.compose.foundation.pager.PagerStateKt.animateScrollToPage.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C5443s.f8405a;
            }

            public final void invoke(float f7, float f8) {
                ref$FloatRef.element += lazyLayoutScrollScope.scrollBy(f7 - ref$FloatRef.element);
            }
        }, interfaceC5631c, 4, null);
        return objAnimate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate$default : C5443s.f8405a;
    }

    @Nullable
    public static final Object animateToNextPage(@NotNull PagerState pagerState, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateScrollToPage$default;
        return (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount() || (objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, interfaceC5631c, 6, null)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? C5443s.f8405a : objAnimateScrollToPage$default;
    }

    @Nullable
    public static final Object animateToPreviousPage(@NotNull PagerState pagerState, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateScrollToPage$default;
        return (pagerState.getCurrentPage() + (-1) < 0 || (objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + (-1), 0.0f, null, interfaceC5631c, 6, null)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? C5443s.f8405a : objAnimateScrollToPage$default;
    }

    public static final long calculateNewMaxScrollOffset(@NotNull PagerLayoutInfo pagerLayoutInfo, int i) {
        long pageSize = (((i * (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) + pagerLayoutInfo.getBeforeContentPadding()) + pagerLayoutInfo.getAfterContentPadding()) - pagerLayoutInfo.getPageSpacing();
        int iMo7512getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo7512getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo7512getViewportSizeYbymL2g() & 4294967295L);
        long jM5274m = pageSize - (iMo7512getViewportSizeYbymL2g - AbstractC5806u.m5274m(pagerLayoutInfo.getSnapPosition().position(iMo7512getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i - 1, i), 0, iMo7512getViewportSizeYbymL2g));
        if (jM5274m < 0) {
            return 0L;
        }
        return jM5274m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i) {
        int iMo7512getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo7512getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo7512getViewportSizeYbymL2g() & 4294967295L);
        return AbstractC5806u.m5274m(pagerMeasureResult.getSnapPosition().position(iMo7512getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i), 0, iMo7512getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    @NotNull
    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    @Composable
    @NotNull
    public static final PagerState rememberPagerState(final int i, @FloatRange(from = -0.5d, m246to = 0.5d) final float f, @NotNull final InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i8, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.INSTANCE.getSaver();
        boolean z8 = ((((i8 & 14) ^ 6) > 4 && composer.changed(i)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && composer.changed(f)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && composer.changed(interfaceC6469a)) || (i8 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i, f, interfaceC6469a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(interfaceC6469a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    private static final void debugLog(InterfaceC6469a interfaceC6469a) {
    }
}

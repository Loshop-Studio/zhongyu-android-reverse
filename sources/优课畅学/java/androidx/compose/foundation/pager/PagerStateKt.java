package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC9165e;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = C3156Dp.m26899constructorimpl(56);
    private static final PagerMeasureResult EmptyLayoutInfo = new PagerMeasureResult(AbstractC8809v.m14771n(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final Map<AlignmentLine, Integer> alignmentLines = AbstractC9080a.m15943h();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.p013ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.p013ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.p013ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.p013ui.layout.MeasureResult
        public void placeChildren() {
        }
    }, false, null, null, AbstractC9165e.m16552a(EmptyCoroutineContext.f17438a), 393216, null);
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.p013ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.p013ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };

    public static final PagerState PagerState(int i10, @FloatRange(from = -0.5d, m243to = 0.5d) float f10, InterfaceC10559a interfaceC10559a) {
        return new DefaultPagerState(i10, f10, interfaceC10559a);
    }

    public static /* synthetic */ PagerState PagerState$default(int i10, float f10, InterfaceC10559a interfaceC10559a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return PagerState(i10, f10, interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, int i10, float f10, AnimationSpec<Float> animationSpec, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        interfaceC10574p.invoke(lazyLayoutScrollScope, AbstractC9536a.m17798c(i10));
        boolean z10 = i10 > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z10 && i10 > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z10 && i10 < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i10 - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            lazyLayoutScrollScope.snapToItem(z10 ? AbstractC8323h.m13510e(i10 - lastVisibleItemIndex, lazyLayoutScrollScope.getFirstVisibleItemIndex()) : AbstractC8323h.m13513h(lastVisibleItemIndex + i10, lazyLayoutScrollScope.getFirstVisibleItemIndex()), 0);
        }
        float fCalculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i10, 0, 2, null) + f10;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Object objAnimate$default = SuspendAnimationKt.animate$default(0.0f, fCalculateDistanceTo$default, 0.0f, animationSpec, new InterfaceC10574p() { // from class: androidx.compose.foundation.pager.PagerStateKt.animateScrollToPage.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C8736p.f16368a;
            }

            public final void invoke(float f11, float f12) {
                ref$FloatRef.f17470a += lazyLayoutScrollScope.scrollBy(f11 - ref$FloatRef.f17470a);
            }
        }, interfaceC9324c, 4, null);
        return objAnimate$default == AbstractC9434a.m17291f() ? objAnimate$default : C8736p.f16368a;
    }

    public static final Object animateToNextPage(PagerState pagerState, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return C8736p.f16368a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, interfaceC9324c, 6, null);
        return objAnimateScrollToPage$default == AbstractC9434a.m17291f() ? objAnimateScrollToPage$default : C8736p.f16368a;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return C8736p.f16368a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, interfaceC9324c, 6, null);
        return objAnimateScrollToPage$default == AbstractC9434a.m17291f() ? objAnimateScrollToPage$default : C8736p.f16368a;
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo pagerLayoutInfo, int i10) {
        long pageSpacing = (((i10 * (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize())) + pagerLayoutInfo.getBeforeContentPadding()) + pagerLayoutInfo.getAfterContentPadding()) - pagerLayoutInfo.getPageSpacing();
        int iMo21106getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo21106getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo21106getViewportSizeYbymL2g() & 4294967295L);
        return AbstractC8323h.m13511f(pageSpacing - (iMo21106getViewportSizeYbymL2g - AbstractC8323h.m13518m(pagerLayoutInfo.getSnapPosition().position(iMo21106getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i10 - 1, i10), 0, iMo21106getViewportSizeYbymL2g)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i10) {
        int iMo21106getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo21106getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo21106getViewportSizeYbymL2g() & 4294967295L);
        return AbstractC8323h.m13518m(pagerMeasureResult.getSnapPosition().position(iMo21106getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i10), 0, iMo21106getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    @Composable
    public static final PagerState rememberPagerState(final int i10, @FloatRange(from = -0.5d, m243to = 0.5d) final float f10, final InterfaceC10559a interfaceC10559a, Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
        }
        Object[] objArr = new Object[0];
        Saver<DefaultPagerState, ?> saver = DefaultPagerState.Companion.getSaver();
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(i10)) || (i11 & 6) == 4) | ((((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(f10)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(interfaceC10559a)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC10559a() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i10, f10, interfaceC10559a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m23818rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC10559a) objRememberedValue, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(interfaceC10559a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    private static final void debugLog(InterfaceC10559a interfaceC10559a) {
    }
}

package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = C3186Dp.m33501constructorimpl(56);
    private static final PagerMeasureResult EmptyLayoutInfo = new PagerMeasureResult(AbstractC10978w.m24136n(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, SnapPosition.Start.INSTANCE, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final Map<AlignmentLine, Integer> alignmentLines = AbstractC9925a.m20088h();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.p014ui.layout.MeasureResult
        public void placeChildren() {
        }
    }, false, null, null, AbstractC10006d.m20744a(EmptyCoroutineContext.f23351c), 393216, null);
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.p014ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.p014ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };

    public static final PagerState PagerState(int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10, InterfaceC9529a interfaceC9529a) {
        return new DefaultPagerState(i10, f10, interfaceC9529a);
    }

    public static /* synthetic */ PagerState PagerState$default(int i10, float f10, InterfaceC9529a interfaceC9529a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return PagerState(i10, f10, interfaceC9529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(final LazyLayoutScrollScope lazyLayoutScrollScope, int i10, float f10, AnimationSpec<Float> animationSpec, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        interfaceC9544p.invoke(lazyLayoutScrollScope, AbstractC11826a.m26208c(i10));
        boolean z10 = i10 > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z10 && i10 > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z10 && i10 < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && Math.abs(i10 - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            lazyLayoutScrollScope.snapToItem(z10 ? AbstractC10410o.m21752e(i10 - lastVisibleItemIndex, lazyLayoutScrollScope.getFirstVisibleItemIndex()) : AbstractC10410o.m21756i(lastVisibleItemIndex + i10, lazyLayoutScrollScope.getFirstVisibleItemIndex()), 0);
        }
        float fCalculateDistanceTo$default = LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i10, 0, 2, null) + f10;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Object objAnimate$default = SuspendAnimationKt.animate$default(0.0f, fCalculateDistanceTo$default, 0.0f, animationSpec, new InterfaceC9544p() { // from class: androidx.compose.foundation.pager.PagerStateKt.animateScrollToPage.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C10786q.f26013a;
            }

            public final void invoke(float f11, float f12) {
                ref$FloatRef.f23399c += lazyLayoutScrollScope.scrollBy(f11 - ref$FloatRef.f23399c);
            }
        }, interfaceC11588c, 4, null);
        return objAnimate$default == AbstractC11725a.m25952f() ? objAnimate$default : C10786q.f26013a;
    }

    public static final Object animateToNextPage(PagerState pagerState, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return C10786q.f26013a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, interfaceC11588c, 6, null);
        return objAnimateScrollToPage$default == AbstractC11725a.m25952f() ? objAnimateScrollToPage$default : C10786q.f26013a;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return C10786q.f26013a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, interfaceC11588c, 6, null);
        return objAnimateScrollToPage$default == AbstractC11725a.m25952f() ? objAnimateScrollToPage$default : C10786q.f26013a;
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo pagerLayoutInfo, int i10) {
        long pageSpacing = (((i10 * (pagerLayoutInfo.getPageSpacing() + pagerLayoutInfo.getPageSize())) + pagerLayoutInfo.getBeforeContentPadding()) + pagerLayoutInfo.getAfterContentPadding()) - pagerLayoutInfo.getPageSpacing();
        int iMo27708getViewportSizeYbymL2g = (int) (pagerLayoutInfo.getOrientation() == Orientation.Horizontal ? pagerLayoutInfo.mo27708getViewportSizeYbymL2g() >> 32 : pagerLayoutInfo.mo27708getViewportSizeYbymL2g() & 4294967295L);
        return AbstractC10410o.m21753f(pageSpacing - (iMo27708getViewportSizeYbymL2g - AbstractC10410o.m21761n(pagerLayoutInfo.getSnapPosition().position(iMo27708getViewportSizeYbymL2g, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.getBeforeContentPadding(), pagerLayoutInfo.getAfterContentPadding(), i10 - 1, i10), 0, iMo27708getViewportSizeYbymL2g)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult, int i10) {
        int iMo27708getViewportSizeYbymL2g = (int) (pagerMeasureResult.getOrientation() == Orientation.Horizontal ? pagerMeasureResult.mo27708getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.mo27708getViewportSizeYbymL2g() & 4294967295L);
        return AbstractC10410o.m21761n(pagerMeasureResult.getSnapPosition().position(iMo27708getViewportSizeYbymL2g, pagerMeasureResult.getPageSize(), pagerMeasureResult.getBeforeContentPadding(), pagerMeasureResult.getAfterContentPadding(), 0, i10), 0, iMo27708getViewportSizeYbymL2g);
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    @Composable
    public static final PagerState rememberPagerState(final int i10, @FloatRange(from = -0.5d, m337to = 0.5d) final float f10, final InterfaceC9529a interfaceC9529a, Composer composer, int i11, int i12) {
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
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.changed(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(f10)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(interfaceC9529a)) || (i11 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i10, f10, interfaceC9529a);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        defaultPagerState.getPageCountState().setValue(interfaceC9529a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerState;
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}

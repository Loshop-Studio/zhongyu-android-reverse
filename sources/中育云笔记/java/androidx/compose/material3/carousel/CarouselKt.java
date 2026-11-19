package androidx.compose.material3.carousel;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class CarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Carousel-V-95POc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29494CarouselV95POc(androidx.compose.material3.carousel.CarouselState r32, final androidx.compose.foundation.gestures.Orientation r33, final p181hd.InterfaceC9544p r34, final androidx.compose.foundation.layout.PaddingValues r35, final int r36, androidx.compose.p014ui.Modifier r37, float r38, androidx.compose.foundation.gestures.TargetedFlingBehavior r39, final p181hd.InterfaceC9546r r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m29494CarouselV95POc(androidx.compose.material3.carousel.CarouselState, androidx.compose.foundation.gestures.Orientation, hd.p, androidx.compose.foundation.layout.PaddingValues, int, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, hd.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29495HorizontalMultiBrowseCarouselzCIJ0Nk(final androidx.compose.material3.carousel.CarouselState r24, final float r25, androidx.compose.p014ui.Modifier r26, float r27, androidx.compose.foundation.gestures.TargetedFlingBehavior r28, float r29, float r30, androidx.compose.foundation.layout.PaddingValues r31, final p181hd.InterfaceC9546r r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m29495HorizontalMultiBrowseCarouselzCIJ0Nk(androidx.compose.material3.carousel.CarouselState, float, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, float, float, androidx.compose.foundation.layout.PaddingValues, hd.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29496HorizontalUncontainedCarousel9QcgTRs(final androidx.compose.material3.carousel.CarouselState r21, final float r22, androidx.compose.p014ui.Modifier r23, float r24, androidx.compose.foundation.gestures.TargetedFlingBehavior r25, androidx.compose.foundation.layout.PaddingValues r26, final p181hd.InterfaceC9546r r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m29496HorizontalUncontainedCarousel9QcgTRs(androidx.compose.material3.carousel.CarouselState, float, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, androidx.compose.foundation.layout.PaddingValues, hd.r, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i10, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
        }
        composer.startReplaceGroup(-587616383);
        float fMo27407calculateBottomPaddingD9Ej5fM = orientation == Orientation.Vertical ? paddingValues.mo27407calculateBottomPaddingD9Ej5fM() : PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        composer.endReplaceGroup();
        float fMo27099toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(fMo27407calculateBottomPaddingD9Ej5fM);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo27099toPx0680j_4;
    }

    @Composable
    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i10, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
        }
        composer.startReplaceGroup(295830617);
        float fMo27410calculateTopPaddingD9Ej5fM = orientation == Orientation.Vertical ? paddingValues.mo27410calculateTopPaddingD9Ej5fM() : PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        composer.endReplaceGroup();
        float fMo27099toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27099toPx0680j_4(fMo27410calculateTopPaddingD9Ej5fM);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo27099toPx0680j_4;
    }

    public static final float calculateCurrentScrollOffset(CarouselState carouselState, Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState$material3_release().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState$material3_release().getCurrentPageOffsetFraction() * itemMainAxisSize)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState$material3_release().getCurrentPage(), carouselState.getPagerState$material3_release().getPageCount());
    }

    @VisibleForTesting
    public static final float calculateMaxScrollOffset(CarouselState carouselState, Strategy strategy) {
        float pageCount = carouselState.getPagerState$material3_release().getPageCount();
        return AbstractC10410o.m21751d(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1))) - strategy.getAvailableSpace(), 0.0f);
    }

    public static final Modifier carouselItem(Modifier modifier, final int i10, final CarouselState carouselState, final InterfaceC9529a interfaceC9529a, final CarouselItemInfoImpl carouselItemInfoImpl, final Shape shape) {
        return LayoutModifierKt.layout(modifier, new InterfaceC9545q() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m29497invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m29497invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                final Strategy strategy = (Strategy) interfaceC9529a.invoke();
                if (!strategy.isValid()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C10786q.f26013a;
                        }
                    }, 4, null);
                }
                final boolean z10 = carouselState.getPagerState$material3_release().getLayoutInfo().getOrientation() == Orientation.Vertical;
                final boolean z11 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
                float itemMainAxisSize = strategy.getItemMainAxisSize();
                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(z10 ? Constraints.m33443copyZbe2FdA(j10, Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10), AbstractC9719c.m19282d(itemMainAxisSize), AbstractC9719c.m19282d(itemMainAxisSize)) : Constraints.m33443copyZbe2FdA(j10, AbstractC9719c.m19282d(itemMainAxisSize), AbstractC9719c.m19282d(itemMainAxisSize), Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10)));
                int width = placeableMo32229measureBRTryo0.getWidth();
                int height = placeableMo32229measureBRTryo0.getHeight();
                final CarouselState carouselState2 = carouselState;
                final int i11 = i10;
                final CarouselItemInfoImpl carouselItemInfoImpl2 = carouselItemInfoImpl;
                final Shape shape2 = shape;
                return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        Placeable placeable = placeableMo32229measureBRTryo0;
                        final CarouselState carouselState3 = carouselState2;
                        final Strategy strategy2 = strategy;
                        final int i12 = i11;
                        final boolean z12 = z10;
                        final CarouselItemInfoImpl carouselItemInfoImpl3 = carouselItemInfoImpl2;
                        final Shape shape3 = shape2;
                        final boolean z13 = z11;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((GraphicsLayerScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                                float fCalculateCurrentScrollOffset = CarouselKt.calculateCurrentScrollOffset(carouselState3, strategy2);
                                float fCalculateMaxScrollOffset = CarouselKt.calculateMaxScrollOffset(carouselState3, strategy2);
                                KeylineList keylineListForScrollOffset$material3_release$default = Strategy.getKeylineListForScrollOffset$material3_release$default(strategy2, fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, false, 4, null);
                                KeylineList keylineListForScrollOffset$material3_release = strategy2.getKeylineListForScrollOffset$material3_release(fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, true);
                                float itemMainAxisSize2 = ((i12 * (strategy2.getItemMainAxisSize() + strategy2.getItemSpacing())) + (strategy2.getItemMainAxisSize() / 2.0f)) - fCalculateCurrentScrollOffset;
                                Keyline keylineBefore = keylineListForScrollOffset$material3_release$default.getKeylineBefore(itemMainAxisSize2);
                                Keyline keylineAfter = keylineListForScrollOffset$material3_release$default.getKeylineAfter(itemMainAxisSize2);
                                Keyline keylineLerp = KeylineListKt.lerp(keylineBefore, keylineAfter, CarouselKt.getProgress(keylineBefore, keylineAfter, itemMainAxisSize2));
                                boolean zM20289b = AbstractC9979u.m20289b(keylineBefore, keylineAfter);
                                float fM30703getHeightimpl = (z12 ? Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc()) : strategy2.getItemMainAxisSize()) / 2.0f;
                                float itemMainAxisSize3 = (z12 ? strategy2.getItemMainAxisSize() : Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc())) / 2.0f;
                                float fM30706getWidthimpl = (z12 ? Size.m30706getWidthimpl(graphicsLayerScope.mo31064getSizeNHjbRc()) : keylineLerp.getSize()) / 2.0f;
                                float size = (z12 ? keylineLerp.getSize() : Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc())) / 2.0f;
                                Rect rect = new Rect(fM30703getHeightimpl - fM30706getWidthimpl, itemMainAxisSize3 - size, fM30703getHeightimpl + fM30706getWidthimpl, itemMainAxisSize3 + size);
                                carouselItemInfoImpl3.setSizeState(keylineLerp.getSize());
                                CarouselItemInfoImpl carouselItemInfoImpl4 = carouselItemInfoImpl3;
                                Iterator<Keyline> it = keylineListForScrollOffset$material3_release.iterator();
                                if (!it.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                Keyline next = it.next();
                                if (it.hasNext()) {
                                    float size2 = next.getSize();
                                    do {
                                        Keyline next2 = it.next();
                                        float size3 = next2.getSize();
                                        if (Float.compare(size2, size3) > 0) {
                                            next = next2;
                                            size2 = size3;
                                        }
                                    } while (it.hasNext());
                                }
                                carouselItemInfoImpl4.setMinSizeState(next.getSize());
                                carouselItemInfoImpl3.setMaxSizeState(keylineListForScrollOffset$material3_release.getFirstFocal().getSize());
                                carouselItemInfoImpl3.setMaskRectState(rect);
                                graphicsLayerScope.setClip(!AbstractC9979u.m20289b(rect, new Rect(0.0f, 0.0f, Size.m30706getWidthimpl(graphicsLayerScope.mo31064getSizeNHjbRc()), Size.m30703getHeightimpl(graphicsLayerScope.mo31064getSizeNHjbRc()))));
                                graphicsLayerScope.setShape(shape3);
                                float offset = keylineLerp.getOffset() - itemMainAxisSize2;
                                if (zM20289b) {
                                    offset += (itemMainAxisSize2 - keylineLerp.getUnadjustedOffset()) / keylineLerp.getSize();
                                }
                                if (z12) {
                                    graphicsLayerScope.setTranslationY(offset);
                                    return;
                                }
                                if (z13) {
                                    offset = -offset;
                                }
                                graphicsLayerScope.setTranslationX(offset);
                            }
                        }, 4, (Object) null);
                    }
                }, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getProgress(Keyline keyline, Keyline keyline2, float f10) {
        if (AbstractC9979u.m20289b(keyline, keyline2)) {
            return 1.0f;
        }
        return (f10 - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}

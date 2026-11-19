package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.OutlineKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class CarouselItemScopeImpl implements CarouselItemScope {
    public static final int $stable = 8;
    private final CarouselItemInfo itemInfo;

    public CarouselItemScopeImpl(CarouselItemInfo carouselItemInfo) {
        this.itemInfo = carouselItemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public CarouselItemInfo getCarouselItemInfo() {
        return this.itemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    public Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i10) {
        composer.startReplaceGroup(610897768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(610897768, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:84)");
        }
        Modifier modifierBorder = BorderKt.border(modifier, borderStroke, rememberMaskShape(shape, composer, (i10 >> 6) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierBorder;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    public Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i10) {
        composer.startReplaceGroup(440683050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440683050, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:80)");
        }
        Modifier modifierClip = ClipKt.clip(modifier, rememberMaskShape(shape, composer, (i10 >> 3) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierClip;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    public GenericShape rememberMaskShape(final Shape shape, Composer composer, int i10) {
        composer.startReplaceGroup(152582312);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152582312, i10, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:87)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(getCarouselItemInfo()) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new GenericShape(new InterfaceC10575q() { // from class: androidx.compose.material3.carousel.CarouselItemScopeImpl$rememberMaskShape$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p300x7.InterfaceC10575q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m22891invoke12SF9DM((Path) obj, ((Size) obj2).m24109unboximpl(), (LayoutDirection) obj3);
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-12SF9DM, reason: not valid java name */
                public final void m22891invoke12SF9DM(Path path, long j10, LayoutDirection layoutDirection) {
                    Rect rectIntersect = this.this$0.getCarouselItemInfo().getMaskRect().intersect(SizeKt.m24125toRectuvyYCjk(j10));
                    OutlineKt.addOutline(path, shape.mo20407createOutlinePq9zytI(rectIntersect.m24068getSizeNHjbRc(), layoutDirection, density));
                    path.mo24171translatek4lQ0M(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        GenericShape genericShape = (GenericShape) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return genericShape;
    }
}

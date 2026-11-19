package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.ClipKt;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.OutlineKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/material3/carousel/CarouselItemScopeImpl;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "itemInfo", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "(Landroidx/compose/material3/carousel/CarouselItemInfo;)V", "carouselItemInfo", "getCarouselItemInfo", "()Landroidx/compose/material3/carousel/CarouselItemInfo;", "rememberMaskShape", "Landroidx/compose/foundation/shape/GenericShape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/GenericShape;", "maskBorder", "Landroidx/compose/ui/Modifier;", "border", "Landroidx/compose/foundation/BorderStroke;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "maskClip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCarouselItemScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n77#2:100\n1223#3,6:101\n*S KotlinDebug\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n*L\n89#1:100\n90#1:101,6\n*E\n"})
/* loaded from: classes.dex */
public final class CarouselItemScopeImpl implements CarouselItemScope {
    public static final int $stable = 8;

    @NotNull
    private final CarouselItemInfo itemInfo;

    public CarouselItemScopeImpl(@NotNull CarouselItemInfo carouselItemInfo) {
        this.itemInfo = carouselItemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @NotNull
    /* renamed from: getCarouselItemInfo, reason: from getter */
    public CarouselItemInfo getItemInfo() {
        return this.itemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public Modifier maskBorder(@NotNull Modifier modifier, @NotNull BorderStroke borderStroke, @NotNull Shape shape, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(610897768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(610897768, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:84)");
        }
        Modifier modifierBorder = BorderKt.border(modifier, borderStroke, rememberMaskShape(shape, composer, (i >> 6) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierBorder;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public Modifier maskClip(@NotNull Modifier modifier, @NotNull Shape shape, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(440683050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440683050, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:80)");
        }
        Modifier modifierClip = ClipKt.clip(modifier, rememberMaskShape(shape, composer, (i >> 3) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierClip;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public GenericShape rememberMaskShape(@NotNull final Shape shape, @Nullable Composer composer, int i) {
        composer.startReplaceGroup(152582312);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152582312, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:87)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(getItemInfo()) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GenericShape(new InterfaceC6474f() { // from class: androidx.compose.material3.carousel.CarouselItemScopeImpl$rememberMaskShape$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m9297invoke12SF9DM((Path) obj, ((Size) obj2).m10515unboximpl(), (LayoutDirection) obj3);
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-12SF9DM, reason: not valid java name */
                public final void m9297invoke12SF9DM(@NotNull Path path, long j7, @NotNull LayoutDirection layoutDirection) {
                    Rect rectIntersect = this.this$0.getItemInfo().getMaskRect().intersect(SizeKt.m10531toRectuvyYCjk(j7));
                    OutlineKt.addOutline(path, shape.mo6813createOutlinePq9zytI(rectIntersect.m10474getSizeNHjbRc(), layoutDirection, density));
                    path.mo10577translatek4lQ0M(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
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

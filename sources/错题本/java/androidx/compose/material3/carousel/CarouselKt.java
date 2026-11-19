package androidx.compose.material3.carousel;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutModifierKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0001\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a}\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a»\u0001\u0010'\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e26\u0010#\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u000721\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020 *\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010*\u001a\u00020 *\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b*\u0010)\u001aA\u00103\u001a\u00020\u0004*\u00020\u00042\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00105\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b7\u00106\u001a'\u0010<\u001a\u00020 2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m5110d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "state", "Landroidx/compose/ui/unit/Dp;", "preferredItemWidth", "Landroidx/compose/ui/Modifier;", "modifier", "itemSpacing", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "minSmallItemWidth", "maxSmallItemWidth", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel", "itemWidth", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "maxNonFocalVisibleItemCount", "Carousel-V-95POc", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Lr6/g;Landroidx/compose/runtime/Composer;II)V", "Carousel", "calculateBeforeContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateAfterContentPadding", "index", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "strategy", "Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "carouselItemInfo", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "carouselItem", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/carousel/CarouselState;Lr6/a;Landroidx/compose/material3/carousel/CarouselItemInfoImpl;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "calculateCurrentScrollOffset", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;)F", "calculateMaxScrollOffset", "Landroidx/compose/material3/carousel/Keyline;", "before", "after", "unadjustedOffset", "getProgress", "(Landroidx/compose/material3/carousel/Keyline;Landroidx/compose/material3/carousel/Keyline;F)F", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,693:1\n148#2:694\n148#2:695\n148#2:703\n148#2:704\n148#2:712\n77#3:696\n77#3:705\n77#3:719\n77#3:720\n77#3:721\n77#3:722\n77#3:724\n77#3:725\n1223#4,6:697\n1223#4,6:706\n1223#4,6:713\n1#5:723\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n*L\n105#1:694\n110#1:695\n175#1:703\n177#1:704\n238#1:712\n113#1:696\n180#1:705\n301#1:719\n302#1:720\n347#1:721\n350#1:722\n359#1:724\n362#1:725\n117#1:697,6\n184#1:706,6\n246#1:713,6\n*E\n"})
/* loaded from: classes.dex */
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
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b1  */
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
    public static final void m9298CarouselV95POc(@org.jetbrains.annotations.NotNull androidx.compose.material3.carousel.CarouselState r32, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.Orientation r33, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r34, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r35, final int r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r37, float r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.TargetedFlingBehavior r39, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m9298CarouselV95POc(androidx.compose.material3.carousel.CarouselState, androidx.compose.foundation.gestures.Orientation, r6.e, androidx.compose.foundation.layout.PaddingValues, int, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, r6.g, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void m9299HorizontalMultiBrowseCarouselzCIJ0Nk(@org.jetbrains.annotations.NotNull final androidx.compose.material3.carousel.CarouselState r24, final float r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r26, float r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.TargetedFlingBehavior r28, float r29, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m9299HorizontalMultiBrowseCarouselzCIJ0Nk(androidx.compose.material3.carousel.CarouselState, float, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, float, float, androidx.compose.foundation.layout.PaddingValues, r6.g, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void m9300HorizontalUncontainedCarousel9QcgTRs(@org.jetbrains.annotations.NotNull final androidx.compose.material3.carousel.CarouselState r21, final float r22, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r23, float r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.TargetedFlingBehavior r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r26, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6475g r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt.m9300HorizontalUncontainedCarousel9QcgTRs(androidx.compose.material3.carousel.CarouselState, float, androidx.compose.ui.Modifier, float, androidx.compose.foundation.gestures.TargetedFlingBehavior, androidx.compose.foundation.layout.PaddingValues, r6.g, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final float calculateAfterContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018496720, i, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
        }
        composer.startReplaceGroup(-587616383);
        float bottom = orientation == Orientation.Vertical ? paddingValues.getBottom() : PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        composer.endReplaceGroup();
        float fMo6903toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(bottom);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo6903toPx0680j_4;
    }

    @Composable
    private static final float calculateBeforeContentPadding(PaddingValues paddingValues, Orientation orientation, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896839347, i, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
        }
        composer.startReplaceGroup(295830617);
        float top2 = orientation == Orientation.Vertical ? paddingValues.getTop() : PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        composer.endReplaceGroup();
        float fMo6903toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo6903toPx0680j_4(top2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo6903toPx0680j_4;
    }

    public static final float calculateCurrentScrollOffset(@NotNull CarouselState carouselState, @NotNull Strategy strategy) {
        float itemSpacing = strategy.getItemSpacing() + strategy.getItemMainAxisSize();
        return ((carouselState.getPagerState().getCurrentPageOffsetFraction() * itemSpacing) + (carouselState.getPagerState().getCurrentPage() * itemSpacing)) - KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState().getCurrentPage(), carouselState.getPagerState().getPageCount());
    }

    @VisibleForTesting
    public static final float calculateMaxScrollOffset(@NotNull CarouselState carouselState, @NotNull Strategy strategy) {
        float pageCount = carouselState.getPagerState().getPageCount();
        float fM77b = AbstractC0037f.m77b(pageCount, 1, strategy.getItemSpacing(), strategy.getItemMainAxisSize() * pageCount) - strategy.getAvailableSpace();
        if (fM77b < 0.0f) {
            return 0.0f;
        }
        return fM77b;
    }

    @NotNull
    public static final Modifier carouselItem(@NotNull Modifier modifier, final int i, @NotNull final CarouselState carouselState, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull final CarouselItemInfoImpl carouselItemInfoImpl, @NotNull final Shape shape) {
        return LayoutModifierKt.layout(modifier, new InterfaceC6474f() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m9301invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
            }

            @NotNull
            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m9301invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
                final Strategy strategy = (Strategy) interfaceC6469a.invoke();
                if (!strategy.getIsValid()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.1
                        public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C5443s.f8405a;
                        }
                    }, 4, null);
                }
                final boolean z8 = carouselState.getPagerState().getLayoutInfo().getOrientation() == Orientation.Vertical;
                final boolean z9 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
                float itemMainAxisSize = strategy.getItemMainAxisSize();
                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(z8 ? Constraints.m13247copyZbe2FdA(j7, Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7), AbstractC6600a.m6241q(itemMainAxisSize), AbstractC6600a.m6241q(itemMainAxisSize)) : Constraints.m13247copyZbe2FdA(j7, AbstractC6600a.m6241q(itemMainAxisSize), AbstractC6600a.m6241q(itemMainAxisSize), Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7)));
                int width = placeableMo12033measureBRTryo0.getWidth();
                int height = placeableMo12033measureBRTryo0.getHeight();
                final CarouselState carouselState2 = carouselState;
                final int i8 = i;
                final CarouselItemInfoImpl carouselItemInfoImpl2 = carouselItemInfoImpl;
                final Shape shape2 = shape;
                return MeasureScope.layout$default(measureScope, width, height, null, new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                        Placeable placeable = placeableMo12033measureBRTryo0;
                        final CarouselState carouselState3 = carouselState2;
                        final Strategy strategy2 = strategy;
                        final int i9 = i8;
                        final boolean z10 = z8;
                        final CarouselItemInfoImpl carouselItemInfoImpl3 = carouselItemInfoImpl2;
                        final Shape shape3 = shape2;
                        final boolean z11 = z9;
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new InterfaceC6471c() { // from class: androidx.compose.material3.carousel.CarouselKt.carouselItem.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((GraphicsLayerScope) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                float fCalculateCurrentScrollOffset = CarouselKt.calculateCurrentScrollOffset(carouselState3, strategy2);
                                float fCalculateMaxScrollOffset = CarouselKt.calculateMaxScrollOffset(carouselState3, strategy2);
                                KeylineList keylineListForScrollOffset$material3_release$default = Strategy.getKeylineListForScrollOffset$material3_release$default(strategy2, fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, false, 4, null);
                                KeylineList keylineListForScrollOffset$material3_release = strategy2.getKeylineListForScrollOffset$material3_release(fCalculateCurrentScrollOffset, fCalculateMaxScrollOffset, true);
                                float itemMainAxisSize2 = ((strategy2.getItemMainAxisSize() / 2.0f) + (i9 * (strategy2.getItemSpacing() + strategy2.getItemMainAxisSize()))) - fCalculateCurrentScrollOffset;
                                Keyline keylineBefore = keylineListForScrollOffset$material3_release$default.getKeylineBefore(itemMainAxisSize2);
                                Keyline keylineAfter = keylineListForScrollOffset$material3_release$default.getKeylineAfter(itemMainAxisSize2);
                                Keyline keylineLerp = KeylineListKt.lerp(keylineBefore, keylineAfter, CarouselKt.getProgress(keylineBefore, keylineAfter, itemMainAxisSize2));
                                boolean zM5325b = AbstractC5830k.m5325b(keylineBefore, keylineAfter);
                                float fM10507getHeightimpl = (z10 ? Size.m10507getHeightimpl(graphicsLayerScope.getSize()) : strategy2.getItemMainAxisSize()) / 2.0f;
                                float itemMainAxisSize3 = (z10 ? strategy2.getItemMainAxisSize() : Size.m10507getHeightimpl(graphicsLayerScope.getSize())) / 2.0f;
                                float fM10510getWidthimpl = (z10 ? Size.m10510getWidthimpl(graphicsLayerScope.getSize()) : keylineLerp.getSize()) / 2.0f;
                                float size = (z10 ? keylineLerp.getSize() : Size.m10507getHeightimpl(graphicsLayerScope.getSize())) / 2.0f;
                                Rect rect = new Rect(fM10507getHeightimpl - fM10510getWidthimpl, itemMainAxisSize3 - size, fM10507getHeightimpl + fM10510getWidthimpl, itemMainAxisSize3 + size);
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
                                graphicsLayerScope.setClip(!rect.equals(new Rect(0.0f, 0.0f, Size.m10510getWidthimpl(graphicsLayerScope.getSize()), Size.m10507getHeightimpl(graphicsLayerScope.getSize()))));
                                graphicsLayerScope.setShape(shape3);
                                float offset = keylineLerp.getOffset() - itemMainAxisSize2;
                                if (zM5325b) {
                                    offset += (itemMainAxisSize2 - keylineLerp.getUnadjustedOffset()) / keylineLerp.getSize();
                                }
                                if (z10) {
                                    graphicsLayerScope.setTranslationY(offset);
                                    return;
                                }
                                if (z11) {
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
    public static final float getProgress(Keyline keyline, Keyline keyline2, float f) {
        if (AbstractC5830k.m5325b(keyline, keyline2)) {
            return 1.0f;
        }
        return (f - keyline.getUnadjustedOffset()) / (keyline2.getUnadjustedOffset() - keyline.getUnadjustedOffset());
    }
}

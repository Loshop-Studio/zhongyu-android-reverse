package androidx.compose.material3.carousel;

import androidx.compose.p012ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\u0017"}, m13413d2 = {"calculateMediumChildSize", "", "minimumMediumSize", "largeItemSize", "remainingSpace", "createLeftAlignedKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "carouselMainAxisSize", "itemSpacing", "leftAnchorSize", "rightAnchorSize", "arrangement", "Landroidx/compose/material3/carousel/Arrangement;", "multiBrowseKeylineList", "density", "Landroidx/compose/ui/unit/Density;", "preferredItemSize", "itemCount", "", "minSmallItemSize", "maxSmallItemSize", "uncontainedKeylineList", "itemSize", "material3_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
/* loaded from: classes2.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = f11 * 0.85f;
        return fMax > f13 ? Math.max(f13, f12 * 1.2f) : fMax;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f10, float f11, final float f12, final float f13, final Arrangement arrangement) {
        return KeylineListKt.m20057keylineListOfWNYm7Xg(f10, f11, CarouselAlignment.INSTANCE.m20048getStartNUL3oTo(), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                keylineListScope.add(f12, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i9 = 0; i9 < largeCount; i9++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i10 = 0; i10 < mediumCount; i10++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i11 = 0; i11 < smallCount; i11++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f13, true);
            }
        });
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f10, float f11, float f12, int i9, float f13, float f14) {
        float f15;
        if (f10 == 0.0f || f11 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f11, f10);
        float fCoerceIn = RangesKt.coerceIn(fMin / 3.0f, f13, f14);
        float f16 = (fMin + fCoerceIn) / 2.0f;
        if (f10 < 2 * f13) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f10 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f10 - (ArraysKt.maxOrThrow(iArr2) * f16)) - (ArraysKt.maxOrThrow(iArr3) * f14)) / fMin))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i10 = 0; i10 < iMax; i10++) {
            iArr4[i10] = iCeil - i10;
        }
        float fMo17765toPx0680j_4 = density.mo17765toPx0680j_4(CarouselDefaults.INSTANCE.m20049getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f10, f12, fCoerceIn, f13, f14, iArr3, f16, iArr2, fMin, iArr4);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i9) {
            f15 = f10;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i9; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f15 = f10;
            arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f15, f12, fCoerceIn, f13, f14, new int[]{smallCount}, f16, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f15, f12, fMo17765toPx0680j_4, fMo17765toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f10, float f11, float f12, int i9, float f13, float f14, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            f13 = density.mo17765toPx0680j_4(CarouselDefaults.INSTANCE.m20051getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        float f15 = f13;
        if ((i10 & 64) != 0) {
            f14 = density.mo17765toPx0680j_4(CarouselDefaults.INSTANCE.m20050getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f10, f11, f12, i9, f15, f14);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f10, float f11, float f12) {
        if (f10 == 0.0f || f11 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f11 + f12, f10);
        int iMax = Math.max(1, (int) Math.floor(f10 / fMin));
        float f13 = f10 - (iMax * fMin);
        int i9 = f13 <= 0.0f ? 0 : 1;
        float fMo17765toPx0680j_4 = density.mo17765toPx0680j_4(CarouselDefaults.INSTANCE.m20049getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo17765toPx0680j_4, fMin, f13);
        return createLeftAlignedKeylineList(f10, f12, Math.max(Math.min(fMo17765toPx0680j_4, f11), fCalculateMediumChildSize * 0.5f), fMo17765toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i9, fMin, iMax));
    }
}

package androidx.compose.material3.carousel;

import androidx.compose.p009ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\u0017"}, m7880d2 = {"calculateMediumChildSize", "", "minimumMediumSize", "largeItemSize", "remainingSpace", "createLeftAlignedKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "carouselMainAxisSize", "itemSpacing", "leftAnchorSize", "rightAnchorSize", "arrangement", "Landroidx/compose/material3/carousel/Arrangement;", "multiBrowseKeylineList", "density", "Landroidx/compose/ui/unit/Density;", "preferredItemSize", "itemCount", "", "minSmallItemSize", "maxSmallItemSize", "uncontainedKeylineList", "itemSize", "material3_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
/* loaded from: classes.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f6, float f7, float f8) {
        float fMax = Math.max(1.5f * f8, f6);
        float f9 = f7 * 0.85f;
        return fMax > f9 ? Math.max(f9, f8 * 1.2f) : fMax;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f6, float f7, final float f8, final float f9, final Arrangement arrangement) {
        return KeylineListKt.m12547keylineListOfWNYm7Xg(f6, f7, CarouselAlignment.INSTANCE.m12538getStartNUL3oTo(), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
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
                keylineListScope.add(f8, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i6 = 0; i6 < largeCount; i6++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i7 = 0; i7 < mediumCount; i7++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i8 = 0; i8 < smallCount; i8++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f9, true);
            }
        });
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f6, float f7, float f8, int i6, float f9, float f10) {
        float f11;
        if (f6 == 0.0f || f7 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f7, f6);
        float fCoerceIn = RangesKt.coerceIn(fMin / 3.0f, f9, f10);
        float f12 = (fMin + fCoerceIn) / 2.0f;
        if (f6 < 2 * f9) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f6 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f6 - (ArraysKt.maxOrThrow(iArr2) * f12)) - (ArraysKt.maxOrThrow(iArr3) * f10)) / fMin))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i7 = 0; i7 < iMax; i7++) {
            iArr4[i7] = iCeil - i7;
        }
        float fMo10255toPx0680j_4 = density.mo10255toPx0680j_4(CarouselDefaults.INSTANCE.m12539getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f6, f8, fCoerceIn, f9, f10, iArr3, f12, iArr2, fMin, iArr4);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i6) {
            f11 = f6;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i6; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f11 = f6;
            arrangementFindLowestCostArrangement = Arrangement.INSTANCE.findLowestCostArrangement(f11, f8, fCoerceIn, f9, f10, new int[]{smallCount}, f12, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f11, f8, fMo10255toPx0680j_4, fMo10255toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f6, float f7, float f8, int i6, float f9, float f10, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            f9 = density.mo10255toPx0680j_4(CarouselDefaults.INSTANCE.m12541getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        float f11 = f9;
        if ((i7 & 64) != 0) {
            f10 = density.mo10255toPx0680j_4(CarouselDefaults.INSTANCE.m12540getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f6, f7, f8, i6, f11, f10);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f6, float f7, float f8) {
        if (f6 == 0.0f || f7 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f7 + f8, f6);
        int iMax = Math.max(1, (int) Math.floor(f6 / fMin));
        float f9 = f6 - (iMax * fMin);
        int i6 = f9 <= 0.0f ? 0 : 1;
        float fMo10255toPx0680j_4 = density.mo10255toPx0680j_4(CarouselDefaults.INSTANCE.m12539getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo10255toPx0680j_4, fMin, f9);
        return createLeftAlignedKeylineList(f6, f8, Math.max(Math.min(fMo10255toPx0680j_4, f7), fCalculateMediumChildSize * 0.5f), fMo10255toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i6, fMin, iMax));
    }
}

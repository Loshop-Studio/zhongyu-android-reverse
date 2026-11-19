package androidx.compose.material3.carousel;

import androidx.compose.p014ui.unit.Density;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = f11 * 0.85f;
        return fMax > f13 ? Math.max(f13, f12 * 1.2f) : fMax;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f10, float f11, final float f12, final float f13, final Arrangement arrangement) {
        return KeylineListKt.m29498keylineListOfWNYm7Xg(f10, f11, CarouselAlignment.Companion.m29489getStartNUL3oTo(), new InterfaceC9540l() { // from class: androidx.compose.material3.carousel.KeylinesKt.createLeftAlignedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeylineListScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(KeylineListScope keylineListScope) {
                keylineListScope.add(f12, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i10 = 0; i10 < largeCount; i10++) {
                    KeylineListScope.add$default(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i11 = 0; i11 < mediumCount; i11++) {
                    KeylineListScope.add$default(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i12 = 0; i12 < smallCount; i12++) {
                    KeylineListScope.add$default(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.add(f13, true);
            }
        });
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f10, float f11, float f12, int i10, float f13, float f14) {
        float f15;
        if (f10 == 0.0f || f11 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f11, f10);
        float fM21760m = AbstractC10410o.m21760m(fMin / 3.0f, f13, f14);
        float f16 = (fMin + fM21760m) / 2.0f;
        if (f10 < 2 * f13) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f10 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f10 - (AbstractC10968r.m24058Q0(iArr2) * f16)) - (AbstractC10968r.m24058Q0(iArr3) * f14)) / fMin))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i11 = 0; i11 < iMax; i11++) {
            iArr4[i11] = iCeil - i11;
        }
        float fMo27099toPx0680j_4 = density.mo27099toPx0680j_4(CarouselDefaults.INSTANCE.m29490getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f10, f12, fM21760m, f13, f14, iArr3, f16, iArr2, fMin, iArr4);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i10) {
            f15 = f10;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i10; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f15 = f10;
            arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f15, f12, fM21760m, f13, f14, new int[]{smallCount}, f16, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f15, f12, fMo27099toPx0680j_4, fMo27099toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f10, float f11, float f12, int i10, float f13, float f14, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            f13 = density.mo27099toPx0680j_4(CarouselDefaults.INSTANCE.m29492getMinSmallItemSizeD9Ej5fM$material3_release());
        }
        float f15 = f13;
        if ((i11 & 64) != 0) {
            f14 = density.mo27099toPx0680j_4(CarouselDefaults.INSTANCE.m29491getMaxSmallItemSizeD9Ej5fM$material3_release());
        }
        return multiBrowseKeylineList(density, f10, f11, f12, i10, f15, f14);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f10, float f11, float f12) {
        if (f10 == 0.0f || f11 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f11 + f12, f10);
        int iMax = Math.max(1, (int) Math.floor(f10 / fMin));
        float f13 = f10 - (iMax * fMin);
        int i10 = f13 <= 0.0f ? 0 : 1;
        float fMo27099toPx0680j_4 = density.mo27099toPx0680j_4(CarouselDefaults.INSTANCE.m29490getAnchorSizeD9Ej5fM$material3_release());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo27099toPx0680j_4, fMin, f13);
        return createLeftAlignedKeylineList(f10, f12, Math.max(Math.min(fMo27099toPx0680j_4, f11), fCalculateMediumChildSize * 0.5f), fMo27099toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i10, fMin, iMax));
    }
}

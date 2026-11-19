package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i6) {
        int itemCount = arrangement.getItemCount() - i6;
        boolean z6 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i7 = arrangement.smallCount;
            if (i7 > 0) {
                arrangement.smallCount = i7 - 1;
            } else {
                int i8 = arrangement.mediumCount;
                if (i8 > 1) {
                    arrangement.mediumCount = i8 - 1;
                }
            }
            itemCount--;
        }
        return z6;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        float f6 = containerHeight;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f8 = f7;
        float smallItemSizeMin = getSmallItemSizeMin() + f8;
        float fMax = Math.max(getSmallItemSizeMax() + f8, smallItemSizeMin);
        float fMin = Math.min(measuredHeight + f8, f6);
        float fClamp = MathUtils.clamp((measuredHeight / 3.0f) + f8, smallItemSizeMin + f8, fMax + f8);
        float f9 = (fMin + fClamp) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        if (f6 < 2.0f * smallItemSizeMin) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        int iMax = (int) Math.max(1.0d, Math.floor(((f6 - (CarouselStrategyHelper.maxValue(iArr) * f9)) - (CarouselStrategyHelper.maxValue(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f6 / fMin);
        int i6 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr3[i7] = iCeil - i7;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f6, fClamp, smallItemSizeMin, fMax, iArr2, f9, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount())) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f6, fClamp, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f9, new int[]{arrangementFindLowestCostArrangement.mediumCount}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f8, f6, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i6) {
        if (i6 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i6 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}

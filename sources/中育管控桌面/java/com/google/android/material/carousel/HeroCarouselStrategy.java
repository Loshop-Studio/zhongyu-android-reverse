package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f6;
        float fMax = Math.max(getSmallItemSizeMax() + f6, smallItemSizeMin);
        float f7 = containerHeight;
        float fMin = Math.min(measuredWidth + f6, f7);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f6, smallItemSizeMin + f6, fMax + f6);
        float f8 = (fMin + fClamp) / 2.0f;
        int i6 = 0;
        int[] iArr = f7 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int iMax = (int) Math.max(1.0d, Math.floor((f7 - (CarouselStrategyHelper.maxValue(r0) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f7 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i7 = 0; i7 < iCeil; i7++) {
            iArr2[i7] = iMax + i7;
        }
        int i8 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f7, fClamp, smallItemSizeMin, fMax, i8 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f8, i8 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr2);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f7, fClamp, smallItemSizeMin, fMax, iArr, f8, MEDIUM_COUNTS, fMin, iArr2);
        } else {
            i6 = i8;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f6, f7, arrangementFindLowestCostArrangement, i6);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i6) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i6 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i6 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}

package com.zykj.mistake.entity.resp;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/ReviewHomeResult;", "", "recommendCount", "", "shouldDefaultReviewTab", "", "recommend", "Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;", "needStrengthen", "consolidating", "mastered", "performance", "Lcom/zykj/mistake/entity/resp/ReviewPerformance;", "<init>", "(IZLcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPerformance;)V", "getRecommendCount", "()I", "getShouldDefaultReviewTab", "()Z", "getRecommend", "()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;", "getNeedStrengthen", "getConsolidating", "getMastered", "getPerformance", "()Lcom/zykj/mistake/entity/resp/ReviewPerformance;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ReviewHomeResult {
    public static final int $stable = 0;

    @NotNull
    private final ReviewPracticeMode consolidating;

    @NotNull
    private final ReviewPracticeMode mastered;

    @NotNull
    private final ReviewPracticeMode needStrengthen;

    @NotNull
    private final ReviewPerformance performance;

    @NotNull
    private final ReviewPracticeMode recommend;
    private final int recommendCount;
    private final boolean shouldDefaultReviewTab;

    public ReviewHomeResult() {
        this(0, false, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ReviewHomeResult copy$default(ReviewHomeResult reviewHomeResult, int i, boolean z8, ReviewPracticeMode reviewPracticeMode, ReviewPracticeMode reviewPracticeMode2, ReviewPracticeMode reviewPracticeMode3, ReviewPracticeMode reviewPracticeMode4, ReviewPerformance reviewPerformance, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = reviewHomeResult.recommendCount;
        }
        if ((i8 & 2) != 0) {
            z8 = reviewHomeResult.shouldDefaultReviewTab;
        }
        if ((i8 & 4) != 0) {
            reviewPracticeMode = reviewHomeResult.recommend;
        }
        if ((i8 & 8) != 0) {
            reviewPracticeMode2 = reviewHomeResult.needStrengthen;
        }
        if ((i8 & 16) != 0) {
            reviewPracticeMode3 = reviewHomeResult.consolidating;
        }
        if ((i8 & 32) != 0) {
            reviewPracticeMode4 = reviewHomeResult.mastered;
        }
        if ((i8 & 64) != 0) {
            reviewPerformance = reviewHomeResult.performance;
        }
        ReviewPracticeMode reviewPracticeMode5 = reviewPracticeMode4;
        ReviewPerformance reviewPerformance2 = reviewPerformance;
        ReviewPracticeMode reviewPracticeMode6 = reviewPracticeMode3;
        ReviewPracticeMode reviewPracticeMode7 = reviewPracticeMode;
        return reviewHomeResult.copy(i, z8, reviewPracticeMode7, reviewPracticeMode2, reviewPracticeMode6, reviewPracticeMode5, reviewPerformance2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRecommendCount() {
        return this.recommendCount;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldDefaultReviewTab() {
        return this.shouldDefaultReviewTab;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ReviewPracticeMode getRecommend() {
        return this.recommend;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ReviewPracticeMode getNeedStrengthen() {
        return this.needStrengthen;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ReviewPracticeMode getConsolidating() {
        return this.consolidating;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ReviewPracticeMode getMastered() {
        return this.mastered;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ReviewPerformance getPerformance() {
        return this.performance;
    }

    @NotNull
    public final ReviewHomeResult copy(int recommendCount, boolean shouldDefaultReviewTab, @NotNull ReviewPracticeMode recommend, @NotNull ReviewPracticeMode needStrengthen, @NotNull ReviewPracticeMode consolidating, @NotNull ReviewPracticeMode mastered, @NotNull ReviewPerformance performance) {
        AbstractC5830k.m5330g(recommend, "recommend");
        AbstractC5830k.m5330g(needStrengthen, "needStrengthen");
        AbstractC5830k.m5330g(consolidating, "consolidating");
        AbstractC5830k.m5330g(mastered, "mastered");
        AbstractC5830k.m5330g(performance, "performance");
        return new ReviewHomeResult(recommendCount, shouldDefaultReviewTab, recommend, needStrengthen, consolidating, mastered, performance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewHomeResult)) {
            return false;
        }
        ReviewHomeResult reviewHomeResult = (ReviewHomeResult) other;
        return this.recommendCount == reviewHomeResult.recommendCount && this.shouldDefaultReviewTab == reviewHomeResult.shouldDefaultReviewTab && AbstractC5830k.m5325b(this.recommend, reviewHomeResult.recommend) && AbstractC5830k.m5325b(this.needStrengthen, reviewHomeResult.needStrengthen) && AbstractC5830k.m5325b(this.consolidating, reviewHomeResult.consolidating) && AbstractC5830k.m5325b(this.mastered, reviewHomeResult.mastered) && AbstractC5830k.m5325b(this.performance, reviewHomeResult.performance);
    }

    @NotNull
    public final ReviewPracticeMode getConsolidating() {
        return this.consolidating;
    }

    @NotNull
    public final ReviewPracticeMode getMastered() {
        return this.mastered;
    }

    @NotNull
    public final ReviewPracticeMode getNeedStrengthen() {
        return this.needStrengthen;
    }

    @NotNull
    public final ReviewPerformance getPerformance() {
        return this.performance;
    }

    @NotNull
    public final ReviewPracticeMode getRecommend() {
        return this.recommend;
    }

    public final int getRecommendCount() {
        return this.recommendCount;
    }

    public final boolean getShouldDefaultReviewTab() {
        return this.shouldDefaultReviewTab;
    }

    public int hashCode() {
        return this.performance.hashCode() + ((this.mastered.hashCode() + ((this.consolidating.hashCode() + ((this.needStrengthen.hashCode() + ((this.recommend.hashCode() + AbstractC0584a.m908i(this.shouldDefaultReviewTab, Integer.hashCode(this.recommendCount) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReviewHomeResult(recommendCount=" + this.recommendCount + ", shouldDefaultReviewTab=" + this.shouldDefaultReviewTab + ", recommend=" + this.recommend + ", needStrengthen=" + this.needStrengthen + ", consolidating=" + this.consolidating + ", mastered=" + this.mastered + ", performance=" + this.performance + ")";
    }

    public ReviewHomeResult(int i, boolean z8, @NotNull ReviewPracticeMode recommend, @NotNull ReviewPracticeMode needStrengthen, @NotNull ReviewPracticeMode consolidating, @NotNull ReviewPracticeMode mastered, @NotNull ReviewPerformance performance) {
        AbstractC5830k.m5330g(recommend, "recommend");
        AbstractC5830k.m5330g(needStrengthen, "needStrengthen");
        AbstractC5830k.m5330g(consolidating, "consolidating");
        AbstractC5830k.m5330g(mastered, "mastered");
        AbstractC5830k.m5330g(performance, "performance");
        this.recommendCount = i;
        this.shouldDefaultReviewTab = z8;
        this.recommend = recommend;
        this.needStrengthen = needStrengthen;
        this.consolidating = consolidating;
        this.mastered = mastered;
        this.performance = performance;
    }

    public /* synthetic */ ReviewHomeResult(int i, boolean z8, ReviewPracticeMode reviewPracticeMode, ReviewPracticeMode reviewPracticeMode2, ReviewPracticeMode reviewPracticeMode3, ReviewPracticeMode reviewPracticeMode4, ReviewPerformance reviewPerformance, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) == 0 ? z8 : false, (i8 & 4) != 0 ? new ReviewPracticeMode(0, null, null, 0, false, 31, null) : reviewPracticeMode, (i8 & 8) != 0 ? new ReviewPracticeMode(0, null, null, 0, false, 31, null) : reviewPracticeMode2, (i8 & 16) != 0 ? new ReviewPracticeMode(0, null, null, 0, false, 31, null) : reviewPracticeMode3, (i8 & 32) != 0 ? new ReviewPracticeMode(0, null, null, 0, false, 31, null) : reviewPracticeMode4, (i8 & 64) != 0 ? new ReviewPerformance(null, 0, 0, 0, 0, 0, 0, 127, null) : reviewPerformance);
    }
}

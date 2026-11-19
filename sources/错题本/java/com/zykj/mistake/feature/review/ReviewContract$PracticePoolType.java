package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"com/zykj/mistake/feature/review/ReviewContract$PracticePoolType", "", "Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;", "STRENGTHENING", "CONSOLIDATING", "MASTERED", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ReviewContract$PracticePoolType {
    public static final ReviewContract$PracticePoolType CONSOLIDATING;
    public static final ReviewContract$PracticePoolType MASTERED;
    public static final ReviewContract$PracticePoolType STRENGTHENING;

    /* renamed from: a */
    public static final /* synthetic */ ReviewContract$PracticePoolType[] f7628a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7629b;

    static {
        ReviewContract$PracticePoolType reviewContract$PracticePoolType = new ReviewContract$PracticePoolType("STRENGTHENING", 0);
        STRENGTHENING = reviewContract$PracticePoolType;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType2 = new ReviewContract$PracticePoolType("CONSOLIDATING", 1);
        CONSOLIDATING = reviewContract$PracticePoolType2;
        ReviewContract$PracticePoolType reviewContract$PracticePoolType3 = new ReviewContract$PracticePoolType("MASTERED", 2);
        MASTERED = reviewContract$PracticePoolType3;
        ReviewContract$PracticePoolType[] reviewContract$PracticePoolTypeArr = {reviewContract$PracticePoolType, reviewContract$PracticePoolType2, reviewContract$PracticePoolType3};
        f7628a = reviewContract$PracticePoolTypeArr;
        f7629b = AbstractC5817a.m5310a(reviewContract$PracticePoolTypeArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7629b;
    }

    public static ReviewContract$PracticePoolType valueOf(String str) {
        return (ReviewContract$PracticePoolType) Enum.valueOf(ReviewContract$PracticePoolType.class, str);
    }

    public static ReviewContract$PracticePoolType[] values() {
        return (ReviewContract$PracticePoolType[]) f7628a.clone();
    }
}

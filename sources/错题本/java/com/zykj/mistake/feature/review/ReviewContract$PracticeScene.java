package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"com/zykj/mistake/feature/review/ReviewContract$PracticeScene", "", "Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;", "RECOMMEND", "POOL", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ReviewContract$PracticeScene {
    public static final ReviewContract$PracticeScene POOL;
    public static final ReviewContract$PracticeScene RECOMMEND;

    /* renamed from: a */
    public static final /* synthetic */ ReviewContract$PracticeScene[] f7630a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f7631b;

    static {
        ReviewContract$PracticeScene reviewContract$PracticeScene = new ReviewContract$PracticeScene("RECOMMEND", 0);
        RECOMMEND = reviewContract$PracticeScene;
        ReviewContract$PracticeScene reviewContract$PracticeScene2 = new ReviewContract$PracticeScene("POOL", 1);
        POOL = reviewContract$PracticeScene2;
        ReviewContract$PracticeScene[] reviewContract$PracticeSceneArr = {reviewContract$PracticeScene, reviewContract$PracticeScene2};
        f7630a = reviewContract$PracticeSceneArr;
        f7631b = AbstractC5817a.m5310a(reviewContract$PracticeSceneArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f7631b;
    }

    public static ReviewContract$PracticeScene valueOf(String str) {
        return (ReviewContract$PracticeScene) Enum.valueOf(ReviewContract$PracticeScene.class, str);
    }

    public static ReviewContract$PracticeScene[] values() {
        return (ReviewContract$PracticeScene[]) f7630a.clone();
    }
}

package com.zykj.mistake.feature.review;

/* renamed from: com.zykj.mistake.feature.review.r */
/* loaded from: classes3.dex */
public final class C5010r {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4331a(java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            boolean r2 = r1 instanceof com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$1 r2 = (com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$1 r2 = new com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.AbstractC5774b.m5119b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.getValue()
            r5 = r2
            goto L5b
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            kotlin.AbstractC5774b.m5119b(r1)
            com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$result$1 r1 = new com.zykj.mistake.feature.review.ReviewRepository$getReviewHome$result$1
            r4 = 0
            r1.<init>(r0, r4)
            com.zykj.mistake.feature.notebook.list.k1 r4 = new com.zykj.mistake.feature.notebook.list.k1
            r6 = 4
            r4.<init>(r6)
            r6 = r26
            r2.L$0 = r6
            r2.label = r5
            java.lang.Object r1 = com.zykj.mistake.data.AbstractC4496e.m3979b(r1, r4, r2)
            if (r1 != r3) goto L5a
            return r3
        L5a:
            r5 = r6
        L5b:
            kotlin.AbstractC5774b.m5119b(r1)
            com.zykj.mistake.entity.resp.ReviewHomeResult r1 = (com.zykj.mistake.entity.resp.ReviewHomeResult) r1
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getNeedStrengthen()
            int r11 = r2.getCount()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getConsolidating()
            int r14 = r2.getCount()
            com.zykj.mistake.feature.review.k r4 = new com.zykj.mistake.feature.review.k
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            java.lang.String r6 = r2.getSummaryText()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getRecommend()
            java.lang.String r7 = r2.getDescription()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getRecommend()
            int r8 = r2.getCount()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getRecommend()
            boolean r9 = r2.getCanPractice()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getNeedStrengthen()
            java.lang.String r10 = r2.getDescription()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getNeedStrengthen()
            boolean r12 = r2.getCanPractice()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getConsolidating()
            java.lang.String r13 = r2.getDescription()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getConsolidating()
            boolean r15 = r2.getCanPractice()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getMastered()
            java.lang.String r16 = r2.getDescription()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getMastered()
            int r17 = r2.getCount()
            com.zykj.mistake.entity.resp.ReviewPracticeMode r2 = r1.getMastered()
            boolean r18 = r2.getCanPractice()
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            int r2 = r2.getNewMistakeCount()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            int r20 = r2.getPracticeQuestionCount()
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            int r21 = r2.getPracticeDayCount()
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            int r22 = r2.getConsolidatingItemCount()
            com.zykj.mistake.entity.resp.ReviewPerformance r2 = r1.getPerformance()
            int r23 = r2.getMasteredItemCount()
            boolean r24 = r1.getShouldDefaultReviewTab()
            r19 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.C5010r.m4331a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/r.smali:7
    }
}

package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TrainAnswerMicroViewModel extends BaseTrainViewModel {

    /* renamed from: e */
    public final ExerciseRepository f14481e;

    public TrainAnswerMicroViewModel(ExerciseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14481e = repository;
    }

    /* renamed from: i */
    public final ExerciseRepository m12305i() {
        return this.f14481e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m12306j(p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$1
            if (r0 == 0) goto L14
            r0 = r9
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$1 r0 = (com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$1) r0
            int r1 = r0.f14484c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14484c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$1 r0 = new com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$1
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f14482a
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14484c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.AbstractC9079b.m15926b(r9)
            goto L4a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.AbstractC9079b.m15926b(r9)
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$2 r4 = new com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$2
            r9 = 0
            r4.<init>(r8, r9)
            r5.f14484c = r2
            r2 = 0
            r3 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            java.lang.Object r9 = com.zykj.base.BaseViewModel.launchAsyncData$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L4a
            return r0
        L4a:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L52
            java.util.List r9 = p134i7.AbstractC8809v.m14771n()
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.TrainAnswerMicroViewModel.m12306j(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/TrainAnswerMicroViewModel.smali:61
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12307k(int r11, java.lang.String r12, boolean r13, java.lang.String r14, p179m7.InterfaceC9324c r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.zykj.study.viewmodels.TrainAnswerMicroViewModel$uploadAnswerMicro$1
            if (r0 == 0) goto L14
            r0 = r15
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel$uploadAnswerMicro$1 r0 = (com.zykj.study.viewmodels.TrainAnswerMicroViewModel$uploadAnswerMicro$1) r0
            int r1 = r0.f14493g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14493g = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.TrainAnswerMicroViewModel$uploadAnswerMicro$1 r0 = new com.zykj.study.viewmodels.TrainAnswerMicroViewModel$uploadAnswerMicro$1
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r8.f14491e
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r8.f14493g
            r9 = 1
            if (r1 == 0) goto L3b
            if (r1 != r9) goto L33
            java.lang.Object r11 = r8.f14489c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r8.f14488b
            java.lang.String r11 = (java.lang.String) r11
            kotlin.AbstractC9079b.m15926b(r15)
            goto L6f
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.AbstractC9079b.m15926b(r15)
            com.zykj.study.bean.exercise.QuestionBean r15 = r10.m12023c()
            com.zykj.study.bean.exercise.QuestionStatus r15 = r15.getStatus()
            com.zykj.study.bean.exercise.QuestionStatus r1 = com.zykj.study.bean.exercise.QuestionStatus.UN_ANSWERED
            if (r15 == r1) goto L4c
            if (r13 == 0) goto L78
        L4c:
            com.zykj.study.repository.ExerciseRepository r1 = r10.f14481e
            long r2 = r10.m12021a()
            java.lang.Object r15 = p201o7.AbstractC9543h.m17814a(r12)
            r8.f14488b = r15
            java.lang.Object r15 = p201o7.AbstractC9543h.m17814a(r14)
            r8.f14489c = r15
            r8.f14487a = r11
            r8.f14490d = r13
            r8.f14493g = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            java.lang.Object r11 = r1.m10376l(r2, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L6f
            return r0
        L6f:
            com.zykj.study.bean.exercise.QuestionBean r11 = r10.m12023c()
            com.zykj.study.bean.exercise.QuestionStatus r12 = com.zykj.study.bean.exercise.QuestionStatus.ANSWERED
            r11.setStatus(r12)
        L78:
            java.lang.Boolean r11 = p201o7.AbstractC9536a.m17796a(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.TrainAnswerMicroViewModel.m12307k(int, java.lang.String, boolean, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/TrainAnswerMicroViewModel.smali:250
    }
}

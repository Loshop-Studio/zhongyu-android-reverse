package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentExercisesViewModel$initUserQuizStatistics$1", m17801f = "StudentExercisesViewModel.kt", m17802l = {34, 36}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentExercisesViewModel$initUserQuizStatistics$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14377a;

    /* renamed from: b */
    public final /* synthetic */ boolean f14378b;

    /* renamed from: c */
    public final /* synthetic */ StudentExercisesViewModel f14379c;

    /* renamed from: d */
    public final /* synthetic */ int f14380d;

    /* renamed from: e */
    public final /* synthetic */ String f14381e;

    /* renamed from: f */
    public final /* synthetic */ int f14382f;

    /* renamed from: g */
    public final /* synthetic */ int f14383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentExercisesViewModel$initUserQuizStatistics$1(boolean z10, StudentExercisesViewModel studentExercisesViewModel, int i10, String str, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14378b = z10;
        this.f14379c = studentExercisesViewModel;
        this.f14380d = i10;
        this.f14381e = str;
        this.f14382f = i11;
        this.f14383g = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentExercisesViewModel$initUserQuizStatistics$1(this.f14378b, this.f14379c, this.f14380d, this.f14381e, this.f14382f, this.f14383g, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentExercisesViewModel$initUserQuizStatistics$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14377a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r6)
            goto L50
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L38
        L1e:
            kotlin.AbstractC9079b.m15926b(r6)
            boolean r6 = r5.f14378b
            if (r6 == 0) goto L3b
            com.zykj.study.viewmodels.StudentExercisesViewModel r6 = r5.f14379c
            com.zykj.study.repository.ExerciseRepository r6 = r6.m12257b()
            int r1 = r5.f14380d
            java.lang.String r2 = r5.f14381e
            r5.f14377a = r3
            java.lang.Object r6 = r6.m10372h(r1, r2, r5)
            if (r6 != r0) goto L38
            goto L4f
        L38:
            com.zykj.study.bean.exercise.GroupStatistic r6 = (com.zykj.study.bean.exercise.GroupStatistic) r6
            goto L52
        L3b:
            com.zykj.study.viewmodels.StudentExercisesViewModel r6 = r5.f14379c
            com.zykj.study.repository.ExerciseRepository r6 = r6.m12257b()
            int r1 = r5.f14382f
            int r3 = r5.f14383g
            java.lang.String r4 = r5.f14381e
            r5.f14377a = r2
            java.lang.Object r6 = r6.m10373i(r1, r3, r4, r5)
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            com.zykj.study.bean.exercise.GroupStatistic r6 = (com.zykj.study.bean.exercise.GroupStatistic) r6
        L52:
            com.zykj.study.viewmodels.StudentExercisesViewModel r0 = r5.f14379c
            androidx.lifecycle.MutableLiveData r1 = r0.m12258c()
            r1.postValue(r6)
            java.util.List r1 = r6.getQuestionGroups()
            if (r1 != 0) goto L6a
            androidx.lifecycle.MutableLiveData r6 = r0.m12256a()
            r0 = 0
            r6.postValue(r0)
            goto L7d
        L6a:
            java.util.List r6 = r6.getQuestionGroups()
            java.lang.Object r6 = p134i7.AbstractC8778f0.m14568n0(r6)
            com.zykj.study.bean.exercise.ExerciseBean r6 = (com.zykj.study.bean.exercise.ExerciseBean) r6
            if (r6 == 0) goto L7d
            androidx.lifecycle.MutableLiveData r0 = r0.m12256a()
            r0.postValue(r6)
        L7d:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.StudentExercisesViewModel$initUserQuizStatistics$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/StudentExercisesViewModel$initUserQuizStatistics$1.smali:172
    }
}

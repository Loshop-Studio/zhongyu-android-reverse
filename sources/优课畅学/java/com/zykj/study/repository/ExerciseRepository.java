package com.zykj.study.repository;

import com.zykj.study.bean.exercise.CompleteExerciseInput;
import com.zykj.study.bean.exercise.ExerciseInput;
import com.zykj.study.bean.exercise.MicroDeleteInput;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9519b;
import p198o4.InterfaceC9521d;

/* loaded from: classes3.dex */
public final class ExerciseRepository {

    /* renamed from: a */
    public final InterfaceC9519b f11421a;

    /* renamed from: b */
    public final InterfaceC9521d f11422b;

    public ExerciseRepository(InterfaceC9519b courseApi, InterfaceC9521d api) {
        AbstractC9133u.m16133g(courseApi, "courseApi");
        AbstractC9133u.m16133g(api, "api");
        this.f11421a = courseApi;
        this.f11422b = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10365a(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, p179m7.InterfaceC9324c r17) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.zykj.study.repository.ExerciseRepository$addMicro$1
            if (r1 == 0) goto L15
            r1 = r0
            com.zykj.study.repository.ExerciseRepository$addMicro$1 r1 = (com.zykj.study.repository.ExerciseRepository$addMicro$1) r1
            int r2 = r1.f11430h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11430h = r2
            goto L1a
        L15:
            com.zykj.study.repository.ExerciseRepository$addMicro$1 r1 = new com.zykj.study.repository.ExerciseRepository$addMicro$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.f11428f
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()
            int r3 = r1.f11430h
            r4 = 1
            if (r3 == 0) goto L43
            if (r3 != r4) goto L3b
            java.lang.Object r12 = r1.f11427e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r1.f11426d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r1.f11425c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r1.f11424b
            java.lang.String r12 = (java.lang.String) r12
            kotlin.AbstractC9079b.m15926b(r0)
            goto L76
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            kotlin.AbstractC9079b.m15926b(r0)
            o4.d r0 = r11.f11422b
            com.zykj.study.bean.exercise.MicroAddInput r5 = new com.zykj.study.bean.exercise.MicroAddInput
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r13)
            r1.f11424b = r13
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r14)
            r1.f11425c = r13
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r15)
            r1.f11426d = r13
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r16)
            r1.f11427e = r13
            r1.f11423a = r12
            r1.f11430h = r4
            java.lang.Object r12 = r0.m17723l(r5, r1)
            if (r12 != r2) goto L76
            return r2
        L76:
            java.lang.Boolean r12 = p201o7.AbstractC9536a.m17796a(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.ExerciseRepository.m10365a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/ExerciseRepository.smali:59
    }

    /* renamed from: b */
    public final Object m10366b(int i10, int i11, int i12, long j10, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17722k(new CompleteExerciseInput(i10, i11, i12, j10), interfaceC9324c);
    }

    /* renamed from: c */
    public final Object m10367c(int i10, String str, int i11, InterfaceC9324c interfaceC9324c) {
        Object objM17721j = this.f11422b.m17721j(new MicroDeleteInput(i10, str, i11), interfaceC9324c);
        return objM17721j == AbstractC9434a.m17291f() ? objM17721j : C8736p.f16368a;
    }

    /* renamed from: d */
    public final Object m10368d(int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17719h(new ExerciseInput(i10, i11, i12), interfaceC9324c);
    }

    /* renamed from: e */
    public final Object m10369e(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17717f(i10, i11, interfaceC9324c);
    }

    /* renamed from: f */
    public final Object m10370f(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17716e(i10, i11, interfaceC9324c);
    }

    /* renamed from: g */
    public final Object m10371g(int i10, InterfaceC9324c interfaceC9324c) {
        return this.f11421a.m17697l(i10, interfaceC9324c);
    }

    /* renamed from: h */
    public final Object m10372h(int i10, String str, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17712a(i10, str, interfaceC9324c);
    }

    /* renamed from: i */
    public final Object m10373i(int i10, int i11, String str, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17714c(i10, i11, str, interfaceC9324c);
    }

    /* renamed from: j */
    public final Object m10374j(int i10, String str, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17713b(i10, str, interfaceC9324c);
    }

    /* renamed from: k */
    public final Object m10375k(int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        return this.f11422b.m17718g(new ExerciseInput(i10, i11, i12), interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10376l(long r13, int r15, java.lang.String r16, boolean r17, java.lang.String r18, p179m7.InterfaceC9324c r19) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.zykj.study.repository.ExerciseRepository$updateAnswerMicroResult$1
            if (r1 == 0) goto L15
            r1 = r0
            com.zykj.study.repository.ExerciseRepository$updateAnswerMicroResult$1 r1 = (com.zykj.study.repository.ExerciseRepository$updateAnswerMicroResult$1) r1
            int r2 = r1.f11438h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11438h = r2
            goto L1a
        L15:
            com.zykj.study.repository.ExerciseRepository$updateAnswerMicroResult$1 r1 = new com.zykj.study.repository.ExerciseRepository$updateAnswerMicroResult$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f11436f
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()
            int r3 = r1.f11438h
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r13 = r1.f11434d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r1.f11433c
            java.lang.String r13 = (java.lang.String) r13
            kotlin.AbstractC9079b.m15926b(r0)
            goto L68
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            kotlin.AbstractC9079b.m15926b(r0)
            o4.d r0 = r12.f11422b
            com.zykj.study.bean.exercise.AnswerMicroResultInput r5 = new com.zykj.study.bean.exercise.AnswerMicroResultInput
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r5.<init>(r6, r8, r9, r10, r11)
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r16)
            r1.f11433c = r3
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r18)
            r1.f11434d = r3
            r1.f11431a = r13
            r1.f11432b = r15
            r1.f11435e = r10
            r1.f11438h = r4
            java.lang.Object r13 = r0.m17715d(r5, r1)
            if (r13 != r2) goto L68
            return r2
        L68:
            java.lang.Boolean r13 = p201o7.AbstractC9536a.m17796a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.ExerciseRepository.m10376l(long, int, java.lang.String, boolean, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/ExerciseRepository.smali:580
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10377m(long r13, int r15, java.lang.String r16, boolean r17, java.lang.String r18, p179m7.InterfaceC9324c r19) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.zykj.study.repository.ExerciseRepository$updateAnswerResult$1
            if (r1 == 0) goto L15
            r1 = r0
            com.zykj.study.repository.ExerciseRepository$updateAnswerResult$1 r1 = (com.zykj.study.repository.ExerciseRepository$updateAnswerResult$1) r1
            int r2 = r1.f11446h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11446h = r2
            goto L1a
        L15:
            com.zykj.study.repository.ExerciseRepository$updateAnswerResult$1 r1 = new com.zykj.study.repository.ExerciseRepository$updateAnswerResult$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f11444f
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()
            int r3 = r1.f11446h
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r13 = r1.f11442d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r1.f11441c
            java.lang.String r13 = (java.lang.String) r13
            kotlin.AbstractC9079b.m15926b(r0)
            goto L68
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            kotlin.AbstractC9079b.m15926b(r0)
            o4.d r0 = r12.f11422b
            com.zykj.study.bean.exercise.AnswerResultInput r5 = new com.zykj.study.bean.exercise.AnswerResultInput
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r5.<init>(r6, r8, r9, r10, r11)
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r16)
            r1.f11441c = r3
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r18)
            r1.f11442d = r3
            r1.f11439a = r13
            r1.f11440b = r15
            r1.f11443e = r10
            r1.f11446h = r4
            java.lang.Object r13 = r0.m17720i(r5, r1)
            if (r13 != r2) goto L68
            return r2
        L68:
            java.lang.Boolean r13 = p201o7.AbstractC9536a.m17796a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.ExerciseRepository.m10377m(long, int, java.lang.String, boolean, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/ExerciseRepository.smali:813
    }
}

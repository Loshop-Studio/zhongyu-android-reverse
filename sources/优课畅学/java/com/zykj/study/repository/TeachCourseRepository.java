package com.zykj.study.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9527j;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class TeachCourseRepository {

    /* renamed from: a */
    public InterfaceC9527j f11525a;

    public TeachCourseRepository(InterfaceC9527j api) {
        AbstractC9133u.m16133g(api, "api");
        this.f11525a = api;
    }

    /* renamed from: f */
    public static final PagingSource m10405f(TeachCourseRepository teachCourseRepository) {
        return new TeachCourseRemoteMediator(teachCourseRepository.f11525a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10406b(int r5, int r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.study.repository.TeachCourseRepository$addSuperviseGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.repository.TeachCourseRepository$addSuperviseGroup$1 r0 = (com.zykj.study.repository.TeachCourseRepository$addSuperviseGroup$1) r0
            int r1 = r0.f11530e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11530e = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRepository$addSuperviseGroup$1 r0 = new com.zykj.study.repository.TeachCourseRepository$addSuperviseGroup$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f11528c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11530e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            o4.j r7 = r4.f11525a
            com.zykj.study.bean.teach.SuperviseBindCourseInput r2 = new com.zykj.study.bean.teach.SuperviseBindCourseInput
            r2.<init>(r5, r6)
            r0.f11526a = r5
            r0.f11527b = r6
            r0.f11530e = r3
            java.lang.Object r5 = r7.m17748m(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10406b(int, int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:75
    }

    /* renamed from: c */
    public final Object m10407c(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17747l(i10, i11, interfaceC9324c);
    }

    /* renamed from: d */
    public final Object m10408d(int i10, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17745j(i10, interfaceC9324c);
    }

    /* renamed from: e */
    public final InterfaceC9266c m10409e() {
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), 1, new InterfaceC10559a() { // from class: t4.j
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return TeachCourseRepository.m10405f(this.f20176a);
            }
        }).getFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10410g(int r18, p179m7.InterfaceC9324c r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.zykj.study.repository.TeachCourseRepository$getCourseProgress$1
            if (r3 == 0) goto L19
            r3 = r2
            com.zykj.study.repository.TeachCourseRepository$getCourseProgress$1 r3 = (com.zykj.study.repository.TeachCourseRepository$getCourseProgress$1) r3
            int r4 = r3.f11534d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f11534d = r4
            goto L1e
        L19:
            com.zykj.study.repository.TeachCourseRepository$getCourseProgress$1 r3 = new com.zykj.study.repository.TeachCourseRepository$getCourseProgress$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f11532b
            java.lang.Object r4 = p190n7.AbstractC9434a.m17291f()
            int r5 = r3.f11534d
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            kotlin.AbstractC9079b.m15926b(r2)
            goto L47
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.AbstractC9079b.m15926b(r2)
            o4.j r2 = r0.f11525a
            r3.f11531a = r1
            r3.f11534d = r6
            java.lang.Object r2 = r2.m17741f(r1, r3)
            if (r2 != r4) goto L47
            return r4
        L47:
            r3 = r2
            com.zykj.study.bean.teach.CourseProgress r3 = (com.zykj.study.bean.teach.CourseProgress) r3
            java.util.List r1 = r3.getGroupProgress()
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = p134i7.AbstractC8811w.m14786x(r1, r2)
            r8.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            r9 = r2
            com.zykj.study.bean.teach.GroupMemberProgress r9 = (com.zykj.study.bean.teach.GroupMemberProgress) r9
            java.util.List r2 = r9.getCatalogs()
            java.util.List r14 = p220q4.AbstractC9801a.m18353a(r2)
            r15 = 15
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.zykj.study.bean.teach.GroupMemberProgress r2 = com.zykj.study.bean.teach.GroupMemberProgress.copy$default(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.add(r2)
            goto L5d
        L82:
            r9 = 15
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.zykj.study.bean.teach.CourseProgress r1 = com.zykj.study.bean.teach.CourseProgress.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10410g(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:359
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10411h(int r12, java.lang.String r13, p179m7.InterfaceC9324c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.zykj.study.repository.TeachCourseRepository$getMemberCourseProgress$1
            if (r0 == 0) goto L13
            r0 = r14
            com.zykj.study.repository.TeachCourseRepository$getMemberCourseProgress$1 r0 = (com.zykj.study.repository.TeachCourseRepository$getMemberCourseProgress$1) r0
            int r1 = r0.f11539e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11539e = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRepository$getMemberCourseProgress$1 r0 = new com.zykj.study.repository.TeachCourseRepository$getMemberCourseProgress$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f11537c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11539e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f11536b
            java.lang.String r12 = (java.lang.String) r12
            kotlin.AbstractC9079b.m15926b(r14)
            goto L4b
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.AbstractC9079b.m15926b(r14)
            o4.j r14 = r11.f11525a
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r13)
            r0.f11536b = r2
            r0.f11535a = r12
            r0.f11539e = r3
            java.lang.Object r14 = r14.m17746k(r12, r13, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r0 = r14
            com.zykj.study.bean.teach.GroupMember r0 = (com.zykj.study.bean.teach.GroupMember) r0
            java.util.List r12 = r0.getCatalogs()
            java.util.List r8 = p220q4.AbstractC9801a.m18353a(r12)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.zykj.study.bean.teach.GroupMember r12 = com.zykj.study.bean.teach.GroupMember.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10411h(int, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:669
    }

    /* renamed from: i */
    public final Object m10412i(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17743h(i10, i11, interfaceC9324c);
    }

    /* renamed from: j */
    public final Object m10413j(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17737b(i10, i11, interfaceC9324c);
    }

    /* renamed from: k */
    public final Object m10414k(int i10, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17738c(i10, 1, interfaceC9324c);
    }

    /* renamed from: l */
    public final Object m10415l(int i10, String str, InterfaceC9324c interfaceC9324c) {
        return this.f11525a.m17736a(i10, str, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10416m(int r5, int r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.study.repository.TeachCourseRepository$refreshSuperviseGroupMember$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.repository.TeachCourseRepository$refreshSuperviseGroupMember$1 r0 = (com.zykj.study.repository.TeachCourseRepository$refreshSuperviseGroupMember$1) r0
            int r1 = r0.f11544e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11544e = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRepository$refreshSuperviseGroupMember$1 r0 = new com.zykj.study.repository.TeachCourseRepository$refreshSuperviseGroupMember$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f11542c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11544e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            o4.j r7 = r4.f11525a
            com.zykj.study.bean.teach.SuperviseGroupRefreshInput r2 = new com.zykj.study.bean.teach.SuperviseGroupRefreshInput
            r2.<init>(r5, r6)
            r0.f11540a = r5
            r0.f11541b = r6
            r0.f11544e = r3
            java.lang.Object r5 = r7.m17744i(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10416m(int, int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:973
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10417n(int r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.TeachCourseRepository$remoteTeachCourse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.TeachCourseRepository$remoteTeachCourse$1 r0 = (com.zykj.study.repository.TeachCourseRepository$remoteTeachCourse$1) r0
            int r1 = r0.f11548d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11548d = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRepository$remoteTeachCourse$1 r0 = new com.zykj.study.repository.TeachCourseRepository$remoteTeachCourse$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11546b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11548d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.j r6 = r4.f11525a
            com.zykj.study.bean.teach.TeachCourseRemoveInput r2 = new com.zykj.study.bean.teach.TeachCourseRemoveInput
            r2.<init>(r5)
            r0.f11545a = r5
            r0.f11548d = r3
            java.lang.Object r5 = r6.m17740e(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10417n(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:1140
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10418o(int r5, int r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.study.repository.TeachCourseRepository$removeSuperviseGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.repository.TeachCourseRepository$removeSuperviseGroup$1 r0 = (com.zykj.study.repository.TeachCourseRepository$removeSuperviseGroup$1) r0
            int r1 = r0.f11553e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11553e = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRepository$removeSuperviseGroup$1 r0 = new com.zykj.study.repository.TeachCourseRepository$removeSuperviseGroup$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f11551c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11553e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            o4.j r7 = r4.f11525a
            com.zykj.study.bean.teach.SuperviseGroupRemoveInput r2 = new com.zykj.study.bean.teach.SuperviseGroupRemoveInput
            r2.<init>(r5, r6)
            r0.f11549a = r5
            r0.f11550b = r6
            r0.f11553e = r3
            java.lang.Object r5 = r7.m17739d(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRepository.m10418o(int, int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRepository.smali:1303
    }
}

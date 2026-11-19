package com.zykj.study.repository;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.datastore.core.DataStore;
import androidx.lifecycle.LiveData;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.study.bean.course.CatalogIdInput;
import com.zykj.study.bean.course.CatalogInput;
import com.zykj.study.bean.course.CatalogUpdateInput;
import com.zykj.study.bean.course.ReorderCatalogReq;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.CourseStudyKeyEntity;
import com.zykj.study.data.MyCourseKeyEntity;
import com.zykj.study.repository.CourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9519b;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class CourseRepository {

    /* renamed from: a */
    public AppDatabase f11301a;

    /* renamed from: b */
    public final DataStore f11302b;

    /* renamed from: c */
    public InterfaceC9519b f11303c;

    public CourseRepository(AppDatabase db, DataStore userDataStore, InterfaceC9519b api) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(api, "api");
        this.f11301a = db;
        this.f11302b = userDataStore;
        this.f11303c = api;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m10329l(CourseRepository courseRepository, int i10, boolean z10, InterfaceC9324c interfaceC9324c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return courseRepository.m10341k(i10, z10, interfaceC9324c);
    }

    /* renamed from: n */
    public static final PagingSource m10330n(CourseRepository courseRepository) {
        return new CourseRemoteMediator(courseRepository.f11303c, null);
    }

    /* renamed from: r */
    public static final PagingSource m10331r(CourseRepository courseRepository, CourseStudyKeyEntity courseStudyKeyEntity) {
        return courseRepository.f11301a.courseStudyEntityDao().getCourseStudyList(courseStudyKeyEntity.getUserId());
    }

    /* renamed from: t */
    public static final PagingSource m10332t(CourseRepository courseRepository, MyCourseKeyEntity myCourseKeyEntity) {
        return courseRepository.f11301a.myCourseEntityDao().getMyCourseList(myCourseKeyEntity.getUserId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r1.insert(r4, r2) == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10333A(com.zykj.study.data.MyCourseEntity r17, p179m7.InterfaceC9324c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.zykj.study.repository.CourseRepository$updateCourse$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.study.repository.CourseRepository$updateCourse$1 r2 = (com.zykj.study.repository.CourseRepository$updateCourse$1) r2
            int r3 = r2.f11362d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f11362d = r3
            goto L1c
        L17:
            com.zykj.study.repository.CourseRepository$updateCourse$1 r2 = new com.zykj.study.repository.CourseRepository$updateCourse$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f11360b
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            int r4 = r2.f11362d
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r2 = r2.f11359a
            com.zykj.study.data.MyCourseEntity r2 = (com.zykj.study.data.MyCourseEntity) r2
            kotlin.AbstractC9079b.m15926b(r1)
            goto La0
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r4 = r2.f11359a
            com.zykj.study.data.MyCourseEntity r4 = (com.zykj.study.data.MyCourseEntity) r4
            kotlin.AbstractC9079b.m15926b(r1)
            goto L8b
        L44:
            kotlin.AbstractC9079b.m15926b(r1)
            o4.b r1 = r0.f11303c
            com.zykj.study.bean.course.CourseCreateInput r7 = new com.zykj.study.bean.course.CourseCreateInput
            int r4 = r17.getId()
            java.lang.Integer r8 = p201o7.AbstractC9536a.m17798c(r4)
            java.lang.String r9 = r17.getTitle()
            java.lang.String r10 = r17.getDescription()
            int r4 = r17.getPeriodId()
            java.lang.Integer r11 = p201o7.AbstractC9536a.m17798c(r4)
            int r4 = r17.getGradeId()
            java.lang.Integer r12 = p201o7.AbstractC9536a.m17798c(r4)
            int r4 = r17.getSubjectId()
            java.lang.Integer r13 = p201o7.AbstractC9536a.m17798c(r4)
            java.lang.String r14 = r17.getCover()
            boolean r15 = r17.isPublic()
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r17
            r2.f11359a = r4
            r2.f11362d = r6
            java.lang.Object r1 = r1.m17705t(r7, r2)
            if (r1 != r3) goto L8b
            goto L9f
        L8b:
            com.zykj.study.data.AppDatabase r1 = r0.f11301a
            com.zykj.study.data.MyCourseEntityDao r1 = r1.myCourseEntityDao()
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r4)
            r2.f11359a = r7
            r2.f11362d = r5
            java.lang.Object r1 = r1.insert(r4, r2)
            if (r1 != r3) goto La0
        L9f:
            return r3
        La0:
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10333A(com.zykj.study.data.MyCourseEntity, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:228
    }

    /* renamed from: d */
    public final Object m10334d(int i10, String str, int i11, boolean z10, InterfaceC9324c interfaceC9324c) {
        Object objM17702q = this.f11303c.m17702q(new CatalogInput(i10, str, i11, z10), interfaceC9324c);
        return objM17702q == AbstractC9434a.m17291f() ? objM17702q : C8736p.f16368a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (r7.insert(r4, r2) == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10335e(com.zykj.study.data.MyCourseEntity r17, p179m7.InterfaceC9324c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.zykj.study.repository.CourseRepository$createMyCourse$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.study.repository.CourseRepository$createMyCourse$1 r2 = (com.zykj.study.repository.CourseRepository$createMyCourse$1) r2
            int r3 = r2.f11308e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f11308e = r3
            goto L1c
        L17:
            com.zykj.study.repository.CourseRepository$createMyCourse$1 r2 = new com.zykj.study.repository.CourseRepository$createMyCourse$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f11306c
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            int r4 = r2.f11308e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r2 = r2.f11304a
            com.zykj.study.data.MyCourseEntity r2 = (com.zykj.study.data.MyCourseEntity) r2
            kotlin.AbstractC9079b.m15926b(r1)
            goto La4
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r4 = r2.f11304a
            com.zykj.study.data.MyCourseEntity r4 = (com.zykj.study.data.MyCourseEntity) r4
            kotlin.AbstractC9079b.m15926b(r1)
            goto L84
        L44:
            kotlin.AbstractC9079b.m15926b(r1)
            o4.b r1 = r0.f11303c
            com.zykj.study.bean.course.CourseCreateInput r7 = new com.zykj.study.bean.course.CourseCreateInput
            java.lang.String r9 = r17.getTitle()
            java.lang.String r10 = r17.getDescription()
            int r4 = r17.getPeriodId()
            java.lang.Integer r11 = p201o7.AbstractC9536a.m17798c(r4)
            int r4 = r17.getGradeId()
            java.lang.Integer r12 = p201o7.AbstractC9536a.m17798c(r4)
            int r4 = r17.getSubjectId()
            java.lang.Integer r13 = p201o7.AbstractC9536a.m17798c(r4)
            java.lang.String r14 = r17.getCover()
            boolean r15 = r17.isPublic()
            r8 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r17
            r2.f11304a = r4
            r2.f11308e = r6
            java.lang.Object r1 = r1.m17706u(r7, r2)
            if (r1 != r3) goto L84
            goto La3
        L84:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4.setId(r1)
            com.zykj.study.data.AppDatabase r7 = r0.f11301a
            com.zykj.study.data.MyCourseEntityDao r7 = r7.myCourseEntityDao()
            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r4)
            r2.f11304a = r8
            r2.f11305b = r1
            r2.f11308e = r5
            java.lang.Object r1 = r7.insert(r4, r2)
            if (r1 != r3) goto La4
        La3:
            return r3
        La4:
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10335e(com.zykj.study.data.MyCourseEntity, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:625
    }

    /* renamed from: f */
    public final Object m10336f(int i10, InterfaceC9324c interfaceC9324c) {
        Object objM17708w = this.f11303c.m17708w(new CatalogIdInput(i10), interfaceC9324c);
        return objM17708w == AbstractC9434a.m17291f() ? objM17708w : C8736p.f16368a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r9.deleteByCourse(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10337g(int r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.study.repository.CourseRepository$deleteCourse$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.study.repository.CourseRepository$deleteCourse$1 r0 = (com.zykj.study.repository.CourseRepository$deleteCourse$1) r0
            int r1 = r0.f11312d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11312d = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$deleteCourse$1 r0 = new com.zykj.study.repository.CourseRepository$deleteCourse$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11310b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11312d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r9)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            int r8 = r0.f11309a
            kotlin.AbstractC9079b.m15926b(r9)
            goto L51
        L3a:
            kotlin.AbstractC9079b.m15926b(r9)
            o4.b r9 = r7.f11303c
            com.zykj.study.bean.course.CourseDeleteInput r2 = new com.zykj.study.bean.course.CourseDeleteInput
            r5 = 0
            r6 = 0
            r2.<init>(r8, r5, r3, r6)
            r0.f11309a = r8
            r0.f11312d = r4
            java.lang.Object r9 = r9.m17709y(r2, r0)
            if (r9 != r1) goto L51
            goto L61
        L51:
            com.zykj.study.data.AppDatabase r9 = r7.f11301a
            com.zykj.study.data.MyCourseEntityDao r9 = r9.myCourseEntityDao()
            r0.f11309a = r8
            r0.f11312d = r3
            java.lang.Object r8 = r9.deleteByCourse(r8, r0)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            java.lang.Boolean r8 = p201o7.AbstractC9536a.m17796a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10337g(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:1030
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10338h(int r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.CourseRepository$dismountCourse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.CourseRepository$dismountCourse$1 r0 = (com.zykj.study.repository.CourseRepository$dismountCourse$1) r0
            int r1 = r0.f11316d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11316d = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$dismountCourse$1 r0 = new com.zykj.study.repository.CourseRepository$dismountCourse$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11314b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11316d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f11313a
            kotlin.AbstractC9079b.m15926b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.b r6 = r4.f11303c
            com.zykj.study.bean.course.CourseIdInput r2 = new com.zykj.study.bean.course.CourseIdInput
            r2.<init>(r5)
            r0.f11313a = r5
            r0.f11316d = r3
            java.lang.Object r6 = r6.m17707v(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.zykj.study.data.AppDatabase r6 = r4.f11301a
            com.zykj.study.data.MyCourseEntityDao r6 = r6.myCourseEntityDao()
            com.zykj.study.bean.course.CourseType r0 = com.zykj.study.bean.course.CourseType.UNDERCARRIAGE
            r6.updateStatus(r5, r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10338h(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:1257
    }

    /* renamed from: i */
    public final LiveData m10339i(int i10) {
        return this.f11301a.myCourseEntityDao().findCourse(i10);
    }

    /* renamed from: j */
    public final Object m10340j(int i10, InterfaceC9324c interfaceC9324c) {
        return this.f11303c.m17685B(i10, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0163, code lost:
    
        if (r10.update(r13, r4) == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10341k(int r33, boolean r34, p179m7.InterfaceC9324c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10341k(int, boolean, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:1487
    }

    /* renamed from: m */
    public final InterfaceC9266c m10342m() {
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), 1, new InterfaceC10559a() { // from class: t4.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseRepository.m10330n(this.f20168a);
            }
        }).getFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10343o(java.lang.String r9, p179m7.InterfaceC9324c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.zykj.study.repository.CourseRepository$getCourseStudyKey$1
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.study.repository.CourseRepository$getCourseStudyKey$1 r0 = (com.zykj.study.repository.CourseRepository$getCourseStudyKey$1) r0
            int r1 = r0.f11332f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11332f = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$getCourseStudyKey$1 r0 = new com.zykj.study.repository.CourseRepository$getCourseStudyKey$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11330d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11332f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r9 = r0.f11329c
            com.zykj.study.data.CourseStudyKeyEntity r9 = (com.zykj.study.data.CourseStudyKeyEntity) r9
            java.lang.Object r9 = r0.f11328b
            com.zykj.study.data.CourseStudyKeyEntity r9 = (com.zykj.study.data.CourseStudyKeyEntity) r9
            java.lang.Object r9 = r0.f11327a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.AbstractC9079b.m15926b(r10)
            return r10
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.Object r9 = r0.f11329c
            com.zykj.study.data.CourseStudyKeyEntity r9 = (com.zykj.study.data.CourseStudyKeyEntity) r9
            java.lang.Object r2 = r0.f11328b
            com.zykj.study.data.CourseStudyKeyEntity r2 = (com.zykj.study.data.CourseStudyKeyEntity) r2
            java.lang.Object r4 = r0.f11327a
            java.lang.String r4 = (java.lang.String) r4
            kotlin.AbstractC9079b.m15926b(r10)
            goto L9a
        L53:
            java.lang.Object r9 = r0.f11327a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.AbstractC9079b.m15926b(r10)
            goto L6f
        L5b:
            kotlin.AbstractC9079b.m15926b(r10)
            com.zykj.study.data.AppDatabase r10 = r8.f11301a
            com.zykj.study.data.CourseStudyKeyEntityDao r10 = r10.courseStudyKeyEntityDao()
            r0.f11327a = r9
            r0.f11332f = r5
            java.lang.Object r10 = r10.getKeyByUserId(r9, r0)
            if (r10 != r1) goto L6f
            goto Lba
        L6f:
            r2 = r10
            com.zykj.study.data.CourseStudyKeyEntity r2 = (com.zykj.study.data.CourseStudyKeyEntity) r2
            if (r2 != 0) goto Lbc
            com.zykj.study.data.CourseStudyKeyEntity r10 = new com.zykj.study.data.CourseStudyKeyEntity
            r6 = 0
            r7 = 0
            r10.<init>(r6, r9, r5, r7)
            com.zykj.study.data.AppDatabase r5 = r8.f11301a
            com.zykj.study.data.CourseStudyKeyEntityDao r5 = r5.courseStudyKeyEntityDao()
            r0.f11327a = r9
            java.lang.Object r6 = p201o7.AbstractC9543h.m17814a(r2)
            r0.f11328b = r6
            java.lang.Object r6 = p201o7.AbstractC9543h.m17814a(r10)
            r0.f11329c = r6
            r0.f11332f = r4
            java.lang.Object r4 = r5.insert(r10, r0)
            if (r4 != r1) goto L98
            goto Lba
        L98:
            r4 = r9
            r9 = r10
        L9a:
            com.zykj.study.data.AppDatabase r10 = r8.f11301a
            com.zykj.study.data.CourseStudyKeyEntityDao r10 = r10.courseStudyKeyEntityDao()
            java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r4)
            r0.f11327a = r5
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r2)
            r0.f11328b = r2
            java.lang.Object r9 = p201o7.AbstractC9543h.m17814a(r9)
            r0.f11329c = r9
            r0.f11332f = r3
            java.lang.Object r9 = r10.getKeyByUserId(r4, r0)
            if (r9 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            return r9
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10343o(java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:2366
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10344p(java.lang.String r12, p179m7.InterfaceC9324c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.zykj.study.repository.CourseRepository$getKey$1
            if (r0 == 0) goto L13
            r0 = r13
            com.zykj.study.repository.CourseRepository$getKey$1 r0 = (com.zykj.study.repository.CourseRepository$getKey$1) r0
            int r1 = r0.f11338f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11338f = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$getKey$1 r0 = new com.zykj.study.repository.CourseRepository$getKey$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f11336d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11338f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r12 = r0.f11335c
            com.zykj.study.data.MyCourseKeyEntity r12 = (com.zykj.study.data.MyCourseKeyEntity) r12
            java.lang.Object r12 = r0.f11334b
            com.zykj.study.data.MyCourseKeyEntity r12 = (com.zykj.study.data.MyCourseKeyEntity) r12
            java.lang.Object r12 = r0.f11333a
            java.lang.String r12 = (java.lang.String) r12
            kotlin.AbstractC9079b.m15926b(r13)
            return r13
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r0.f11335c
            com.zykj.study.data.MyCourseKeyEntity r12 = (com.zykj.study.data.MyCourseKeyEntity) r12
            java.lang.Object r2 = r0.f11334b
            com.zykj.study.data.MyCourseKeyEntity r2 = (com.zykj.study.data.MyCourseKeyEntity) r2
            java.lang.Object r4 = r0.f11333a
            java.lang.String r4 = (java.lang.String) r4
            kotlin.AbstractC9079b.m15926b(r13)
            goto L9e
        L53:
            java.lang.Object r12 = r0.f11333a
            java.lang.String r12 = (java.lang.String) r12
            kotlin.AbstractC9079b.m15926b(r13)
        L5a:
            r7 = r12
            goto L70
        L5c:
            kotlin.AbstractC9079b.m15926b(r13)
            com.zykj.study.data.AppDatabase r13 = r11.f11301a
            com.zykj.study.data.MyCourseKeyEntityDao r13 = r13.myCourseKeyEntityDao()
            r0.f11333a = r12
            r0.f11338f = r5
            java.lang.Object r13 = r13.getKeyByUserId(r12, r0)
            if (r13 != r1) goto L5a
            goto Lbe
        L70:
            r2 = r13
            com.zykj.study.data.MyCourseKeyEntity r2 = (com.zykj.study.data.MyCourseKeyEntity) r2
            if (r2 != 0) goto Lc0
            com.zykj.study.data.MyCourseKeyEntity r5 = new com.zykj.study.data.MyCourseKeyEntity
            r9 = 20
            r10 = 0
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            com.zykj.study.data.AppDatabase r12 = r11.f11301a
            com.zykj.study.data.MyCourseKeyEntityDao r12 = r12.myCourseKeyEntityDao()
            r0.f11333a = r7
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r2)
            r0.f11334b = r13
            java.lang.Object r13 = p201o7.AbstractC9543h.m17814a(r5)
            r0.f11335c = r13
            r0.f11338f = r4
            java.lang.Object r12 = r12.insert(r5, r0)
            if (r12 != r1) goto L9c
            goto Lbe
        L9c:
            r12 = r5
            r4 = r7
        L9e:
            com.zykj.study.data.AppDatabase r13 = r11.f11301a
            com.zykj.study.data.MyCourseKeyEntityDao r13 = r13.myCourseKeyEntityDao()
            java.lang.Object r5 = p201o7.AbstractC9543h.m17814a(r4)
            r0.f11333a = r5
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r2)
            r0.f11334b = r2
            java.lang.Object r12 = p201o7.AbstractC9543h.m17814a(r12)
            r0.f11335c = r12
            r0.f11338f = r3
            java.lang.Object r12 = r13.getKeyByUserId(r4, r0)
            if (r12 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            return r12
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10344p(java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:2774
    }

    /* renamed from: q */
    public final InterfaceC9266c m10345q(final CourseStudyKeyEntity key) {
        AbstractC9133u.m16133g(key, "key");
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), null, new CourseStudyRemoteMediator(this.f11301a, this.f11303c, key.getId()), new InterfaceC10559a() { // from class: t4.c
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseRepository.m10331r(this.f20166a, key);
            }
        }, 2, null).getFlow();
    }

    /* renamed from: s */
    public final InterfaceC9266c m10346s(final MyCourseKeyEntity key) {
        AbstractC9133u.m16133g(key, "key");
        return new Pager(new PagingConfig(key.getTake(), 0, false, 0, 0, 0, 62, null), null, new PageKeyedRemoteMediator(this.f11301a, this.f11303c, key.getId()), new InterfaceC10559a() { // from class: t4.b
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseRepository.m10332t(this.f20164a, key);
            }
        }, 2, null).getFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10347u(int r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.CourseRepository$publishCourse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.CourseRepository$publishCourse$1 r0 = (com.zykj.study.repository.CourseRepository$publishCourse$1) r0
            int r1 = r0.f11342d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11342d = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$publishCourse$1 r0 = new com.zykj.study.repository.CourseRepository$publishCourse$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11340b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11342d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f11339a
            kotlin.AbstractC9079b.m15926b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.b r6 = r4.f11303c
            com.zykj.study.bean.course.CourseIdInput r2 = new com.zykj.study.bean.course.CourseIdInput
            r2.<init>(r5)
            r0.f11339a = r5
            r0.f11342d = r3
            java.lang.Object r6 = r6.m17704s(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            com.zykj.study.data.AppDatabase r6 = r4.f11301a
            com.zykj.study.data.MyCourseEntityDao r6 = r6.myCourseEntityDao()
            com.zykj.study.bean.course.CourseType r0 = com.zykj.study.bean.course.CourseType.GROUNDING
            r6.updateStatus(r5, r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10347u(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:3418
    }

    /* renamed from: v */
    public final Object m10348v(ReorderCatalogReq reorderCatalogReq, InterfaceC9324c interfaceC9324c) {
        Object objM17696k = this.f11303c.m17696k(reorderCatalogReq, interfaceC9324c);
        return objM17696k == AbstractC9434a.m17291f() ? objM17696k : C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10349w(int r30, java.lang.String r31, p179m7.InterfaceC9324c r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10349w(int, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:3641
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10350x(int r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.CourseRepository$teachCourse$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.CourseRepository$teachCourse$1 r0 = (com.zykj.study.repository.CourseRepository$teachCourse$1) r0
            int r1 = r0.f11354d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11354d = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$teachCourse$1 r0 = new com.zykj.study.repository.CourseRepository$teachCourse$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11352b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11354d
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
            o4.b r6 = r4.f11303c
            com.zykj.study.bean.teach.TeachCourseAddInput r2 = new com.zykj.study.bean.teach.TeachCourseAddInput
            r2.<init>(r5)
            r0.f11351a = r5
            r0.f11354d = r3
            java.lang.Object r5 = r6.m17695j(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10350x(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:4208
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7.deleteById(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10351y(int r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.zykj.study.repository.CourseRepository$unSubscribe$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.repository.CourseRepository$unSubscribe$1 r0 = (com.zykj.study.repository.CourseRepository$unSubscribe$1) r0
            int r1 = r0.f11358d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11358d = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRepository$unSubscribe$1 r0 = new com.zykj.study.repository.CourseRepository$unSubscribe$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f11356b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11358d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f11355a
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4f
        L3a:
            kotlin.AbstractC9079b.m15926b(r7)
            o4.b r7 = r5.f11303c
            com.zykj.study.bean.course.CourseSubscribeInput r2 = new com.zykj.study.bean.course.CourseSubscribeInput
            r2.<init>(r6)
            r0.f11355a = r6
            r0.f11358d = r4
            java.lang.Object r7 = r7.m17690e(r2, r0)
            if (r7 != r1) goto L4f
            goto L5f
        L4f:
            com.zykj.study.data.AppDatabase r7 = r5.f11301a
            com.zykj.study.data.CourseStudyEntityDao r7 = r7.courseStudyEntityDao()
            r0.f11355a = r6
            r0.f11358d = r3
            java.lang.Object r6 = r7.deleteById(r6, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRepository.m10351y(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRepository.smali:4371
    }

    /* renamed from: z */
    public final Object m10352z(int i10, String str, InterfaceC9324c interfaceC9324c) {
        Object objM17692g = this.f11303c.m17692g(new CatalogUpdateInput(i10, str), interfaceC9324c);
        return objM17692g == AbstractC9434a.m17291f() ? objM17692g : C8736p.f16368a;
    }
}

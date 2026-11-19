package com.zykj.study.viewmodels;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseManageVewModel$catalogDataList$1", m17801f = "CourseManageVewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseManageVewModel$catalogDataList$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f13948a;

    /* renamed from: b */
    public /* synthetic */ Object f13949b;

    /* renamed from: c */
    public /* synthetic */ Object f13950c;

    public CourseManageVewModel$catalogDataList$1(InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, List list2, InterfaceC9324c interfaceC9324c) {
        CourseManageVewModel$catalogDataList$1 courseManageVewModel$catalogDataList$1 = new CourseManageVewModel$catalogDataList$1(interfaceC9324c);
        courseManageVewModel$catalogDataList$1.f13949b = list;
        courseManageVewModel$catalogDataList$1.f13950c = list2;
        return courseManageVewModel$catalogDataList$1.invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.f13949b
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f13950c
            java.util.List r2 = (java.util.List) r2
            p190n7.AbstractC9434a.m17291f()
            int r3 = r0.f13948a
            if (r3 != 0) goto Lf2
            kotlin.AbstractC9079b.m15926b(r20)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lf1
            java.lang.Object r4 = r1.next()
            com.zykj.study.bean.course.CatalogLockedBean r4 = (com.zykj.study.bean.course.CatalogLockedBean) r4
            long r5 = r4.getId()
            java.lang.Long r5 = p201o7.AbstractC9536a.m17799d(r5)
            boolean r13 = r2.contains(r5)
            long r7 = r4.getId()
            java.lang.String r9 = r4.getTitle()
            boolean r5 = r4.isLeaf()
            r17 = 0
            r18 = 1
            if (r5 != 0) goto L57
            java.util.List r5 = r4.getChildren()
            if (r5 == 0) goto L57
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L54
            goto L57
        L54:
            r12 = r18
            goto L59
        L57:
            r12 = r17
        L59:
            boolean r5 = r4.isLeaf()
            if (r5 != 0) goto L98
            java.util.List r5 = r4.getChildren()
            if (r5 == 0) goto L95
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L6c
            goto L95
        L6c:
            java.util.List r5 = r4.getChildren()
            if (r5 == 0) goto L7b
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L7b
        L78:
            r5 = r17
            goto L93
        L7b:
            java.util.Iterator r5 = r5.iterator()
        L7f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r5.next()
            com.zykj.study.bean.course.CatalogLockedBean r6 = (com.zykj.study.bean.course.CatalogLockedBean) r6
            int r6 = r6.getLocked()
            if (r6 != 0) goto L7f
            r5 = r18
        L93:
            r11 = r5
            goto La1
        L95:
            r11 = r18
            goto La1
        L98:
            int r5 = r4.getLocked()
            if (r5 != 0) goto L9f
            goto L95
        L9f:
            r11 = r17
        La1:
            boolean r10 = r4.isLeaf()
            com.zykj.study.bean.course.CatalogManageData r6 = new com.zykj.study.bean.course.CatalogManageData
            r15 = 64
            r16 = 0
            r14 = 0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r6)
            if (r13 == 0) goto L1d
            java.util.List r4 = r4.getChildren()
            if (r4 == 0) goto L1d
            java.util.Iterator r4 = r4.iterator()
        Lbe:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1d
            java.lang.Object r5 = r4.next()
            com.zykj.study.bean.course.CatalogLockedBean r5 = (com.zykj.study.bean.course.CatalogLockedBean) r5
            long r7 = r5.getId()
            java.lang.String r9 = r5.getTitle()
            int r6 = r5.getLocked()
            if (r6 != 0) goto Ldb
            r11 = r18
            goto Ldd
        Ldb:
            r11 = r17
        Ldd:
            boolean r10 = r5.isLeaf()
            com.zykj.study.bean.course.CatalogManageData r6 = new com.zykj.study.bean.course.CatalogManageData
            r15 = 48
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r6)
            goto Lbe
        Lf1:
            return r3
        Lf2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseManageVewModel$catalogDataList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1.smali:112
    }
}

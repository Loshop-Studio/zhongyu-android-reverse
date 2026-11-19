package com.zykj.study.repository;

import androidx.paging.LoadType;
import com.zykj.study.data.MyCourseKeyEntity;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.PageKeyedRemoteMediator$saveToLocal$2", m17801f = "PageKeyedRemoteMediator.kt", m17802l = {69, 74, 76}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageKeyedRemoteMediator$saveToLocal$2 extends SuspendLambda implements InterfaceC10570l {

    /* renamed from: a */
    public int f11467a;

    /* renamed from: b */
    public final /* synthetic */ LoadType f11468b;

    /* renamed from: c */
    public final /* synthetic */ PageKeyedRemoteMediator f11469c;

    /* renamed from: d */
    public final /* synthetic */ MyCourseKeyEntity f11470d;

    /* renamed from: e */
    public final /* synthetic */ List f11471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageKeyedRemoteMediator$saveToLocal$2(LoadType loadType, PageKeyedRemoteMediator pageKeyedRemoteMediator, MyCourseKeyEntity myCourseKeyEntity, List list, InterfaceC9324c interfaceC9324c) {
        super(1, interfaceC9324c);
        this.f11468b = loadType;
        this.f11469c = pageKeyedRemoteMediator;
        this.f11470d = myCourseKeyEntity;
        this.f11471e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
        return new PageKeyedRemoteMediator$saveToLocal$2(this.f11468b, this.f11469c, this.f11470d, this.f11471e, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r6.insert(r1, r5) != r0) goto L23;
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
            int r1 = r5.f11467a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.AbstractC9079b.m15926b(r6)
            goto L71
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L5c
        L21:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L47
        L25:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.paging.LoadType r6 = r5.f11468b
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            if (r6 != r1) goto L47
            com.zykj.study.repository.PageKeyedRemoteMediator r6 = r5.f11469c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.PageKeyedRemoteMediator.m10378a(r6)
            com.zykj.study.data.MyCourseEntityDao r6 = r6.myCourseEntityDao()
            com.zykj.study.data.MyCourseKeyEntity r1 = r5.f11470d
            java.lang.String r1 = r1.getUserId()
            r5.f11467a = r4
            java.lang.Object r6 = r6.deleteByUserId(r1, r5)
            if (r6 != r0) goto L47
            goto L70
        L47:
            com.zykj.study.repository.PageKeyedRemoteMediator r6 = r5.f11469c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.PageKeyedRemoteMediator.m10378a(r6)
            com.zykj.study.data.MyCourseKeyEntityDao r6 = r6.myCourseKeyEntityDao()
            com.zykj.study.data.MyCourseKeyEntity r1 = r5.f11470d
            r5.f11467a = r3
            java.lang.Object r6 = r6.update(r1, r5)
            if (r6 != r0) goto L5c
            goto L70
        L5c:
            com.zykj.study.repository.PageKeyedRemoteMediator r6 = r5.f11469c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.PageKeyedRemoteMediator.m10378a(r6)
            com.zykj.study.data.MyCourseEntityDao r6 = r6.myCourseEntityDao()
            java.util.List r1 = r5.f11471e
            r5.f11467a = r2
            java.lang.Object r6 = r6.insert(r1, r5)
            if (r6 != r0) goto L71
        L70:
            return r0
        L71:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.PageKeyedRemoteMediator$saveToLocal$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2.smali:151
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c interfaceC9324c) {
        return ((PageKeyedRemoteMediator$saveToLocal$2) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}

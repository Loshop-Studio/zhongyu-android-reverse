package com.zykj.study.repository;

import androidx.paging.LoadType;
import com.zykj.study.data.CourseStudyKeyEntity;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseStudyRemoteMediator$saveToLocal$2", m17801f = "CourseStudyRemoteMediator.kt", m17802l = {68, 73, 79}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CourseStudyRemoteMediator$saveToLocal$2 extends SuspendLambda implements InterfaceC10570l {

    /* renamed from: a */
    public int f11381a;

    /* renamed from: b */
    public final /* synthetic */ LoadType f11382b;

    /* renamed from: c */
    public final /* synthetic */ CourseStudyRemoteMediator f11383c;

    /* renamed from: d */
    public final /* synthetic */ CourseStudyKeyEntity f11384d;

    /* renamed from: e */
    public final /* synthetic */ List f11385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseStudyRemoteMediator$saveToLocal$2(LoadType loadType, CourseStudyRemoteMediator courseStudyRemoteMediator, CourseStudyKeyEntity courseStudyKeyEntity, List list, InterfaceC9324c interfaceC9324c) {
        super(1, interfaceC9324c);
        this.f11382b = loadType;
        this.f11383c = courseStudyRemoteMediator;
        this.f11384d = courseStudyKeyEntity;
        this.f11385e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
        return new CourseStudyRemoteMediator$saveToLocal$2(this.f11382b, this.f11383c, this.f11384d, this.f11385e, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r6.insert(r1, r5) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[LOOP:0: B:21:0x0065->B:23:0x006b, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f11381a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.AbstractC9079b.m15926b(r6)
            goto L8e
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L5d
        L22:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L48
        L26:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.paging.LoadType r6 = r5.f11382b
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            if (r6 != r1) goto L48
            com.zykj.study.repository.CourseStudyRemoteMediator r6 = r5.f11383c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.CourseStudyRemoteMediator.m10353a(r6)
            com.zykj.study.data.CourseStudyEntityDao r6 = r6.courseStudyEntityDao()
            com.zykj.study.data.CourseStudyKeyEntity r1 = r5.f11384d
            java.lang.String r1 = r1.getUserId()
            r5.f11381a = r4
            java.lang.Object r6 = r6.deleteByUserId(r1, r5)
            if (r6 != r0) goto L48
            goto L8d
        L48:
            com.zykj.study.repository.CourseStudyRemoteMediator r6 = r5.f11383c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.CourseStudyRemoteMediator.m10353a(r6)
            com.zykj.study.data.CourseStudyKeyEntityDao r6 = r6.courseStudyKeyEntityDao()
            com.zykj.study.data.CourseStudyKeyEntity r1 = r5.f11384d
            r5.f11381a = r3
            java.lang.Object r6 = r6.update(r1, r5)
            if (r6 != r0) goto L5d
            goto L8d
        L5d:
            java.util.List r6 = r5.f11385e
            com.zykj.study.data.CourseStudyKeyEntity r1 = r5.f11384d
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r6.next()
            com.zykj.study.data.CourseStudyEntity r3 = (com.zykj.study.data.CourseStudyEntity) r3
            java.lang.String r4 = r1.getUserId()
            r3.setStudyUserId(r4)
            goto L65
        L79:
            com.zykj.study.repository.CourseStudyRemoteMediator r6 = r5.f11383c
            com.zykj.study.data.AppDatabase r6 = com.zykj.study.repository.CourseStudyRemoteMediator.m10353a(r6)
            com.zykj.study.data.CourseStudyEntityDao r6 = r6.courseStudyEntityDao()
            java.util.List r1 = r5.f11385e
            r5.f11381a = r2
            java.lang.Object r6 = r6.insert(r1, r5)
            if (r6 != r0) goto L8e
        L8d:
            return r0
        L8e:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseStudyRemoteMediator$saveToLocal$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2.smali:151
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c interfaceC9324c) {
        return ((CourseStudyRemoteMediator$saveToLocal$2) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}

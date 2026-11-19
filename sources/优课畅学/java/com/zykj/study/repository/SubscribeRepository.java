package com.zykj.study.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.study.bean.FreeSubscribeReq;
import com.zykj.study.repository.SubscribeRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9526i;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SubscribeRepository {

    /* renamed from: a */
    public InterfaceC9526i f11509a;

    /* renamed from: b */
    public int f11510b;

    public SubscribeRepository(InterfaceC9526i subscribeApi) {
        AbstractC9133u.m16133g(subscribeApi, "subscribeApi");
        this.f11509a = subscribeApi;
    }

    /* renamed from: f */
    public static final PagingSource m10395f(final SubscribeRepository subscribeRepository, FreeSubscribeReq freeSubscribeReq) {
        return new FreeSubscribeSource(subscribeRepository.f11509a, freeSubscribeReq, new InterfaceC10570l() { // from class: t4.i
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SubscribeRepository.m10396g(this.f20175a, ((Integer) obj).intValue());
            }
        });
    }

    /* renamed from: g */
    public static final C8736p m10396g(SubscribeRepository subscribeRepository, int i10) {
        subscribeRepository.f11510b = i10;
        return C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10397c(com.zykj.study.bean.DeleteSubBatchReq r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.SubscribeRepository$deleteBatchSubscribe$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.SubscribeRepository$deleteBatchSubscribe$1 r0 = (com.zykj.study.repository.SubscribeRepository$deleteBatchSubscribe$1) r0
            int r1 = r0.f11514d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11514d = r1
            goto L18
        L13:
            com.zykj.study.repository.SubscribeRepository$deleteBatchSubscribe$1 r0 = new com.zykj.study.repository.SubscribeRepository$deleteBatchSubscribe$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11512b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11514d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f11511a
            com.zykj.study.bean.DeleteSubBatchReq r5 = (com.zykj.study.bean.DeleteSubBatchReq) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.i r6 = r4.f11509a
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r5)
            r0.f11511a = r2
            r0.f11514d = r3
            java.lang.Object r5 = r6.m17731b(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.SubscribeRepository.m10397c(com.zykj.study.bean.DeleteSubBatchReq, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/SubscribeRepository.smali:112
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10398d(com.zykj.study.bean.DeleteSubSingReq r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.SubscribeRepository$deleteSingSubscribe$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.SubscribeRepository$deleteSingSubscribe$1 r0 = (com.zykj.study.repository.SubscribeRepository$deleteSingSubscribe$1) r0
            int r1 = r0.f11518d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11518d = r1
            goto L18
        L13:
            com.zykj.study.repository.SubscribeRepository$deleteSingSubscribe$1 r0 = new com.zykj.study.repository.SubscribeRepository$deleteSingSubscribe$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11516b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11518d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f11515a
            com.zykj.study.bean.DeleteSubSingReq r5 = (com.zykj.study.bean.DeleteSubSingReq) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.i r6 = r4.f11509a
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r5)
            r0.f11515a = r2
            r0.f11518d = r3
            java.lang.Object r5 = r6.m17735f(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.SubscribeRepository.m10398d(com.zykj.study.bean.DeleteSubSingReq, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/SubscribeRepository.smali:282
    }

    /* renamed from: e */
    public final InterfaceC9266c m10399e(final FreeSubscribeReq req) {
        AbstractC9133u.m16133g(req, "req");
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), null, new InterfaceC10559a() { // from class: t4.h
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return SubscribeRepository.m10395f(this.f20173a, req);
            }
        }, 2, null).getFlow();
    }

    /* renamed from: h */
    public final Object m10400h(long j10, InterfaceC9324c interfaceC9324c) {
        return this.f11509a.m17730a(j10, interfaceC9324c);
    }

    /* renamed from: i */
    public final Object m10401i(long j10, InterfaceC9324c interfaceC9324c) {
        return this.f11509a.m17734e(j10, interfaceC9324c);
    }

    /* renamed from: j */
    public final Object m10402j(long j10, InterfaceC9324c interfaceC9324c) {
        return this.f11509a.m17732c(j10, interfaceC9324c);
    }

    /* renamed from: k */
    public final int m10403k() {
        return this.f11510b;
    }
}

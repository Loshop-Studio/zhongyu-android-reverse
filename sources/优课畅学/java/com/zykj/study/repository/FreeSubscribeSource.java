package com.zykj.study.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.study.bean.FreeSubscribe;
import com.zykj.study.bean.FreeSubscribeReq;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9526i;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FreeSubscribeSource extends PagingSource<Integer, FreeSubscribe> {

    /* renamed from: a */
    public final InterfaceC9526i f11447a;

    /* renamed from: b */
    public final FreeSubscribeReq f11448b;

    /* renamed from: c */
    public final InterfaceC10570l f11449c;

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.FreeSubscribeSource", m17801f = "FreeSubscribeSource.kt", m17802l = {23}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.FreeSubscribeSource$load$1 */
    public static final class C77471 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11450a;

        /* renamed from: b */
        public int f11451b;

        /* renamed from: c */
        public int f11452c;

        /* renamed from: d */
        public /* synthetic */ Object f11453d;

        /* renamed from: f */
        public int f11455f;

        public C77471(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11453d = obj;
            this.f11455f |= Integer.MIN_VALUE;
            return FreeSubscribeSource.this.load(null, this);
        }
    }

    public FreeSubscribeSource(InterfaceC9526i service, FreeSubscribeReq req, InterfaceC10570l callback) {
        AbstractC9133u.m16133g(service, "service");
        AbstractC9133u.m16133g(req, "req");
        AbstractC9133u.m16133g(callback, "callback");
        this.f11447a = service;
        this.f11448b = req;
        this.f11449c = callback;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey, reason: merged with bridge method [inline-methods] */
    public Integer getRefreshKey2(PagingState<Integer, FreeSubscribe> state) {
        AbstractC9133u.m16133g(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r7, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.study.bean.FreeSubscribe>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.zykj.study.repository.FreeSubscribeSource.C77471
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.study.repository.FreeSubscribeSource$load$1 r0 = (com.zykj.study.repository.FreeSubscribeSource.C77471) r0
            int r1 = r0.f11455f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11455f = r1
            goto L18
        L13:
            com.zykj.study.repository.FreeSubscribeSource$load$1 r0 = new com.zykj.study.repository.FreeSubscribeSource$load$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11453d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11455f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r7 = r0.f11452c
            int r1 = r0.f11451b
            java.lang.Object r0 = r0.f11450a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L31
            goto L6f
        L31:
            r7 = move-exception
            goto Lb7
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.AbstractC9079b.m15926b(r8)
            java.lang.Object r8 = r7.getKey()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4c
            int r8 = r8.intValue()
            goto L4d
        L4c:
            r8 = 0
        L4d:
            o4.i r2 = r6.f11447a     // Catch: java.lang.Throwable -> L31
            com.zykj.study.bean.FreeSubscribeReq r4 = r6.f11448b     // Catch: java.lang.Throwable -> L31
            r4.setSkipCount(r8)     // Catch: java.lang.Throwable -> L31
            r5 = 20
            r4.setPageSize(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)     // Catch: java.lang.Throwable -> L31
            r0.f11450a = r7     // Catch: java.lang.Throwable -> L31
            r0.f11451b = r8     // Catch: java.lang.Throwable -> L31
            r0.f11452c = r5     // Catch: java.lang.Throwable -> L31
            r0.f11455f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r2.m17733d(r4, r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r1 = r8
            r8 = r7
            r7 = r5
        L6f:
            com.zykj.study.bean.FreeSubscribeResp r8 = (com.zykj.study.bean.FreeSubscribeResp) r8     // Catch: java.lang.Throwable -> L31
            int r0 = r1 - r7
            r2 = 0
            if (r0 <= 0) goto L7b
            java.lang.Integer r0 = p201o7.AbstractC9536a.m17798c(r0)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L7b:
            r0 = r2
        L7c:
            java.util.List r3 = r8.getItems()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto La0
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L89
            goto La0
        L89:
            java.util.List r3 = r8.getItems()     // Catch: java.lang.Throwable -> L31
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L31
            if (r3 != r7) goto La0
            java.util.List r7 = r8.getItems()     // Catch: java.lang.Throwable -> L31
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + r7
            java.lang.Integer r2 = p201o7.AbstractC9536a.m17798c(r1)     // Catch: java.lang.Throwable -> L31
        La0:
            x7.l r7 = r6.f11449c     // Catch: java.lang.Throwable -> L31
            int r1 = r8.getTotalCount()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r1 = p201o7.AbstractC9536a.m17798c(r1)     // Catch: java.lang.Throwable -> L31
            r7.invoke(r1)     // Catch: java.lang.Throwable -> L31
            androidx.paging.PagingSource$LoadResult$Page r7 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Throwable -> L31
            java.util.List r8 = r8.getItems()     // Catch: java.lang.Throwable -> L31
            r7.<init>(r8, r0, r2)     // Catch: java.lang.Throwable -> L31
            return r7
        Lb7:
            androidx.paging.PagingSource$LoadResult$Error r8 = new androidx.paging.PagingSource$LoadResult$Error
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.FreeSubscribeSource.load(androidx.paging.PagingSource$LoadParams, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/FreeSubscribeSource.smali:113
    }
}

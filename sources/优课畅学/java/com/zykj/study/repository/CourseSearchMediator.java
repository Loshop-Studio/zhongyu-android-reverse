package com.zykj.study.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.study.bean.course.CourseSimpleBean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9519b;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
@ExperimentalPagingApi
/* loaded from: classes3.dex */
public final class CourseSearchMediator extends PagingSource<Integer, CourseSimpleBean> {

    /* renamed from: a */
    public final InterfaceC9519b f11363a;

    /* renamed from: b */
    public final String f11364b;

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseSearchMediator", m17801f = "CourseSearchMediator.kt", m17802l = {26}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.CourseSearchMediator$load$1 */
    public static final class C77411 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11365a;

        /* renamed from: b */
        public int f11366b;

        /* renamed from: c */
        public /* synthetic */ Object f11367c;

        /* renamed from: e */
        public int f11369e;

        public C77411(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11367c = obj;
            this.f11369e |= Integer.MIN_VALUE;
            return CourseSearchMediator.this.load(null, this);
        }
    }

    public CourseSearchMediator(InterfaceC9519b api, String str) {
        AbstractC9133u.m16133g(api, "api");
        this.f11363a = api;
        this.f11364b = str;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Integer getRefreshKey2(PagingState<Integer, CourseSimpleBean> state) {
        AbstractC9133u.m16133g(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r8, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.study.bean.course.CourseSimpleBean>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.study.repository.CourseSearchMediator.C77411
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.study.repository.CourseSearchMediator$load$1 r0 = (com.zykj.study.repository.CourseSearchMediator.C77411) r0
            int r1 = r0.f11369e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11369e = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseSearchMediator$load$1 r0 = new com.zykj.study.repository.CourseSearchMediator$load$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11367c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11369e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r8 = r0.f11366b
            java.lang.Object r0 = r0.f11365a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Exception -> L30
            goto L78
        L30:
            r8 = move-exception
            goto L98
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.AbstractC9079b.m15926b(r9)
            java.lang.Object r9 = r8.getKey()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L4a
            int r9 = r9.intValue()
            goto L4b
        L4a:
            r9 = r4
        L4b:
            java.lang.String r2 = r7.f11364b     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L60
            int r2 = r2.length()     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L60
            androidx.paging.PagingSource$LoadResult$Page r8 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L30
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L30
            r9.<init>()     // Catch: java.lang.Exception -> L30
            r8.<init>(r9, r3, r3)     // Catch: java.lang.Exception -> L30
            return r8
        L60:
            o4.b r2 = r7.f11363a     // Catch: java.lang.Exception -> L30
            java.lang.String r5 = r7.f11364b     // Catch: java.lang.Exception -> L30
            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r8)     // Catch: java.lang.Exception -> L30
            r0.f11365a = r8     // Catch: java.lang.Exception -> L30
            r0.f11366b = r9     // Catch: java.lang.Exception -> L30
            r0.f11369e = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r8 = r2.m17701p(r9, r5, r0)     // Catch: java.lang.Exception -> L30
            if (r8 != r1) goto L75
            return r1
        L75:
            r6 = r9
            r9 = r8
            r8 = r6
        L78:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L30
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L30
            if (r8 != r4) goto L80
            r1 = r3
            goto L86
        L80:
            int r1 = r8 + (-1)
            java.lang.Integer r1 = p201o7.AbstractC9536a.m17798c(r1)     // Catch: java.lang.Exception -> L30
        L86:
            int r2 = r9.size()     // Catch: java.lang.Exception -> L30
            r5 = 20
            if (r2 == r5) goto L8f
            goto L94
        L8f:
            int r8 = r8 + r4
            java.lang.Integer r3 = p201o7.AbstractC9536a.m17798c(r8)     // Catch: java.lang.Exception -> L30
        L94:
            r0.<init>(r9, r1, r3)     // Catch: java.lang.Exception -> L30
            return r0
        L98:
            androidx.paging.PagingSource$LoadResult$Error r9 = new androidx.paging.PagingSource$LoadResult$Error
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseSearchMediator.load(androidx.paging.PagingSource$LoadParams, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseSearchMediator.smali:92
    }
}

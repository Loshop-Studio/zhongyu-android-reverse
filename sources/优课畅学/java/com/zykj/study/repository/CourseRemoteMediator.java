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
public final class CourseRemoteMediator extends PagingSource<Integer, CourseSimpleBean> {

    /* renamed from: a */
    public final InterfaceC9519b f11294a;

    /* renamed from: b */
    public final String f11295b;

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRemoteMediator", m17801f = "CourseRemoteMediator.kt", m17802l = {18}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.CourseRemoteMediator$load$1 */
    public static final class C77401 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11296a;

        /* renamed from: b */
        public int f11297b;

        /* renamed from: c */
        public /* synthetic */ Object f11298c;

        /* renamed from: e */
        public int f11300e;

        public C77401(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11298c = obj;
            this.f11300e |= Integer.MIN_VALUE;
            return CourseRemoteMediator.this.load(null, this);
        }
    }

    public CourseRemoteMediator(InterfaceC9519b api, String str) {
        AbstractC9133u.m16133g(api, "api");
        this.f11294a = api;
        this.f11295b = str;
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
            boolean r0 = r9 instanceof com.zykj.study.repository.CourseRemoteMediator.C77401
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.study.repository.CourseRemoteMediator$load$1 r0 = (com.zykj.study.repository.CourseRemoteMediator.C77401) r0
            int r1 = r0.f11300e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11300e = r1
            goto L18
        L13:
            com.zykj.study.repository.CourseRemoteMediator$load$1 r0 = new com.zykj.study.repository.CourseRemoteMediator$load$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11298c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11300e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r8 = r0.f11297b
            java.lang.Object r0 = r0.f11296a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Exception -> L2f
            goto L62
        L2f:
            r8 = move-exception
            goto L83
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.AbstractC9079b.m15926b(r9)
            java.lang.Object r9 = r8.getKey()
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L49
            int r9 = r9.intValue()
            goto L4a
        L49:
            r9 = r3
        L4a:
            o4.b r2 = r7.f11294a     // Catch: java.lang.Exception -> L2f
            java.lang.String r4 = r7.f11295b     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r8)     // Catch: java.lang.Exception -> L2f
            r0.f11296a = r8     // Catch: java.lang.Exception -> L2f
            r0.f11297b = r9     // Catch: java.lang.Exception -> L2f
            r0.f11300e = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r2.m17701p(r9, r4, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r6 = r9
            r9 = r8
            r8 = r6
        L62:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2f
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L2f
            r1 = 0
            if (r8 != r3) goto L6b
            r2 = r1
            goto L71
        L6b:
            int r2 = r8 + (-1)
            java.lang.Integer r2 = p201o7.AbstractC9536a.m17798c(r2)     // Catch: java.lang.Exception -> L2f
        L71:
            int r4 = r9.size()     // Catch: java.lang.Exception -> L2f
            r5 = 20
            if (r4 == r5) goto L7a
            goto L7f
        L7a:
            int r8 = r8 + r3
            java.lang.Integer r1 = p201o7.AbstractC9536a.m17798c(r8)     // Catch: java.lang.Exception -> L2f
        L7f:
            r0.<init>(r9, r2, r1)     // Catch: java.lang.Exception -> L2f
            return r0
        L83:
            androidx.paging.PagingSource$LoadResult$Error r9 = new androidx.paging.PagingSource$LoadResult$Error
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseRemoteMediator.load(androidx.paging.PagingSource$LoadParams, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRemoteMediator.smali:92
    }
}

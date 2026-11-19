package com.zykj.study.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.study.bean.course.CourseDetailsBean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9527j;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
@ExperimentalPagingApi
/* loaded from: classes3.dex */
public final class TeachCourseRemoteMediator extends PagingSource<Integer, CourseDetailsBean> {

    /* renamed from: a */
    public final InterfaceC9527j f11519a;

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRemoteMediator", m17801f = "TeachCourseRemoteMediator.kt", m17802l = {19}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.TeachCourseRemoteMediator$load$1 */
    public static final class C77511 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11520a;

        /* renamed from: b */
        public int f11521b;

        /* renamed from: c */
        public /* synthetic */ Object f11522c;

        /* renamed from: e */
        public int f11524e;

        public C77511(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11522c = obj;
            this.f11524e |= Integer.MIN_VALUE;
            return TeachCourseRemoteMediator.this.load(null, this);
        }
    }

    public TeachCourseRemoteMediator(InterfaceC9527j api) {
        AbstractC9133u.m16133g(api, "api");
        this.f11519a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r8, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.study.bean.course.CourseDetailsBean>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.study.repository.TeachCourseRemoteMediator.C77511
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.study.repository.TeachCourseRemoteMediator$load$1 r0 = (com.zykj.study.repository.TeachCourseRemoteMediator.C77511) r0
            int r1 = r0.f11524e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11524e = r1
            goto L18
        L13:
            com.zykj.study.repository.TeachCourseRemoteMediator$load$1 r0 = new com.zykj.study.repository.TeachCourseRemoteMediator$load$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11522c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11524e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r8 = r0.f11521b
            java.lang.Object r0 = r0.f11520a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Exception -> L2f
            goto L60
        L2f:
            r8 = move-exception
            goto L81
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
            o4.j r2 = r7.f11519a     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r8)     // Catch: java.lang.Exception -> L2f
            r0.f11520a = r8     // Catch: java.lang.Exception -> L2f
            r0.f11521b = r9     // Catch: java.lang.Exception -> L2f
            r0.f11524e = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r2.m17742g(r9, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2f
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L2f
            r1 = 0
            if (r8 != r3) goto L69
            r2 = r1
            goto L6f
        L69:
            int r2 = r8 + (-1)
            java.lang.Integer r2 = p201o7.AbstractC9536a.m17798c(r2)     // Catch: java.lang.Exception -> L2f
        L6f:
            int r4 = r9.size()     // Catch: java.lang.Exception -> L2f
            r5 = 20
            if (r4 == r5) goto L78
            goto L7d
        L78:
            int r8 = r8 + r3
            java.lang.Integer r1 = p201o7.AbstractC9536a.m17798c(r8)     // Catch: java.lang.Exception -> L2f
        L7d:
            r0.<init>(r9, r2, r1)     // Catch: java.lang.Exception -> L2f
            return r0
        L81:
            androidx.paging.PagingSource$LoadResult$Error r9 = new androidx.paging.PagingSource$LoadResult$Error
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.TeachCourseRemoteMediator.load(androidx.paging.PagingSource$LoadParams, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRemoteMediator.smali:145
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Integer getRefreshKey2(PagingState<Integer, CourseDetailsBean> state) {
        Integer nextKey;
        int iIntValue;
        Integer prevKey;
        AbstractC9133u.m16133g(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition != null) {
            PagingSource.LoadResult.Page<Integer, CourseDetailsBean> pageClosestPageToPosition = state.closestPageToPosition(anchorPosition.intValue());
            if (pageClosestPageToPosition != null && (prevKey = pageClosestPageToPosition.getPrevKey()) != null) {
                iIntValue = prevKey.intValue() + 1;
            } else if (pageClosestPageToPosition != null && (nextKey = pageClosestPageToPosition.getNextKey()) != null) {
                iIntValue = nextKey.intValue() - 1;
            }
            return Integer.valueOf(iIntValue);
        }
        return null;
    }
}

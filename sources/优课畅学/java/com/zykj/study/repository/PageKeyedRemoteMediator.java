package com.zykj.study.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import androidx.room.RoomDatabaseKt;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.data.MyCourseKeyEntity;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9519b;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
@ExperimentalPagingApi
/* loaded from: classes3.dex */
public final class PageKeyedRemoteMediator extends RemoteMediator<Integer, MyCourseEntity> {

    /* renamed from: a */
    public final AppDatabase f11456a;

    /* renamed from: b */
    public final InterfaceC9519b f11457b;

    /* renamed from: c */
    public final int f11458c;

    /* renamed from: com.zykj.study.repository.PageKeyedRemoteMediator$a */
    public static final /* synthetic */ class C7748a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11459a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11459a = iArr;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.PageKeyedRemoteMediator", m17801f = "PageKeyedRemoteMediator.kt", m17802l = {27, 47, 51}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.PageKeyedRemoteMediator$load$1 */
    public static final class C77491 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11460a;

        /* renamed from: b */
        public Object f11461b;

        /* renamed from: c */
        public Object f11462c;

        /* renamed from: d */
        public Object f11463d;

        /* renamed from: e */
        public /* synthetic */ Object f11464e;

        /* renamed from: g */
        public int f11466g;

        public C77491(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11464e = obj;
            this.f11466g |= Integer.MIN_VALUE;
            return PageKeyedRemoteMediator.this.load(null, null, this);
        }
    }

    public PageKeyedRemoteMediator(AppDatabase db, InterfaceC9519b api, int i10) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(api, "api");
        this.f11456a = db;
        this.f11457b = api;
        this.f11458c = i10;
    }

    /* renamed from: b */
    public final void m10379b(List list, PagingState pagingState, MyCourseKeyEntity myCourseKeyEntity) {
        if (list.isEmpty()) {
            myCourseKeyEntity.setNextStartId(null);
        } else if (list.size() == pagingState.getConfig().pageSize) {
            myCourseKeyEntity.setNextStartId(Integer.valueOf(((MyCourseEntity) AbstractC8778f0.m14578x0(list)).getId()));
        } else {
            myCourseKeyEntity.setNextStartId(null);
        }
    }

    /* renamed from: c */
    public final Object m10380c(List list, LoadType loadType, MyCourseKeyEntity myCourseKeyEntity, InterfaceC9324c interfaceC9324c) {
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.f11456a, new PageKeyedRemoteMediator$saveToLocal$2(loadType, this, myCourseKeyEntity, list, null), interfaceC9324c);
        return objWithTransaction == AbstractC9434a.m17291f() ? objWithTransaction : C8736p.f16368a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (m10380c(r14, r2, r12, r0) != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.LoadType r12, androidx.paging.PagingState<java.lang.Integer, com.zykj.study.data.MyCourseEntity> r13, p179m7.InterfaceC9324c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.PageKeyedRemoteMediator.load(androidx.paging.LoadType, androidx.paging.PagingState, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/PageKeyedRemoteMediator.smali:260
    }
}

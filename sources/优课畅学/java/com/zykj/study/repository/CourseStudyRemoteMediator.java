package com.zykj.study.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadType;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import androidx.room.RoomDatabaseKt;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.data.CourseStudyKeyEntity;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9519b;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
@ExperimentalPagingApi
/* loaded from: classes3.dex */
public final class CourseStudyRemoteMediator extends RemoteMediator<Integer, CourseStudyEntity> {

    /* renamed from: a */
    public final AppDatabase f11370a;

    /* renamed from: b */
    public final InterfaceC9519b f11371b;

    /* renamed from: c */
    public final int f11372c;

    /* renamed from: com.zykj.study.repository.CourseStudyRemoteMediator$a */
    public static final /* synthetic */ class C7742a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11373a;

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
            f11373a = iArr;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseStudyRemoteMediator", m17801f = "CourseStudyRemoteMediator.kt", m17802l = {26, 46, 50}, m17803m = "load")
    /* renamed from: com.zykj.study.repository.CourseStudyRemoteMediator$load$1 */
    public static final class C77431 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11374a;

        /* renamed from: b */
        public Object f11375b;

        /* renamed from: c */
        public Object f11376c;

        /* renamed from: d */
        public Object f11377d;

        /* renamed from: e */
        public /* synthetic */ Object f11378e;

        /* renamed from: g */
        public int f11380g;

        public C77431(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11378e = obj;
            this.f11380g |= Integer.MIN_VALUE;
            return CourseStudyRemoteMediator.this.load(null, null, this);
        }
    }

    public CourseStudyRemoteMediator(AppDatabase db, InterfaceC9519b api, int i10) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(api, "api");
        this.f11370a = db;
        this.f11371b = api;
        this.f11372c = i10;
    }

    /* renamed from: b */
    public final void m10354b(List list, PagingState pagingState, CourseStudyKeyEntity courseStudyKeyEntity) {
        if (list.isEmpty()) {
            courseStudyKeyEntity.setNextPage(null);
        } else if (list.size() == pagingState.getConfig().pageSize) {
            courseStudyKeyEntity.setNextPage(Integer.valueOf(courseStudyKeyEntity.getPageIndex() + 1));
        } else {
            courseStudyKeyEntity.setNextPage(null);
        }
    }

    /* renamed from: c */
    public final Object m10355c(List list, LoadType loadType, CourseStudyKeyEntity courseStudyKeyEntity, InterfaceC9324c interfaceC9324c) {
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.f11370a, new CourseStudyRemoteMediator$saveToLocal$2(loadType, this, courseStudyKeyEntity, list, null), interfaceC9324c);
        return objWithTransaction == AbstractC9434a.m17291f() ? objWithTransaction : C8736p.f16368a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        if (m10355c(r11, r2, r9, r0) != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.LoadType r9, androidx.paging.PagingState<java.lang.Integer, com.zykj.study.data.CourseStudyEntity> r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.CourseStudyRemoteMediator.load(androidx.paging.LoadType, androidx.paging.PagingState, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/CourseStudyRemoteMediator.smali:252
    }
}

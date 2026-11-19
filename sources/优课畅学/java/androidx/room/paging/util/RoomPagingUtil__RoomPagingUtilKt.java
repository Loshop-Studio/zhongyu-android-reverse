package androidx.room.paging.util;

import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.Transactor;
import androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt;
import androidx.sqlite.SQLiteStatement;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomPagingUtil__RoomPagingUtilKt {

    @InterfaceC9539d(m17800c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt", m17801f = "RoomPagingUtil.kt", m17802l = {130}, m17803m = "queryDatabase")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 */
    public static final class C45891<Value> extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        public C45891(InterfaceC9324c<? super C45891> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomPagingUtil.queryDatabase(null, null, 0, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", m17801f = "RoomPagingUtil.kt", m17802l = {159}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 */
    public static final class C45902 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ String $countQuery;
        final /* synthetic */ RoomRawQuery $sourceQuery;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45902(String str, RoomRawQuery roomRawQuery, InterfaceC9324c<? super C45902> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$countQuery = str;
            this.$sourceQuery = roomRawQuery;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(RoomRawQuery roomRawQuery, SQLiteStatement sQLiteStatement) {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatement);
            if (sQLiteStatement.step()) {
                return sQLiteStatement.getInt(0);
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C45902 c45902 = new C45902(this.$countQuery, this.$sourceQuery, interfaceC9324c);
            c45902.L$0 = obj;
            return c45902;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Transactor transactor, InterfaceC9324c<? super Integer> interfaceC9324c) {
            return ((C45902) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            Transactor transactor = (Transactor) this.L$0;
            String str = this.$countQuery;
            final RoomRawQuery roomRawQuery = this.$sourceQuery;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.room.paging.util.a
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(RoomPagingUtil__RoomPagingUtilKt.C45902.invokeSuspend$lambda$0(roomRawQuery, (SQLiteStatement) obj2));
                }
            };
            this.label = 1;
            Object objUsePrepared = transactor.usePrepared(str, interfaceC10570l, this);
            return objUsePrepared == objM17291f ? objM17291f : objUsePrepared;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        AbstractC9133u.m16133g(pagingState, "<this>");
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (pagingState.getConfig().initialLoadSize / 2)));
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getLimit(PagingSource.LoadParams<Integer> params, int i10) {
        AbstractC9133u.m16133g(params, "params");
        if (!(params instanceof PagingSource.LoadParams.Prepend)) {
            return params.getLoadSize();
        }
        PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
        return i10 < prepend.getLoadSize() ? i10 : prepend.getLoadSize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getOffset(PagingSource.LoadParams<Integer> params, int i10, int i11) {
        AbstractC9133u.m16133g(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
            if (i10 < prepend.getLoadSize()) {
                return 0;
            }
            return i10 - prepend.getLoadSize();
        }
        if (params instanceof PagingSource.LoadParams.Append) {
            return i10;
        }
        if (!(params instanceof PagingSource.LoadParams.Refresh)) {
            throw new NoWhenBranchMatchedException();
        }
        PagingSource.LoadParams.Refresh refresh = (PagingSource.LoadParams.Refresh) params;
        return i10 >= i11 - refresh.getLoadSize() ? Math.max(0, i11 - refresh.getLoadSize()) : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <Value> java.lang.Object queryDatabase(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r10, androidx.room.RoomRawQuery r11, int r12, p300x7.InterfaceC10575q r13, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C45891
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 r0 = (androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C45891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 r0 = new androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            int r10 = r0.I$2
            int r11 = r0.I$1
            int r12 = r0.I$0
            kotlin.AbstractC9079b.m15926b(r14)
        L2f:
            r8 = r10
            goto L9d
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.AbstractC9079b.m15926b(r14)
            java.lang.Object r14 = r10.getKey()
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L49
            int r14 = r14.intValue()
            goto L4a
        L49:
            r14 = r3
        L4a:
            int r2 = androidx.room.paging.util.RoomPagingUtil.getLimit(r10, r14)
            int r10 = androidx.room.paging.util.RoomPagingUtil.getOffset(r10, r14, r12)
            int r14 = r2 + r10
            if (r14 <= r12) goto L59
            int r14 = r12 - r10
            goto L5a
        L59:
            r14 = r2
        L5a:
            androidx.room.RoomRawQuery r5 = new androidx.room.RoomRawQuery
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SELECT * FROM ( "
            r6.append(r7)
            java.lang.String r7 = r11.getSql()
            r6.append(r7)
            java.lang.String r7 = " ) LIMIT "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " OFFSET "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            x7.l r11 = r11.getBindingFunction()
            r5.<init>(r6, r11)
            java.lang.Integer r11 = p201o7.AbstractC9536a.m17798c(r14)
            r0.I$0 = r12
            r0.I$1 = r2
            r0.I$2 = r10
            r0.label = r4
            java.lang.Object r14 = r13.invoke(r5, r11, r0)
            if (r14 != r1) goto L9b
            return r1
        L9b:
            r11 = r2
            goto L2f
        L9d:
            r5 = r14
            java.util.List r5 = (java.util.List) r5
            int r10 = r5.size()
            int r10 = r10 + r8
            boolean r13 = r5.isEmpty()
            r14 = 0
            if (r13 != 0) goto Lbb
            int r13 = r5.size()
            if (r13 < r11) goto Lbb
            if (r10 < r12) goto Lb5
            goto Lbb
        Lb5:
            java.lang.Integer r11 = p201o7.AbstractC9536a.m17798c(r10)
            r7 = r11
            goto Lbc
        Lbb:
            r7 = r14
        Lbc:
            if (r8 <= 0) goto Lc9
            boolean r11 = r5.isEmpty()
            if (r11 == 0) goto Lc5
            goto Lc9
        Lc5:
            java.lang.Integer r14 = p201o7.AbstractC9536a.m17798c(r8)
        Lc9:
            r6 = r14
            androidx.paging.PagingSource$LoadResult$Page r4 = new androidx.paging.PagingSource$LoadResult$Page
            int r12 = r12 - r10
            int r9 = java.lang.Math.max(r3, r12)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.queryDatabase(androidx.paging.PagingSource$LoadParams, androidx.room.RoomRawQuery, int, x7.q, m7.c):java.lang.Object");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, InterfaceC9324c<? super Integer> interfaceC9324c) {
        return RoomDatabaseKt.useReaderConnection(roomDatabase, new C45902("SELECT COUNT(*) FROM ( " + roomRawQuery.getSql() + " )", roomRawQuery, null), interfaceC9324c);
    }
}

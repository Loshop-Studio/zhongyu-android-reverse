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
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomPagingUtil__RoomPagingUtilKt {

    @InterfaceC11829d(m26210c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt", m26211f = "RoomPagingUtil.kt", m26212l = {130}, m26213m = "queryDatabase")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 */
    public static final class C45371<Value> extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        public C45371(InterfaceC11588c<? super C45371> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomPagingUtil.queryDatabase(null, null, 0, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", m26211f = "RoomPagingUtil.kt", m26212l = {Opcodes.IF_ICMPEQ}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 */
    public static final class C45382 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ String $countQuery;
        final /* synthetic */ RoomRawQuery $sourceQuery;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45382(String str, RoomRawQuery roomRawQuery, InterfaceC11588c<? super C45382> interfaceC11588c) {
            super(2, interfaceC11588c);
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
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C45382 c45382 = new C45382(this.$countQuery, this.$sourceQuery, interfaceC11588c);
            c45382.L$0 = obj;
            return c45382;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Transactor transactor, InterfaceC11588c<? super Integer> interfaceC11588c) {
            return ((C45382) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            Transactor transactor = (Transactor) this.L$0;
            String str = this.$countQuery;
            final RoomRawQuery roomRawQuery = this.$sourceQuery;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.room.paging.util.a
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(RoomPagingUtil__RoomPagingUtilKt.C45382.invokeSuspend$lambda$0(roomRawQuery, (SQLiteStatement) obj2));
                }
            };
            this.label = 1;
            Object objUsePrepared = transactor.usePrepared(str, interfaceC9540l, this);
            return objUsePrepared == objM25952f ? objM25952f : objUsePrepared;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        AbstractC9979u.m20294g(pagingState, "<this>");
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (pagingState.getConfig().initialLoadSize / 2)));
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getLimit(PagingSource.LoadParams<Integer> params, int i10) {
        AbstractC9979u.m20294g(params, "params");
        if (!(params instanceof PagingSource.LoadParams.Prepend)) {
            return params.getLoadSize();
        }
        PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
        return i10 < prepend.getLoadSize() ? i10 : prepend.getLoadSize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getOffset(PagingSource.LoadParams<Integer> params, int i10, int i11) {
        AbstractC9979u.m20294g(params, "params");
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
    public static final <Value> java.lang.Object queryDatabase(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r10, androidx.room.RoomRawQuery r11, int r12, p181hd.InterfaceC9545q r13, vc.InterfaceC11588c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C45371
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 r0 = (androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C45371) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            int r10 = r0.I$2
            int r11 = r0.I$1
            int r12 = r0.I$0
            kotlin.AbstractC9924b.m20071b(r14)
        L2f:
            r8 = r10
            goto L9d
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.AbstractC9924b.m20071b(r14)
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
            hd.l r11 = r11.getBindingFunction()
            r5.<init>(r6, r11)
            java.lang.Integer r11 = p409xc.AbstractC11826a.m26208c(r14)
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
            java.lang.Integer r11 = p409xc.AbstractC11826a.m26208c(r10)
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
            java.lang.Integer r14 = p409xc.AbstractC11826a.m26208c(r8)
        Lc9:
            r6 = r14
            androidx.paging.PagingSource$LoadResult$Page r4 = new androidx.paging.PagingSource$LoadResult$Page
            int r12 = r12 - r10
            int r9 = java.lang.Math.max(r3, r12)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.queryDatabase(androidx.paging.PagingSource$LoadParams, androidx.room.RoomRawQuery, int, hd.q, vc.c):java.lang.Object");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, InterfaceC11588c<? super Integer> interfaceC11588c) {
        return RoomDatabaseKt.useReaderConnection(roomDatabase, new C45382("SELECT COUNT(*) FROM ( " + roomRawQuery.getSql() + " )", roomRawQuery, null), interfaceC11588c);
    }
}

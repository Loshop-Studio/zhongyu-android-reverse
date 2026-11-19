package androidx.room.paging.util;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.Transactor;
import androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0007\u001a&\u0010\u0006\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001ar\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00012.\u0010\u000e\u001a*\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fH\u0087@¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0087@¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\n*\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\n0\u0018H\u0007¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7880d2 = {"INITIAL_ITEM_COUNT", "", "getLimit", "params", "Landroidx/paging/PagingSource$LoadParams;", "key", "getOffset", "itemCount", "queryDatabase", "Landroidx/paging/PagingSource$LoadResult;", "Value", "", "sourceQuery", "Landroidx/room/RoomRawQuery;", "convertRows", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryItemCount", "db", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClippedRefreshKey", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "room-paging_release"}, m7881k = 5, m7882mv = {2, 0, 0}, m7884xi = 48, m7885xs = "androidx/room/paging/util/RoomPagingUtil")
/* loaded from: classes3.dex */
final /* synthetic */ class RoomPagingUtil__RoomPagingUtilKt {

    @Metadata(m7881k = 3, m7882mv = {2, 0, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt", m7918f = "RoomPagingUtil.kt", m7919i = {0, 0, 0}, m7920l = {130}, m7921m = "queryDatabase", m7922n = {"itemCount", "limit", TypedValues.CycleType.S_WAVE_OFFSET}, m7923s = {"I$0", "I$1", "I$2"})
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 */
    public static final class C39611<Value> extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        public C39611(Continuation<? super C39611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomPagingUtil.queryDatabase(null, null, 0, null, this);
        }
    }

    @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, m7881k = 3, m7882mv = {2, 0, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", m7918f = "RoomPagingUtil.kt", m7919i = {}, m7920l = {159}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 */
    public static final class C39622 extends SuspendLambda implements Function2<Transactor, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $countQuery;
        final /* synthetic */ RoomRawQuery $sourceQuery;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39622(String str, RoomRawQuery roomRawQuery, Continuation<? super C39622> continuation) {
            super(2, continuation);
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
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C39622 c39622 = new C39622(this.$countQuery, this.$sourceQuery, continuation);
            c39622.L$0 = obj;
            return c39622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation<? super Integer> continuation) {
            return ((C39622) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Transactor transactor = (Transactor) this.L$0;
            String str = this.$countQuery;
            final RoomRawQuery roomRawQuery = this.$sourceQuery;
            Function1 function1 = new Function1() { // from class: androidx.room.paging.util.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(RoomPagingUtil__RoomPagingUtilKt.C39622.invokeSuspend$lambda$0(roomRawQuery, (SQLiteStatement) obj2));
                }
            };
            this.label = 1;
            Object objUsePrepared = transactor.usePrepared(str, function1, this);
            return objUsePrepared == coroutine_suspended ? coroutine_suspended : objUsePrepared;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "<this>");
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (pagingState.getConfig().initialLoadSize / 2)));
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getLimit(PagingSource.LoadParams<Integer> params, int i6) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof PagingSource.LoadParams.Prepend)) {
            return params.getLoadSize();
        }
        PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
        return i6 < prepend.getLoadSize() ? i6 : prepend.getLoadSize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getOffset(PagingSource.LoadParams<Integer> params, int i6, int i7) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
            if (i6 < prepend.getLoadSize()) {
                return 0;
            }
            return i6 - prepend.getLoadSize();
        }
        if (params instanceof PagingSource.LoadParams.Append) {
            return i6;
        }
        if (!(params instanceof PagingSource.LoadParams.Refresh)) {
            throw new NoWhenBranchMatchedException();
        }
        PagingSource.LoadParams.Refresh refresh = (PagingSource.LoadParams.Refresh) params;
        return i6 >= i7 - refresh.getLoadSize() ? Math.max(0, i7 - refresh.getLoadSize()) : i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <Value> java.lang.Object queryDatabase(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r10, androidx.room.RoomRawQuery r11, int r12, kotlin.jvm.functions.Function3<? super androidx.room.RoomRawQuery, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.util.List<? extends Value>>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C39611
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 r0 = (androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.C39611) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            int r10 = r0.I$2
            int r11 = r0.I$1
            int r12 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r14)
        L2f:
            r8 = r10
            goto L9d
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.ResultKt.throwOnFailure(r14)
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
            kotlin.jvm.functions.Function1 r11 = r11.getBindingFunction()
            r5.<init>(r6, r11)
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r14)
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
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
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
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
        Lc9:
            r6 = r14
            androidx.paging.PagingSource$LoadResult$Page r4 = new androidx.paging.PagingSource$LoadResult$Page
            int r12 = r12 - r10
            int r9 = java.lang.Math.max(r3, r12)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt.queryDatabase(androidx.paging.PagingSource$LoadParams, androidx.room.RoomRawQuery, int, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, Continuation<? super Integer> continuation) {
        return RoomDatabaseKt.useReaderConnection(roomDatabase, new C39622("SELECT COUNT(*) FROM ( " + roomRawQuery.getSql() + " )", roomRawQuery, null), continuation);
    }
}

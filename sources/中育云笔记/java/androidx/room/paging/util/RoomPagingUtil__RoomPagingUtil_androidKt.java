package androidx.room.paging.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomPagingUtil__RoomPagingUtil_androidKt {
    private static final PagingSource.LoadResult<Object, Object> INVALID = new PagingSource.LoadResult.Invalid();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final PagingSource.LoadResult<Object, Object> getINVALID() {
        return INVALID;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> PagingSource.LoadResult<Integer, Value> queryDatabase(PagingSource.LoadParams<Integer> params, RoomSQLiteQuery sourceQuery, RoomDatabase db2, int i10, CancellationSignal cancellationSignal, InterfaceC9540l convertRows) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(sourceQuery, "sourceQuery");
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(convertRows, "convertRows");
        Integer key = params.getKey();
        int iIntValue = key != null ? key.intValue() : 0;
        int limit = RoomPagingUtil.getLimit(params, iIntValue);
        int offset = RoomPagingUtil.getOffset(params, iIntValue, i10);
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.Companion.acquire("SELECT * FROM ( " + sourceQuery.getSql() + " ) LIMIT " + limit + " OFFSET " + offset, sourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(sourceQuery);
        Cursor cursorQuery = db2.query(roomSQLiteQueryAcquire, cancellationSignal);
        try {
            List list = (List) convertRows.invoke(cursorQuery);
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            int size = list.size() + offset;
            Integer numValueOf = null;
            Integer numValueOf2 = (list.isEmpty() || list.size() < limit || size >= i10) ? null : Integer.valueOf(size);
            if (offset > 0 && !list.isEmpty()) {
                numValueOf = Integer.valueOf(offset);
            }
            return new PagingSource.LoadResult.Page(list, numValueOf, numValueOf2, offset, Math.max(0, i10 - size));
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    public static /* synthetic */ PagingSource.LoadResult queryDatabase$default(PagingSource.LoadParams loadParams, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, int i10, CancellationSignal cancellationSignal, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            cancellationSignal = null;
        }
        return RoomPagingUtil.queryDatabase(loadParams, roomSQLiteQuery, roomDatabase, i10, cancellationSignal, interfaceC9540l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int queryItemCount(RoomSQLiteQuery sourceQuery, RoomDatabase db2) {
        AbstractC9979u.m20294g(sourceQuery, "sourceQuery");
        AbstractC9979u.m20294g(db2, "db");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.Companion.acquire("SELECT COUNT(*) FROM ( " + sourceQuery.getSql() + " )", sourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(sourceQuery);
        Cursor cursorQuery$default = RoomDatabase.query$default(db2, roomSQLiteQueryAcquire, null, 2, null);
        try {
            if (cursorQuery$default.moveToFirst()) {
                return cursorQuery$default.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery$default.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}

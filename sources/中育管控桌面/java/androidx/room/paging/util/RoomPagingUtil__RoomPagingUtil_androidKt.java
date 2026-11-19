package androidx.room.paging.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001aj\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00070\u0001\"\b\b\u0000\u0010\u0007*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00140\u0012H\u0007\u001a\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\"\u001f\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00018G¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0016"}, m7880d2 = {"INVALID", "Landroidx/paging/PagingSource$LoadResult;", "", "getINVALID", "()Landroidx/paging/PagingSource$LoadResult;", "queryDatabase", "", "Value", "params", "Landroidx/paging/PagingSource$LoadParams;", "sourceQuery", "Landroidx/room/RoomSQLiteQuery;", "db", "Landroidx/room/RoomDatabase;", "itemCount", "cancellationSignal", "Landroid/os/CancellationSignal;", "convertRows", "Lkotlin/Function1;", "Landroid/database/Cursor;", "", "queryItemCount", "room-paging_release"}, m7881k = 5, m7882mv = {2, 0, 0}, m7884xi = 48, m7885xs = "androidx/room/paging/util/RoomPagingUtil")
/* loaded from: classes3.dex */
final /* synthetic */ class RoomPagingUtil__RoomPagingUtil_androidKt {
    private static final PagingSource.LoadResult<Object, Object> INVALID = new PagingSource.LoadResult.Invalid();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final PagingSource.LoadResult<Object, Object> getINVALID() {
        return INVALID;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> PagingSource.LoadResult<Integer, Value> queryDatabase(PagingSource.LoadParams<Integer> params, RoomSQLiteQuery sourceQuery, RoomDatabase db, int i6, CancellationSignal cancellationSignal, Function1<? super Cursor, ? extends List<? extends Value>> convertRows) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(convertRows, "convertRows");
        Integer key = params.getKey();
        int iIntValue = key != null ? key.intValue() : 0;
        int limit = RoomPagingUtil.getLimit(params, iIntValue);
        int offset = RoomPagingUtil.getOffset(params, iIntValue, i6);
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT * FROM ( " + sourceQuery.getQuery() + " ) LIMIT " + limit + " OFFSET " + offset, sourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(sourceQuery);
        Cursor cursorQuery = db.query(roomSQLiteQueryAcquire, cancellationSignal);
        try {
            List<? extends Value> listInvoke = convertRows.invoke(cursorQuery);
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            int size = listInvoke.size() + offset;
            Integer numValueOf = null;
            Integer numValueOf2 = (listInvoke.isEmpty() || listInvoke.size() < limit || size >= i6) ? null : Integer.valueOf(size);
            if (offset > 0 && !listInvoke.isEmpty()) {
                numValueOf = Integer.valueOf(offset);
            }
            return new PagingSource.LoadResult.Page(listInvoke, numValueOf, numValueOf2, offset, Math.max(0, i6 - size));
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    public static /* synthetic */ PagingSource.LoadResult queryDatabase$default(PagingSource.LoadParams loadParams, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, int i6, CancellationSignal cancellationSignal, Function1 function1, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            cancellationSignal = null;
        }
        return RoomPagingUtil.queryDatabase(loadParams, roomSQLiteQuery, roomDatabase, i6, cancellationSignal, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int queryItemCount(RoomSQLiteQuery sourceQuery, RoomDatabase db) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.INSTANCE.acquire("SELECT COUNT(*) FROM ( " + sourceQuery.getQuery() + " )", sourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(sourceQuery);
        Cursor cursorQuery$default = RoomDatabase.query$default(db, roomSQLiteQueryAcquire, null, 2, null);
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

package androidx.room.paging.util;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class RoomPagingUtil {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int INITIAL_ITEM_COUNT = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        return RoomPagingUtil__RoomPagingUtilKt.getClippedRefreshKey(pagingState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final PagingSource.LoadResult<Object, Object> getINVALID() {
        return RoomPagingUtil__RoomPagingUtil_androidKt.getINVALID();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getLimit(PagingSource.LoadParams<Integer> loadParams, int i10) {
        return RoomPagingUtil__RoomPagingUtilKt.getLimit(loadParams, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getOffset(PagingSource.LoadParams<Integer> loadParams, int i10, int i11) {
        return RoomPagingUtil__RoomPagingUtilKt.getOffset(loadParams, i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> PagingSource.LoadResult<Integer, Value> queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, int i10, CancellationSignal cancellationSignal, InterfaceC10570l interfaceC10570l) {
        return RoomPagingUtil__RoomPagingUtil_androidKt.queryDatabase(loadParams, roomSQLiteQuery, roomDatabase, i10, cancellationSignal, interfaceC10570l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int queryItemCount(RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase) {
        return RoomPagingUtil__RoomPagingUtil_androidKt.queryItemCount(roomSQLiteQuery, roomDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Object queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomRawQuery roomRawQuery, int i10, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
        return RoomPagingUtil__RoomPagingUtilKt.queryDatabase(loadParams, roomRawQuery, i10, interfaceC10575q, interfaceC9324c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, InterfaceC9324c<? super Integer> interfaceC9324c) {
        return RoomPagingUtil__RoomPagingUtilKt.queryItemCount(roomRawQuery, roomDatabase, interfaceC9324c);
    }
}

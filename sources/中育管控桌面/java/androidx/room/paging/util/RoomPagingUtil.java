package androidx.room.paging.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(m7879d1 = {"androidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt", "androidx/room/paging/util/RoomPagingUtil__RoomPagingUtil_androidKt"}, m7881k = 4, m7882mv = {2, 0, 0}, m7884xi = 48)
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
    public static final int getLimit(PagingSource.LoadParams<Integer> loadParams, int i6) {
        return RoomPagingUtil__RoomPagingUtilKt.getLimit(loadParams, i6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int getOffset(PagingSource.LoadParams<Integer> loadParams, int i6, int i7) {
        return RoomPagingUtil__RoomPagingUtilKt.getOffset(loadParams, i6, i7);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> PagingSource.LoadResult<Integer, Value> queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, int i6, CancellationSignal cancellationSignal, Function1<? super Cursor, ? extends List<? extends Value>> function1) {
        return RoomPagingUtil__RoomPagingUtil_androidKt.queryDatabase(loadParams, roomSQLiteQuery, roomDatabase, i6, cancellationSignal, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int queryItemCount(RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase) {
        return RoomPagingUtil__RoomPagingUtil_androidKt.queryItemCount(roomSQLiteQuery, roomDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Value> Object queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomRawQuery roomRawQuery, int i6, Function3<? super RoomRawQuery, ? super Integer, ? super Continuation<? super List<? extends Value>>, ? extends Object> function3, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return RoomPagingUtil__RoomPagingUtilKt.queryDatabase(loadParams, roomRawQuery, i6, function3, continuation);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, Continuation<? super Integer> continuation) {
        return RoomPagingUtil__RoomPagingUtilKt.queryItemCount(roomRawQuery, roomDatabase, continuation);
    }
}

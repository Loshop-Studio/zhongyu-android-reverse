package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.util.RoomPagingUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;
import p181hd.InterfaceC9540l;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {

    /* renamed from: db */
    private final RoomDatabase f2031db;
    private final CommonLimitOffsetImpl<Value> implementation;
    private final RoomRawQuery sourceQuery;

    public LimitOffsetPagingSource(RoomRawQuery sourceQuery, RoomDatabase db2, String... tables) {
        AbstractC9979u.m20294g(sourceQuery, "sourceQuery");
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tables, "tables");
        this.sourceQuery = sourceQuery;
        this.f2031db = db2;
        this.implementation = new CommonLimitOffsetImpl<>(tables, this, new LimitOffsetPagingSource$implementation$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertRows$lambda$1(RoomRawQuery roomRawQuery, LimitOffsetPagingSource limitOffsetPagingSource, int i10, SQLiteConnection connection) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(roomRawQuery.getSql());
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            List<Value> listConvertRows = limitOffsetPagingSource.convertRows(new SQLiteStatementCursor(sQLiteStatementPrepare, i10));
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return listConvertRows;
        } finally {
        }
    }

    public static /* synthetic */ <Value> Object convertRows$suspendImpl(final LimitOffsetPagingSource<Value> limitOffsetPagingSource, final RoomRawQuery roomRawQuery, final int i10, InterfaceC11588c<? super List<? extends Value>> interfaceC11588c) {
        return DBUtil.performSuspending(((LimitOffsetPagingSource) limitOffsetPagingSource).f2031db, true, false, new InterfaceC9540l() { // from class: androidx.room.paging.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return LimitOffsetPagingSource.convertRows$lambda$1(roomRawQuery, limitOffsetPagingSource, i10, (SQLiteConnection) obj);
            }
        }, interfaceC11588c);
    }

    public static /* synthetic */ <Value> Object load$suspendImpl(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, InterfaceC11588c<? super PagingSource.LoadResult<Integer, Value>> interfaceC11588c) {
        return ((LimitOffsetPagingSource) limitOffsetPagingSource).implementation.load(loadParams, interfaceC11588c);
    }

    public Object convertRows(RoomRawQuery roomRawQuery, int i10, InterfaceC11588c<? super List<? extends Value>> interfaceC11588c) {
        return convertRows$suspendImpl(this, roomRawQuery, i10, interfaceC11588c);
    }

    public final RoomDatabase getDb() {
        return this.f2031db;
    }

    public final int getItemCount() {
        return this.implementation.getItemCount$room_paging_release().get();
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return true;
    }

    public final RoomRawQuery getSourceQuery() {
        return this.sourceQuery;
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Integer> loadParams, InterfaceC11588c<? super PagingSource.LoadResult<Integer, Value>> interfaceC11588c) {
        return load$suspendImpl(this, loadParams, interfaceC11588c);
    }

    public List<Value> convertRows(Cursor cursor) {
        AbstractC9979u.m20294g(cursor, "cursor");
        throw new NotImplementedError("Unexpected call to a function with no implementation that Room is suppose to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Integer getRefreshKey(PagingState<Integer, Value> state) {
        AbstractC9979u.m20294g(state, "state");
        return RoomPagingUtil.getClippedRefreshKey(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(RoomSQLiteQuery sourceQuery, RoomDatabase db2, String... tables) {
        this(sourceQuery.toRoomRawQuery(), db2, (String[]) Arrays.copyOf(tables, tables.length));
        AbstractC9979u.m20294g(sourceQuery, "sourceQuery");
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tables, "tables");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(SupportSQLiteQuery supportSQLiteQuery, RoomDatabase db2, String... tables) {
        this(RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery).toRoomRawQuery(), db2, (String[]) Arrays.copyOf(tables, tables.length));
        AbstractC9979u.m20294g(supportSQLiteQuery, "supportSQLiteQuery");
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tables, "tables");
    }
}

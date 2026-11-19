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
import androidx.sqlite.p018db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p278v7.AbstractC10251a;
import p300x7.InterfaceC10570l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {

    /* renamed from: db */
    private final RoomDatabase f1917db;
    private final CommonLimitOffsetImpl<Value> implementation;
    private final RoomRawQuery sourceQuery;

    public LimitOffsetPagingSource(RoomRawQuery sourceQuery, RoomDatabase db, String... tables) {
        AbstractC9133u.m16133g(sourceQuery, "sourceQuery");
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tables, "tables");
        this.sourceQuery = sourceQuery;
        this.f1917db = db;
        this.implementation = new CommonLimitOffsetImpl<>(tables, this, new LimitOffsetPagingSource$implementation$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertRows$lambda$1(RoomRawQuery roomRawQuery, LimitOffsetPagingSource limitOffsetPagingSource, int i10, SQLiteConnection connection) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(roomRawQuery.getSql());
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            List<Value> listConvertRows = limitOffsetPagingSource.convertRows(new SQLiteStatementCursor(sQLiteStatementPrepare, i10));
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return listConvertRows;
        } finally {
        }
    }

    public static /* synthetic */ <Value> Object convertRows$suspendImpl(final LimitOffsetPagingSource<Value> limitOffsetPagingSource, final RoomRawQuery roomRawQuery, final int i10, InterfaceC9324c<? super List<? extends Value>> interfaceC9324c) {
        return DBUtil.performSuspending(((LimitOffsetPagingSource) limitOffsetPagingSource).f1917db, true, false, new InterfaceC10570l() { // from class: androidx.room.paging.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return LimitOffsetPagingSource.convertRows$lambda$1(roomRawQuery, limitOffsetPagingSource, i10, (SQLiteConnection) obj);
            }
        }, interfaceC9324c);
    }

    public static /* synthetic */ <Value> Object load$suspendImpl(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
        return ((LimitOffsetPagingSource) limitOffsetPagingSource).implementation.load(loadParams, interfaceC9324c);
    }

    public Object convertRows(RoomRawQuery roomRawQuery, int i10, InterfaceC9324c<? super List<? extends Value>> interfaceC9324c) {
        return convertRows$suspendImpl(this, roomRawQuery, i10, interfaceC9324c);
    }

    public final RoomDatabase getDb() {
        return this.f1917db;
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
    public Object load(PagingSource.LoadParams<Integer> loadParams, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
        return load$suspendImpl(this, loadParams, interfaceC9324c);
    }

    public List<Value> convertRows(Cursor cursor) {
        AbstractC9133u.m16133g(cursor, "cursor");
        throw new NotImplementedError("Unexpected call to a function with no implementation that Room is suppose to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Integer getRefreshKey2(PagingState<Integer, Value> state) {
        AbstractC9133u.m16133g(state, "state");
        return RoomPagingUtil.getClippedRefreshKey(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(RoomSQLiteQuery sourceQuery, RoomDatabase db, String... tables) {
        this(sourceQuery.toRoomRawQuery(), db, (String[]) Arrays.copyOf(tables, tables.length));
        AbstractC9133u.m16133g(sourceQuery, "sourceQuery");
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tables, "tables");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(SupportSQLiteQuery supportSQLiteQuery, RoomDatabase db, String... tables) {
        this(RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery).toRoomRawQuery(), db, (String[]) Arrays.copyOf(tables, tables.length));
        AbstractC9133u.m16133g(supportSQLiteQuery, "supportSQLiteQuery");
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tables, "tables");
    }
}

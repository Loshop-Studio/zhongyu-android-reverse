package androidx.room;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class EntityUpsertAdapter<T> {
    public static final Companion Companion = new Companion(null);
    private static final String ErrorMsg = "unique";
    private static final String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";
    private static final String SQLITE_CONSTRAINT_UNIQUE = "2067";
    private final EntityInsertAdapter<T> entityInsertAdapter;
    private final EntityDeleteOrUpdateAdapter<T> updateAdapter;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public EntityUpsertAdapter(EntityInsertAdapter<T> entityInsertAdapter, EntityDeleteOrUpdateAdapter<T> updateAdapter) {
        AbstractC9979u.m20294g(entityInsertAdapter, "entityInsertAdapter");
        AbstractC9979u.m20294g(updateAdapter, "updateAdapter");
        this.entityInsertAdapter = entityInsertAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!AbstractC10793c0.m23104S(message, ErrorMsg, true) && !AbstractC10793c0.m23108U(message, SQLITE_CONSTRAINT_UNIQUE, false, 2, null) && !AbstractC10793c0.m23108U(message, SQLITE_CONSTRAINT_PRIMARYKEY, false, 2, null)) {
            throw sQLException;
        }
    }

    public final void upsert(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        try {
            this.entityInsertAdapter.insert(connection, (SQLiteConnection) t10);
        } catch (SQLException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(connection, t10);
        }
    }

    public final long upsertAndReturnId(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        try {
            return this.entityInsertAdapter.insertAndReturnId(connection, t10);
        } catch (SQLException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(connection, t10);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection connection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(connection, tArr[i10]);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, tArr[i10]);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection connection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(connection, tArr[i10]);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, tArr[i10]);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return AbstractC10978w.m24136n();
        }
        List listM24124c = AbstractC10976v.m24124c();
        for (T t10 : tArr) {
            try {
                listM24124c.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(connection, t10)));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, t10);
                listM24124c.add(-1L);
            }
        }
        return AbstractC10976v.m24122a(listM24124c);
    }

    public final void upsert(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return;
        }
        for (T t10 : tArr) {
            try {
                this.entityInsertAdapter.insert(connection, (SQLiteConnection) t10);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] upsertAndReturnIdsArray(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(connection, AbstractC10947g0.m23940i0(collection, i10));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, AbstractC10947g0.m23940i0(collection, i10));
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(connection, AbstractC10947g0.m23940i0(collection, i10));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, AbstractC10947g0.m23940i0(collection, i10));
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(SQLiteConnection connection, Iterable<? extends T> iterable) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (iterable == null) {
            return;
        }
        for (T t10 : iterable) {
            try {
                this.entityInsertAdapter.insert(connection, (SQLiteConnection) t10);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, t10);
            }
        }
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return AbstractC10978w.m24136n();
        }
        List listM24124c = AbstractC10976v.m24124c();
        for (T t10 : collection) {
            try {
                listM24124c.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(connection, t10)));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(connection, t10);
                listM24124c.add(-1L);
            }
        }
        return AbstractC10976v.m24122a(listM24124c);
    }
}

package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9117e;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p278v7.AbstractC10251a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityInsertAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t10);

    public abstract String createQuery();

    public final void insert(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (t10 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (t10 == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        AbstractC9133u.m16133g(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objM14562h0 = AbstractC8778f0.m14562h0(collection, i10);
                if (objM14562h0 != null) {
                    bind(sQLiteStatementPrepare, objM14562h0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        AbstractC9133u.m16133g(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objM14562h0 = AbstractC8778f0.m14562h0(collection, i10);
                if (objM14562h0 != null) {
                    bind(sQLiteStatementPrepare, objM14562h0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (tArr == null) {
            return AbstractC8809v.m14771n();
        }
        List listM14753c = AbstractC8807u.m14753c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : tArr) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listM14753c.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listM14753c.add(-1L);
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return AbstractC8807u.m14751a(listM14753c);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (tArr == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            Iterator itM16110a = AbstractC9117e.m16110a(tArr);
            while (itM16110a.hasNext()) {
                Object next = itM16110a.next();
                if (next != null) {
                    bind(sQLiteStatementPrepare, next);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(SQLiteConnection connection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        AbstractC9133u.m16133g(connection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t10 = tArr[i10];
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection connection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        AbstractC9133u.m16133g(connection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t10 = tArr[i10];
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final void insert(SQLiteConnection connection, Iterable<? extends T> iterable) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (iterable == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : iterable) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        AbstractC9133u.m16133g(connection, "connection");
        if (collection == null) {
            return AbstractC8809v.m14771n();
        }
        List listM14753c = AbstractC8807u.m14753c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : collection) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listM14753c.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listM14753c.add(-1L);
                }
            }
            C8736p c8736p = C8736p.f16368a;
            AbstractC10251a.m19205a(sQLiteStatementPrepare, null);
            return AbstractC8807u.m14751a(listM14753c);
        } finally {
        }
    }
}

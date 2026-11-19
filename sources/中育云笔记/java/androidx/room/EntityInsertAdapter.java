package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityInsertAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t10);

    public abstract String createQuery();

    public final void insert(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (t10 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(SQLiteConnection connection, T t10) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (t10 == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t10);
            sQLiteStatementPrepare.step();
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objM23940i0 = AbstractC10947g0.m23940i0(collection, i10);
                if (objM23940i0 != null) {
                    bind(sQLiteStatementPrepare, objM23940i0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objM23940i0 = AbstractC10947g0.m23940i0(collection, i10);
                if (objM23940i0 != null) {
                    bind(sQLiteStatementPrepare, objM23940i0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return AbstractC10978w.m24136n();
        }
        List listM24124c = AbstractC10976v.m24124c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : tArr) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listM24124c.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listM24124c.add(-1L);
                }
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return AbstractC10976v.m24122a(listM24124c);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(SQLiteConnection connection, T[] tArr) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (tArr == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            Iterator itM20268a = AbstractC9963e.m20268a(tArr);
            while (itM20268a.hasNext()) {
                Object next = itM20268a.next();
                if (next != null) {
                    bind(sQLiteStatementPrepare, next);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(SQLiteConnection connection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        AbstractC9979u.m20294g(connection, "connection");
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
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection connection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        AbstractC9979u.m20294g(connection, "connection");
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
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final void insert(SQLiteConnection connection, Iterable<? extends T> iterable) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
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
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection connection, Collection<? extends T> collection) throws Exception {
        AbstractC9979u.m20294g(connection, "connection");
        if (collection == null) {
            return AbstractC10978w.m24136n();
        }
        List listM24124c = AbstractC10976v.m24124c();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : collection) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listM24124c.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listM24124c.add(-1L);
                }
            }
            C10786q c10786q = C10786q.f26013a;
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return AbstractC10976v.m24122a(listM24124c);
        } finally {
        }
    }
}

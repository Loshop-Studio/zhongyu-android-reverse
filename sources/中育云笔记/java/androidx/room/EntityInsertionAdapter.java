package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@InterfaceC10770a
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase database) {
        super(database);
        AbstractC9979u.m20294g(database, "database");
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t10);

    public final void insert(T t10) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t10);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long insertAndReturnId(T t10) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t10);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (T t10 : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC10978w.m24145w();
                }
                bind(supportSQLiteStatementAcquire, t10);
                jArr[i10] = supportSQLiteStatementAcquire.executeInsert();
                i10 = i11;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i10] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listM24124c = AbstractC10976v.m24124c();
            for (T t10 : entities) {
                bind(supportSQLiteStatementAcquire, t10);
                listM24124c.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            List<Long> listM24122a = AbstractC10976v.m24122a(listM24124c);
            release(supportSQLiteStatementAcquire);
            return listM24122a;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final void insert(T[] entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t10 : entities) {
                bind(supportSQLiteStatementAcquire, t10);
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(supportSQLiteStatementAcquire, entities[i10]);
                jArr[i11] = supportSQLiteStatementAcquire.executeInsert();
                i10++;
                i11 = i12;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator itM20268a = AbstractC9963e.m20268a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(supportSQLiteStatementAcquire, itM20268a.next());
                lArr[i10] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listM24124c = AbstractC10976v.m24124c();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                listM24124c.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            List<Long> listM24122a = AbstractC10976v.m24122a(listM24124c);
            release(supportSQLiteStatementAcquire);
            return listM24122a;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final void insert(Iterable<? extends T> entities) {
        AbstractC9979u.m20294g(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}

package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8807u;

@InterfaceC8721a
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> insertionAdapter, EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        AbstractC9133u.m16133g(insertionAdapter, "insertionAdapter");
        AbstractC9133u.m16133g(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        if (!AbstractC8661c0.m13969Q(message, "unique", true) && !AbstractC8661c0.m13973S(message, "2067", false, 2, null) && !AbstractC8661c0.m13973S(message, "1555", false, 2, null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T t10) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t10);
        } catch (SQLiteConstraintException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(t10);
        }
    }

    public final long upsertAndReturnId(T t10) {
        try {
            return this.insertionAdapter.insertAndReturnId(t10);
        } catch (SQLiteConstraintException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(t10);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] entities) {
        long jInsertAndReturnId;
        AbstractC9133u.m16133g(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] entities) {
        long jInsertAndReturnId;
        AbstractC9133u.m16133g(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] entities) {
        AbstractC9133u.m16133g(entities, "entities");
        List listM14753c = AbstractC8807u.m14753c();
        for (T t10 : entities) {
            try {
                listM14753c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
                listM14753c.add(-1L);
            }
        }
        return AbstractC8807u.m14751a(listM14753c);
    }

    public final void upsert(T[] entities) {
        AbstractC9133u.m16133g(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t10);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
            }
        }
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> entities) {
        long jInsertAndReturnId;
        AbstractC9133u.m16133g(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        long jInsertAndReturnId;
        AbstractC9133u.m16133g(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(Iterable<? extends T> entities) {
        AbstractC9133u.m16133g(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t10);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
            }
        }
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> entities) {
        AbstractC9133u.m16133g(entities, "entities");
        List listM14753c = AbstractC8807u.m14753c();
        for (T t10 : entities) {
            try {
                listM14753c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
                listM14753c.add(-1L);
            }
        }
        return AbstractC8807u.m14751a(listM14753c);
    }
}

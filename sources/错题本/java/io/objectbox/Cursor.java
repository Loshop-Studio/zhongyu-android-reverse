package io.objectbox;

import io.objectbox.annotation.apihint.Beta;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToMany;
import java.io.Closeable;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@Beta
@Internal
@NotThreadSafe
/* loaded from: classes3.dex */
public abstract class Cursor<T> implements Closeable {

    @Internal
    static boolean LOG_READ_NOT_CLOSED = false;
    protected static final int PUT_FLAG_COMPLETE = 2;
    protected static final int PUT_FLAG_FIRST = 1;

    @Internal
    static boolean TRACK_CREATION_STACK;
    protected final BoxStore boxStoreForEntities;
    protected boolean closed;
    private final Throwable creationThrowable;
    protected final long cursor;
    protected final EntityInfo<T> entityInfo;
    protected final boolean readOnly;

    /* renamed from: tx */
    protected final Transaction f8915tx;

    public Cursor(Transaction transaction, long j7, EntityInfo entityInfo, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f8915tx = transaction;
        this.readOnly = transaction.f8919c;
        this.cursor = j7;
        this.entityInfo = entityInfo;
        this.boxStoreForEntities = boxStore;
        for (Property<T> property : entityInfo.getAllProperties()) {
            if (!property.isIdVerified()) {
                property.verifyId(getPropertyId(property.dbName));
            }
        }
        this.creationThrowable = TRACK_CREATION_STACK ? new Throwable() : null;
        nativeSetBoxStoreForEntities(j7, boxStore);
    }

    public static native long collect002033(long j7, long j8, int i, int i8, long j9, int i9, long j10, int i10, float f, int i11, float f7, int i12, float f8, int i13, double d9, int i14, double d10, int i15, double d11);

    public static native long collect004000(long j7, long j8, int i, int i8, long j9, int i9, long j10, int i10, long j11, int i11, long j12);

    public static native long collect313311(long j7, long j8, int i, int i8, @Nullable String str, int i9, @Nullable String str2, int i10, @Nullable String str3, int i11, @Nullable byte[] bArr, int i12, long j9, int i13, long j10, int i14, long j11, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f, int i22, double d9);

    public static native long collect400000(long j7, long j8, int i, int i8, @Nullable String str, int i9, @Nullable String str2, int i10, @Nullable String str3, int i11, @Nullable String str4);

    public static native long collect430000(long j7, long j8, int i, int i8, @Nullable String str, int i9, @Nullable String str2, int i10, @Nullable String str3, int i11, @Nullable String str4, int i12, @Nullable byte[] bArr, int i13, @Nullable byte[] bArr2, int i14, @Nullable byte[] bArr3);

    public static native boolean nativeDeleteEntity(long j7, long j8);

    public static native Object nativeFirstEntity(long j7);

    public static native Object nativeGetEntity(long j7, long j8);

    public static native long nativeLookupKeyUsingIndex(long j7, int i, String str);

    public static native Object nativeNextEntity(long j7);

    public static native boolean nativeSeek(long j7, long j8);

    public <TARGET> void checkApplyToManyToDb(List<TARGET> list, Class<TARGET> cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.internalCheckApplyToDbRequired()) {
                Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(cls);
                try {
                    toMany.internalApplyToDb(this, relationTargetCursor);
                    if (relationTargetCursor != null) {
                        relationTargetCursor.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (relationTargetCursor != null) {
                            try {
                                relationTargetCursor.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            Transaction transaction = this.f8915tx;
            if (transaction != null && !transaction.f8918b.f8911o) {
                nativeDestroy(this.cursor);
            }
        }
    }

    public long count(long j7) {
        return nativeCount(this.cursor, j7);
    }

    public void deleteAll() {
        nativeDeleteAll(this.cursor);
    }

    public boolean deleteEntity(long j7) {
        return nativeDeleteEntity(this.cursor, j7);
    }

    public void finalize() throws Throwable {
        if (this.closed) {
            return;
        }
        if (!this.readOnly || LOG_READ_NOT_CLOSED) {
            System.err.println("Cursor was not closed.");
            if (this.creationThrowable != null) {
                System.err.println("Cursor was initially created here:");
                this.creationThrowable.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    public T first() {
        return (T) nativeFirstEntity(this.cursor);
    }

    public T get(long j7) {
        return (T) nativeGetEntity(this.cursor, j7);
    }

    public List<T> getAll() {
        return nativeGetAllEntities(this.cursor);
    }

    @Internal
    public List<T> getBacklinkEntities(int i, Property<?> property, long j7) {
        try {
            return nativeGetBacklinkEntities(this.cursor, i, property.getId(), j7);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e);
        }
    }

    @Internal
    public long[] getBacklinkIds(int i, Property<?> property, long j7) {
        try {
            return nativeGetBacklinkIds(this.cursor, i, property.getId(), j7);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e);
        }
    }

    public EntityInfo<T> getEntityInfo() {
        return this.entityInfo;
    }

    public abstract long getId(Object obj);

    public int getPropertyId(String str) {
        return nativePropertyId(this.cursor, str);
    }

    @Internal
    public List<T> getRelationEntities(int i, int i8, long j7, boolean z8) {
        return nativeGetRelationEntities(this.cursor, i, i8, j7, z8);
    }

    @Internal
    public long[] getRelationIds(int i, int i8, long j7, boolean z8) {
        return nativeGetRelationIds(this.cursor, i, i8, j7, z8);
    }

    public <TARGET> Cursor<TARGET> getRelationTargetCursor(Class<TARGET> cls) {
        EntityInfo entityInfo = (EntityInfo) this.boxStoreForEntities.f8901e.get(cls);
        return entityInfo.getCursorFactory().createCursor(this.f8915tx, nativeGetCursorFor(this.cursor, entityInfo.getEntityId()), this.boxStoreForEntities);
    }

    public Transaction getTx() {
        return this.f8915tx;
    }

    @Internal
    public long internalHandle() {
        return this.cursor;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isObsolete() {
        Transaction transaction = this.f8915tx;
        return transaction.f8920d != transaction.f8918b.f8913q;
    }

    public long lookupKeyUsingIndex(int i, String str) {
        return nativeLookupKeyUsingIndex(this.cursor, i, str);
    }

    @Internal
    public void modifyRelations(int i, long j7, long[] jArr, boolean z8) {
        nativeModifyRelations(this.cursor, i, j7, jArr, z8);
    }

    @Internal
    public void modifyRelationsSingle(int i, long j7, long j8, boolean z8) {
        nativeModifyRelationsSingle(this.cursor, i, j7, j8, z8);
    }

    public native long nativeCount(long j7, long j8);

    public native void nativeDeleteAll(long j7);

    public native void nativeDestroy(long j7);

    public native List<T> nativeGetAllEntities(long j7);

    public native List<T> nativeGetBacklinkEntities(long j7, int i, int i8, long j8);

    public native long[] nativeGetBacklinkIds(long j7, int i, int i8, long j8);

    public native long nativeGetCursorFor(long j7, int i);

    public native List<T> nativeGetRelationEntities(long j7, int i, int i8, long j8, boolean z8);

    public native long[] nativeGetRelationIds(long j7, int i, int i8, long j8, boolean z8);

    public native void nativeModifyRelations(long j7, int i, long j8, long[] jArr, boolean z8);

    public native void nativeModifyRelationsSingle(long j7, int i, long j8, long j9, boolean z8);

    public native int nativePropertyId(long j7, String str);

    public native long nativeRenew(long j7);

    public native void nativeSetBoxStoreForEntities(long j7, Object obj);

    public T next() {
        return (T) nativeNextEntity(this.cursor);
    }

    public abstract long put(Object obj);

    public void renew() {
        nativeRenew(this.cursor);
    }

    public boolean seek(long j7) {
        return nativeSeek(this.cursor, j7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cursor ");
        sb.append(Long.toString(this.cursor, 16));
        sb.append(isClosed() ? "(closed)" : "");
        return sb.toString();
    }
}

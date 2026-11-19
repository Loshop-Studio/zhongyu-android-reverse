package io.objectbox;

import io.objectbox.relation.ToMany;
import java.io.Closeable;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes5.dex */
public abstract class Cursor<T> implements Closeable {
    static boolean LOG_READ_NOT_CLOSED = false;
    protected static final int PUT_FLAG_COMPLETE = 2;
    protected static final int PUT_FLAG_FIRST = 1;
    static boolean TRACK_CREATION_STACK;
    protected final BoxStore boxStoreForEntities;
    protected boolean closed;
    private final Throwable creationThrowable;
    protected final long cursor;
    protected final EntityInfo<T> entityInfo;
    protected final boolean readOnly;

    /* renamed from: tx */
    protected final Transaction f16868tx;

    public Cursor(Transaction transaction, long j10, EntityInfo entityInfo, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f16868tx = transaction;
        this.readOnly = transaction.isReadOnly();
        this.cursor = j10;
        this.entityInfo = entityInfo;
        this.boxStoreForEntities = boxStore;
        for (Property property : entityInfo.getAllProperties()) {
            if (!property.m15391b()) {
                property.m15392c(getPropertyId(property.f16877h));
            }
        }
        this.creationThrowable = TRACK_CREATION_STACK ? new Throwable() : null;
        nativeSetBoxStoreForEntities(j10, boxStore);
    }

    public static native long collect002033(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, float f10, int i14, float f11, int i15, float f12, int i16, double d10, int i17, double d11, int i18, double d12);

    public static native long collect004000(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, long j14, int i14, long j15);

    public static native long collect313311(long j10, long j11, int i10, int i11, @Nullable String str, int i12, @Nullable String str2, int i13, @Nullable String str3, int i14, @Nullable byte[] bArr, int i15, long j12, int i16, long j13, int i17, long j14, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f10, int i25, double d10);

    public static native long collect400000(long j10, long j11, int i10, int i11, @Nullable String str, int i12, @Nullable String str2, int i13, @Nullable String str3, int i14, @Nullable String str4);

    public static native long collect430000(long j10, long j11, int i10, int i11, @Nullable String str, int i12, @Nullable String str2, int i13, @Nullable String str3, int i14, @Nullable String str4, int i15, @Nullable byte[] bArr, int i16, @Nullable byte[] bArr2, int i17, @Nullable byte[] bArr3);

    public static native boolean nativeDeleteEntity(long j10, long j11);

    public static native Object nativeFirstEntity(long j10);

    public static native Object nativeGetEntity(long j10, long j11);

    public static native long nativeLookupKeyUsingIndex(long j10, int i10, String str);

    public static native Object nativeNextEntity(long j10);

    public static native boolean nativeSeek(long j10, long j11);

    public <TARGET> void checkApplyToManyToDb(List<TARGET> list, Class<TARGET> cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.m15501k()) {
                Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(cls);
                try {
                    toMany.m15500j(this, relationTargetCursor);
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
            Transaction transaction = this.f16868tx;
            if (transaction != null && !transaction.m15398f().isClosed()) {
                nativeDestroy(this.cursor);
            }
        }
    }

    public long count(long j10) {
        return nativeCount(this.cursor, j10);
    }

    public void deleteAll() {
        nativeDeleteAll(this.cursor);
    }

    public boolean deleteEntity(long j10) {
        return nativeDeleteEntity(this.cursor, j10);
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

    public T get(long j10) {
        return (T) nativeGetEntity(this.cursor, j10);
    }

    public List<T> getAll() {
        return nativeGetAllEntities(this.cursor);
    }

    public List<T> getBacklinkEntities(int i10, Property<?> property, long j10) {
        try {
            return nativeGetBacklinkEntities(this.cursor, i10, property.m15390a(), j10);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e10);
        }
    }

    public long[] getBacklinkIds(int i10, Property<?> property, long j10) {
        try {
            return nativeGetBacklinkIds(this.cursor, i10, property.m15390a(), j10);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e10);
        }
    }

    public EntityInfo<T> getEntityInfo() {
        return this.entityInfo;
    }

    public abstract long getId(Object obj);

    public int getPropertyId(String str) {
        return nativePropertyId(this.cursor, str);
    }

    public List<T> getRelationEntities(int i10, int i11, long j10, boolean z10) {
        return nativeGetRelationEntities(this.cursor, i10, i11, j10, z10);
    }

    public long[] getRelationIds(int i10, int i11, long j10, boolean z10) {
        return nativeGetRelationIds(this.cursor, i10, i11, j10, z10);
    }

    public <TARGET> Cursor<TARGET> getRelationTargetCursor(Class<TARGET> cls) {
        EntityInfo entityInfoM15382r = this.boxStoreForEntities.m15382r(cls);
        return entityInfoM15382r.getCursorFactory().createCursor(this.f16868tx, nativeGetCursorFor(this.cursor, entityInfoM15382r.getEntityId()), this.boxStoreForEntities);
    }

    public Transaction getTx() {
        return this.f16868tx;
    }

    public long internalHandle() {
        return this.cursor;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isObsolete() {
        return this.f16868tx.m15399g();
    }

    public long lookupKeyUsingIndex(int i10, String str) {
        return nativeLookupKeyUsingIndex(this.cursor, i10, str);
    }

    public void modifyRelations(int i10, long j10, long[] jArr, boolean z10) {
        nativeModifyRelations(this.cursor, i10, j10, jArr, z10);
    }

    public void modifyRelationsSingle(int i10, long j10, long j11, boolean z10) {
        nativeModifyRelationsSingle(this.cursor, i10, j10, j11, z10);
    }

    public native long nativeCount(long j10, long j11);

    public native void nativeDeleteAll(long j10);

    public native void nativeDestroy(long j10);

    public native List<T> nativeGetAllEntities(long j10);

    public native List<T> nativeGetBacklinkEntities(long j10, int i10, int i11, long j11);

    public native long[] nativeGetBacklinkIds(long j10, int i10, int i11, long j11);

    public native long nativeGetCursorFor(long j10, int i10);

    public native List<T> nativeGetRelationEntities(long j10, int i10, int i11, long j11, boolean z10);

    public native long[] nativeGetRelationIds(long j10, int i10, int i11, long j11, boolean z10);

    public native void nativeModifyRelations(long j10, int i10, long j11, long[] jArr, boolean z10);

    public native void nativeModifyRelationsSingle(long j10, int i10, long j11, long j12, boolean z10);

    public native int nativePropertyId(long j10, String str);

    public native long nativeRenew(long j10);

    public native void nativeSetBoxStoreForEntities(long j10, Object obj);

    public T next() {
        return (T) nativeNextEntity(this.cursor);
    }

    public abstract long put(Object obj);

    public void renew() {
        nativeRenew(this.cursor);
    }

    public boolean seek(long j10) {
        return nativeSeek(this.cursor, j10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cursor ");
        sb.append(Long.toString(this.cursor, 16));
        sb.append(isClosed() ? "(closed)" : "");
        return sb.toString();
    }
}

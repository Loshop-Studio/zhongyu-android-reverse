package io.objectbox;

import io.objectbox.relation.ToMany;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Cursor<T> implements Closeable {

    /* renamed from: j */
    public static boolean f22253j;

    /* renamed from: k */
    public static boolean f22254k;

    /* renamed from: c */
    public final Transaction f22255c;

    /* renamed from: d */
    public final long f22256d;

    /* renamed from: e */
    public final EntityInfo f22257e;

    /* renamed from: f */
    public final BoxStore f22258f;

    /* renamed from: g */
    public final boolean f22259g;

    /* renamed from: h */
    public boolean f22260h;

    /* renamed from: i */
    public final Throwable f22261i;

    public Cursor(Transaction transaction, long j10, EntityInfo entityInfo, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f22255c = transaction;
        this.f22259g = transaction.isReadOnly();
        this.f22256d = j10;
        this.f22257e = entityInfo;
        this.f22258f = boxStore;
        for (Property property : entityInfo.mo13993h()) {
            if (!property.m18982c()) {
                property.m18983d(m18973j(property.f22270j));
            }
        }
        this.f22261i = f22253j ? new Throwable() : null;
        nativeSetBoxStoreForEntities(j10, boxStore);
    }

    public static native long collect002033(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, float f10, int i14, float f11, int i15, float f12, int i16, double d10, int i17, double d11, int i18, double d12);

    public static native long collect004000(long j10, long j11, int i10, int i11, long j12, int i12, long j13, int i13, long j14, int i14, long j15);

    public static native long collect313311(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, byte[] bArr, int i15, long j12, int i16, long j13, int i17, long j14, int i18, int i19, int i20, int i21, int i22, int i23, int i24, float f10, int i25, double d10);

    public static native long collect400000(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, String str4);

    public static native long collect430000(long j10, long j11, int i10, int i11, String str, int i12, String str2, int i13, String str3, int i14, String str4, int i15, byte[] bArr, int i16, byte[] bArr2, int i17, byte[] bArr3);

    public static native boolean nativeDeleteEntity(long j10, long j11);

    public static native Object nativeFirstEntity(long j10);

    public static native Object nativeGetEntity(long j10, long j11);

    public static native long nativeLookupKeyUsingIndex(long j10, int i10, String str);

    public static native Object nativeNextEntity(long j10);

    public static native boolean nativeSeek(long j10, long j11);

    /* renamed from: a */
    public void m18968a(List list, Class cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.m19026o()) {
                Cursor cursorM18975l = m18975l(cls);
                try {
                    toMany.m19025n(this, cursorM18975l);
                    if (cursorM18975l != null) {
                        cursorM18975l.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (cursorM18975l != null) {
                            try {
                                cursorM18975l.close();
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

    /* renamed from: c */
    public boolean m18969c(long j10) {
        return nativeDeleteEntity(this.f22256d, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f22260h) {
            this.f22260h = true;
            Transaction transaction = this.f22255c;
            if (transaction != null && !transaction.m18988j().isClosed()) {
                nativeDestroy(this.f22256d);
            }
        }
    }

    /* renamed from: e */
    public Object m18970e() {
        return nativeFirstEntity(this.f22256d);
    }

    /* renamed from: f */
    public Object m18971f(long j10) {
        return nativeGetEntity(this.f22256d, j10);
    }

    public void finalize() throws Throwable {
        if (this.f22260h) {
            return;
        }
        if (!this.f22259g || f22254k) {
            System.err.println("Cursor was not closed.");
            if (this.f22261i != null) {
                System.err.println("Cursor was initially created here:");
                this.f22261i.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    /* renamed from: g */
    public List m18972g(int i10, Property property, long j10) {
        try {
            return nativeGetBacklinkEntities(this.f22256d, i10, property.m18981a(), j10);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e10);
        }
    }

    /* renamed from: i */
    public abstract long mo13986i(Object obj);

    public boolean isClosed() {
        return this.f22260h;
    }

    /* renamed from: j */
    public int m18973j(String str) {
        return nativePropertyId(this.f22256d, str);
    }

    /* renamed from: k */
    public List m18974k(int i10, int i11, long j10, boolean z10) {
        return nativeGetRelationEntities(this.f22256d, i10, i11, j10, z10);
    }

    /* renamed from: l */
    public Cursor m18975l(Class cls) {
        EntityInfo entityInfoM18966x = this.f22258f.m18966x(cls);
        return entityInfoM18966x.mo13995l().mo13991a(this.f22255c, nativeGetCursorFor(this.f22256d, entityInfoM18966x.mo13996q()), this.f22258f);
    }

    /* renamed from: m */
    public Transaction m18976m() {
        return this.f22255c;
    }

    /* renamed from: n */
    public long m18977n() {
        return this.f22256d;
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

    /* renamed from: p */
    public void m18978p(int i10, long j10, long[] jArr, boolean z10) {
        nativeModifyRelations(this.f22256d, i10, j10, jArr, z10);
    }

    /* renamed from: r */
    public Object m18979r() {
        return nativeNextEntity(this.f22256d);
    }

    /* renamed from: s */
    public abstract long mo13987s(Object obj);

    /* renamed from: t */
    public void m18980t() {
        nativeRenew(this.f22256d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cursor ");
        sb2.append(Long.toString(this.f22256d, 16));
        sb2.append(isClosed() ? "(closed)" : "");
        return sb2.toString();
    }
}

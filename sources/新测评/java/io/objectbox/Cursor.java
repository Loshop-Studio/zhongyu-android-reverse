package io.objectbox;

import io.objectbox.relation.ToMany;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Cursor<T> implements Closeable {

    /* renamed from: h */
    public static boolean f13180h;

    /* renamed from: i */
    public static boolean f13181i;

    /* renamed from: a */
    public final Transaction f13182a;

    /* renamed from: b */
    public final long f13183b;

    /* renamed from: c */
    public final EntityInfo f13184c;

    /* renamed from: d */
    public final BoxStore f13185d;

    /* renamed from: e */
    public final boolean f13186e;

    /* renamed from: f */
    public boolean f13187f;

    /* renamed from: g */
    public final Throwable f13188g;

    public Cursor(Transaction transaction, long j10, EntityInfo entityInfo, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f13182a = transaction;
        this.f13186e = transaction.isReadOnly();
        this.f13183b = j10;
        this.f13184c = entityInfo;
        this.f13185d = boxStore;
        for (Property property : entityInfo.mo6270c()) {
            if (!property.m13009f()) {
                property.m13010j(m13001j(property.f13197h));
            }
        }
        this.f13188g = f13180h ? new Throwable() : null;
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
    public void m12997a(List list, Class cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.m13055t()) {
                Cursor cursorM13003l = m13003l(cls);
                try {
                    toMany.m13054s(this, cursorM13003l);
                    if (cursorM13003l != null) {
                        cursorM13003l.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (cursorM13003l != null) {
                            try {
                                cursorM13003l.close();
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
        if (!this.f13187f) {
            this.f13187f = true;
            Transaction transaction = this.f13182a;
            if (transaction != null && !transaction.m13016j().isClosed()) {
                nativeDestroy(this.f13183b);
            }
        }
    }

    /* renamed from: f */
    public boolean m12998f(long j10) {
        return nativeDeleteEntity(this.f13183b, j10);
    }

    public void finalize() throws Throwable {
        if (this.f13187f) {
            return;
        }
        if (!this.f13186e || f13181i) {
            System.err.println("Cursor was not closed.");
            if (this.f13188g != null) {
                System.err.println("Cursor was initially created here:");
                this.f13188g.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    /* renamed from: g */
    public Object m12999g(long j10) {
        return nativeGetEntity(this.f13183b, j10);
    }

    /* renamed from: h */
    public List m13000h(int i10, Property property, long j10) {
        try {
            return nativeGetBacklinkEntities(this.f13183b, i10, property.m13008a(), j10);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e10);
        }
    }

    /* renamed from: i */
    public abstract long mo6264i(Object obj);

    public boolean isClosed() {
        return this.f13187f;
    }

    /* renamed from: j */
    public int m13001j(String str) {
        return nativePropertyId(this.f13183b, str);
    }

    /* renamed from: k */
    public List m13002k(int i10, int i11, long j10, boolean z9) {
        return nativeGetRelationEntities(this.f13183b, i10, i11, j10, z9);
    }

    /* renamed from: l */
    public Cursor m13003l(Class cls) {
        EntityInfo entityInfoM12993v = this.f13185d.m12993v(cls);
        return entityInfoM12993v.mo6272g().mo6269a(this.f13182a, nativeGetCursorFor(this.f13183b, entityInfoM12993v.mo6273h()), this.f13185d);
    }

    /* renamed from: m */
    public Transaction m13004m() {
        return this.f13182a;
    }

    /* renamed from: n */
    public long m13005n() {
        return this.f13183b;
    }

    public native long nativeCount(long j10, long j11);

    public native void nativeDeleteAll(long j10);

    public native void nativeDestroy(long j10);

    public native List<T> nativeGetAllEntities(long j10);

    public native List<T> nativeGetBacklinkEntities(long j10, int i10, int i11, long j11);

    public native long[] nativeGetBacklinkIds(long j10, int i10, int i11, long j11);

    public native long nativeGetCursorFor(long j10, int i10);

    public native List<T> nativeGetRelationEntities(long j10, int i10, int i11, long j11, boolean z9);

    public native long[] nativeGetRelationIds(long j10, int i10, int i11, long j11, boolean z9);

    public native void nativeModifyRelations(long j10, int i10, long j11, long[] jArr, boolean z9);

    public native void nativeModifyRelationsSingle(long j10, int i10, long j11, long j12, boolean z9);

    public native int nativePropertyId(long j10, String str);

    public native long nativeRenew(long j10);

    public native void nativeSetBoxStoreForEntities(long j10, Object obj);

    /* renamed from: o */
    public void m13006o(int i10, long j10, long[] jArr, boolean z9) {
        nativeModifyRelations(this.f13183b, i10, j10, jArr, z9);
    }

    /* renamed from: p */
    public abstract long mo6265p(Object obj);

    /* renamed from: q */
    public void m13007q() {
        nativeRenew(this.f13183b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cursor ");
        sb.append(Long.toString(this.f13183b, 16));
        sb.append(isClosed() ? "(closed)" : "");
        return sb.toString();
    }
}

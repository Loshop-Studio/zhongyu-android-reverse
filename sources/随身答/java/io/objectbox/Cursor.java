package io.objectbox;

import io.objectbox.relation.ToMany;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Cursor<T> implements Closeable {

    /* renamed from: h */
    public static boolean f13994h;

    /* renamed from: i */
    public static boolean f13995i;

    /* renamed from: a */
    public final Transaction f13996a;

    /* renamed from: b */
    public final long f13997b;

    /* renamed from: c */
    public final EntityInfo f13998c;

    /* renamed from: d */
    public final BoxStore f13999d;

    /* renamed from: e */
    public final boolean f14000e;

    /* renamed from: f */
    public boolean f14001f;

    /* renamed from: g */
    public final Throwable f14002g;

    public Cursor(Transaction transaction, long j9, EntityInfo entityInfo, BoxStore boxStore) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction is null");
        }
        this.f13996a = transaction;
        this.f14000e = transaction.isReadOnly();
        this.f13997b = j9;
        this.f13998c = entityInfo;
        this.f13999d = boxStore;
        for (Property property : entityInfo.mo7363d()) {
            if (!property.m13129c()) {
                property.m13130g(m13121j(property.f14011h));
            }
        }
        this.f14002g = f13994h ? new Throwable() : null;
        nativeSetBoxStoreForEntities(j9, boxStore);
    }

    public static native long collect002033(long j9, long j10, int i9, int i10, long j11, int i11, long j12, int i12, float f10, int i13, float f11, int i14, float f12, int i15, double d10, int i16, double d11, int i17, double d12);

    public static native long collect004000(long j9, long j10, int i9, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14);

    public static native long collect313311(long j9, long j10, int i9, int i10, String str, int i11, String str2, int i12, String str3, int i13, byte[] bArr, int i14, long j11, int i15, long j12, int i16, long j13, int i17, int i18, int i19, int i20, int i21, int i22, int i23, float f10, int i24, double d10);

    public static native long collect400000(long j9, long j10, int i9, int i10, String str, int i11, String str2, int i12, String str3, int i13, String str4);

    public static native long collect430000(long j9, long j10, int i9, int i10, String str, int i11, String str2, int i12, String str3, int i13, String str4, int i14, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3);

    public static native boolean nativeDeleteEntity(long j9, long j10);

    public static native Object nativeFirstEntity(long j9);

    public static native Object nativeGetEntity(long j9, long j10);

    public static native long nativeLookupKeyUsingIndex(long j9, int i9, String str);

    public static native Object nativeNextEntity(long j9);

    public static native boolean nativeSeek(long j9, long j10);

    /* renamed from: a */
    public void m13117a(List list, Class cls) {
        if (list instanceof ToMany) {
            ToMany toMany = (ToMany) list;
            if (toMany.m13177w()) {
                Cursor cursorM13123l = m13123l(cls);
                try {
                    toMany.m13176v(this, cursorM13123l);
                    if (cursorM13123l != null) {
                        cursorM13123l.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (cursorM13123l != null) {
                            try {
                                cursorM13123l.close();
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
    public boolean m13118c(long j9) {
        return nativeDeleteEntity(this.f13997b, j9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f14001f) {
            this.f14001f = true;
            Transaction transaction = this.f13996a;
            if (transaction != null && !transaction.m13136j().isClosed()) {
                nativeDestroy(this.f13997b);
            }
        }
    }

    public void finalize() throws Throwable {
        if (this.f14001f) {
            return;
        }
        if (!this.f14000e || f13995i) {
            System.err.println("Cursor was not closed.");
            if (this.f14002g != null) {
                System.err.println("Cursor was initially created here:");
                this.f14002g.printStackTrace();
            }
            System.err.flush();
        }
        close();
        super.finalize();
    }

    /* renamed from: g */
    public Object m13119g(long j9) {
        return nativeGetEntity(this.f13997b, j9);
    }

    /* renamed from: h */
    public List m13120h(int i9, Property property, long j9) {
        try {
            return nativeGetBacklinkEntities(this.f13997b, i9, property.m13128a(), j9);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Please check if the given property belongs to a valid @Relation: " + property, e10);
        }
    }

    /* renamed from: i */
    public abstract long mo7358i(Object obj);

    public boolean isClosed() {
        return this.f14001f;
    }

    /* renamed from: j */
    public int m13121j(String str) {
        return nativePropertyId(this.f13997b, str);
    }

    /* renamed from: k */
    public List m13122k(int i9, int i10, long j9, boolean z9) {
        return nativeGetRelationEntities(this.f13997b, i9, i10, j9, z9);
    }

    /* renamed from: l */
    public Cursor m13123l(Class cls) {
        EntityInfo entityInfoM13113v = this.f13999d.m13113v(cls);
        return entityInfoM13113v.mo7365i().mo2405a(this.f13996a, nativeGetCursorFor(this.f13997b, entityInfoM13113v.mo7366j()), this.f13999d);
    }

    /* renamed from: m */
    public Transaction m13124m() {
        return this.f13996a;
    }

    /* renamed from: n */
    public long m13125n() {
        return this.f13997b;
    }

    public native long nativeCount(long j9, long j10);

    public native void nativeDeleteAll(long j9);

    public native void nativeDestroy(long j9);

    public native List<T> nativeGetAllEntities(long j9);

    public native List<T> nativeGetBacklinkEntities(long j9, int i9, int i10, long j10);

    public native long[] nativeGetBacklinkIds(long j9, int i9, int i10, long j10);

    public native long nativeGetCursorFor(long j9, int i9);

    public native List<T> nativeGetRelationEntities(long j9, int i9, int i10, long j10, boolean z9);

    public native long[] nativeGetRelationIds(long j9, int i9, int i10, long j10, boolean z9);

    public native void nativeModifyRelations(long j9, int i9, long j10, long[] jArr, boolean z9);

    public native void nativeModifyRelationsSingle(long j9, int i9, long j10, long j11, boolean z9);

    public native int nativePropertyId(long j9, String str);

    public native long nativeRenew(long j9);

    public native void nativeSetBoxStoreForEntities(long j9, Object obj);

    /* renamed from: o */
    public void m13126o(int i9, long j9, long[] jArr, boolean z9) {
        nativeModifyRelations(this.f13997b, i9, j9, jArr, z9);
    }

    /* renamed from: p */
    public abstract long mo7359p(Object obj);

    /* renamed from: q */
    public void m13127q() {
        nativeRenew(this.f13997b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cursor ");
        sb.append(Long.toString(this.f13997b, 16));
        sb.append(isClosed() ? "(closed)" : "");
        return sb.toString();
    }
}

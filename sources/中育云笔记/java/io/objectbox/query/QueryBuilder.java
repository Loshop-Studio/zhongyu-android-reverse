package io.objectbox.query;

import io.objectbox.Property;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.util.Comparator;
import java.util.List;
import p210jc.C9710a;

/* loaded from: classes6.dex */
public class QueryBuilder<T> implements Closeable {

    /* renamed from: c */
    public final C9710a f22298c;

    /* renamed from: d */
    public final long f22299d;

    /* renamed from: e */
    public long f22300e;

    /* renamed from: f */
    public long f22301f;

    /* renamed from: g */
    public long f22302g;

    /* renamed from: h */
    public Operator f22303h = Operator.NONE;

    /* renamed from: i */
    public List f22304i;

    /* renamed from: j */
    public Comparator f22305j;

    /* renamed from: k */
    public final boolean f22306k;

    public enum Operator {
        NONE,
        AND,
        OR
    }

    public QueryBuilder(C9710a c9710a, long j10, String str) {
        this.f22298c = c9710a;
        this.f22299d = j10;
        long jNativeCreate = nativeCreate(j10, str);
        this.f22300e = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
        this.f22306k = false;
    }

    private native long nativeBetween(long j10, int i10, double d10, double d11);

    private native long nativeBetween(long j10, int i10, long j11, long j12);

    private native long nativeBuild(long j10);

    private native long nativeCombine(long j10, long j11, long j12, boolean z10);

    private native long nativeContains(long j10, int i10, String str, boolean z10);

    private native long nativeCreate(long j10, String str);

    private native void nativeDestroy(long j10);

    private native long nativeEndsWith(long j10, int i10, String str, boolean z10);

    private native long nativeEqual(long j10, int i10, long j11);

    private native long nativeEqual(long j10, int i10, String str, boolean z10);

    private native long nativeEqual(long j10, int i10, byte[] bArr);

    private native long nativeGreater(long j10, int i10, double d10, boolean z10);

    private native long nativeGreater(long j10, int i10, long j11, boolean z10);

    private native long nativeGreater(long j10, int i10, String str, boolean z10, boolean z11);

    private native long nativeGreater(long j10, int i10, byte[] bArr, boolean z10);

    private native long nativeIn(long j10, int i10, int[] iArr, boolean z10);

    private native long nativeIn(long j10, int i10, long[] jArr, boolean z10);

    private native long nativeIn(long j10, int i10, String[] strArr, boolean z10);

    private native long nativeLess(long j10, int i10, double d10, boolean z10);

    private native long nativeLess(long j10, int i10, long j11, boolean z10);

    private native long nativeLess(long j10, int i10, String str, boolean z10, boolean z11);

    private native long nativeLess(long j10, int i10, byte[] bArr, boolean z10);

    private native long nativeLink(long j10, long j11, int i10, int i11, int i12, int i13, boolean z10);

    private native long nativeNotEqual(long j10, int i10, long j11);

    private native long nativeNotEqual(long j10, int i10, String str, boolean z10);

    private native long nativeNotNull(long j10, int i10);

    private native long nativeNull(long j10, int i10);

    private native void nativeOrder(long j10, int i10, int i11);

    private native void nativeSetParameterAlias(long j10, String str);

    private native long nativeStartsWith(long j10, int i10, String str, boolean z10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f22300e;
        if (j10 != 0) {
            this.f22300e = 0L;
            if (!this.f22306k) {
                nativeDestroy(j10);
            }
        }
    }

    /* renamed from: e */
    public Query m19011e() {
        m19015j();
        m19014i();
        if (this.f22303h != Operator.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(this.f22300e);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f22298c, jNativeBuild, this.f22304i, null, this.f22305j);
        close();
        return query;
    }

    /* renamed from: f */
    public final void m19012f(long j10) {
        QueryBuilder<T> queryBuilder;
        long j11;
        Operator operator = this.f22303h;
        Operator operator2 = Operator.NONE;
        if (operator != operator2) {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f22301f = queryBuilder.nativeCombine(this.f22300e, this.f22301f, j11, operator == Operator.OR);
            queryBuilder.f22303h = operator2;
        } else {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f22301f = j11;
        }
        queryBuilder.f22302g = j11;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public QueryBuilder m19013g(Property property, String str) {
        m19014i();
        m19012f(nativeEqual(this.f22300e, property.m18981a(), str, false));
        return this;
    }

    /* renamed from: i */
    public final void m19014i() {
        if (this.f22300e == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    /* renamed from: j */
    public final void m19015j() {
        if (this.f22306k) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }
}

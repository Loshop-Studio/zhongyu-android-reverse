package io.objectbox.query;

import io.objectbox.Property;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.util.Comparator;
import java.util.List;
import p026b8.C5206a;

/* loaded from: classes5.dex */
public class QueryBuilder<T> implements Closeable {

    /* renamed from: a */
    public final C5206a f14039a;

    /* renamed from: b */
    public final long f14040b;

    /* renamed from: c */
    public long f14041c;

    /* renamed from: d */
    public long f14042d;

    /* renamed from: e */
    public long f14043e;

    /* renamed from: f */
    public Operator f14044f = Operator.NONE;

    /* renamed from: g */
    public List f14045g;

    /* renamed from: h */
    public Comparator f14046h;

    /* renamed from: i */
    public final boolean f14047i;

    public enum Operator {
        NONE,
        AND,
        OR
    }

    public QueryBuilder(C5206a c5206a, long j9, String str) {
        this.f14039a = c5206a;
        this.f14040b = j9;
        long jNativeCreate = nativeCreate(j9, str);
        this.f14041c = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
        this.f14047i = false;
    }

    private native long nativeBetween(long j9, int i9, double d10, double d11);

    private native long nativeBetween(long j9, int i9, long j10, long j11);

    private native long nativeBuild(long j9);

    private native long nativeCombine(long j9, long j10, long j11, boolean z9);

    private native long nativeContains(long j9, int i9, String str, boolean z9);

    private native long nativeCreate(long j9, String str);

    private native void nativeDestroy(long j9);

    private native long nativeEndsWith(long j9, int i9, String str, boolean z9);

    private native long nativeEqual(long j9, int i9, long j10);

    private native long nativeEqual(long j9, int i9, String str, boolean z9);

    private native long nativeEqual(long j9, int i9, byte[] bArr);

    private native long nativeGreater(long j9, int i9, double d10, boolean z9);

    private native long nativeGreater(long j9, int i9, long j10, boolean z9);

    private native long nativeGreater(long j9, int i9, String str, boolean z9, boolean z10);

    private native long nativeGreater(long j9, int i9, byte[] bArr, boolean z9);

    private native long nativeIn(long j9, int i9, int[] iArr, boolean z9);

    private native long nativeIn(long j9, int i9, long[] jArr, boolean z9);

    private native long nativeIn(long j9, int i9, String[] strArr, boolean z9);

    private native long nativeLess(long j9, int i9, double d10, boolean z9);

    private native long nativeLess(long j9, int i9, long j10, boolean z9);

    private native long nativeLess(long j9, int i9, String str, boolean z9, boolean z10);

    private native long nativeLess(long j9, int i9, byte[] bArr, boolean z9);

    private native long nativeLink(long j9, long j10, int i9, int i10, int i11, int i12, boolean z9);

    private native long nativeNotEqual(long j9, int i9, long j10);

    private native long nativeNotEqual(long j9, int i9, String str, boolean z9);

    private native long nativeNotNull(long j9, int i9);

    private native long nativeNull(long j9, int i9);

    private native void nativeOrder(long j9, int i9, int i10);

    private native void nativeSetParameterAlias(long j9, String str);

    private native long nativeStartsWith(long j9, int i9, String str, boolean z9);

    /* renamed from: a */
    public Query m13158a() {
        m13162i();
        m13161h();
        if (this.f14044f != Operator.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(this.f14041c);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f14039a, jNativeBuild, this.f14045g, null, this.f14046h);
        close();
        return query;
    }

    /* renamed from: c */
    public final void m13159c(long j9) {
        QueryBuilder<T> queryBuilder;
        long j10;
        Operator operator = this.f14044f;
        Operator operator2 = Operator.NONE;
        if (operator != operator2) {
            queryBuilder = this;
            j10 = j9;
            queryBuilder.f14042d = queryBuilder.nativeCombine(this.f14041c, this.f14042d, j10, operator == Operator.OR);
            queryBuilder.f14044f = operator2;
        } else {
            queryBuilder = this;
            j10 = j9;
            queryBuilder.f14042d = j10;
        }
        queryBuilder.f14043e = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j9 = this.f14041c;
        if (j9 != 0) {
            this.f14041c = 0L;
            if (!this.f14047i) {
                nativeDestroy(j9);
            }
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public QueryBuilder m13160g(Property property, String str) {
        m13161h();
        m13159c(nativeEqual(this.f14041c, property.m13128a(), str, false));
        return this;
    }

    /* renamed from: h */
    public final void m13161h() {
        if (this.f14041c == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    /* renamed from: i */
    public final void m13162i() {
        if (this.f14047i) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }
}

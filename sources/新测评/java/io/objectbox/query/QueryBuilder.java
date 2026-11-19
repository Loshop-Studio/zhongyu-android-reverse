package io.objectbox.query;

import io.objectbox.Property;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.util.Comparator;
import java.util.List;
import p214q8.C8980a;

/* loaded from: classes5.dex */
public class QueryBuilder<T> implements Closeable {

    /* renamed from: a */
    public final C8980a f13225a;

    /* renamed from: b */
    public final long f13226b;

    /* renamed from: c */
    public long f13227c;

    /* renamed from: d */
    public long f13228d;

    /* renamed from: e */
    public long f13229e;

    /* renamed from: f */
    public Operator f13230f = Operator.NONE;

    /* renamed from: g */
    public List f13231g;

    /* renamed from: h */
    public Comparator f13232h;

    /* renamed from: i */
    public final boolean f13233i;

    public enum Operator {
        NONE,
        AND,
        OR
    }

    public QueryBuilder(C8980a c8980a, long j10, String str) {
        this.f13225a = c8980a;
        this.f13226b = j10;
        long jNativeCreate = nativeCreate(j10, str);
        this.f13227c = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
        this.f13233i = false;
    }

    private native long nativeBetween(long j10, int i10, double d10, double d11);

    private native long nativeBetween(long j10, int i10, long j11, long j12);

    private native long nativeBuild(long j10);

    private native long nativeCombine(long j10, long j11, long j12, boolean z9);

    private native long nativeContains(long j10, int i10, String str, boolean z9);

    private native long nativeCreate(long j10, String str);

    private native void nativeDestroy(long j10);

    private native long nativeEndsWith(long j10, int i10, String str, boolean z9);

    private native long nativeEqual(long j10, int i10, long j11);

    private native long nativeEqual(long j10, int i10, String str, boolean z9);

    private native long nativeEqual(long j10, int i10, byte[] bArr);

    private native long nativeGreater(long j10, int i10, double d10, boolean z9);

    private native long nativeGreater(long j10, int i10, long j11, boolean z9);

    private native long nativeGreater(long j10, int i10, String str, boolean z9, boolean z10);

    private native long nativeGreater(long j10, int i10, byte[] bArr, boolean z9);

    private native long nativeIn(long j10, int i10, int[] iArr, boolean z9);

    private native long nativeIn(long j10, int i10, long[] jArr, boolean z9);

    private native long nativeIn(long j10, int i10, String[] strArr, boolean z9);

    private native long nativeLess(long j10, int i10, double d10, boolean z9);

    private native long nativeLess(long j10, int i10, long j11, boolean z9);

    private native long nativeLess(long j10, int i10, String str, boolean z9, boolean z10);

    private native long nativeLess(long j10, int i10, byte[] bArr, boolean z9);

    private native long nativeLink(long j10, long j11, int i10, int i11, int i12, int i13, boolean z9);

    private native long nativeNotEqual(long j10, int i10, long j11);

    private native long nativeNotEqual(long j10, int i10, String str, boolean z9);

    private native long nativeNotNull(long j10, int i10);

    private native long nativeNull(long j10, int i10);

    private native void nativeOrder(long j10, int i10, int i11);

    private native void nativeSetParameterAlias(long j10, String str);

    private native long nativeStartsWith(long j10, int i10, String str, boolean z9);

    /* renamed from: a */
    public Query m13039a() {
        m13043i();
        m13042h();
        if (this.f13230f != Operator.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(this.f13227c);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f13225a, jNativeBuild, this.f13231g, null, this.f13232h);
        close();
        return query;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f13227c;
        if (j10 != 0) {
            this.f13227c = 0L;
            if (!this.f13233i) {
                nativeDestroy(j10);
            }
        }
    }

    /* renamed from: f */
    public final void m13040f(long j10) {
        QueryBuilder<T> queryBuilder;
        long j11;
        Operator operator = this.f13230f;
        Operator operator2 = Operator.NONE;
        if (operator != operator2) {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f13228d = queryBuilder.nativeCombine(this.f13227c, this.f13228d, j11, operator == Operator.OR);
            queryBuilder.f13230f = operator2;
        } else {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f13228d = j11;
        }
        queryBuilder.f13229e = j11;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public QueryBuilder m13041g(Property property, String str) {
        m13042h();
        m13040f(nativeEqual(this.f13227c, property.m13008a(), str, false));
        return this;
    }

    /* renamed from: h */
    public final void m13042h() {
        if (this.f13227c == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    /* renamed from: i */
    public final void m13043i() {
        if (this.f13233i) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }
}

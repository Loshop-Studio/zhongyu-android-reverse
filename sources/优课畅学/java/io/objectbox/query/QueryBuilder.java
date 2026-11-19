package io.objectbox.query;

import io.objectbox.C8957a;
import io.objectbox.Property;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
public class QueryBuilder<T> implements Closeable {

    /* renamed from: a */
    public final C8957a f16970a;

    /* renamed from: b */
    public final long f16971b;

    /* renamed from: c */
    public long f16972c;

    /* renamed from: d */
    public long f16973d;

    /* renamed from: e */
    public long f16974e;

    /* renamed from: f */
    public Operator f16975f = Operator.NONE;

    /* renamed from: g */
    public List f16976g;

    /* renamed from: h */
    public Comparator f16977h;

    /* renamed from: i */
    public final boolean f16978i;

    public enum Operator {
        NONE,
        AND,
        OR
    }

    public QueryBuilder(C8957a c8957a, long j10, String str) {
        this.f16970a = c8957a;
        this.f16971b = j10;
        long jNativeCreate = nativeCreate(j10, str);
        this.f16972c = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
        this.f16978i = false;
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

    /* renamed from: a */
    public Query m15486a() {
        m15490e();
        m15489d();
        if (this.f16975f != Operator.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(this.f16972c);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f16970a, jNativeBuild, this.f16976g, null, this.f16977h);
        close();
        return query;
    }

    /* renamed from: b */
    public final void m15487b(long j10) {
        QueryBuilder<T> queryBuilder;
        long j11;
        Operator operator = this.f16975f;
        Operator operator2 = Operator.NONE;
        if (operator != operator2) {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f16973d = queryBuilder.nativeCombine(this.f16972c, this.f16973d, j11, operator == Operator.OR);
            queryBuilder.f16975f = operator2;
        } else {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f16973d = j11;
        }
        queryBuilder.f16974e = j11;
    }

    /* renamed from: c */
    public QueryBuilder m15488c(Property property, String str) {
        m15489d();
        m15487b(nativeEqual(this.f16972c, property.m15390a(), str, false));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f16972c;
        if (j10 != 0) {
            this.f16972c = 0L;
            if (!this.f16978i) {
                nativeDestroy(j10);
            }
        }
    }

    /* renamed from: d */
    public final void m15489d() {
        if (this.f16972c == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    /* renamed from: e */
    public final void m15490e() {
        if (this.f16978i) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}

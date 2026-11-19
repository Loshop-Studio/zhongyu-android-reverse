package io.objectbox.query;

import com.blankj.utilcode.util.AbstractC5379p;
import io.objectbox.AbstractC8961d;
import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;
import p189n6.InterfaceC9428a;
import p211p6.AbstractC9750a;
import p211p6.C9759j;
import p211p6.InterfaceC9755f;
import p222q6.C9840g;

/* loaded from: classes5.dex */
public class Query<T> implements Closeable {

    /* renamed from: a */
    public final C8957a f16963a;

    /* renamed from: b */
    public final BoxStore f16964b;

    /* renamed from: c */
    public final C9759j f16965c;

    /* renamed from: d */
    public final List f16966d;

    /* renamed from: e */
    public final Comparator f16967e;

    /* renamed from: f */
    public final int f16968f;

    /* renamed from: g */
    public long f16969g;

    public Query(C8957a c8957a, long j10, List list, InterfaceC9755f interfaceC9755f, Comparator comparator) {
        this.f16963a = c8957a;
        BoxStore boxStoreM15409g = c8957a.m15409g();
        this.f16964b = boxStoreM15409g;
        this.f16968f = boxStoreM15409g.m15386w();
        this.f16969g = j10;
        this.f16965c = new C9759j(this, c8957a);
        this.f16966d = list;
        this.f16967e = comparator;
    }

    /* renamed from: a */
    public static /* synthetic */ List m15469a(Query query, long j10, long j11) {
        List<T> listNativeFind = query.nativeFind(query.f16969g, query.m15474f(), j10, j11);
        query.m15484p(listNativeFind);
        return listNativeFind;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m15470b(Query query) {
        Object objNativeFindUnique = query.nativeFindUnique(query.f16969g, query.m15474f());
        query.m15481m(objNativeFindUnique);
        return objNativeFindUnique;
    }

    /* renamed from: d */
    public static /* synthetic */ List m15472d(Query query) {
        List<T> listNativeFind = query.nativeFind(query.f16969g, query.m15474f(), 0L, 0L);
        query.m15484p(listNativeFind);
        Comparator comparator = query.f16967e;
        if (comparator != null) {
            Collections.sort(listNativeFind, comparator);
        }
        return listNativeFind;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f16969g;
        if (j10 != 0) {
            this.f16969g = 0L;
            nativeDestroy(j10);
        }
    }

    public long count() {
        m15476h();
        return ((Long) this.f16963a.m15411i(new InterfaceC9428a() { // from class: p6.c
            @Override // p189n6.InterfaceC9428a
            /* renamed from: a */
            public final Object mo17283a(long j10) {
                Query query = this.f19470a;
                return Long.valueOf(query.nativeCount(query.f16969g, j10));
            }
        })).longValue();
    }

    /* renamed from: e */
    public Object m15473e(Callable callable) {
        return this.f16964b.m15372f(callable, this.f16968f, 10, true);
    }

    /* renamed from: f */
    public long m15474f() {
        return AbstractC8961d.m15439a(this.f16963a);
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public final void m15475g() {
        if (this.f16967e != null) {
            throw new UnsupportedOperationException("Does not work with a sorting comparator. Only find() supports sorting with a comparator.");
        }
    }

    /* renamed from: h */
    public final void m15476h() {
    }

    /* renamed from: i */
    public final void m15477i() {
        m15476h();
        m15475g();
    }

    /* renamed from: j */
    public List m15478j() {
        return (List) m15473e(new Callable() { // from class: p6.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m15472d(this.f19472a);
            }
        });
    }

    /* renamed from: k */
    public List m15479k(final long j10, final long j11) {
        m15477i();
        return (List) m15473e(new Callable() { // from class: p6.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m15469a(this.f19467a, j10, j11);
            }
        });
    }

    /* renamed from: l */
    public Object m15480l() {
        m15476h();
        return m15473e(new Callable() { // from class: p6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m15470b(this.f19471a);
            }
        });
    }

    /* renamed from: m */
    public void m15481m(Object obj) {
        List list = this.f16966d;
        if (list == null || obj == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            m15482n(obj, null);
        }
    }

    /* renamed from: n */
    public void m15482n(Object obj, AbstractC9750a abstractC9750a) {
        if (this.f16966d != null) {
            throw null;
        }
    }

    public native long nativeCount(long j10, long j11);

    public native String nativeDescribeParameters(long j10);

    public native void nativeDestroy(long j10);

    public native List<T> nativeFind(long j10, long j11, long j12, long j13);

    public native Object nativeFindFirst(long j10, long j11);

    public native long[] nativeFindIds(long j10, long j11, long j12, long j13);

    public native Object nativeFindUnique(long j10, long j11);

    public native long nativeRemove(long j10, long j11);

    public native void nativeSetParameter(long j10, int i10, int i11, @Nullable String str, double d10);

    public native void nativeSetParameter(long j10, int i10, int i11, @Nullable String str, long j11);

    public native void nativeSetParameter(long j10, int i10, int i11, @Nullable String str, String str2);

    public native void nativeSetParameter(long j10, int i10, int i11, @Nullable String str, byte[] bArr);

    public native void nativeSetParameters(long j10, int i10, int i11, @Nullable String str, double d10, double d11);

    public native void nativeSetParameters(long j10, int i10, int i11, @Nullable String str, long j11, long j12);

    public native void nativeSetParameters(long j10, int i10, int i11, @Nullable String str, int[] iArr);

    public native void nativeSetParameters(long j10, int i10, int i11, @Nullable String str, long[] jArr);

    public native void nativeSetParameters(long j10, int i10, int i11, @Nullable String str, String[] strArr);

    public native String nativeToString(long j10);

    /* renamed from: o */
    public void m15483o(Object obj, int i10) {
        Iterator it = this.f16966d.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            throw null;
        }
    }

    /* renamed from: p */
    public void m15484p(List list) {
        if (this.f16966d != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                m15483o(it.next(), i10);
                i10++;
            }
        }
    }

    /* renamed from: q */
    public C9840g m15485q() {
        return new C9840g(this.f16965c, null, this.f16963a.m15409g().m15388y());
    }
}

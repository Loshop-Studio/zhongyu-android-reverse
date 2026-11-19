package io.objectbox.query;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import mc.AbstractC10250a;
import mc.C10259j;
import mc.InterfaceC10255f;
import nc.C10394g;
import p210jc.AbstractC9713d;
import p210jc.C9710a;
import p212k.AbstractC9764r;
import p225kc.InterfaceC9908a;

/* loaded from: classes6.dex */
public class Query<T> implements Closeable {

    /* renamed from: c */
    public final C9710a f22291c;

    /* renamed from: d */
    public final BoxStore f22292d;

    /* renamed from: e */
    public final C10259j f22293e;

    /* renamed from: f */
    public final List f22294f;

    /* renamed from: g */
    public final Comparator f22295g;

    /* renamed from: h */
    public final int f22296h;

    /* renamed from: i */
    public long f22297i;

    public Query(C9710a c9710a, long j10, List list, InterfaceC10255f interfaceC10255f, Comparator comparator) {
        this.f22291c = c9710a;
        BoxStore boxStoreM19222h = c9710a.m19222h();
        this.f22292d = boxStoreM19222h;
        this.f22296h = boxStoreM19222h.m18942C();
        this.f22297i = j10;
        this.f22293e = new C10259j(this, c9710a);
        this.f22294f = list;
        this.f22295g = comparator;
    }

    /* renamed from: a */
    public static /* synthetic */ List m18994a(Query query, long j10, long j11) {
        List<T> listNativeFind = query.nativeFind(query.f22297i, query.m18999g(), j10, j11);
        query.m19009t(listNativeFind);
        return listNativeFind;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m18995c(Query query) {
        Object objNativeFindUnique = query.nativeFindUnique(query.f22297i, query.m18999g());
        query.m19006p(objNativeFindUnique);
        return objNativeFindUnique;
    }

    /* renamed from: e */
    public static /* synthetic */ List m18997e(Query query) {
        List<T> listNativeFind = query.nativeFind(query.f22297i, query.m18999g(), 0L, 0L);
        query.m19009t(listNativeFind);
        Comparator comparator = query.f22295g;
        if (comparator != null) {
            Collections.sort(listNativeFind, comparator);
        }
        return listNativeFind;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f22297i;
        if (j10 != 0) {
            this.f22297i = 0L;
            nativeDestroy(j10);
        }
    }

    public long count() {
        m19001j();
        return ((Long) this.f22291c.m19224j(new InterfaceC9908a() { // from class: mc.c
            @Override // p225kc.InterfaceC9908a
            /* renamed from: a */
            public final Object mo19980a(long j10) {
                Query query = this.f24366a;
                return Long.valueOf(query.nativeCount(query.f22297i, j10));
            }
        })).longValue();
    }

    /* renamed from: f */
    public Object m18998f(Callable callable) {
        return this.f22292d.m18956j(callable, this.f22296h, 10, true);
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public long m18999g() {
        return AbstractC9713d.m19249a(this.f22291c);
    }

    /* renamed from: i */
    public final void m19000i() {
        if (this.f22295g != null) {
            throw new UnsupportedOperationException("Does not work with a sorting comparator. Only find() supports sorting with a comparator.");
        }
    }

    /* renamed from: j */
    public final void m19001j() {
    }

    /* renamed from: k */
    public final void m19002k() {
        m19001j();
        m19000i();
    }

    /* renamed from: l */
    public List m19003l() {
        return (List) m18998f(new Callable() { // from class: mc.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m18997e(this.f24368a);
            }
        });
    }

    /* renamed from: m */
    public List m19004m(final long j10, final long j11) {
        m19002k();
        return (List) m18998f(new Callable() { // from class: mc.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m18994a(this.f24363a, j10, j11);
            }
        });
    }

    /* renamed from: n */
    public Object m19005n() {
        m19001j();
        return m18998f(new Callable() { // from class: mc.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m18995c(this.f24367a);
            }
        });
    }

    public native long nativeCount(long j10, long j11);

    public native String nativeDescribeParameters(long j10);

    public native void nativeDestroy(long j10);

    public native List<T> nativeFind(long j10, long j11, long j12, long j13);

    public native Object nativeFindFirst(long j10, long j11);

    public native long[] nativeFindIds(long j10, long j11, long j12, long j13);

    public native Object nativeFindUnique(long j10, long j11);

    public native long nativeRemove(long j10, long j11);

    public native void nativeSetParameter(long j10, int i10, int i11, String str, double d10);

    public native void nativeSetParameter(long j10, int i10, int i11, String str, long j11);

    public native void nativeSetParameter(long j10, int i10, int i11, String str, String str2);

    public native void nativeSetParameter(long j10, int i10, int i11, String str, byte[] bArr);

    public native void nativeSetParameters(long j10, int i10, int i11, String str, double d10, double d11);

    public native void nativeSetParameters(long j10, int i10, int i11, String str, long j11, long j12);

    public native void nativeSetParameters(long j10, int i10, int i11, String str, int[] iArr);

    public native void nativeSetParameters(long j10, int i10, int i11, String str, long[] jArr);

    public native void nativeSetParameters(long j10, int i10, int i11, String str, String[] strArr);

    public native String nativeToString(long j10);

    /* renamed from: p */
    public void m19006p(Object obj) {
        List list = this.f22294f;
        if (list == null || obj == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            m19007r(obj, null);
        }
    }

    /* renamed from: r */
    public void m19007r(Object obj, AbstractC10250a abstractC10250a) {
        if (this.f22294f != null) {
            throw null;
        }
    }

    /* renamed from: s */
    public void m19008s(Object obj, int i10) {
        Iterator it = this.f22294f.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
    }

    /* renamed from: t */
    public void m19009t(List list) {
        if (this.f22294f != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                m19008s(it.next(), i10);
                i10++;
            }
        }
    }

    /* renamed from: u */
    public C10394g m19010u() {
        return new C10394g(this.f22293e, null, this.f22291c.m19222h().m18944E());
    }
}

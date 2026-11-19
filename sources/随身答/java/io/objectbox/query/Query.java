package io.objectbox.query;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p026b8.AbstractC5209d;
import p026b8.C5206a;
import p037c8.InterfaceC5266a;
import p098e8.AbstractC7883a;
import p098e8.C7892j;
import p098e8.InterfaceC7888f;
import p109f8.C7954g;
import p217q.AbstractC9343a;

/* loaded from: classes5.dex */
public class Query<T> implements Closeable {

    /* renamed from: a */
    public final C5206a f14032a;

    /* renamed from: b */
    public final BoxStore f14033b;

    /* renamed from: c */
    public final C7892j f14034c;

    /* renamed from: d */
    public final List f14035d;

    /* renamed from: e */
    public final Comparator f14036e;

    /* renamed from: f */
    public final int f14037f;

    /* renamed from: g */
    public long f14038g;

    public Query(C5206a c5206a, long j9, List list, InterfaceC7888f interfaceC7888f, Comparator comparator) {
        this.f14032a = c5206a;
        BoxStore boxStoreM2250g = c5206a.m2250g();
        this.f14033b = boxStoreM2250g;
        this.f14037f = boxStoreM2250g.m13089A();
        this.f14038g = j9;
        this.f14034c = new C7892j(this, c5206a);
        this.f14035d = list;
        this.f14036e = comparator;
    }

    /* renamed from: a */
    public static /* synthetic */ List m13141a(Query query, long j9, long j10) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f14038g, query.m13146j(), j9, j10);
        query.m13156t(listNativeFind);
        return listNativeFind;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m13142c(Query query) {
        Object objNativeFindUnique = query.nativeFindUnique(query.f14038g, query.m13146j());
        query.m13153q(objNativeFindUnique);
        return objNativeFindUnique;
    }

    /* renamed from: h */
    public static /* synthetic */ List m13144h(Query query) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f14038g, query.m13146j(), 0L, 0L);
        query.m13156t(listNativeFind);
        Comparator comparator = query.f14036e;
        if (comparator != null) {
            Collections.sort(listNativeFind, comparator);
        }
        return listNativeFind;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j9 = this.f14038g;
        if (j9 != 0) {
            this.f14038g = 0L;
            nativeDestroy(j9);
        }
    }

    public long count() {
        m13148l();
        return ((Long) this.f14032a.m2252i(new InterfaceC5266a() { // from class: e8.c
            @Override // p037c8.InterfaceC5266a
            /* renamed from: a */
            public final Object mo2404a(long j9) {
                Query query = this.f13258a;
                return Long.valueOf(query.nativeCount(query.f14038g, j9));
            }
        })).longValue();
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: i */
    public Object m13145i(Callable callable) {
        return this.f14033b.m13103j(callable, this.f14037f, 10, true);
    }

    /* renamed from: j */
    public long m13146j() {
        return AbstractC5209d.m2276a(this.f14032a);
    }

    /* renamed from: k */
    public final void m13147k() {
        if (this.f14036e != null) {
            throw new UnsupportedOperationException("Does not work with a sorting comparator. Only find() supports sorting with a comparator.");
        }
    }

    /* renamed from: l */
    public final void m13148l() {
    }

    /* renamed from: m */
    public final void m13149m() {
        m13148l();
        m13147k();
    }

    /* renamed from: n */
    public List m13150n() {
        return (List) m13145i(new Callable() { // from class: e8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13144h(this.f13260a);
            }
        });
    }

    public native long nativeCount(long j9, long j10);

    public native String nativeDescribeParameters(long j9);

    public native void nativeDestroy(long j9);

    public native List<T> nativeFind(long j9, long j10, long j11, long j12) throws Exception;

    public native Object nativeFindFirst(long j9, long j10);

    public native long[] nativeFindIds(long j9, long j10, long j11, long j12);

    public native Object nativeFindUnique(long j9, long j10);

    public native long nativeRemove(long j9, long j10);

    public native void nativeSetParameter(long j9, int i9, int i10, String str, double d10);

    public native void nativeSetParameter(long j9, int i9, int i10, String str, long j10);

    public native void nativeSetParameter(long j9, int i9, int i10, String str, String str2);

    public native void nativeSetParameter(long j9, int i9, int i10, String str, byte[] bArr);

    public native void nativeSetParameters(long j9, int i9, int i10, String str, double d10, double d11);

    public native void nativeSetParameters(long j9, int i9, int i10, String str, long j10, long j11);

    public native void nativeSetParameters(long j9, int i9, int i10, String str, int[] iArr);

    public native void nativeSetParameters(long j9, int i9, int i10, String str, long[] jArr);

    public native void nativeSetParameters(long j9, int i9, int i10, String str, String[] strArr);

    public native String nativeToString(long j9);

    /* renamed from: o */
    public List m13151o(final long j9, final long j10) {
        m13149m();
        return (List) m13145i(new Callable() { // from class: e8.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13141a(this.f13255a, j9, j10);
            }
        });
    }

    /* renamed from: p */
    public Object m13152p() {
        m13148l();
        return m13145i(new Callable() { // from class: e8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13142c(this.f13259a);
            }
        });
    }

    /* renamed from: q */
    public void m13153q(Object obj) {
        List list = this.f14035d;
        if (list == null || obj == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC9343a.m15285a(it.next());
            m13154r(obj, null);
        }
    }

    /* renamed from: r */
    public void m13154r(Object obj, AbstractC7883a abstractC7883a) {
        if (this.f14035d != null) {
            throw null;
        }
    }

    /* renamed from: s */
    public void m13155s(Object obj, int i9) {
        Iterator it = this.f14035d.iterator();
        if (it.hasNext()) {
            AbstractC9343a.m15285a(it.next());
            throw null;
        }
    }

    /* renamed from: t */
    public void m13156t(List list) {
        if (this.f14035d != null) {
            Iterator it = list.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                m13155s(it.next(), i9);
                i9++;
            }
        }
    }

    /* renamed from: u */
    public C7954g m13157u() {
        return new C7954g(this.f14034c, null, this.f14032a.m2250g().m13091C());
    }
}

package io.objectbox.query;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p137k.AbstractC7846r;
import p214q8.AbstractC8983d;
import p214q8.C8980a;
import p225r8.InterfaceC9046a;
import p247t8.AbstractC9494a;
import p247t8.C9503j;
import p247t8.InterfaceC9499f;
import p258u8.C9595g;

/* loaded from: classes5.dex */
public class Query<T> implements Closeable {

    /* renamed from: a */
    public final C8980a f13218a;

    /* renamed from: b */
    public final BoxStore f13219b;

    /* renamed from: c */
    public final C9503j f13220c;

    /* renamed from: d */
    public final List f13221d;

    /* renamed from: e */
    public final Comparator f13222e;

    /* renamed from: f */
    public final int f13223f;

    /* renamed from: g */
    public long f13224g;

    public Query(C8980a c8980a, long j10, List list, InterfaceC9499f interfaceC9499f, Comparator comparator) {
        this.f13218a = c8980a;
        BoxStore boxStoreM15040g = c8980a.m15040g();
        this.f13219b = boxStoreM15040g;
        this.f13223f = boxStoreM15040g.m12969A();
        this.f13224g = j10;
        this.f13220c = new C9503j(this, c8980a);
        this.f13221d = list;
        this.f13222e = comparator;
    }

    /* renamed from: a */
    public static /* synthetic */ List m13022a(Query query, long j10, long j11) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f13224g, query.m13027j(), j10, j11);
        query.m13037t(listNativeFind);
        return listNativeFind;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m13023f(Query query) {
        Object objNativeFindUnique = query.nativeFindUnique(query.f13224g, query.m13027j());
        query.m13034q(objNativeFindUnique);
        return objNativeFindUnique;
    }

    /* renamed from: h */
    public static /* synthetic */ List m13025h(Query query) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f13224g, query.m13027j(), 0L, 0L);
        query.m13037t(listNativeFind);
        Comparator comparator = query.f13222e;
        if (comparator != null) {
            Collections.sort(listNativeFind, comparator);
        }
        return listNativeFind;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j10 = this.f13224g;
        if (j10 != 0) {
            this.f13224g = 0L;
            nativeDestroy(j10);
        }
    }

    public long count() {
        m13029l();
        return ((Long) this.f13218a.m15042i(new InterfaceC9046a() { // from class: t8.c
            @Override // p225r8.InterfaceC9046a
            /* renamed from: a */
            public final Object mo15197a(long j10) {
                Query query = this.f16591a;
                return Long.valueOf(query.nativeCount(query.f13224g, j10));
            }
        })).longValue();
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: i */
    public Object m13026i(Callable callable) {
        return this.f13219b.m12983j(callable, this.f13223f, 10, true);
    }

    /* renamed from: j */
    public long m13027j() {
        return AbstractC8983d.m15065a(this.f13218a);
    }

    /* renamed from: k */
    public final void m13028k() {
        if (this.f13222e != null) {
            throw new UnsupportedOperationException("Does not work with a sorting comparator. Only find() supports sorting with a comparator.");
        }
    }

    /* renamed from: l */
    public final void m13029l() {
    }

    /* renamed from: m */
    public final void m13030m() {
        m13029l();
        m13028k();
    }

    /* renamed from: n */
    public List m13031n() {
        return (List) m13026i(new Callable() { // from class: t8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13025h(this.f16593a);
            }
        });
    }

    public native long nativeCount(long j10, long j11);

    public native String nativeDescribeParameters(long j10);

    public native void nativeDestroy(long j10);

    public native List<T> nativeFind(long j10, long j11, long j12, long j13) throws Exception;

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

    /* renamed from: o */
    public List m13032o(final long j10, final long j11) {
        m13030m();
        return (List) m13026i(new Callable() { // from class: t8.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13022a(this.f16588a, j10, j11);
            }
        });
    }

    /* renamed from: p */
    public Object m13033p() {
        m13029l();
        return m13026i(new Callable() { // from class: t8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.m13023f(this.f16592a);
            }
        });
    }

    /* renamed from: q */
    public void m13034q(Object obj) {
        List list = this.f13221d;
        if (list == null || obj == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            m13035r(obj, null);
        }
    }

    /* renamed from: r */
    public void m13035r(Object obj, AbstractC9494a abstractC9494a) {
        if (this.f13221d != null) {
            throw null;
        }
    }

    /* renamed from: s */
    public void m13036s(Object obj, int i10) {
        Iterator it = this.f13221d.iterator();
        if (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            throw null;
        }
    }

    /* renamed from: t */
    public void m13037t(List list) {
        if (this.f13221d != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                m13036s(it.next(), i10);
                i10++;
            }
        }
    }

    /* renamed from: u */
    public C9595g m13038u() {
        return new C9595g(this.f13220c, null, this.f13218a.m15040g().m12971C());
    }
}

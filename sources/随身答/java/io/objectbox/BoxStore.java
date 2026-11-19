package io.objectbox;

import io.objectbox.BoxStore;
import io.objectbox.converter.PropertyConverter;
import io.objectbox.exception.DbException;
import io.objectbox.exception.DbExceptionListener;
import io.objectbox.exception.DbSchemaException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p026b8.C5206a;
import p026b8.C5208c;
import p026b8.RunnableC5212g;
import p037c8.AbstractC5269d;
import p037c8.C5270e;
import p109f8.C7954g;
import p120g8.InterfaceC8079a;
import p306y8.C9970b;

/* loaded from: classes5.dex */
public class BoxStore implements Closeable {

    /* renamed from: w */
    public static Object f13968w;

    /* renamed from: x */
    public static Object f13969x;

    /* renamed from: y */
    public static final Set f13970y = new HashSet();

    /* renamed from: z */
    public static volatile Thread f13971z;

    /* renamed from: a */
    public final File f13972a;

    /* renamed from: b */
    public final String f13973b;

    /* renamed from: c */
    public final long f13974c;

    /* renamed from: h */
    public final int[] f13979h;

    /* renamed from: l */
    public final RunnableC5212g f13983l;

    /* renamed from: m */
    public final boolean f13984m;

    /* renamed from: n */
    public final boolean f13985n;

    /* renamed from: o */
    public final boolean f13986o;

    /* renamed from: q */
    public boolean f13988q;

    /* renamed from: s */
    public volatile int f13990s;

    /* renamed from: t */
    public int f13991t;

    /* renamed from: u */
    public final int f13992u;

    /* renamed from: v */
    public InterfaceC8079a f13993v;

    /* renamed from: d */
    public final Map f13975d = new HashMap();

    /* renamed from: e */
    public final Map f13976e = new HashMap();

    /* renamed from: f */
    public final Map f13977f = new HashMap();

    /* renamed from: g */
    public final C9970b f13978g = new C9970b();

    /* renamed from: i */
    public final Map f13980i = new ConcurrentHashMap();

    /* renamed from: j */
    public final Set f13981j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    public final ExecutorService f13982k = new C5270e(this);

    /* renamed from: p */
    public final ThreadLocal f13987p = new ThreadLocal();

    /* renamed from: r */
    public final Object f13989r = new Object();

    public BoxStore(C5208c c5208c) {
        f13968w = c5208c.f2382f;
        f13969x = c5208c.f2383g;
        AbstractC5269d.m2408b();
        File file = c5208c.f2378b;
        this.f13972a = file;
        String strM13086r = m13086r(file);
        this.f13973b = strM13086r;
        m13084M(strM13086r);
        try {
            long jNativeCreateWithFlatOptions = nativeCreateWithFlatOptions(c5208c.m2271c(strM13086r), c5208c.f2377a);
            this.f13974c = jNativeCreateWithFlatOptions;
            if (jNativeCreateWithFlatOptions == 0) {
                throw new DbException("Could not create native store");
            }
            int i9 = c5208c.f2384h;
            if (i9 != 0) {
                this.f13984m = (i9 & 1) != 0;
                this.f13985n = (i9 & 2) != 0;
            } else {
                this.f13985n = false;
                this.f13984m = false;
            }
            this.f13986o = c5208c.f2386j;
            for (EntityInfo entityInfo : c5208c.f2395s) {
                try {
                    this.f13975d.put(entityInfo.mo7364f(), entityInfo.mo7368r());
                    int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f13974c, entityInfo.mo7368r(), entityInfo.mo7364f());
                    this.f13976e.put(entityInfo.mo7364f(), Integer.valueOf(iNativeRegisterEntityClass));
                    this.f13978g.m17247c(iNativeRegisterEntityClass, entityInfo.mo7364f());
                    this.f13977f.put(entityInfo.mo7364f(), entityInfo);
                    for (Property property : entityInfo.mo7363d()) {
                        Class cls = property.f14013j;
                        if (cls != null) {
                            Class cls2 = property.f14012i;
                            if (cls2 == null) {
                                throw new RuntimeException("No converter class for custom type of " + property);
                            }
                            nativeRegisterCustomType(this.f13974c, iNativeRegisterEntityClass, 0, property.f14011h, cls2, cls);
                        }
                    }
                } catch (RuntimeException e10) {
                    throw new RuntimeException("Could not setup up entity " + entityInfo.mo7364f(), e10);
                }
            }
            int iM17249e = this.f13978g.m17249e();
            this.f13979h = new int[iM17249e];
            long[] jArrM17246b = this.f13978g.m17246b();
            for (int i10 = 0; i10 < iM17249e; i10++) {
                this.f13979h[i10] = (int) jArrM17246b[i10];
            }
            this.f13983l = new RunnableC5212g(this);
            this.f13992u = Math.max(c5208c.f2389m, 1);
        } catch (RuntimeException e11) {
            close();
            throw e11;
        }
    }

    /* renamed from: E */
    public static boolean m13082E(final String str) throws InterruptedException {
        boolean zContains;
        Set set = f13970y;
        synchronized (set) {
            try {
                if (!set.contains(str)) {
                    return false;
                }
                Thread thread = f13971z;
                if (thread != null && thread.isAlive()) {
                    return m13083F(str, false);
                }
                Thread thread2 = new Thread(new Runnable() { // from class: b8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BoxStore.m13085a(str);
                    }
                });
                thread2.setDaemon(true);
                f13971z = thread2;
                thread2.start();
                try {
                    thread2.join(500L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                Set set2 = f13970y;
                synchronized (set2) {
                    zContains = set2.contains(str);
                }
                return zContains;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: F */
    public static boolean m13083F(String str, boolean z9) {
        boolean zContains;
        synchronized (f13970y) {
            int i9 = 0;
            while (i9 < 5) {
                try {
                    Set set = f13970y;
                    if (!set.contains(str)) {
                        break;
                    }
                    i9++;
                    System.gc();
                    if (z9 && i9 > 1) {
                        System.runFinalization();
                    }
                    System.gc();
                    if (z9 && i9 > 1) {
                        System.runFinalization();
                    }
                    try {
                        set.wait(100L);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zContains = f13970y.contains(str);
        }
        return zContains;
    }

    /* renamed from: M */
    public static void m13084M(String str) {
        Set set = f13970y;
        synchronized (set) {
            try {
                m13082E(str);
                if (!set.add(str)) {
                    throw new DbException("Another BoxStore is still open for this directory: " + str + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13085a(String str) {
        m13083F(str, true);
        f13971z = null;
    }

    public static native long nativeBeginReadTx(long j9);

    public static native long nativeBeginTx(long j9);

    public static native int nativeCleanStaleReadTransactions(long j9);

    public static native long nativeCreateWithFlatOptions(byte[] bArr, byte[] bArr2);

    public static native void nativeDelete(long j9);

    public static native String nativeDiagnose(long j9);

    public static native void nativeDropAllData(long j9);

    public static native int nativeGetSupportedSync();

    public static native String nativeGetVersion();

    public static native boolean nativeIsObjectBrowserAvailable();

    public static native boolean nativeIsReadOnly(long j9);

    public static native void nativeRegisterCustomType(long j9, int i9, int i10, String str, Class<? extends PropertyConverter> cls, Class<?> cls2);

    public static native int nativeRegisterEntityClass(long j9, String str, Class<?> cls);

    public static native void nativeSetDbExceptionListener(long j9, DbExceptionListener dbExceptionListener);

    public static native void nativeSetDebugFlags(long j9, int i9);

    private native String nativeStartObjectBrowser(long j9, String str, int i9);

    private native boolean nativeStopObjectBrowser(long j9);

    /* renamed from: r */
    public static String m13086r(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new DbException("Is not a directory: " + file.getAbsolutePath());
            }
        } else if (!file.mkdirs()) {
            throw new DbException("Could not create directory: " + file.getAbsolutePath());
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e10) {
            throw new DbException("Could not verify dir", e10);
        }
    }

    /* renamed from: s */
    public static synchronized Object m13087s() {
        return f13968w;
    }

    public static native void testUnalignedMemoryAccess();

    /* renamed from: x */
    public static synchronized Object m13088x() {
        return f13969x;
    }

    /* renamed from: A */
    public int m13089A() {
        return this.f13992u;
    }

    /* renamed from: B */
    public Future m13090B(Runnable runnable) {
        return this.f13982k.submit(runnable);
    }

    /* renamed from: C */
    public ExecutorService m13091C() {
        return this.f13982k;
    }

    /* renamed from: D */
    public boolean m13092D() {
        return this.f13986o;
    }

    /* renamed from: G */
    public void m13093G(Runnable runnable) {
        Transaction transaction = (Transaction) this.f13987p.get();
        if (transaction != null) {
            if (transaction.isReadOnly()) {
                throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
            }
            runnable.run();
            return;
        }
        Transaction transactionM13100g = m13100g();
        this.f13987p.set(transactionM13100g);
        try {
            runnable.run();
            transactionM13100g.m13133g();
        } finally {
            this.f13987p.remove();
            transactionM13100g.close();
        }
    }

    /* renamed from: H */
    public void m13094H(InterfaceC8079a interfaceC8079a) {
        this.f13993v = interfaceC8079a;
    }

    /* renamed from: I */
    public synchronized boolean m13095I() {
        if (this.f13991t == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.f13991t = 0;
        return nativeStopObjectBrowser(this.f13974c);
    }

    /* renamed from: J */
    public C7954g m13096J(Class cls) {
        return new C7954g(this.f13983l, cls, this.f13982k);
    }

    /* renamed from: K */
    public void m13097K(Transaction transaction, int[] iArr) {
        synchronized (this.f13989r) {
            try {
                this.f13990s++;
                if (this.f13985n) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("TX committed. New commit count: ");
                    sb.append(this.f13990s);
                    sb.append(", entity types affected: ");
                    sb.append(iArr != null ? iArr.length : 0);
                    printStream.println(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = this.f13980i.values().iterator();
        while (it.hasNext()) {
            ((C5206a) it.next()).m2264u(transaction);
        }
        if (iArr != null) {
            this.f13983l.m2304f(iArr);
        }
    }

    /* renamed from: L */
    public void m13098L(Transaction transaction) {
        synchronized (this.f13981j) {
            this.f13981j.remove(transaction);
        }
    }

    /* renamed from: c */
    public Transaction m13099c() {
        m13104k();
        int i9 = this.f13990s;
        if (this.f13984m) {
            System.out.println("Begin read TX with commit count " + i9);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(this.f13974c);
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i9);
        synchronized (this.f13981j) {
            this.f13981j.add(transaction);
        }
        return transaction;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z9;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z9 = this.f13988q;
                if (!z9) {
                    if (this.f13991t != 0) {
                        try {
                            m13095I();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.f13988q = true;
                    synchronized (this.f13981j) {
                        arrayList = new ArrayList(this.f13981j);
                    }
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((Transaction) obj).close();
                    }
                    long j9 = this.f13974c;
                    if (j9 != 0) {
                        nativeDelete(j9);
                    }
                    this.f13982k.shutdown();
                    m13105l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            return;
        }
        Set set = f13970y;
        synchronized (set) {
            set.remove(this.f13973b);
            set.notifyAll();
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public Transaction m13100g() {
        m13104k();
        int i9 = this.f13990s;
        if (this.f13985n) {
            System.out.println("Begin TX with commit count " + i9);
        }
        long jNativeBeginTx = nativeBeginTx(this.f13974c);
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i9);
        synchronized (this.f13981j) {
            this.f13981j.add(transaction);
        }
        return transaction;
    }

    /* renamed from: h */
    public C5206a m13101h(Class cls) {
        C5206a c5206a;
        C5206a c5206a2 = (C5206a) this.f13980i.get(cls);
        if (c5206a2 != null) {
            return c5206a2;
        }
        if (!this.f13975d.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f13980i) {
            try {
                c5206a = (C5206a) this.f13980i.get(cls);
                if (c5206a == null) {
                    c5206a = new C5206a(this, cls);
                    this.f13980i.put(cls, c5206a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5206a;
    }

    /* renamed from: i */
    public Object m13102i(Callable callable) {
        if (((Transaction) this.f13987p.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException("Callable threw exception", e10);
            }
        }
        Transaction transactionM13099c = m13099c();
        this.f13987p.set(transactionM13099c);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException("Callable threw exception", e12);
            }
        } finally {
            this.f13987p.remove();
            Iterator it = this.f13980i.values().iterator();
            while (it.hasNext()) {
                ((C5206a) it.next()).m2258o(transactionM13099c);
            }
            transactionM13099c.close();
        }
    }

    public boolean isClosed() {
        return this.f13988q;
    }

    /* renamed from: j */
    public Object m13103j(Callable callable, int i9, int i10, boolean z9) throws InterruptedException {
        if (i9 == 1) {
            return m13102i(callable);
        }
        if (i9 < 1) {
            throw new IllegalArgumentException("Illegal value of attempts: " + i9);
        }
        long j9 = i10;
        DbException e10 = null;
        for (int i11 = 1; i11 <= i9; i11++) {
            try {
                return m13102i(callable);
            } catch (DbException e11) {
                e10 = e11;
                String strM13108o = m13108o();
                String str = i11 + " of " + i9 + " attempts of calling a read TX failed:";
                if (z9) {
                    System.err.println(str);
                    e10.printStackTrace();
                    System.err.println(strM13108o);
                    System.err.flush();
                    System.gc();
                    System.runFinalization();
                    m13106m();
                }
                try {
                    Thread.sleep(j9);
                    j9 *= 2;
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
                    throw e10;
                }
            }
        }
        throw e10;
    }

    /* renamed from: k */
    public final void m13104k() {
        if (this.f13988q) {
            throw new IllegalStateException("Store is closed");
        }
    }

    /* renamed from: l */
    public final void m13105l() {
        try {
            if (this.f13982k.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            int iActiveCount = Thread.activeCount();
            System.err.println("Thread pool not terminated in time; printing stack traces...");
            Thread[] threadArr = new Thread[iActiveCount + 2];
            int iEnumerate = Thread.enumerate(threadArr);
            for (int i9 = 0; i9 < iEnumerate; i9++) {
                System.err.println("Thread: " + threadArr[i9].getName());
                Thread.dumpStack();
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: m */
    public int m13106m() {
        return nativeCleanStaleReadTransactions(this.f13974c);
    }

    /* renamed from: n */
    public void m13107n() {
        Iterator it = this.f13980i.values().iterator();
        while (it.hasNext()) {
            ((C5206a) it.next()).m2244a();
        }
    }

    public native long nativePanicModeRemoveAllObjects(long j9, int i9);

    public native long nativeSizeOnDisk(long j9);

    public native long nativeValidate(long j9, long j10, boolean z9);

    /* renamed from: o */
    public String m13108o() {
        return nativeDiagnose(this.f13974c);
    }

    /* renamed from: p */
    public Collection m13109p() {
        return this.f13975d.keySet();
    }

    /* renamed from: q */
    public int[] m13110q() {
        return this.f13979h;
    }

    /* renamed from: t */
    public String m13111t(Class cls) {
        return (String) this.f13975d.get(cls);
    }

    /* renamed from: u */
    public Class m13112u(int i9) {
        Class cls = (Class) this.f13978g.m17245a(i9);
        if (cls != null) {
            return cls;
        }
        throw new DbSchemaException("No entity registered for type ID " + i9);
    }

    /* renamed from: v */
    public EntityInfo m13113v(Class cls) {
        return (EntityInfo) this.f13977f.get(cls);
    }

    /* renamed from: w */
    public int m13114w(Class cls) {
        Integer num = (Integer) this.f13976e.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }

    /* renamed from: y */
    public InterfaceC8079a m13115y() {
        return this.f13993v;
    }

    /* renamed from: z */
    public long m13116z() {
        return this.f13974c;
    }
}

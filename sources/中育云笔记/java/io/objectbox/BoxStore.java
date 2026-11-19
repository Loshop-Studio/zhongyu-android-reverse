package io.objectbox;

import bf.C5201b;
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
import nc.C10394g;
import p210jc.C9710a;
import p210jc.C9712c;
import p210jc.RunnableC9716g;
import p225kc.AbstractC9911d;
import p225kc.C9912e;
import p279oc.InterfaceC10466a;

/* loaded from: classes6.dex */
public class BoxStore implements Closeable {

    /* renamed from: A */
    public static final Set f22227A = new HashSet();

    /* renamed from: B */
    public static volatile Thread f22228B;

    /* renamed from: y */
    public static Object f22229y;

    /* renamed from: z */
    public static Object f22230z;

    /* renamed from: c */
    public final File f22231c;

    /* renamed from: d */
    public final String f22232d;

    /* renamed from: e */
    public final long f22233e;

    /* renamed from: j */
    public final int[] f22238j;

    /* renamed from: n */
    public final RunnableC9716g f22242n;

    /* renamed from: o */
    public final boolean f22243o;

    /* renamed from: p */
    public final boolean f22244p;

    /* renamed from: q */
    public final boolean f22245q;

    /* renamed from: s */
    public boolean f22247s;

    /* renamed from: u */
    public volatile int f22249u;

    /* renamed from: v */
    public int f22250v;

    /* renamed from: w */
    public final int f22251w;

    /* renamed from: x */
    public InterfaceC10466a f22252x;

    /* renamed from: f */
    public final Map f22234f = new HashMap();

    /* renamed from: g */
    public final Map f22235g = new HashMap();

    /* renamed from: h */
    public final Map f22236h = new HashMap();

    /* renamed from: i */
    public final C5201b f22237i = new C5201b();

    /* renamed from: k */
    public final Map f22239k = new ConcurrentHashMap();

    /* renamed from: l */
    public final Set f22240l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m */
    public final ExecutorService f22241m = new C9912e(this);

    /* renamed from: r */
    public final ThreadLocal f22246r = new ThreadLocal();

    /* renamed from: t */
    public final Object f22248t = new Object();

    public BoxStore(C9712c c9712c) {
        f22229y = c9712c.f22610f;
        f22230z = c9712c.f22611g;
        AbstractC9911d.m19982b();
        File file = c9712c.f22606b;
        this.f22231c = file;
        String strM18937t = m18937t(file);
        this.f22232d = strM18937t;
        m18935O(strM18937t);
        try {
            long jNativeCreateWithFlatOptions = nativeCreateWithFlatOptions(c9712c.m19243c(strM18937t), c9712c.f22605a);
            this.f22233e = jNativeCreateWithFlatOptions;
            if (jNativeCreateWithFlatOptions == 0) {
                throw new DbException("Could not create native store");
            }
            int i10 = c9712c.f22612h;
            if (i10 != 0) {
                this.f22243o = (i10 & 1) != 0;
                this.f22244p = (i10 & 2) != 0;
            } else {
                this.f22244p = false;
                this.f22243o = false;
            }
            this.f22245q = c9712c.f22614j;
            for (EntityInfo entityInfo : c9712c.f22623s) {
                try {
                    this.f22234f.put(entityInfo.mo13994j(), entityInfo.mo13998x());
                    int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f22233e, entityInfo.mo13998x(), entityInfo.mo13994j());
                    this.f22235g.put(entityInfo.mo13994j(), Integer.valueOf(iNativeRegisterEntityClass));
                    this.f22237i.m2770c(iNativeRegisterEntityClass, entityInfo.mo13994j());
                    this.f22236h.put(entityInfo.mo13994j(), entityInfo);
                    for (Property property : entityInfo.mo13993h()) {
                        Class cls = property.f22272l;
                        if (cls != null) {
                            Class cls2 = property.f22271k;
                            if (cls2 == null) {
                                throw new RuntimeException("No converter class for custom type of " + property);
                            }
                            nativeRegisterCustomType(this.f22233e, iNativeRegisterEntityClass, 0, property.f22270j, cls2, cls);
                        }
                    }
                } catch (RuntimeException e10) {
                    throw new RuntimeException("Could not setup up entity " + entityInfo.mo13994j(), e10);
                }
            }
            int iM2772e = this.f22237i.m2772e();
            this.f22238j = new int[iM2772e];
            long[] jArrM2769b = this.f22237i.m2769b();
            for (int i11 = 0; i11 < iM2772e; i11++) {
                this.f22238j[i11] = (int) jArrM2769b[i11];
            }
            this.f22242n = new RunnableC9716g(this);
            this.f22251w = Math.max(c9712c.f22617m, 1);
        } catch (RuntimeException e11) {
            close();
            throw e11;
        }
    }

    /* renamed from: G */
    public static boolean m18933G(final String str) throws InterruptedException {
        boolean zContains;
        Set set = f22227A;
        synchronized (set) {
            try {
                if (!set.contains(str)) {
                    return false;
                }
                Thread thread = f22228B;
                if (thread != null && thread.isAlive()) {
                    return m18934H(str, false);
                }
                Thread thread2 = new Thread(new Runnable() { // from class: jc.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BoxStore.m18936a(str);
                    }
                });
                thread2.setDaemon(true);
                f22228B = thread2;
                thread2.start();
                try {
                    thread2.join(500L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                Set set2 = f22227A;
                synchronized (set2) {
                    zContains = set2.contains(str);
                }
                return zContains;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: H */
    public static boolean m18934H(String str, boolean z10) {
        boolean zContains;
        synchronized (f22227A) {
            int i10 = 0;
            while (i10 < 5) {
                try {
                    Set set = f22227A;
                    if (!set.contains(str)) {
                        break;
                    }
                    i10++;
                    System.gc();
                    if (z10 && i10 > 1) {
                        System.runFinalization();
                    }
                    System.gc();
                    if (z10 && i10 > 1) {
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
            zContains = f22227A.contains(str);
        }
        return zContains;
    }

    /* renamed from: O */
    public static void m18935O(String str) {
        Set set = f22227A;
        synchronized (set) {
            try {
                m18933G(str);
                if (!set.add(str)) {
                    throw new DbException("Another BoxStore is still open for this directory: " + str + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18936a(String str) {
        m18934H(str, true);
        f22228B = null;
    }

    public static native long nativeBeginReadTx(long j10);

    public static native long nativeBeginTx(long j10);

    public static native int nativeCleanStaleReadTransactions(long j10);

    public static native long nativeCreateWithFlatOptions(byte[] bArr, byte[] bArr2);

    public static native void nativeDelete(long j10);

    public static native String nativeDiagnose(long j10);

    public static native void nativeDropAllData(long j10);

    public static native int nativeGetSupportedSync();

    public static native String nativeGetVersion();

    public static native boolean nativeIsObjectBrowserAvailable();

    public static native boolean nativeIsReadOnly(long j10);

    public static native void nativeRegisterCustomType(long j10, int i10, int i11, String str, Class<? extends PropertyConverter> cls, Class<?> cls2);

    public static native int nativeRegisterEntityClass(long j10, String str, Class<?> cls);

    public static native void nativeSetDbExceptionListener(long j10, DbExceptionListener dbExceptionListener);

    public static native void nativeSetDebugFlags(long j10, int i10);

    private native String nativeStartObjectBrowser(long j10, String str, int i10);

    private native boolean nativeStopObjectBrowser(long j10);

    /* renamed from: t */
    public static String m18937t(File file) {
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

    public static native void testUnalignedMemoryAccess();

    /* renamed from: u */
    public static synchronized Object m18938u() {
        return f22229y;
    }

    /* renamed from: z */
    public static synchronized Object m18939z() {
        return f22230z;
    }

    /* renamed from: A */
    public InterfaceC10466a m18940A() {
        return this.f22252x;
    }

    /* renamed from: B */
    public long m18941B() {
        return this.f22233e;
    }

    /* renamed from: C */
    public int m18942C() {
        return this.f22251w;
    }

    /* renamed from: D */
    public Future m18943D(Runnable runnable) {
        return this.f22241m.submit(runnable);
    }

    /* renamed from: E */
    public ExecutorService m18944E() {
        return this.f22241m;
    }

    /* renamed from: F */
    public boolean m18945F() {
        return this.f22245q;
    }

    /* renamed from: I */
    public void m18946I(Runnable runnable) {
        Transaction transaction = (Transaction) this.f22246r.get();
        if (transaction != null) {
            if (transaction.isReadOnly()) {
                throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
            }
            runnable.run();
            return;
        }
        Transaction transactionM18953f = m18953f();
        this.f22246r.set(transactionM18953f);
        try {
            runnable.run();
            transactionM18953f.commit();
        } finally {
            this.f22246r.remove();
            transactionM18953f.close();
        }
    }

    /* renamed from: J */
    public void m18947J(InterfaceC10466a interfaceC10466a) {
        this.f22252x = interfaceC10466a;
    }

    /* renamed from: K */
    public synchronized boolean m18948K() {
        if (this.f22250v == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.f22250v = 0;
        return nativeStopObjectBrowser(this.f22233e);
    }

    /* renamed from: L */
    public C10394g m18949L(Class cls) {
        return new C10394g(this.f22242n, cls, this.f22241m);
    }

    /* renamed from: M */
    public void m18950M(Transaction transaction, int[] iArr) {
        synchronized (this.f22248t) {
            try {
                this.f22249u++;
                if (this.f22244p) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("TX committed. New commit count: ");
                    sb2.append(this.f22249u);
                    sb2.append(", entity types affected: ");
                    sb2.append(iArr != null ? iArr.length : 0);
                    printStream.println(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = this.f22239k.values().iterator();
        while (it.hasNext()) {
            ((C9710a) it.next()).m19236v(transaction);
        }
        if (iArr != null) {
            this.f22242n.m19277f(iArr);
        }
    }

    /* renamed from: N */
    public void m18951N(Transaction transaction) {
        synchronized (this.f22240l) {
            this.f22240l.remove(transaction);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z10;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z10 = this.f22247s;
                if (!z10) {
                    if (this.f22250v != 0) {
                        try {
                            m18948K();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.f22247s = true;
                    synchronized (this.f22240l) {
                        arrayList = new ArrayList(this.f22240l);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Transaction) obj).close();
                    }
                    long j10 = this.f22233e;
                    if (j10 != 0) {
                        nativeDelete(j10);
                    }
                    this.f22241m.shutdown();
                    m18958l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        Set set = f22227A;
        synchronized (set) {
            set.remove(this.f22232d);
            set.notifyAll();
        }
    }

    /* renamed from: e */
    public Transaction m18952e() {
        m18957k();
        int i10 = this.f22249u;
        if (this.f22243o) {
            System.out.println("Begin read TX with commit count " + i10);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(this.f22233e);
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i10);
        synchronized (this.f22240l) {
            this.f22240l.add(transaction);
        }
        return transaction;
    }

    /* renamed from: f */
    public Transaction m18953f() {
        m18957k();
        int i10 = this.f22249u;
        if (this.f22244p) {
            System.out.println("Begin TX with commit count " + i10);
        }
        long jNativeBeginTx = nativeBeginTx(this.f22233e);
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i10);
        synchronized (this.f22240l) {
            this.f22240l.add(transaction);
        }
        return transaction;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public C9710a m18954g(Class cls) {
        C9710a c9710a;
        C9710a c9710a2 = (C9710a) this.f22239k.get(cls);
        if (c9710a2 != null) {
            return c9710a2;
        }
        if (!this.f22234f.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f22239k) {
            try {
                c9710a = (C9710a) this.f22239k.get(cls);
                if (c9710a == null) {
                    c9710a = new C9710a(this, cls);
                    this.f22239k.put(cls, c9710a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9710a;
    }

    /* renamed from: i */
    public Object m18955i(Callable callable) {
        if (((Transaction) this.f22246r.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException("Callable threw exception", e10);
            }
        }
        Transaction transactionM18952e = m18952e();
        this.f22246r.set(transactionM18952e);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException("Callable threw exception", e12);
            }
        } finally {
            this.f22246r.remove();
            Iterator it = this.f22239k.values().iterator();
            while (it.hasNext()) {
                ((C9710a) it.next()).m19230p(transactionM18952e);
            }
            transactionM18952e.close();
        }
    }

    public boolean isClosed() {
        return this.f22247s;
    }

    /* renamed from: j */
    public Object m18956j(Callable callable, int i10, int i11, boolean z10) throws InterruptedException {
        if (i10 == 1) {
            return m18955i(callable);
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Illegal value of attempts: " + i10);
        }
        long j10 = i11;
        DbException e10 = null;
        for (int i12 = 1; i12 <= i10; i12++) {
            try {
                return m18955i(callable);
            } catch (DbException e11) {
                e10 = e11;
                String strM18961p = m18961p();
                String str = i12 + " of " + i10 + " attempts of calling a read TX failed:";
                if (z10) {
                    System.err.println(str);
                    e10.printStackTrace();
                    System.err.println(strM18961p);
                    System.err.flush();
                    System.gc();
                    System.runFinalization();
                    m18959m();
                }
                try {
                    Thread.sleep(j10);
                    j10 *= 2;
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
                    throw e10;
                }
            }
        }
        throw e10;
    }

    /* renamed from: k */
    public final void m18957k() {
        if (this.f22247s) {
            throw new IllegalStateException("Store is closed");
        }
    }

    /* renamed from: l */
    public final void m18958l() {
        try {
            if (this.f22241m.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            int iActiveCount = Thread.activeCount();
            System.err.println("Thread pool not terminated in time; printing stack traces...");
            Thread[] threadArr = new Thread[iActiveCount + 2];
            int iEnumerate = Thread.enumerate(threadArr);
            for (int i10 = 0; i10 < iEnumerate; i10++) {
                System.err.println("Thread: " + threadArr[i10].getName());
                Thread.dumpStack();
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: m */
    public int m18959m() {
        return nativeCleanStaleReadTransactions(this.f22233e);
    }

    /* renamed from: n */
    public void m18960n() {
        Iterator it = this.f22239k.values().iterator();
        while (it.hasNext()) {
            ((C9710a) it.next()).m19215a();
        }
    }

    public native long nativePanicModeRemoveAllObjects(long j10, int i10);

    public native long nativeSizeOnDisk(long j10);

    public native long nativeValidate(long j10, long j11, boolean z10);

    /* renamed from: p */
    public String m18961p() {
        return nativeDiagnose(this.f22233e);
    }

    /* renamed from: r */
    public Collection m18962r() {
        return this.f22234f.keySet();
    }

    /* renamed from: s */
    public int[] m18963s() {
        return this.f22238j;
    }

    /* renamed from: v */
    public String m18964v(Class cls) {
        return (String) this.f22234f.get(cls);
    }

    /* renamed from: w */
    public Class m18965w(int i10) {
        Class cls = (Class) this.f22237i.m2768a(i10);
        if (cls != null) {
            return cls;
        }
        throw new DbSchemaException("No entity registered for type ID " + i10);
    }

    /* renamed from: x */
    public EntityInfo m18966x(Class cls) {
        return (EntityInfo) this.f22236h.get(cls);
    }

    /* renamed from: y */
    public int m18967y(Class cls) {
        Integer num = (Integer) this.f22235g.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }
}

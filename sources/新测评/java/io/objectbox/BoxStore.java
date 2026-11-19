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
import p193o9.C8730b;
import p214q8.C8980a;
import p214q8.C8982c;
import p214q8.RunnableC8986g;
import p225r8.AbstractC9049d;
import p225r8.C9050e;
import p258u8.C9595g;
import p269v8.InterfaceC9722a;

/* loaded from: classes5.dex */
public class BoxStore implements Closeable {

    /* renamed from: w */
    public static Object f13154w;

    /* renamed from: x */
    public static Object f13155x;

    /* renamed from: y */
    public static final Set f13156y = new HashSet();

    /* renamed from: z */
    public static volatile Thread f13157z;

    /* renamed from: a */
    public final File f13158a;

    /* renamed from: b */
    public final String f13159b;

    /* renamed from: c */
    public final long f13160c;

    /* renamed from: h */
    public final int[] f13165h;

    /* renamed from: l */
    public final RunnableC8986g f13169l;

    /* renamed from: m */
    public final boolean f13170m;

    /* renamed from: n */
    public final boolean f13171n;

    /* renamed from: o */
    public final boolean f13172o;

    /* renamed from: q */
    public boolean f13174q;

    /* renamed from: s */
    public volatile int f13176s;

    /* renamed from: t */
    public int f13177t;

    /* renamed from: u */
    public final int f13178u;

    /* renamed from: v */
    public InterfaceC9722a f13179v;

    /* renamed from: d */
    public final Map f13161d = new HashMap();

    /* renamed from: e */
    public final Map f13162e = new HashMap();

    /* renamed from: f */
    public final Map f13163f = new HashMap();

    /* renamed from: g */
    public final C8730b f13164g = new C8730b();

    /* renamed from: i */
    public final Map f13166i = new ConcurrentHashMap();

    /* renamed from: j */
    public final Set f13167j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    public final ExecutorService f13168k = new C9050e(this);

    /* renamed from: p */
    public final ThreadLocal f13173p = new ThreadLocal();

    /* renamed from: r */
    public final Object f13175r = new Object();

    public BoxStore(C8982c c8982c) {
        f13154w = c8982c.f15324f;
        f13155x = c8982c.f15325g;
        AbstractC9049d.m15199b();
        File file = c8982c.f15320b;
        this.f13158a = file;
        String strM12966r = m12966r(file);
        this.f13159b = strM12966r;
        m12964M(strM12966r);
        try {
            long jNativeCreateWithFlatOptions = nativeCreateWithFlatOptions(c8982c.m15060c(strM12966r), c8982c.f15319a);
            this.f13160c = jNativeCreateWithFlatOptions;
            if (jNativeCreateWithFlatOptions == 0) {
                throw new DbException("Could not create native store");
            }
            int i10 = c8982c.f15326h;
            if (i10 != 0) {
                this.f13170m = (i10 & 1) != 0;
                this.f13171n = (i10 & 2) != 0;
            } else {
                this.f13171n = false;
                this.f13170m = false;
            }
            this.f13172o = c8982c.f15328j;
            for (EntityInfo entityInfo : c8982c.f15337s) {
                try {
                    this.f13161d.put(entityInfo.mo6271e(), entityInfo.mo6275n());
                    int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f13160c, entityInfo.mo6275n(), entityInfo.mo6271e());
                    this.f13162e.put(entityInfo.mo6271e(), Integer.valueOf(iNativeRegisterEntityClass));
                    this.f13164g.m14375c(iNativeRegisterEntityClass, entityInfo.mo6271e());
                    this.f13163f.put(entityInfo.mo6271e(), entityInfo);
                    for (Property property : entityInfo.mo6270c()) {
                        Class cls = property.f13199j;
                        if (cls != null) {
                            Class cls2 = property.f13198i;
                            if (cls2 == null) {
                                throw new RuntimeException("No converter class for custom type of " + property);
                            }
                            nativeRegisterCustomType(this.f13160c, iNativeRegisterEntityClass, 0, property.f13197h, cls2, cls);
                        }
                    }
                } catch (RuntimeException e10) {
                    throw new RuntimeException("Could not setup up entity " + entityInfo.mo6271e(), e10);
                }
            }
            int iM14377e = this.f13164g.m14377e();
            this.f13165h = new int[iM14377e];
            long[] jArrM14374b = this.f13164g.m14374b();
            for (int i11 = 0; i11 < iM14377e; i11++) {
                this.f13165h[i11] = (int) jArrM14374b[i11];
            }
            this.f13169l = new RunnableC8986g(this);
            this.f13178u = Math.max(c8982c.f15331m, 1);
        } catch (RuntimeException e11) {
            close();
            throw e11;
        }
    }

    /* renamed from: E */
    public static boolean m12962E(final String str) throws InterruptedException {
        boolean zContains;
        Set set = f13156y;
        synchronized (set) {
            try {
                if (!set.contains(str)) {
                    return false;
                }
                Thread thread = f13157z;
                if (thread != null && thread.isAlive()) {
                    return m12963F(str, false);
                }
                Thread thread2 = new Thread(new Runnable() { // from class: q8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BoxStore.m12965a(str);
                    }
                });
                thread2.setDaemon(true);
                f13157z = thread2;
                thread2.start();
                try {
                    thread2.join(500L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                Set set2 = f13156y;
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
    public static boolean m12963F(String str, boolean z9) {
        boolean zContains;
        synchronized (f13156y) {
            int i10 = 0;
            while (i10 < 5) {
                try {
                    Set set = f13156y;
                    if (!set.contains(str)) {
                        break;
                    }
                    i10++;
                    System.gc();
                    if (z9 && i10 > 1) {
                        System.runFinalization();
                    }
                    System.gc();
                    if (z9 && i10 > 1) {
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
            zContains = f13156y.contains(str);
        }
        return zContains;
    }

    /* renamed from: M */
    public static void m12964M(String str) {
        Set set = f13156y;
        synchronized (set) {
            try {
                m12962E(str);
                if (!set.add(str)) {
                    throw new DbException("Another BoxStore is still open for this directory: " + str + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12965a(String str) {
        m12963F(str, true);
        f13157z = null;
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

    /* renamed from: r */
    public static String m12966r(File file) {
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
    public static synchronized Object m12967s() {
        return f13154w;
    }

    public static native void testUnalignedMemoryAccess();

    /* renamed from: x */
    public static synchronized Object m12968x() {
        return f13155x;
    }

    /* renamed from: A */
    public int m12969A() {
        return this.f13178u;
    }

    /* renamed from: B */
    public Future m12970B(Runnable runnable) {
        return this.f13168k.submit(runnable);
    }

    /* renamed from: C */
    public ExecutorService m12971C() {
        return this.f13168k;
    }

    /* renamed from: D */
    public boolean m12972D() {
        return this.f13172o;
    }

    /* renamed from: G */
    public void m12973G(Runnable runnable) {
        Transaction transaction = (Transaction) this.f13173p.get();
        if (transaction != null) {
            if (transaction.isReadOnly()) {
                throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
            }
            runnable.run();
            return;
        }
        Transaction transactionM12980g = m12980g();
        this.f13173p.set(transactionM12980g);
        try {
            runnable.run();
            transactionM12980g.m13013g();
        } finally {
            this.f13173p.remove();
            transactionM12980g.close();
        }
    }

    /* renamed from: H */
    public void m12974H(InterfaceC9722a interfaceC9722a) {
        this.f13179v = interfaceC9722a;
    }

    /* renamed from: I */
    public synchronized boolean m12975I() {
        if (this.f13177t == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.f13177t = 0;
        return nativeStopObjectBrowser(this.f13160c);
    }

    /* renamed from: J */
    public C9595g m12976J(Class cls) {
        return new C9595g(this.f13169l, cls, this.f13168k);
    }

    /* renamed from: K */
    public void m12977K(Transaction transaction, int[] iArr) {
        synchronized (this.f13175r) {
            try {
                this.f13176s++;
                if (this.f13171n) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("TX committed. New commit count: ");
                    sb.append(this.f13176s);
                    sb.append(", entity types affected: ");
                    sb.append(iArr != null ? iArr.length : 0);
                    printStream.println(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = this.f13166i.values().iterator();
        while (it.hasNext()) {
            ((C8980a) it.next()).m15053t(transaction);
        }
        if (iArr != null) {
            this.f13169l.m15093f(iArr);
        }
    }

    /* renamed from: L */
    public void m12978L(Transaction transaction) {
        synchronized (this.f13167j) {
            this.f13167j.remove(transaction);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z9;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z9 = this.f13174q;
                if (!z9) {
                    if (this.f13177t != 0) {
                        try {
                            m12975I();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.f13174q = true;
                    synchronized (this.f13167j) {
                        arrayList = new ArrayList(this.f13167j);
                    }
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Transaction) obj).close();
                    }
                    long j10 = this.f13160c;
                    if (j10 != 0) {
                        nativeDelete(j10);
                    }
                    this.f13168k.shutdown();
                    m12985l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            return;
        }
        Set set = f13156y;
        synchronized (set) {
            set.remove(this.f13159b);
            set.notifyAll();
        }
    }

    /* renamed from: f */
    public Transaction m12979f() {
        m12984k();
        int i10 = this.f13176s;
        if (this.f13170m) {
            System.out.println("Begin read TX with commit count " + i10);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(this.f13160c);
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i10);
        synchronized (this.f13167j) {
            this.f13167j.add(transaction);
        }
        return transaction;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public Transaction m12980g() {
        m12984k();
        int i10 = this.f13176s;
        if (this.f13171n) {
            System.out.println("Begin TX with commit count " + i10);
        }
        long jNativeBeginTx = nativeBeginTx(this.f13160c);
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i10);
        synchronized (this.f13167j) {
            this.f13167j.add(transaction);
        }
        return transaction;
    }

    /* renamed from: h */
    public C8980a m12981h(Class cls) {
        C8980a c8980a;
        C8980a c8980a2 = (C8980a) this.f13166i.get(cls);
        if (c8980a2 != null) {
            return c8980a2;
        }
        if (!this.f13161d.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f13166i) {
            try {
                c8980a = (C8980a) this.f13166i.get(cls);
                if (c8980a == null) {
                    c8980a = new C8980a(this, cls);
                    this.f13166i.put(cls, c8980a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8980a;
    }

    /* renamed from: i */
    public Object m12982i(Callable callable) {
        if (((Transaction) this.f13173p.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException("Callable threw exception", e10);
            }
        }
        Transaction transactionM12979f = m12979f();
        this.f13173p.set(transactionM12979f);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException("Callable threw exception", e12);
            }
        } finally {
            this.f13173p.remove();
            Iterator it = this.f13166i.values().iterator();
            while (it.hasNext()) {
                ((C8980a) it.next()).m15048o(transactionM12979f);
            }
            transactionM12979f.close();
        }
    }

    public boolean isClosed() {
        return this.f13174q;
    }

    /* renamed from: j */
    public Object m12983j(Callable callable, int i10, int i11, boolean z9) throws InterruptedException {
        if (i10 == 1) {
            return m12982i(callable);
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Illegal value of attempts: " + i10);
        }
        long j10 = i11;
        DbException e10 = null;
        for (int i12 = 1; i12 <= i10; i12++) {
            try {
                return m12982i(callable);
            } catch (DbException e11) {
                e10 = e11;
                String strM12988o = m12988o();
                String str = i12 + " of " + i10 + " attempts of calling a read TX failed:";
                if (z9) {
                    System.err.println(str);
                    e10.printStackTrace();
                    System.err.println(strM12988o);
                    System.err.flush();
                    System.gc();
                    System.runFinalization();
                    m12986m();
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
    public final void m12984k() {
        if (this.f13174q) {
            throw new IllegalStateException("Store is closed");
        }
    }

    /* renamed from: l */
    public final void m12985l() {
        try {
            if (this.f13168k.awaitTermination(1L, TimeUnit.SECONDS)) {
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
    public int m12986m() {
        return nativeCleanStaleReadTransactions(this.f13160c);
    }

    /* renamed from: n */
    public void m12987n() {
        Iterator it = this.f13166i.values().iterator();
        while (it.hasNext()) {
            ((C8980a) it.next()).m15034a();
        }
    }

    public native long nativePanicModeRemoveAllObjects(long j10, int i10);

    public native long nativeSizeOnDisk(long j10);

    public native long nativeValidate(long j10, long j11, boolean z9);

    /* renamed from: o */
    public String m12988o() {
        return nativeDiagnose(this.f13160c);
    }

    /* renamed from: p */
    public Collection m12989p() {
        return this.f13161d.keySet();
    }

    /* renamed from: q */
    public int[] m12990q() {
        return this.f13165h;
    }

    /* renamed from: t */
    public String m12991t(Class cls) {
        return (String) this.f13161d.get(cls);
    }

    /* renamed from: u */
    public Class m12992u(int i10) {
        Class cls = (Class) this.f13164g.m14373a(i10);
        if (cls != null) {
            return cls;
        }
        throw new DbSchemaException("No entity registered for type ID " + i10);
    }

    /* renamed from: v */
    public EntityInfo m12993v(Class cls) {
        return (EntityInfo) this.f13163f.get(cls);
    }

    /* renamed from: w */
    public int m12994w(Class cls) {
        Integer num = (Integer) this.f13162e.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }

    /* renamed from: y */
    public InterfaceC9722a m12995y() {
        return this.f13179v;
    }

    /* renamed from: z */
    public long m12996z() {
        return this.f13160c;
    }
}

package io.objectbox;

import com.zykj.blackboard.utils.RunnableC4349a;
import io.objectbox.converter.PropertyConverter;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;
import p023b8.C3201a;
import p023b8.C3202b;
import p116m5.AbstractC6111c;
import p116m5.C6113e;

@ThreadSafe
/* loaded from: classes3.dex */
public class BoxStore implements Closeable {

    /* renamed from: s */
    public static Object f8894s;

    /* renamed from: t */
    public static final HashSet f8895t = new HashSet();

    /* renamed from: u */
    public static volatile Thread f8896u;

    /* renamed from: a */
    public final String f8897a;

    /* renamed from: b */
    public final long f8898b;

    /* renamed from: c */
    public final HashMap f8899c = new HashMap();

    /* renamed from: d */
    public final HashMap f8900d = new HashMap();

    /* renamed from: e */
    public final HashMap f8901e = new HashMap();

    /* renamed from: f */
    public final C3202b f8902f;

    /* renamed from: g */
    public final int[] f8903g;

    /* renamed from: h */
    public final ConcurrentHashMap f8904h;

    /* renamed from: i */
    public final Set f8905i;

    /* renamed from: j */
    public final C6113e f8906j;

    /* renamed from: k */
    public final RunnableC5702f f8907k;

    /* renamed from: l */
    public final boolean f8908l;

    /* renamed from: m */
    public final boolean f8909m;

    /* renamed from: n */
    public final ThreadLocal f8910n;

    /* renamed from: o */
    public boolean f8911o;

    /* renamed from: p */
    public final Object f8912p;

    /* renamed from: q */
    public volatile int f8913q;

    /* renamed from: r */
    public final int f8914r;

    public BoxStore(C5698b c5698b) throws IOException {
        C3202b c3202b = new C3202b();
        c3202b.f1736b = 16;
        c3202b.f1737c = 21;
        c3202b.f1735a = new C3201a[16];
        this.f8902f = c3202b;
        this.f8904h = new ConcurrentHashMap();
        this.f8905i = Collections.newSetFromMap(new WeakHashMap());
        this.f8906j = new C6113e(this);
        this.f8910n = new ThreadLocal();
        this.f8912p = new Object();
        f8894s = c5698b.f8933f;
        int i = AbstractC6111c.f9754a;
        File file = c5698b.f8929b;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new DbException("Is not a directory: " + file.getAbsolutePath());
            }
        } else if (!file.mkdirs()) {
            throw new DbException("Could not create directory: " + file.getAbsolutePath());
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            this.f8897a = canonicalPath;
            HashSet hashSet = f8895t;
            synchronized (hashSet) {
                m5014f(canonicalPath);
                if (!hashSet.add(canonicalPath)) {
                    throw new DbException("Another BoxStore is still open for this directory: " + canonicalPath + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
                }
            }
            try {
                long jNativeCreateWithFlatOptions = nativeCreateWithFlatOptions(c5698b.m5045c(canonicalPath), c5698b.f8928a);
                this.f8898b = jNativeCreateWithFlatOptions;
                if (jNativeCreateWithFlatOptions == 0) {
                    throw new DbException("Could not create native store");
                }
                this.f8909m = false;
                this.f8908l = false;
                ArrayList arrayList = c5698b.f8935h;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    EntityInfo entityInfo = (EntityInfo) obj;
                    try {
                        this.f8899c.put(entityInfo.getEntityClass(), entityInfo.getDbName());
                        int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f8898b, entityInfo.getDbName(), entityInfo.getEntityClass());
                        this.f8900d.put(entityInfo.getEntityClass(), Integer.valueOf(iNativeRegisterEntityClass));
                        this.f8902f.m2137a(iNativeRegisterEntityClass, entityInfo.getEntityClass());
                        this.f8901e.put(entityInfo.getEntityClass(), entityInfo);
                        for (Property property : entityInfo.getAllProperties()) {
                            Class<?> cls = property.customType;
                            if (cls != null) {
                                Class<? extends PropertyConverter<?, ?>> cls2 = property.converterClass;
                                if (cls2 == null) {
                                    throw new RuntimeException("No converter class for custom type of " + property);
                                }
                                nativeRegisterCustomType(this.f8898b, iNativeRegisterEntityClass, 0, property.dbName, cls2, cls);
                            }
                        }
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Could not setup up entity " + entityInfo.getEntityClass(), e);
                    }
                }
                int i9 = this.f8902f.f1738d;
                this.f8903g = new int[i9];
                C3202b c3202b2 = this.f8902f;
                long[] jArr = new long[c3202b2.f1738d];
                int i10 = 0;
                for (C3201a c3201a : c3202b2.f1735a) {
                    while (c3201a != null) {
                        jArr[i10] = c3201a.f1732a;
                        c3201a = c3201a.f1734c;
                        i10++;
                    }
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    this.f8903g[i11] = (int) jArr[i11];
                }
                this.f8907k = new RunnableC5702f(this);
                this.f8914r = Math.max(0, 1);
            } catch (RuntimeException e4) {
                close();
                throw e4;
            }
        } catch (IOException e8) {
            throw new DbException("Could not verify dir", e8);
        }
    }

    /* renamed from: f */
    public static void m5014f(String str) throws InterruptedException {
        HashSet hashSet = f8895t;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str)) {
                    Thread thread = f8896u;
                    if (thread != null && thread.isAlive()) {
                        m5015g(str, false);
                        return;
                    }
                    Thread thread2 = new Thread(new RunnableC4349a(str, 1));
                    thread2.setDaemon(true);
                    f8896u = thread2;
                    thread2.start();
                    try {
                        thread2.join(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    HashSet hashSet2 = f8895t;
                    synchronized (hashSet2) {
                        hashSet2.contains(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static boolean m5015g(String str, boolean z8) {
        boolean zContains;
        synchronized (f8895t) {
            int i = 0;
            while (i < 5) {
                try {
                    HashSet hashSet = f8895t;
                    if (!hashSet.contains(str)) {
                        break;
                    }
                    i++;
                    System.gc();
                    if (z8 && i > 1) {
                        System.runFinalization();
                    }
                    System.gc();
                    if (z8 && i > 1) {
                        System.runFinalization();
                    }
                    try {
                        hashSet.wait(100L);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zContains = f8895t.contains(str);
        }
        return zContains;
    }

    public static native long nativeBeginReadTx(long j7);

    public static native long nativeBeginTx(long j7);

    public static native int nativeCleanStaleReadTransactions(long j7);

    public static native long nativeCreateWithFlatOptions(byte[] bArr, byte[] bArr2);

    public static native void nativeDelete(long j7);

    public static native String nativeDiagnose(long j7);

    public static native void nativeRegisterCustomType(long j7, int i, int i8, String str, Class<? extends PropertyConverter> cls, Class<?> cls2);

    public static native int nativeRegisterEntityClass(long j7, String str, Class<?> cls);

    /* renamed from: a */
    public final Transaction m5016a() {
        if (this.f8911o) {
            throw new IllegalStateException("Store is closed");
        }
        int i = this.f8913q;
        if (this.f8908l) {
            System.out.println("Begin read TX with commit count " + i);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(this.f8898b);
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i);
        synchronized (this.f8905i) {
            this.f8905i.add(transaction);
        }
        return transaction;
    }

    /* renamed from: b */
    public final Transaction m5017b() {
        if (this.f8911o) {
            throw new IllegalStateException("Store is closed");
        }
        int i = this.f8913q;
        if (this.f8909m) {
            System.out.println("Begin TX with commit count " + i);
        }
        long jNativeBeginTx = nativeBeginTx(this.f8898b);
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i);
        synchronized (this.f8905i) {
            this.f8905i.add(transaction);
        }
        return transaction;
    }

    /* renamed from: c */
    public final C5696a m5018c(Class cls) {
        C5696a c5696a;
        C5696a c5696a2 = (C5696a) this.f8904h.get(cls);
        if (c5696a2 != null) {
            return c5696a2;
        }
        if (!this.f8899c.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f8904h) {
            try {
                c5696a = (C5696a) this.f8904h.get(cls);
                if (c5696a == null) {
                    c5696a = new C5696a(this, cls);
                    this.f8904h.put(cls, c5696a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5696a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z8 = this.f8911o;
                if (!z8) {
                    this.f8911o = true;
                    synchronized (this.f8905i) {
                        arrayList = new ArrayList(this.f8905i);
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Transaction) obj).close();
                    }
                    long j7 = this.f8898b;
                    if (j7 != 0) {
                        nativeDelete(j7);
                    }
                    this.f8906j.shutdown();
                    m5020e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            return;
        }
        HashSet hashSet = f8895t;
        synchronized (hashSet) {
            hashSet.remove(this.f8897a);
            hashSet.notifyAll();
        }
    }

    /* renamed from: d */
    public final Object m5019d(Callable callable) {
        ConcurrentHashMap concurrentHashMap = this.f8904h;
        ThreadLocal threadLocal = this.f8910n;
        if (((Transaction) threadLocal.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException("Callable threw exception", e);
            }
        }
        Transaction transactionM5016a = m5016a();
        threadLocal.set(transactionM5016a);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception e8) {
                throw new RuntimeException("Callable threw exception", e8);
            }
        } finally {
            threadLocal.remove();
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                ThreadLocal threadLocal2 = ((C5696a) it.next()).f8924c;
                Cursor cursor = (Cursor) threadLocal2.get();
                if (cursor != null && cursor.getTx() == transactionM5016a) {
                    threadLocal2.remove();
                    cursor.close();
                }
            }
            transactionM5016a.close();
        }
    }

    /* renamed from: e */
    public final void m5020e() {
        try {
            if (this.f8906j.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            int iActiveCount = Thread.activeCount();
            System.err.println("Thread pool not terminated in time; printing stack traces...");
            Thread[] threadArr = new Thread[iActiveCount + 2];
            int iEnumerate = Thread.enumerate(threadArr);
            for (int i = 0; i < iEnumerate; i++) {
                System.err.println("Thread: " + threadArr[i].getName());
                Thread.dumpStack();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: h */
    public final void m5021h(Runnable runnable) {
        ThreadLocal threadLocal = this.f8910n;
        Transaction transaction = (Transaction) threadLocal.get();
        if (transaction != null) {
            if (transaction.f8919c) {
                throw new IllegalStateException("Cannot start a transaction while a read only transaction is active");
            }
            runnable.run();
            return;
        }
        Transaction transactionM5017b = m5017b();
        threadLocal.set(transactionM5017b);
        try {
            runnable.run();
            transactionM5017b.m5028b();
        } finally {
            threadLocal.remove();
            transactionM5017b.close();
        }
    }
}

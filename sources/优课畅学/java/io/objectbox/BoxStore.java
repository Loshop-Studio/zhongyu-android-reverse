package io.objectbox;

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
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import p189n6.AbstractC9431d;
import p189n6.C9432e;
import p222q6.C9840g;
import p233r6.InterfaceC9940a;
import p324z9.C10748b;

@ThreadSafe
/* loaded from: classes5.dex */
public class BoxStore implements Closeable {

    /* renamed from: w */
    public static Object f16842w;

    /* renamed from: x */
    public static Object f16843x;

    /* renamed from: y */
    public static final Set f16844y = new HashSet();

    /* renamed from: z */
    public static volatile Thread f16845z;

    /* renamed from: a */
    public final File f16846a;

    /* renamed from: b */
    public final String f16847b;

    /* renamed from: c */
    public final long f16848c;

    /* renamed from: h */
    public final int[] f16853h;

    /* renamed from: l */
    public final RunnableC8964g f16857l;

    /* renamed from: m */
    public final boolean f16858m;

    /* renamed from: n */
    public final boolean f16859n;

    /* renamed from: o */
    public final boolean f16860o;

    /* renamed from: q */
    public boolean f16862q;

    /* renamed from: s */
    public volatile int f16864s;

    /* renamed from: t */
    public int f16865t;

    /* renamed from: u */
    public final int f16866u;

    /* renamed from: v */
    public InterfaceC9940a f16867v;

    /* renamed from: d */
    public final Map f16849d = new HashMap();

    /* renamed from: e */
    public final Map f16850e = new HashMap();

    /* renamed from: f */
    public final Map f16851f = new HashMap();

    /* renamed from: g */
    public final C10748b f16852g = new C10748b();

    /* renamed from: i */
    public final Map f16854i = new ConcurrentHashMap();

    /* renamed from: j */
    public final Set f16855j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    public final ExecutorService f16856k = new C9432e(this);

    /* renamed from: p */
    public final ThreadLocal f16861p = new ThreadLocal();

    /* renamed from: r */
    public final Object f16863r = new Object();

    public BoxStore(C8960c c8960c) {
        f16842w = c8960c.f16906f;
        f16843x = c8960c.f16907g;
        AbstractC9431d.m17285b();
        File file = c8960c.f16902b;
        this.f16846a = file;
        String strM15360n = m15360n(file);
        this.f16847b = strM15360n;
        m15358H(strM15360n);
        try {
            long jNativeCreateWithFlatOptions = nativeCreateWithFlatOptions(c8960c.m15432c(strM15360n), c8960c.f16901a);
            this.f16848c = jNativeCreateWithFlatOptions;
            if (jNativeCreateWithFlatOptions == 0) {
                throw new DbException("Could not create native store");
            }
            int i10 = c8960c.f16908h;
            if (i10 != 0) {
                this.f16858m = (i10 & 1) != 0;
                this.f16859n = (i10 & 2) != 0;
            } else {
                this.f16859n = false;
                this.f16858m = false;
            }
            this.f16860o = c8960c.f16910j;
            for (EntityInfo entityInfo : c8960c.f16919s) {
                try {
                    this.f16849d.put(entityInfo.getEntityClass(), entityInfo.getDbName());
                    int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f16848c, entityInfo.getDbName(), entityInfo.getEntityClass());
                    this.f16850e.put(entityInfo.getEntityClass(), Integer.valueOf(iNativeRegisterEntityClass));
                    this.f16852g.m20093c(iNativeRegisterEntityClass, entityInfo.getEntityClass());
                    this.f16851f.put(entityInfo.getEntityClass(), entityInfo);
                    for (Property property : entityInfo.getAllProperties()) {
                        Class cls = property.f16879j;
                        if (cls != null) {
                            Class cls2 = property.f16878i;
                            if (cls2 == null) {
                                throw new RuntimeException("No converter class for custom type of " + property);
                            }
                            nativeRegisterCustomType(this.f16848c, iNativeRegisterEntityClass, 0, property.f16877h, cls2, cls);
                        }
                    }
                } catch (RuntimeException e10) {
                    throw new RuntimeException("Could not setup up entity " + entityInfo.getEntityClass(), e10);
                }
            }
            int iM20095e = this.f16852g.m20095e();
            this.f16853h = new int[iM20095e];
            long[] jArrM20092b = this.f16852g.m20092b();
            for (int i11 = 0; i11 < iM20095e; i11++) {
                this.f16853h[i11] = (int) jArrM20092b[i11];
            }
            this.f16857l = new RunnableC8964g(this);
            this.f16866u = Math.max(c8960c.f16913m, 1);
        } catch (RuntimeException e11) {
            close();
            throw e11;
        }
    }

    /* renamed from: A */
    public static boolean m15356A(final String str) throws InterruptedException {
        boolean zContains;
        Set set = f16844y;
        synchronized (set) {
            try {
                if (!set.contains(str)) {
                    return false;
                }
                Thread thread = f16845z;
                if (thread != null && thread.isAlive()) {
                    return m15357B(str, false);
                }
                Thread thread2 = new Thread(new Runnable() { // from class: io.objectbox.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        BoxStore.m15359a(str);
                    }
                });
                thread2.setDaemon(true);
                f16845z = thread2;
                thread2.start();
                try {
                    thread2.join(500L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                Set set2 = f16844y;
                synchronized (set2) {
                    zContains = set2.contains(str);
                }
                return zContains;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: B */
    public static boolean m15357B(String str, boolean z10) {
        boolean zContains;
        synchronized (f16844y) {
            int i10 = 0;
            while (i10 < 5) {
                try {
                    Set set = f16844y;
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
            zContains = f16844y.contains(str);
        }
        return zContains;
    }

    /* renamed from: H */
    public static void m15358H(String str) {
        Set set = f16844y;
        synchronized (set) {
            try {
                m15356A(str);
                if (!set.add(str)) {
                    throw new DbException("Another BoxStore is still open for this directory: " + str + ". Hint: for most apps it's recommended to keep a BoxStore for the app's life time.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m15359a(String str) {
        m15357B(str, true);
        f16845z = null;
    }

    /* renamed from: n */
    public static String m15360n(File file) {
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

    public static native void nativeSetDbExceptionListener(long j10, @Nullable DbExceptionListener dbExceptionListener);

    public static native void nativeSetDebugFlags(long j10, int i10);

    private native String nativeStartObjectBrowser(long j10, @Nullable String str, int i10);

    private native boolean nativeStopObjectBrowser(long j10);

    /* renamed from: o */
    public static synchronized Object m15361o() {
        return f16842w;
    }

    /* renamed from: t */
    public static synchronized Object m15362t() {
        return f16843x;
    }

    public static native void testUnalignedMemoryAccess();

    /* renamed from: C */
    public void m15363C(InterfaceC9940a interfaceC9940a) {
        this.f16867v = interfaceC9940a;
    }

    /* renamed from: D */
    public synchronized boolean m15364D() {
        if (this.f16865t == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.f16865t = 0;
        return nativeStopObjectBrowser(this.f16848c);
    }

    /* renamed from: E */
    public C9840g m15365E(Class cls) {
        return new C9840g(this.f16857l, cls, this.f16856k);
    }

    /* renamed from: F */
    public void m15366F(Transaction transaction, int[] iArr) {
        synchronized (this.f16863r) {
            try {
                this.f16864s++;
                if (this.f16859n) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("TX committed. New commit count: ");
                    sb.append(this.f16864s);
                    sb.append(", entity types affected: ");
                    sb.append(iArr != null ? iArr.length : 0);
                    printStream.println(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = this.f16854i.values().iterator();
        while (it.hasNext()) {
            ((C8957a) it.next()).m15423u(transaction);
        }
        if (iArr != null) {
            this.f16857l.m15467f(iArr);
        }
    }

    /* renamed from: G */
    public void m15367G(Transaction transaction) {
        synchronized (this.f16855j) {
            this.f16855j.remove(transaction);
        }
    }

    /* renamed from: b */
    public Transaction m15368b() {
        m15373g();
        int i10 = this.f16864s;
        if (this.f16858m) {
            System.out.println("Begin read TX with commit count " + i10);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(this.f16848c);
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i10);
        synchronized (this.f16855j) {
            this.f16855j.add(transaction);
        }
        return transaction;
    }

    /* renamed from: c */
    public Transaction m15369c() {
        m15373g();
        int i10 = this.f16864s;
        if (this.f16859n) {
            System.out.println("Begin TX with commit count " + i10);
        }
        long jNativeBeginTx = nativeBeginTx(this.f16848c);
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i10);
        synchronized (this.f16855j) {
            this.f16855j.add(transaction);
        }
        return transaction;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z10;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z10 = this.f16862q;
                if (!z10) {
                    if (this.f16865t != 0) {
                        try {
                            m15364D();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.f16862q = true;
                    synchronized (this.f16855j) {
                        arrayList = new ArrayList(this.f16855j);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transaction) it.next()).close();
                    }
                    long j10 = this.f16848c;
                    if (j10 != 0) {
                        nativeDelete(j10);
                    }
                    this.f16856k.shutdown();
                    m15374h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        Set set = f16844y;
        synchronized (set) {
            set.remove(this.f16847b);
            set.notifyAll();
        }
    }

    /* renamed from: d */
    public C8957a m15370d(Class cls) {
        C8957a c8957a;
        C8957a c8957a2 = (C8957a) this.f16854i.get(cls);
        if (c8957a2 != null) {
            return c8957a2;
        }
        if (!this.f16849d.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f16854i) {
            try {
                c8957a = (C8957a) this.f16854i.get(cls);
                if (c8957a == null) {
                    c8957a = new C8957a(this, cls);
                    this.f16854i.put(cls, c8957a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8957a;
    }

    /* renamed from: e */
    public Object m15371e(Callable callable) {
        if (((Transaction) this.f16861p.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException("Callable threw exception", e10);
            }
        }
        Transaction transactionM15368b = m15368b();
        this.f16861p.set(transactionM15368b);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException("Callable threw exception", e12);
            }
        } finally {
            this.f16861p.remove();
            Iterator it = this.f16854i.values().iterator();
            while (it.hasNext()) {
                ((C8957a) it.next()).m15417o(transactionM15368b);
            }
            transactionM15368b.close();
        }
    }

    /* renamed from: f */
    public Object m15372f(Callable callable, int i10, int i11, boolean z10) throws InterruptedException {
        if (i10 == 1) {
            return m15371e(callable);
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Illegal value of attempts: " + i10);
        }
        long j10 = i11;
        DbException e10 = null;
        for (int i12 = 1; i12 <= i10; i12++) {
            try {
                return m15371e(callable);
            } catch (DbException e11) {
                e10 = e11;
                String strM15377k = m15377k();
                String str = i12 + " of " + i10 + " attempts of calling a read TX failed:";
                if (z10) {
                    System.err.println(str);
                    e10.printStackTrace();
                    System.err.println(strM15377k);
                    System.err.flush();
                    System.gc();
                    System.runFinalization();
                    m15375i();
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

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public final void m15373g() {
        if (this.f16862q) {
            throw new IllegalStateException("Store is closed");
        }
    }

    /* renamed from: h */
    public final void m15374h() {
        try {
            if (this.f16856k.awaitTermination(1L, TimeUnit.SECONDS)) {
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

    /* renamed from: i */
    public int m15375i() {
        return nativeCleanStaleReadTransactions(this.f16848c);
    }

    public boolean isClosed() {
        return this.f16862q;
    }

    /* renamed from: j */
    public void m15376j() {
        Iterator it = this.f16854i.values().iterator();
        while (it.hasNext()) {
            ((C8957a) it.next()).m15403a();
        }
    }

    /* renamed from: k */
    public String m15377k() {
        return nativeDiagnose(this.f16848c);
    }

    /* renamed from: l */
    public Collection m15378l() {
        return this.f16849d.keySet();
    }

    /* renamed from: m */
    public int[] m15379m() {
        return this.f16853h;
    }

    public native long nativePanicModeRemoveAllObjects(long j10, int i10);

    public native long nativeSizeOnDisk(long j10);

    public native long nativeValidate(long j10, long j11, boolean z10);

    /* renamed from: p */
    public String m15380p(Class cls) {
        return (String) this.f16849d.get(cls);
    }

    /* renamed from: q */
    public Class m15381q(int i10) {
        Class cls = (Class) this.f16852g.m20091a(i10);
        if (cls != null) {
            return cls;
        }
        throw new DbSchemaException("No entity registered for type ID " + i10);
    }

    /* renamed from: r */
    public EntityInfo m15382r(Class cls) {
        return (EntityInfo) this.f16851f.get(cls);
    }

    /* renamed from: s */
    public int m15383s(Class cls) {
        Integer num = (Integer) this.f16850e.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }

    /* renamed from: u */
    public InterfaceC9940a m15384u() {
        return this.f16867v;
    }

    /* renamed from: v */
    public long m15385v() {
        return this.f16848c;
    }

    /* renamed from: w */
    public int m15386w() {
        return this.f16866u;
    }

    /* renamed from: x */
    public Future m15387x(Runnable runnable) {
        return this.f16856k.submit(runnable);
    }

    /* renamed from: y */
    public ExecutorService m15388y() {
        return this.f16856k;
    }

    /* renamed from: z */
    public boolean m15389z() {
        return this.f16860o;
    }
}

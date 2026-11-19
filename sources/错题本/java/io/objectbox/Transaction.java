package io.objectbox;

import android.support.v4.media.AbstractC0037f;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.io.PrintStream;
import java.util.Iterator;
import javax.annotation.concurrent.NotThreadSafe;
import p116m5.InterfaceC6109a;

@Internal
@NotThreadSafe
/* loaded from: classes3.dex */
public class Transaction implements Closeable {

    /* renamed from: a */
    public final long f8917a;

    /* renamed from: b */
    public final BoxStore f8918b;

    /* renamed from: c */
    public final boolean f8919c;

    /* renamed from: d */
    public int f8920d;

    /* renamed from: e */
    public volatile boolean f8921e;

    public Transaction(BoxStore boxStore, long j7, int i) {
        this.f8918b = boxStore;
        this.f8917a = j7;
        this.f8920d = i;
        this.f8919c = nativeIsReadOnly(j7);
    }

    /* renamed from: a */
    public final void m5027a() {
        if (this.f8921e) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    /* renamed from: b */
    public final void m5028b() {
        m5027a();
        int[] iArrNativeCommit = nativeCommit(this.f8917a);
        BoxStore boxStore = this.f8918b;
        synchronized (boxStore.f8912p) {
            try {
                boxStore.f8913q++;
                if (boxStore.f8909m) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("TX committed. New commit count: ");
                    sb.append(boxStore.f8913q);
                    sb.append(", entity types affected: ");
                    sb.append(iArrNativeCommit != null ? iArrNativeCommit.length : 0);
                    printStream.println(sb.toString());
                }
            } finally {
            }
        }
        Iterator it = boxStore.f8904h.values().iterator();
        while (it.hasNext()) {
            ThreadLocal threadLocal = ((C5696a) it.next()).f8924c;
            Cursor cursor = (Cursor) threadLocal.get();
            if (cursor != null) {
                threadLocal.remove();
                cursor.close();
            }
        }
        if (iArrNativeCommit != null) {
            RunnableC5702f runnableC5702f = boxStore.f8907k;
            synchronized (runnableC5702f.f8968c) {
                try {
                    runnableC5702f.f8968c.add(iArrNativeCommit);
                    if (!runnableC5702f.f8969d) {
                        runnableC5702f.f8969d = true;
                        runnableC5702f.f8966a.f8906j.submit(runnableC5702f);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public final Cursor m5029c(Class cls) {
        m5027a();
        BoxStore boxStore = this.f8918b;
        EntityInfo entityInfo = (EntityInfo) boxStore.f8901e.get(cls);
        InterfaceC6109a cursorFactory = entityInfo.getCursorFactory();
        long jNativeCreateCursor = nativeCreateCursor(this.f8917a, entityInfo.getDbName(), cls);
        if (jNativeCreateCursor != 0) {
            return cursorFactory.createCursor(this, jNativeCreateCursor, boxStore);
        }
        throw new DbException("Could not create native cursor");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.f8921e) {
                this.f8921e = true;
                BoxStore boxStore = this.f8918b;
                synchronized (boxStore.f8905i) {
                    boxStore.f8905i.remove(this);
                }
                if (!nativeIsOwnerThread(this.f8917a)) {
                    boolean zNativeIsActive = nativeIsActive(this.f8917a);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f8917a);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f8920d + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        System.err.flush();
                    }
                }
                if (!this.f8918b.f8911o) {
                    nativeDestroy(this.f8917a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public native void nativeAbort(long j7);

    public native int[] nativeCommit(long j7);

    public native long nativeCreateCursor(long j7, String str, Class<?> cls);

    public native void nativeDestroy(long j7);

    public native boolean nativeIsActive(long j7);

    public native boolean nativeIsOwnerThread(long j7);

    public native boolean nativeIsReadOnly(long j7);

    public native boolean nativeIsRecycled(long j7);

    public native void nativeRecycle(long j7);

    public native void nativeRenew(long j7);

    public final String toString() {
        StringBuilder sb = new StringBuilder("TX ");
        sb.append(Long.toString(this.f8917a, 16));
        sb.append(" (");
        sb.append(this.f8919c ? "read-only" : "write");
        sb.append(", initialCommitCount=");
        return AbstractC0037f.m90o(sb, ")", this.f8920d);
    }
}

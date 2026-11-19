package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Closeable;
import javax.annotation.concurrent.NotThreadSafe;
import p189n6.InterfaceC9429b;

@NotThreadSafe
/* loaded from: classes5.dex */
public class Transaction implements Closeable {

    /* renamed from: g */
    public static boolean f16881g;

    /* renamed from: a */
    public final long f16882a;

    /* renamed from: b */
    public final BoxStore f16883b;

    /* renamed from: c */
    public final boolean f16884c;

    /* renamed from: d */
    public final Throwable f16885d;

    /* renamed from: e */
    public int f16886e;

    /* renamed from: f */
    public volatile boolean f16887f;

    public Transaction(BoxStore boxStore, long j10, int i10) {
        this.f16883b = boxStore;
        this.f16882a = j10;
        this.f16886e = i10;
        this.f16884c = nativeIsReadOnly(j10);
        this.f16885d = f16881g ? new Throwable() : null;
    }

    /* renamed from: a */
    public void m15393a() {
        m15394b();
        nativeAbort(this.f16882a);
    }

    /* renamed from: b */
    public final void m15394b() {
        if (this.f16887f) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    /* renamed from: c */
    public void m15395c() {
        m15394b();
        this.f16883b.m15366F(this, nativeCommit(this.f16882a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.f16887f) {
                this.f16887f = true;
                this.f16883b.m15367G(this);
                if (!nativeIsOwnerThread(this.f16882a)) {
                    boolean zNativeIsActive = nativeIsActive(this.f16882a);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f16882a);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f16886e + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        if (this.f16885d != null) {
                            System.err.println("Transaction was initially created here:");
                            this.f16885d.printStackTrace();
                        }
                        System.err.flush();
                    }
                }
                if (!this.f16883b.isClosed()) {
                    nativeDestroy(this.f16882a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public void m15396d() {
        m15395c();
        close();
    }

    /* renamed from: e */
    public Cursor m15397e(Class cls) {
        m15394b();
        EntityInfo entityInfoM15382r = this.f16883b.m15382r(cls);
        InterfaceC9429b cursorFactory = entityInfoM15382r.getCursorFactory();
        long jNativeCreateCursor = nativeCreateCursor(this.f16882a, entityInfoM15382r.getDbName(), cls);
        if (jNativeCreateCursor != 0) {
            return cursorFactory.createCursor(this, jNativeCreateCursor, this.f16883b);
        }
        throw new DbException("Could not create native cursor");
    }

    /* renamed from: f */
    public BoxStore m15398f() {
        return this.f16883b;
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public boolean m15399g() {
        return this.f16886e != this.f16883b.f16864s;
    }

    /* renamed from: h */
    public boolean m15400h() {
        m15394b();
        return nativeIsRecycled(this.f16882a);
    }

    /* renamed from: i */
    public void m15401i() {
        m15394b();
        nativeRecycle(this.f16882a);
    }

    public boolean isClosed() {
        return this.f16887f;
    }

    public boolean isReadOnly() {
        return this.f16884c;
    }

    /* renamed from: j */
    public void m15402j() {
        m15394b();
        this.f16886e = this.f16883b.f16864s;
        nativeRenew(this.f16882a);
    }

    public native void nativeAbort(long j10);

    public native int[] nativeCommit(long j10);

    public native long nativeCreateCursor(long j10, String str, Class<?> cls);

    public native long nativeCreateKeyValueCursor(long j10);

    public native void nativeDestroy(long j10);

    public native boolean nativeIsActive(long j10);

    public native boolean nativeIsOwnerThread(long j10);

    public native boolean nativeIsReadOnly(long j10);

    public native boolean nativeIsRecycled(long j10);

    public native void nativeRecycle(long j10);

    public native void nativeRenew(long j10);

    public native void nativeReset(long j10);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TX ");
        sb.append(Long.toString(this.f16882a, 16));
        sb.append(" (");
        sb.append(this.f16884c ? "read-only" : "write");
        sb.append(", initialCommitCount=");
        sb.append(this.f16886e);
        sb.append(")");
        return sb.toString();
    }
}

package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Closeable;
import p225kc.InterfaceC9909b;

/* loaded from: classes6.dex */
public class Transaction implements Closeable {

    /* renamed from: i */
    public static boolean f22274i;

    /* renamed from: c */
    public final long f22275c;

    /* renamed from: d */
    public final BoxStore f22276d;

    /* renamed from: e */
    public final boolean f22277e;

    /* renamed from: f */
    public final Throwable f22278f;

    /* renamed from: g */
    public int f22279g;

    /* renamed from: h */
    public volatile boolean f22280h;

    public Transaction(BoxStore boxStore, long j10, int i10) {
        this.f22276d = boxStore;
        this.f22275c = j10;
        this.f22279g = i10;
        this.f22277e = nativeIsReadOnly(j10);
        this.f22278f = f22274i ? new Throwable() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.f22280h) {
                this.f22280h = true;
                this.f22276d.m18951N(this);
                if (!nativeIsOwnerThread(this.f22275c)) {
                    boolean zNativeIsActive = nativeIsActive(this.f22275c);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f22275c);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f22279g + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        if (this.f22278f != null) {
                            System.err.println("Transaction was initially created here:");
                            this.f22278f.printStackTrace();
                        }
                        System.err.flush();
                    }
                }
                if (!this.f22276d.isClosed()) {
                    nativeDestroy(this.f22275c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void commit() {
        m18985f();
        this.f22276d.m18950M(this, nativeCommit(this.f22275c));
    }

    /* renamed from: e */
    public void m18984e() {
        m18985f();
        nativeAbort(this.f22275c);
    }

    /* renamed from: f */
    public final void m18985f() {
        if (this.f22280h) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public void m18986g() {
        commit();
        close();
    }

    /* renamed from: i */
    public Cursor m18987i(Class cls) {
        m18985f();
        EntityInfo entityInfoM18966x = this.f22276d.m18966x(cls);
        InterfaceC9909b interfaceC9909bMo13995l = entityInfoM18966x.mo13995l();
        long jNativeCreateCursor = nativeCreateCursor(this.f22275c, entityInfoM18966x.mo13998x(), cls);
        if (jNativeCreateCursor != 0) {
            return interfaceC9909bMo13995l.mo13991a(this, jNativeCreateCursor, this.f22276d);
        }
        throw new DbException("Could not create native cursor");
    }

    public boolean isClosed() {
        return this.f22280h;
    }

    public boolean isReadOnly() {
        return this.f22277e;
    }

    /* renamed from: j */
    public BoxStore m18988j() {
        return this.f22276d;
    }

    /* renamed from: k */
    public boolean m18989k() {
        m18985f();
        return nativeIsRecycled(this.f22275c);
    }

    /* renamed from: l */
    public void m18990l() {
        m18985f();
        nativeRecycle(this.f22275c);
    }

    /* renamed from: m */
    public void m18991m() {
        m18985f();
        this.f22279g = this.f22276d.f22249u;
        nativeRenew(this.f22275c);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TX ");
        sb2.append(Long.toString(this.f22275c, 16));
        sb2.append(" (");
        sb2.append(this.f22277e ? "read-only" : "write");
        sb2.append(", initialCommitCount=");
        sb2.append(this.f22279g);
        sb2.append(")");
        return sb2.toString();
    }
}

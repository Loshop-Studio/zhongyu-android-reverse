package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Closeable;
import p225r8.InterfaceC9047b;

/* loaded from: classes5.dex */
public class Transaction implements Closeable {

    /* renamed from: g */
    public static boolean f13201g;

    /* renamed from: a */
    public final long f13202a;

    /* renamed from: b */
    public final BoxStore f13203b;

    /* renamed from: c */
    public final boolean f13204c;

    /* renamed from: d */
    public final Throwable f13205d;

    /* renamed from: e */
    public int f13206e;

    /* renamed from: f */
    public volatile boolean f13207f;

    public Transaction(BoxStore boxStore, long j10, int i10) {
        this.f13203b = boxStore;
        this.f13202a = j10;
        this.f13206e = i10;
        this.f13204c = nativeIsReadOnly(j10);
        this.f13205d = f13201g ? new Throwable() : null;
    }

    /* renamed from: a */
    public void m13011a() {
        m13012f();
        nativeAbort(this.f13202a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.f13207f) {
                this.f13207f = true;
                this.f13203b.m12978L(this);
                if (!nativeIsOwnerThread(this.f13202a)) {
                    boolean zNativeIsActive = nativeIsActive(this.f13202a);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f13202a);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f13206e + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        if (this.f13205d != null) {
                            System.err.println("Transaction was initially created here:");
                            this.f13205d.printStackTrace();
                        }
                        System.err.flush();
                    }
                }
                if (!this.f13203b.isClosed()) {
                    nativeDestroy(this.f13202a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final void m13012f() {
        if (this.f13207f) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public void m13013g() {
        m13012f();
        this.f13203b.m12977K(this, nativeCommit(this.f13202a));
    }

    /* renamed from: h */
    public void m13014h() {
        m13013g();
        close();
    }

    /* renamed from: i */
    public Cursor m13015i(Class cls) {
        m13012f();
        EntityInfo entityInfoM12993v = this.f13203b.m12993v(cls);
        InterfaceC9047b interfaceC9047bMo6272g = entityInfoM12993v.mo6272g();
        long jNativeCreateCursor = nativeCreateCursor(this.f13202a, entityInfoM12993v.mo6275n(), cls);
        if (jNativeCreateCursor != 0) {
            return interfaceC9047bMo6272g.mo6269a(this, jNativeCreateCursor, this.f13203b);
        }
        throw new DbException("Could not create native cursor");
    }

    public boolean isClosed() {
        return this.f13207f;
    }

    public boolean isReadOnly() {
        return this.f13204c;
    }

    /* renamed from: j */
    public BoxStore m13016j() {
        return this.f13203b;
    }

    /* renamed from: k */
    public boolean m13017k() {
        m13012f();
        return nativeIsRecycled(this.f13202a);
    }

    /* renamed from: l */
    public void m13018l() {
        m13012f();
        nativeRecycle(this.f13202a);
    }

    /* renamed from: m */
    public void m13019m() {
        m13012f();
        this.f13206e = this.f13203b.f13176s;
        nativeRenew(this.f13202a);
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
        sb.append(Long.toString(this.f13202a, 16));
        sb.append(" (");
        sb.append(this.f13204c ? "read-only" : "write");
        sb.append(", initialCommitCount=");
        sb.append(this.f13206e);
        sb.append(")");
        return sb.toString();
    }
}

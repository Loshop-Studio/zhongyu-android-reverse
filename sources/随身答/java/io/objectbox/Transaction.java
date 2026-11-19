package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Closeable;
import p037c8.InterfaceC5267b;

/* loaded from: classes5.dex */
public class Transaction implements Closeable {

    /* renamed from: g */
    public static boolean f14015g;

    /* renamed from: a */
    public final long f14016a;

    /* renamed from: b */
    public final BoxStore f14017b;

    /* renamed from: c */
    public final boolean f14018c;

    /* renamed from: d */
    public final Throwable f14019d;

    /* renamed from: e */
    public int f14020e;

    /* renamed from: f */
    public volatile boolean f14021f;

    public Transaction(BoxStore boxStore, long j9, int i9) {
        this.f14017b = boxStore;
        this.f14016a = j9;
        this.f14020e = i9;
        this.f14018c = nativeIsReadOnly(j9);
        this.f14019d = f14015g ? new Throwable() : null;
    }

    /* renamed from: a */
    public void m13131a() {
        m13132c();
        nativeAbort(this.f14016a);
    }

    /* renamed from: c */
    public final void m13132c() {
        if (this.f14021f) {
            throw new IllegalStateException("Transaction is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.f14021f) {
                this.f14021f = true;
                this.f14017b.m13098L(this);
                if (!nativeIsOwnerThread(this.f14016a)) {
                    boolean zNativeIsActive = nativeIsActive(this.f14016a);
                    boolean zNativeIsRecycled = nativeIsRecycled(this.f14016a);
                    if (zNativeIsActive || zNativeIsRecycled) {
                        String str = " (initial commit count: " + this.f14020e + ").";
                        if (zNativeIsActive) {
                            System.err.println("Transaction is still active" + str);
                        } else {
                            System.out.println("Hint: use closeThreadResources() to avoid finalizing recycled transactions" + str);
                            System.out.flush();
                        }
                        if (this.f14019d != null) {
                            System.err.println("Transaction was initially created here:");
                            this.f14019d.printStackTrace();
                        }
                        System.err.flush();
                    }
                }
                if (!this.f14017b.isClosed()) {
                    nativeDestroy(this.f14016a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    /* renamed from: g */
    public void m13133g() {
        m13132c();
        this.f14017b.m13097K(this, nativeCommit(this.f14016a));
    }

    /* renamed from: h */
    public void m13134h() {
        m13133g();
        close();
    }

    /* renamed from: i */
    public Cursor m13135i(Class cls) {
        m13132c();
        EntityInfo entityInfoM13113v = this.f14017b.m13113v(cls);
        InterfaceC5267b interfaceC5267bMo7365i = entityInfoM13113v.mo7365i();
        long jNativeCreateCursor = nativeCreateCursor(this.f14016a, entityInfoM13113v.mo7368r(), cls);
        if (jNativeCreateCursor != 0) {
            return interfaceC5267bMo7365i.mo2405a(this, jNativeCreateCursor, this.f14017b);
        }
        throw new DbException("Could not create native cursor");
    }

    public boolean isClosed() {
        return this.f14021f;
    }

    public boolean isReadOnly() {
        return this.f14018c;
    }

    /* renamed from: j */
    public BoxStore m13136j() {
        return this.f14017b;
    }

    /* renamed from: k */
    public boolean m13137k() {
        m13132c();
        return nativeIsRecycled(this.f14016a);
    }

    /* renamed from: l */
    public void m13138l() {
        m13132c();
        nativeRecycle(this.f14016a);
    }

    /* renamed from: m */
    public void m13139m() {
        m13132c();
        this.f14020e = this.f14017b.f13990s;
        nativeRenew(this.f14016a);
    }

    public native void nativeAbort(long j9);

    public native int[] nativeCommit(long j9);

    public native long nativeCreateCursor(long j9, String str, Class<?> cls);

    public native long nativeCreateKeyValueCursor(long j9);

    public native void nativeDestroy(long j9);

    public native boolean nativeIsActive(long j9);

    public native boolean nativeIsOwnerThread(long j9);

    public native boolean nativeIsReadOnly(long j9);

    public native boolean nativeIsRecycled(long j9);

    public native void nativeRecycle(long j9);

    public native void nativeRenew(long j9);

    public native void nativeReset(long j9);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TX ");
        sb.append(Long.toString(this.f14016a, 16));
        sb.append(" (");
        sb.append(this.f14018c ? "read-only" : "write");
        sb.append(", initialCommitCount=");
        sb.append(this.f14020e);
        sb.append(")");
        return sb.toString();
    }
}

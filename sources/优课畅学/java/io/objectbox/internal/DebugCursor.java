package io.objectbox.internal;

import io.objectbox.Transaction;
import java.io.Closeable;

/* loaded from: classes5.dex */
public class DebugCursor implements Closeable {

    /* renamed from: a */
    public final Transaction f16960a;

    /* renamed from: b */
    public final long f16961b;

    /* renamed from: c */
    public boolean f16962c;

    public static native long nativeCreate(long j10);

    public static native void nativeDestroy(long j10);

    public static native byte[] nativeGet(long j10, byte[] bArr);

    public static native byte[] nativeSeekOrNext(long j10, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f16962c) {
            this.f16962c = true;
            Transaction transaction = this.f16960a;
            if (transaction != null && !transaction.m15398f().isClosed()) {
                nativeDestroy(this.f16961b);
            }
        }
    }

    public void finalize() throws Throwable {
        if (this.f16962c) {
            return;
        }
        close();
        super.finalize();
    }
}

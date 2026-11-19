package io.objectbox.internal;

import io.objectbox.Transaction;
import java.io.Closeable;

/* loaded from: classes5.dex */
public class DebugCursor implements Closeable {

    /* renamed from: a */
    public final Transaction f13215a;

    /* renamed from: b */
    public final long f13216b;

    /* renamed from: c */
    public boolean f13217c;

    public static native long nativeCreate(long j10);

    public static native void nativeDestroy(long j10);

    public static native byte[] nativeGet(long j10, byte[] bArr);

    public static native byte[] nativeSeekOrNext(long j10, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f13217c) {
            this.f13217c = true;
            Transaction transaction = this.f13215a;
            if (transaction != null && !transaction.m13016j().isClosed()) {
                nativeDestroy(this.f13216b);
            }
        }
    }

    public void finalize() throws Throwable {
        if (this.f13217c) {
            return;
        }
        close();
        super.finalize();
    }
}

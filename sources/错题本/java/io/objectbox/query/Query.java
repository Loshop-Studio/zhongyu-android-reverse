package io.objectbox.query;

import android.support.v4.media.AbstractC0037f;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.exception.DbException;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import p131o5.CallableC6271a;

/* loaded from: classes3.dex */
public class Query<T> implements Closeable {

    /* renamed from: a */
    public final C5696a f8970a;

    /* renamed from: b */
    public final BoxStore f8971b;

    /* renamed from: c */
    public final int f8972c;

    /* renamed from: d */
    public long f8973d;

    public Query(C5696a c5696a, long j7) {
        this.f8970a = c5696a;
        BoxStore boxStore = c5696a.f8922a;
        this.f8971b = boxStore;
        this.f8972c = boxStore.f8914r;
        this.f8973d = j7;
        new CopyOnWriteArraySet();
    }

    /* renamed from: a */
    public final Object m5060a(Callable callable) throws InterruptedException {
        BoxStore boxStore = this.f8971b;
        long j7 = boxStore.f8898b;
        int i = this.f8972c;
        if (i == 1) {
            return boxStore.m5019d(callable);
        }
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Illegal value of attempts: "));
        }
        long j8 = 10;
        DbException e = null;
        for (int i8 = 1; i8 <= i; i8++) {
            try {
                return boxStore.m5019d(callable);
            } catch (DbException e4) {
                e = e4;
                String strNativeDiagnose = BoxStore.nativeDiagnose(j7);
                System.err.println(i8 + " of " + i + " attempts of calling a read TX failed:");
                e.printStackTrace();
                System.err.println(strNativeDiagnose);
                System.err.flush();
                System.gc();
                System.runFinalization();
                BoxStore.nativeCleanStaleReadTransactions(j7);
                try {
                    Thread.sleep(j8);
                    j8 *= 2;
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                    throw e;
                }
            }
        }
        throw e;
    }

    /* renamed from: b */
    public final List m5061b() {
        return (List) m5060a(new CallableC6271a(this, 1));
    }

    /* renamed from: c */
    public final Object m5062c() {
        return m5060a(new CallableC6271a(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j7 = this.f8973d;
        if (j7 != 0) {
            this.f8973d = 0L;
            nativeDestroy(j7);
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public native void nativeDestroy(long j7);

    public native List<T> nativeFind(long j7, long j8, long j9, long j10) throws Exception;

    public native Object nativeFindUnique(long j7, long j8);
}

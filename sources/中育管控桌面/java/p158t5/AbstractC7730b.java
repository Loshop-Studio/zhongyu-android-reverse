package p158t5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p094io.CloseableKt;
import okhttp3.internal.platform.AbstractC7536c;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* renamed from: t5.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7730b implements InterfaceC7732d {

    /* renamed from: b */
    public final AtomicBoolean f10213b = new AtomicBoolean(false);

    /* renamed from: c */
    public final CountDownLatch f10214c = new CountDownLatch(1);

    /* renamed from: d */
    public ByteString f10215d;

    /* renamed from: e */
    public ByteString f10216e;

    @Override // p158t5.InterfaceC7732d
    /* renamed from: a */
    public void mo9213a() throws InterruptedException {
        if (this.f10213b.get() || !this.f10213b.compareAndSet(false, true)) {
            try {
                this.f10214c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m9216f();
        }
        if (this.f10215d != null) {
            return;
        }
        throw new IllegalStateException(("Unable to load " + mo9210c() + " resource.").toString());
    }

    @Override // p158t5.InterfaceC7732d
    /* renamed from: b */
    public ByteString mo9214b() {
        ByteString byteString = this.f10216e;
        if (byteString != null) {
            return byteString;
        }
        Intrinsics.throwUninitializedPropertyAccessException("exceptionBytes");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo9210c();

    /* renamed from: d */
    public abstract Source mo9211d();

    /* renamed from: e */
    public final void m9215e() {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(mo9211d());
            try {
                ByteString byteString = bufferedSourceBuffer.readByteString(bufferedSourceBuffer.readInt());
                ByteString byteString2 = bufferedSourceBuffer.readByteString(bufferedSourceBuffer.readInt());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSourceBuffer, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(byteString);
                    m9217g(byteString);
                    Intrinsics.checkNotNull(byteString2);
                    m9218h(byteString2);
                }
            } finally {
            }
        } finally {
            this.f10214c.countDown();
        }
    }

    /* renamed from: f */
    public final void m9216f() {
        boolean z6 = false;
        while (true) {
            try {
                try {
                    m9215e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z6 = true;
                } catch (IOException e6) {
                    AbstractC7536c.f9994a.m8931e().mo8919l("Failed to read public suffix list", 5, e6);
                    if (!z6) {
                        return;
                    }
                }
            } finally {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: g */
    public void m9217g(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.f10215d = byteString;
    }

    @Override // p158t5.InterfaceC7732d
    public ByteString getBytes() {
        ByteString byteString = this.f10215d;
        if (byteString != null) {
            return byteString;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bytes");
        return null;
    }

    /* renamed from: h */
    public void m9218h(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.f10216e = byteString;
    }
}

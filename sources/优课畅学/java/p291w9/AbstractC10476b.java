package p291w9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p123h7.C8736p;
import p256t7.AbstractC10117b;

/* renamed from: w9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10476b implements InterfaceC10478d {

    /* renamed from: b */
    public final AtomicBoolean f20812b = new AtomicBoolean(false);

    /* renamed from: c */
    public final CountDownLatch f20813c = new CountDownLatch(1);

    /* renamed from: d */
    public ByteString f20814d;

    /* renamed from: e */
    public ByteString f20815e;

    @Override // p291w9.InterfaceC10478d
    /* renamed from: a */
    public void mo19591a() throws InterruptedException {
        if (this.f20812b.get() || !this.f20812b.compareAndSet(false, true)) {
            try {
                this.f20813c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m19594f();
        }
        if (this.f20814d != null) {
            return;
        }
        throw new IllegalStateException(("Unable to load " + mo19588c() + " resource.").toString());
    }

    @Override // p291w9.InterfaceC10478d
    /* renamed from: b */
    public ByteString mo19592b() {
        ByteString byteString = this.f20815e;
        if (byteString != null) {
            return byteString;
        }
        AbstractC9133u.m16151y("exceptionBytes");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo19588c();

    /* renamed from: d */
    public abstract Source mo19589d();

    /* renamed from: e */
    public final void m19593e() {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(mo19589d());
            try {
                ByteString byteString = bufferedSourceBuffer.readByteString(bufferedSourceBuffer.readInt());
                ByteString byteString2 = bufferedSourceBuffer.readByteString(bufferedSourceBuffer.readInt());
                C8736p c8736p = C8736p.f16368a;
                AbstractC10117b.m18861a(bufferedSourceBuffer, null);
                synchronized (this) {
                    AbstractC9133u.m16130d(byteString);
                    m19595g(byteString);
                    AbstractC9133u.m16130d(byteString2);
                    m19596h(byteString2);
                }
            } finally {
            }
        } finally {
            this.f20813c.countDown();
        }
    }

    /* renamed from: f */
    public final void m19594f() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    m19593e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    AbstractC9570c.f19216a.m18112e().mo18100l("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: g */
    public void m19595g(ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<set-?>");
        this.f20814d = byteString;
    }

    @Override // p291w9.InterfaceC10478d
    public ByteString getBytes() {
        ByteString byteString = this.f20814d;
        if (byteString != null) {
            return byteString;
        }
        AbstractC9133u.m16151y("bytes");
        return null;
    }

    /* renamed from: h */
    public void m19596h(ByteString byteString) {
        AbstractC9133u.m16133g(byteString, "<set-?>");
        this.f20815e = byteString;
    }
}

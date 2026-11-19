package coil3.disk;

import androidx.navigation.C2861i;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;
import p139p7.AbstractC6396c;
import p170t7.C6607g;

/* renamed from: coil3.disk.g */
/* loaded from: classes2.dex */
public final class C3289g implements Sink {

    /* renamed from: a */
    public final /* synthetic */ int f1967a = 0;

    /* renamed from: b */
    public boolean f1968b;

    /* renamed from: c */
    public final Object f1969c;

    /* renamed from: d */
    public final Object f1970d;

    public C3289g(Sink sink, C2861i c2861i) {
        this.f1969c = sink;
        this.f1970d = c2861i;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1967a) {
            case 0:
                try {
                    ((Sink) this.f1969c).close();
                    break;
                } catch (IOException e) {
                    this.f1968b = true;
                    ((C2861i) this.f1970d).invoke(e);
                    return;
                }
            default:
                C6607g c6607g = (C6607g) this.f1970d;
                if (!this.f1968b) {
                    this.f1968b = true;
                    C6607g.m6251i(c6607g, (ForwardingTimeout) this.f1969c);
                    c6607g.f11036e = 3;
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1967a) {
            case 0:
                try {
                    ((Sink) this.f1969c).flush();
                    break;
                } catch (IOException e) {
                    this.f1968b = true;
                    ((C2861i) this.f1970d).invoke(e);
                    return;
                }
            default:
                if (!this.f1968b) {
                    ((C6607g) this.f1970d).f11035d.flush();
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        switch (this.f1967a) {
            case 0:
                return ((Sink) this.f1969c).getTimeout();
            default:
                return (ForwardingTimeout) this.f1969c;
        }
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j7) throws IOException {
        int i = this.f1967a;
        Object obj = this.f1970d;
        switch (i) {
            case 0:
                if (this.f1968b) {
                    source.skip(j7);
                    return;
                }
                try {
                    ((Sink) this.f1969c).write(source, j7);
                    return;
                } catch (IOException e) {
                    this.f1968b = true;
                    ((C2861i) obj).invoke(e);
                    return;
                }
            default:
                AbstractC5830k.m5330g(source, "source");
                if (this.f1968b) {
                    throw new IllegalStateException("closed");
                }
                long size = source.size();
                byte[] bArr = AbstractC6396c.f10486a;
                if (j7 < 0 || 0 > size || size < j7) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((C6607g) obj).f11035d.write(source, j7);
                return;
        }
    }

    public C3289g(C6607g c6607g) {
        this.f1970d = c6607g;
        this.f1969c = new ForwardingTimeout(c6607g.f11035d.getTimeout());
    }
}

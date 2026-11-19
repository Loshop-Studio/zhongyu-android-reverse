package p329s1;

import com.danikula.videocache.ProxyCacheException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: s1.k */
/* loaded from: classes3.dex */
public class C11044k {

    /* renamed from: a */
    public final ExecutorService f26662a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public final String f26663b;

    /* renamed from: c */
    public final int f26664c;

    /* renamed from: s1.k$b */
    public class b implements Callable {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C11044k.this.m24461f());
        }
    }

    public C11044k(String str, int i10) {
        this.f26663b = (String) AbstractC11045l.m24467d(str);
        this.f26664c = i10;
    }

    /* renamed from: b */
    public final List m24457b() {
        try {
            return ProxySelector.getDefault().select(new URI(m24458c()));
        } catch (URISyntaxException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    public final String m24458c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.f26663b, Integer.valueOf(this.f26664c), "ping");
    }

    /* renamed from: d */
    public boolean m24459d(String str) {
        return "ping".equals(str);
    }

    /* renamed from: e */
    public boolean m24460e(int i10, int i11) {
        AbstractC11045l.m24465b(i10 >= 1);
        AbstractC11045l.m24465b(i11 > 0);
        int i12 = 0;
        while (i12 < i10) {
            try {
            } catch (InterruptedException e10) {
                e = e10;
                AbstractC11039f.m24402b("Error pinging server due to unexpected error", e);
            } catch (ExecutionException e11) {
                e = e11;
                AbstractC11039f.m24402b("Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                AbstractC11039f.m24406f("Error pinging server (attempt: " + i12 + ", timeout: " + i11 + "). ");
            }
            if (((Boolean) this.f26662a.submit(new b()).get(i11, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i12++;
            i11 *= 2;
        }
        String str = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i12), Integer.valueOf(i11 / 2), m24457b());
        AbstractC11039f.m24402b(str, new ProxyCacheException(str));
        return false;
    }

    /* renamed from: f */
    public final boolean m24461f() {
        C11042i c11042i = new C11042i(m24458c(), null, null);
        try {
            try {
                byte[] bytes = "ping ok".getBytes();
                c11042i.mo24447a(0L);
                byte[] bArr = new byte[bytes.length];
                c11042i.read(bArr);
                boolean zEquals = Arrays.equals(bytes, bArr);
                AbstractC11039f.m24404d("Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
                return zEquals;
            } catch (ProxyCacheException e10) {
                AbstractC11039f.m24402b("Error reading ping response", e10);
                c11042i.close();
                return false;
            }
        } finally {
            c11042i.close();
        }
    }

    /* renamed from: g */
    public void m24462g(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }
}

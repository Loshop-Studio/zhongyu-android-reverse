package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC0489b0 {

    /* renamed from: a */
    private final Map<String, Object> f3402a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3403b = false;

    /* renamed from: b */
    private static void m2838b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* renamed from: a */
    final void m2839a() {
        this.f3403b = true;
        Map<String, Object> map = this.f3402a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f3402a.values().iterator();
                while (it.hasNext()) {
                    m2838b(it.next());
                }
            }
        }
        mo2639d();
    }

    /* renamed from: c */
    <T> T m2840c(String str) {
        T t3;
        Map<String, Object> map = this.f3402a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t3 = (T) this.f3402a.get(str);
        }
        return t3;
    }

    /* renamed from: d */
    protected void mo2639d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    <T> T m2841e(String str, T t3) throws IOException {
        Object obj;
        synchronized (this.f3402a) {
            obj = this.f3402a.get(str);
            if (obj == 0) {
                this.f3402a.put(str, t3);
            }
        }
        if (obj != 0) {
            t3 = obj;
        }
        if (this.f3403b) {
            m2838b(t3);
        }
        return t3;
    }
}

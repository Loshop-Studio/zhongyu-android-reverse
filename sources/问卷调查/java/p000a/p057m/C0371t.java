package p000a.p057m;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.m.t */
/* loaded from: classes.dex */
public class C0371t {

    /* renamed from: a */
    public final HashMap<String, AbstractC0367p> f2183a = new HashMap<>();

    /* renamed from: a */
    public final void m1295a() {
        for (AbstractC0367p abstractC0367p : this.f2183a.values()) {
            Map<String, Object> map = abstractC0367p.f2182a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : abstractC0367p.f2182a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            abstractC0367p.mo1072a();
        }
        this.f2183a.clear();
    }
}

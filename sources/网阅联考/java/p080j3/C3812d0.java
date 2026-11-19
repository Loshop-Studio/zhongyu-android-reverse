package p080j3;

import java.util.Objects;
import okhttp3.Protocol;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4522y;

/* renamed from: j3.d0 */
/* loaded from: classes2.dex */
public final class C3812d0 {

    /* renamed from: a */
    public final C4496a0 f4611a;

    /* renamed from: b */
    public final Object f4612b;

    /* renamed from: c */
    public final AbstractC4498b0 f4613c;

    public C3812d0(C4496a0 c4496a0, Object obj, AbstractC4498b0 abstractC4498b0) {
        this.f4611a = c4496a0;
        this.f4612b = obj;
        this.f4613c = abstractC4498b0;
    }

    /* renamed from: c */
    public static C3812d0 m5017c(AbstractC4498b0 abstractC4498b0, C4496a0 c4496a0) {
        Objects.requireNonNull(abstractC4498b0, "body == null");
        Objects.requireNonNull(c4496a0, "rawResponse == null");
        if (c4496a0.m5809k()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C3812d0(c4496a0, null, abstractC4498b0);
    }

    /* renamed from: g */
    public static C3812d0 m5018g(Object obj) {
        return m5019h(obj, new C4496a0.a().m5824g(200).m5830m("OK").m5833p(Protocol.HTTP_1_1).m5835r(new C4522y.a().m6149h("http://localhost/").m6143b()).m5820c());
    }

    /* renamed from: h */
    public static C3812d0 m5019h(Object obj, C4496a0 c4496a0) {
        Objects.requireNonNull(c4496a0, "rawResponse == null");
        if (c4496a0.m5809k()) {
            return new C3812d0(c4496a0, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m5020a() {
        return this.f4612b;
    }

    /* renamed from: b */
    public int m5021b() {
        return this.f4611a.m5804e();
    }

    /* renamed from: d */
    public AbstractC4498b0 m5022d() {
        return this.f4613c;
    }

    /* renamed from: e */
    public boolean m5023e() {
        return this.f4611a.m5809k();
    }

    /* renamed from: f */
    public String m5024f() {
        return this.f4611a.m5810l();
    }

    public String toString() {
        return this.f4611a.toString();
    }
}

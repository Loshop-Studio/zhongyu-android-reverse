package ne;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ne.a */
/* loaded from: classes6.dex */
public abstract class AbstractC10411a {

    /* renamed from: a */
    public final String f24772a;

    /* renamed from: b */
    public final boolean f24773b;

    /* renamed from: c */
    public C10414d f24774c;

    /* renamed from: d */
    public long f24775d;

    public AbstractC10411a(String name, boolean z10) {
        AbstractC9979u.m20294g(name, "name");
        this.f24772a = name;
        this.f24773b = z10;
        this.f24775d = -1L;
    }

    /* renamed from: a */
    public final boolean m21769a() {
        return this.f24773b;
    }

    /* renamed from: b */
    public final String m21770b() {
        return this.f24772a;
    }

    /* renamed from: c */
    public final long m21771c() {
        return this.f24775d;
    }

    /* renamed from: d */
    public final C10414d m21772d() {
        return this.f24774c;
    }

    /* renamed from: e */
    public final void m21773e(C10414d queue) {
        AbstractC9979u.m20294g(queue, "queue");
        C10414d c10414d = this.f24774c;
        if (c10414d == queue) {
            return;
        }
        if (c10414d != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f24774c = queue;
    }

    /* renamed from: f */
    public abstract long mo21774f();

    /* renamed from: g */
    public final void m21775g(long j10) {
        this.f24775d = j10;
    }

    public String toString() {
        return this.f24772a;
    }

    public /* synthetic */ AbstractC10411a(String str, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}

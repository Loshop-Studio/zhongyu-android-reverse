package p181m9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: m9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9343a {

    /* renamed from: a */
    public final String f18401a;

    /* renamed from: b */
    public final boolean f18402b;

    /* renamed from: c */
    public C9345c f18403c;

    /* renamed from: d */
    public long f18404d;

    public AbstractC9343a(String name, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        this.f18401a = name;
        this.f18402b = z10;
        this.f18404d = -1L;
    }

    /* renamed from: a */
    public final boolean m17171a() {
        return this.f18402b;
    }

    /* renamed from: b */
    public final String m17172b() {
        return this.f18401a;
    }

    /* renamed from: c */
    public final long m17173c() {
        return this.f18404d;
    }

    /* renamed from: d */
    public final C9345c m17174d() {
        return this.f18403c;
    }

    /* renamed from: e */
    public final void m17175e(C9345c queue) {
        AbstractC9133u.m16133g(queue, "queue");
        C9345c c9345c = this.f18403c;
        if (c9345c == queue) {
            return;
        }
        if (c9345c != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f18403c = queue;
    }

    /* renamed from: f */
    public abstract long mo17176f();

    /* renamed from: g */
    public final void m17177g(long j10) {
        this.f18404d = j10;
    }

    public String toString() {
        return this.f18401a;
    }

    public /* synthetic */ AbstractC9343a(String str, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}

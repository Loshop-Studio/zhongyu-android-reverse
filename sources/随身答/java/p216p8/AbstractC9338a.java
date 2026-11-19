package p216p8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9338a {

    /* renamed from: a */
    public final String f16215a;

    /* renamed from: b */
    public final boolean f16216b;

    /* renamed from: c */
    public C9341d f16217c;

    /* renamed from: d */
    public long f16218d;

    public AbstractC9338a(String name, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16215a = name;
        this.f16216b = z9;
        this.f16218d = -1L;
    }

    /* renamed from: a */
    public final boolean m15248a() {
        return this.f16216b;
    }

    /* renamed from: b */
    public final String m15249b() {
        return this.f16215a;
    }

    /* renamed from: c */
    public final long m15250c() {
        return this.f16218d;
    }

    /* renamed from: d */
    public final C9341d m15251d() {
        return this.f16217c;
    }

    /* renamed from: e */
    public final void m15252e(C9341d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        C9341d c9341d = this.f16217c;
        if (c9341d == queue) {
            return;
        }
        if (c9341d != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f16217c = queue;
    }

    /* renamed from: f */
    public abstract long mo15008f();

    /* renamed from: g */
    public final void m15253g(long j9) {
        this.f16218d = j9;
    }

    public String toString() {
        return this.f16215a;
    }

    public /* synthetic */ AbstractC9338a(String str, boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i9 & 2) != 0 ? true : z9);
    }
}

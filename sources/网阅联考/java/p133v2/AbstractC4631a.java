package p133v2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v2.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4631a {

    /* renamed from: a */
    public C4634d f5836a;

    /* renamed from: b */
    public long f5837b;

    /* renamed from: c */
    public final String f5838c;

    /* renamed from: d */
    public final boolean f5839d;

    public AbstractC4631a(String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5838c = name;
        this.f5839d = z3;
        this.f5837b = -1L;
    }

    /* renamed from: a */
    public final boolean m6419a() {
        return this.f5839d;
    }

    /* renamed from: b */
    public final String m6420b() {
        return this.f5838c;
    }

    /* renamed from: c */
    public final long m6421c() {
        return this.f5837b;
    }

    /* renamed from: d */
    public final C4634d m6422d() {
        return this.f5836a;
    }

    /* renamed from: e */
    public final void m6423e(C4634d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        C4634d c4634d = this.f5836a;
        if (c4634d == queue) {
            return;
        }
        if (!(c4634d == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f5836a = queue;
    }

    /* renamed from: f */
    public abstract long mo6424f();

    /* renamed from: g */
    public final void m6425g(long j4) {
        this.f5837b = j4;
    }

    public String toString() {
        return this.f5838c;
    }

    public /* synthetic */ AbstractC4631a(String str, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? true : z3);
    }
}

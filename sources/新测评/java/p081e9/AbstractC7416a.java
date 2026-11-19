package p081e9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7416a {

    /* renamed from: a */
    public final String f12093a;

    /* renamed from: b */
    public final boolean f12094b;

    /* renamed from: c */
    public C7419d f12095c;

    /* renamed from: d */
    public long f12096d;

    public AbstractC7416a(String name, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12093a = name;
        this.f12094b = z9;
        this.f12096d = -1L;
    }

    /* renamed from: a */
    public final boolean m11911a() {
        return this.f12094b;
    }

    /* renamed from: b */
    public final String m11912b() {
        return this.f12093a;
    }

    /* renamed from: c */
    public final long m11913c() {
        return this.f12096d;
    }

    /* renamed from: d */
    public final C7419d m11914d() {
        return this.f12095c;
    }

    /* renamed from: e */
    public final void m11915e(C7419d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        C7419d c7419d = this.f12095c;
        if (c7419d == queue) {
            return;
        }
        if (c7419d != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f12095c = queue;
    }

    /* renamed from: f */
    public abstract long mo11916f();

    /* renamed from: g */
    public final void m11917g(long j10) {
        this.f12096d = j10;
    }

    public String toString() {
        return this.f12093a;
    }

    public /* synthetic */ AbstractC7416a(String str, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z9);
    }
}

package p086j5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6598a {

    /* renamed from: a */
    public final String f8613a;

    /* renamed from: b */
    public final boolean f8614b;

    /* renamed from: c */
    public C6600c f8615c;

    /* renamed from: d */
    public long f8616d;

    public AbstractC6598a(String name, boolean z6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8613a = name;
        this.f8614b = z6;
        this.f8616d = -1L;
    }

    /* renamed from: a */
    public final boolean m7521a() {
        return this.f8614b;
    }

    /* renamed from: b */
    public final String m7522b() {
        return this.f8613a;
    }

    /* renamed from: c */
    public final long m7523c() {
        return this.f8616d;
    }

    /* renamed from: d */
    public final C6600c m7524d() {
        return this.f8615c;
    }

    /* renamed from: e */
    public final void m7525e(C6600c queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        C6600c c6600c = this.f8615c;
        if (c6600c == queue) {
            return;
        }
        if (c6600c != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f8615c = queue;
    }

    /* renamed from: f */
    public abstract long mo7526f();

    /* renamed from: g */
    public final void m7527g(long j6) {
        this.f8616d = j6;
    }

    public String toString() {
        return this.f8613a;
    }

    public /* synthetic */ AbstractC6598a(String str, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? true : z6);
    }
}

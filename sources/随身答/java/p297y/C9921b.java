package p297y;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* renamed from: y.b */
/* loaded from: classes3.dex */
public final class C9921b implements InterfaceC9933n {

    /* renamed from: a */
    public final Job f17751a;

    public /* synthetic */ C9921b(Job job) {
        this.f17751a = job;
    }

    /* renamed from: d */
    public static final /* synthetic */ C9921b m17005d(Job job) {
        return new C9921b(job);
    }

    /* renamed from: f */
    public static boolean m17007f(Job job, Object obj) {
        return (obj instanceof C9921b) && Intrinsics.areEqual(job, ((C9921b) obj).m17010i());
    }

    /* renamed from: g */
    public static int m17008g(Job job) {
        return job.hashCode();
    }

    /* renamed from: h */
    public static String m17009h(Job job) {
        return "BaseRequestDelegate(job=" + job + ')';
    }

    public boolean equals(Object obj) {
        return m17007f(this.f17751a, obj);
    }

    public int hashCode() {
        return m17008g(this.f17751a);
    }

    /* renamed from: i */
    public final /* synthetic */ Job m17010i() {
        return this.f17751a;
    }

    public String toString() {
        return m17009h(this.f17751a);
    }

    /* renamed from: e */
    public static Job m17006e(Job job) {
        return job;
    }
}

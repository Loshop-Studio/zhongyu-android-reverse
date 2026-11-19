package p290y;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* renamed from: y.b */
/* loaded from: classes3.dex */
public final class C9883b implements InterfaceC9893l {

    /* renamed from: a */
    public final Job f17517a;

    public /* synthetic */ C9883b(Job job) {
        this.f17517a = job;
    }

    /* renamed from: d */
    public static final /* synthetic */ C9883b m16604d(Job job) {
        return new C9883b(job);
    }

    /* renamed from: f */
    public static boolean m16606f(Job job, Object obj) {
        return (obj instanceof C9883b) && Intrinsics.areEqual(job, ((C9883b) obj).m16609i());
    }

    /* renamed from: g */
    public static int m16607g(Job job) {
        return job.hashCode();
    }

    /* renamed from: h */
    public static String m16608h(Job job) {
        return "BaseRequestDelegate(job=" + job + ')';
    }

    public boolean equals(Object obj) {
        return m16606f(this.f17517a, obj);
    }

    public int hashCode() {
        return m16607g(this.f17517a);
    }

    /* renamed from: i */
    public final /* synthetic */ Job m16609i() {
        return this.f17517a;
    }

    public String toString() {
        return m16608h(this.f17517a);
    }

    /* renamed from: e */
    public static Job m16605e(Job job) {
        return job;
    }
}

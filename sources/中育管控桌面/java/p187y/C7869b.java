package p187y;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* renamed from: y.b */
/* loaded from: classes3.dex */
public final class C7869b implements InterfaceC7881n {

    /* renamed from: a */
    public final Job f10490a;

    public /* synthetic */ C7869b(Job job) {
        this.f10490a = job;
    }

    /* renamed from: d */
    public static final /* synthetic */ C7869b m9561d(Job job) {
        return new C7869b(job);
    }

    /* renamed from: f */
    public static boolean m9563f(Job job, Object obj) {
        return (obj instanceof C7869b) && Intrinsics.areEqual(job, ((C7869b) obj).m9566i());
    }

    /* renamed from: g */
    public static int m9564g(Job job) {
        return job.hashCode();
    }

    /* renamed from: h */
    public static String m9565h(Job job) {
        return "BaseRequestDelegate(job=" + job + ')';
    }

    public boolean equals(Object obj) {
        return m9563f(this.f10490a, obj);
    }

    public int hashCode() {
        return m9564g(this.f10490a);
    }

    /* renamed from: i */
    public final /* synthetic */ Job m9566i() {
        return this.f10490a;
    }

    public String toString() {
        return m9565h(this.f10490a);
    }

    /* renamed from: e */
    public static Job m9562e(Job job) {
        return job;
    }
}

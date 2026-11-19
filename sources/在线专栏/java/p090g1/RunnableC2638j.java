package p090g1;

import androidx.work.WorkerParameters;
import p173y0.C3494i;

/* renamed from: g1.j */
/* loaded from: classes.dex */
public class RunnableC2638j implements Runnable {

    /* renamed from: a */
    private C3494i f10426a;

    /* renamed from: b */
    private String f10427b;

    /* renamed from: c */
    private WorkerParameters.C0809a f10428c;

    public RunnableC2638j(C3494i c3494i, String str, WorkerParameters.C0809a c0809a) {
        this.f10426a = c3494i;
        this.f10427b = str;
        this.f10428c = c0809a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10426a.m10610p().m10571k(this.f10427b, this.f10428c);
    }
}

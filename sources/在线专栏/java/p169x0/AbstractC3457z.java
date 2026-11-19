package p169x0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: x0.z */
/* loaded from: classes.dex */
public abstract class AbstractC3457z {

    /* renamed from: a */
    private static final String f12114a = AbstractC3445n.m10503f("WorkerFactory");

    /* renamed from: x0.z$a */
    class a extends AbstractC3457z {
        a() {
        }

        @Override // p169x0.AbstractC3457z
        /* renamed from: a */
        public ListenableWorker mo10550a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC3457z m10549c() {
        return new a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo10550a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker m10551b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorkerMo10550a = mo10550a(context, str, workerParameters);
        if (listenableWorkerMo10550a == null) {
            Class clsAsSubclass = null;
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC3445n.m10501c().mo10505b(f12114a, "Invalid class: " + str, th);
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerMo10550a = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC3445n.m10501c().mo10505b(f12114a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerMo10550a == null || !listenableWorkerMo10550a.isUsed()) {
            return listenableWorkerMo10550a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}

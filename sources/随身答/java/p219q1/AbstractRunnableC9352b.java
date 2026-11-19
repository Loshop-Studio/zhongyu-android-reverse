package p219q1;

/* renamed from: q1.b */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC9352b implements Runnable {

    /* renamed from: a */
    public final String f16250a;

    public AbstractRunnableC9352b(String str) {
        this.f16250a = str;
    }

    /* renamed from: a */
    public abstract void mo15295a();

    /* renamed from: b */
    public abstract void mo15296b();

    /* renamed from: c */
    public abstract void mo15297c(InterruptedException interruptedException);

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f16250a);
        try {
            try {
                mo15295a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                mo15297c(e10);
            }
        } finally {
            Thread.currentThread().setName(name);
            mo15296b();
        }
    }
}

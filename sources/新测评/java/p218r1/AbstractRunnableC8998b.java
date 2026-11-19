package p218r1;

/* renamed from: r1.b */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC8998b implements Runnable {

    /* renamed from: a */
    public final String f15401a;

    public AbstractRunnableC8998b(String str) {
        this.f15401a = str;
    }

    /* renamed from: a */
    public abstract void mo15114a();

    /* renamed from: b */
    public abstract void mo15115b();

    /* renamed from: c */
    public abstract void mo15116c(InterruptedException interruptedException);

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f15401a);
        try {
            try {
                mo15114a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                mo15116c(e10);
            }
        } finally {
            Thread.currentThread().setName(name);
            mo15115b();
        }
    }
}

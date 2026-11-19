package p068g7;

import androidx.collection.AbstractC0584a;
import kotlinx.coroutines.AbstractC6014x;

/* renamed from: g7.j */
/* loaded from: classes4.dex */
public final class C5614j extends AbstractRunnableC5613i {

    /* renamed from: c */
    public final Runnable f8737c;

    public C5614j(Runnable runnable, long j7, boolean z8) {
        super(j7, z8);
        this.f8737c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8737c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f8737c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC6014x.m5642m(runnable));
        sb.append(", ");
        sb.append(this.f8735a);
        sb.append(", ");
        return AbstractC0584a.m911l(']', this.f8736b ? "Blocking" : "Non-blocking", sb);
    }
}

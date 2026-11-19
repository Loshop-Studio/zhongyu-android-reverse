package p090g1;

import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import p085f1.C2520r;
import p169x0.C3453v;
import p169x0.C3455x;
import p173y0.C3494i;

/* renamed from: g1.k */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2639k<T> implements Runnable {

    /* renamed from: a */
    private final C0829d<T> f10429a = C0829d.m4279s();

    /* renamed from: g1.k$a */
    class a extends AbstractRunnableC2639k<List<C3453v>> {

        /* renamed from: b */
        final /* synthetic */ C3494i f10430b;

        /* renamed from: c */
        final /* synthetic */ C3455x f10431c;

        a(C3494i c3494i, C3455x c3455x) {
            this.f10430b = c3494i;
            this.f10431c = c3455x;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p090g1.AbstractRunnableC2639k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<C3453v> mo8847c() {
            return C2520r.f10164s.apply(this.f10430b.m10613s().mo4167I().mo8432a(C2636h.m8842b(this.f10431c)));
        }
    }

    /* renamed from: a */
    public static AbstractRunnableC2639k<List<C3453v>> m8845a(C3494i c3494i, C3455x c3455x) {
        return new a(c3494i, c3455x);
    }

    /* renamed from: b */
    public ListenableFuture<T> m8846b() {
        return this.f10429a;
    }

    /* renamed from: c */
    abstract T mo8847c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f10429a.mo4268o(mo8847c());
        } catch (Throwable th) {
            this.f10429a.mo4269p(th);
        }
    }
}

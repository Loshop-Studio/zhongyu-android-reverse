package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.j0 */
/* loaded from: classes4.dex */
public final class C5972j0 extends AbstractRunnableC5978l0 {

    /* renamed from: c */
    public final C5961g f9464c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC5984n0 f9465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5972j0(AbstractC5984n0 abstractC5984n0, long j7, C5961g c5961g) {
        super(j7);
        this.f9465d = abstractC5984n0;
        this.f9464c = c5961g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9464c.m5576C(this.f9465d);
    }

    @Override // kotlinx.coroutines.AbstractRunnableC5978l0
    public final String toString() {
        return super.toString() + this.f9464c;
    }
}

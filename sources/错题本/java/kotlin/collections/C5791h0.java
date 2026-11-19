package kotlin.collections;

/* renamed from: kotlin.collections.h0 */
/* loaded from: classes2.dex */
public final class C5791h0 extends AbstractC5777b {

    /* renamed from: c */
    public int f9184c;

    /* renamed from: d */
    public int f9185d;

    /* renamed from: e */
    public final /* synthetic */ C5793i0 f9186e;

    public C5791h0(C5793i0 c5793i0) {
        this.f9186e = c5793i0;
        this.f9184c = c5793i0.size();
        this.f9185d = c5793i0.f9189c;
    }

    @Override // kotlin.collections.AbstractC5777b
    /* renamed from: a */
    public final void mo5120a() {
        int i = this.f9184c;
        if (i == 0) {
            this.f9165a = 2;
            return;
        }
        C5793i0 c5793i0 = this.f9186e;
        Object[] objArr = c5793i0.f9187a;
        int i8 = this.f9185d;
        this.f9166b = objArr[i8];
        this.f9165a = 1;
        this.f9185d = (i8 + 1) % c5793i0.f9188b;
        this.f9184c = i - 1;
    }
}

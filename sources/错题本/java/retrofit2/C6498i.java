package retrofit2;

/* renamed from: retrofit2.i */
/* loaded from: classes4.dex */
public final class C6498i implements InterfaceC6496h {

    /* renamed from: a */
    public final /* synthetic */ int f10700a;

    /* renamed from: b */
    public final C6502k f10701b;

    public /* synthetic */ C6498i(C6502k c6502k, int i) {
        this.f10700a = i;
        this.f10701b = c6502k;
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: k */
    public final void mo117k(InterfaceC6490e interfaceC6490e, Throwable th) {
        switch (this.f10700a) {
            case 0:
                this.f10701b.completeExceptionally(th);
                break;
            default:
                this.f10701b.completeExceptionally(th);
                break;
        }
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: n */
    public final void mo120n(InterfaceC6490e interfaceC6490e, C6509n0 c6509n0) {
        switch (this.f10700a) {
            case 0:
                boolean zM5899b = c6509n0.f10762a.m5899b();
                C6502k c6502k = this.f10701b;
                if (!zM5899b) {
                    c6502k.completeExceptionally(new HttpException(c6509n0));
                    break;
                } else {
                    c6502k.complete(c6509n0.f10763b);
                    break;
                }
            default:
                this.f10701b.complete(c6509n0);
                break;
        }
    }
}

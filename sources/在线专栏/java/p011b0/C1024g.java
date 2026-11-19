package p011b0;

/* renamed from: b0.g */
/* loaded from: classes.dex */
public class C1024g<T> extends C1023f<T> {

    /* renamed from: c */
    private final Object f5702c;

    public C1024g(int i4) {
        super(i4);
        this.f5702c = new Object();
    }

    @Override // p011b0.C1023f, p011b0.InterfaceC1022e
    public T acquire() {
        T t3;
        synchronized (this.f5702c) {
            t3 = (T) super.acquire();
        }
        return t3;
    }

    @Override // p011b0.C1023f, p011b0.InterfaceC1022e
    public boolean release(T t3) {
        boolean zRelease;
        synchronized (this.f5702c) {
            zRelease = super.release(t3);
        }
        return zRelease;
    }
}

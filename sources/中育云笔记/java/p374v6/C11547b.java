package p374v6;

/* renamed from: v6.b */
/* loaded from: classes5.dex */
public class C11547b extends AbstractC11546a {

    /* renamed from: b */
    public final Object f27420b = new Object();

    @Override // p374v6.AbstractC11546a
    /* renamed from: a */
    public Object mo25405a() {
        Object objMo25405a;
        synchronized (this.f27420b) {
            objMo25405a = super.mo25405a();
        }
        return objMo25405a;
    }

    @Override // p374v6.AbstractC11546a
    /* renamed from: b */
    public void mo25406b() {
        synchronized (this.f27420b) {
            super.mo25406b();
        }
    }

    @Override // p374v6.AbstractC11546a
    /* renamed from: d */
    public boolean mo25408d(Object obj) {
        boolean zMo25408d;
        synchronized (this.f27420b) {
            zMo25408d = super.mo25408d(obj);
        }
        return zMo25408d;
    }
}

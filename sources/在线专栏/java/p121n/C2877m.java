package p121n;

import java.util.ArrayList;
import p117m.C2851c;

/* renamed from: n.m */
/* loaded from: classes.dex */
public class C2877m extends C2869e {

    /* renamed from: G0 */
    public ArrayList<C2869e> f11286G0 = new ArrayList<>();

    /* renamed from: L0 */
    public ArrayList<C2869e> m9884L0() {
        return this.f11286G0;
    }

    /* renamed from: M0 */
    public void mo9774M0() {
        ArrayList<C2869e> arrayList = this.f11286G0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2869e c2869e = this.f11286G0.get(i4);
            if (c2869e instanceof C2877m) {
                ((C2877m) c2869e).mo9774M0();
            }
        }
    }

    /* renamed from: N0 */
    public void m9885N0(C2869e c2869e) {
        this.f11286G0.remove(c2869e);
        c2869e.m9766x0(null);
    }

    /* renamed from: O0 */
    public void m9886O0() {
        this.f11286G0.clear();
    }

    @Override // p121n.C2869e
    /* renamed from: Z */
    public void mo9726Z() {
        this.f11286G0.clear();
        super.mo9726Z();
    }

    /* renamed from: b */
    public void m9887b(C2869e c2869e) {
        this.f11286G0.add(c2869e);
        if (c2869e.m9705H() != null) {
            ((C2877m) c2869e.m9705H()).m9885N0(c2869e);
        }
        c2869e.m9766x0(this);
    }

    @Override // p121n.C2869e
    /* renamed from: b0 */
    public void mo9728b0(C2851c c2851c) {
        super.mo9728b0(c2851c);
        int size = this.f11286G0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11286G0.get(i4).mo9728b0(c2851c);
        }
    }
}

package p000a.p022f.p025b.p026i;

import java.util.ArrayList;
import p000a.p022f.p025b.C0141c;

/* renamed from: a.f.b.i.k */
/* loaded from: classes.dex */
public class C0157k extends C0150d {

    /* renamed from: e0 */
    public ArrayList<C0150d> f1155e0 = new ArrayList<>();

    /* renamed from: E */
    public void mo616E() {
        ArrayList<C0150d> arrayList = this.f1155e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0150d c0150d = this.f1155e0.get(i);
            if (c0150d instanceof C0157k) {
                ((C0157k) c0150d).mo616E();
            }
        }
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: u */
    public void mo610u() {
        this.f1155e0.clear();
        super.mo610u();
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: v */
    public void mo611v(C0141c c0141c) {
        super.mo611v(c0141c);
        int size = this.f1155e0.size();
        for (int i = 0; i < size; i++) {
            this.f1155e0.get(i).mo611v(c0141c);
        }
    }
}

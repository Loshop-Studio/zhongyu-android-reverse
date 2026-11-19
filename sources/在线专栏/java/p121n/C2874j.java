package p121n;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: n.j */
/* loaded from: classes.dex */
public class C2874j extends C2869e implements InterfaceC2873i {

    /* renamed from: G0 */
    public C2869e[] f11270G0 = new C2869e[4];

    /* renamed from: H0 */
    public int f11271H0 = 0;

    @Override // p121n.InterfaceC2873i
    /* renamed from: a */
    public void mo9859a(C2870f c2870f) {
    }

    @Override // p121n.InterfaceC2873i
    /* renamed from: b */
    public void mo9860b(C2869e c2869e) {
        if (c2869e == this || c2869e == null) {
            return;
        }
        int i4 = this.f11271H0 + 1;
        C2869e[] c2869eArr = this.f11270G0;
        if (i4 > c2869eArr.length) {
            this.f11270G0 = (C2869e[]) Arrays.copyOf(c2869eArr, c2869eArr.length * 2);
        }
        C2869e[] c2869eArr2 = this.f11270G0;
        int i5 = this.f11271H0;
        c2869eArr2[i5] = c2869e;
        this.f11271H0 = i5 + 1;
    }

    @Override // p121n.InterfaceC2873i
    /* renamed from: c */
    public void mo9861c() {
        this.f11271H0 = 0;
        Arrays.fill(this.f11270G0, (Object) null);
    }

    @Override // p121n.C2869e
    /* renamed from: l */
    public void mo9668l(C2869e c2869e, HashMap<C2869e, C2869e> map) {
        super.mo9668l(c2869e, map);
        C2874j c2874j = (C2874j) c2869e;
        this.f11271H0 = 0;
        int i4 = c2874j.f11271H0;
        for (int i5 = 0; i5 < i4; i5++) {
            mo9860b(map.get(c2874j.f11270G0[i5]));
        }
    }
}

package p126h4;

import p083d4.InterfaceC7740a;

/* renamed from: h4.b */
/* loaded from: classes4.dex */
public class C8097b implements InterfaceC7740a {

    /* renamed from: a */
    public int f13805a;

    /* renamed from: b */
    public int f13806b;

    public C8097b(int i9, int i10) {
        this.f13805a = i9;
        this.f13806b = i10;
    }

    @Override // p083d4.InterfaceC7740a
    /* renamed from: a */
    public int mo12084a() {
        return (this.f13806b - this.f13805a) + 1;
    }

    @Override // p083d4.InterfaceC7740a
    public Object getItem(int i9) {
        if (i9 < 0 || i9 >= mo12084a()) {
            return 0;
        }
        return Integer.valueOf(this.f13805a + i9);
    }
}

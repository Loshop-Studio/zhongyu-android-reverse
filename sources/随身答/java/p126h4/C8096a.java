package p126h4;

import java.util.List;
import p083d4.InterfaceC7740a;

/* renamed from: h4.a */
/* loaded from: classes4.dex */
public class C8096a implements InterfaceC7740a {

    /* renamed from: a */
    public List f13804a;

    public C8096a(List list) {
        this.f13804a = list;
    }

    @Override // p083d4.InterfaceC7740a
    /* renamed from: a */
    public int mo12084a() {
        return this.f13804a.size();
    }

    @Override // p083d4.InterfaceC7740a
    public Object getItem(int i9) {
        return (i9 < 0 || i9 >= this.f13804a.size()) ? "" : this.f13804a.get(i9);
    }
}

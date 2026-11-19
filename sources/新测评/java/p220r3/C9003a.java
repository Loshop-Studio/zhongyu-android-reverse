package p220r3;

import java.util.List;
import p176n3.InterfaceC8620a;

/* renamed from: r3.a */
/* loaded from: classes4.dex */
public class C9003a implements InterfaceC8620a {

    /* renamed from: a */
    public List f15412a;

    public C9003a(List list) {
        this.f15412a = list;
    }

    @Override // p176n3.InterfaceC8620a
    /* renamed from: a */
    public int mo14192a() {
        return this.f15412a.size();
    }

    @Override // p176n3.InterfaceC8620a
    public Object getItem(int i10) {
        return (i10 < 0 || i10 >= this.f15412a.size()) ? "" : this.f15412a.get(i10);
    }
}

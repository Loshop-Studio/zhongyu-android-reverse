package p220r3;

import p176n3.InterfaceC8620a;

/* renamed from: r3.b */
/* loaded from: classes4.dex */
public class C9004b implements InterfaceC8620a {

    /* renamed from: a */
    public int f15413a;

    /* renamed from: b */
    public int f15414b;

    public C9004b(int i10, int i11) {
        this.f15413a = i10;
        this.f15414b = i11;
    }

    @Override // p176n3.InterfaceC8620a
    /* renamed from: a */
    public int mo14192a() {
        return (this.f15414b - this.f15413a) + 1;
    }

    @Override // p176n3.InterfaceC8620a
    public Object getItem(int i10) {
        if (i10 < 0 || i10 >= mo14192a()) {
            return 0;
        }
        return Integer.valueOf(this.f15413a + i10);
    }
}

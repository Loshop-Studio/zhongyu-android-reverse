package p135i8;

/* renamed from: i8.n0 */
/* loaded from: classes5.dex */
public final class C8858n0 implements InterfaceC8882v0 {

    /* renamed from: a */
    public final boolean f16525a;

    public C8858n0(boolean z10) {
        this.f16525a = z10;
    }

    @Override // p135i8.InterfaceC8882v0
    public C8844i1 getList() {
        return null;
    }

    @Override // p135i8.InterfaceC8882v0
    public boolean isActive() {
        return this.f16525a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

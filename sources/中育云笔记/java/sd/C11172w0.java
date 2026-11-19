package sd;

/* renamed from: sd.w0 */
/* loaded from: classes6.dex */
public final class C11172w0 implements InterfaceC11127j1 {

    /* renamed from: c */
    public final boolean f26835c;

    public C11172w0(boolean z10) {
        this.f26835c = z10;
    }

    @Override // sd.InterfaceC11127j1
    /* renamed from: b */
    public C11167u1 mo20474b() {
        return null;
    }

    @Override // sd.InterfaceC11127j1
    public boolean isActive() {
        return this.f26835c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}

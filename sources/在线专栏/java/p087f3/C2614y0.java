package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.y0 */
/* loaded from: classes.dex */
final class C2614y0 implements InterfaceC2558h1 {

    /* renamed from: a */
    private final boolean f10317a;

    public C2614y0(boolean z3) {
        this.f10317a = z3;
    }

    @Override // p087f3.InterfaceC2558h1
    @Nullable
    /* renamed from: a */
    public C2615y1 mo8563a() {
        return null;
    }

    @Override // p087f3.InterfaceC2558h1
    public boolean isActive() {
        return this.f10317a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2612x1;
import p087f3.InterfaceC2572l;
import p087f3.InterfaceC2590q0;
import p128o2.C2911d;
import p128o2.C2925r;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: classes.dex */
final class C2801p extends AbstractC2612x1 implements InterfaceC2590q0 {

    /* renamed from: b */
    @Nullable
    private final Throwable f10783b;

    /* renamed from: c */
    @Nullable
    private final String f10784c;

    public C2801p(@Nullable Throwable th, @Nullable String str) {
        this.f10783b = th;
        this.f10784c = str;
    }

    /* renamed from: O */
    private final Void m9338O() {
        String strM9248l;
        if (this.f10783b == null) {
            C2800o.m9336c();
            throw new C2911d();
        }
        String str = this.f10784c;
        String str2 = "";
        if (str != null && (strM9248l = C2769l.m9248l(". ", str)) != null) {
            str2 = strM9248l;
        }
        throw new IllegalStateException(C2769l.m9248l("Module with the Main dispatcher had failed to initialize", str2), this.f10783b);
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: K */
    public boolean mo2906K(@NotNull InterfaceC3015g interfaceC3015g) {
        m9338O();
        throw new C2911d();
    }

    @Override // p087f3.AbstractC2612x1
    @NotNull
    /* renamed from: L */
    public AbstractC2612x1 mo8757L() {
        return this;
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public Void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        m9338O();
        throw new C2911d();
    }

    @Override // p087f3.InterfaceC2590q0
    @NotNull
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Void mo8518y(long j4, @NotNull InterfaceC2572l<? super C2925r> interfaceC2572l) {
        m9338O();
        throw new C2911d();
    }

    @Override // p087f3.AbstractC2612x1, p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f10783b;
        sb.append(th != null ? C2769l.m9248l(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}

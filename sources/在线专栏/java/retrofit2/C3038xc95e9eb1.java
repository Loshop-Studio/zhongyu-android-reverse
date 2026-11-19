package retrofit2;

import kotlin.jvm.internal.AbstractC2770m;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes.dex */
final class C3038xc95e9eb1 extends AbstractC2770m implements InterfaceC3470l<Throwable, C2925r> {
    final /* synthetic */ Call $this_awaitResponse$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3038xc95e9eb1(Call call) {
        super(1);
        this.$this_awaitResponse$inlined = call;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        invoke2(th);
        return C2925r.f11415a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}

package p177w3;

import com.zykj.huiwei.launcher.api.GatewayService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w3.b */
/* loaded from: classes4.dex */
public final class C7812b {

    /* renamed from: a */
    public final GatewayService f10374a;

    public C7812b(GatewayService gatewayService) {
        Intrinsics.checkNotNullParameter(gatewayService, "gatewayService");
        this.f10374a = gatewayService;
    }

    /* renamed from: a */
    public final Object m9401a(String str, Continuation continuation) {
        return this.f10374a.gateway(str, continuation);
    }
}

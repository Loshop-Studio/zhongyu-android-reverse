package coil3.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher", m26211f = "NetworkFetcher.kt", m26212l = {245}, m26213m = "toImageSource")
/* loaded from: classes3.dex */
public final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3834c;

    /* renamed from: d */
    public Object f3835d;

    /* renamed from: e */
    public /* synthetic */ Object f3836e;

    /* renamed from: f */
    public final /* synthetic */ NetworkFetcher f3837f;

    /* renamed from: g */
    public int f3838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3837f = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3836e = obj;
        this.f3838g |= Integer.MIN_VALUE;
        return this.f3837f.m3215n(null, this);
    }
}

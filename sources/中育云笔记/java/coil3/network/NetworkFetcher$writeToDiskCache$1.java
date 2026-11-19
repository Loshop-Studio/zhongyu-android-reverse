package coil3.network;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher", m26211f = "NetworkFetcher.kt", m26212l = {138, Opcodes.IFEQ}, m26213m = "writeToDiskCache")
/* loaded from: classes3.dex */
public final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3839c;

    /* renamed from: d */
    public Object f3840d;

    /* renamed from: e */
    public Object f3841e;

    /* renamed from: f */
    public Object f3842f;

    /* renamed from: g */
    public Object f3843g;

    /* renamed from: h */
    public Object f3844h;

    /* renamed from: i */
    public Object f3845i;

    /* renamed from: j */
    public /* synthetic */ Object f3846j;

    /* renamed from: k */
    public final /* synthetic */ NetworkFetcher f3847k;

    /* renamed from: l */
    public int f3848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3847k = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3846j = obj;
        this.f3848l |= Integer.MIN_VALUE;
        return this.f3847k.m3219r(null, null, null, null, this);
    }
}

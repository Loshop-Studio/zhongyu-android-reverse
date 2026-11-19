package coil3.network;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher", m26211f = "NetworkFetcher.kt", m26212l = {61, PatchStatus.CODE_LOAD_COPY_FILE, 102}, m26213m = "fetch")
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3816c;

    /* renamed from: d */
    public Object f3817d;

    /* renamed from: e */
    public Object f3818e;

    /* renamed from: f */
    public Object f3819f;

    /* renamed from: g */
    public Object f3820g;

    /* renamed from: h */
    public /* synthetic */ Object f3821h;

    /* renamed from: i */
    public final /* synthetic */ NetworkFetcher f3822i;

    /* renamed from: j */
    public int f3823j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(NetworkFetcher networkFetcher, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3822i = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3821h = obj;
        this.f3823j |= Integer.MIN_VALUE;
        return this.f3822i.mo3208a(this);
    }
}

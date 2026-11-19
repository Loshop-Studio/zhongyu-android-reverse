package coil3.network;

import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import p207p.C9303p;
import p257u.C9652j;
import p257u.C9654l;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lu/l;", "response", "Lp/p;", "<anonymous>", "(Lu/l;)Lp/p;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", m13451f = "NetworkFetcher.kt", m13452i = {0, 1}, m13453l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION, 87}, m13454m = "invokeSuspend", m13455n = {"response", "response"}, m13456s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements Function2<C9654l, Continuation<? super C9303p>, Object> {

    /* renamed from: a */
    public Object f3052a;

    /* renamed from: b */
    public int f3053b;

    /* renamed from: c */
    public /* synthetic */ Object f3054c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f3055d;

    /* renamed from: e */
    public final /* synthetic */ NetworkFetcher f3056e;

    /* renamed from: f */
    public final /* synthetic */ Ref.ObjectRef f3057f;

    /* renamed from: g */
    public final /* synthetic */ C9652j f3058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref.ObjectRef objectRef, NetworkFetcher networkFetcher, Ref.ObjectRef objectRef2, C9652j c9652j, Continuation continuation) {
        super(2, continuation);
        this.f3055d = objectRef;
        this.f3056e = networkFetcher;
        this.f3057f = objectRef2;
        this.f3058g = c9652j;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9654l c9654l, Continuation continuation) {
        return ((NetworkFetcher$fetch$fetchResult$1) create(c9654l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.f3055d, this.f3056e, this.f3057f, this.f3058g, continuation);
        networkFetcher$fetch$fetchResult$1.f3054c = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, u.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

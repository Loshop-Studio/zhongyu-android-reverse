package coil3.network;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p159u.C7745l;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m7880d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lu/l;", "response", "<anonymous>"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m7918f = "NetworkFetcher.kt", m7919i = {0}, m7920l = {205}, m7921m = "invokeSuspend", m7922n = {"response"}, m7923s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements Function2<C7745l, Continuation<Object>, Object> {

    /* renamed from: a */
    public int f1822a;

    /* renamed from: b */
    public /* synthetic */ Object f1823b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f1824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$executeNetworkRequest$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f1824c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C7745l c7745l, Continuation continuation) {
        return ((NetworkFetcher$executeNetworkRequest$2) create(c7745l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.f1824c, continuation);
        networkFetcher$executeNetworkRequest$2.f1823b = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C7745l c7745l = (C7745l) this.f1823b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1822a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        int iM9242d = c7745l.m9242d();
        if ((200 > iM9242d || iM9242d >= 300) && c7745l.m9242d() != 304) {
            throw new HttpException(c7745l);
        }
        Function2 function2 = this.f1824c;
        this.f1823b = SpillingKt.nullOutSpilledVariable(c7745l);
        this.f1822a = 1;
        Object objInvoke = function2.invoke(c7745l, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}

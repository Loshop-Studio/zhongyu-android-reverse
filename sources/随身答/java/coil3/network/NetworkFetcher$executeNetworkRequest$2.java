package coil3.network;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p257u.C9654l;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13413d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lu/l;", "response", "<anonymous>"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m13451f = "NetworkFetcher.kt", m13452i = {}, m13453l = {205}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements Function2<C9654l, Continuation<Object>, Object> {

    /* renamed from: a */
    public int f3041a;

    /* renamed from: b */
    public /* synthetic */ Object f3042b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f3043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$executeNetworkRequest$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3043c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9654l c9654l, Continuation continuation) {
        return ((NetworkFetcher$executeNetworkRequest$2) create(c9654l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.f3043c, continuation);
        networkFetcher$executeNetworkRequest$2.f3042b = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f3041a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C9654l c9654l = (C9654l) this.f3042b;
        int iM15995d = c9654l.m15995d();
        if ((200 > iM15995d || iM15995d >= 300) && c9654l.m15995d() != 304) {
            throw new HttpException(c9654l);
        }
        Function2 function2 = this.f3043c;
        this.f3041a = 1;
        Object objInvoke = function2.invoke(c9654l, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}

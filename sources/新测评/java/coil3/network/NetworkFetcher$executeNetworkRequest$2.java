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
import p249u.C9526l;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13558d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lu/l;", "response", "<anonymous>"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m13596f = "NetworkFetcher.kt", m13597i = {0}, m13598l = {205}, m13599m = "invokeSuspend", m13600n = {"response"}, m13601s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements Function2<C9526l, Continuation<Object>, Object> {

    /* renamed from: a */
    public int f3138a;

    /* renamed from: b */
    public /* synthetic */ Object f3139b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f3140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$executeNetworkRequest$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3140c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9526l c9526l, Continuation continuation) {
        return ((NetworkFetcher$executeNetworkRequest$2) create(c9526l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.f3140c, continuation);
        networkFetcher$executeNetworkRequest$2.f3139b = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C9526l c9526l = (C9526l) this.f3139b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f3138a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        int iM15892d = c9526l.m15892d();
        if ((200 > iM15892d || iM15892d >= 300) && c9526l.m15892d() != 304) {
            throw new HttpException(c9526l);
        }
        Function2 function2 = this.f3140c;
        this.f3139b = SpillingKt.nullOutSpilledVariable(c9526l);
        this.f3138a = 1;
        Object objInvoke = function2.invoke(c9526l, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}

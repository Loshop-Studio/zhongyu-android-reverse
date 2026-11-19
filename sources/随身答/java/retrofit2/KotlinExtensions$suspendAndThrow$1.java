package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13411bv = {1, 0, 3}, m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, m13413d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m13414k = 3, m13415mv = {1, 1, 15})
@DebugMetadata(m13450c = "retrofit2.KotlinExtensions", m13451f = "KotlinExtensions.kt", m13452i = {0}, m13453l = {113}, m13454m = "suspendAndThrow", m13455n = {"$this$suspendAndThrow"}, m13456s = {"L$0"})
/* loaded from: classes5.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f16491a;

    /* renamed from: b */
    public int f16492b;

    /* renamed from: c */
    public Object f16493c;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16491a = obj;
        this.f16492b |= Integer.MIN_VALUE;
        return KotlinExtensions.m15624d(null, this);
    }
}

package kotlinx.serialization.json.internal;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p045d6.AbstractC5426b;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p125n7.AbstractC6235j;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Ld6/b;", "Ld6/s;", "Ln7/j;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m5303f = "JsonTreeReader.kt", m5304i = {}, m5305l = {115}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC6474f {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6036q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(C6036q c6036q, InterfaceC5631c<? super JsonTreeReader$readDeepRecursive$1> interfaceC5631c) {
        super(3, interfaceC5631c);
        this.this$0 = c6036q;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(AbstractC5426b abstractC5426b, C5443s c5443s, InterfaceC5631c<? super AbstractC6235j> interfaceC5631c) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, interfaceC5631c);
        jsonTreeReader$readDeepRecursive$1.L$0 = abstractC5426b;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            AbstractC5426b abstractC5426b = (AbstractC5426b) this.L$0;
            byte bM5722q = this.this$0.f9574a.m5722q();
            if (bM5722q == 1) {
                return this.this$0.m5704d(true);
            }
            if (bM5722q == 0) {
                return this.this$0.m5704d(false);
            }
            if (bM5722q != 6) {
                if (bM5722q == 8) {
                    return this.this$0.m5703c();
                }
                C6043x.m5706m(this.this$0.f9574a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            C6036q c6036q = this.this$0;
            this.label = 1;
            obj = C6036q.m5701a(c6036q, abstractC5426b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return (AbstractC6235j) obj;
    }
}

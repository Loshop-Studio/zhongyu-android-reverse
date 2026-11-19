package coil3.intercept;

import coil3.AbstractC5453b;
import coil3.C5452a;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p253n.C10286p;
import p309qc.C10786q;
import p380w.C11627g;
import p380w.C11634n;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m26211f = "EngineInterceptor.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3727c;

    /* renamed from: d */
    public final /* synthetic */ EngineInterceptor f3728d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef f3729e;

    /* renamed from: f */
    public final /* synthetic */ Ref$ObjectRef f3730f;

    /* renamed from: g */
    public final /* synthetic */ C11627g f3731g;

    /* renamed from: h */
    public final /* synthetic */ Object f3732h;

    /* renamed from: i */
    public final /* synthetic */ Ref$ObjectRef f3733i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC5453b f3734j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, C11627g c11627g, Object obj, Ref$ObjectRef ref$ObjectRef3, AbstractC5453b abstractC5453b, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3728d = engineInterceptor;
        this.f3729e = ref$ObjectRef;
        this.f3730f = ref$ObjectRef2;
        this.f3731g = c11627g;
        this.f3732h = obj;
        this.f3733i = ref$ObjectRef3;
        this.f3734j = abstractC5453b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new EngineInterceptor$execute$executeResult$1(this.f3728d, this.f3729e, this.f3730f, this.f3731g, this.f3732h, this.f3733i, this.f3734j, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3727c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        EngineInterceptor engineInterceptor = this.f3728d;
        C10286p c10286p = (C10286p) this.f3729e.f23402c;
        C5452a c5452a = (C5452a) this.f3730f.f23402c;
        C11627g c11627g = this.f3731g;
        Object obj2 = this.f3732h;
        C11634n c11634n = (C11634n) this.f3733i.f23402c;
        AbstractC5453b abstractC5453b = this.f3734j;
        this.f3727c = 1;
        Object objM3175g = engineInterceptor.m3175g(c10286p, c5452a, c11627g, obj2, c11634n, abstractC5453b, this);
        return objM3175g == objM25952f ? objM25952f : objM3175g;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((EngineInterceptor$execute$executeResult$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}

package coil3.intercept;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor", m26211f = "EngineInterceptor.kt", m26212l = {Opcodes.RET}, m26213m = "fetch")
/* loaded from: classes3.dex */
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3735c;

    /* renamed from: d */
    public Object f3736d;

    /* renamed from: e */
    public Object f3737e;

    /* renamed from: f */
    public Object f3738f;

    /* renamed from: g */
    public Object f3739g;

    /* renamed from: h */
    public Object f3740h;

    /* renamed from: i */
    public Object f3741i;

    /* renamed from: j */
    public int f3742j;

    /* renamed from: k */
    public /* synthetic */ Object f3743k;

    /* renamed from: l */
    public final /* synthetic */ EngineInterceptor f3744l;

    /* renamed from: m */
    public int f3745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3744l = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3743k = obj;
        this.f3745m |= Integer.MIN_VALUE;
        return this.f3744l.m3177i(null, null, null, null, null, this);
    }
}

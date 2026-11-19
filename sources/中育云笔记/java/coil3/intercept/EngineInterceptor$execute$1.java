package coil3.intercept;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor", m26211f = "EngineInterceptor.kt", m26212l = {Opcodes.IAND, 130, Opcodes.LCMP}, m26213m = "execute")
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3716c;

    /* renamed from: d */
    public Object f3717d;

    /* renamed from: e */
    public Object f3718e;

    /* renamed from: f */
    public Object f3719f;

    /* renamed from: g */
    public Object f3720g;

    /* renamed from: h */
    public Object f3721h;

    /* renamed from: i */
    public Object f3722i;

    /* renamed from: j */
    public Object f3723j;

    /* renamed from: k */
    public /* synthetic */ Object f3724k;

    /* renamed from: l */
    public final /* synthetic */ EngineInterceptor f3725l;

    /* renamed from: m */
    public int f3726m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3725l = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3724k = obj;
        this.f3726m |= Integer.MIN_VALUE;
        return this.f3725l.m3176h(null, null, null, null, this);
    }
}

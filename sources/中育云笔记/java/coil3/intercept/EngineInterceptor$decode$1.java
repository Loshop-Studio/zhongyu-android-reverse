package coil3.intercept;

import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor", m26211f = "EngineInterceptor.kt", m26212l = {ComposerKt.providerValuesKey}, m26213m = "decode")
/* loaded from: classes3.dex */
public final class EngineInterceptor$decode$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3704c;

    /* renamed from: d */
    public Object f3705d;

    /* renamed from: e */
    public Object f3706e;

    /* renamed from: f */
    public Object f3707f;

    /* renamed from: g */
    public Object f3708g;

    /* renamed from: h */
    public Object f3709h;

    /* renamed from: i */
    public Object f3710i;

    /* renamed from: j */
    public Object f3711j;

    /* renamed from: k */
    public int f3712k;

    /* renamed from: l */
    public /* synthetic */ Object f3713l;

    /* renamed from: m */
    public final /* synthetic */ EngineInterceptor f3714m;

    /* renamed from: n */
    public int f3715n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3714m = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3713l = obj;
        this.f3715n |= Integer.MIN_VALUE;
        return this.f3714m.m3175g(null, null, null, null, null, null, this);
    }
}

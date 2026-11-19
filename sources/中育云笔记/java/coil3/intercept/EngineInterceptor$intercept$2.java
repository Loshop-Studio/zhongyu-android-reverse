package coil3.intercept;

import coil3.AbstractC5453b;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5477a;
import coil3.util.AbstractC5490c;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p212k.InterfaceC9756j;
import p309qc.C10786q;
import p312r.InterfaceC10825d;
import p380w.C11627g;
import p380w.C11634n;
import p380w.C11638r;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.intercept.EngineInterceptor$intercept$2", m26211f = "EngineInterceptor.kt", m26212l = {77}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3759c;

    /* renamed from: d */
    public final /* synthetic */ EngineInterceptor f3760d;

    /* renamed from: e */
    public final /* synthetic */ C11627g f3761e;

    /* renamed from: f */
    public final /* synthetic */ Object f3762f;

    /* renamed from: g */
    public final /* synthetic */ C11634n f3763g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC5453b f3764h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC10825d.b f3765i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC5477a.a f3766j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, C11627g c11627g, Object obj, C11634n c11634n, AbstractC5453b abstractC5453b, InterfaceC10825d.b bVar, InterfaceC5477a.a aVar, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3760d = engineInterceptor;
        this.f3761e = c11627g;
        this.f3762f = obj;
        this.f3763g = c11634n;
        this.f3764h = abstractC5453b;
        this.f3765i = bVar;
        this.f3766j = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new EngineInterceptor$intercept$2(this.f3760d, this.f3761e, this.f3762f, this.f3763g, this.f3764h, this.f3765i, this.f3766j, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3176h;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3759c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            EngineInterceptor engineInterceptor = this.f3760d;
            C11627g c11627g = this.f3761e;
            Object obj2 = this.f3762f;
            C11634n c11634n = this.f3763g;
            AbstractC5453b abstractC5453b = this.f3764h;
            this.f3759c = 1;
            objM3176h = engineInterceptor.m3176h(c11627g, obj2, c11634n, abstractC5453b, this);
            if (objM3176h == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            objM3176h = obj;
        }
        EngineInterceptor.C5476b c5476b = (EngineInterceptor.C5476b) objM3176h;
        this.f3760d.f3697b.mo58a();
        boolean zM23303h = this.f3760d.f3699d.m23303h(this.f3765i, this.f3761e, c5476b);
        InterfaceC9756j interfaceC9756jM3182e = c5476b.m3182e();
        C11627g c11627g2 = this.f3761e;
        DataSource dataSourceM3180c = c5476b.m3180c();
        InterfaceC10825d.b bVar = this.f3765i;
        if (!zM23303h) {
            bVar = null;
        }
        return new C11638r(interfaceC9756jM3182e, c11627g2, dataSourceM3180c, bVar, c5476b.m3181d(), c5476b.m3183f(), AbstractC5490c.m3315o(this.f3766j));
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((EngineInterceptor$intercept$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}

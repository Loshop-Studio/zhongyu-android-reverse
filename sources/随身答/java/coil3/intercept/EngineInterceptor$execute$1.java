package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor", m13451f = "EngineInterceptor.kt", m13452i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, m13453l = {126, 130, 148}, m13454m = "execute", m13455n = {"request", "mappedData", "eventListener", "options", "components", "fetchResult", "request", "eventListener", "options", "fetchResult"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2966a;

    /* renamed from: b */
    public Object f2967b;

    /* renamed from: c */
    public Object f2968c;

    /* renamed from: d */
    public Object f2969d;

    /* renamed from: e */
    public Object f2970e;

    /* renamed from: f */
    public Object f2971f;

    /* renamed from: g */
    public Object f2972g;

    /* renamed from: h */
    public /* synthetic */ Object f2973h;

    /* renamed from: i */
    public final /* synthetic */ EngineInterceptor f2974i;

    /* renamed from: j */
    public int f2975j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f2974i = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2973h = obj;
        this.f2975j |= Integer.MIN_VALUE;
        return this.f2974i.m2805h(null, null, null, null, this);
    }
}

package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor", m13451f = "EngineInterceptor.kt", m13452i = {0, 0, 0, 0, 0, 0, 0}, m13453l = {169}, m13454m = "fetch", m13455n = {"components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2984a;

    /* renamed from: b */
    public Object f2985b;

    /* renamed from: c */
    public Object f2986c;

    /* renamed from: d */
    public Object f2987d;

    /* renamed from: e */
    public Object f2988e;

    /* renamed from: f */
    public Object f2989f;

    /* renamed from: g */
    public int f2990g;

    /* renamed from: h */
    public /* synthetic */ Object f2991h;

    /* renamed from: i */
    public final /* synthetic */ EngineInterceptor f2992i;

    /* renamed from: j */
    public int f2993j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f2992i = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2991h = obj;
        this.f2993j |= Integer.MIN_VALUE;
        return this.f2992i.m2806i(null, null, null, null, null, this);
    }
}

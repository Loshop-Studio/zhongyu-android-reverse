package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptorKt", m13451f = "EngineInterceptor.kt", m13452i = {0, 0, 0, 0, 0, 0}, m13453l = {259}, m13454m = "transform", m13455n = {"result", "request", "options", "eventListener", "$this$foldIndices$iv", "i$iv"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptorKt$transform$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3006a;

    /* renamed from: b */
    public Object f3007b;

    /* renamed from: c */
    public Object f3008c;

    /* renamed from: d */
    public Object f3009d;

    /* renamed from: e */
    public Object f3010e;

    /* renamed from: f */
    public int f3011f;

    /* renamed from: g */
    public int f3012g;

    /* renamed from: h */
    public /* synthetic */ Object f3013h;

    /* renamed from: i */
    public int f3014i;

    public EngineInterceptorKt$transform$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3013h = obj;
        this.f3014i |= Integer.MIN_VALUE;
        return EngineInterceptorKt.m2813a(null, null, null, null, null, this);
    }
}

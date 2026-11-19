package coil3.intercept;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor", m13451f = "EngineInterceptor.kt", m13452i = {0, 0, 0, 0, 0, 0, 0, 0}, m13453l = {ComposerKt.providerValuesKey}, m13454m = "decode", m13455n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2955a;

    /* renamed from: b */
    public Object f2956b;

    /* renamed from: c */
    public Object f2957c;

    /* renamed from: d */
    public Object f2958d;

    /* renamed from: e */
    public Object f2959e;

    /* renamed from: f */
    public Object f2960f;

    /* renamed from: g */
    public Object f2961g;

    /* renamed from: h */
    public int f2962h;

    /* renamed from: i */
    public /* synthetic */ Object f2963i;

    /* renamed from: j */
    public final /* synthetic */ EngineInterceptor f2964j;

    /* renamed from: k */
    public int f2965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f2964j = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2963i = obj;
        this.f2965k |= Integer.MIN_VALUE;
        return this.f2964j.m2804g(null, null, null, null, null, null, this);
    }
}

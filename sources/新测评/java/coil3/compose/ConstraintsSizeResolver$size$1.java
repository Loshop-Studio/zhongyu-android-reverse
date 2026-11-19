package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.compose.ConstraintsSizeResolver", m13596f = "ConstraintsSizeResolver.kt", m13597i = {0, 0}, m13598l = {77}, m13599m = "size", m13600n = {"continuation", "$i$f$suspendCancellableCoroutine"}, m13601s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver$size$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2873a;

    /* renamed from: b */
    public int f2874b;

    /* renamed from: c */
    public /* synthetic */ Object f2875c;

    /* renamed from: d */
    public final /* synthetic */ ConstraintsSizeResolver f2876d;

    /* renamed from: e */
    public int f2877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver$size$1(ConstraintsSizeResolver constraintsSizeResolver, Continuation continuation) {
        super(continuation);
        this.f2876d = constraintsSizeResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2875c = obj;
        this.f2877e |= Integer.MIN_VALUE;
        return this.f2876d.mo2933a(this);
    }
}

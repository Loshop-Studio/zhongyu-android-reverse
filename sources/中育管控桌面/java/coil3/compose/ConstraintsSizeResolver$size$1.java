package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.compose.ConstraintsSizeResolver", m7918f = "ConstraintsSizeResolver.kt", m7919i = {0, 0}, m7920l = {77}, m7921m = "size", m7922n = {"continuation", "$i$f$suspendCancellableCoroutine"}, m7923s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver$size$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1557a;

    /* renamed from: b */
    public int f1558b;

    /* renamed from: c */
    public /* synthetic */ Object f1559c;

    /* renamed from: d */
    public final /* synthetic */ ConstraintsSizeResolver f1560d;

    /* renamed from: e */
    public int f1561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver$size$1(ConstraintsSizeResolver constraintsSizeResolver, Continuation continuation) {
        super(continuation);
        this.f1560d = constraintsSizeResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1559c = obj;
        this.f1561e |= Integer.MIN_VALUE;
        return this.f1560d.mo1764a(this);
    }
}

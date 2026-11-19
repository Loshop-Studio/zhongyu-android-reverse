package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "retrofit2.KotlinExtensions", m13596f = "KotlinExtensions.kt", m13597i = {0}, m13598l = {119}, m13599m = "suspendAndThrow", m13600n = {"$this$suspendAndThrow"}, m13601s = {"L$0"})
/* loaded from: classes5.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f15721a;

    /* renamed from: b */
    public /* synthetic */ Object f15722b;

    /* renamed from: c */
    public int f15723c;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15722b = obj;
        this.f15723c |= Integer.MIN_VALUE;
        return KotlinExtensions.m15343e(null, this);
    }
}

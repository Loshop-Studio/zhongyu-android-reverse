package coil3.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.util.LifecyclesKt", m13596f = "lifecycles.kt", m13597i = {0, 0, 0}, m13598l = {42}, m13599m = "awaitStarted", m13600n = {"$this$awaitStarted", "observer", "$i$f$suspendCancellableCoroutine"}, m13601s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3253a;

    /* renamed from: b */
    public Object f3254b;

    /* renamed from: c */
    public int f3255c;

    /* renamed from: d */
    public /* synthetic */ Object f3256d;

    /* renamed from: e */
    public int f3257e;

    public LifecyclesKt$awaitStarted$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3256d = obj;
        this.f3257e |= Integer.MIN_VALUE;
        return LifecyclesKt.m3195a(null, this);
    }
}

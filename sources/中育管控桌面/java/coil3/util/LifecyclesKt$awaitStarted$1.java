package coil3.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.util.LifecyclesKt", m7918f = "lifecycles.kt", m7919i = {0, 0, 0}, m7920l = {42}, m7921m = "awaitStarted", m7922n = {"$this$awaitStarted", "observer", "$i$f$suspendCancellableCoroutine"}, m7923s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1937a;

    /* renamed from: b */
    public Object f1938b;

    /* renamed from: c */
    public int f1939c;

    /* renamed from: d */
    public /* synthetic */ Object f1940d;

    /* renamed from: e */
    public int f1941e;

    public LifecyclesKt$awaitStarted$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1940d = obj;
        this.f1941e |= Integer.MIN_VALUE;
        return LifecyclesKt.m2021a(null, this);
    }
}

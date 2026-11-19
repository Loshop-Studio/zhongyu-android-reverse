package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 1, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "retrofit2.KotlinExtensions", m7918f = "KotlinExtensions.kt", m7919i = {0}, m7920l = {119}, m7921m = "suspendAndThrow", m7922n = {"$this$suspendAndThrow"}, m7923s = {"L$0"})
/* loaded from: classes4.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f10130a;

    /* renamed from: b */
    public /* synthetic */ Object f10131b;

    /* renamed from: c */
    public int f10132c;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10131b = obj;
        this.f10132c |= Integer.MIN_VALUE;
        return KotlinExtensions.m9119e(null, this);
    }
}

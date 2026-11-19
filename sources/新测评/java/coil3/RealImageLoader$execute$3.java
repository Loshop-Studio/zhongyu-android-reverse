package coil3;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.RealImageLoader", m13596f = "RealImageLoader.kt", m13597i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, m13598l = {117, 129, 133}, m13599m = "execute", m13600n = {"initialRequest", "requestDelegate", "request", "eventListener", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "initialRequest", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "sizeResolver", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "initialRequest", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "sizeResolver", "size", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY}, m13601s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$3 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2785a;

    /* renamed from: b */
    public Object f2786b;

    /* renamed from: c */
    public Object f2787c;

    /* renamed from: d */
    public Object f2788d;

    /* renamed from: e */
    public Object f2789e;

    /* renamed from: f */
    public Object f2790f;

    /* renamed from: g */
    public Object f2791g;

    /* renamed from: h */
    public int f2792h;

    /* renamed from: i */
    public /* synthetic */ Object f2793i;

    /* renamed from: j */
    public final /* synthetic */ RealImageLoader f2794j;

    /* renamed from: k */
    public int f2795k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, Continuation continuation) {
        super(continuation);
        this.f2794j = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2793i = obj;
        this.f2795k |= Integer.MIN_VALUE;
        return this.f2794j.m2822h(null, 0, this);
    }
}

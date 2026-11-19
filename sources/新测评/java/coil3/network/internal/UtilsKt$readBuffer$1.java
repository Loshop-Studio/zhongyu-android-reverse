package coil3.network.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.internal.UtilsKt", m13596f = "utils.kt", m13597i = {0, 0, 0, 0}, m13598l = {31}, m13599m = "readBuffer", m13600n = {"$this$readBuffer", "body", "buffer", "$i$a$-use-UtilsKt$readBuffer$2"}, m13601s = {"L$0", "L$2", "L$3", "I$0"})
/* loaded from: classes3.dex */
public final class UtilsKt$readBuffer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3187a;

    /* renamed from: b */
    public Object f3188b;

    /* renamed from: c */
    public Object f3189c;

    /* renamed from: d */
    public Object f3190d;

    /* renamed from: e */
    public int f3191e;

    /* renamed from: f */
    public /* synthetic */ Object f3192f;

    /* renamed from: g */
    public int f3193g;

    public UtilsKt$readBuffer$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3192f = obj;
        this.f3193g |= Integer.MIN_VALUE;
        return UtilsKt.m3159e(null, this);
    }
}

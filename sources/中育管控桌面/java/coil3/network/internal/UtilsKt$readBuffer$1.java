package coil3.network.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.network.internal.UtilsKt", m7918f = "utils.kt", m7919i = {0, 0, 0, 0}, m7920l = {31}, m7921m = "readBuffer", m7922n = {"$this$readBuffer", "body", "buffer", "$i$a$-use-UtilsKt$readBuffer$2"}, m7923s = {"L$0", "L$2", "L$3", "I$0"})
/* loaded from: classes3.dex */
public final class UtilsKt$readBuffer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1871a;

    /* renamed from: b */
    public Object f1872b;

    /* renamed from: c */
    public Object f1873c;

    /* renamed from: d */
    public Object f1874d;

    /* renamed from: e */
    public int f1875e;

    /* renamed from: f */
    public /* synthetic */ Object f1876f;

    /* renamed from: g */
    public int f1877g;

    public UtilsKt$readBuffer$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1876f = obj;
        this.f1877g |= Integer.MIN_VALUE;
        return UtilsKt.m1985e(null, this);
    }
}

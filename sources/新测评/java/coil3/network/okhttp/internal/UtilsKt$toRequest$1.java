package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.okhttp.internal.UtilsKt", m13596f = "utils.kt", m13597i = {0, 0}, m13598l = {32}, m13599m = "toRequest", m13600n = {"$this$toRequest", "request"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class UtilsKt$toRequest$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3203a;

    /* renamed from: b */
    public Object f3204b;

    /* renamed from: c */
    public Object f3205c;

    /* renamed from: d */
    public Object f3206d;

    /* renamed from: e */
    public /* synthetic */ Object f3207e;

    /* renamed from: f */
    public int f3208f;

    public UtilsKt$toRequest$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3207e = obj;
        this.f3208f |= Integer.MIN_VALUE;
        return UtilsKt.m3174f(null, this);
    }
}

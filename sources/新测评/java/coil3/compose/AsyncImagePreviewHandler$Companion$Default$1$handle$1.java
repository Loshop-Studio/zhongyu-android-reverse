package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", m13596f = "LocalAsyncImagePreviewHandler.kt", m13597i = {0, 0}, m13598l = {38}, m13599m = "handle", m13600n = {"imageLoader", "request"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2865a;

    /* renamed from: b */
    public Object f2866b;

    /* renamed from: c */
    public /* synthetic */ Object f2867c;

    /* renamed from: d */
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 f2868d;

    /* renamed from: e */
    public int f2869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, Continuation continuation) {
        super(continuation);
        this.f2868d = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2867c = obj;
        this.f2869e |= Integer.MIN_VALUE;
        return this.f2868d.mo2929a(null, null, this);
    }
}

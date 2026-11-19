package coil3.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", m7918f = "LocalAsyncImagePreviewHandler.kt", m7919i = {0, 0}, m7920l = {38}, m7921m = "handle", m7922n = {"imageLoader", "request"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1549a;

    /* renamed from: b */
    public Object f1550b;

    /* renamed from: c */
    public /* synthetic */ Object f1551c;

    /* renamed from: d */
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 f1552d;

    /* renamed from: e */
    public int f1553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, Continuation continuation) {
        super(continuation);
        this.f1552d = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1551c = obj;
        this.f1553e |= Integer.MIN_VALUE;
        return this.f1552d.mo1760a(null, null, this);
    }
}

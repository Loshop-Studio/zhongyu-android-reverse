package coil3.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", m13451f = "LocalAsyncImagePreviewHandler.kt", m13452i = {0}, m13453l = {38}, m13454m = "handle", m13455n = {"request"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2798a;

    /* renamed from: b */
    public /* synthetic */ Object f2799b;

    /* renamed from: c */
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 f2800c;

    /* renamed from: d */
    public int f2801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, Continuation continuation) {
        super(continuation);
        this.f2800c = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2799b = obj;
        this.f2801d |= Integer.MIN_VALUE;
        return this.f2800c.mo2657a(null, null, this);
    }
}

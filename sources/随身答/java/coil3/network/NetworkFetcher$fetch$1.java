package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher", m13451f = "NetworkFetcher.kt", m13452i = {0, 0, 1, 2}, m13453l = {LockFreeTaskQueueCore.CLOSED_SHIFT, PatchStatus.CODE_LOAD_COPY_FILE, 102}, m13454m = "fetch", m13455n = {"snapshot", "cacheResponse", "snapshot", "snapshot"}, m13456s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3044a;

    /* renamed from: b */
    public Object f3045b;

    /* renamed from: c */
    public /* synthetic */ Object f3046c;

    /* renamed from: d */
    public final /* synthetic */ NetworkFetcher f3047d;

    /* renamed from: e */
    public int f3048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3047d = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3046c = obj;
        this.f3048e |= Integer.MIN_VALUE;
        return this.f3047d.mo2837a(this);
    }
}

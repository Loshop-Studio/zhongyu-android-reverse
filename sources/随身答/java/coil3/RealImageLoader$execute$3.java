package coil3;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.RealImageLoader", m13451f = "RealImageLoader.kt", m13452i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m13453l = {117, 129, PatchStatus.CODE_LOAD_LIB_JSON}, m13454m = "execute", m13455n = {"requestDelegate", "request", "eventListener", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "requestDelegate", "request", "eventListener"}, m13456s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$3 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2724a;

    /* renamed from: b */
    public Object f2725b;

    /* renamed from: c */
    public Object f2726c;

    /* renamed from: d */
    public Object f2727d;

    /* renamed from: e */
    public /* synthetic */ Object f2728e;

    /* renamed from: f */
    public final /* synthetic */ RealImageLoader f2729f;

    /* renamed from: g */
    public int f2730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, Continuation continuation) {
        super(continuation);
        this.f2729f = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2728e = obj;
        this.f2730g |= Integer.MIN_VALUE;
        return this.f2729f.m2551h(null, 0, this);
    }
}

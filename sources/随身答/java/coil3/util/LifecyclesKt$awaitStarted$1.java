package coil3.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.util.LifecyclesKt", m13451f = "lifecycles.kt", m13452i = {0, 0}, m13453l = {42}, m13454m = "awaitStarted", m13455n = {"$this$awaitStarted", "observer"}, m13456s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3141a;

    /* renamed from: b */
    public Object f3142b;

    /* renamed from: c */
    public /* synthetic */ Object f3143c;

    /* renamed from: d */
    public int f3144d;

    public LifecyclesKt$awaitStarted$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3143c = obj;
        this.f3144d |= Integer.MIN_VALUE;
        return LifecyclesKt.m2915a(null, this);
    }
}

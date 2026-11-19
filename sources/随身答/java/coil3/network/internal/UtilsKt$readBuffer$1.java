package coil3.network.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.network.internal.UtilsKt", m13451f = "utils.kt", m13452i = {0}, m13453l = {31}, m13454m = "readBuffer", m13455n = {"buffer"}, m13456s = {"L$1"})
/* loaded from: classes3.dex */
public final class UtilsKt$readBuffer$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3082a;

    /* renamed from: b */
    public Object f3083b;

    /* renamed from: c */
    public /* synthetic */ Object f3084c;

    /* renamed from: d */
    public int f3085d;

    public UtilsKt$readBuffer$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3084c = obj;
        this.f3085d |= Integer.MIN_VALUE;
        return UtilsKt.m2879e(null, this);
    }
}

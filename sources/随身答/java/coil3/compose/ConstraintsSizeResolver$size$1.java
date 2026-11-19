package coil3.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.compose.ConstraintsSizeResolver", m13451f = "ConstraintsSizeResolver.kt", m13452i = {0}, m13453l = {PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT}, m13454m = "size", m13455n = {"continuation"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver$size$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2805a;

    /* renamed from: b */
    public /* synthetic */ Object f2806b;

    /* renamed from: c */
    public final /* synthetic */ ConstraintsSizeResolver f2807c;

    /* renamed from: d */
    public int f2808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver$size$1(ConstraintsSizeResolver constraintsSizeResolver, Continuation continuation) {
        super(continuation);
        this.f2807c = constraintsSizeResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2806b = obj;
        this.f2808d |= Integer.MIN_VALUE;
        return this.f2807c.mo2661a(this);
    }
}
